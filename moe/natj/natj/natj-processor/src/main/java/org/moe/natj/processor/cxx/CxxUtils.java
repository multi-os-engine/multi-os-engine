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

import org.moe.natj.processor.cxx.decl.DeclInfo;
import org.moe.natj.processor.cxx.decl.IKindInfo;
import org.moe.natj.processor.cxx.decl.ParamInfo;
import org.moe.natj.processor.cxx.decl.invokable.InvokableInfo;
import org.moe.natj.processor.cxx.decl.invokable.InvokableKind;
import org.moe.natj.processor.cxx.visitors.CxxAnalyzer;
import org.objectweb.asm.Label;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class.
 */
public class CxxUtils implements Opcodes {

    /**
     * Disabled constructor.
     */
    private CxxUtils() {
    }

    /**
     * Returns the static stub name of the declaration info.
     *
     * @param declInfo DeclInfo
     * @param isBridge Is bridge stub
     * @return Static stub name
     */
    public static String getStaticStubName(DeclInfo declInfo, boolean isBridge) {
        if (declInfo == null) {
            throw new NullPointerException();
        }
        final IKindInfo kindInfo = declInfo.getKindInfo();
        return getStaticStubName((isBridge ? "br" : "") + kindInfo.getCategory(), declInfo.getName(), declInfo.getParamTypes());
    }

    /**
     * Returns the static stub name for the specified configuration.
     *
     * @param category   Category name
     * @param name       Function name
     * @param paramTypes Parameter types
     * @return Static stub name
     */
    public static String getStaticStubName(String category, String name, CxxType[] paramTypes) {
        if (category == null) {
            throw new NullPointerException();
        }
        if (name == null) {
            throw new NullPointerException();
        }
        if (paramTypes == null) {
            throw new NullPointerException();
        }

        // Create string builder with prefix
        final StringBuilder b = new StringBuilder("__cxx_");

        // Append declaration category
        b.append(category).append('_');

        // Append name
        b.append(name.length()).append(name);

        // Append parameter types
        for (CxxType param : paramTypes) {
            getStaticStubEncoding(b, param);
        }
        return b.toString();
    }

    /**
     * Generates the static stub encoding for the specified type.
     *
     * @param b     Target string builder
     * @param param Type
     * @return StringBuilder from first argument
     */
    static StringBuilder getStaticStubEncoding(StringBuilder b, CxxType param) {
        switch (param.getKind()) {
            case VOID:
                return b.append('v');
            case BOOL:
                return b.append('z');
            case BYTE:
                return b.append('b');
            case SBYTE:
                return b.append("Sb");
            case UBYTE:
                return b.append("Ub");
            case SHORT:
                return b.append('s');
            case USHORT:
                return b.append('c');
            case CHAR16T:
                return b.append("Xc16");
            case INT:
                return b.append('i');
            case UINT:
                return b.append("Ui");
            case CHAR32T:
                return b.append("Xc32");
            case WCHART:
                return b.append("Xcwi");
            case LONG:
                return b.append('l');
            case ULONG:
                return b.append("Ul");
            case LONGLONG:
                return b.append('j');
            case ULONGLONG:
                return b.append("Uj");
            case FLOAT:
                return b.append('f');
            case DOUBLE:
                return b.append('d');
            case CXX_OBJECT:
                return getStaticStubEncodingForCxxParam(b, param, "O");
            case CXX_OBJECT_BY_VALUE:
                return getStaticStubEncodingForCxxParam(b, param, "V");
            case CXX_OBJECT_BY_REFERENCE:
                return getStaticStubEncodingForCxxParam(b, param, "R");
            case CXX_CONST_OBJECT:
                return getStaticStubEncodingForCxxParam(b, param, "CO");
            case CXX_CONST_OBJECT_BY_VALUE:
                return getStaticStubEncodingForCxxParam(b, param, "CV");
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return getStaticStubEncodingForCxxParam(b, param, "CR");
            case CXX_JAVA_OBJECT:
                return getStaticStubEncodingForJavaParam(b, param, "J");
            case PTR:
                return getStaticStubEncoding(b.append("p"), param.getInnerTypeForPtr());
            case CONST_PTR:
                return getStaticStubEncoding(b.append("Cp"), param.getInnerTypeForPtr());
            case REF:
                return getStaticStubEncoding(b.append("r"), param.getInnerTypeForRef());
            case CONST_REF:
                return getStaticStubEncoding(b.append("Cr"), param.getInnerTypeForRef());
        }
        throw new IllegalStateException("bad type " + param.getKind().name());
    }

