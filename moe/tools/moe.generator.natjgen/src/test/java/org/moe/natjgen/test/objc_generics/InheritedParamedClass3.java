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

import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;

import org.moe.natjgen.test.AbstractObjCClassTest;

public class InheritedParamedClass3 extends AbstractObjCClassTest {
	public void test_class_with_templates() {
		TypeDeclaration decl = getClassDecl();
		assertEquals("InheritedParamedClass3", decl.getName().getIdentifier());
		assertEquals(2, decl.typeParameters().size());
		assertEquals("_T", ((TypeParameter)decl.typeParameters().get(0)).getName().getIdentifier());
		assertEquals("_Y", ((TypeParameter)decl.typeParameters().get(1)).getName().getIdentifier());
	}

	public void test_superclass_with_templates() {
		TypeDeclaration decl = getClassDecl();

		assertTrue(decl.getSuperclassType().isParameterizedType());
		ParameterizedType superClass = (ParameterizedType)decl.getSuperclassType();

		assertTrue(superClass.getType().isSimpleType());
		SimpleType superClassBase = (SimpleType)superClass.getType();

		assertEquals("ParamedClass1", superClassBase.getName().getFullyQualifiedName());
		assertEquals(1, superClass.typeArguments().size());

		Type tmp = (Type)superClass.typeArguments().get(0);
		assertTrue(tmp.isSimpleType());
		assertEquals("_T", ((SimpleType)tmp).getName().getFullyQualifiedName());
	}
}
