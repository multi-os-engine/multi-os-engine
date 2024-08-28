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

package org.moe.document.xib;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.HashSet;

public class XIB {

	public static final String DOCUMENT_IB3_XIB_TYPE = "com.apple.InterfaceBuilder3.CocoaTouch.XIB";
	public static final String DOCUMENT_IB3_STORYBOARD_TYPE = "com.apple.InterfaceBuilder3.CocoaTouch.Storyboard.XIB";

	public static final String TYPE_ATTR = "type";
	public static final String VERSION_ATTR = "version";
	public static final String TOOLS_VERSION_ATTR = "toolsVersion";
	public static final String SYSTEM_VERSION_ATTR = "systemVersion";
	public static final String TARGET_RUNTIME_ATTR = "targetRuntime";
	public static final String PROPERTY_ACCESS_CONTROL_ATTR = "propertyAccessControl";
	public static final String USE_AUTOLAYOUT_ATTR = "useAutolayout";

	public static final String DOCUMENT_NODE_NAME = "document";
	public static final String DEPENDENCIES_NODE_NAME = "dependencies";
	public static final String OBJECTS_NODE_NAME = "objects";
	public static final String SCENES_NODE_NAME = "scenes";
	public static final String SCENE_NODE_NAME = "scene";

	private final String type;
	private final String version;
	private final String toolsVersion;
	private final String systemVersion;
	private final String targetRuntime;
	private final String propertyAccessControl;
	private final Boolean useAutolayout;

	private final ArrayList<Dependency> dependencies = new ArrayList<Dependency>();

	private final HashSet<String> customClasses = new HashSet<String>();

	XIB(Node document) {
		type = Util.getStringAttr(document, TYPE_ATTR);
		version = Util.getStringAttr(document, VERSION_ATTR);
		toolsVersion = Util.getStringAttr(document, TOOLS_VERSION_ATTR);
		systemVersion = Util.getStringAttr(document, SYSTEM_VERSION_ATTR);
		targetRuntime = Util.getStringAttr(document, TARGET_RUNTIME_ATTR);
		propertyAccessControl = Util.getStringAttr(document,
				PROPERTY_ACCESS_CONTROL_ATTR);
		useAutolayout = Util.getBooleanAttr(document, USE_AUTOLAYOUT_ATTR);
	}

	public boolean isIB3XIBDocument() {
		return DOCUMENT_IB3_XIB_TYPE.equals(type);
	}

	public boolean isIB3StoryboardDocument() {
		return DOCUMENT_IB3_STORYBOARD_TYPE.equals(type);
	}

	public HashSet<String> getCustomClasses() {
		return customClasses;
	}

	public ArrayList<Dependency> getDependencies() {
		return dependencies;
	}

	public String getType() {
		return type;
	}

	public String getVersion() {
		return version;
	}

	public String getToolsVersion() {
		return toolsVersion;
	}

	public String getSystemVersion() {
		return systemVersion;
	}

	public String getTargetRuntime() {
		return targetRuntime;
	}

	public String getPropertyAccessControl() {
		return propertyAccessControl;
	}

	public Boolean getUseAutolayout() {
		return useAutolayout;
	}

}
