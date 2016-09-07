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

package org.moe.natjgen;

import org.apache.commons.lang3.StringEscapeUtils;

/**
 * Class representing an enum constant
 */
public final class CEnumConstant extends AbstractModelElement implements ICallable {

	/**
	 * Long value of the constant
	 */
	private final ConstantValue value;

	/**
	 * Indicated whether the function binding code should be generated or not
	 */
	private boolean dontGenerate = false;

	/**
	 * Create a constant
	 * 
	 * @param name
	 *            name of the constant
	 * @param value
	 *            long value of the constant
	 */
	public CEnumConstant(String name, ConstantValue value) {
		super(name, true);

		// Check values
		if (value == null) throw new RuntimeException("Value cannot be null!");

		// Set value
		this.value = value;
	}

	/**
	 * Returns the type of the constant
	 * 
	 * @return type
	 */
	public Type getType() {
		return value.getType();
	}

	/**
	 * Returns the long value of the constant
	 * 
	 * @return value
	 */
	public ConstantValue getValue() {
		return value;
	}

	@Override
	public String getJavaName() {
		return getName();
	}

	@Override
	public String getDefaultRuntime() {
		return Constants.CRuntimeFQ;
	}

	public boolean getDontGenerate() {
		return dontGenerate;
	}

	public void setDontGenerate() {
		this.dontGenerate = true;
	}

	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("<constant name=\"");
		b.append(StringEscapeUtils.escapeXml(getName()));
		b.append("\"");

		b.append(" value=\"");
		b.append(Long.toHexString(value.getValue()));
		b.append("\"");

		if (value.hasDifferent32BitValue()) {
			b.append(" value32=\"");
			b.append(Long.toHexString(value.getValue32()));
			b.append("\"");
		}

		b.append(" />");

		return b.toString();
	}
}
