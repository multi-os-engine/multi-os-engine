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

import java.util.ArrayList;

/**
 * Class representing a struct field
 */
public class CStructField extends AbstractModelElement {

	/**
	 * Type of the field
	 */
	private final Type type;

	/**
	 * Raw type of the field
	 */
	private final Type rawType;

	/**
	 * Count of the constant field
	 */
	private int constantArraySize = 1;

	/**
	 * Count of the constant field
	 */
	private final boolean isBitField;

	/**
	 * Create a new field
	 * 
	 * @param name
	 *            name of the field
	 * @param type
	 *            type of the field
	 */
	public CStructField(String name, Type type, boolean isBitField) {
		super(name, true);

		// Check values
		if (type == null) throw new RuntimeException("Value 'type' cannot be null!");

		// Set value
		if (JavaRestrictions.isReserved(name)) {
			setName("_" + name);
		}

		this.rawType = type;
		while (type.getKind() == Type.ConstantArray) {
			constantArraySize *= type.getArraySize();
			type = type.getInnerType();
		}
		this.type = type;
		this.isBitField = isBitField;
	}

	/**
	 * Returns the type of the field
	 * 
	 * @return type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Returns the getter name of the field
	 * 
	 * @return getter name
	 */
	public String getGetterName() {
		return getName();
	}

	/**
	 * Returns the setter name of the field
	 * 
	 * @return setter name
	 */
	public String getSetterName() {
		return "set" + getName().substring(0, 1).toUpperCase() + getName().substring(1);
	}

	/**
	 * Returns the isNull checker name of the field
	 * 
	 * @return isNull checker name
	 */
	public String getNullCheckerName() {
		return "isNull" + getName().substring(0, 1).toUpperCase() + getName().substring(1);
	}

	/**
	 * Returns the multi count of the type
	 * 
	 * @return multi count
	 */
	public int getConstantArraySize() {
		return constantArraySize;
	}

	/**
	 * Returns the raw type of the field
	 * 
	 * @return raw type
	 */
	public Type getRawType() {
		return rawType;
	}

	private class SetterCallee implements IParameterizedCallable {

		ArrayList<CalleeArgument> args = new ArrayList<CalleeArgument>(1);

		public SetterCallee() {
			args.add(new CalleeArgument("value", CStructField.this.getType()));
			if (CStructField.this.getConstantArraySize() > 1) {
				args.add(new CalleeArgument("field_idx", new Type(Type.INT_SIZE)));
			}
		}

		@Override
		public String getJavaName() {
			return CStructField.this.getGetterName();
		}

		@Override
		public Type getType() {
			return CStructField.this.getType();
		}

		@Override
		public String getDefaultRuntime() {
			return Constants.CRuntimeFQ;
		}

		@Override
		public ArrayList<CalleeArgument> getArguments() {
			return args;
		}

		@Override
		public boolean isVariadic() {
			throw new IllegalStateException();
		}

		@Override
		public String getVariadicName() {
			throw new IllegalStateException();
		}
	}

	public IParameterizedCallable getSetter() {
		return new SetterCallee();
	}

	public boolean isBitField() {
		return isBitField;
	}
}