    /**
     * Generates the static stub encoding for the specified C++ parameter.
     *
     * @param b        Target string builder
     * @param param    Type
     * @param category Type kind
     * @return StringBuilder from fist argument
     */
    private static StringBuilder getStaticStubEncodingForCxxParam(StringBuilder b, CxxType param, String category) {
        final CxxClassInfo type = param.getClassInfoForCxxObjectType();
        String jniName = jnify(type.mapperType);
        return b.append(category).append(jniName.length()).append(jniName);
    }

    /**
     * Generates the static stub encoding for the specified Java parameter.
     *
     * @param b        Target string builder
     * @param param    Type
     * @param category Type kind
     * @return StringBuilder from fist argument
     */
    private static StringBuilder getStaticStubEncodingForJavaParam(StringBuilder b, CxxType param, String category) {
        final Type type = param.getTypeForJavaObjectType();
        String jniName = jnify(type.getInternalName());
        return b.append(category).append(jniName.length()).append(jniName);
    }

    /**
     * JNI-fies the name.
     *
     * @param name Name
     * @return JNI-compatible name
     */
    public static String jnify(String name) {
        return name.replaceAll("_", "_1")
                .replaceAll("/", "_")
                .replaceAll("\\$", "_00024");
    }

    /**
     * JNI-fies the type.
     *
     * @param type Type
     * @return JNI-compatible type
     */
    public static String jnify(Type type) {
        return jnify(type.getInternalName());
    }

    /**
     * JNI-fies the declaration info's Java static stub's name.
     *
     * @param declInfo Declaration info
     * @return JNI-compatible stub name
     */
    public static String jnify(DeclInfo declInfo) {
        return jnify(declInfo.getJavaStaticStubMethodName());
    }

    /**
     * JNI-fies the type and name.
     *
     * @param type Java type
     * @param name Name
     * @return JNI-compatible name
     */
    public static String jnify(Type type, String name) {
        return "Java_" + CxxUtils.jnify(type) + "_" + CxxUtils.jnify(name);
    }

    /**
     * JNI-fies the name.
     *
     * @param type     Java type
     * @param declInfo Declaration info
     * @return JNI-compatible name
     */
    public static String jnify(Type type, DeclInfo declInfo) {
        return "Java_" + CxxUtils.jnify(type) + "_" + CxxUtils.jnify(declInfo);
    }

    /**
     * Loads parameters for the native static stub (to-native invocation direction).
     *
     * @param declInfo   Declaration info
     * @param startIndex First parameter's local variable index
     * @param mv         Method visitor to generate the code into
     * @return Local variable manager
     */
    public static LocalManager loadParameters(DeclInfo declInfo, int startIndex, MethodVisitor mv) {
        final LocalManager localManager = new LocalManager(startIndex, declInfo.getParams(), true);
        int index = startIndex;
        for (ParamInfo param : declInfo.getParams()) {
            index += BCGen.toNativeLoadType(mv, param.getType(), index);
        }
        return localManager;
    }

