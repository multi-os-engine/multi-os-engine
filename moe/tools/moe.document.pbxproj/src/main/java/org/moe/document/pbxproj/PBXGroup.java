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
public final class PBXGroup extends PBXObject {

    public static final String CHILDREN_KEY = "children";
    public static final String NAME_KEY = "name";
    public static final String PATH_KEY = "path";
    public static final String SOURCE_TREE_KEY = "sourceTree";

    public PBXGroup(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    public PBXGroup() {
        super(null);
        setIsa(this.getClass().getSimpleName());
    }

    @Override
    public String getCommentString() {
        String name = getName();
        if (name != null) {
            return name;
        }

        return getPath();
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
        connectReferencesInValueArray(CHILDREN_KEY, map);
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
        Iterator<?> it = getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().equals(ref)) {
                it.remove();
            }
        }
    }

    /**
     * Fields
     **/

    public Array<PBXObjectRef<? extends PBXObject>> getChildren() {
        return (Array<PBXObjectRef<? extends PBXObject>>)getArrayValue(CHILDREN_KEY);
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
