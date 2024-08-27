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
import org.moe.document.pbxproj.PBXBuildFile;
import org.moe.document.pbxproj.PBXFileReference;

import java.io.File;

public class XcodeTargetTest extends TestCase {

    private XcodeProject xcodeProject;

    @Override
    protected void setUp() throws Exception {
        final String resourcesDir = System.getProperty("test.resources");
        assertNotNull(resourcesDir);

        xcodeProject = new XcodeProject(new File(resourcesDir + "/MyApp/MyApp.xcodeproj"));
        assertNotNull(xcodeProject);
    }

    public void testFrameworks() {
        for (PBXBuildFile file : xcodeProject.targets.get(0).locateFrameworks()) {
            final PBXFileReference fileRef = (PBXFileReference)file.getFileRef().getReferenced();
            System.out.println(fileRef.getName() + " - " + fileRef.getPath() + " - " + fileRef.getSourceTree());
        }
    }
}
