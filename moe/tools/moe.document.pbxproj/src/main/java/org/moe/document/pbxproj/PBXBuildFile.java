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

import org.moe.document.pbxproj.nextstep.Dictionary;
import org.moe.document.pbxproj.nextstep.NextStep;
import org.moe.document.pbxproj.nextstep.Value;

import java.util.Map;

@SuppressWarnings("unchecked")
public final class PBXBuildFile extends PBXObject {

    public static final String FILE_REF = "fileRef";
    public static final String SETTINGS = "settings";

    public PBXBuildPhase container;

    public PBXBuildFile(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    public PBXBuildFile() {
        super(null);
        setIsa(this.getClass().getSimpleName());
    }

    @Override
    public String getCommentString() {
        PBXObjectRef<? extends PBXObject> fileRef = getFileRef();
        if (fileRef != null) {
            PBXObject referenced = fileRef.getReferenced();
            return referenced.getCommentString() + " in " + (container == null ? "" : container.getCommentString());
        }
        return null;
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
        connectReferencesInValue(FILE_REF, map);
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
        if (ref.equals(getFileRef())) {
            setFileRef(null);
        }
    }

    @Override
    protected boolean isInline() {
        return true;
    }

    /**
     * Fields
     **/

    public PBXObjectRef<? extends PBXObject> getFileRef() {
        return getPBXObjectRefValue(FILE_REF);
    }

    public void setFileRef(PBXObjectRef<? extends PBXObject> value) {
        setPBXObjectRefValue(FILE_REF, value);
    }

    public Dictionary<Value, NextStep> getSettings() {
        return getDictionaryValueOrNull(SETTINGS);
    }

}
