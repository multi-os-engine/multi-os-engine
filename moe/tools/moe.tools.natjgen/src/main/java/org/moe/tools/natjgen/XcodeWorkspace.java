/*
Copyright (C) 2016 Migeran

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

package org.moe.tools.natjgen;

import org.moe.document.pbxproj.ProjectException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Utility class for easily accessing some Xcode workspace properties.
 */
public class XcodeWorkspace {

    /**
     * File reference class.
     */
    public static final class FileRef {
        /**
         * Reference type.
         */
        public final String type;
        /**
         * Reference value.
         */
        public final String value;

        /**
         * Creates a new FileRef instance from the specified string.
         *
         * @param input Reference string
         */
        public FileRef(String input) {
            if (input == null) {
                throw new NullPointerException();
            }
            final int idx = input.indexOf(':');
            if (idx == -1) {
                throw new IllegalArgumentException();
            }
            this.type = input.substring(0, idx);
            this.value = input.substring(idx + 1);
        }
    }

    /**
     * List of locations.
     */
    private final List<FileRef> locations = new ArrayList<FileRef>();
    /**
     * Workspace file.
     */
    private final File workspaceRoot;

    /**
     * Creates a new XcodeWorkspace instance from the specified file.
     *
     * @param file File to read from
     * @throws IOException if an error occurs
     */
    public XcodeWorkspace(File file) throws IOException {
        if (file == null) {
            throw new NullPointerException();
        }

        if (file.getName().endsWith(".xcworkspace")) {
            file = new File(file, "contents.xcworkspacedata");
        }

        if (!file.getName().equals("contents.xcworkspacedata")) {
            throw new IOException("Failed to locate 'contents.xcworkspacedata' in " + file.getAbsolutePath());
        }

        final FileInputStream is = new FileInputStream(file);
        workspaceRoot = file.getParentFile().getParentFile();

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            final Document document = builder.parse(is);
            document.getDocumentElement().normalize();
            final NodeList fileRefs = document.getDocumentElement().getChildNodes();
            for (int i = 0, count = fileRefs.getLength(); i < count; ++i) {
                final Node node = fileRefs.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element)node;
                    locations.add(new FileRef(element.getAttribute("location")));
                }
            }
        } catch (Throwable t) {
            throw new IOException(t);
        }
    }

    /**
     * Returns the list of locations.
     *
     * @return List of locations
     */
    public List<FileRef> getLocations() {
        return Collections.unmodifiableList(locations);
    }

    /**
     * Returns the workspace file.
     *
     * @return Workspace file
     */
    public File getWorkspaceRoot() {
        return workspaceRoot;
    }

    /**
     * Opens all projects referenced by this workspace.
     *
     * @return List of newly opened projects.
     * @throws ProjectException if an error occurs
     */
    public List<XcodeProject> openProjects() throws ProjectException {
        final List<XcodeProject> projects = new ArrayList<XcodeProject>();
        for (FileRef location : locations) {
            projects.add(new XcodeProject(new File(getWorkspaceRoot(), location.value)));
        }
        return projects;
    }
}
