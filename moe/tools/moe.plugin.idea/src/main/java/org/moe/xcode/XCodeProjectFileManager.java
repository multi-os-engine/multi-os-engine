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

package org.moe.xcode;

import org.moe.document.pbxproj.*;

import java.io.File;
import java.util.List;

public class XCodeProjectFileManager {
    private final ProjectFile project;

    public enum FileType {
        Resource,
        Sources
    }

    public XCodeProjectFileManager(ProjectFile project) {
        this.project = project;
    }

    public boolean addFileToResources(String filePath) {
        return addFile(filePath, FileType.Resource);
    }

    public boolean addFileToSources(String filePath) {
        return addFile(filePath, FileType.Sources);
    }

    public boolean addFile(String filePath, FileType fileType) {
        if (doesContainFile(filePath)) {
            return false;
        }

        PBXObjectRef<PBXFileReference> frNewFile = project.createReference(new PBXFileReference());
        project.getRoot().getObjects().put(frNewFile);
        frNewFile.getReferenced().setPath(filePath);
        frNewFile.getReferenced().setName(getFileName(filePath));

        PBXGroup desiredGroup = null;

        List<PBXGroup> groups = project.getRoot().getGroups();

        String desiredGroupName;
        Class desiredBuildPhase;

        if (fileType == FileType.Resource) {
            desiredGroupName = "Resources";
            desiredBuildPhase = PBXResourcesBuildPhase.class;
        }
        else if (fileType == FileType.Sources) {
            desiredGroupName = "\"Supporting Files\"";
            desiredBuildPhase = PBXSourcesBuildPhase.class;
        }
        else {
            return false;
        }

        for (PBXGroup group : groups) {
            if (group != null && group.getName() != null && group.getName().equals(desiredGroupName)) {
                desiredGroup = group;
                break;
            }
        }

        if (desiredGroup == null) {
            return false;
        }

        desiredGroup.getOrCreateChildren().add(frNewFile);

        PBXObjectRef<PBXBuildPhase> buildPhase = null;

        List<PBXObjectRef<PBXBuildPhase>> buildPhases = project.getRoot().getBuildPhaseReferences();

        for (PBXObjectRef<PBXBuildPhase> phaseRef : buildPhases) {
            if (phaseRef.getReferenced().getClass() == desiredBuildPhase) {
                buildPhase = phaseRef;
                break;
            }
        }

        if (buildPhase == null) {
            return false;
        }

        buildPhase.getReferenced().addFileReference(project, frNewFile);

        return true;
    }

    public boolean removeFile(String filePath) {
        PBXObjectRef<PBXFileReference> fileRefToDelete = null;

        for (PBXObjectRef<PBXFileReference> objectRef : project.getRoot().getFileReferences()) {
            if (objectRef.getReferenced().getPath().equals(filePath)) {
                fileRefToDelete = objectRef;
                project.getRoot().getObjects().remove(objectRef);
                break;
            }
        }

        if (fileRefToDelete == null) {
            return false;
        }

        for (PBXObjectRef<PBXBuildFile> objectRef : project.getRoot().getBuildFileReferences()) {
            if (objectRef.equals(fileRefToDelete)) {
                project.getRoot().getObjects().remove(objectRef);
            }
        }

        for (PBXGroup group : project.getRoot().getGroups()) {
            group.removeReference(fileRefToDelete);
        }

        List<PBXObjectRef<PBXBuildPhase>> buildPhases = project.getRoot().getBuildPhaseReferences();

        for (PBXObjectRef<PBXBuildPhase> phase : buildPhases) {
            phase.getReferenced().removeReference(fileRefToDelete);
        }

        return true;
    }

    private boolean doesContainFile(String filePath) {
        for (PBXObjectRef<PBXFileReference> objectRef : project.getRoot().getFileReferences()) {

            if (objectRef.getReferenced().getPath().equals(filePath)) {
                return true;
            }
        }
        return false;
    }

    private String getFileName(String filePath) {
        File file = new File(filePath);

        return file.getName();
    }
}
