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
import org.moe.natjgen.test.AbstractNatJGenTest;

public class LongLongEnum extends AbstractCEnumTest {

    @Override
    protected String getType() {
        return "long";
    }

    @Override
    protected String getZeroValue() {
        return "0x0000000000000000L";
    }

    @Override
    protected String getOneValue() {
        return "0x0000000000000001L";
    }

    @Override
    protected String getMinValue() {
        return "0x8000000000000000L";
    }

    @Override
    protected String getMaxValue() {
        return "0x7FFFFFFFFFFFFFFFL";
    }

    @Override
    public void test_diff() {
        FieldDeclaration field = getField(diff_name);
        AbstractNatJGenTest.assertExistsAndGenerated(field);
        AbstractNatJGenTest.assertPrimitiveType(field.getType(), getType());

        AbstractNatJGenTest.assertInitialValue(field, null, "0x5555555555555555L", null, "0xAAAAAAAAAAAAAAAAL", null);
    }

}
