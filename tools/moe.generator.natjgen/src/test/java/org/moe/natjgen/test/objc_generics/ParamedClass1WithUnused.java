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

package org.moe.natjgen.test.objc_generics;

import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.moe.natjgen.test.AbstractObjCClassTest;

public class ParamedClass1WithUnused extends AbstractObjCClassTest {
    public void test_class_with_templates() {
        TypeDeclaration decl = getClassDecl();
        assertEquals("ParamedClass1WithUnused", decl.getName().getIdentifier());
        assertEquals(1, decl.typeParameters().size());
        assertEquals("_T", ((TypeParameter)decl.typeParameters().get(0)).getName().getIdentifier());
    }

    public void test_superclass_with_templates() {
        TypeDeclaration decl = getClassDecl();

        assertTrue(decl.getSuperclassType().isSimpleType());
        SimpleType superClass = (SimpleType)decl.getSuperclassType();

        assertEquals("NSObject", superClass.getName().getFullyQualifiedName());
    }
}
