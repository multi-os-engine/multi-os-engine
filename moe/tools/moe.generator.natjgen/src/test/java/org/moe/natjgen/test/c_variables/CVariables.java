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

package org.moe.natjgen.test.c_variables;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.moe.natjgen.Constants;
import org.moe.natjgen.test.AbstractNatJGenTest;

public class CVariables extends AbstractNatJGenTest {

    @Override
    protected void setUp() throws Exception {
        setUpClass(null, "c/Globals.java", "Globals");
    }

    public void test_cvar_int8_max() {
        FieldDeclaration field = getField("cvar_int8_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "byte");

        assertInitialValue(field, "-1");
    }

    public void test_cvar_uint8_max() {
        FieldDeclaration field = getField("cvar_uint8_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "byte");

        assertInitialValue(field, "-1");
    }

    public void test_cvar_int16_max() {
        FieldDeclaration field = getField("cvar_int16_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "short");

        assertInitialValue(field, "-1");
    }

    public void test_cvar_uint16_max() {
        FieldDeclaration field = getField("cvar_uint16_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "char");

        assertInitialValue(field, "0xFFFF");
    }

    public void test_cvar_int32_zero() {
        FieldDeclaration field = getField("cvar_int32_zero");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "int");

        assertInitialValue(field, "0x00000000");
    }

    public void test_cvar_int32_poz_one() {
        FieldDeclaration field = getField("cvar_int32_poz_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "int");

        assertInitialValue(field, "0x00000001");
    }

    public void test_cvar_int32_neg_one() {
        FieldDeclaration field = getField("cvar_int32_neg_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "int");

        assertInitialValue(field, "0xFFFFFFFF");
    }

    public void test_cvar_uint32_zero() {
        FieldDeclaration field = getField("cvar_uint32_zero");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "int");

        assertInitialValue(field, "0x00000000");
    }

    public void test_cvar_uint32_poz_one() {
        FieldDeclaration field = getField("cvar_uint32_poz_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "int");

        assertInitialValue(field, "0x00000001");
    }

    public void test_cvar_uint32_poz_max() {
        FieldDeclaration field = getField("cvar_uint32_poz_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "int");

        assertInitialValue(field, "0xFFFFFFFF");
    }

    public void test_cvar_int64_zero() {
        FieldDeclaration field = getField("cvar_int64_zero");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");

        assertInitialValue(field, "0x0000000000000000L");
    }

    public void test_cvar_int64_poz_one() {
        FieldDeclaration field = getField("cvar_int64_poz_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");

        assertInitialValue(field, "0x0000000000000001L");
    }

    public void test_cvar_int64_neg_one() {
        FieldDeclaration field = getField("cvar_int64_neg_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");

        assertInitialValue(field, "0xFFFFFFFFFFFFFFFFL");
    }

    public void test_cvar_uint64_zero() {
        FieldDeclaration field = getField("cvar_uint64_zero");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");

        assertInitialValue(field, "0x0000000000000000L");
    }

    public void test_cvar_uint64_poz_one() {
        FieldDeclaration field = getField("cvar_uint64_poz_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");

        assertInitialValue(field, "0x0000000000000001L");
    }

    public void test_cvar_uint64_poz_max() {
        FieldDeclaration field = getField("cvar_uint64_poz_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");

        assertInitialValue(field, "0xFFFFFFFFFFFFFFFFL");
    }

    public void test_cvar_nint_zero() {
        FieldDeclaration field = getField("cvar_nint_zero");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NIntAnnotationFQ);

        assertInitialValue(field, "0x0000000000000000L");
    }

    public void test_cvar_nint_poz_one() {
        FieldDeclaration field = getField("cvar_nint_poz_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NIntAnnotationFQ);

        assertInitialValue(field, "0x0000000000000001L");
    }

    public void test_cvar_nint_neg_one() {
        FieldDeclaration field = getField("cvar_nint_neg_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NIntAnnotationFQ);

        assertInitialValue(field, "0xFFFFFFFFFFFFFFFFL");
    }

    public void test_cvar_nuint_zero() {
        FieldDeclaration field = getField("cvar_nuint_zero");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NUIntAnnotationFQ);

        assertInitialValue(field, "0x0000000000000000L");
    }

    public void test_cvar_nuint_poz_one() {
        FieldDeclaration field = getField("cvar_nuint_poz_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NUIntAnnotationFQ);

        assertInitialValue(field, "0x0000000000000001L");
    }

    public void test_cvar_nuint_poz_max() {
        FieldDeclaration field = getField("cvar_nuint_poz_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NUIntAnnotationFQ);

        assertInitialValue(field, "0xFFFFFFFFFFFFFFFFL", "0x00000000FFFFFFFFL");
    }

    public void test_cvar_nfloat_zero() {
        FieldDeclaration field = getField("cvar_nfloat_zero");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");
        assertHasMarkerAnnotation(field, Constants.NFloatAnnotationFQ);

        assertInitialValue(field, "0x0000000000000000L", "0x00000000", PrimitiveType.FLOAT);
    }

    public void test_cvar_nfloat_poz_one() {
        FieldDeclaration field = getField("cvar_nfloat_poz_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");
        assertHasMarkerAnnotation(field, Constants.NFloatAnnotationFQ);

        assertInitialValue(field, "0x3FF0000000000000L", "0x3F800000", PrimitiveType.FLOAT);
    }

    public void test_cvar_nfloat_neg_one() {
        FieldDeclaration field = getField("cvar_nfloat_neg_one");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");
        assertHasMarkerAnnotation(field, Constants.NFloatAnnotationFQ);

        assertInitialValue(field, "0xBFF0000000000000L", "0xBF800000", PrimitiveType.FLOAT);
    }

    public void test_cvar_long_max() {
        FieldDeclaration field = getField("cvar_long_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NIntAnnotationFQ);

        assertInitialValue(field, "0x7FFFFFFFFFFFFFFFL", "0x000000007FFFFFFFL");
    }

    public void test_cvar_ulong_max() {
        FieldDeclaration field = getField("cvar_ulong_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NUIntAnnotationFQ);

        assertInitialValue(field, "0xFFFFFFFFFFFFFFFFL", "0x00000000FFFFFFFFL");
    }

    public void test_cvar_nint_max() {
        FieldDeclaration field = getField("cvar_nint_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NIntAnnotationFQ);

        assertInitialValue(field, "0x7FFFFFFFFFFFFFFFL", "0x000000007FFFFFFFL");
    }

    public void test_cvar_nuint_max() {
        FieldDeclaration field = getField("cvar_nuint_max");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NUIntAnnotationFQ);

        assertInitialValue(field, "0xFFFFFFFFFFFFFFFFL", "0x00000000FFFFFFFFL");
    }

    public void test_cvar_nint_signbit() {
        FieldDeclaration field = getField("cvar_nint_signbit");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NIntAnnotationFQ);

        assertInitialValue(field, "0x0000000080000000L");
    }

    public void test_cvar_nuint_signbit() {
        FieldDeclaration field = getField("cvar_nuint_signbit");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NUIntAnnotationFQ);

        assertInitialValue(field, "0x0000000080000000L");
    }

    public void test_cvar_int8_diff() {
        FieldDeclaration field = getField("cvar_int8_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "byte");

        assertInitialValue(field, PrimitiveType.BYTE, "-2", null, "18", null);
    }

    public void test_cvar_uint8_diff() {
        FieldDeclaration field = getField("cvar_uint8_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "byte");

        assertInitialValue(field, PrimitiveType.BYTE, "-2", null, "18", null);
    }

    public void test_cvar_int16_diff() {
        FieldDeclaration field = getField("cvar_int16_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "short");

        assertInitialValue(field, PrimitiveType.SHORT, "-292", null, "4660", null);
    }

    public void test_cvar_uint16_diff() {
        FieldDeclaration field = getField("cvar_uint16_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "char");

        assertInitialValue(field, PrimitiveType.CHAR, "0xFEDC", null, "0x1234", null);
    }

    public void test_cvar_nint_diff() {
        FieldDeclaration field = getField("cvar_nint_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NIntAnnotationFQ);

        assertInitialValue(field, "0x123456789ABCDEF0L", "0x0000000012345678L");
    }

    public void test_cvar_nuint_diff() {
        FieldDeclaration field = getField("cvar_nuint_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");
        assertHasMarkerAnnotation(field, Constants.NUIntAnnotationFQ);

        assertInitialValue(field, "0xFEDCBA9876543210L", "0x00000000FEDCBA98L");
    }

    public void test_cvar_nfloat_diff() {
        FieldDeclaration field = getField("cvar_nfloat_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");
        assertHasMarkerAnnotation(field, Constants.NFloatAnnotationFQ);

        assertInitialValue(field, "0x4A02A05EE28AF686L", "0x7F7FFFFD", PrimitiveType.FLOAT);
    }

    public void test_cvar_int64_diff() {
        FieldDeclaration field = getField("cvar_int64_diff");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "long");

        assertInitialValue(field, "0x0000000000000001L", "0x0000000000000000L");
    }

}
