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

package org.moe.natjgen.test.base_types;

import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

import org.moe.natjgen.Constants;
import org.moe.natjgen.test.AbstractNatJGenTest;

public class BaseTypes extends AbstractNatJGenTest {

	@Override
	protected void setUp() throws Exception {
		setUpClass(null, "c/Globals.java", "Globals");
	}

	public void test_void_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_void_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");
		assertNumberOfArguments(method, 0);
	}

	public void test_char_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_char_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "byte");
		assertNumberOfArguments(method, 0);
	}

	public void test_char_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_char_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "byte");
	}

	public void test_unsigned_char_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_char_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "byte");
		assertNumberOfArguments(method, 0);
	}

	public void test_unsigned_char_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_char_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "byte");
	}

	public void test_signed_char_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_char_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "byte");
		assertNumberOfArguments(method, 0);
	}

	public void test_signed_char_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_char_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "byte");
	}

	public void test_short_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_short_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "short");
		assertNumberOfArguments(method, 0);
	}

	public void test_short_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_short_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "short");
	}

	public void test_unsigned_short_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_short_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "char");
		assertNumberOfArguments(method, 0);
	}

	public void test_unsigned_short_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_short_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "char");
	}

	public void test_signed_short_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_short_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "short");
		assertNumberOfArguments(method, 0);
	}

	public void test_signed_short_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_short_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "short");
	}

	public void test_int_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_int_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "int");
		assertNumberOfArguments(method, 0);
	}

	public void test_int_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_int_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "int");
	}

	public void test_unsigned_int_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_int_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "int");
		assertNumberOfArguments(method, 0);
	}

	public void test_unsigned_int_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_int_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "int");
	}

	public void test_signed_int_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_int_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "int");
		assertNumberOfArguments(method, 0);
	}

	public void test_signed_int_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_int_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "int");
	}

	public void test_long_long_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_long_long_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "long");
		assertNumberOfArguments(method, 0);
	}

	public void test_long_long_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_long_long_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "long");
	}

	public void test_unsigned_long_long_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_long_long_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "long");
		assertNumberOfArguments(method, 0);
	}

	public void test_unsigned_long_long_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_unsigned_long_long_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "long");
	}

	public void test_signed_long_long_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_long_long_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "long");
		assertNumberOfArguments(method, 0);
	}

	public void test_signed_long_long_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_signed_long_long_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "long");
	}

	public void test_float_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_float_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "float");
		assertNumberOfArguments(method, 0);
	}

	public void test_float_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_float_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "float");
	}

	public void test_double_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_double_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "double");
		assertNumberOfArguments(method, 0);
	}

	public void test_double_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_double_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "double");
	}

	public void test_nint_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_nint_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "long");
		assertNumberOfArguments(method, 0);
		assertHasMarkerAnnotation(method.modifiers(), Constants.NIntAnnotationFQ);
	}

	public void test_nint_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_nint_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "long");
		assertHasMarkerAnnotation(((SingleVariableDeclaration)method.parameters().get(0)).modifiers(),
				Constants.NIntAnnotationFQ);
	}

	public void test_nuint_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_nuint_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "long");
		assertNumberOfArguments(method, 0);
		assertHasMarkerAnnotation(method.modifiers(), Constants.NUIntAnnotationFQ);
	}

	public void test_nuint_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_nuint_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "long");
		assertHasMarkerAnnotation(((SingleVariableDeclaration)method.parameters().get(0)).modifiers(),
				Constants.NUIntAnnotationFQ);
	}

	public void test_nfloat_fn_ret() {
		MethodDeclaration method = getStaticMethod("basic_types_nfloat_fn_ret");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "double");
		assertNumberOfArguments(method, 0);
		assertHasMarkerAnnotation(method.modifiers(), Constants.NFloatAnnotationFQ);
	}

	public void test_nfloat_fn_arg() {
		MethodDeclaration method = getStaticMethod("basic_types_nfloat_fn_arg");
		assertExistsAndGenerated(method);
		assertPrimitiveType(method.getReturnType2(), "void");

		assertNumberOfArguments(method, 1);
		assertPrimitiveType(((SingleVariableDeclaration)method.parameters().get(0)).getType(), "double");
		assertHasMarkerAnnotation(((SingleVariableDeclaration)method.parameters().get(0)).modifiers(),
				Constants.NFloatAnnotationFQ);
	}

}
