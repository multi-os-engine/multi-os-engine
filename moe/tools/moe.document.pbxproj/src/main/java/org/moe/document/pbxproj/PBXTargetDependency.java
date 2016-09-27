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
public class PBXTargetDependency extends PBXObject {

    public static final String NAME_KEY = "name";
    public static final String TARGET_KEY = "target";
    public static final String TARGET_PROXY_KEY = "targetProxy";

    public PBXTargetDependency(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    public PBXTargetDependency() {
        super(null);
        setIsa(this.getClass().getSimpleName());
    }

    @Override
    public String getCommentString() {
        return "PBXTargetDependency";
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
        connectReferencesInValue(TARGET_PROXY_KEY, map);
        connectReferencesInValue(TARGET_KEY, map);
    }

    @Override
    public void update() {
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
        if (ref.equals(getTargetProxy())) {
            setTargetProxy(null);
        }

        if (ref.equals(getTarget())) {
            setTarget(null);
        }
    }

    /**
     * Fields
     **/

    public String getName() {
        return getStringValue(NAME_KEY);
    }

    public void setName(String value) {
        setStringValue(NAME_KEY, value);
    }

    public PBXObjectRef<PBXNativeTarget> getTarget() {
        return (PBXObjectRef<PBXNativeTarget>)getPBXObjectRefValue(TARGET_KEY);
    }

    public void setTarget(PBXObjectRef<PBXNativeTarget> value) {
        setPBXObjectRefValue(TARGET_KEY, value);
    }

    public PBXObjectRef<PBXContainerItemProxy> getTargetProxy() {
        return (PBXObjectRef<PBXContainerItemProxy>)getPBXObjectRefValue(TARGET_PROXY_KEY);
    }

    public void setTargetProxy(PBXObjectRef<PBXContainerItemProxy> value) {
        setPBXObjectRefValue(TARGET_PROXY_KEY, value);
    }

}
