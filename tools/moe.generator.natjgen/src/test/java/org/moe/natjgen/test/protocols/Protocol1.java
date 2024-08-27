package org.moe.natjgen.test.protocols;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class Protocol1 extends AbstractProtocolTest {

    public void test_method_type_resolve() {
        TypeDeclaration decl = getClassDecl();
        assertEquals("Protocol1", decl.getName().getIdentifier());

        MethodDeclaration[] methods = decl.getMethods();
        assertEquals(2, methods.length);
        assertHasMarkerAnnotation(methods[0], "org.jetbrains.annotations.Nullable");

        assertEquals("prop_1", methods[0].getName().toString());
        assertEquals("TypeProtocol1", methods[0].getReturnType2().toString());
        assertEquals(0, methods[0].parameters().size());

        assertEquals("setProp_1", methods[1].getName().toString());
        assertEquals("void", methods[1].getReturnType2().toString());
        assertEquals(1, methods[1].parameters().size());
        assertHasMarkerAnnotation(((SingleVariableDeclaration)methods[1].parameters().get(0)), "org.jetbrains.annotations.Nullable");
        assertEquals("TypeProtocol1", ((SingleVariableDeclaration)methods[1].parameters().get(0)).getType().toString());
    }

}
