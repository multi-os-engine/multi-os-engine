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

package org.moe.common.macho;

import org.junit.Assert;
import org.junit.Test;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * MachoFile tests.
 */
public class TestMachoFile {

    @Test
    public void testFatIOS() {
        final InputStream input = TestMachoFile.class.getResourceAsStream("ios-fat-armv7-arm64");
        final String[] archs = {MachoFile.CPU_NAME_ARM, MachoFile.CPU_NAME_ARM64};
        validate(input, archs);
    }

    @Test
    public void testNonfatArm() {
        final InputStream input = TestMachoFile.class.getResourceAsStream("ios-nonfat-armv7");
        final String[] archs = {MachoFile.CPU_NAME_ARM};
        validate(input, archs);
    }

    @Test
    public void testNonfatArm64() {
        final InputStream input = TestMachoFile.class.getResourceAsStream("ios-nonfat-arm64");
        final String[] archs = {MachoFile.CPU_NAME_ARM64};
        validate(input, archs);
    }

    @Test
    public void testFatOSX() {
        final InputStream input = TestMachoFile.class.getResourceAsStream("osx-fat-i386-x86_64");
        final String[] archs = {MachoFile.CPU_NAME_I386, MachoFile.CPU_NAME_X86_64};
        validate(input, archs);
    }

    @Test
    public void testNonfatI386() {
        final InputStream input = TestMachoFile.class.getResourceAsStream("osx-nonfat-i386");
        final String[] archs = {MachoFile.CPU_NAME_I386};
        validate(input, archs);
    }

    @Test
    public void testNonfatX86_64() {
        final InputStream input = TestMachoFile.class.getResourceAsStream("osx-nonfat-x86_64");
        final String[] archs = {MachoFile.CPU_NAME_X86_64};
        validate(input, archs);
    }

    private void validate(InputStream input, String[] archs) {
        List<String> cpuTypes;
        try {
            cpuTypes = MachoFile.getRecognizedCPUTypes(input);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Assert.fail(e.getMessage());
            return;
        }
        List<String> exp = Arrays.asList(archs);
        Collections.sort(exp);
        List<String> act = cpuTypes;
        Collections.sort(act);
        Assert.assertEquals(exp, act);
    }
}
