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
 * Support class.
 */
public class CxxSupport {

    /**
     * Disabled constructor.
     */
    private CxxSupport() {
    }

    /**
     * org/moe/natj package.
     */
    private static final String NATJ_PKG = "org/moe/natj";

    /**
     * org/moe/natj/cxx package.
     */
    private static final String CXX_PKG = NATJ_PKG + "/cxx";

    /**
     * org/moe/natj/general package.
     */
    private static final String NATJ_GEN_PKG = NATJ_PKG + "/general";

    /**
     * org/moe/natj/general/ptr package.
     */
    private static final String NATJ_GEN_PTR_PKG = NATJ_GEN_PKG + "/ptr";

    /**
     * org/moe/natj/cxx/CxxRuntime class.
     */
    public static final Type CXX_RUNTIME = Type.getObjectType(CXX_PKG + "/CxxRuntime");

    /**
     * org/moe/natj/cxx/ann/CxxByValue annotation.
     */
    public static final Type CXX_BY_VALUE_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxByValue");

    /**
     * org/moe/natj/cxx/ann/CxxByReference annotation.
     */
    public static final Type CXX_BY_REFERENCE_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxByReference");

    /**
     * org/moe/natj/cxx/ann/CxxCastOperator annotation.
     */
    public static final Type CXX_CAST_OPERATOR_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxCastOperator");

    /**
     * org/moe/natj/cxx/ann/CxxChar16T annotation.
     */
    public static final Type CXX_CHAR16_T_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxChar16T");

    /**
     * org/moe/natj/cxx/ann/CxxChar32T annotation.
     */
    public static final Type CXX_CHAR32_T_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxChar32T");

    /**
     * org/moe/natj/cxx/ann/CxxClass annotation.
     */
    public static final Type CXX_CLASS_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxClass");

    /**
     * org/moe/natj/cxx/ann/CxxConst annotation.
     */
    public static final Type CXX_CONST_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxConst");

    /**
     * org/moe/natj/cxx/ann/CxxConstructor annotation.
     */
    public static final Type CXX_CONSTRUCTOR_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxConstructor");

    /**
     * org/moe/natj/cxx/ann/CxxCopyConstructorUnavailable annotation.
     */
    public static final Type CXX_COPY_CONSTRUCTOR_UNAVAILABLE_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxCopyConstructorUnavailable");

    /**
     * org/moe/natj/cxx/ann/CxxDefaultConstructorUnavailable annotation.
     */
    public static final Type CXX_DEFAULT_CONSTRUCTOR_UNAVAILABLE_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxDefaultConstructorUnavailable");

    /**
     * org/moe/natj/cxx/ann/CxxDestructorUnavailable annotation.
     */
    public static final Type CXX_DESTRUCTOR_UNAVAILABLE_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxDestructorUnavailable");

    /**
     * org/moe/natj/cxx/ann/CxxEnum annotation.
     */
    public static final Type CXX_ENUM_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxEnum");

    /**
     * org/moe/natj/cxx/ann/CxxFieldGetter annotation.
     */
    public static final Type CXX_FIELD_GETTER_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxFieldGetter");

    /**
     * org/moe/natj/cxx/ann/CxxFieldSetter annotation.
     */
    public static final Type CXX_FIELD_SETTER_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxFieldSetter");

    /**
     * org/moe/natj/cxx/ann/CxxFunction annotation.
     */
    public static final Type CXX_FUNCTION_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxFunction");

    /**
     * org/moe/natj/cxx/ann/CxxGlobalGetter annotation.
     */
    public static final Type CXX_GLOBAL_GETTER_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxGlobalGetter");

    /**
     * org/moe/natj/cxx/ann/CxxGlobalSetter annotation.
     */
    public static final Type CXX_GLOBAL_SETTER_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxGlobalSetter");

    /**
     * org/moe/natj/cxx/ann/CxxHeader annotation.
     */
    public static final Type CXX_HEADER_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxHeader");

    /**
     * org/moe/natj/cxx/ann/CxxHeaders annotation.
     */
    public static final Type CXX_HEADERS_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxHeaders");

    /**
     * org/moe/natj/cxx/ann/CxxInheritedClass annotation.
     */
    public static final Type CXX_INHERITED_CLASS_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxInheritedClass");

