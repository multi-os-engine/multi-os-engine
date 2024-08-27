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

public final class Util {

	private Util() {

	}

	public static final String getStringAttr(Node node, String attrib) {
		Node nAttr = node.getAttributes().getNamedItem(attrib);

		String vAttr = null;
		if (nAttr != null) {
			vAttr = nAttr.getTextContent();
		}

		return vAttr;
	}

	public static Boolean getBooleanAttr(Node node, String attrib) {
		Node nAttr = node.getAttributes().getNamedItem(attrib);

		String sAttr = null;
		if (nAttr != null) {
			sAttr = nAttr.getTextContent();
		} else {
			return null;
		}

		if ("YES".equalsIgnoreCase(sAttr)) {
			return Boolean.TRUE;
		} else if ("NO".equalsIgnoreCase(sAttr)) {
			return Boolean.FALSE;
		} else {
			return new Boolean(sAttr);
		}
	}

}
