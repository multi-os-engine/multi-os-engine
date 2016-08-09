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

package org.moe.natjgen.test.c_enums;

import org.moe.natjgen.test.AbstractNatJGenTest;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.PrimitiveType;

public class UShortEnum extends AbstractCEnumTest {

	@Override
	protected void optionalIgnore() {
		AbstractNatJGenTest.assumeHasControlMethod_HasSizedEnums();
	}

	@Override
	protected String getType() {
		return "char";
	}

	@Override
	protected String getZeroValue() {
		return "0x0000";
	}

	@Override
	protected String getOneValue() {
		return "0x0001";
	}

	@Override
	protected String getMinValue() {
		return "0x0000";
	}

	@Override
	protected String getMaxValue() {
		return "0xFFFF";
	}

	@Override
	public void test_diff() {
		FieldDeclaration field = getField(diff_name);
		AbstractNatJGenTest.assertExistsAndGenerated(field);
		AbstractNatJGenTest.assertPrimitiveType(field.getType(), getType());

		AbstractNatJGenTest.assertInitialValue(field, PrimitiveType.CHAR, "0x5555", null, "0xAAAA", null);
	}

}
