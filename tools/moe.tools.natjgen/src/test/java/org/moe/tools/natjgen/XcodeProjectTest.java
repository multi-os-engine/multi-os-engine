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

import java.io.File;

public class XcodeProjectTest extends TestCase {

    private XcodeProject xcodeProject;

    @Override
    protected void setUp() throws Exception {
        final String resourcesDir = System.getProperty("test.resources");
        assertNotNull(resourcesDir);

        xcodeProject = new XcodeProject(new File(resourcesDir + "/MyApp/MyApp.xcodeproj"));
        assertNotNull(xcodeProject);
    }

    public void testTargets() {
        assertEquals(3, xcodeProject.targets.size());
        assertEquals("MyApp", xcodeProject.targets.get(0).raw.getName());
        assertEquals("MyAppTests", xcodeProject.targets.get(1).raw.getName());
        assertEquals("MyAppUITests", xcodeProject.targets.get(2).raw.getName());
    }
}
