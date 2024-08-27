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

public class PlugInDependency extends Dependency {

	public static final String IDENTIFIER_ATTR = "identifier";

	public static final String VERSION_ATTR = "version";

	public static final String PLUGIN_NODE_NAME = "plugIn";

	public static final String IBCocoaTouchPluginID = "com.apple.InterfaceBuilder.IBCocoaTouchPlugin";

	private final String identifier;

	private final String version;

	PlugInDependency(String identifier, String version) {
		this.identifier = identifier;
		this.version = version;
	}

	public String getIdentifier() {
		return identifier;
	}

	public String getVersion() {
		return version;
	}

	static Dependency parse(Node node) {
		String id = Util.getStringAttr(node, IDENTIFIER_ATTR);
		String ver = Util.getStringAttr(node, VERSION_ATTR);

		return new PlugInDependency(id, ver);
	}

}