    /**
     * org/moe/natj/cxx/ann/CxxInheritedConstructor annotation.
     */
    public static final Type CXX_INHERITED_CONSTRUCTOR_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxInheritedConstructor");

    /**
     * org/moe/natj/cxx/ann/CxxJavaObject annotation.
     */
    public static final Type CXX_JAVA_OBJECT_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxJavaObject");

    /**
     * org/moe/natj/cxx/ann/CxxMethod annotation.
     */
    public static final Type CXX_METHOD_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxMethod");

    /**
     * org/moe/natj/cxx/ann/CxxOperator annotation.
     */
    public static final Type CXX_OPERATOR_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxOperator");

    /**
     * org/moe/natj/cxx/ann/CxxOperatorFunction annotation.
     */
    public static final Type CXX_OPERATOR_FUNCTION_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxOperatorFunction");

    /**
     * org/moe/natj/cxx/ann/CxxSigned annotation.
     */
    public static final Type CXX_SIGNED_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxSigned");

    /**
     * org/moe/natj/cxx/ann/CxxTemplate annotation.
     */
    public static final Type CXX_TEMPLATE_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxTemplate");

    /**
     * org/moe/natj/cxx/ann/CxxUnsigned annotation.
     */
    public static final Type CXX_UNSIGNED_ANN = Type.getObjectType(CXX_PKG + "/ann/CxxUnsigned");

    /**
     * org/moe/natj/cxx/CxxBindingObject class.
     */
    public static final Type CXX_BINDING_OBJECT_CLS = Type.getObjectType(CXX_PKG + "/CxxBindingObject");

    /**
     * org/moe/natj/cxx/CxxConstImpl interface.
     */
    public static final Type CXX_CONST_IMPL_ITF = Type.getObjectType(CXX_PKG + "/CxxConstImpl");

    /**
     * org/moe/natj/cxx/CxxDirectImpl interface.
     */
    public static final Type CXX_DIRECT_IMPL_ITF = Type.getObjectType(CXX_PKG + "/CxxDirectImpl");

    /**
     * org/moe/natj/cxx/CxxMethodVirtuality enum.
     */
    public static final Type CXX_METHOD_VIRTUALITY_ENUM = Type.getObjectType(CXX_PKG + "/CxxMethodVirtuality");

    /**
     * org/moe/natj/cxx/CxxOperatorKind enum.
     */
    public static final Type CXX_OPERATOR_KIND_ENUM = Type.getObjectType(CXX_PKG + "/CxxOperatorKind");

    /**
     * org/moe/natj/cxx/CxxObject interface.
     */
    public static final Type CXX_OBJECT_ITF = Type.getObjectType(CXX_PKG + "/CxxObject");

    /**
     * org/moe/natj/general/ann/NLong interface.
     */
    public static final Type GEN_NLONG_ANN = Type.getObjectType(NATJ_GEN_PKG + "/ann/NLong");

    /**
     * org/moe/natj/general/ann/NULong interface.
     */
    public static final Type GEN_NULONG_ANN = Type.getObjectType(NATJ_GEN_PKG + "/ann/NULong");

    /**
     * org/moe/natj/general/ann/WCharT annotation.
     */
    public static final Type GEN_WCHAR_T_ANN = Type.getObjectType(NATJ_GEN_PKG + "/ann/WCharT");

    /**
     * org/moe/natj/general/Pointer class.
     */
    public static final Type PTR_POINTER_CLS = Type.getObjectType(NATJ_GEN_PKG + "/Pointer");

    /**
     * org/moe/natj/general/ptr/Ptr interface.
     */
    public static final Type PTR_PTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/Ptr");

    /**
     * org/moe/natj/general/ptr/ConstPtr interface.
     */
    public static final Type PTR_CONSTPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstPtr");

    /**
     * org/moe/natj/general/ptr/VoidPtr interface.
     */
    public static final Type PTR_VOIDPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/VoidPtr");

    /**
     * org/moe/natj/general/ptr/ConstVoidPtr interface.
     */
    public static final Type PTR_CONSTVOIDPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstVoidPtr");

    /**
     * org/moe/natj/general/ptr/BoolPtr interface.
     */
    public static final Type PTR_BOOLPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/BoolPtr");

    /**
     * org/moe/natj/general/ptr/ConstBoolPtr interface.
     */
    public static final Type PTR_CONSTBOOLPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstBoolPtr");

