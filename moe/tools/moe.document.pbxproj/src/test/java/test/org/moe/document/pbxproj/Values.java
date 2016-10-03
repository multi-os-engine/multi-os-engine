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

package test.org.moe.document.pbxproj;

import org.junit.BeforeClass;
import org.junit.Test;
import org.moe.document.pbxproj.PBXNativeTarget;
import org.moe.document.pbxproj.PBXObjectRef;
import org.moe.document.pbxproj.PBXProject;
import org.moe.document.pbxproj.ProjFile;
import org.moe.document.pbxproj.ProjectException;
import org.moe.document.pbxproj.nextstep.Array;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class Values {

    private static ProjFile pbxproj;
    private static PBXProject project;

    @BeforeClass
    public static void setup() throws ProjectException {
        String filename = "project.pbxproj";
        InputStream resourceStream = SCMSupport.class.getResourceAsStream(filename);
        pbxproj = new ProjFile(resourceStream);
        project = pbxproj.getRoot().getRootObject().getReferenced();
    }

    @Test
    public void testProject() {
        assertNotNull(project);
        assertEquals(0, project.getProjectName().length());
    }

    @Test
    public void testTargets() {
        Array<PBXObjectRef<PBXNativeTarget>> targets = project.getTargets();
        List<String> names = Arrays
                .asList("App-SingleView", "App-Game", "App-MasterDetail", "App-PageBased", "App-Tabbed",
                        "Lib-Framework", "Lib-Static", "Lib-Metal");
        assertEquals(names.size(), targets.size());
        for (PBXObjectRef<PBXNativeTarget> ref : targets) {
            assertTrue(names.contains(ref.getReferenced().getName()));
        }
    }
}
