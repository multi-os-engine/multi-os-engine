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

package org.moe.common.utils;

import junit.framework.TestCase;

public class OsUtilsTest extends TestCase {

    public void testGetOsName() throws Exception {
        assertEquals(OsUtils.getOsName(), System.getProperty("os.name"));
    }

    public void testIsWindows() throws Exception {
        String osName = System.getProperty("os.name");

        if(osName.startsWith("Windows")) {
            assertTrue(OsUtils.isWindows());
        }
        else {
            assertTrue(OsUtils.isMac());
        }

        if(osName.startsWith("Mac")) {
            assertTrue(OsUtils.isMac());
        }
        else {
            assertTrue(OsUtils.isWindows());
        }
    }

    public void testIsMac() throws Exception {
        String osName = System.getProperty("os.name");

        if(osName.startsWith("Windows")) {
            assertTrue(OsUtils.isWindows());
        }
        else {
            assertTrue(OsUtils.isMac());
        }

        if(osName.startsWith("Mac")) {
            assertTrue(OsUtils.isMac());
        }
        else {
            assertTrue(OsUtils.isWindows());
        }
    }
}
