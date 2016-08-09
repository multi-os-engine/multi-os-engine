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

/*
 * plist - An open source library to parse and generate property lists
 * Copyright (C) 2014 Daniel Dreibrodt
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package org.moe.document.xib;

import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XIBParser {

	private XIBParser() {

	}

	private static DocumentBuilderFactory docBuilderFactory = null;

	private static synchronized void initDocBuilderFactory()
			throws ParserConfigurationException {
		docBuilderFactory = DocumentBuilderFactory.newInstance();
		docBuilderFactory.setIgnoringComments(true);
		docBuilderFactory.setCoalescing(true);
	}

	private static synchronized DocumentBuilder getDocBuilder()
			throws ParserConfigurationException {
		if (docBuilderFactory == null)
			initDocBuilderFactory();
		DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
		return docBuilder;
	}

	public static XIB parse(File f) throws Exception {
		DocumentBuilder docBuilder = getDocBuilder();
		Document doc = docBuilder.parse(f);
		return parseDocumentFile(doc);
	}

	private static XIB parseDocumentFile(Document doc) throws Exception {
		final String DOC_NODE_NAME = XIB.DOCUMENT_NODE_NAME;

		DocumentType docType = doc.getDoctype();
		if (docType == null) {
			if (!doc.getDocumentElement().getNodeName().equals(DOC_NODE_NAME))
				throw new UnsupportedOperationException(
						"The given XML document is not a xib/storyboard document.");
		} else if (!docType.getName().equals("xib")
				&& !docType.getName().equals("storyboard")) {
			throw new UnsupportedOperationException(
					"The given XML document is not a xib/storyboard document.");
		}

		Node docElem = doc.getDocumentElement();
		if (docElem.getNodeName().equals(DOC_NODE_NAME)) {
			XIB xib = new XIB(docElem);
			if (!xib.isIB3XIBDocument() && !xib.isIB3StoryboardDocument()) {
				throw new UnsupportedOperationException(
						"The given XML document is not a xib/storyboard document.");
			}
			List<Node> children = filterElementNodes(docElem.getChildNodes());
			for (int i = 0; i < children.size(); i++) {
				Node docChildElem = (Node) children.get(i);
				parseDocument(docChildElem, xib);
			}
			return xib;
		} else {
			throw new UnsupportedOperationException(
					"The xib/storyboard root element is not 'document'.");
		}
	}

	private static void parseDocument(Node n, XIB xib) throws Exception {
		String type = n.getNodeName();
		if (XIB.DEPENDENCIES_NODE_NAME.equals(type)) {
			List<Node> children = filterElementNodes(n.getChildNodes());
			for (int i = 0; i < children.size(); i++) {
				Node dep = (Node) children.get(i);
				if (PlugInDependency.PLUGIN_NODE_NAME.equals(dep.getNodeName())) {
					xib.getDependencies().add(PlugInDependency.parse(dep));
				}
			}
		} else if (xib.isIB3XIBDocument() && XIB.OBJECTS_NODE_NAME.equals(type)) {
			List<Node> children = filterElementNodes(n.getChildNodes());
			for (int i = 0; i < children.size(); i++) {
				collectCustomClasses(children.get(i), xib);
			}
		} else if (xib.isIB3StoryboardDocument()
				&& XIB.SCENES_NODE_NAME.equals(type)) {
			List<Node> children = filterElementNodes(n.getChildNodes());
			for (int i = 0; i < children.size(); i++) {
				parseScene(children.get(i), xib);
			}
		}
	}

	private static void parseScene(Node n, XIB xib) {
		String type = n.getNodeName();
		if (xib.isIB3StoryboardDocument() && XIB.SCENE_NODE_NAME.equals(type)) {
			List<Node> children = filterElementNodes(n.getChildNodes());
			for (int i = 0; i < children.size(); i++) {
				parseSceneObjects(children.get(i), xib);
			}
		}
	}

	private static void parseSceneObjects(Node n, XIB xib) {
		String type = n.getNodeName();
		if (XIB.OBJECTS_NODE_NAME.equals(type)) {
			List<Node> children = filterElementNodes(n.getChildNodes());
			for (int i = 0; i < children.size(); i++) {
				collectCustomClasses(children.get(i), xib);
			}
		}
	}

	private static void collectCustomClasses(Node n, XIB xib) {
		String type = n.getNodeName();
		if (Object.AUTORESIZING_MAKS_NODE_NAME.equals(type)) {
			return; // Skip
		} else if (Object.FONT_DESCRIPTION_NODE_NAME.equals(type)) {
			return; // Skip
		} else if (Object.COLOR_NODE_NAME.equals(type)) {
			return; // Skip
		} else if (Object.RECT_NODE_NAME.equals(type)) {
			return; // Skip
		} else if (Object.CONSTRAINTS_NODE_NAME.equals(type)) {
			return; // Skip
		} else if (Object.CONNECTIONS_NODE_NAME.equals(type)) {
			return; // Skip
		} else {
			// Try to get customClass attribute
			String cc = Util.getStringAttr(n, Object.CUSTOM_CLASS_ATTR);
			if (cc != null) {
				xib.getCustomClasses().add(cc);
			}

			List<Node> children = filterElementNodes(n.getChildNodes());
			for (int i = 0; i < children.size(); i++) {
				collectCustomClasses(children.get(i), xib);
			}
		}
	}

	private static List<Node> filterElementNodes(NodeList list) {
		List<Node> result = new ArrayList<Node>(list.getLength());
		for (int i = 0; i < list.getLength(); i++) {
			if (list.item(i).getNodeType() == 1) {
				result.add(list.item(i));
			}
		}
		return result;
	}
}
