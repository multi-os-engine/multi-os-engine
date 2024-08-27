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

import com.google.gson.JsonObject;
import junit.framework.TestCase;

import static org.moe.tools.natjgen.FrameworkBinding.*;

public class FrameworkBindingTest extends TestCase {

    public void testValidation() throws ValidationException {
        final FrameworkBinding binding = new FrameworkBinding();
        _validate(binding, ERR_FRAMEWORK_PATH_IS_NOT_SET);

        binding.setFrameworkPath("");
        _validate(binding, ERR_FRAMEWORK_PATH_IS_NOT_SET);

        binding.setFrameworkPath("test");
        _validate(binding, ERR_FRAMEWORK_PATH_IS_NOT_FRAMEWORK_DIRECTORY);

        binding.setFrameworkPath("a\\test.framework");
        _validate(binding, ERR_FRAMEWORK_PATH_MUST_USE_UNIX_FILE_SEPARATORS);

        binding.setFrameworkPath("a/test.framework");
        _validate(binding, ERR_PACKAGE_BASE_IS_NOT_SET);

        binding.setPackageBase("");
        _validate(binding, ERR_PACKAGE_BASE_IS_NOT_SET);

        binding.setPackageBase("a..b");
        _validate(binding, ERR_PACKAGE_BASE_IS_NOT_A_VALID_JAVA_PACKAGE);

        binding.setPackageBase("a.b");
        _validate(binding, ERR_IMPORT_CODE_IS_NOT_SET);

        binding.setImportCode("");
        _validate(binding, ERR_IMPORT_CODE_IS_NOT_SET);

        binding.setImportCode("#import <>");
        binding.validate();
    }

    public void testJson() {
        final FrameworkBinding source = new FrameworkBinding();
        source.setName("a");
        source.setFrameworkPath("b");
        source.setPackageBase("c");
        source.setImportCode("d");

        final JsonObject json = source.getJsonObject();
        assertNotNull(json);

        final FrameworkBinding target = new FrameworkBinding();
        target.setJsonObject(json);

        assertEquals("a", target.getName());
        assertEquals("b", target.getFrameworkPath());
        assertEquals("c", target.getPackageBase());
        assertEquals("d", target.getImportCode());
    }

    private void _validate(FrameworkBinding binding, String expectedExceptionMsg) {
        assertNotNull(expectedExceptionMsg);
        try {
            binding.validate();
            fail("expected exception");
        } catch (ValidationException ex) {
            assertEquals(expectedExceptionMsg, ex.getMessage());
        }
    }
}
