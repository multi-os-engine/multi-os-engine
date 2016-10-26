/*
Copyright 2014-2016 Intel Corporation

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.moe.tools.natjgen.utils;

import org.apache.commons.io.FileUtils;
import org.moe.tools.natjgen.binding.IMonitor;
import org.moe.common.utils.ProjectUtil;
import org.moe.document.pbxproj.*;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.xib.XIB;
import org.moe.document.xib.XIBParser;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NatjGenUtil {

    public static boolean isNatjFile(File file) {
        return file != null && file.exists() && file.getName().endsWith(".natjgen");
    }

    public static boolean isHeaderFile(File file) {
        return file != null && file.exists() && file.getName().endsWith(".h");
    }

    public static List<String> getInterfacesByHeader(String content){
        List<String> result = new ArrayList<String>();

        Pattern interfacePattern = Pattern.compile("@interface\\s+\\w+[\\s:]+");
        Matcher interfaceMatcher = interfacePattern.matcher(content);

        while (interfaceMatcher.find()){
            String interfaceName = interfaceMatcher.group().replace("@interface", "").replace(":", "").trim();
            result.add(interfaceName);
        }

        return result;
    }

    public static File saveToTempFile(String body) {
        File natjGenFile;
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            natjGenFile = File.createTempFile("gen", ".natjgen");

            fileWriter = new FileWriter(natjGenFile.getAbsoluteFile());
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(body);
            bufferedWriter.close();
            fileWriter.close();

        }
        catch (IOException e) {
            return null;
        }
        finally {
            try{
                if(bufferedWriter != null){
                    bufferedWriter.close();
                }

                if(fileWriter != null){
                    fileWriter.close();
                }
            }
            catch (IOException e){

            }
        }
        return natjGenFile;
    }

    public static List<File> getBindingList(File projectFile, IMonitor monitor) {
        String xcodePath = ProjectUtil.retrieveXcodeProjectPathFromGradle(projectFile);
        File xcodeProject = new File(xcodePath);
        if (xcodeProject == null || !xcodeProject.exists()) {
            return null;
        }

        List<File> xibs = getStoryboardFiles(projectFile, xcodeProject);

        // Collect referenced files
        monitor.setText("Preparing... (Collecting Referenced Classes)");
        HashSet<String> referencedClasses = new HashSet<String>();

        for (File xib : xibs) {
            XIB parsedXIB;
            if (xib.exists()) {
                try {
                    parsedXIB = XIBParser.parse(xib);
                    referencedClasses.addAll(parsedXIB.getCustomClasses());
                } catch (Exception e) {
                    //LOG.error("Failed to generate xib in project: " + xib);
                }
            }
        }

        if (monitor.isCanceled()) {
            return null;
        }

        List<File> bindingList = new ArrayList<File>();
        for (String referencedClass : referencedClasses) {
            File sourceFile = getFilesByProject(projectFile, xcodeProject, referencedClass);

            if (sourceFile != null && sourceFile.exists()) {
                bindingList.add(sourceFile);
            }
        }
        return bindingList;
    }

    private static List<File> getStoryboardFiles(File projectFile, File xcodeProjectFile) {
        List<File> result = new ArrayList<File>();
        try {
            ProjectFile xcodeProject = new ProjectFile(xcodeProjectFile);

            ArrayList<Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject>> fields = xcodeProject.getRoot().getObjects().rawData();
            for (Dictionary.Field<PBXObjectRef<? extends PBXObject>, PBXObject> field : fields) {
                if (field.getValue() instanceof PBXFileReference){
                    PBXFileReference pbxFileRef = (PBXFileReference)field.getValue();
                    String filePath = pbxFileRef.getPath();

                    if (filePath.endsWith(".xib") || filePath.endsWith(".storyboard")) {

                        File headerFile = null;

                        if (filePath.startsWith("..")) {
                            filePath = getFixedFilePath(xcodeProjectFile, filePath);
                        }

                        File checkFile = new File(filePath);
                        if (checkFile != null && checkFile.exists()) {
                            headerFile = checkFile;
                        } else {
                            String groupPath = getGroupPathForReference(xcodeProject, field.getKey().value);
                            String fileSearchPath = groupPath.isEmpty() ? filePath : groupPath;
                            String fixedPath = fileSearchPath;
                            if (fixedPath.startsWith("..")) {
                                fixedPath = getFixedFilePath(xcodeProjectFile, fixedPath);
                            }

                            checkFile = new File(fixedPath);
                            if (checkFile != null && checkFile.exists()) {
                                headerFile = checkFile;
                            } else {
                                headerFile = findFile(projectFile, fileSearchPath);
                            }
                        }
                        if (headerFile != null && headerFile.exists()) {
                            result.add(headerFile);
                        }
                    }
                }
            }
        }
        catch (Exception e){
        }
        return result;
    }

    private static String getGroupPathForReference(ProjectFile project, String reference){
        List<PBXGroup> groups = getGroups(project.getRoot());
        String path = null;
        for (PBXGroup group : groups) {
            for (PBXObjectRef<? extends PBXObject> groupChild : group.getChildrenOrNull()){
                if (groupChild.value.equals(reference)) {
                    path = groupChild.getReferenced().get("path").toString();
                }
                if (path != null && !path.isEmpty()) {
                    return path;
                }
            }
        }
        return "";
    }

    public static List<PBXGroup> getGroups(Root root) {
        ArrayList<PBXGroup> result = new ArrayList<PBXGroup>();
        Iterator it = root.getObjects().rawData().iterator();

        while(it.hasNext()) {
            Dictionary.Field field = (Dictionary.Field)it.next();
            if(field.getValue() instanceof PBXGroup) {
                result.add((PBXGroup)field.getValue());
            }
        }

        return result;
    }

    public static List<PBXObjectRef<PBXFileReference>> getFileReferences(Root root) {
        ArrayList result = new ArrayList();
        Iterator var2 = root.getObjects().rawData().iterator();

        while(var2.hasNext()) {
            Dictionary.Field field = (Dictionary.Field)var2.next();
            if(field.getValue() instanceof PBXFileReference) {
                result.add((PBXObjectRef)field.getKey());
            }
        }

        return result;
    }

    private static File getFilesByProject(File projectFile, File xcodeProjectFile, String interfaceName){
        try {
            ProjectFile xcodeProject = new ProjectFile(xcodeProjectFile);

            List<PBXObjectRef<PBXFileReference>> fileRef = getFileReferences(xcodeProject.getRoot());
            for (PBXObjectRef<PBXFileReference> pbxFileRef : fileRef) {
                String filePath = pbxFileRef.getReferenced().getPath();

                File headerFile = null;

                if (filePath.startsWith("..")) {
                    filePath = getFixedFilePath(xcodeProjectFile, filePath);
                }

                File checkFile = new File(filePath);
                if (checkFile != null && checkFile.exists()) {
                    headerFile = checkFile;
                } else {
                    String groupPath = getGroupPathForReference(xcodeProject, pbxFileRef.value);

                    groupPath = (groupPath == null) ? "" : groupPath.replace("\"", "").trim();
                    String fileSearchPath = groupPath.isEmpty() ? filePath : groupPath;
                    String fixedPath = fileSearchPath;
                    if (fixedPath.startsWith("..")) {
                        fixedPath = getFixedFilePath(xcodeProjectFile, fixedPath);
                    }

                    checkFile = new File(fixedPath);
                    if (checkFile != null && checkFile.exists()) {
                        headerFile = checkFile;
                    } else {
                        headerFile = findFile(projectFile, fileSearchPath);
                    }
                }

                if(headerFile != null && headerFile.exists()){
                    String source = FileUtils.readFileToString(headerFile, "UTF-8");
                    String interfaceTemplate = String.format("@interface\\s+%1$s", interfaceName);

                    Pattern interfacePattern = Pattern.compile(interfaceTemplate);

                    Matcher interfaceMatcher = interfacePattern.matcher(source);

                    if(interfaceMatcher.find()){
                        return headerFile;
                    }
                }
            }
        } catch (Exception e) {
        }

        return null;
    }

    private static File findFile(File projectFile, String sourceSuffix) {
        if (sourceSuffix == null || sourceSuffix.isEmpty()) {
            return null;
        }
        while (sourceSuffix.startsWith("..")) {
            sourceSuffix = sourceSuffix.substring(sourceSuffix.indexOf(File.separator) + 1, sourceSuffix.length());
        }
        for (File file : projectFile.listFiles()) {
            if (file.isDirectory()) {
                File result = findFile(file, sourceSuffix);
                if (result != null) {
                    return result;
                }
            } else {
                if (file.getPath().endsWith(sourceSuffix)) {
                    return file;
                }
            }
        }
        return null;
    }

    private static String getFixedFilePath(File xcodeFile, String sourceSuffix) {
        if (sourceSuffix == null || sourceSuffix.isEmpty()) {
            return null;
        }
        int count = 0;
        while (sourceSuffix.startsWith("..")) {
            sourceSuffix = sourceSuffix.substring(sourceSuffix.indexOf(File.separator) + 1, sourceSuffix.length());
            count++;
        }
        String filePath = xcodeFile.getPath();
        for (int i=0; i<=count; i++) {
            filePath = filePath.substring(0, filePath.lastIndexOf(File.separator));
        }
        return filePath + File.separator + sourceSuffix;
    }
}
