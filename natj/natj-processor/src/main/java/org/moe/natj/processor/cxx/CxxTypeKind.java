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

package org.moe.natj.processor.cxx;

import org.objectweb.asm.Type;

/**
 * Enum representing type kinds.
 */
public enum CxxTypeKind {

    /**
     * Void.
     */
    VOID,

    /**
     * Boolean.
     */
    BOOL,

    /**
     * Byte (8-bit).
     */
    BYTE,

    /**
     * Signed Byte (8-bit).
     */
    SBYTE,

    /**
     * Unsigned Byte (8-bit).
     */
    UBYTE,

    /**
     * Short (16-bit).
     */
    SHORT,

    /**
     * Unsigned Short (16-bit).
     */
    USHORT,

    /**
     * Integer (32-bit).
     */
    INT,

    /**
     * Unsigned Integer (32-bit).
     */
    UINT,

    /**
     * Long (native sized).
     */
    LONG,

    /**
     * Unsigned Long (native sized).
     */
    ULONG,

    /**
     * Long Long (64-bit).
     */
    LONGLONG,

    /**
     * Unsigned Long Long (64-bit).
     */
    ULONGLONG,

    /**
     * char16_t (unsigned 16-bit).
     */
    CHAR16T,

    /**
     * char32_t (unsigned 32-bit).
     */
    CHAR32T,

    /**
     * wchar_t (16 or 32-bit).
     */
    WCHART,

    /**
     * Float (32-bit).
     */
    FLOAT,

    /**
     * Double (64-bit).
     */
    DOUBLE,

    /**
     * C++ Instance.
     */
    CXX_OBJECT,

    /**
     * C++ Instance By Value.
     */
    CXX_OBJECT_BY_VALUE,

    /**
     * C++ Instance By Reference (T&).
     */
    CXX_OBJECT_BY_REFERENCE,

    /**
     * Const C++ Instance.
     */
    CXX_CONST_OBJECT,

    /**
     * Const C++ Instance By Value.
     */
    CXX_CONST_OBJECT_BY_VALUE,

    /**
     * Const C++ Instance By Reference (T&).
     */
    CXX_CONST_OBJECT_BY_REFERENCE,

    /**
     * Java Object.
     */
    JAVA_OBJECT,

    /**
     * Java Object which can be passed to C++.
     */
    CXX_JAVA_OBJECT,

    /**
     * Native pointer type (T *).
     */
    PTR,

    /**
     * Native pointer type (T const *).
     */
    CONST_PTR,

    /**
     * Native reference type, only used with primitive types (T &).
     */
    REF,

    /**
     * Native reference type, only used with primitive types (T const &).
     */
    CONST_REF;

    /**
     * Returns the JNI type of this kind as a {@link Type}.
     *
     * @return JNI type
     */
    public Type getJNIType() {
        switch (this) {
            case VOID:
                return Type.VOID_TYPE;
            case BOOL:
                return Type.BOOLEAN_TYPE;
            case BYTE:
            case SBYTE:
            case UBYTE:
                return Type.BYTE_TYPE;
            case SHORT:
                return Type.SHORT_TYPE;
            case USHORT:
            case CHAR16T:
                return Type.CHAR_TYPE;
            case INT:
            case UINT:
            case CHAR32T:
            case WCHART:
                return Type.INT_TYPE;
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
                return Type.LONG_TYPE;
            case FLOAT:
                return Type.FLOAT_TYPE;
            case DOUBLE:
                return Type.DOUBLE_TYPE;
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
            case CXX_JAVA_OBJECT:
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                return Type.LONG_TYPE;
        }
        throw new IllegalStateException("bad type " + this.name());
    }

    /**
     * Returns the JNI type of this kind as the native C++ representation.
     *
     * @return JNI type
     */
    public String getNativeJNIType() {
        switch (this) {
            case VOID:
                return "void";
            case BOOL:
                return "jboolean";
            case BYTE:
            case SBYTE:
            case UBYTE:
                return "jbyte";
            case SHORT:
                return "jshort";
            case USHORT:
            case CHAR16T:
                return "jchar";
            case INT:
            case UINT:
            case CHAR32T:
            case WCHART:
                return "jint";
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
                return "jlong";
            case FLOAT:
                return "jfloat";
            case DOUBLE:
                return "jdouble";
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
            case CXX_JAVA_OBJECT:
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                return "jlong";
        }
        throw new IllegalStateException("bad type " + this.name());
    }

