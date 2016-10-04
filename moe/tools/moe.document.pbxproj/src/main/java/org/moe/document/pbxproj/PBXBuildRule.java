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

import java.util.Map;

@SuppressWarnings("unchecked")
public class PBXBuildRule extends PBXObject {

    public static final String COMPILER_SPEC_KEY = "compilerSpec";
    public static final String FILE_PATTERNS_KEY = "filePatterns";
    public static final String FILE_TYPE_KEY = "fileType";
    public static final String IS_EDITABLE_KEY = "isEditable";
    public static final String OUTPUT_FILES_KEY = "outputFiles";
    public static final String SCRIPT_KEY = "script";

    public PBXBuildRule(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    @Override
    public String getCommentString() {
        return "PBXBuildRule";
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
    }

    /**
     * Fields
     **/

    public String getCompilerSpec() {
        return getStringValue(COMPILER_SPEC_KEY);
    }

    public void setCompilerSpec(String value) {
        setStringValue(COMPILER_SPEC_KEY, value);
    }

    public String getFilePatterns() {
        return getStringValue(FILE_PATTERNS_KEY);
    }

    public void setFilePatterns(String value) {
        setStringValue(FILE_PATTERNS_KEY, value);
    }

    public String getFileType() {
        return getStringValue(FILE_TYPE_KEY);
    }

    public void setFileType(String value) {
        setStringValue(FILE_TYPE_KEY, value);
    }

    public String getIsEditable() {
        return getStringValue(IS_EDITABLE_KEY);
    }

    public void setIsEditable(String value) {
        setStringValue(IS_EDITABLE_KEY, value);
    }

    public Array<Value> getOutputFiles() {
        return getArrayValueOrNull(OUTPUT_FILES_KEY);
    }

    public String getScript() {
        return getStringValue(SCRIPT_KEY);
    }

    public void setScript(String value) {
        setStringValue(SCRIPT_KEY, value);
    }

}
