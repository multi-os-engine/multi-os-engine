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

package org.moe.idea.binding;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import com.intellij.psi.*;
import org.moe.common.utils.ProjectUtil;
import org.moe.document.pbxproj.*;
import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;
import org.moe.generator.project.FileManager;
import org.moe.generator.project.FileResult;
import org.moe.generator.project.ProjectHelper;
import org.moe.generator.project.XcodeTarget;
import org.moe.idea.utils.IMonitor;
import org.moe.idea.utils.ModuleUtils;
import org.moe.idea.utils.logger.LoggerFactory;
import org.moe.tools.natjgen.binding.IConsole;
import org.moe.tools.natjgen.binding.MOEBindingGenerator;

import java.io.*;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.moe.generator.project.Generator.SOURCE_TREE_GROUP;

public class MOEBindingGeneratorByJava {

    private static final Logger LOG = LoggerFactory.getLogger(MOEBindingGeneratorByJava.class);

    private PsiManager psiManager;

    public void generate(final Module module, final VirtualFile[] files, String action_title, IConsole console,
                         IMonitor monitor) {
        if (monitor != null) {
            monitor.setText("Generating...");
        }
        final long start_time = System.nanoTime();
        try {
            for (VirtualFile file : files) {
                if ((file != null) && (module != null)) {
                    psiManager = PsiManager.getInstance(module.getProject());
                    PsiJavaFile javaFile = (PsiJavaFile) psiManager.findFile(file);
                    if (javaFile != null) {
                        for (PsiClass psiClass : javaFile.getClasses()) {
                            if (isInstanceOfViewController(psiClass)) {
                                String nativeClassName = getNativeClassName(psiClass);
                                nativeClassName = (nativeClassName == null) ? psiClass.getName() : nativeClassName;

                                if (nativeClassName != null) {
                                    File xcodeProjectFile = new File(
                                            ProjectUtil.retrieveXcodeProjectPathFromGradle(
                                                    new File(ModuleUtils.getModulePath(module))));

                                    if ((xcodeProjectFile == null) || !xcodeProjectFile.exists()) {
                                        return;
                                    }

                                    ProjFile xcodeProject = new ProjFile(xcodeProjectFile);

                                    //TODO do not remove!!! Only in case of files update
                                    File headerFile = getFileWithInterface(xcodeProjectFile, xcodeProject, module,
                                            nativeClassName, ".h");
                                    File sourceFile = getFileWithInterface(xcodeProjectFile, xcodeProject, module,
                                            nativeClassName, ".m");

                                    Map<String, String> actionMap = generateIBActions(psiClass);
                                    Map<String, String> outletMap = generateIBOutlet(psiClass);

                                    String xcodeProjectName = xcodeProjectFile.getName().substring(0,
                                            xcodeProjectFile.getName().lastIndexOf("."));

                                    //generate outlets
                                    StringBuilder outletContent = new StringBuilder();
                                    for (String outlet : outletMap.values()) {
                                        outletContent.append(outlet);
                                        outletContent.append("\n");
                                    }
                                    String outlets = outletContent.toString();

                                    //generate actions
                                    StringBuilder actionContent = new StringBuilder();
                                    for (String action : actionMap.values()) {
                                        actionContent.append(action);
                                        actionContent.append("\n");
                                    }
                                    String actions = actionContent.toString();

                                    //create header file
                                    boolean doesHeaderExist = headerFile != null;
                                    headerFile = generateNewHeader(headerFile, psiClass, xcodeProjectFile,
                                            xcodeProjectName, outlets, actions, nativeClassName);

                                    ProjectHelper projectHelper = new ProjectHelper(xcodeProject,
                                            new FileManager(xcodeProjectFile.getParentFile()));

                                    Array<PBXObjectRef<PBXNativeTarget>> targets = xcodeProject.getRoot()
                                            .getRootObject().getReferenced().getTargets();
                                    List<XcodeTarget> mainTargets = new ArrayList<XcodeTarget>();
                                    for (PBXObjectRef<PBXNativeTarget> target : targets) {
                                        if (!target.getReferenced().getName().endsWith("-Test")) {
                                            mainTargets.add(new XcodeTarget(target, projectHelper));
                                        }
                                    }

                                    //add header to Xcode project
                                    if (!doesHeaderExist) {
                                        for (XcodeTarget target : mainTargets) {
                                            FileResult hFile = target.createFile(headerFile.getName(), null, "",
                                                    SOURCE_TREE_GROUP);
                                            target.getSupportingFilesGroup().getChildren().add(hFile.getFileRef());
                                            hFile.getFileRef().getReferenced().setPath("Generated/"
                                                    + headerFile.getName());
                                        }
                                    }

                                    //create source file
                                    boolean doesSourceExist = sourceFile != null;
                                    sourceFile = generateNewSource(sourceFile, psiClass, xcodeProjectFile,
                                            xcodeProjectName, outlets, actions, nativeClassName);

                                    //add source file to Xcode project
                                    if (!doesSourceExist) {
                                        for (XcodeTarget target : mainTargets) {
                                            FileResult srcFile = target.createFile(sourceFile.getName(), null, "",
                                                    SOURCE_TREE_GROUP);
                                            target.getSupportingFilesGroup().getChildren().add(srcFile.getFileRef());
                                            srcFile.getFileRef().getReferenced().setPath("Generated/"
                                                    + sourceFile.getName());
                                            PBXNativeTarget nativeTarget = target.getTarget();
                                            for (PBXObjectRef<PBXBuildPhase> buildPhase : nativeTarget.getBuildPhases()) {
                                                if (buildPhase.getReferenced() instanceof PBXSourcesBuildPhase) {
                                                    createBuildFile(projectHelper, srcFile.getFileRef(),
                                                            buildPhase.getReferenced());
                                                }
                                            }
                                        }
                                    }
                                    xcodeProject.save();
                                }
                            }
                        }
                    }
                }
                if (monitor != null) {
                    //monitor.addFraction(((double) count / files.length) * monitor.getFractionsSize());
                    monitor.addFraction(((double) monitor.getFractionsSize() / files.length));
                }
            }
            if (console != null) {
                console.write("Generate ended in " + ((double) (System.nanoTime()
                        - start_time) / 1000000000.0) + "s");
            }
        } catch (Exception e) {
            if (console != null) {
                console.write("Unable to generate binding");
                LOG.error("Unable to generate binding", e);
            }
        }
    }

