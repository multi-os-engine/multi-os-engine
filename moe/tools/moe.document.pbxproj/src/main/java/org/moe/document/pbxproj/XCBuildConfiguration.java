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
public final class XCBuildConfiguration extends PBXObject {

	public static final String BUILD_SETTINGS_KEY = "buildSettings";
	public static final String BASE_CONFIGURATION_REFERENCE_KEY = "baseConfigurationReference";
	public static final String NAME_KEY = "name";

	public XCBuildConfiguration(Dictionary<Value, NextStep> dict) {
		super(dict);
	}

	public XCBuildConfiguration() {
		super(null);
		setIsa(this.getClass().getSimpleName());
	}

	@Override
	public String getCommentString() {
		return getName();
	}

	@Override
	public void connectReferences(Map<String, Value> map) {
		connectReferencesInValue(BASE_CONFIGURATION_REFERENCE_KEY, map);
	}

	@Override
	public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
		if (ref.equals(getBaseConfigurationReference())) {
			setBaseConfigurationReference(null);
		}
	}

	/** Fields **/

	public Dictionary<Value, NextStep> getBuildSettings() {
		return (Dictionary<Value, NextStep>) getDictionaryValue(BUILD_SETTINGS_KEY);
	}

	public String getName() {
		return getStringValue(NAME_KEY);
	}

	public void setName(String value) {
		setStringValue(NAME_KEY, value);
	}

	public PBXObjectRef<PBXFileReference> getBaseConfigurationReference() {
		return (PBXObjectRef<PBXFileReference>) getPBXObjectRefValue(BASE_CONFIGURATION_REFERENCE_KEY);
	}

	public void setBaseConfigurationReference(PBXObjectRef<PBXFileReference> value) {
		setPBXObjectRefValue(BASE_CONFIGURATION_REFERENCE_KEY, value);
	}

}
