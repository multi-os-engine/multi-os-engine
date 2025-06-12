package org.moe.natjgen.test.protocols;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class ContextProtocol extends AbstractProtocolTest {

    public void test_id_protocol_in_callback() {
        TypeDeclaration classDecl = getClassDecl();
        TypeDeclaration innerTypeDecl = (TypeDeclaration) classDecl.bodyDeclarations().get(1);
        MethodDeclaration method = innerTypeDecl.getMethods()[0];
        SingleVariableDeclaration param = (SingleVariableDeclaration) method.parameters().get(0);
        SimpleType paramType = (SimpleType) param.getType();
        assertEquals("ContextProtocol", paramType.getName().getFullyQualifiedName());
    }
}
