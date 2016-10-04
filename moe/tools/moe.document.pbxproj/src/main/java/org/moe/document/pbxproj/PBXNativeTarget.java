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
        connectReferencesInArray(BUILD_PHASES_KEY, map);
        connectReferencesInArray(BUILD_RULES_KEY, map);
        connectReferencesInArray(DEPENDENCIES_KEY, map);
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
        removeReferenceFromReferenceValue(BUILD_CONFIGURATION_LIST_KEY, ref);
        removeReferenceFromReferenceArray(BUILD_PHASES_KEY, ref);
        removeReferenceFromReferenceArray(BUILD_RULES_KEY, ref);
        removeReferenceFromReferenceArray(DEPENDENCIES_KEY, ref);
        removeReferenceFromReferenceValue(PRODUCT_REFERENCE_KEY, ref);
    }

    /**
     * Fields
     **/

    public PBXObjectRef<XCConfigurationList> getBuildConfigurationList() {
        return getPBXObjectRefValue(BUILD_CONFIGURATION_LIST_KEY);
    }

    public void setBuildConfigurationList(PBXObjectRef<XCConfigurationList> value) {
        setPBXObjectRefValue(BUILD_CONFIGURATION_LIST_KEY, value);
    }

    public Array<PBXObjectRef<PBXBuildPhase>> getBuildPhasesOrNull() {
        return getArrayValueOrNull(BUILD_PHASES_KEY);
    }

    public Array<PBXObjectRef<PBXBuildPhase>> getOrCreateBuildPhases() {
        return getOrCreateArrayValue(BUILD_PHASES_KEY);
    }

    public Array<PBXObjectRef<PBXBuildRule>> getBuildRulesOrNull() {
        return getArrayValueOrNull(BUILD_RULES_KEY);
    }

    public Array<PBXObjectRef<PBXBuildRule>> getOrCreateBuildRules() {
        return getOrCreateArrayValue(BUILD_RULES_KEY);
    }

    public Array<PBXObjectRef<?>> getDependenciesOrNull() {
        return getArrayValueOrNull(DEPENDENCIES_KEY);
    }

    public Array<PBXObjectRef<?>> getOrCreateDependencies() {
        return getOrCreateArrayValue(DEPENDENCIES_KEY);
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
        return getPBXObjectRefValue(PRODUCT_REFERENCE_KEY);
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
