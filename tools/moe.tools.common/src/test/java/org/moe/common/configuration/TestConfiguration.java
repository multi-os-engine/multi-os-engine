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

package org.moe.common.configuration;

import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestConfiguration extends AbstractConfiguration {

    @Override
    public void validate() throws ConfigurationValidationException {
        // Do nothing
    }

    @Test
    public void testClose() {
        Assert.assertFalse(isClosed());
        close();
        Assert.assertTrue(isClosed());
    }

    @Test(expected = IllegalStateException.class)
    public void testRequireOpen() {
        Assert.assertFalse(isClosed());
        requireOpen();
        close();
        requireOpen();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetProperty() {
        getProperty("test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetProperty() {
        setProperty("test", "test");
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetPropertyClass() {
        getPropertyClass("test");
    }

    @Test()
    public void testAssertNotNull_0() {
        try {
            assertNotNull("test", "notnull");
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    @Test(expected = ConfigurationValidationException.class)
    public void testAssertNotNull_1() throws ConfigurationValidationException {
        assertNotNull("test", null);
    }

    @Test()
    public void testAssertNotEmpty_0() {
        try {
            assertNotEmpty("test", "notnull");
        } catch (Exception ex) {
            Assert.fail();
        }
        try {
            assertNotEmpty("test", null);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    @Test(expected = ConfigurationValidationException.class)
    public void testAssertNotEmpty_1() throws ConfigurationValidationException {
        assertNotEmpty("test", "");
    }

    @Test()
    public void testAssertNoSpace_0() {
        try {
            assertNoSpace("test", "nospace");
        } catch (Exception ex) {
            Assert.fail();
        }
        try {
            assertNoSpace("test", null);
        } catch (Exception ex) {
            Assert.fail();
        }
        try {
            assertNoSpace("test", "");
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    @Test(expected = ConfigurationValidationException.class)
    public void testAssertNoSpace_1() throws ConfigurationValidationException {
        assertNoSpace("test", "no space");
    }

    @Test()
    public void testAssertFileExists_0() {
        try {
            File tmp = File.createTempFile("tmp", "file");
            tmp.deleteOnExit();
            assertFileExists("test", tmp);
        } catch (Exception ex) {
            Assert.fail();
        }
        try {
            assertFileExists("test", null);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    @Test(expected = ConfigurationValidationException.class)
    public void testAssertFileExists_1() throws ConfigurationValidationException {
        assertFileExists("test", new File("/this/is/a/file/that/should/not/exist/" + new Date().toString()));
    }

    @Test(expected = ConfigurationValidationException.class)
    public void testAssertFileExists_2() throws IOException, ConfigurationValidationException {
        File file = File.createTempFile("tmp", "file");
        Assert.assertTrue(file.delete());
        Assert.assertTrue(file.mkdir());
        assertFileExists("test", file);
    }

    @Test()
    public void testAssertDirectoryExists_0() {
        try {
            File file = File.createTempFile("tmp", "file");
            file.deleteOnExit();
            Assert.assertTrue(file.delete());
            Assert.assertTrue(file.mkdir());
            assertDirectoryExists("test", file);
        } catch (Exception ex) {
            Assert.fail();
        }
        try {
            assertDirectoryExists("test", null);
        } catch (Exception ex) {
            Assert.fail();
        }
    }

    @Test(expected = ConfigurationValidationException.class)
    public void testAssertDirectoryExists_1() throws ConfigurationValidationException {
        assertDirectoryExists("test", new File("/this/is/a/file/that/should/not/exist/"));
    }

    @Test(expected = ConfigurationValidationException.class)
    public void testAssertDirectoryExists_2() throws IOException, ConfigurationValidationException {
        File tmp = File.createTempFile("tmp", "file");
        tmp.deleteOnExit();
        assertDirectoryExists("test", tmp);
    }
}
