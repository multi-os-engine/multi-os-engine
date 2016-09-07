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

package org.moe.natjgen.test.pointers;

import org.moe.natjgen.Constants;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

import org.moe.natjgen.test.UncertainMessages;

public class StructPointers extends AbstractPointersTest {

	@Override
	protected void setUp() throws Exception {
		setUp("moe_struct_t", "moe_struct_t", "Ptr<moe_struct_t>", "ConstPtr<moe_struct_t>");
	}

	@Override
	protected boolean baseTypeIsPrimitive() {
		return false;
	}

	@Override
	public void test_T_ptr_fn_ret() {
		MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_fn_ret");
		assertExistsAndGenerated(method);
		assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
		assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
		SingleMemberAnnotation uncert = assertHasSingleMemberAnnotation(method, Constants.UncertainReturnAnnotationFQ);
		assertEquals(UncertainMessages.REFERENCE__ARRAY__FALLBACK__REFERENCE, uncert.getValue().toString());

		assertEquals(javaT, method.getReturnType2().toString());
	}

	@Override
	public void test_const_T_ptr_fn_ret() {
		MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_fn_ret");
		assertExistsAndGenerated(method);
		assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
		assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
		SingleMemberAnnotation uncert = assertHasSingleMemberAnnotation(method, Constants.UncertainReturnAnnotationFQ);
		assertEquals(UncertainMessages.REFERENCE__ARRAY__FALLBACK__REFERENCE, uncert.getValue().toString());

		assertEquals(javaT, method.getReturnType2().toString());
	}

	@Override
	public void test_T_ptr_fn_arg() {
		MethodDeclaration method = getStaticMethod("" + nativeT + "_ptr_fn_arg");
		assertExistsAndGenerated(method);
		assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
		assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
		assertNumberOfArguments(method, 1);
		SingleVariableDeclaration arg = getArg(method, 0);
		SingleMemberAnnotation uncert = assertHasSingleMemberAnnotation(arg, Constants.UncertainArgumentAnnotationFQ);
		assertEquals(UncertainMessages.REFERENCE__ARRAY__FALLBACK__REFERENCE, uncert.getValue().toString());

		assertEquals(javaT, arg.getType().toString());
	}

	@Override
	public void test_const_T_ptr_fn_arg() {
		MethodDeclaration method = getStaticMethod("const_" + nativeT + "_ptr_fn_arg");
		assertExistsAndGenerated(method);
		assertHasAnnotation(method, Constants.CFunctionAnnotationFQ);
		assertHasNoAnnotation(method, Constants.ReferenceInfoAnnotationFQ);
		assertNumberOfArguments(method, 1);
		SingleVariableDeclaration arg = getArg(method, 0);
		SingleMemberAnnotation uncert = assertHasSingleMemberAnnotation(arg, Constants.UncertainArgumentAnnotationFQ);
		assertEquals(UncertainMessages.REFERENCE__ARRAY__FALLBACK__REFERENCE, uncert.getValue().toString());

		assertEquals(javaT, arg.getType().toString());
	}

}
