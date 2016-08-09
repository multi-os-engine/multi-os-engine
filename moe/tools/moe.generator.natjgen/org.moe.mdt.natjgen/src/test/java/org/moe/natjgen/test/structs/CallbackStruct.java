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

package org.moe.natjgen.test.structs;

import org.moe.natjgen.Constants;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import org.moe.natjgen.test.helpers.ClassVal;

public class CallbackStruct extends AbstractStructTest {

	public void test_getter_f1() {
		MethodDeclaration method = getMethod("f1");
		assertExistsAndGenerated(method);

		assertSimpleType(method.getReturnType2(), "Function_f1");

		assertNumberOfArguments(method, 0);

		NormalAnnotation sfa = assertHasNormalAnnotation(method, Constants.StructureFieldAnnotationFQ);
		assertNormalAnnotationHasValue(sfa, "isGetter", true);
		NormalAnnotation fpa = assertHasNormalAnnotation(method, Constants.FunctionPtrAnnotationFQ);
		assertNormalAnnotationHasValue(fpa, "name", "call_f1");
	}

	public void test_setter_f1() {
		MethodDeclaration method = getMethod("setF1");
		assertExistsAndGenerated(method);

		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		SingleVariableDeclaration var = (SingleVariableDeclaration)method.parameters().get(0);
		assertSimpleType(var.getType(), "Function_f1");

		NormalAnnotation sfa = assertHasNormalAnnotation(method, Constants.StructureFieldAnnotationFQ);
		assertNormalAnnotationHasValue(sfa, "isGetter", false);
		NormalAnnotation fpa = assertHasNormalAnnotation(var, Constants.FunctionPtrAnnotationFQ);
		assertNormalAnnotationHasValue(fpa, "name", "call_f1");
	}

	public void test_callback_interface() {
		TypeDeclaration inner = getInnerClass("Function_f1");
		assertExistsAndGenerated(inner);
		assertHasModifier(inner, Modifier.PUBLIC);
		assertIsInterface(inner);

		SingleMemberAnnotation ra = assertHasSingleMemberAnnotation(inner, Constants.RuntimeAnnotationFQ);
		assertSingleMemberAnnotationHasValue(ra, new ClassVal(Constants.CRuntime));

		MethodDeclaration method = getMethod(inner, "call_f1");
		assertExistsAndGenerated(method);

		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 2);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "int");
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(1)).getType(), "int");
	}

}
