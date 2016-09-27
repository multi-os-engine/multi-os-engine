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

import java.io.File;
import java.util.Map;

public final class PBXFileReference extends PBXObject {

    public static final String EXPLICIT_FILE_TYPE_KEY = "explicitFileType";
    public static final String LAST_KNOWN_FILE_TYPE_KEY = "lastKnownFileType";
    public static final String INCLUDE_IN_INDEX_KEY = "includeInIndex";
    public static final String NAME_KEY = "name";
    public static final String PATH_KEY = "path";
    public static final String SOURCE_TREE_KEY = "sourceTree";

    public PBXFileReference(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    public PBXFileReference() {
        super(null);
        setIsa(this.getClass().getSimpleName());
    }

    @Override
    public String getCommentString() {
        String name = getName();
        if (name != null) {
            return name;
        }

        String path = getPath();
        if (path != null) {
            return new File(path).getName();
        }

        return null;
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
    }

    @Override
    protected boolean isInline() {
        return true;
    }

    /**
     * Fields
     **/

    public String getExplicitFileType() {
        return getStringValue(EXPLICIT_FILE_TYPE_KEY);
    }

    public void setExplicitFileType(String value) {
        setStringValue(EXPLICIT_FILE_TYPE_KEY, value);
    }

    public String getLastKnownFileType() {
        return getStringValue(LAST_KNOWN_FILE_TYPE_KEY);
    }

    public void setLastKnownFileType(String value) {
        setStringValue(LAST_KNOWN_FILE_TYPE_KEY, value);
    }

    public String getIncludeInIndex() {
        return getStringValue(INCLUDE_IN_INDEX_KEY);
    }

    public void setIncludeInIndex(String value) {
        setStringValue(INCLUDE_IN_INDEX_KEY, value);
    }

    public String getName() {
        return getStringValue(NAME_KEY);
    }

    public void setName(String value) {
        setStringValue(NAME_KEY, value);
    }

    public String getPath() {
        return getStringValue(PATH_KEY);
    }

    public void setPath(String value) {
        setStringValue(PATH_KEY, value);
    }

    public String getSourceTree() {
        return getStringValue(SOURCE_TREE_KEY);
    }

    public void setSourceTree(String value) {
        setStringValue(SOURCE_TREE_KEY, value);
    }

}
