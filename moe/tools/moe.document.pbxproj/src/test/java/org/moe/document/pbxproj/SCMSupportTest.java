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

package org.moe.document.pbxproj;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class SCMSupportTest {

    /*
     * We want the output to be perfectly formatted. This means every output must be exactly the same as the project
     * which the structure was read from.
     */
    @Test
    public void testEqualityOnNoChange() throws ProjectException, IOException {
        String filename = "project.pbxproj";
        InputStream resourceStream = SCMSupportTest.class.getResourceAsStream(filename);
        String expected = IOUtils.toString(resourceStream, "UTF-8");

        resourceStream = SCMSupportTest.class.getResourceAsStream(filename);
        ProjectFile project = new ProjectFile(resourceStream);
        String actual = project.toString();
        assertEquals(expected, actual);
    }
}
