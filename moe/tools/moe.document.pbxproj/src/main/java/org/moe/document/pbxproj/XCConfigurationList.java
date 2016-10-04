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
public final class XCConfigurationList extends PBXObject {

    public static final String BUILD_CONFIGURATIONS_KEY = "buildConfigurations";
    public static final String DEFAULT_CONFIGURATION_IS_VISIBLE_KEY = "defaultConfigurationIsVisible";
    public static final String DEFAULT_CONFIGURATION_NAME_KEY = "defaultConfigurationName";

    public PBXObject target;

    public XCConfigurationList(Dictionary<Value, NextStep> dict) {
        super(dict);
    }

    public XCConfigurationList() {
        super(null);
        setIsa(this.getClass().getSimpleName());
    }

    @Override
    public String getCommentString() {
        if (target instanceof PBXProject) {
            PBXProject project = (PBXProject)this.target;
            String projectName = project.getProjectName();
            if (projectName.length() == 0 && project.getTargets().size() > 0) {
                projectName = project.getTargets().get(0).getReferenced().getName();
            }
            return "Build configuration list for PBXProject \"" + projectName + "\"";
        }
        if (target instanceof PBXNativeTarget) {
            return "Build configuration list for PBXNativeTarget \"" + ((PBXNativeTarget)target).getName() + "\"";
        }

        return null;
    }

    @Override
    public void connectReferences(Map<String, Value> map) {
        connectReferencesInValueArray(BUILD_CONFIGURATIONS_KEY, map);
    }

    @Override
    public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
        Iterator<?> it = getBuildConfigurations().iterator();
        while (it.hasNext()) {
            if (it.next().equals(ref)) {
                it.remove();
            }
        }
    }

    /**
     * Fields
     **/

    public Array<PBXObjectRef<XCBuildConfiguration>> getBuildConfigurations() {
        return getArrayValueOrNull(BUILD_CONFIGURATIONS_KEY);
    }

    public String getDefaultConfigurationIsVisible() {
        return getStringValue(DEFAULT_CONFIGURATION_IS_VISIBLE_KEY);
    }

    public void setDefaultConfigurationIsVisible(String value) {
        setStringValue(DEFAULT_CONFIGURATION_IS_VISIBLE_KEY, value);
    }

    public String getDefaultConfigurationName() {
        return getStringValue(DEFAULT_CONFIGURATION_NAME_KEY);
    }

    public void setDefaultConfigurationName(String value) {
        setStringValue(DEFAULT_CONFIGURATION_NAME_KEY, value);
    }

}
