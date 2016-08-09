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

public class Object {

	private Object() {

	}

	public static final String CUSTOM_CLASS_ATTR = "customClass";

	// Has customClass attribute
	public static final String PLACEHOLDER_NODE_NAME = "placeholder";

	// Doesn't have customClass attribute
	public static final String AUTORESIZING_MAKS_NODE_NAME = "autoresizingMask";
	public static final String FONT_DESCRIPTION_NODE_NAME = "fontDescription";
	public static final String COLOR_NODE_NAME = "color";
	public static final String RECT_NODE_NAME = "rect";
	public static final String CONSTRAINTS_NODE_NAME = "constraints";
	public static final String CONNECTIONS_NODE_NAME = "connections";

}
