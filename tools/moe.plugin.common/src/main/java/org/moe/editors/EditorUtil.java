/*
Copyright (C) 2016 Migeran

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

package org.moe.editors;

import com.dd.plist.NSString;
import org.moe.document.pbxproj.PBXBuildFile;
import org.moe.document.pbxproj.PBXBuildPhase;
import org.moe.document.pbxproj.PBXFileReference;
import org.moe.document.pbxproj.PBXFrameworksBuildPhase;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.generator.project.util.FileTypeUtil;

import java.io.File;
import java.util.Map;

public class EditorUtil {

    public static String getKey(Map<String, String> map, String value) {
        for (String key : map.keySet()) {
            String v = map.get(key);
            if (v.equals(value)) {
                return key;
            }
        }
        return null;
    }

    public static String getNSStringKey(Map<String, NSString> map, NSString value) {
        for (String key : map.keySet()) {
            String v = map.get(key).getContent();
            if (v.equals(value.getContent())) {
                return key;
            }
        }
        return "";
    }

    public static String getXcodeProjectName(File file) {
        // Fix path if xcodeproj is the input
        int idx = file.getName().lastIndexOf('.');
        if (idx >= 0 && file.getName().substring(idx + 1).equals("xcodeproj")) {
            file = new File(file, "project.pbxproj");
        }

        // Get project name
        File parent = file.getParentFile();
        if (parent != null) {
            String name = parent.getName();
            if (name.endsWith(".xcodeproj")) {
                return name.substring(0, name.length() - ".xcodeproj".length());
            } else {
                return null;
            }
        } else {
            return null;
        }
    }

    public static String getInterfaceNameWithoutExtension(String fullName) {
        return fullName.substring(0, fullName.indexOf("."));
    }

    public static PBXObjectRef<PBXFileReference> createFileReference(ProjectFile file, String name, String filePath,
            String sourceTree) {
        final PBXFileReference fileReference = new PBXFileReference();
        fileReference.setLastKnownFileType(FileTypeUtil.getFileType(filePath));
        fileReference.setPath(filePath);
        if (name != null) {
            fileReference.setName(name);
        }
        if (sourceTree != null) {
            fileReference.setSourceTree(sourceTree);
        }
        final PBXObjectRef<PBXFileReference> reference = file.createReference(fileReference);
        file.getRoot().getObjects().put(reference);
        return reference;
    }

    public static PBXObjectRef<PBXBuildFile> createBuildFile(ProjectFile file, PBXObjectRef<PBXFileReference> fileReference) {
        final PBXBuildFile buildFile = new PBXBuildFile();
        buildFile.setFileRef(fileReference);
        final PBXObjectRef<PBXBuildFile> reference = file.createReference(buildFile);
        file.getRoot().getObjects().put(reference);
        return reference;
    }

    public static PBXFrameworksBuildPhase getOrCreateFrameworksBuildPhase(ProjectFile file, PBXNativeTarget target) {
        for (PBXObjectRef<PBXBuildPhase> ref : target.getOrCreateBuildPhases()) {
            if (!(ref.getReferenced().getClass().equals(PBXFrameworksBuildPhase.class))) {
                continue;
            }
            return (PBXFrameworksBuildPhase)ref.getReferenced();
        }
        final PBXFrameworksBuildPhase phase = new PBXFrameworksBuildPhase();
        phase.setBuildActionMask("2147483647");
        phase.setRunOnlyForDeploymentPostprocessing("0");
        phase.getOrCreateFiles();
        final PBXObjectRef<PBXBuildPhase> reference = file.<PBXBuildPhase>createReference(phase);
        file.getRoot().getObjects().put(reference);
        target.getBuildPhasesOrNull().add(reference);
        return phase;
    }
}
