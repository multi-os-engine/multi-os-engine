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

package org.moe.natjgen.test.c_enums;

import org.eclipse.jdt.core.dom.FieldDeclaration;

public class IntEnum extends AbstractCEnumTest {

    @Override
    protected String getType() {
        return "int";
    }

    @Override
    protected String getZeroValue() {
        return "0x00000000";
    }

    @Override
    protected String getOneValue() {
        return "0x00000001";
    }

    @Override
    protected String getMinValue() {
        return "0x80000000";
    }

    @Override
    protected String getMaxValue() {
        return "0x7FFFFFFF";
    }

    @Override
    public void test_diff() {
        FieldDeclaration field = getField(diff_name);
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), getType());

        assertInitialValue(field, null, "0x55555555", null, "0xAAAAAAAA", null);
    }

}
