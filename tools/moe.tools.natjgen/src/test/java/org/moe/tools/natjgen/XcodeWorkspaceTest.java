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

import junit.framework.TestCase;
import org.moe.document.pbxproj.ProjectException;
import org.moe.document.pbxproj.ProjectFile;
import org.moe.tools.natjgen.XcodeWorkspace.FileRef;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XcodeWorkspaceTest extends TestCase {

    public void testWorkspace() throws IOException, ProjectException {
        final String resourcesDir = System.getProperty("test.resources");
        assertNotNull(resourcesDir);

        final XcodeWorkspace workspace = new XcodeWorkspace(new File(resourcesDir + "/MyApp/MyApp.xcworkspace"));
        assertTrue(workspace.getWorkspaceRoot().getName().equals("MyApp"));

        final List<FileRef> locations = workspace.getLocations();
        assertEquals(2, locations.size());

        final FileRef fileRef0 = locations.get(0);
        assertEquals("group", fileRef0.type);
        assertEquals("MyApp.xcodeproj", fileRef0.value);

        final FileRef fileRef1 = locations.get(1);
        assertEquals("group", fileRef1.type);
        assertEquals("Pods/Pods.xcodeproj", fileRef1.value);

        for (FileRef location : locations) {
            new ProjectFile(new File(workspace.getWorkspaceRoot(), location.value));
        }
    }

}
