package org.moe.natjgen.test.macros;

import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.moe.natjgen.test.AbstractNatJGenTest;

public class MacrosTest extends AbstractNatJGenTest {

    @Override
    protected void setUp() throws Exception {
        setUpClass(null, "c/Globals.java", "Globals");
    }

    public void test_unsigned_int() {
        FieldDeclaration field = getField("UNSIGNED_INT");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");

        assertInitialValue(field, "10.0");
    }

    public void test_signed_int() {
        FieldDeclaration field = getField("SIGNED_INT");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");

        assertInitialValue(field, "-10.0");
    }

    public void test_unsigned_double() {
        FieldDeclaration field = getField("UNSIGNED_DOUBLE");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");

        assertInitialValue(field, "10.5");
    }

    public void test_signed_double() {
        FieldDeclaration field = getField("SIGNED_DOUBLE");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");

        assertInitialValue(field, "-10.5");
    }

    public void test_unsigned_hex_int() {
        FieldDeclaration field = getField("UNSIGNED_HEX_INT");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");

        assertInitialValue(field, "91.0");
    }

    public void test_signed_hex_int() {
        FieldDeclaration field = getField("SIGNED_HEX_INT");
        assertExistsAndGenerated(field);
        assertPrimitiveType(field.getType(), "double");

        assertInitialValue(field, "-91.0");
    }

    public void test_keyword_skip() {
        FieldDeclaration field = getField("boolean");
        assertNull(field);
    }
}