    /**
     * org/moe/natj/general/ptr/BytePtr interface.
     */
    public static final Type PTR_BYTEPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/BytePtr");

    /**
     * org/moe/natj/general/ptr/ConstBytePtr interface.
     */
    public static final Type PTR_CONSTBYTEPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstBytePtr");

    /**
     * org/moe/natj/general/ptr/ShortPtr interface.
     */
    public static final Type PTR_SHORTPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ShortPtr");

    /**
     * org/moe/natj/general/ptr/ConstShortPtr interface.
     */
    public static final Type PTR_CONSTSHORTPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstShortPtr");

    /**
     * org/moe/natj/general/ptr/CharPtr interface.
     */
    public static final Type PTR_CHARPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/CharPtr");

    /**
     * org/moe/natj/general/ptr/ConstCharPtr interface.
     */
    public static final Type PTR_CONSTCHARPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstCharPtr");

    /**
     * org/moe/natj/general/ptr/IntPtr interface.
     */
    public static final Type PTR_INTPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/IntPtr");

    /**
     * org/moe/natj/general/ptr/ConstIntPtr interface.
     */
    public static final Type PTR_CONSTINTPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstIntPtr");

    /**
     * org/moe/natj/general/ptr/NLongPtr interface.
     */
    public static final Type PTR_NLONGPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/NLongPtr");

    /**
     * org/moe/natj/general/ptr/ConstNLongPtr interface.
     */
    public static final Type PTR_CONSTNLONGPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstNLongPtr");

    /**
     * org/moe/natj/general/ptr/WCharTPtr interface.
     */
    public static final Type PTR_WCHARTPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/WCharTPtr");

    /**
     * org/moe/natj/general/ptr/ConstWCharTPtr interface.
     */
    public static final Type PTR_CONSTWCHARTPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstWCharTPtr");

    /**
     * org/moe/natj/general/ptr/NULongPtr interface.
     */
    public static final Type PTR_NULONGPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/NULongPtr");

    /**
     * org/moe/natj/general/ptr/ConstNULongPtr interface.
     */
    public static final Type PTR_CONSTNULONGPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstNULongPtr");

    /**
     * org/moe/natj/general/ptr/LongPtr interface.
     */
    public static final Type PTR_LONGPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/LongPtr");

    /**
     * org/moe/natj/general/ptr/ConstLongPtr interface.
     */
    public static final Type PTR_CONSTLONGPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstLongPtr");

    /**
     * org/moe/natj/general/ptr/FloatPtr interface.
     */
    public static final Type PTR_FLOATPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/FloatPtr");

    /**
     * org/moe/natj/general/ptr/ConstFloatPtr interface.
     */
    public static final Type PTR_CONSTFLOATPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstFloatPtr");

    /**
     * org/moe/natj/general/ptr/DoublePtr interface.
     */
    public static final Type PTR_DOUBLEPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/DoublePtr");

    /**
     * org/moe/natj/general/ptr/ConstDoublePtr interface.
     */
    public static final Type PTR_CONSTDOUBLEPTR_ITF = Type.getObjectType(NATJ_GEN_PTR_PKG + "/ConstDoublePtr");

    /**
     * Tells whether the specified type is a pointer or not.
     *
     * @param type Type to check
     * @return True iff type is a pointer
     */
    public static boolean isPointerType(Type type) {
        return PTR_PTR_ITF.equals(type) || PTR_CONSTPTR_ITF.equals(type)
                || PTR_VOIDPTR_ITF.equals(type) || PTR_CONSTVOIDPTR_ITF.equals(type)
                || PTR_BOOLPTR_ITF.equals(type) || PTR_CONSTBOOLPTR_ITF.equals(type)
                || PTR_BYTEPTR_ITF.equals(type) || PTR_CONSTBYTEPTR_ITF.equals(type)
                || PTR_SHORTPTR_ITF.equals(type) || PTR_CONSTSHORTPTR_ITF.equals(type)
                || PTR_CHARPTR_ITF.equals(type) || PTR_CONSTCHARPTR_ITF.equals(type)
                || PTR_INTPTR_ITF.equals(type) || PTR_CONSTINTPTR_ITF.equals(type)
                || PTR_WCHARTPTR_ITF.equals(type) || PTR_CONSTWCHARTPTR_ITF.equals(type)
                || PTR_NLONGPTR_ITF.equals(type) || PTR_CONSTNLONGPTR_ITF.equals(type)
                || PTR_NULONGPTR_ITF.equals(type) || PTR_CONSTNULONGPTR_ITF.equals(type)
                || PTR_LONGPTR_ITF.equals(type) || PTR_CONSTLONGPTR_ITF.equals(type)
                || PTR_FLOATPTR_ITF.equals(type) || PTR_CONSTFLOATPTR_ITF.equals(type)
                || PTR_DOUBLEPTR_ITF.equals(type) || PTR_CONSTDOUBLEPTR_ITF.equals(type);
    }