    private boolean isInstanceOfViewController(PsiClass psiClass) {
        boolean result = false;
        if (psiClass != null) {
            if (psiClass.getName().equals("UIViewController")) {
                result = true;
            } else {
                result |= isInstanceOfViewController(psiClass.getSuperClass());
            }
        }
        return result;
    }

    private String getNativeClassName(PsiClass psiClass) {
        PsiAnnotation[] classAnnotations = psiClass.getModifierList().getAnnotations();
        for (PsiAnnotation annotation : classAnnotations) {
            if (annotation.getQualifiedName().endsWith("ObjCClassName")) {
                PsiElement[] params = annotation.getParameterList().getChildren();
                for (PsiElement param : params) {
                    if (param instanceof PsiNameValuePair) {
                        return param.getText().replace("\"", "");
                    }
                }
            }
        }
        return null;
    }

    private File getFileWithInterface(File xcodeProjectFile, ProjFile project, Module module, String interfaceName,
                                      String extension) {
        ArrayList<Dictionary.Field<Value, NextStep>> fields = project.getRoot().rawData();
        for (Dictionary.Field pbxFile : fields) {
            if (pbxFile.value instanceof PBXFileReference) {
                PBXFileReference pbxFileRef = (PBXFileReference)pbxFile.value;
                String filePath = pbxFileRef.getPath();
                if (filePath.endsWith(extension)) {
                    String xCodeProjectName = ProjectUtil.retrieveXcodeProjectPathFromGradle(
                            new File(ModuleUtils.getModulePath(module)));

                    if (filePath.startsWith(xCodeProjectName)) {
                        filePath = filePath.replace(xCodeProjectName + "/", "");
                    }
                    File headerFile = new File(xcodeProjectFile.getParentFile(),
                            xCodeProjectName + File.separator + filePath);

                    VirtualFile sourceVFile = VfsUtil.findFileByIoFile(headerFile, true);
                    if (sourceVFile != null) {
                        PsiFile xcodeFile = psiManager.findFile(sourceVFile);
                        if (xcodeFile != null) {
                            String source = xcodeFile.getText();
                            String implTemplate = String.format("@implementation[\\s\\t]+%1$s", interfaceName);
                            String interfaceTemplate = String.format("@interface\\s+%1$s", interfaceName);

                            Pattern implPattern = Pattern.compile(implTemplate);
                            Pattern interfacePattern = Pattern.compile(interfaceTemplate);

                            Matcher implMatcher = implPattern.matcher(source);
                            Matcher interfaceMatcher = interfacePattern.matcher(source);

                            if (implMatcher.find() || interfaceMatcher.find()) {
                                return headerFile;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    private Map<String, String> generateIBActions(PsiClass psiClass) {
        List<PsiMethod> ibActions = new ArrayList<PsiMethod>();

        //find all methods with annotation @IBAction
        PsiMethod[] methods = psiClass.getMethods();
        for (PsiMethod method : methods) {
            PsiAnnotation[] annotations = method.getModifierList().getAnnotations();
            for (PsiAnnotation annotation : annotations) {
                if (annotation.getQualifiedName().endsWith("IBAction")) {
                    ibActions.add(method);
                    break;
                }
            }
        }

        //generate objective-c ibaction
        Map<String, String> buffer = new HashMap<String, String>();
        for (PsiMethod action : ibActions) {
            //get method definition
            String skeletonAnnotation = null;
            PsiAnnotation[] annotations = action.getModifierList().getAnnotations();
            for (PsiAnnotation annotation : annotations) {
                if (annotation.getQualifiedName().endsWith("Selector")) {
                    PsiElement[] params = annotation.getParameterList().getChildren();
                    for (PsiElement parameter : params) {
                        if (parameter instanceof PsiNameValuePair) {
                            skeletonAnnotation = parameter.getText().replace("\"", "");
                        }
                    }

                }
            }
            if (skeletonAnnotation != null) {
                String[] methodParams = skeletonAnnotation.split(":");
                PsiParameter[] actionParams = action.getParameterList().getParameters();

                if (methodParams.length == actionParams.length) {
                    StringBuilder nativeParams = new StringBuilder();
                    StringBuilder nativeKey = new StringBuilder();
                    for (int i = 0; i < actionParams.length; ++i) {
                        PsiParameter actionParam = actionParams[i];
                        PsiType type = actionParam.getType();
                        if (type instanceof PsiPrimitiveType) {
                            nativeParams.append(String.format(" %s:(%s)%s", methodParams[i], type.getPresentableText(),
                                    actionParams[i].getName()));
                            nativeKey.append(String.format(" %s:(%s)", methodParams[i], type.getPresentableText()));
                        } else {
                            nativeParams.append(String.format(" %s:(%s*)%s", methodParams[i], type.getPresentableText(),
                                    actionParams[i].getName()));
                            nativeKey.append(String.format(" %s:(%s*)", methodParams[i], type.getPresentableText()));
                        }
                    }
                    String nativeIBAction = MOEBindingGenerator.IBACTION_TEMPLATE.replace(
                            MOEBindingGenerator.METHOD_DEFINITION, nativeParams.toString().trim());
                    buffer.put(nativeKey.toString().trim(), nativeIBAction);
                }
            }
        }
        return buffer;
    }

    private Map<String, String> generateIBOutlet(PsiClass psiClass) {
        List<PsiMethod> ibOutlet = new ArrayList<PsiMethod>();

        //find all methods with annotation @IBAction
        PsiMethod[] methods = psiClass.getMethods();
        for (PsiMethod method : methods) {
            PsiAnnotation[] annotations = method.getModifierList().getAnnotations();
            for (PsiAnnotation annotation : annotations) {
                if (annotation.getQualifiedName().endsWith("Property")) {
                    ibOutlet.add(method);
                    break;
                }
            }
        }

        //generate objective-c ibaction
        Map<String, String> buffer = new HashMap<String, String>();
        for (PsiMethod outlet : ibOutlet) {
            //get method definition
            String skeletonAnnotation = null;
            PsiAnnotation[] annotations = outlet.getModifierList().getAnnotations();
            for (PsiAnnotation annotation : annotations) {
                if (annotation.getQualifiedName().endsWith("Selector")) {
                    PsiElement[] params = annotation.getParameterList().getChildren();
                    for (PsiElement parameter : params) {
                        if (parameter instanceof PsiNameValuePair) {
                            skeletonAnnotation = parameter.getText().replace("\"", "");
                        }
                    }

                }
            }
            if (skeletonAnnotation != null) {
                PsiType returnType = outlet.getReturnType();
                if (!(returnType instanceof PsiPrimitiveType)) {
                    String nativeIBAction = MOEBindingGenerator.IBOUTLET_TEMPLATE.replace(
                            MOEBindingGenerator.ELEMENT_TYPE, returnType.getPresentableText());
                    nativeIBAction = nativeIBAction.replace(MOEBindingGenerator.OUTLET_NAME, skeletonAnnotation);

                    buffer.put(skeletonAnnotation, nativeIBAction);
                }
            }
        }
        return buffer;
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    //Generate new files
    /////////////////////////////////////////////////////////////////////////////////////////////
    private File generateNewHeader(File existedFile,PsiClass javaClass, File xCodeProject_file, String projectName,
                                   String outlets, String actions, String interfaceName) {
        return generateFile(existedFile, javaClass, xCodeProject_file, projectName, outlets, actions, interfaceName,
                "/template/bindings/template.h", ".h");
    }

    private File generateNewSource(File existedFile, PsiClass javaClass, File xCodeProject_file, String projectName,
                                   String outlets, String actions, String interfaceName) {
        actions = actions.replace(";", "{ \n }");
        return generateFile(existedFile, javaClass, xCodeProject_file, projectName, outlets, actions, interfaceName,
                "/template/bindings/template.m", ".m");
    }

    /////////////////////////////////////////////////////////////////////////////////////////////
    //Update existing
    /////////////////////////////////////////////////////////////////////////////////////////////
    private void updateExistingHeader(File headerFile, Map<String, String> outlets, Map<String, String> actions,
                                      String interfaceName) throws IOException {
        InputStreamReader isr = null;
        BufferedReader reader = null;
        FileInputStream fos = null;
        try{
            fos = new FileInputStream(headerFile);
            isr = new InputStreamReader(fos, Charset.forName("UTF-8"));
            reader = new BufferedReader(isr);

            StringBuilder headerContent = new StringBuilder();

            List<String> ibOutlets = new ArrayList<String>();
            Pattern outletPattern = Pattern.compile("@property.*IBOutlet");

            List<String> ibActions = new ArrayList<String>();
            Pattern actionPattern = Pattern.compile("\\(\\s*IBAction\\s*\\)");

            String interfaceTemplate = String.format("@interface\\s+%1$s", interfaceName);
            Pattern startInterfacePattern = Pattern.compile(interfaceTemplate);
            Pattern endInterfacePattern = Pattern.compile("@\\s*end");

            String line;
            boolean isInterfaceStarted = false;
            boolean isInterfaceEnded = false;
            while ((line = reader.readLine()) != null) {
                headerContent.append(line);
                headerContent.append("\n");

                Matcher startInterfaceMatcher = startInterfacePattern.matcher(line);
                if (!isInterfaceStarted) {
                    isInterfaceStarted = startInterfaceMatcher.find();
                }

                Matcher endInterfaceMatcher = endInterfacePattern.matcher(line);
                if (isInterfaceStarted && !isInterfaceEnded) {
                    isInterfaceEnded = endInterfaceMatcher.find();
                }

                if (isInterfaceStarted && !isInterfaceEnded) {
                    //process outlets
                    Matcher outletMatcher = outletPattern.matcher(line);
                    while (outletMatcher.find()) {
                        int outEndIdx = outletMatcher.end();

                        String outName = line.substring(outEndIdx);
                        int intPtr = outName.indexOf("*");
                        int end = outName.indexOf(";");
                        String outletName = end > -1 ? outName.substring(intPtr + 1, end) : outName.substring(intPtr + 1);
                        ibOutlets.add(outletName.trim());
                    }

                    //process actions
                    Matcher actionMatcher = actionPattern.matcher(line);
                    while (actionMatcher.find()) {
                        int endOutPattern = actionMatcher.end();

                        int endIdx = line.indexOf(";");
                        String declaration = endIdx > -1 ? line.substring(endOutPattern, endIdx) :
                                line.substring(endOutPattern);

                        Pattern declarePattern = Pattern.compile("\\w+\\s*:\\s*\\(\\s*\\w+\\s*\\**\\s*\\)");
                        Matcher declareMatcher = declarePattern.matcher(declaration);

                        StringBuilder declareContent = new StringBuilder();
                        while (declareMatcher.find()) {
                            declareContent.append(declareMatcher.group().replace(" ", ""));
                            declareContent.append(" ");
                        }
                        ibActions.add(declareContent.toString().trim());
                    }
                }

            }
            reader.close();

            //remove all duplicated outlets & actions
            outlets.keySet().removeAll(ibOutlets);
            actions.keySet().removeAll(ibActions);


            //generate new outlets
            StringBuilder insOutlet = new StringBuilder();
            for (String outlet : outlets.values()) {
                insOutlet.append(outlet);
                insOutlet.append("\n");
            }

            StringBuilder insActions = new StringBuilder();
            for (String action : actions.values()) {
                insActions.append(action);
                insActions.append("\n");
            }

            if (!insOutlet.toString().isEmpty() || !insActions.toString().isEmpty()) {
                String fileContent = headerContent.toString();

                Matcher startInterfaceMatcher = startInterfacePattern.matcher(fileContent);
                if (startInterfaceMatcher.find()) {

                    String startFile = fileContent.substring(0, startInterfaceMatcher.end());


                    String tail = fileContent.substring(startInterfaceMatcher.end());


                    Matcher endInterfaceMatcher = endInterfacePattern.matcher(tail);

                    if (endInterfaceMatcher.find()) {
                        OutputStreamWriter owr = null;
                        BufferedWriter bw = null;
                        FileOutputStream sourceFos = null;
                        try{
                            sourceFos = new FileOutputStream(headerFile);
                            owr = new OutputStreamWriter(sourceFos, Charset.forName("UTF-8"));
                            bw = new BufferedWriter(owr);

                            String tailBeforeIns = tail.substring(0, endInterfaceMatcher.start());

                            String ibInsActions = insActions.toString();
                            String insertion = "\n" + insOutlet.toString() + "\n" + ibInsActions + "\n";

                            String tailAfterIns = tail.substring(endInterfaceMatcher.start());

                            fileContent = startFile + tailBeforeIns + insertion + tailAfterIns;

                            bw.write(fileContent);
                            bw.close();
                        } finally {
                            if (bw != null) {
                                try {
                                    bw.close();
                                } catch (Exception e) {
                                    LOG.error("Unable to close stream", e);
                                }
                            }
                            if (owr != null) {
                                try {
                                    owr.close();
                                } catch (Exception e) {
                                    LOG.error("Unable to close stream", e);
                                }
                            }
                            if (sourceFos != null) {
                                try {
                                    sourceFos.close();
                                } catch (Exception e) {
                                    LOG.error("Unable to close stream", e);
                                }
                            }
                        }
                    }
                }
            }
        } finally {
            if (isr != null) {
                try {
                isr.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
        }
    }

    private void updateExistingSource(File sourceFile, Map<String, String> outlets, Map<String, String> actions,
                                      String interfaceName) throws IOException {
        InputStreamReader isr = null;
        BufferedReader reader = null;
        FileInputStream fos = null;
        try{
            fos = new FileInputStream(sourceFile);
            isr = new InputStreamReader(fos, Charset.forName("UTF-8"));
            reader = new BufferedReader(isr);

            StringBuilder headerContent = new StringBuilder();

            List<String> ibOutlets = new ArrayList<String>();
            Pattern outletPattern = Pattern.compile("@property.*IBOutlet");

            List<String> ibActions = new ArrayList<String>();
            Pattern actionPattern = Pattern.compile("\\(\\s*IBAction\\s*\\)");

            String interfaceTemplate = String.format("@interface\\s+%1$s", interfaceName);
            Pattern startInterfacePattern = Pattern.compile(interfaceTemplate);

            String implTemplate = String.format("@implementation\\s+%1$s", interfaceName);
            Pattern startImplPattern = Pattern.compile(implTemplate);

            Pattern endInterfacePattern = Pattern.compile("@\\s*end");

            String line;
            boolean isInterfaceStarted = false;
            boolean isInterfaceEnded = false;

            boolean isImpleStarted = false;
            boolean isImpleEnded = false;

            while ((line = reader.readLine()) != null) {
                headerContent.append(line);
                headerContent.append("\n");

                Matcher startInterfaceMatcher = startInterfacePattern.matcher(line);
                if (!isInterfaceStarted) {
                    isInterfaceStarted = startInterfaceMatcher.find();
                }

                Matcher endInterfaceMatcher = endInterfacePattern.matcher(line);
                if (isInterfaceStarted && !isInterfaceEnded) {
                    isInterfaceEnded = endInterfaceMatcher.find();
                }

                if (isInterfaceStarted && !isInterfaceEnded) {
                    //process outlets
                    Matcher outletMatcher = outletPattern.matcher(line);
                    while (outletMatcher.find()) {
                        int outEndIdx = outletMatcher.end();

                        String outName = line.substring(outEndIdx);
                        int intPointer = outName.indexOf("*");
                        int end = outName.indexOf(";");
                        String outletName = end > -1 ? outName.substring(intPointer + 1, end) :
                                outName.substring(intPointer + 1);
                        ibOutlets.add(outletName.trim());
                    }
                }

                Matcher startImplMatcher = startImplPattern.matcher(line);
                if (!isImpleStarted) {
                    isImpleStarted = startImplMatcher.find();
                }

                if (isImpleStarted && !isImpleEnded) {
                    isImpleEnded = endInterfaceMatcher.find();
                }

                if (isImpleStarted && !isImpleEnded) {
                    //process actions
                    Matcher actionMatcher = actionPattern.matcher(line);
                    while (actionMatcher.find()) {
                        int endOutPattern = actionMatcher.end();

                        int endIdx = line.indexOf("{");
                        String declaration = endIdx > -1 ? line.substring(endOutPattern, endIdx) :
                                line.substring(endOutPattern);

                        Pattern declarePattern = Pattern.compile("\\w+\\s*:\\s*\\(\\s*\\w+\\s*\\**\\s*\\)");
                        Matcher declareMatcher = declarePattern.matcher(declaration);

                        StringBuilder declareContent = new StringBuilder();
                        while (declareMatcher.find()) {
                            declareContent.append(declareMatcher.group().replace(" ", "")).append(" ");
                        }
                        ibActions.add(declareContent.toString().trim());
                    }
                }
            }
            reader.close();

            //remove all duplicated outlets & actions
            if (outlets != null) {
                outlets.keySet().removeAll(ibOutlets);
            }
            actions.keySet().removeAll(ibActions);


            //generate new outlets
            StringBuilder insOutlet = new StringBuilder();
            if (outlets != null) {
                for (String outlet : outlets.values()) {
                    insOutlet.append(outlet).append("\n");
                }
            }

            StringBuilder insActions = new StringBuilder();
            for (String action : actions.values()) {
                insActions.append(action).append("\n");
            }

            if ((!insOutlet.toString().isEmpty()) || !insActions.toString().isEmpty()) {
                String fileContent = headerContent.toString();

                if (outlets == null) {

                    Matcher startImplMatcher = startImplPattern.matcher(fileContent);
                    if (startImplMatcher.find()) {

                        String beforeImplement = fileContent.substring(0, startImplMatcher.start());

                        String tail = fileContent.substring(startImplMatcher.start());

                        Matcher endInterfaceMatcher = endInterfacePattern.matcher(tail);
                        if (endInterfaceMatcher.find()) {

                            String tailBeforeIns = tail.substring(0, endInterfaceMatcher.start());

                            String ibInsActions = insActions.toString();
                            ibInsActions = ibInsActions.replace(";", "{\n}");
                            String insertion = "\n" + ibInsActions + "\n";

                            String tailAfterIns = tail.substring(endInterfaceMatcher.start());

                            OutputStreamWriter owr = new OutputStreamWriter(new FileOutputStream(sourceFile),
                                    Charset.forName("UTF-8"));
                            BufferedWriter bw = new BufferedWriter(owr);

                            fileContent = beforeImplement + tailBeforeIns + insertion + tailAfterIns;
                            try {
                                bw.write(fileContent);
                            } finally {
                                try {
                                    bw.close();
                                } catch (Exception e) {
                                    LOG.error("Unable to close stream", e);
                                }
                            }
                        }
                    }

                } else {
                    Matcher startInterfaceMatcher = startInterfacePattern.matcher(fileContent);
                    if (startInterfaceMatcher.find()) {
                        String beforeInterface = fileContent.substring(0, startInterfaceMatcher.end());

                        String tail = fileContent.substring(startInterfaceMatcher.end());
                        Matcher endInterfaceMatcher = endInterfacePattern.matcher(tail);
                        if (endInterfaceMatcher.find()) {
                            String tailBeforeIns = tail.substring(0, endInterfaceMatcher.start());
                            String insertion = "\n" + insOutlet.toString() + "\n" + insActions.toString() + "\n";

                            String tailAfterIns = tail.substring(endInterfaceMatcher.start());

                            fileContent = beforeInterface + tailBeforeIns + insertion + tailAfterIns;

                        }

                    }
                    Matcher startImplMatcher = startImplPattern.matcher(fileContent);
                    if (startImplMatcher.find()) {
                        String beforeImpl = fileContent.substring(0, startImplMatcher.end());

                        String tail = fileContent.substring(startImplMatcher.end());
                        Matcher endInterfaceMatcher = endInterfacePattern.matcher(tail);
                        if (endInterfaceMatcher.find()) {
                            String tailBeforeIns = tail.substring(0, endInterfaceMatcher.start());

                            String ibInsActions = insActions.toString();
                            ibInsActions = ibInsActions.replace(";", "{\n}");
                            String insertion = "\n" + ibInsActions + "\n";

                            String tailAfterIns = tail.substring(endInterfaceMatcher.start());

                            fileContent = beforeImpl + tailBeforeIns + insertion + tailAfterIns;
                        }
                    }

                    FileOutputStream sourceFos = null;
                    OutputStreamWriter owr = null;
                    BufferedWriter bw = null;
                    try{
                        sourceFos = new FileOutputStream(sourceFile);
                        owr = new OutputStreamWriter(sourceFos, Charset.forName("UTF-8"));
                        bw = new BufferedWriter(owr);
                        bw.write(fileContent);
                    } finally {
                        if (bw != null) {
                            try {
                                bw.close();
                            } catch (Exception e) {
                                LOG.error("Unable to close stream", e);
                            }
                        }
                        if (owr != null) {
                            try {
                                owr.close();
                            } catch (Exception e) {
                                LOG.error("Unable to close stream", e);
                            }
                        }
                        if (sourceFos != null) {
                            try {
                                sourceFos.close();
                            } catch (Exception e) {
                                LOG.error("Unable to close stream", e);
                            }
                        }
                    }
                }
            }
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////
    //Helpers
    /////////////////////////////////////////////////////////////////////////////////////////////
    private File createFile(File existedFile, String path, String fileName, String content) throws IOException {
        File nativeFile = null;
        FileWriter fw = null;
        BufferedWriter bw = null;
        try{
            if (existedFile != null) {
                nativeFile = existedFile;
            } else {
                File directory = new File(path);
                if (!directory.exists()) {
                    directory.mkdirs();
                }

                nativeFile = new File(path + File.separator + fileName);
                if (!nativeFile.exists()) {
                    nativeFile.createNewFile();
                }
            }

            fw = new FileWriter(nativeFile);
            bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            return nativeFile;
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
            if (bw != null) {
                try {
                    bw.close();
                } catch (Exception e) {
                    LOG.error("Unable to close stream", e);
                }
            }
        }
    }

    private File generateFile(File existedFile, PsiClass javaClass, File xCodeProject_file, String projectName,
                              String outlets, String actions, String interfaceName, String template, String extension) {
        BufferedReader reader = null;
        File result = null;
        try {
            InputStream headerStream = MOEBindingGeneratorByJava.class.getResourceAsStream(template);
            reader = new BufferedReader(new InputStreamReader(headerStream));

            String line;
            StringBuilder contentHeader = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                contentHeader.append(line).append("\n");
            }

            //generate header content
            String headerFileContent = contentHeader.toString();
            headerFileContent = headerFileContent.replace(MOEBindingGenerator.INTERFACE_NAME, interfaceName);
            headerFileContent = headerFileContent.replace(MOEBindingGenerator.PROJECT_NAME, projectName);
            headerFileContent = headerFileContent.replace(MOEBindingGenerator.OUTLET_DEFINITION, outlets);
            headerFileContent = headerFileContent.replace(MOEBindingGenerator.ACTION_DEFINITION, actions);
            headerFileContent = headerFileContent.replace(MOEBindingGenerator.SUPER_CLASS,
                    javaClass.getSuperClass().getName());

            String path = xCodeProject_file.getParentFile().getPath() + File.separator + xCodeProject_file.getName()
                    .substring(0, xCodeProject_file.getName().lastIndexOf(".")) + File.separator + "Generated";
            String fileName = interfaceName + extension;
            result = createFile(existedFile, path, fileName, headerFileContent);
        } catch (Exception e) {
            LOG.error("Unable to generate file", e);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    LOG.error("Unable to close stream", e);
                }
            }
        }
        return result;
    }

    /**
     * Creates a new build file and adds it to the specified build phase.
     *
     * @param projectHelper       project helper
     * @param fileRef       file to add
     * @param srcBuildPhase phase to add to
     * @return reference to the build file
     */
    private PBXObjectRef<PBXBuildFile> createBuildFile(ProjectHelper projectHelper,
                                                       PBXObjectRef<PBXFileReference> fileRef,
                                                       PBXBuildPhase srcBuildPhase) {
        PBXObjectRef<PBXBuildFile> buildFileRef = projectHelper.addAndReturn(new PBXBuildFile());
        PBXBuildFile buildFile = buildFileRef.getReferenced();
        buildFile.setFileRef(fileRef);
        srcBuildPhase.getFiles().add(buildFileRef);
        return buildFileRef;
    }
}