    /**
     * Loads parameter for the Java non-static method (to-Java invocation direction.)
     *
     * @param declInfo   Declaration info
     * @param startIndex First parameter's local variable index
     * @param mv         Method visitor to generate the code into
     * @param analyzer   C++ analyzer
     * @return Local variable manager
     */
    public static LocalManager loadParametersToJava(DeclInfo declInfo, int startIndex, MethodVisitor mv, CxxAnalyzer analyzer) {
        final LocalManager localManager = new LocalManager(startIndex, declInfo.getParams(), false);
        int index = startIndex;
        for (ParamInfo param : declInfo.getParams()) {
            index += BCGen.toJavaLoadType(mv, param.getType(), index, localManager, analyzer);
        }
        return localManager;
    }

    /**
     * This class manages local variable creation.
     */
    public static class LocalManager {
        /**
         * Locals.
         */
        private final ArrayList<Local> locals = new ArrayList<>();

        /**
         * Next local variable index.
         */
        private int nextIndex;

        /**
         * Creates a new manager.
         *
         * @param startIndex Start index offset
         * @param params     Method parameters
         * @param toNative   To native bridge
         */
        private LocalManager(int startIndex, List<ParamInfo> params, boolean toNative) {
            nextIndex = startIndex;
            if (toNative) {
                for (ParamInfo param : params) {
                    nextIndex += BCGen.sizeOfToNativeLoadType(param.getType());
                }
            } else {
                for (ParamInfo param : params) {
                    nextIndex += BCGen.sizeOfToJavaLoadType(param.getType());
                }
            }
        }

        /**
         * Returns the next available local variable index.
         *
         * @return Next available local variable index
         */
        public int getNextIndex() {
            return nextIndex;
        }

        /**
         * Returns a new local for the specified arguments.
         *
         * @param name         Local variable name
         * @param type         Local variable type
         * @param variableSize Local variable width
         * @return New Local instance
         */
        public Local getNext(String name, Type type, int variableSize) {
            if (variableSize != 1 && variableSize != 2) {
                throw new IllegalArgumentException();
            }
            final int next = nextIndex;
            nextIndex += variableSize;
            final Local local = new Local(name, type.getDescriptor(), next);
            locals.add(local);
            return local;
        }

        /**
         * Reify the local variables.
         *
         * @param mv Method visitor
         */
        public void close(MethodVisitor mv) {
            locals.forEach(l -> mv.visitLocalVariable(l.name, l.desc, null, l.start, l.end, l.index));
        }
    }

    /**
     * Local variable.
     */
    public static class Local {
        /**
         * Start label.
         */
        public final Label start = new Label();

        /**
         * End label.
         */
        public final Label end = new Label();

        /**
         * Local variable name.
         */
        public final String name;

        /**
         * Local variable descriptor.
         */
        public final String desc;

        /**
         * Local variable index.
         */
        public final int index;

        /**
         * Create a new local variable.
         *
         * @param name  Name
         * @param desc  Descriptor
         * @param index Index
         */
        private Local(String name, String desc, int index) {
            if (name == null) {
                throw new NullPointerException();
            }
            if (desc == null) {
                throw new NullPointerException();
            }
            this.name = name;
            this.desc = desc;
            this.index = index;
        }
    }

    /**
     * Tells whether the CxxMemberImplInfo is an inherited method or not.
     *
     * @param implInfo CxxMemberImplInfo to check
     * @return True iff the implInfo is an inherited method
     */
    public static boolean isInheritedNativeMethod(CxxMemberImplInfo implInfo) {
        if (!implInfo.classInfo.isInherited) return false;
        if (!(implInfo.declInfo instanceof InvokableInfo)) return false;
        final InvokableInfo info = (InvokableInfo) implInfo.declInfo;
        final InvokableKind kind = info.getKind();
        if (!kind.isClassMember()) return false;
        if ((info.getAccess() & ACC_ABSTRACT) == ACC_ABSTRACT) return false;
        if ((info.getAccess() & ACC_NATIVE) == ACC_NATIVE) return false;
        return true;
    }
}
