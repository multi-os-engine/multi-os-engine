package org.moe.natjgen;

import junit.framework.TestCase;

public class ObjCMethodTest extends TestCase {

    public void testClangFirstWord() {
        assertEquals("init", ObjCMethod.clangFirstWord("init", 0));
        assertEquals("init", ObjCMethod.clangFirstWord("initWithString", 0));

        assertEquals("opy", ObjCMethod.clangFirstWord("mutableCopyWithSomething", "mutableC".length()));
        assertEquals("opywith", ObjCMethod.clangFirstWord("mutableCopywithSomething", "mutableC".length()));
    }
}
