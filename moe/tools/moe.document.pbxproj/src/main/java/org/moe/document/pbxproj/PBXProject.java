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
public final class PBXProject extends PBXObject {

	public static final String ATTRIBUTES_KEY = "attributes";
	public static final String BUILD_CONFIGURATION_LIST_KEY = "buildConfigurationList";
	public static final String COMPATIBILITY_VERSION_KEY = "compatibilityVersion";
	public static final String DEVELOPMENT_REGION_KEY = "developmentRegion";
	public static final String HAS_SCANNED_FOR_ENCODINGS_KEY = "hasScannedForEncodings";
	public static final String KNOWN_REGIONS_KEY = "knownRegions";
	public static final String MAIN_GROUP_KEY = "mainGroup";
	public static final String PRODUCT_REF_GROUP_KEY = "productRefGroup";
	public static final String PROJECT_DIR_PATH_KEY = "projectDirPath";
	public static final String PROJECT_REFERENCES_KEY = "projectReferences";
	public static final String PROJECT_ROOT_KEY = "projectRoot";
	public static final String TARGETS_KEY = "targets";

	private String projectName = "";

	public PBXProject(Dictionary<Value, NextStep> dict) {
		super(dict);

		Array<ProjectReference> refs = getProjectReferences();
		int count = refs.size();
		for (int i = 0; i < count; ++i) {
			refs.set(i, new ProjectReference(refs.get(i)));
		}
	}

	public PBXProject() {
		super(null);
		setIsa(this.getClass().getSimpleName());
	}

	public void setProjectName(String projectName) {
		if (projectName == null) {
			this.projectName = "";
		} else {
			this.projectName = projectName;
		}
	}

	@Override
	public String getCommentString() {
		return "Project object";
	}

	@Override
	public void connectReferences(Map<String, Value> map) {
		connectReferencesInValue(BUILD_CONFIGURATION_LIST_KEY, map);
		connectReferencesInValue(MAIN_GROUP_KEY, map);
		connectReferencesInValue(PRODUCT_REF_GROUP_KEY, map);
		connectReferencesInValueArray(TARGETS_KEY, map);
		Iterator<ProjectReference> it = getProjectReferences().iterator();
		while (it.hasNext()) {
			it.next().connectReferences(map);
		}
	}

	@Override
	public void update() {
		PBXObjectRef<XCConfigurationList> ref = (PBXObjectRef<XCConfigurationList>) getValue(BUILD_CONFIGURATION_LIST_KEY);
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

		if (ref.equals(getMainGroup())) {
			setMainGroup(null);
		}

		if (ref.equals(getProductRefGroup())) {
			setProductRefGroup(null);
		}

		Iterator<?> it = getTargets().iterator();
		while (it.hasNext()) {
			if (it.next().equals(ref)) {
				it.remove();
			}
		}

		Iterator<ProjectReference> pref_it = getProjectReferences().iterator();
		while (pref_it.hasNext()) {
			pref_it.next().removeReference(ref);
		}
	}

	public String getProjectName() {
		return projectName;
	}

	/** Fields **/

	public Dictionary<Value, Value> getAttributes() {
		return (Dictionary<Value, Value>) getDictionaryValue(ATTRIBUTES_KEY);
	}

	public PBXObjectRef<XCConfigurationList> getBuildConfigurationList() {
		return (PBXObjectRef<XCConfigurationList>) getPBXObjectRefValue(BUILD_CONFIGURATION_LIST_KEY);
	}

	public void setBuildConfigurationList(PBXObjectRef<XCConfigurationList> value) {
		setPBXObjectRefValue(BUILD_CONFIGURATION_LIST_KEY, value);
	}

	public String getCompatibilityVersion() {
		return getStringValue(COMPATIBILITY_VERSION_KEY);
	}

	public void setCompatibilityVersion(String value) {
		setStringValue(COMPATIBILITY_VERSION_KEY, value);
	}

