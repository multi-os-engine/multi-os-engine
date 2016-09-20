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
import java.util.HashMap;

import org.clang.c.clang;
import org.clang.enums.CXCursorKind;
import org.clang.enums.CXTypeKind;
import org.clang.struct.CXCursor;
import org.clang.struct.CXType;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.PrimitiveType.Code;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Type {

	/**
	 * Logger for this class
	 */
	private static final Logger LOG = LoggerFactory.getLogger(Type.class);

	public static final int BYTE_SIZE = 1;
	public static final int SHORT_SIZE = 2;
	public static final int INT_SIZE = 4;
	public static final int LONG_SIZE = 8;

	/**
	 * Unrecognized kind
	 */
	public static final int Unrecognized = 0x0000;

	/**
	 * Void kind
	 */
	public static final int Void = 0x0001;

	/**
	 * Boolean kind
	 */
	public static final int Boolean = 0x0010;

	/**
	 * First primitive kind : Boolean
	 */
	public static final int FirstPrimitiveKind = Boolean;

	/**
	 * Byte kind
	 */
	public static final int Byte = 0x0011;

	/**
	 * Char kind
	 */
	public static final int Char = 0x0012;

	/**
	 * Short kind
	 */
	public static final int Short = 0x0013;

	/**
	 * Int kind
	 */
	public static final int Int = 0x0014;

	/**
	 * Long kind
	 */
	public static final int Long = 0x0015;

	/**
	 * Float kind
	 */
	public static final int Float = 0x0016;

	/**
	 * Double kind
	 */
	public static final int Double = 0x0017;

	/**
	 * Last primitive kind : Double
	 */
	public static final int LastPrimitiveKind = Double;

	/**
	 * Struct kind
	 */
	public static final int Struct = 0x0020;

	/**
	 * Pointer kind
	 */
	public static final int Pointer = 0x0021;

	/**
	 * FunctionProto kind
	 */
	public static final int FunctionProto = 0x0022;

	/**
	 * ConstantArray kind
	 */
	public static final int ConstantArray = 0x0023;

	/**
	 * IncompleteArray kind
	 */
	public static final int IncompleteArray = 0x0024;

	/**
	 * OpaquePtr kind
	 */
	public static final int OpaquePtr = 0x0025;

	/**
	 * Objective-C Object kind
	 */
	public static final int ObjCObject = 0x0030;

	/**
	 * Objective-C Block kind
	 */
	public static final int ObjCBlock = 0x0031;

	/**
	 * Objective-C InstanceType kind
	 */
	public static final int ObjCInstanceType = 0x0032;

	/**
	 * Objective-C Class kind
	 */
	public static final int ObjCClass = 0x0033;

	/**
	 * Objective-C Selector kind
	 */
	public static final int ObjCSelector = 0x0034;

	/**
	 * Objective-C Id kind
	 */
	public static final int ObjCId = 0x0035;

	/**
	 * FullyQualified kind
	 */
	public static final int FullyQualified = 0x0040;

	/**
	 * The resolved kind of the type
	 */
	private final int kind;

	/**
	 * Name of the associated element, present when kind is Objective-C Object,
	 * Struct or OpaquePtr
	 */
	private String elementName = null;

	/**
	 * Inner type (array, pointer, etc.)
	 */
	private Type innerType = null;

	/**
	 * Size of the array
	 */
	private long arraySize = 1;

	/**
	 * Constant type
	 */
	private boolean isConst = false;

	/**
	 * Data alignment
	 */
	private long alignment = -1;

	/**
	 * Downgrade annotation
	 */
	private String downgradeAnnotation;

	/**
	 * Signed flag
	 */
	private boolean isSignedLong = false;

	/**
	 * Callback type additional data
	 */
	private CallbackDescriptor callbackDescriptor = null;

	private static final ArrayList<Type> EMPTY_TYPE_ARGS_LIST = new ArrayList<Type>();

	private ArrayList<Type> typeArgs = EMPTY_TYPE_ARGS_LIST;

	private static final ArrayList<String> EMPTY_PROTOOCOLS_LIST = new ArrayList<String>();

	private ArrayList<String> objcProtocols = EMPTY_PROTOOCOLS_LIST;

	private ObjCGenericParamType objCGenericParamType = null;

	private static final HashMap<String, String> USR_CLASS_MAP = new HashMap<String, String>(128);

	private static final HashMap<String, ObjCGenericParamType> CLASS_PARAM_MAP = new HashMap<String, ObjCGenericParamType>(
			128);

	public static void resetAll() {
		USR_CLASS_MAP.clear();
		CLASS_PARAM_MAP.clear();
	}

	public static void registerObjCGenericParamTypeForClass(String usr, String className, ObjCGenericParamType type) {
		if (USR_CLASS_MAP.put(usr, className) != null) {
			throw new RuntimeException(
					"Objective-C Generic Type: Class(" + className + ") already registered for USR(" + usr + ")");
		}
		if (CLASS_PARAM_MAP.put(className, type) != null) {
			throw new RuntimeException("Objective-C Generic Type: Type(" + type.getName()
					+ ") already registered for Class(" + className + ")");
		}
	}

	public static void registerObjCGenericParamTypeForCategory(String usr, String className) {
		if (USR_CLASS_MAP.put(usr, className) != null) {
			throw new RuntimeException(
					"Objective-C Generic Type: Class(" + className + ") already registered for USR(" + usr + ")");
		}
	}

	/**
	 * Descriptor class for callback types
	 */
	static class CallbackDescriptor {

		/**
		 * Callback's return type
		 */
		private final Type type;

		/**
		 * Callback's arguments
		 */
		private final ArrayList<CallbackArgument> arguments;

		/**
		 * Callback's kind (Block or FunctionProto)
		 */
		private final int kind;

		/**
		 * <code>true</code> if the callback is variadic
		 */
		private boolean isVariadic;

		/**
		 * Create a new callback descriptor
		 * 
		 * @param type
		 * @param argCount
		 */
		public CallbackDescriptor(int kind, Type type, int argCount) {
			// Check values
			if (type == null || argCount < 0) {
				throw new IllegalArgumentException();
			}
			if (kind != ObjCBlock && kind != FunctionProto) {
				throw new IllegalArgumentException();
			}

			// Set values
			this.type = type;
			this.arguments = new ArrayList<Type.CallbackArgument>(argCount);
			this.kind = kind;
		}

		/**
		 * Returns the return type of the callback
		 * 
		 * @return return type
		 */
		public Type getType() {
			return type;
		}

		/**
		 * Returns the argument list of the callback
		 * 
		 * @return argument list
		 */
		public ArrayList<CallbackArgument> getArguments() {
			return arguments;
		}

		/**
		 * Return the callback kind
		 * 
		 * @return kind
		 */
		public int getKind() {
			return kind;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder(kind == ObjCBlock ? "^" : "*");
			builder.append("(").append(type.toString()).append(")");

			builder.append("(");
			for (CallbackArgument arg : arguments) {
				builder.append(arg.toString());
				if (arg != arguments.get(arguments.size() - 1)) {
					builder.append(", ");
				}
			}
			builder.append(")");

			return builder.toString();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}

			if (obj instanceof CallbackDescriptor) {
				CallbackDescriptor desc = (CallbackDescriptor)obj;
				if (!type.equals(desc.type)) {
					return false;
				}
				if (arguments.size() != desc.arguments.size()) {
					return false;
				}
				for (int i = 0; i < arguments.size(); ++i) {
					if (!arguments.get(i).equals(desc.arguments.get(i))) {
						return false;
					}
				}
				return true;
			}
			return false;
		}

		public boolean isSupported(Generator generator, ArrayList<String> problems) {
			boolean isSupported = true;

			if (isVariadic) {
				Util.addProblem("Variadic callback is not supported", problems);
				isSupported = false;
			}

			ArrayList<String> innerP = problems == null ? null : new ArrayList<String>();
			if (!type.isSupported(generator, innerP)) {
				Util.transferProblems("bad return type", innerP, problems);
				isSupported = false;
			}

			int idx = 0;
			for (CallbackArgument arg : arguments) {
				if (innerP != null) {
					innerP.clear();
				}
				if (!arg.getType().isSupported(generator, innerP)) {
					Util.transferProblems("bad argument(" + idx + ") type", innerP, problems);
					isSupported = false;
				}
				++idx;
			}

			return isSupported;
		}

		private CallbackManager manager;

		CallbackManager getManager() {
			return manager;
		}

		void setManager(CallbackManager manager) {
			if (manager == null) {
				throw new IllegalArgumentException();
			}
			this.manager = manager;
		}

		public void setVariadic(boolean isVariadic) {
			this.isVariadic = isVariadic;
		}

		public boolean setDowngradable(CallbackDescriptor callbackDescriptor) {
			// Check argument count
			int count = callbackDescriptor.getArguments().size();
			if (getArguments().size() != count) {
				return false;
			}

			// Check return type
			Type type = callbackDescriptor.getType();
			if (!getType().setDowngradable(type)) {
				return false;
			}

			// Check argument types
			for (int i = 0; i < count; ++i) {
				Type argT = getArguments().get(i).getType();

				type = callbackDescriptor.getArguments().get(i).getType();
				if (!argT.setDowngradable(type)) {
					return false;
				}
			}

			return true;
		}
	}

	/**
	 * Argument type for callbacks
	 */
	static class CallbackArgument {
		/**
		 * Argument name
		 */
		private String name;
		/**
		 * Argument type
		 */
		private Type type;

		/**
		 * Create a new callback argument
		 * 
		 * @param name
		 *            argument name
		 * @param type
		 *            argument type
		 */
		public CallbackArgument(String name, Type type) {
			// Check values
			if (name == null) throw new RuntimeException("Value 'name' cannot be null!");
			if (type == null) throw new RuntimeException("Value 'type' cannot be null!");

			// Set values
			this.name = name;
			this.type = type;
		}

		/**
		 * Returns the name of the callback argument
		 * 
		 * @return name
		 */
		public String getName() {
			return name;
		}

		/**
		 * Returns the type of the callback argument
		 * 
		 * @return
		 */
		public Type getType() {
			return type;
		}

		@Override
		public String toString() {
			return type.toString();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj == this) {
				return true;
			}

			if (obj instanceof CallbackArgument) {
				CallbackArgument arg = (CallbackArgument)obj;
				if (!type.equals(arg.type)) {
					return false;
				}
				return true;
			}
			return false;
		}
	}

	/**
	 * Create a new void type
	 */
	public Type() {
		kind = Void;
	}

	private String typeSpelling;

	public String getTypeSpelling() {
		return typeSpelling;
	}

	/**
	 * Create a new type with a CXType
	 * 
	 * @param inType
	 *            clang type
	 * @param memModel
	 *            memory model
	 */
	public Type(final CXType inType, final int memModel) {
		typeSpelling = inType.getTypeSpelling().toString();
		CXType type = inType;

		if (type.kind() == CXTypeKind.Elaborated) {
			type = type.getNamedType();
		}

		// Deal with nullability
		{
			CXType sType = clang.clang_getTypeByStrippingOuterNullability(type);
			if (sType.kind() != CXTypeKind.Invalid && clang.clang_equalTypes(type, sType) == 0) {
				type = sType;
			}
		}

		// Set basic infos
		int typeKind = type.kind();
		alignment = type.getAlignOf();
		isConst = type.isConstQualifiedType();
		if (!isConst) {
			CXType tmpType = type;
			int tmpTypeKind = typeKind;
			while (tmpTypeKind != CXTypeKind.Invalid) {
				CXType canonical = tmpType.getCanonicalType();
				if (clang.clang_equalTypes(tmpType, canonical) != 0) {
					break;
				}
				tmpType = canonical;
				tmpTypeKind = tmpType.kind();
				isConst = tmpType.isConstQualifiedType();
				if (isConst) {
					break;
				}
			}
		}

		// Resolve typedefs and save most inner typedef's name
		CXType typeDefType = null;
		while (typeKind == CXTypeKind.Typedef) {
			// TODO: skip names with '_' prefix?
			typeDefType = type;
			type = type.getTypeDeclaration().getTypedefDeclUnderlyingType();
			if (type.kind() == CXTypeKind.Elaborated) {
				type = type.getNamedType();
			}
			typeKind = type.kind();
		}

		// Expand unexposed types
		while (typeKind == CXTypeKind.Unexposed) {
			CXType canonical = type.getCanonicalType();
			if (clang.clang_equalTypes(type, canonical) != 0) {
				break;
			}
			type = canonical;
			typeKind = type.kind();
		}

		switch (typeKind) {
		// Objective-C specials
		case CXTypeKind.ObjCObjectPointer: {
			int NTA = clang.clang_Type_getNumTemplateArguments(type);
			if (NTA > 0) {
				typeArgs = new ArrayList<Type>();
				for (int i = 0; i < NTA; ++i) {
					CXType TAType = clang.clang_Type_getTemplateArgumentAsType(type, i);
					typeArgs.add(new Type(TAType, memModel));
				}
			}
			int NOP = clang.clang_Type_getNumObjCProtocols(type);
			if (NOP > 0) {
				objcProtocols = new ArrayList<String>();
				for (int i = 0; i < NOP; ++i) {
					CXCursor PCur = clang.clang_Type_getObjCProtocolAsCursor(type, i);
					objcProtocols.add(PCur.toString());
				}
			}
			CXType pointeeType = type.getPointeeType();

			// Deal with other attributes
			{
				CXType sType = clang.clang_getTypeByStrippingOuterObjCKindOf(pointeeType);
				if (sType.kind() != CXTypeKind.Invalid && clang.clang_equalTypes(pointeeType, sType) == 0) {
					pointeeType = sType;
				}
			}

			elementName = pointeeType.getTypeDeclaration().toString();
			if (elementName == null || elementName.length() == 0) {
				elementName = null;
				kind = ObjCId;
			} else {
				kind = ObjCObject;
			}
		}
			break;
		case CXTypeKind.ObjCSel:
			kind = ObjCSelector;
			break;
		case CXTypeKind.ObjCClass:
			kind = ObjCClass;
			break;
		case CXTypeKind.ObjCId:
			if (typeDefType != null) {
				final CXCursor cursor = typeDefType.getTypeDeclaration();
				final int cursorKind = clang.clang_getCursorKind(cursor);
				final String cursorSpelling = cursor.toString();
				if (cursorKind == CXCursorKind.TemplateTypeParameter) {
					ObjCGenericParamType paramType = CLASS_PARAM_MAP
							.get(USR_CLASS_MAP.get(cursor.getCursorUSR().toString()));
					if (paramType != null) {
						setObjCGenericParamType(paramType);
						kind = ObjCId;
					} else {
						kind = ObjCId;
					}
				} else if ("instancetype".equals(cursorSpelling)) {
					kind = ObjCInstanceType;
				} else {
					kind = ObjCId;
				}
			} else {
				kind = ObjCId;
			}
			break;

		// bool
		case CXTypeKind.Bool:
			kind = Boolean;
			break;

		// Void
		case CXTypeKind.Void:
			kind = Void;
			break;

		// Boolean and Byte
		case CXTypeKind.SChar:
		case CXTypeKind.UChar:
		case CXTypeKind.Char_S:
		case CXTypeKind.Char_U: {
			ASSERT_TYPE_SIZE(type, 1);
			if (typeDefType != null && "BOOL".equals(typeDefType.getTypeSpelling())) {
				kind = Boolean;
			} else {
				kind = Byte;
			}
		}
			break;

		// Short
		case CXTypeKind.Short:
			ASSERT_TYPE_SIZE(type, 2);
			kind = Short;
			break;
		case CXTypeKind.UShort:
		case CXTypeKind.WChar:
			ASSERT_TYPE_SIZE(type, 2);
			kind = Char;
			break;

		// Int
		case CXTypeKind.Int:
			ASSERT_TYPE_SIZE(type, 4);
			if ("BOOL".equals(typeSpelling)) {
				kind = Boolean;
			} else {
				kind = Int;
			}
			break;
		case CXTypeKind.UInt:
			ASSERT_TYPE_SIZE(type, 4);
			kind = Int;
			break;

		case CXTypeKind.Enum: {
			long sizeOf = clang.clang_Type_getSizeOf(type);
			if (sizeOf < 0 || sizeOf > 8) {
				LOG.debug("Unsupported enum size: " + sizeOf);
				kind = Unrecognized;
				break;
			}
			switch ((int)sizeOf) {
			case 1:
				kind = Byte;
				break;
			case 2:
				kind = Short;
				break;
			case 4:
				kind = Int;
				break;
			case 8:
				kind = Long;
				break;

			default:
				LOG.debug("Unsupported enum size: " + sizeOf);
				kind = Unrecognized;
			}
			if (clang.clang_isSignedIntegerOrEnumerationType(type) != 0) {
				isSignedLong = true;
			}
		}
			break;

		case CXTypeKind.Long:
			isSignedLong = true;
		case CXTypeKind.ULong: {
			if (memModel == Configuration.ARCH_32BIT) {
				ASSERT_TYPE_SIZE(type, 4);
				kind = Int;
			} else if (memModel == Configuration.ARCH_64BIT) {
				ASSERT_TYPE_SIZE(type, 8);
				kind = Long;
			} else {
				throw new RuntimeException("Unknown arch used in configuration!");
			}
		}
			break;

		// Long
		case CXTypeKind.LongLong:
			isSignedLong = true;
		case CXTypeKind.ULongLong:
			ASSERT_TYPE_SIZE(type, 8);
			kind = Long;
			break;

		// Float
		case CXTypeKind.Float:
			ASSERT_TYPE_SIZE(type, 4);
			kind = Float;
			break;

		// Double
		case CXTypeKind.Double:
			ASSERT_TYPE_SIZE(type, 8);
			kind = Double;
			break;

		// Struct
		case CXTypeKind.Record: {
			alignment = -1;
			String name = type.getTypeDeclaration().getCursorUSR().getCString();
			if (name != null) {
				elementName = name;
				kind = Struct;
			} else {
				kind = Unrecognized;
			}
		}
			break;

		// Pointer
		case CXTypeKind.Pointer: {
			CXType pointeeType = type.getPointeeType();
			innerType = new Type(pointeeType, memModel);
			if (innerType.getKind() == Struct) {
				if (pointeeType.getTypeDeclaration().getCursorDefinition().kind() == CXCursorKind.InvalidFile) {
					final String elemN;
					if (typeDefType != null && (elemN = typeDefType.getTypeDeclaration().toString()) != null
							&& elemN.length() > 0) {
						kind = OpaquePtr;
						elementName = elemN;
						break;
					}
					innerType = new Type();
					kind = Pointer;
					break;
				}
				kind = Pointer;
			} else {
				kind = Pointer;
			}
		}
			break;

		// Block
		case CXTypeKind.BlockPointer: {
			kind = ObjCBlock;
			CXType pointee = type.getPointeeType();
			int arg_count = pointee.getNumArgTypes();
			callbackDescriptor = new CallbackDescriptor(ObjCBlock, new Type(pointee.getResultType(), memModel),
					arg_count);
			callbackDescriptor.setVariadic(type.isFunctionTypeVariadic() != 0);
			for (int idx = 0; idx < arg_count; ++idx) {
				Type arg = new Type(pointee.getArgType(idx), memModel);
				callbackDescriptor.arguments.add(new CallbackArgument("arg" + idx, arg));
			}
		}
			break;

		// FunctionProto
		case CXTypeKind.FunctionProto: {
			kind = FunctionProto;
			int arg_count = type.getNumArgTypes();
			callbackDescriptor = new CallbackDescriptor(FunctionProto, new Type(type.getResultType(), memModel),
					arg_count);
			callbackDescriptor.setVariadic(type.isFunctionTypeVariadic() != 0);
			for (int idx = 0; idx < arg_count; ++idx) {
				Type arg = new Type(type.getArgType(idx), memModel);
				callbackDescriptor.arguments.add(new CallbackArgument("arg" + idx, arg));
			}
		}
			break;

		// Constant array
		case CXTypeKind.ConstantArray: {
			kind = ConstantArray;
			arraySize = type.getArraySize();
			innerType = new Type(type.getArrayElementType(), memModel);
		}
			break;

		// Incomplete array
		case CXTypeKind.IncompleteArray: {
			kind = IncompleteArray;
			innerType = new Type(type.getArrayElementType(), memModel);
		}
			break;

		default:
			kind = Unrecognized;
			break;
		}
	}

	private static void ASSERT_TYPE_SIZE(CXType type, int size) {
		long actualSize = clang.clang_Type_getSizeOf(type);
		if (actualSize != size) {
			throw new RuntimeException(
					"Invalid kind recognition, expected size " + size + " instead of " + actualSize + " bytes");
		}
	}

	/**
	 * Create a new type with a class name
	 * 
	 * @param className
	 *            Objective-C class name
	 */
	public Type(String className) {
		this(className, false);
	}

	public Type(String className, boolean fullyQualified) {
		if (fullyQualified == false) {
			this.kind = ObjCObject;
			this.elementName = className;
		} else {
			this.kind = FullyQualified;
			this.elementName = className;
		}
	}

	/**
	 * Create a new int type
	 * 
	 * @param size
	 *            number size in bytes
	 */
	public Type(int size) {
		switch (size) {
		case BYTE_SIZE:
			this.kind = Byte;
			break;
		case SHORT_SIZE:
			this.kind = Short;
			break;
		case INT_SIZE:
			this.kind = Int;
			break;
		case LONG_SIZE:
			this.kind = Long;
			break;

		default:
			throw new IllegalArgumentException();
		}
	}

	/**
	 * Returns the kind of the receiver
	 * 
	 * @return type kind
	 */
	public int getKind() {
		return kind;
	}

	/**
	 * Returns the element name of the receiver
	 * 
	 * @return type element name
	 */
	public String getElementName() {
		return elementName;
	}

	/**
	 * Returns the inner type if available
	 * 
	 * @return inner type or null
	 */
	public Type getInnerType() {
		return innerType;
	}

	/**
	 * Returns the size of the array
	 * 
	 * @return array size (1 is for non-array types)
	 */
	public int getArraySize() {
		if (arraySize < 0 || arraySize > Integer.MAX_VALUE) {
			throw new RuntimeException(
					"Cannot safely cast long to int! Value: " + java.lang.Long.toHexString(arraySize));
		}
		return (int)arraySize;
	}

	/**
	 * Tell whether the type is const or not
	 * 
	 * @return true if is const otherwise false
	 */
	public boolean isConst() {
		return isConst;
	}

	/**
	 * Returns the callback descriptor associated with the type
	 * 
	 * @return callback descriptor or null
	 */
	public CallbackDescriptor getCallbackDescriptor() {
		if (isObjCBlock()) {
			return callbackDescriptor;
		} else if (isFunctionPtr()) {
			return innerType.callbackDescriptor;
		} else {
			throw new RuntimeException();
		}
	}

	/**
	 * Returns the array depth of the type</br>
	 * Example:</br>
	 * <b> <code>char [12]</code></b> has a depth of 1</br>
	 * <b> <code>char [4][4]</code></b> has a depth of 2
	 * 
	 * @return depth
	 */
	public int getArrayDepth() {
		Type t = this;
		int depth = 0;
		while (t.kind == ConstantArray) {
			++depth;
			t = t.innerType;
		}
		return depth;
	}

	/**
	 * Return whether the type is a pointer or not
	 * 
	 * @return true if pointer, otherwise false
	 */
	public boolean isPointer() {
		return kind == Pointer || kind == IncompleteArray;
	}

	/**
	 * Returns the pointer depth of the type</br>
	 * Example:</br>
	 * <b> <code>char *</code></b> has a depth of 1</br>
	 * <b><code>char **</code></b> has a depth of 2
	 * 
	 * @return depth
	 */
	public int getPointerDepth() {
		Type t = this;
		int depth = 0;
		while (t.kind == Pointer || t.kind == IncompleteArray) {
			++depth;
			t = t.innerType;
		}
		return depth;
	}

	/**
	 * Returns root type of the receiver</br>
	 * Example:</br>
	 * <b><code>int</code> </b> has a root type of <b><code>int</code></b></br>
	 * <b> <code>char *</code></b> has a root type of <b>
	 * <code>char</code></b></br>
	 * <b><code>char **[5]</code></b> has a root type of <b>
	 * <code>char **[5]</code></b>
	 * 
	 * @return root type
	 */
	public Type getPonierRootType() {
		Type t = this;
		while (t.kind == Pointer || t.kind == IncompleteArray) {
			t = t.innerType;
		}
		return t;
	}

	/**
	 * Returns root type of the receiver</br>
	 * Example:</br>
	 * <b><code>int</code> </b> has a root type of <b><code>int</code></b></br>
	 * <b> <code>char *</code></b> has a root type of <b>
	 * <code>char</code></b></br>
	 * <b><code>char **[5]</code></b> has a root type of <b>
	 * <code>char</code> </b>
	 * 
	 * @return root type
	 */
	public Type getRootType() {
		Type t = this;
		while (t.kind == Pointer || t.kind == IncompleteArray || t.kind == ConstantArray) {
			t = t.innerType;
		}
		return t;
	}

	/**
	 * Returns root type of the receiver</br>
	 * Example:</br>
	 * <b><code>int</code> </b> has a root type of <b><code>int</code></b></br>
	 * <b> <code>char *</code></b> has a root type of <b>
	 * <code>char *</code> </b></br>
	 * <b><code>char **[5]</code></b> has a root type of <b>
	 * <code>char **</code></b>
	 * 
	 * @return root type
	 */
	public Type getArrayRootType() {
		Type t = this;
		while (t.kind == ConstantArray) {
			t = t.innerType;
		}
		return t;
	}

	/**
	 * Returns the combined size of a constant array</br>
	 * Example:</br>
	 * <b> <code>int</code></b> has a combined size of 1</br>
	 * <b> <code>int [4]</code></b> has a combined size of 4</br>
	 * <b> <code>int [4][5]</code></b> has a combined size of 20</br>
	 * 
	 * @return combined size
	 */
	public int getConstantArrayCombinedSize() {
		Type t = this;
		int size = 1;
		while (t.kind == ConstantArray) {
			size *= t.arraySize;
			t = t.innerType;
		}
		return size;
	}

	/**
	 * Tells whether the type is void or not
	 * 
	 * @return true if void otherwise false;
	 */
	public boolean isVoid() {
		return kind == Void;
	}

	/**
	 * Tells whether the type is primitive or not
	 * 
	 * @return true if primitive otherwise false
	 */
	public boolean isPrimitive() {
		return kind >= FirstPrimitiveKind && kind <= LastPrimitiveKind;
	}

	/**
	 * Tells whether the type is a CString (const char *) or not
	 * 
	 * @return true if is CString otherwise false
	 */
	public boolean isCString() {
		return (kind == Pointer) && (innerType.kind == Byte) && innerType.isConst;
	}

	/**
	 * Tells whether the type is a CString Array (char * *) or not
	 * 
	 * @return true if is CString Array otherwise false
	 */
	public boolean isCStringArray() {
		if (kind == Pointer || Pointer == IncompleteArray) {
			if (innerType.kind == Pointer) {
				if (innerType.innerType.isConst && innerType.innerType.kind == Byte) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Tells whether the type is a block or not
	 * 
	 * @return true if block otherwise false
	 */
	public boolean isObjCBlock() {
		return kind == ObjCBlock;
	}

	/**
	 * Tells whether the type is a function pointer or not
	 * 
	 * @return true if function pointer otherwise false
	 */
	public boolean isFunctionPtr() {
		return kind == Pointer && innerType.kind == FunctionProto;
	}

	/**
	 * Tells whether the type is some kind of a callback or not
	 * 
	 * @return true if it's a callback otherwise false
	 */
	public boolean isCallback() {
		return isObjCBlock() || isFunctionPtr();
	}

	/**
	 * Returns true if the type is an obj-c object.
	 * 
	 * @return true if the type is an obj-c object
	 */
	public boolean isObjCObject() {
		return kind == ObjCObject || kind == ObjCId || kind == ObjCInstanceType;
	}

	/**
	 * Returns whether the type has an unsolvable error or not
	 * 
	 * @param generator
	 *            generator
	 * @return true is type contains fatal error otherwise false
	 */
	public boolean isSupported(Generator generator, ArrayList<String> problems) {
		if (isVoid() || isPrimitive() || kind == FullyQualified || kind == ObjCInstanceType || kind == ObjCId
				|| kind == ObjCClass || kind == ObjCSelector) {
			return true;

		} else if (kind == Unrecognized) {
			Util.addProblem("type is unrecognized", problems);
			return false;

		} else if (kind == Struct) {
			if (generator.getStruct(elementName) == null) {
				Util.addProblem("struct type '" + elementName + "' is not processed", problems);
				return false;
			}
			return true;

		} else if (kind == ObjCObject) {
			if (generator.getClass(elementName) == null) {
				Util.addProblem("object type '" + elementName + "' is not processed", problems);
				return false;
			}
			return true;

		} else if (kind == Pointer) {
			if (innerType == null) {
				Util.addProblem("pointer's pointee type is not defined", problems);
				return false;
			}

			ArrayList<String> innerP = problems == null ? null : new ArrayList<String>();
			if (!innerType.isSupported(generator, innerP)) {
				if (innerType.getKind() != Struct) {
					Util.transferProblems("bad pointee type", innerP, problems);
					return false;
				}
			}

			return true;
		} else if (kind == ConstantArray || kind == IncompleteArray) {
			if (innerType == null) {
				Util.addProblem("array's element type is not defined", problems);
				return false;
			}

			ArrayList<String> innerP = problems == null ? null : new ArrayList<String>();
			if (!innerType.isSupported(generator, innerP)) {
				Util.transferProblems("bad element type", innerP, problems);
				return false;
			}

			return true;
		} else if (kind == ObjCBlock || kind == FunctionProto) {
			if (callbackDescriptor == null) {
				Util.addProblem("callback's descriptor is not defined", problems);
				return false;
			}

			ArrayList<String> innerP = problems == null ? null : new ArrayList<String>();
			if (!callbackDescriptor.isSupported(generator, innerP)) {
				Util.transferProblems("bad callback descriptor", innerP, problems);
				return false;
			}

			return true;
		} else if (kind == OpaquePtr) {

			return true;
		}

		Util.addProblem("type " + elementName + " is not supported", problems);
		return false;
	}

	/**
	 * Returns the SimpleType.Code for the primitive type
	 * 
	 * @return code
	 */
	public Code getSimpleTypeCode() {
		switch (kind) {
		case Boolean:
			return PrimitiveType.BOOLEAN;
		case Byte:
			return PrimitiveType.BYTE;
		case Char:
			return PrimitiveType.CHAR;
		case Short:
			return PrimitiveType.SHORT;
		case Int:
			return PrimitiveType.INT;
		case Long:
			return PrimitiveType.LONG;
		case Float:
			return PrimitiveType.FLOAT;
		case Double:
			return PrimitiveType.DOUBLE;
		}

		throw new RuntimeException("SimpleType.Code not available for '" + getTypeSpelling() + "'.");
	}

	/**
	 * Returns the Java class name for the primitive type
	 * 
	 * @return Java class name
	 */
	public String getPrimitiveJavaClassName() {
		switch (kind) {
		case Boolean:
			return "Boolean";
		case Byte:
			return "Byte";
		case Char:
			return "Character";
		case Short:
			return "Short";
		case Int:
			return "Integer";
		case Long: {
			String da = getDowngradeAnnotation();
			if (da == null) {
				return "Long";
			} else {
				if (Constants.NIntAnnotationFQ.equals(da)) {
					return "NInt";
				} else {
					return "NUInt";
				}
			}
		}
		case Float:
			return "Float";
		case Double: {
			String da = getDowngradeAnnotation();
			if (da == null) {
				return "Double";
			} else {
				return "NFloat";
			}
		}
		case Void:
			return "Void";
		}

		throw new RuntimeException(
				"getPrimitiveJavaClassName is only available for primitive types, called on " + this);
	}

	@Override
	public String toString() {
		switch (kind) {
		case Void:
			return "void" + (isConst() ? " const" : "");
		case Boolean:
			return "boolean" + (isConst() ? " const" : "");
		case Byte:
			return "byte" + (isConst() ? " const" : "");
		case Char:
			return "char" + (isConst() ? " const" : "");
		case Short:
			return "short" + (isConst() ? " const" : "");
		case Int:
			return "int" + (isConst() ? " const" : "");
		case Long: {
			String da = getDowngradeAnnotation();
			if (da == null) {
				return "long" + (isConst() ? " const" : "");
			} else {
				if (Constants.NIntAnnotationFQ.equals(da)) {
					return "nint" + (isConst() ? " const" : "");
				} else {
					return "nuint" + (isConst() ? " const" : "");
				}
			}
		}
		case Float:
			return "float" + (isConst() ? " const" : "");
		case Double: {
			String da = getDowngradeAnnotation();
			if (da == null) {
				return "double" + (isConst() ? " const" : "");
			} else {
				return "nfloat" + (isConst() ? " const" : "");
			}
		}
		case ObjCObject:
			return elementName + "*" + (isConst() ? " const" : "");
		case Struct:
			return elementName + (isConst() ? " const" : "");
		case Pointer:
			return innerType.toString() + " *" + (isConst() ? " const" : "");
		case ObjCBlock:
		case FunctionProto:
			return callbackDescriptor.toString() + (isConst() ? " const" : "");
		case ObjCInstanceType:
			return "@instancetype" + (isConst() ? " const" : "");
		case ObjCClass:
			return "@class" + (isConst() ? " const" : "");
		case ObjCSelector:
			return "@sel" + (isConst() ? " const" : "");
		case ObjCId:
			return "@id" + (isConst() ? " const" : "");
		case ConstantArray:
			return "(" + innerType.toString() + ")" + "[#]" + (isConst() ? " const" : "");
		case IncompleteArray:
			return "(" + innerType.toString() + ")" + "[]" + (isConst() ? " const" : "");
		case FullyQualified:
			return "{" + elementName + "}";
		case OpaquePtr:
			return elementName + (isConst() ? " const" : "");
		}
		return "<unhandled_type>";
	};

	@Override
	public boolean equals(java.lang.Object obj) {
		if (obj == this) {
			return true;
		}

		if (obj instanceof Type) {
			Type t = (Type)obj;
			if (kind != t.kind) {
				return false;
			}
			if (elementName == null && elementName != t.elementName) {
				return false;
			}
			if (elementName != null && !elementName.equals(t.elementName)) {
				return false;
			}
			if (innerType == null && innerType != t.innerType) {
				return false;
			}
			if (innerType != null && !innerType.equals(t.innerType)) {
				return false;
			}
			if (arraySize != t.arraySize) {
				return false;
			}
			if (isConst != t.isConst) {
				return false;
			}
			if (callbackDescriptor == null && callbackDescriptor != t.callbackDescriptor) {
				return false;
			}
			if (callbackDescriptor != null && !callbackDescriptor.equals(t.callbackDescriptor)) {
				return false;
			}
			return true;
		}

		return false;
	}

	public String getSimpleName() {
		if (kind != FullyQualified) {
			throw new RuntimeException();
		}
		return toSimpleName(elementName);
	}

	public static String toSimpleName(String name) {
		int idx = name.lastIndexOf('.');
		if (idx != -1) {
			name = name.substring(idx + 1, name.length());
		}
		return name;
	}

	public boolean isSimilarTo(String fullyQualifiedName) {
		switch (kind) {
		case ObjCClass:
			return Constants.Class.equals(fullyQualifiedName) || Constants.ClassFQ.equals(fullyQualifiedName);
		case ObjCSelector:
			return Constants.SEL.equals(fullyQualifiedName) || Constants.SELFQ.equals(fullyQualifiedName);
		case ObjCId:
		case ObjCInstanceType:
			return "Object".equals(fullyQualifiedName);
		case Struct:
		case ObjCObject:
			return elementName.equals(fullyQualifiedName);
		case FullyQualified:
			return elementName.equals(fullyQualifiedName) || getSimpleName().equals(fullyQualifiedName);

		default:
			return false;
		}
	}

	public CallbackManager getCallbackManager() {
		return getCallbackDescriptor().getManager();
	}

	public void setCallbackManager(CallbackManager manager) {
		getCallbackDescriptor().setManager(manager);
	}

	private String preferredResolving;

	public String getPreferredResolving() {
		return preferredResolving;
	}

	public void setPreferredResolving(String preferredResolving) {
		this.preferredResolving = preferredResolving;
	}

	public long getDataAlignment(Generator generator) {
		if (alignment == -1) {
			if (kind != Struct) {
				throw new RuntimeException();
			} else {
				return generator.getStruct(elementName).getAlignment();
			}
		} else {
			return alignment;
		}
	}

	public String getDowngradeAnnotation() {
		return downgradeAnnotation;
	}

	public boolean setDowngradable(Type dType) {
		if (dType == null) {
			throw new NullPointerException();
		}
		// Ignore on equals
		if (equals(dType)) {
			return true;
		}
		// Try to downgrade inner type
		if (isCallback() && dType.isCallback()) {
			return getCallbackDescriptor().setDowngradable(dType.getCallbackDescriptor());
		}
		if (isPointer() && dType.isPointer()) {
			return innerType.setDowngradable(dType.innerType);
		}
		if (kind == ConstantArray && dType.kind == ConstantArray && getArraySize() == dType.getArraySize()) {
			return innerType.setDowngradable(dType.innerType);
		}
		// Ignore on kind match
		if (kind == dType.kind) {
			return true;
		}
		// Ignore if kinds are not downgradeable
		if (kind != Double && kind != Long) {
			return true;
		}
		// Fail if kinds are incompatible
		if (dType.kind != Double && dType.kind != Long && dType.kind != Float && dType.kind != Int) {
			return false;
		}
		if (kind == Double && dType.kind == Float) {
			downgradeAnnotation = Constants.NFloatAnnotationFQ;
			return true;
		}
		if (kind == Long && dType.kind == Int) {
			if (isSignedLong) {
				downgradeAnnotation = Constants.NIntAnnotationFQ;
			} else {
				downgradeAnnotation = Constants.NUIntAnnotationFQ;
			}
			return true;
		}
		return false;
	}

	public ObjCGenericParamType getObjCGenericParamType() {
		return objCGenericParamType;
	}

	public void setObjCGenericParamType(ObjCGenericParamType objCGenericParamType) {
		if (objCGenericParamType == null) {
			throw new NullPointerException();
		}
		this.objCGenericParamType = objCGenericParamType;
	}

	public ArrayList<Type> getObjCTypeArgs() {
		return typeArgs;
	}

	public static class ObjCProtocolGenerationState {
		private static final int DISABLED = 0;
		private static final int ENABLED = 1;

		private int state = ENABLED;

		public boolean isDisabled() {
			return state == DISABLED;
		}

		public boolean isEnabled() {
			return state == ENABLED;
		}

		public void disable() {
			state = DISABLED;
		}
	}

	private ObjCProtocolGenerationState objcProtocolGenerationState;

	public ObjCProtocolGenerationState getObjcProtocolGenerationState() {
		return objcProtocolGenerationState;
	}

	public void setObjcProtocolGenerationState(ObjCProtocolGenerationState objcProtocolGenerationState) {
		if (objcProtocolGenerationState == null) {
			throw new NullPointerException();
		}
		if (this.objcProtocolGenerationState != null
				&& this.objcProtocolGenerationState != objcProtocolGenerationState) {
			throw new IllegalStateException("ObjCProtocolGenerationState already set");
		}
		this.objcProtocolGenerationState = objcProtocolGenerationState;
	}

	public ArrayList<String> getObjCProtocols() {
		return objcProtocols;
	}

	public boolean isObjCProtocolledIdType() {
		return kind == ObjCId && objcProtocols.size() == 1;
	}

	public boolean isObjCProtocolExactOrInheritedFrom(Type type, Generator gen) {
		if (!isObjCProtocolledIdType() || !type.isObjCProtocolledIdType()) {
			return false;
		}
		if (getObjcProtocolGenerationState() == null || getObjcProtocolGenerationState().isDisabled()) {
			return false;
		}
		if (type.getObjcProtocolGenerationState() == null || type.getObjcProtocolGenerationState().isDisabled()) {
			return false;
		}
		ObjCProtocolManager thisManager = getObjCProtocolManager(gen);
		ObjCProtocolManager typeManager = type.getObjCProtocolManager(gen);
		if (thisManager == null || typeManager == null) {
			return false;
		}
		return thisManager == typeManager;
	}

	private ObjCProtocolManager objcProtocolManager;

	private ObjCProtocolManager getObjCProtocolManager(Generator gen) {
		if (!isObjCProtocolledIdType()) {
			return null;
		}
		if (objcProtocolManager == null) {
			objcProtocolManager = gen.getProtocol(objcProtocols.get(0));
		}
		return objcProtocolManager;
	}
}
