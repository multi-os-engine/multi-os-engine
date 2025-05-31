package org.moe.natjgen.test;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class ObjCClassTest extends AbstractNatJGenTest {

    @Override
    protected void setUp() throws Exception {
        setUpClass(null, "TestClass.java", "TestClass");
    }

    public void testClassTypeParameter() {
        TypeDeclaration decl = getClassDecl();
        assertEquals("TestClass", decl.getName().getIdentifier());
        MethodDeclaration method = decl.getMethods()[2];
        assertEquals("canLoadObjectOfClass", method.getName().getIdentifier());
        assertEquals("Class", ((SingleVariableDeclaration)method.parameters().get(0)).getType().toString());
    }
}
