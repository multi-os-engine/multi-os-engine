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

package org.moe.document.pbxproj;

import org.moe.document.pbxproj.nextstep.Array;
import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;

import java.util.Iterator;
import java.util.Map;

@SuppressWarnings("unchecked")
public abstract class PBXBuildPhase extends PBXObject {

    public static final String BUILD_ACTION_MASK_KEY = "buildActionMask";
    public static final String FILES_KEY = "files";
    public static final String RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING_KEY = "runOnlyForDeploymentPostprocessing";

    public PBXBuildPhase(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
        connectReferencesInValueArray(FILES_KEY, map);
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
        Iterator<?> it = getFiles().iterator();
        while (it.hasNext()) {
            if (it.next().equals(ref)) {
                it.remove();
            }
        }
    }

    @Override
    public void update() {
        Array<PBXObjectRef<PBXBuildFile>> values = getFiles();
        if (values != null) {
            int count = values.size();
            for (int i = 0; i < count; ++i) {
                PBXObjectRef<PBXBuildFile> ref = values.get(i);
                ref.getReferenced().container = this;
            }
        }
    }

    /**
     * Fields
     **/

    public String getBuildActionMask() {
        return getStringValue(BUILD_ACTION_MASK_KEY);
    }

    public void setBuildActionMask(String value) {
        setStringValue(BUILD_ACTION_MASK_KEY, value);
    }

    public Array<PBXObjectRef<PBXBuildFile>> getFiles() {
        return (Array<PBXObjectRef<PBXBuildFile>>)getArrayValue(FILES_KEY);
    }

    public String getRunOnlyForDeploymentPostprocessing() {
        return getStringValue(RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING_KEY);
    }

    public void setRunOnlyForDeploymentPostprocessing(String value) {
        setStringValue(RUN_ONLY_FOR_DEPLOYMENT_POSTPROCESSING_KEY, value);
    }

    public PBXBuildPhase addFileReference(ProjFile projectFile, PBXObjectRef<PBXFileReference> fileRef) {

        PBXObjectRef<PBXBuildFile> buildFileRef = projectFile.createReference(new PBXBuildFile());
        projectFile.getRoot().getObjects().add(buildFileRef);
        PBXBuildFile buildFile = buildFileRef.getReferenced();
        buildFile.setFileRef(fileRef);
        this.getFiles().add(buildFileRef);
        return this;
    }
}
