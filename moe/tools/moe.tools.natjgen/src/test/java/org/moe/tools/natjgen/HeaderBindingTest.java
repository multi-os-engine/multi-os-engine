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

import static org.moe.tools.natjgen.HeaderBinding.*;

public class HeaderBindingTest extends TestCase {

    public void testValidation() throws ValidationException {
        final HeaderBinding binding = new HeaderBinding();
        _validate(binding, ERR_HEADER_PATH_IS_NOT_SET);

        binding.setHeaderPath("");
        _validate(binding, ERR_HEADER_PATH_IS_NOT_SET);

        binding.setHeaderPath("a\\test");
        _validate(binding, ERR_HEADER_PATH_MUST_USE_UNIX_FILE_SEPARATORS);

        binding.setHeaderPath("a/test");
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

        binding.getHeaderSearchPaths().add(null);
        _validate(binding, ERR_PATH_VALUE_MUST_NOT_BE_NULL);

        binding.getHeaderSearchPaths().set(0, "a\\b");
        _validate(binding, ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS);

        binding.getHeaderSearchPaths().set(0, "a");
        binding.validate();

        binding.getUserHeaderSearchPaths().add(null);
        _validate(binding, ERR_PATH_VALUE_MUST_NOT_BE_NULL);

        binding.getUserHeaderSearchPaths().set(0, "a\\b");
        _validate(binding, ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS);

        binding.getUserHeaderSearchPaths().set(0, "a");
        binding.validate();

        binding.getFrameworkSearchPaths().add(null);
        _validate(binding, ERR_PATH_VALUE_MUST_NOT_BE_NULL);

        binding.getFrameworkSearchPaths().set(0, "a\\b");
        _validate(binding, ERR_PATH_MUST_USE_UNIX_FILE_SEPARATORS);

        binding.getFrameworkSearchPaths().set(0, "a");
        binding.validate();
    }

    public void testJson() {
        final HeaderBinding source = new HeaderBinding();
        source.setName("a");
        source.setHeaderPath("b");
        source.getHeaderSearchPaths().add("x");
        source.getUserHeaderSearchPaths().add("y1");
        source.getUserHeaderSearchPaths().add("y2");
        source.getFrameworkSearchPaths().add("z");
        source.getFrameworkSearchPaths().add(null);
        source.setPackageBase("c");
        source.setImportCode("d");

        final JsonObject json = source.getJsonObject();
        assertNotNull(json);

        final HeaderBinding target = new HeaderBinding();
        target.setJsonObject(json);

        assertEquals("a", target.getName());
        assertEquals("b", target.getHeaderPath());
        assertEquals(1, target.getHeaderSearchPaths().size());
        assertEquals("x", target.getHeaderSearchPaths().get(0));
        assertEquals(2, target.getUserHeaderSearchPaths().size());
        assertEquals("y1", target.getUserHeaderSearchPaths().get(0));
        assertEquals("y2", target.getUserHeaderSearchPaths().get(1));
        // Note: expect invalid null values to be removed
        assertEquals(1, target.getFrameworkSearchPaths().size());
        assertEquals("z", target.getFrameworkSearchPaths().get(0));
        assertEquals("c", target.getPackageBase());
        assertEquals("d", target.getImportCode());
    }

    private void _validate(HeaderBinding binding, String expectedExceptionMsg) {
        assertNotNull(expectedExceptionMsg);
        try {
            binding.validate();
            fail("expected exception");
        } catch (ValidationException ex) {
            assertEquals(expectedExceptionMsg, ex.getMessage());
        }
    }
}