    /**
     * Returns the native function name that returns this kind of value from a JNI call.
     *
     * @return Native function name
     */
    public String getNatJInvokeFn() {
        switch (this) {
            case VOID:
                return "CallStaticVoidMethod";
            case BOOL:
                return "CallStaticBooleanMethod";
            case BYTE:
            case SBYTE:
            case UBYTE:
                return "CallStaticByteMethod";
            case SHORT:
                return "CallStaticShortMethod";
            case USHORT:
            case CHAR16T:
                return "CallStaticCharMethod";
            case INT:
            case UINT:
            case CHAR32T:
            case WCHART:
                return "CallStaticIntMethod";
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
                return "CallStaticLongMethod";
            case FLOAT:
                return "CallStaticFloatMethod";
            case DOUBLE:
                return "CallStaticDoubleMethod";
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
            case CXX_JAVA_OBJECT:
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                return "CallStaticLongMethod";
        }
        throw new IllegalStateException("bad type " + this.name());
    }

    /**
     * Returns the cast required to convert the JNI type to the native counterpart.
     *
     * @return C++ cast type
     */
    public String getJNIToNativeCast() {
        switch (this) {
            case VOID:
                throw new IllegalStateException();
            case BOOL:
            case BYTE:
            case SBYTE:
            case UBYTE:
            case CHAR16T:
            case UINT:
            case CHAR32T:
            case WCHART:
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
            case CXX_JAVA_OBJECT:
                return "static_cast";
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                return "reinterpret_cast";
            default:
                return null;
        }
    }

    /**
     * Returns the cast required to convert the native type to the JNI counterpart.
     *
     * @return C++ cast type
     */
    public String getNativeToJNICast() {
        switch (this) {
            case VOID:
                throw new IllegalStateException();
            case BOOL:
            case BYTE:
            case SBYTE:
            case UBYTE:
            case CHAR16T:
            case UINT:
            case CHAR32T:
            case WCHART:
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
            case CXX_JAVA_OBJECT:
                return "static_cast";
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                return "reinterpret_cast";
            default:
                return null;
        }
    }

    /**
     * Tells whether or not this kind is VOID.
     *
     * @return True iff void
     */
    public boolean isVoid() {
        return this == VOID;
    }

    /**
     * Tells whether or not this kind is a primitive kind.
     *
     * @return True iff primitive
     */
    public boolean isPrimitive() {
        switch (this) {
            case BOOL:
            case BYTE:
            case SBYTE:
            case UBYTE:
            case SHORT:
            case USHORT:
            case CHAR16T:
            case INT:
            case UINT:
            case CHAR32T:
            case WCHART:
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
            case FLOAT:
            case DOUBLE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a CxxObject extender or implementer kind.
     *
     * @return True iff CxxObject extender or implementer
     */
    public boolean isCxxObjectKind() {
        switch (this) {
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a non-const CxxObject extender or implementer kind.
     *
     * @return True iff non-const CxxObject extender or implementer
     */
    public boolean isNonConstCxxObjectKind() {
        switch (this) {
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a const CxxObject extender or implementer kind.
     *
     * @return True iff const CxxObject extender or implementer
     */
    public boolean isConstCxxObjectKind() {
        switch (this) {
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a by value CxxObject extender or implementer kind.
     *
     * @return True iff by value CxxObject extender or implementer
     */
    public boolean isByValueCxxObjectKind() {
        switch (this) {
            case CXX_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_VALUE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a by reference CxxObject extender or implementer kind.
     *
     * @return True iff by reference CxxObject extender or implementer
     */
    public boolean isByReferenceCxxObjectKind() {
        switch (this) {
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a Java object kind.
     *
     * @return True iff Java object
     */
    public boolean isJavaObjectKind() {
        switch (this) {
            case JAVA_OBJECT:
            case CXX_JAVA_OBJECT:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a pointer.
     *
     * @return True iff pointer
     */
    public boolean isPtr() {
        switch (this) {
            case PTR:
            case CONST_PTR:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a non-const pointer.
     *
     * @return True iff non-const pointer
     */
    public boolean isNonConstPtr() {
        switch (this) {
            case PTR:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a const pointer.
     *
     * @return True iff const pointer
     */
    public boolean isConstPtr() {
        switch (this) {
            case CONST_PTR:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a reference.
     *
     * @return True iff reference
     */
    public boolean isRef() {
        switch (this) {
            case REF:
            case CONST_REF:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a non-const reference.
     *
     * @return True iff non-const reference
     */
    public boolean isNonConstRef() {
        switch (this) {
            case REF:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a const reference.
     *
     * @return True iff const reference
     */
    public boolean isConstRef() {
        switch (this) {
            case CONST_REF:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this kind is a Java object passable to native code as Java reference.
     *
     * @return True iff Java object passable to native code as Java reference
     */
    public boolean isNativeCompatibleJavaObjectKind() {
        switch (this) {
            case CXX_JAVA_OBJECT:
                return true;
            default:
                return false;
        }
    }
}