    /**
     * Tells whether the specified type is a generic pointer or not.
     *
     * @param type Type to check
     * @return True iff type is a generic pointer
     */
    public static boolean isGenericPointerType(Type type) {
        return PTR_PTR_ITF.equals(type) || PTR_CONSTPTR_ITF.equals(type);
    }

    /**
     * Tells whether the specified type is a primitive pointer or not.
     *
     * @param type Type to check
     * @return True iff type is a primitive pointer
     */
    public static boolean isPrimitivePointerType(Type type) {
        return PTR_VOIDPTR_ITF.equals(type) || PTR_CONSTVOIDPTR_ITF.equals(type)
                || PTR_BOOLPTR_ITF.equals(type) || PTR_CONSTBOOLPTR_ITF.equals(type)
                || PTR_BYTEPTR_ITF.equals(type) || PTR_CONSTBYTEPTR_ITF.equals(type)
                || PTR_SHORTPTR_ITF.equals(type) || PTR_CONSTSHORTPTR_ITF.equals(type)
                || PTR_CHARPTR_ITF.equals(type) || PTR_CONSTCHARPTR_ITF.equals(type)
                || PTR_INTPTR_ITF.equals(type) || PTR_CONSTINTPTR_ITF.equals(type)
                || PTR_WCHARTPTR_ITF.equals(type) || PTR_CONSTWCHARTPTR_ITF.equals(type)
                || PTR_NLONGPTR_ITF.equals(type) || PTR_CONSTNLONGPTR_ITF.equals(type)
                || PTR_NULONGPTR_ITF.equals(type) || PTR_CONSTNULONGPTR_ITF.equals(type)
                || PTR_LONGPTR_ITF.equals(type) || PTR_CONSTLONGPTR_ITF.equals(type)
                || PTR_FLOATPTR_ITF.equals(type) || PTR_CONSTFLOATPTR_ITF.equals(type)
                || PTR_DOUBLEPTR_ITF.equals(type) || PTR_CONSTDOUBLEPTR_ITF.equals(type);
    }

    /**
     * Tells whether the specified type is a non-const pointer or not.
     *
     * @param type Type to check
     * @return True iff type is a non-const pointer
     */
    public static boolean isNonConstPointerType(Type type) {
        return PTR_PTR_ITF.equals(type)
                || PTR_VOIDPTR_ITF.equals(type)
                || PTR_BOOLPTR_ITF.equals(type)
                || PTR_BYTEPTR_ITF.equals(type)
                || PTR_SHORTPTR_ITF.equals(type)
                || PTR_CHARPTR_ITF.equals(type)
                || PTR_INTPTR_ITF.equals(type)
                || PTR_WCHARTPTR_ITF.equals(type)
                || PTR_NLONGPTR_ITF.equals(type)
                || PTR_NULONGPTR_ITF.equals(type)
                || PTR_LONGPTR_ITF.equals(type)
                || PTR_FLOATPTR_ITF.equals(type)
                || PTR_DOUBLEPTR_ITF.equals(type);
    }

