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
public final class PBXNativeTarget extends PBXObject {

    public static final String BUILD_CONFIGURATION_LIST_KEY = "buildConfigurationList";
    public static final String BUILD_PHASES_KEY = "buildPhases";
    public static final String BUILD_RULES_KEY = "buildRules";
    public static final String DEPENDENCIES_KEY = "dependencies";
    public static final String NAME_KEY = "name";
    public static final String PRODUCT_NAME_KEY = "productName";
    public static final String PRODUCT_REFERENCE_KEY = "productReference";
    public static final String PRODUCT_TYPE_KEY = "productType";

    public PBXNativeTarget(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    public PBXNativeTarget() {
        super(null);
        setIsa(this.getClass().getSimpleName());
    }

    @Override
    public String getCommentString() {
        return getName();
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
        connectReferencesInValue(BUILD_CONFIGURATION_LIST_KEY, map);
        connectReferencesInValueArray(BUILD_PHASES_KEY, map);
        connectReferencesInValueArray(BUILD_RULES_KEY, map);
        connectReferencesInValueArray(DEPENDENCIES_KEY, map);
        connectReferencesInValue(PRODUCT_REFERENCE_KEY, map);
    }

    @Override
    public void update() {
        PBXObjectRef<XCConfigurationList> ref = (PBXObjectRef<XCConfigurationList>)getValue(
                BUILD_CONFIGURATION_LIST_KEY);
        if (ref == null) {
            return;
        }
        XCConfigurationList referenced = ref.getReferenced();
        if (referenced != null) {
            referenced.target = this;
        }
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
        if (ref.equals(getBuildConfigurationList())) {
            setBuildConfigurationList(null);
        }

        Iterator<?> it = getBuildPhases().iterator();
        while (it.hasNext()) {
            if (it.next().equals(ref)) {
                it.remove();
            }
        }

        it = getBuildRules().iterator();
        while (it.hasNext()) {
            if (it.next().equals(ref)) {
                it.remove();
            }
        }

        it = getDependencies().iterator();
        while (it.hasNext()) {
            if (it.next().equals(ref)) {
                it.remove();
            }
        }

        if (ref.equals(getProductReference())) {
            setProductReference(null);
        }
    }

    /**
     * Fields
     **/

    public PBXObjectRef<XCConfigurationList> getBuildConfigurationList() {
        return (PBXObjectRef<XCConfigurationList>)getPBXObjectRefValue(BUILD_CONFIGURATION_LIST_KEY);
    }

    public void setBuildConfigurationList(PBXObjectRef<XCConfigurationList> value) {
        setPBXObjectRefValue(BUILD_CONFIGURATION_LIST_KEY, value);
    }

    public Array<PBXObjectRef<PBXBuildPhase>> getBuildPhases() {
        return (Array<PBXObjectRef<PBXBuildPhase>>)getArrayValue(BUILD_PHASES_KEY);
    }

    public Array<PBXObjectRef<PBXBuildRule>> getBuildRules() {
        return (Array<PBXObjectRef<PBXBuildRule>>)getArrayValue(BUILD_RULES_KEY);
    }

    public Array<PBXObjectRef<?>> getDependencies() {
        return (Array<PBXObjectRef<?>>)getArrayValue(DEPENDENCIES_KEY);
    }

    public String getName() {
        return getStringValue(NAME_KEY);
    }

    public void setName(String value) {
        setStringValue(NAME_KEY, value);
    }

    public String getProductName() {
        return getStringValue(PRODUCT_NAME_KEY);
    }

    public void setProductName(String value) {
        setStringValue(PRODUCT_NAME_KEY, value);
    }

    public PBXObjectRef<PBXFileReference> getProductReference() {
        return (PBXObjectRef<PBXFileReference>)getPBXObjectRefValue(PRODUCT_REFERENCE_KEY);
    }

    public void setProductReference(PBXObjectRef<PBXFileReference> value) {
        setPBXObjectRefValue(PRODUCT_REFERENCE_KEY, value);
    }

    public String getProductType() {
        return getStringValue(PRODUCT_TYPE_KEY);
    }

    public void setProductType(String value) {
        setStringValue(PRODUCT_TYPE_KEY, value);
    }

}
