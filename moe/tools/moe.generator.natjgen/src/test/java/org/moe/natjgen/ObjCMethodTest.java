package org.moe.natjgen;

import junit.framework.TestCase;

public class ObjCMethodTest extends TestCase {

    public void testClangFirstWord() {
        assertEquals("i", ObjCMethod.clangFirstWord("i", 0));

        assertEquals("init", ObjCMethod.clangFirstWord("init", 0));
        assertEquals("init", ObjCMethod.clangFirstWord("initWithString", 0));

        assertEquals("opy", ObjCMethod.clangFirstWord("mutableCopyWithSomething", "mutableC".length()));
        assertEquals("opywith", ObjCMethod.clangFirstWord("mutableCopywithSomething", "mutableC".length()));
    }

    public void testClangFirstWordStartWithUpperCase() {
        assertEquals("Visible", ObjCMethod.clangFirstWord("VisibleDropDown", 0));
        assertEquals("Drop", ObjCMethod.clangFirstWord("VisibleDropDown", "Visible".length()));
        assertEquals("I", ObjCMethod.clangFirstWord("IVisibleDropDown", 0));
    }
}
