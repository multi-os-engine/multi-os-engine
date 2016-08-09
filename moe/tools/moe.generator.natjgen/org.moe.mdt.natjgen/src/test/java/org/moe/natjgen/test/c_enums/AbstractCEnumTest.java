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

public abstract class AbstractCEnumTest extends AbstractNatJGenTest {

	private final String name = getClass().getSimpleName();

	protected final String zero_name = "_" + "zero";
	protected final String one_name = "_" + "one";
	protected final String min_name = "_" + "min";
	protected final String max_name = "_" + "max";
	protected final String diff_name = "_" + "diff";

	@Override
	protected void setUp() throws Exception {
		setUpClass(null, "enums/" + name + ".java", name);
	}

	protected abstract String getType();

	protected abstract String getZeroValue();

	protected abstract String getOneValue();

	protected abstract String getMinValue();

	protected abstract String getMaxValue();

	protected String getZeroValue2() {
		return null;
	}

	protected String getOneValue2() {
		return null;
	}

	protected String getMinValue2() {
		return null;
	}

	protected String getMaxValue2() {
		return null;
	}

	protected String getNativeAnnotation() {
		return null;
	}

	public void test_zero() {
		assertField(zero_name, getZeroValue(), getZeroValue2());
	}

	public void test_one() {
		assertField(one_name, getOneValue(), getOneValue2());
	}

	public void test_min() {
		assertField(min_name, getMinValue(), getMinValue2());
	}

	public void test_max() {
		assertField(max_name, getMaxValue(), getMaxValue2());
	}

	public abstract void test_diff();

	protected FieldDeclaration assertField(String fld, String v1, String v2) {
		FieldDeclaration field = getField(fld);
		assertExistsAndGenerated(field);
		assertPrimitiveType(field.getType(), getType());
		if (getNativeAnnotation() != null && v2 != null) {
			assertHasMarkerAnnotation(field, getNativeAnnotation());
		}

		if (v2 == null) {
			assertInitialValue(field, v1);
		} else {
			assertInitialValue(field, v1, v2);
		}
		return field;
	}

}