    /**
     * Tells whether the specified type is a const pointer or not.
     *
     * @param type Type to check
     * @return True iff type is a const pointer
     */
    public static boolean isConstPointerType(Type type) {
        return PTR_CONSTPTR_ITF.equals(type)
                || PTR_CONSTVOIDPTR_ITF.equals(type)
                || PTR_CONSTBOOLPTR_ITF.equals(type)
                || PTR_CONSTBYTEPTR_ITF.equals(type)
                || PTR_CONSTSHORTPTR_ITF.equals(type)
                || PTR_CONSTCHARPTR_ITF.equals(type)
                || PTR_CONSTINTPTR_ITF.equals(type)
                || PTR_CONSTWCHARTPTR_ITF.equals(type)
                || PTR_CONSTNLONGPTR_ITF.equals(type)
                || PTR_CONSTNULONGPTR_ITF.equals(type)
                || PTR_CONSTLONGPTR_ITF.equals(type)
                || PTR_CONSTFLOATPTR_ITF.equals(type)
                || PTR_CONSTDOUBLEPTR_ITF.equals(type);
    }

    /**
     * Returns the specified type's pointer root type.
     *
     * @param type Type
     * @return Pointer root type or null
     */
    public static CxxTypeKind getPointerRootType(Type type) {
        if (PTR_VOIDPTR_ITF.equals(type) || PTR_CONSTVOIDPTR_ITF.equals(type)) {
            return CxxTypeKind.VOID;
        }
        if (PTR_BOOLPTR_ITF.equals(type) || PTR_CONSTBOOLPTR_ITF.equals(type)) {
            return CxxTypeKind.BOOL;
        }
        if (PTR_BYTEPTR_ITF.equals(type) || PTR_CONSTBYTEPTR_ITF.equals(type)) {
            return CxxTypeKind.BYTE;
        }
        if (PTR_SHORTPTR_ITF.equals(type) || PTR_CONSTSHORTPTR_ITF.equals(type)) {
            return CxxTypeKind.SHORT;
        }
        if (PTR_CHARPTR_ITF.equals(type) || PTR_CONSTCHARPTR_ITF.equals(type)) {
            return CxxTypeKind.USHORT;
        }
        if (PTR_INTPTR_ITF.equals(type) || PTR_CONSTINTPTR_ITF.equals(type)) {
            return CxxTypeKind.INT;
        }
        if (PTR_WCHARTPTR_ITF.equals(type) || PTR_CONSTWCHARTPTR_ITF.equals(type)) {
            return CxxTypeKind.WCHART;
        }
        if (PTR_NLONGPTR_ITF.equals(type) || PTR_CONSTNLONGPTR_ITF.equals(type)) {
            return CxxTypeKind.LONG;
        }
        if (PTR_NULONGPTR_ITF.equals(type) || PTR_CONSTNULONGPTR_ITF.equals(type)) {
            return CxxTypeKind.ULONG;
        }
        if (PTR_LONGPTR_ITF.equals(type) || PTR_CONSTLONGPTR_ITF.equals(type)) {
            return CxxTypeKind.LONGLONG;
        }
        if (PTR_FLOATPTR_ITF.equals(type) || PTR_CONSTFLOATPTR_ITF.equals(type)) {
            return CxxTypeKind.FLOAT;
        }
        if (PTR_DOUBLEPTR_ITF.equals(type) || PTR_CONSTDOUBLEPTR_ITF.equals(type)) {
            return CxxTypeKind.DOUBLE;
        }
        return null;
    }

    /**
     * Returns the primitive type kind for a Java type.
     *
     * @param type Java type
     * @return CxxTypeKind or null
     */
    public static CxxTypeKind getPrimitiveTypeForJavaClass(Type type) {
        if ("java/lang/Void".equals(type.getInternalName())) {
            return CxxTypeKind.VOID;
        }
        if ("java/lang/Boolean".equals(type.getInternalName())) {
            return CxxTypeKind.BOOL;
        }
        if ("java/lang/Byte".equals(type.getInternalName())) {
            return CxxTypeKind.BYTE;
        }
        if ("java/lang/Short".equals(type.getInternalName())) {
            return CxxTypeKind.SHORT;
        }
        if ("java/lang/Character".equals(type.getInternalName())) {
            return CxxTypeKind.USHORT;
        }
        if ("java/lang/Integer".equals(type.getInternalName())) {
            return CxxTypeKind.INT;
        }
        if ("java/lang/Long".equals(type.getInternalName())) {
            return CxxTypeKind.LONGLONG;
        }
        if ("java/lang/Float".equals(type.getInternalName())) {
            return CxxTypeKind.FLOAT;
        }
        if ("java/lang/Double".equals(type.getInternalName())) {
            return CxxTypeKind.DOUBLE;
        }
        return null;
    }
}
