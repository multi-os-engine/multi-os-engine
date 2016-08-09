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

import org.clang.struct.CXIdxDeclInfo;

public class ConstantValue {

	/**
	 * Value type
	 */
	final private Type type;

	/**
	 * Value
	 */
	final private long value;

	/**
	 * 32bit value flag
	 */
	private boolean hasValue32 = false;

	/**
	 * 32bit (secondary) value
	 * WARNING: this means the value on a 32 bit platform, NOT a 32bit value
	 */
	private long value32;

	public static ConstantValue fromRawValue(Type type, long value) {
		return new ConstantValue(type, value);
	}

	public static ConstantValue fromSignExtendedValue(Type type, long value) {
		return new ConstantValue(type, value & getMask(type));
	}

	/**
	 * Creates a new {@link ConstantValue} object
	 * 
	 * @param type
	 *            Value type
	 * @param value
	 *            Value
	 */
	private ConstantValue(Type type, long value) {
		if (type == null) {
			throw new NullPointerException();
		}
		if (!type.isPrimitive()) {
			throw new IllegalStateException();
		}
		this.type = type;
		if ((value & ~getMask(type)) != 0L) {
			throw new IllegalStateException("value does not fit into type " + type);
		}
		this.value = value;
	}

	/**
	 * Returns the value mask for the specified type
	 * 
	 * @param type
	 *            type
	 * @return value mask
	 */
	private static long getMask(Type type) {
		switch (type.getKind()) {
		case Type.Boolean:
			return 0x00000001L;
		case Type.Byte:
			return 0x000000FFL;
		case Type.Short:
			return 0x0000FFFFL;
		case Type.Char:
			return 0x0000FFFFL;
		case Type.Int:
			return 0xFFFFFFFFL;
		case Type.Long:
			return 0xFFFFFFFFFFFFFFFFL;
		case Type.Float:
			return 0xFFFFFFFFL;
		case Type.Double:
			return 0xFFFFFFFFFFFFFFFFL;

		default:
			throw new IllegalStateException();
		}
	}

	/**
	 * Returns the value's type.
	 * 
	 * @return Value's type
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Returns the value.
	 * 
	 * @return value
	 */
	public long getValue() {
		return value;
	}

	/**
	 * Tells whether the value is different with 32bit bindings. This scenario
	 * assumes the original value is defined from a 64bit environment.
	 * 
	 * @return true if the value is different, otherwise false
	 */
	public boolean hasDifferent32BitValue() {
		return hasValue32;
	}

	/**
	 * Tries to set a 32bit value
	 * 
	 * @param type32
	 *            32bit value type
	 * @param decl
	 *            declaration
	 */
	public void trySetValue32FromEnum(Type type32, CXIdxDeclInfo decl) throws GeneratorException {
		Type type = getType();
		if (!type.setDowngradable(type32)) {
			throw new GeneratorException("type downgrade failed");
		}

		long rawData = decl.cursor().getEnumConstantDeclValue();

		rawData = rawData & getMask(type32);
		if (type.getDowngradeAnnotation() == null) {
			value32 = rawData;

		} else if (Constants.NIntAnnotationFQ.equals(type.getDowngradeAnnotation())
				|| Constants.NUIntAnnotationFQ.equals(type.getDowngradeAnnotation())) {
			if ((rawData & 0xFFFFFFFF00000000L) != 0L) {
				throw new GeneratorException("high 4 bytes not zero");
			}
			value32 = rawData;

		} else {
			throw new IllegalStateException();
		}

		updateHasValue32();
	}

	/**
	 * Tries to set a 32bit value
	 * 
	 * @param type32
	 *            32bit value type
	 * @param decl
	 *            declaration
	 */
	public void trySetValue32(Type type32, long rawData) throws GeneratorException {
		Type type = getType();
		if (!type.setDowngradable(type32)) {
			throw new GeneratorException("type downgrade failed");
		}

		if (type.getDowngradeAnnotation() == null) {
			value32 = rawData;

		} else if (Constants.NIntAnnotationFQ.equals(type.getDowngradeAnnotation())
				|| Constants.NUIntAnnotationFQ.equals(type.getDowngradeAnnotation())
				|| Constants.NFloatAnnotationFQ.equals(type.getDowngradeAnnotation())) {
			if ((rawData & 0xFFFFFFFF00000000L) != 0L) {
				throw new GeneratorException("high 4 bytes not zero");
			}
			value32 = rawData;
		} else {
			throw new IllegalStateException();
		}

		updateHasValue32();
	}

	/**
	 * Updates the hasValue32 flag
	 * 
	 * @throws GeneratorException
	 */
	private final void updateHasValue32() throws GeneratorException {
		if (type.getDowngradeAnnotation() == null) {
			hasValue32 = value != value32;

		} else if (Constants.NIntAnnotationFQ.equals(type.getDowngradeAnnotation())) {
			if ((value32 & 0xFFFFFFFF00000000L) != 0L) {
				throw new GeneratorException("high 4 bytes not zero");
			}
			long lvalue = value;
			// Sign-extend
			long ivalue = (int)value32;
			hasValue32 = value != value32 && lvalue != ivalue;

		} else if (Constants.NUIntAnnotationFQ.equals(type.getDowngradeAnnotation())) {
			long lvalue = value;
			// Zero-extend
			long ivalue = (int)value32 & 0x00000000FFFFFFFFL;
			hasValue32 = lvalue != ivalue;

		} else if (Constants.NFloatAnnotationFQ.equals(type.getDowngradeAnnotation())) {
			hasValue32 = true;

		} else {
			throw new IllegalStateException();
		}
	}

	/**
	 * Returns the 32bit value.
	 * 
	 * @return 32bit value
	 */
	public long getValue32() {
		return value32;
	}
}
