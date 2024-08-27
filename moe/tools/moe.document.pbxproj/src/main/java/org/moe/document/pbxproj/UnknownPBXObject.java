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

public final class UnknownPBXObject extends PBXObject {

    public UnknownPBXObject(Dictionary<Value, NextStep> dict) {
        super(dict);
        // System.out.println(dict.getValue(PBXObject.ISA_KEY));
    }

    @Override
    public String getCommentString() {
        return null;
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
    }

}