	public String getDevelopmentRegion() {
		return getStringValue(DEVELOPMENT_REGION_KEY);
	}

	public void setDevelopmentRegion(String value) {
		setStringValue(DEVELOPMENT_REGION_KEY, value);
	}

	public String getHasScannedForEncodings() {
		return getStringValue(HAS_SCANNED_FOR_ENCODINGS_KEY);
	}

	public void setHasScannedForEncodings(String value) {
		setStringValue(HAS_SCANNED_FOR_ENCODINGS_KEY, value);
	}

	public Array<Value> getKnownRegions() {
		return (Array<Value>) getArrayValue(KNOWN_REGIONS_KEY);
	}

	public PBXObjectRef<PBXGroup> getMainGroup() {
		return (PBXObjectRef<PBXGroup>) getPBXObjectRefValue(MAIN_GROUP_KEY);
	}

	public void setMainGroup(PBXObjectRef<PBXGroup> value) {
		setPBXObjectRefValue(MAIN_GROUP_KEY, value);
	}

	public PBXObjectRef<PBXGroup> getProductRefGroup() {
		return (PBXObjectRef<PBXGroup>) getPBXObjectRefValue(PRODUCT_REF_GROUP_KEY);
	}

	public void setProductRefGroup(PBXObjectRef<PBXGroup> value) {
		setPBXObjectRefValue(PRODUCT_REF_GROUP_KEY, value);
	}

	public String getProjectDirPath() {
		return getStringValue(PROJECT_DIR_PATH_KEY);
	}

	public void setProjectDirPath(String value) {
		setStringValue(PROJECT_DIR_PATH_KEY, value);
	}

	public Array<ProjectReference> getProjectReferences() {
		return (Array<ProjectReference>) getArrayValue(PROJECT_REFERENCES_KEY);
	}

	public String getProjectRoot() {
		return getStringValue(PROJECT_ROOT_KEY);
	}

	public void setProjectRoot(String value) {
		setStringValue(PROJECT_ROOT_KEY, value);
	}

	public Array<PBXObjectRef<PBXNativeTarget>> getTargets() {
		return (Array<PBXObjectRef<PBXNativeTarget>>) getArrayValue(TARGETS_KEY);
	}

	/** Helper classes **/

	public static class ProjectReference extends PBXObject {

		public ProjectReference(Dictionary<Value, NextStep> dict) {
			super(dict);
			setIsa(null);
		}

		public static final String PRODUCT_GROUP_KEY = "ProductGroup";
		public static final String PROJECT_REF_KEY = "ProjectRef";

		@Override
		public String getCommentString() {
			return null;
		}

		@Override
		public void connectReferences(Map<String, Value> map) {
			connectReferencesInValue(PRODUCT_GROUP_KEY, map);
			connectReferencesInValue(PROJECT_REF_KEY, map);
		}

		@Override
		public void removeReference(PBXObjectRef<? extends PBXObject> ref) {
			if (ref.equals(getProductGroup())) {
				setProductGroup(null);
			}

			if (ref.equals(getProjectRef())) {
				setProjectRef(null);
			}
		}

		/** Fields **/

		public PBXObjectRef<PBXGroup> getProductGroup() {
			return (PBXObjectRef<PBXGroup>) getPBXObjectRefValue(PRODUCT_GROUP_KEY);
		}

		public void setProductGroup(PBXObjectRef<PBXGroup> value) {
			setPBXObjectRefValue(PRODUCT_GROUP_KEY, value);
		}

		public PBXObjectRef<PBXFileReference> getProjectRef() {
			return (PBXObjectRef<PBXFileReference>) getPBXObjectRefValue(PROJECT_REF_KEY);
		}

		public void setProjectRef(PBXObjectRef<PBXFileReference> value) {
			setPBXObjectRefValue(PROJECT_REF_KEY, value);
		}

	}

}
