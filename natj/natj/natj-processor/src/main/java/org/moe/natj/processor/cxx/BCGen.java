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
import org.moe.natj.processor.cxx.decl.ParamInfo;
import org.moe.natj.processor.cxx.decl.invokable.ConstructorInfo;
import org.moe.natj.processor.cxx.decl.invokable.InvokableKind;
import org.moe.natj.processor.cxx.visitors.CxxAnalyzer;
import org.objectweb.asm.*;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.ParameterNode;

/**
 * Utility class for generating Java bytecode.
 */
public class BCGen implements Opcodes {
    /**
     * Hidden constructor.
     */
    private BCGen() {
    }

    /**
     * Generates a constructor with a single long argument and passes it to the super constructor.
     *
     * @param visitor  Class visitor
     * @param superCls Super class type
     */
    public static void pointerConstructor(ClassVisitor visitor, Type superCls) {
        constructor(visitor, superCls, Type.LONG_TYPE);
    }

    /**
     * Generates a constructor with the specified arguments and passes them to the super constructor.
     *
     * @param visitor  Class visitor
     * @param superCls Super class type
     * @param args     Argument types
     */
    public static void constructor(ClassVisitor visitor, Type superCls, Type... args) {
        final String methodDesc = Type.getMethodDescriptor(Type.VOID_TYPE, args);

        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(ACC_PUBLIC, "<init>", methodDesc, null, null);

        // Apply parameters
        mv.visitParameter("pointer", ACC_FINAL);

        // Call super
        mv.visitCode();
        mv.visitVarInsn(ALOAD, 0);
        int index = 1;
        for (Type arg : args) {
            index += loadType(mv, arg, index);
        }
        mv.visitMethodInsn(INVOKESPECIAL,
                superCls.getInternalName(),
                "<init>",
                methodDesc,
                false);

        // Close
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Method descriptor of the delete operator's bridge method.
     */
    public static final String DELETE_OP_BRIDGE_DESC = Type.getMethodDescriptor(Type.VOID_TYPE, Type.LONG_TYPE);

    /**
     * Name of the delete operator's bridge method.
     */
    public static final String DELETE_OP_BRIDGE_NAME = CxxUtils.getStaticStubName(InvokableKind.OPERATOR.category,
            "delete",
            new CxxType[]{CxxType.fromType(Type.LONG_TYPE)});

    /**
     * Method descriptor of the sizeof operator's bridge method.
     */
    public static final String SIZEOF_OP_BRIDGE_DESC = Type.getMethodDescriptor(Type.LONG_TYPE);

    /**
     * Name of the sizeof operator's bridge method.
     */
    public static final String SIZEOF_OP_BRIDGE_NAME = CxxUtils.getStaticStubName(InvokableKind.OPERATOR.category,
            "sizeof",
            new CxxType[]{});

    /**
     * Name of the pointer support's "new[]" bridge method.
     */
    public static final String PTR_SUPPORT_NEW_BRIDGE_NAME = CxxUtils.getStaticStubName(InvokableKind.OPERATOR.category,
            "ptrnew",
            new CxxType[]{CxxType.fromType(Type.INT_TYPE)});

    /**
     * Method descriptor of the pointer support's "new[]" bridge method.
     */
    public static final String PTR_SUPPORT_NEW_BRIDGE_DESC = Type.getMethodDescriptor(Type.LONG_TYPE, Type.INT_TYPE);

    /**
     * Name of the pointer support's "delete[]" bridge method.
     */
    public static final String PTR_SUPPORT_DELETE_BRIDGE_NAME = CxxUtils.getStaticStubName(InvokableKind.OPERATOR.category,
            "ptrdelete",
            new CxxType[]{CxxType.fromType(Type.LONG_TYPE)});

    /**
     * Method descriptor of the pointer support's "delete[]" bridge method.
     */
    public static final String PTR_SUPPORT_DELETE_BRIDGE_DESC = Type.getMethodDescriptor(Type.VOID_TYPE, Type.LONG_TYPE);

    /**
     * Name of the pointer support's "operator[idx]" bridge method.
     */
    public static final String PTR_SUPPORT_GET_BRIDGE_NAME = CxxUtils.getStaticStubName(InvokableKind.OPERATOR.category,
            "ptrget",
            new CxxType[]{CxxType.fromType(Type.LONG_TYPE), CxxType.fromType(Type.INT_TYPE)});

    /**
     * Method descriptor of the pointer support's "operator[idx]" bridge method.
     */
    public static final String PTR_SUPPORT_GET_BRIDGE_DESC = Type.getMethodDescriptor(Type.LONG_TYPE, Type.LONG_TYPE, Type.INT_TYPE);

    /**
     * Name of the pointer support's "operator[idx] = elem" bridge method.
     */
    public static final String PTR_SUPPORT_SET_BRIDGE_NAME = CxxUtils.getStaticStubName(InvokableKind.OPERATOR.category,
            "ptrset",
            new CxxType[]{CxxType.fromType(Type.LONG_TYPE), CxxType.fromType(Type.INT_TYPE), CxxType.fromType(Type.LONG_TYPE)});

    /**
     * Method descriptor of the pointer support's "operator[idx] = elem" bridge method.
     */
    public static final String PTR_SUPPORT_SET_BRIDGE_DESC = Type.getMethodDescriptor(Type.VOID_TYPE, Type.LONG_TYPE, Type.INT_TYPE, Type.LONG_TYPE);

    /**
     * Generates the delete operator which invokes the proper bridge method.
     *
     * @param visitor    Class visitor
     * @param bridgeType Implementing class of the bridge method
     */
    public static void deleteOp(ClassVisitor visitor, Type bridgeType) {
        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(ACC_PUBLIC, "_cxx_rt_delete", "()V", null, null);

        // Call super
        mv.visitCode();
        load_cxx_rt_peer(mv);
        mv.visitMethodInsn(INVOKESTATIC,
                bridgeType.getInternalName(),
                DELETE_OP_BRIDGE_NAME,
                DELETE_OP_BRIDGE_DESC,
                false);

        // Close
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Generates the static native bridge method for the delete operator.
     *
     * @param visitor   Class visitor
     * @param classInfo Class info
     */
    public static void _cxx_rt_release_java(ClassVisitor visitor, CxxClassInfo classInfo) {
        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(ACC_PUBLIC + ACC_STATIC, "_cxx_rt_release_java", "(J)V", null, null);

        // Call impl
        mv.visitCode();
        mv.visitVarInsn(LLOAD, 0);
        final CxxType peer = new CxxType(CxxTypeKind.CXX_JAVA_OBJECT, classInfo.mapperType);
        CxxRuntime_getObjectForUID(mv, peer);
        mv.visitMethodInsn(INVOKEVIRTUAL,
                classInfo.mapperType.getInternalName(),
                "_cxx_rt_release_java",
                "()V",
                false);

        // Close
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Generates the static native bridge method for the delete operator.
     *
     * @param visitor Class visitor
     */
    public static void deleteOpBridge(ClassVisitor visitor) {
        createBridgeMethod(visitor, DELETE_OP_BRIDGE_NAME, DELETE_OP_BRIDGE_DESC, null, null);
    }

    /**
     * Generates the static native bridge method for the sizeof operator.
     *
     * @param visitor Class visitor
     */
    public static void sizeofOpBridge(ClassVisitor visitor) {
        createBridgeMethod(visitor, SIZEOF_OP_BRIDGE_NAME, SIZEOF_OP_BRIDGE_DESC, null, null);
    }

    /**
     * Creates an empty method with the access flags ACC_PUBLIC | ACC_STATIC | ACC_NATIVE.
     *
     * @param visitor    Class visitor
     * @param name       Method name
     * @param desc       Method descriptor
     * @param signature  Method signature
     * @param exceptions Method exceptions
     */
    public static void createBridgeMethod(ClassVisitor visitor, String name, String desc, String signature,
                                          String[] exceptions) {
        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(ACC_PUBLIC | ACC_STATIC | ACC_NATIVE,
                name, desc, signature, exceptions);

        // Close
        mv.visitEnd();
    }

    /**
     * Creates a delete operator method which throws an UnsupportedOperationException.
     *
     * @param visitor Class visitor
     */
    public static void unavailableDeleteOp(ClassVisitor visitor) {
        unavailableMethod(visitor, ACC_PUBLIC, "_cxx_rt_delete", "()V", null, null, "delete operator unavailable");
    }

    /**
     * Creates a bridge method which throws an UnsupportedOperationException with the specified message.
     *
     * @param visitor    Class visitor
     * @param name       Method name
     * @param desc       Method descriptor
     * @param signature  Method signature
     * @param exceptions Method exceptions
     * @param message    Exception message
     */
    public static void unavailableBridgeMethod(ClassVisitor visitor, String name, String desc,
                                               String signature, String[] exceptions, String message) {
        unavailableMethod(visitor, ACC_PUBLIC | ACC_STATIC, name, desc, signature, exceptions, message);
    }

    /**
     * Creates a method which throws an UnsupportedOperationException with the specified message.
     *
     * @param visitor    Class visitor
     * @param access     Method access flags
     * @param name       Method name
     * @param desc       Method descriptor
     * @param signature  Method signature
     * @param exceptions Method exceptions
     * @param message    Exception message
     */
    public static void unavailableMethod(ClassVisitor visitor, int access, String name, String desc,
                                         String signature, String[] exceptions, String message) {
        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(access, name, desc, signature, exceptions);
        mv.visitCode();

        // Throw unsupported operation exception
        throw_new_UnsupportedOperationException(mv, message);

        // Close
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Creates a method for invoking the static native bridge method.
     *
     * @param visitor    Class visitor
     * @param declInfo   declaration info
     * @param bridgeType Implementing class of the bridge method
     * @param analyzer   analyzer
     */
    public static void toNativeBridgeInvoker(ClassVisitor visitor, DeclInfo declInfo, Type bridgeType, CxxAnalyzer analyzer) {
        // Update access
        int access = declInfo.getAccess();
        access &= ~ACC_ABSTRACT & ~ACC_NATIVE;

        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(access,
                declInfo.getName(),
                declInfo.getDesc().getDescriptor(),
                null,
                null);

        // Apply parameters
        for (ParamInfo paramInfo : declInfo.getParams()) {
            mv.visitParameter(paramInfo.getName(), paramInfo.getAccess());
        }

        // Load _cxx_rt_peer
        mv.visitCode();
        int localIndexStart = 0;
        if (declInfo.getKindInfo().isClassMember()) {
            load_cxx_rt_peer(mv);
            ++localIndexStart;
        }

        // Load parameters
        final CxxUtils.LocalManager localManager = CxxUtils.loadParameters(declInfo, localIndexStart, mv);

        // Invoke native
        mv.visitMethodInsn(INVOKESTATIC,
                bridgeType.getInternalName(),
                declInfo.getJavaStaticStubMethodName(),
                declInfo.getJavaStaticStubMethodType().getDescriptor(),
                false);

        // Close
        fromNativeReturnType(mv, declInfo.getType(), localManager, analyzer);
        localManager.close(mv);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Creates a method for throwing a new UnsupportedOperationException for non-const invocation on const instance.
     *
     * @param visitor  Class visitor
     * @param declInfo declaration info
     */
    public static void toNativeBridgeInvocationOfNonConstOnConst(ClassVisitor visitor, DeclInfo declInfo) {
        final String message = "Invoked a non-const method on a const object";
        toNativeBridgeUnsupportedOperationExeption(visitor, declInfo, message);
    }

    /**
     * Creates a method for throwing a new UnsupportedOperationException for invocations of direct only method.
     *
     * @param visitor  Class visitor
     * @param declInfo declaration info
     */
    public static void toNativeBridgeInvocationOfDirectOnlyMethod(ClassVisitor visitor, DeclInfo declInfo) {
        final String message = "This method can only be invoked through a direct class interface";
        toNativeBridgeUnsupportedOperationExeption(visitor, declInfo, message);
    }

    /**
     * Creates a method for throwing a new UnsupportedOperationException.
     *
     * @param visitor  Class visitor
     * @param declInfo declaration info
     * @param message  message
     */
    private static void toNativeBridgeUnsupportedOperationExeption(ClassVisitor visitor, DeclInfo declInfo, String message) {
        // Update access
        int access = declInfo.getAccess();
        access &= ~ACC_ABSTRACT & ~ACC_NATIVE;

        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(access,
                declInfo.getName(),
                declInfo.getDesc().getDescriptor(),
                null,
                null);

        // Apply parameters
        for (ParamInfo paramInfo : declInfo.getParams()) {
            mv.visitParameter(paramInfo.getName(), paramInfo.getAccess());
        }

        // Throw exception
        mv.visitCode();
        throw_new_UnsupportedOperationException(mv, message);

        // Close
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Creates a native static method for the toNative bridge method.
     *
     * @param visitor  Class visitor
     * @param declInfo declaration info
     */
    public static void toNativeBridge(ClassVisitor visitor, DeclInfo declInfo) {
        final boolean isConstructorForPureClass = declInfo instanceof ConstructorInfo
                && ((ConstructorInfo) declInfo).getClassInfo().getClassHasPureVirtualMethod();

        // Update access
        int access = declInfo.getAccess();
        access &= ~ACC_ABSTRACT & ~ACC_PRIVATE & ~ACC_PROTECTED;
        access |= ACC_PUBLIC;
        access |= ACC_STATIC;
        if (!isConstructorForPureClass) {
            access |= ACC_NATIVE;
        } else {
            access &= ~ACC_NATIVE;
        }

        // Create visitor
        final MethodVisitor mv = visitor.visitMethod(access,
                declInfo.getJavaStaticStubMethodName(),
                declInfo.getJavaStaticStubMethodType().getDescriptor(),
                null,
                null);

        // Apply parameters
        if (declInfo.getKindInfo().isClassMember()) {
            mv.visitParameter("_cxx_rt_peer", 0);
        }
        for (ParamInfo paramInfo : declInfo.getParams()) {
            mv.visitParameter(paramInfo.getName(), paramInfo.getAccess());
        }

        // Throw exception for pure virtual classes
        if (isConstructorForPureClass) {
            mv.visitCode();
            throw_new_UnsupportedOperationException(mv,
                    "Classes with pure virtual methods cannot be instantiated");
            mv.visitMaxs(0, 0);
        }

        // Close
        mv.visitEnd();
    }

    /**
     * Creates a static method for the toJava bridge method.
     *
     * @param visitor  Class visitor
     * @param declInfo Declaration info
     * @param node     Method node
     * @param type     Inherited type
     * @param analyzer Analyzer
     */
    public static void toJavaBridge(ClassVisitor visitor, DeclInfo declInfo, MethodNode node, Type type,
                                    CxxAnalyzer analyzer) {
        // Create method visitor
        int acc = declInfo.getAccess();
        acc |= ACC_STATIC;
        MethodVisitor mv = visitor.visitMethod(acc,
                declInfo.getJavaStaticBridgeStubMethodName(),
                declInfo.getJavaStaticStubMethodType().getDescriptor(),
                null,
                (String[]) node.exceptions.toArray(new String[node.exceptions.size()]));

        mv.visitParameter("_cxx_rt_java_peer", ACC_FINAL);
        if (node.parameters != null) {
            for (Object parameter : node.parameters) {
                ((ParameterNode) parameter).accept(mv);
            }
        }

        // Load parameters
        mv.visitCode();
        mv.visitVarInsn(LLOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "getObjectForUID",
                Type.getMethodDescriptor(Type.getObjectType("java/lang/Object"), Type.LONG_TYPE),
                false);
        mv.visitTypeInsn(CHECKCAST, type.getInternalName());
        final CxxUtils.LocalManager localManager = CxxUtils.loadParametersToJava(declInfo, 2, mv, analyzer);

        // Invoke native
        mv.visitMethodInsn(INVOKEVIRTUAL,
                type.getInternalName(),
                declInfo.getName(),
                declInfo.getDesc().getDescriptor(),
                false);

        // Close
        BCGen.fromJavaReturnType(mv, declInfo.getType(), localManager);
        localManager.close(mv);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Creates a static method for the inherited constructor method.
     *
     * @param visitor                     Class visitor
     * @param declInfo                    Declaration info
     * @param node                        Method node
     * @param instanceType                Instance type
     * @param nativeBridgeImplementerType Native bridge implementer type
     */
    public static void constructorBridge(ClassVisitor visitor, DeclInfo declInfo, MethodNode node, Type instanceType,
                                         Type nativeBridgeImplementerType) {
        // Create method visitor
        int acc = declInfo.getAccess();
        acc &= ~ACC_NATIVE & ~ACC_ABSTRACT;
        MethodVisitor mv = visitor.visitMethod(acc,
                node.name,
                node.desc,
                node.signature,
                (String[]) node.exceptions.toArray(new String[node.exceptions.size()]));
        if (node.parameters != null) {
            for (Object parameter : node.parameters) {
                ((ParameterNode) parameter).accept(mv);
            }
        }

        // Create new impl
        mv.visitCode();
        mv.visitTypeInsn(NEW, instanceType.getInternalName());
        mv.visitInsn(DUP);

        // Load parameters
        CxxUtils.loadParameters(declInfo, 0, mv).close(mv);

        // Invoke native
        mv.visitMethodInsn(INVOKESTATIC,
                nativeBridgeImplementerType.getInternalName(),
                declInfo.getJavaStaticStubMethodName(),
                declInfo.getJavaStaticStubMethodType().getDescriptor(),
                false);
        mv.visitMethodInsn(INVOKESPECIAL,
                instanceType.getInternalName(),
                "<init>",
                Type.getMethodDescriptor(Type.VOID_TYPE, Type.LONG_TYPE),
                false);

        // Cache in CxxRuntime
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "register",
                Type.getMethodDescriptor(Type.VOID_TYPE, CxxSupport.CXX_OBJECT_ITF),
                false);

        // Close
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Creates a static method for the inherited constructor method.
     *
     * @param visitor  Class visitor
     * @param declInfo Declaration info
     * @param node     Method node
     * @param type     Inherited type
     */
    public static void inheritedConstructorBridge(ClassVisitor visitor, DeclInfo declInfo, MethodNode node, Type type) {
        // Create method visitor
        int acc = declInfo.getAccess();
        acc &= ~ACC_NATIVE & ~ACC_ABSTRACT;
        MethodVisitor mv = visitor.visitMethod(acc,
                node.name,
                node.desc,
                node.signature,
                (String[]) node.exceptions.toArray(new String[node.exceptions.size()]));
        if (node.parameters != null) {
            for (Object parameter : node.parameters) {
                ((ParameterNode) parameter).accept(mv);
            }
        }

        // Load parameters
        mv.visitCode();
        CxxUtils.loadParameters(declInfo, 0, mv).close(mv);

        // Invoke native
        mv.visitMethodInsn(INVOKESTATIC,
                type.getInternalName(),
                declInfo.getJavaStaticStubMethodName(),
                declInfo.getJavaStaticStubMethodType().getDescriptor(),
                false);

        // Close
        mv.visitInsn(LRETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Loads the _cxx_rt_peer.
     *
     * @param mv Method visitor
     */
    public static void load_cxx_rt_peer(MethodVisitor mv) {
        mv.visitVarInsn(ALOAD, 0);
        mv.visitMethodInsn(INVOKEINTERFACE,
                CxxSupport.CXX_OBJECT_ITF.getInternalName(),
                "_cxx_rt_peer",
                Type.getMethodDescriptor(Type.LONG_TYPE),
                true);
    }

    /**
     * Generates 'throw new UnsupportedOperatorException(&gt;message&lt;)'.
     *
     * @param mv      Method visitor
     * @param message Message or null
     */
    public static void throw_new_UnsupportedOperationException(MethodVisitor mv, String message) {
        throw_new_exception(mv, "java/lang/UnsupportedOperationException", message);
    }

    /**
     * Generates 'throw new IllegalArgumentException(&gt;message&lt;)'.
     *
     * @param mv      Method visitor
     * @param message Message or null
     */
    public static void throw_new_IllegalArgumentException(MethodVisitor mv, String message) {
        throw_new_exception(mv, "java/lang/IllegalArgumentException", message);
    }

    /**
     * Generates 'throw new NullPointerException(&gt;message&lt;)'.
     *
     * @param mv      Method visitor
     * @param message Message or null
     */
    private static void throw_new_NullPointerException(MethodVisitor mv, String message) {
        throw_new_exception(mv, "java/lang/NullPointerException", message);
    }

    /**
     * Generates 'throw new __exceptionType__(&gt;message&lt;)'.
     *
     * @param mv            Method visitor
     * @param exceptionType Type of the exception
     * @param message       Message or null
     */
    private static void throw_new_exception(MethodVisitor mv, String exceptionType, String message) {
        mv.visitTypeInsn(NEW, exceptionType);
        mv.visitInsn(DUP);
        final String descriptor;
        if (message == null) {
            descriptor = Type.getMethodDescriptor(Type.VOID_TYPE);
        } else {
            mv.visitLdcInsn(message);
            descriptor = Type.getMethodDescriptor(Type.VOID_TYPE, Type.getObjectType("java/lang/String"));
        }
        mv.visitMethodInsn(INVOKESPECIAL,
                exceptionType,
                "<init>",
                descriptor,
                false);
        mv.visitInsn(ATHROW);
    }

    /**
     * Inserts a load instruction for the specified type at the specified index.
     *
     * @param mv    Method visitor
     * @param type  Type to load
     * @param index Variable index of type to load
     * @return Size of the loaded variable
     */
    public static int loadType(MethodVisitor mv, Type type, int index) {
        switch (type.getSort()) {
            case Type.VOID:
                throw new RuntimeException("VOID in non-loadable");
            case Type.BOOLEAN:
            case Type.BYTE:
            case Type.SHORT:
            case Type.CHAR:
            case Type.INT:
                mv.visitVarInsn(ILOAD, index);
                return 1;
            case Type.LONG:
                mv.visitVarInsn(LLOAD, index);
                return 2;
            case Type.FLOAT:
                mv.visitVarInsn(FLOAD, index);
                return 1;
            case Type.DOUBLE:
                mv.visitVarInsn(DLOAD, index);
                return 2;
            default:
                mv.visitVarInsn(ALOAD, index);
                return 1;
        }
    }

    /**
     * Inserts a return instruction for the specified type.
     *
     * @param mv   Method visitor
     * @param type Type to return
     */
    public static void returnType(MethodVisitor mv, Type type) {
        switch (type.getSort()) {
            case Type.VOID:
                mv.visitInsn(RETURN);
                break;
            case Type.BOOLEAN:
            case Type.BYTE:
            case Type.SHORT:
            case Type.CHAR:
            case Type.INT:
                mv.visitInsn(IRETURN);
                break;
            case Type.LONG:
                mv.visitInsn(LRETURN);
                break;
            case Type.FLOAT:
                mv.visitInsn(FRETURN);
                break;
            case Type.DOUBLE:
                mv.visitInsn(DRETURN);
                break;
            default:
                mv.visitInsn(ARETURN);
                break;
        }
    }

    /**
     * Loads a primitive type onto the stack.
     *
     * @param mv    Method visitor
     * @param type  Type
     * @param index Variable index
     * @return Width of the loaded variable
     */
    public static int loadPrimitiveType(MethodVisitor mv, CxxType type, int index) {
        switch (type.getKind()) {
            case VOID:
                throw new RuntimeException("VOID in non-loadable");
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
                mv.visitVarInsn(ILOAD, index);
                return 1;
            case LONG:
            case LONGLONG:
            case ULONG:
            case ULONGLONG:
                mv.visitVarInsn(LLOAD, index);
                return 2;
            case FLOAT:
                mv.visitVarInsn(FLOAD, index);
                return 1;
            case DOUBLE:
                mv.visitVarInsn(DLOAD, index);
                return 2;
        }
        throw new IllegalStateException("bad type " + type.getKind().name());
    }

    /**
     * Loads (and optionally converts) a variable onto the stack which comes from Java code.
     *
     * @param mv    Method visitor
     * @param type  Type
     * @param index Variable index
     * @return Width of the loaded variable
     */
    public static int toNativeLoadType(MethodVisitor mv, CxxType type, int index) {
        switch (type.getKind()) {
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE: {
                if (type.isNonConstCxxObjectKind()) {
                    final Label isNull = new Label();
                    final Label join = new Label();

                    // if non null
                    mv.visitVarInsn(ALOAD, index);
                    mv.visitJumpInsn(IFNULL, isNull);

                    // is non null
                    {
                        final Label isInstanceOf = new Label();
                        mv.visitVarInsn(ALOAD, index);
                        if (type.isTemplateCxxClass()) {
                            mv.visitTypeInsn(CHECKCAST,
                                    type.getClassInfoForCxxObjectType().mapperType.getInternalName());
                        }
                        mv.visitTypeInsn(INSTANCEOF, CxxSupport.CXX_CONST_IMPL_ITF.getInternalName());
                        mv.visitJumpInsn(IFNE, isInstanceOf);

                        // then
                        mv.visitVarInsn(ALOAD, index);
                        swapCxxObjectWithItsPeer(mv, false);
                        mv.visitJumpInsn(GOTO, join);

                        // else
                        mv.visitLabel(isInstanceOf);
                        throw_new_IllegalArgumentException(mv, "tried to pass const type as mutable parameter");
                    }

                    // is null
                    {
                        mv.visitLabel(isNull);
                        if (type.isByValueCxxObjectKind()) {
                            throw_new_NullPointerException(mv, "parameters marked with @CxxByValue cannot be null");

                        } else if (type.isByReferenceCxxObjectKind()) {
                            throw_new_NullPointerException(mv, "parameters marked with @CxxByReference cannot be null");

                        } else {
                            mv.visitInsn(LCONST_0);
                        }
                    }

                    // join
                    mv.visitLabel(join);

                } else {
                    mv.visitVarInsn(ALOAD, index);
                    if (type.isTemplateCxxClass()) {
                        mv.visitTypeInsn(CHECKCAST,
                                type.getClassInfoForCxxObjectType().mapperType.getInternalName());
                    }
                    swapCxxObjectWithItsPeer(mv, true);
                }
                return 1;
            }
            case CXX_JAVA_OBJECT: {
                mv.visitVarInsn(ALOAD, index);
                CxxRuntime_getUIDForObject(mv);
                return 1;
            }
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                mv.visitVarInsn(ALOAD, index);
                swapPtrWithItsPeer(mv);
                return 1;
            default:
                return loadPrimitiveType(mv, type, index);
        }
    }

    /**
     * Returns the size of the type which comes from Java code.
     *
     * @param type Type
     * @return Width of the loaded variable
     */
    public static int sizeOfToNativeLoadType(CxxType type) {
        switch (type.getKind()) {
            case VOID:
                throw new RuntimeException("VOID in non-loadable");
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
                return 1;
            case LONG:
            case LONGLONG:
            case ULONG:
            case ULONGLONG:
                return 2;
            case FLOAT:
                return 1;
            case DOUBLE:
                return 2;
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return 1;
            case CXX_JAVA_OBJECT:
                return 1;
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                return 1;
        }
        throw new IllegalStateException("bad type " + type.getKind().name());
    }

    /**
     * Loads (and optionally converts) a variable onto the stack which comes from native code.
     *
     * @param mv           Method visitor
     * @param type         Type
     * @param index        Variable index
     * @param localManager Local variable manager
     * @param analyzer     Analyzer  @return Width of the loaded variable
     */
    public static int toJavaLoadType(MethodVisitor mv, CxxType type, int index, CxxUtils.LocalManager localManager,
                                     CxxAnalyzer analyzer) {
        switch (type.getKind()) {
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE: {
                mv.visitVarInsn(LLOAD, index);
                CxxRuntime_getOrConstruct(mv, type, localManager, analyzer);
                return 2;
            }
            case CXX_JAVA_OBJECT: {
                mv.visitVarInsn(LLOAD, index);
                CxxRuntime_getObjectForUID(mv, type);
                return 2;
            }
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                mv.visitVarInsn(LLOAD, index);
                CxxRuntime_constructPtrForPeer(mv, type);
                return 2;
            default:
                return loadPrimitiveType(mv, type, index);
        }
    }

    /**
     * Returns the size of the type which comes from native code.
     *
     * @param type Type
     * @return Width of the loaded variable
     */
    public static int sizeOfToJavaLoadType(CxxType type) {
        switch (type.getKind()) {
            case VOID:
                throw new RuntimeException("VOID in non-loadable");
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
                return 1;
            case LONG:
            case LONGLONG:
            case ULONG:
            case ULONGLONG:
                return 2;
            case FLOAT:
                return 1;
            case DOUBLE:
                return 2;
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE:
                return 2;
            case CXX_JAVA_OBJECT:
                return 2;
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                return 2;
        }
        throw new IllegalStateException("bad type " + type.getKind().name());
    }

    /**
     * Returns a primitive type.
     *
     * @param mv   Method visitor
     * @param type Type
     */
    public static void returnPrimitiveType(MethodVisitor mv, CxxType type) {
        if (type == null) {
            throw new NullPointerException();
        }
        switch (type.getKind()) {
            case VOID:
                mv.visitInsn(RETURN);
                return;
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
                mv.visitInsn(IRETURN);
                return;
            case LONG:
            case ULONG:
            case LONGLONG:
            case ULONGLONG:
                mv.visitInsn(LRETURN);
                return;
            case FLOAT:
                mv.visitInsn(FRETURN);
                return;
            case DOUBLE:
                mv.visitInsn(DRETURN);
                return;
        }
        throw new IllegalStateException("bad type " + type.getKind().name());
    }

    /**
     * Returns (and optionally converts) a value coming from native code to Java.
     *
     * @param mv           Method visitor
     * @param type         Type
     * @param localManager Local variable manager
     * @param analyzer     Analyzer
     */
    public static void fromNativeReturnType(MethodVisitor mv, CxxType type, CxxUtils.LocalManager localManager,
                                            CxxAnalyzer analyzer) {
        switch (type.getKind()) {
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE: {
                CxxRuntime_getOrConstruct(mv, type, localManager, analyzer);
                mv.visitInsn(ARETURN);
                return;
            }
            case CXX_JAVA_OBJECT: {
                CxxRuntime_getObjectForUID(mv, type);
                mv.visitInsn(ARETURN);
                return;
            }
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                CxxRuntime_constructPtrForPeer(mv, type);
                mv.visitInsn(ARETURN);
                return;
            default:
                returnPrimitiveType(mv, type);
        }
    }

    /**
     * Returns (and optionally converts) a value coming from Java to native code.
     *
     * @param mv           Method visitor
     * @param type         Type
     * @param localManager Local variable manager
     */
    public static void fromJavaReturnType(MethodVisitor mv, CxxType type, CxxUtils.LocalManager localManager) {
        switch (type.getKind()) {
            case CXX_OBJECT:
            case CXX_OBJECT_BY_VALUE:
            case CXX_OBJECT_BY_REFERENCE:
            case CXX_CONST_OBJECT:
            case CXX_CONST_OBJECT_BY_VALUE:
            case CXX_CONST_OBJECT_BY_REFERENCE: {
                if (type.isNonConstCxxObjectKind()) {
                    final Label isNull = new Label();
                    final Label join = new Label();

                    // if non null
                    mv.visitInsn(DUP);
                    mv.visitJumpInsn(IFNULL, isNull);

                    // is non null
                    {
                        final Label isInstanceOf = new Label();
                        if (type.isTemplateCxxClass()) {
                            mv.visitTypeInsn(CHECKCAST,
                                    type.getClassInfoForCxxObjectType().mapperType.getInternalName());
                        }
                        mv.visitInsn(DUP);
                        mv.visitTypeInsn(INSTANCEOF, CxxSupport.CXX_CONST_IMPL_ITF.getInternalName());
                        mv.visitJumpInsn(IFNE, isInstanceOf);

                        // then
                        swapCxxObjectWithItsPeer(mv, false);
                        mv.visitJumpInsn(GOTO, join);

                        // else
                        mv.visitLabel(isInstanceOf);
                        mv.visitInsn(POP);
                        throw_new_IllegalArgumentException(mv, "tried to pass const type as mutable parameter");
                    }

                    // is null
                    {
                        mv.visitLabel(isNull);
                        mv.visitInsn(POP);
                        if (type.isByValueCxxObjectKind()) {
                            throw_new_NullPointerException(mv, "parameters marked with @CxxByValue cannot be null");

                        } else if (type.isByReferenceCxxObjectKind()) {
                            throw_new_NullPointerException(mv, "parameters marked with @CxxByReference cannot be null");

                        } else {
                            mv.visitInsn(LCONST_0);
                        }
                    }

                    // join
                    mv.visitLabel(join);

                } else {
                    if (type.isTemplateCxxClass()) {
                        mv.visitTypeInsn(CHECKCAST,
                                type.getClassInfoForCxxObjectType().mapperType.getInternalName());
                    }
                    swapCxxObjectWithItsPeer(mv, true);
                }
                mv.visitInsn(LRETURN);
                return;
            }
            case CXX_JAVA_OBJECT: {
                CxxRuntime_getUIDForObject(mv);
                mv.visitInsn(LRETURN);
                return;
            }
            case PTR:
            case CONST_PTR:
            case REF:
            case CONST_REF:
                swapPtrWithItsPeer(mv);
                mv.visitInsn(LRETURN);
                return;
            default:
                returnPrimitiveType(mv, type);
        }
    }

    /**
     * Generates code which pops the top Ptr on the stack and replaces it with:
     * {@code top == null ? 0L : top.getPeer().getPeer()}
     *
     * @param mv Method visitor
     */
    public static void swapPtrWithItsPeer(MethodVisitor mv) {
        final Label isNull = new Label();
        final Label join = new Label();

        // if non null
        mv.visitInsn(DUP);
        mv.visitJumpInsn(IFNULL, isNull);

        // is non null
        {
            mv.visitMethodInsn(INVOKEINTERFACE,
                    CxxSupport.PTR_CONSTVOIDPTR_ITF.getInternalName(),
                    "getPeer",
                    Type.getMethodDescriptor(CxxSupport.PTR_POINTER_CLS),
                    true);
            mv.visitMethodInsn(INVOKEVIRTUAL,
                    CxxSupport.PTR_POINTER_CLS.getInternalName(),
                    "getPeer",
                    Type.getMethodDescriptor(Type.LONG_TYPE),
                    false);
            mv.visitJumpInsn(GOTO, join);
        }

        // is null
        {
            mv.visitLabel(isNull);
            mv.visitInsn(POP);
            mv.visitInsn(LCONST_0);
        }

        // join
        mv.visitLabel(join);
    }

    /**
     * Generates code which pops the top CxxObject on the stack and replaces it with its _cxx_rt_peer.
     *
     * @param mv        Method visitor
     * @param checkNull Handle null object case
     */
    public static void swapCxxObjectWithItsPeer(MethodVisitor mv, final boolean checkNull) {
        final Label then;
        final Label join;
        if (checkNull) {
            then = new Label();
            join = new Label();

            // if
            mv.visitInsn(DUP);
            mv.visitJumpInsn(IFNONNULL, then);

            // else
            mv.visitInsn(POP);
            mv.visitInsn(LCONST_0);
            mv.visitJumpInsn(GOTO, join);

            // then
            mv.visitLabel(then);
        } else {
            join = null;
        }

        mv.visitTypeInsn(CHECKCAST, CxxSupport.CXX_OBJECT_ITF.getInternalName());
        mv.visitMethodInsn(INVOKEINTERFACE,
                CxxSupport.CXX_OBJECT_ITF.getInternalName(),
                "_cxx_rt_peer",
                Type.getMethodDescriptor(Type.LONG_TYPE),
                true);

        if (checkNull) {
            // join
            mv.visitLabel(join);
        }
    }

    /**
     * Generates code which pops the top long on the stack and pushes back a related CxxObject subclass.
     *
     * @param mv           Method visitor
     * @param type         Type to expect
     * @param localManager Local variable manager
     * @param analyzer     Analyzer
     */
    private static void CxxRuntime_getOrConstruct(MethodVisitor mv, CxxType type, CxxUtils.LocalManager localManager,
                                                  CxxAnalyzer analyzer) {
        final CxxClassInfo itf = type.getClassInfoForCxxObjectType();
        if (itf.isInherited) {
            CxxRuntime_getOrConstruct_inherited(mv, itf);
            return;
        }

        ITypeResolverPlugin typeResolverPlugin;
        if ((typeResolverPlugin = CxxType.getTypeResolverForType(type)) != null) {
            CxxRuntime_getOrConstruct_dynamicType(mv, type, localManager, itf, typeResolverPlugin);
        } else if (type.isConstCxxObjectKind()) {
            final Type implClass = analyzer.getDeclCollection(itf, null).getConstImplClass();
            CxxRuntime_getOrConstruct_binding(mv, localManager, itf, implClass, true);
        } else {
            final Type implClass = analyzer.getDeclCollection(itf, null).getImplClass();
            CxxRuntime_getOrConstruct_binding(mv, localManager, itf, implClass, false);
        }
    }

    private static void CxxRuntime_getOrConstruct_inherited(MethodVisitor mv, CxxClassInfo itf) {
        // CxxRuntime.get(peer)
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "get",
                Type.getMethodDescriptor(CxxSupport.CXX_OBJECT_ITF, Type.LONG_TYPE),
                false);
        mv.visitTypeInsn(CHECKCAST, itf.mapperType.getInternalName());
    }

    private static void CxxRuntime_getOrConstruct_dynamicType(MethodVisitor mv, CxxType type,
                                                              CxxUtils.LocalManager localManager, CxxClassInfo itf,
                                                              ITypeResolverPlugin plugin) {
        final int nextIndex = localManager.getNextIndex();
        final CxxUtils.Local peer = localManager.getNext("__cxx_GOC" + nextIndex, Type.LONG_TYPE, 2);
        final CxxUtils.Local rslt = localManager.getNext("__cxx_GOC" + nextIndex + "_R", itf.mapperType, 1);
        final Label endL = new Label();

        // Local variable start labels
        mv.visitLabel(peer.start);
        mv.visitLabel(rslt.start);

        // Save peer
        mv.visitVarInsn(LSTORE, peer.index);

        // CxxRuntime.get(peer)
        mv.visitVarInsn(LLOAD, peer.index);
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "get",
                Type.getMethodDescriptor(CxxSupport.CXX_OBJECT_ITF, Type.LONG_TYPE),
                false);
        mv.visitInsn(DUP);
        mv.visitTypeInsn(INSTANCEOF, itf.mapperType.getInternalName());
        mv.visitJumpInsn(IFNE, endL);

        // Construct
        mv.visitInsn(POP);
        mv.visitVarInsn(LLOAD, peer.index);
        mv.visitVarInsn(LLOAD, peer.index);
        final String getterMethod;
        if (type.isConstCxxObjectKind()) {
            getterMethod = "getConstClassForType";
        } else {
            getterMethod = "getClassForType";
        }
        mv.visitMethodInsn(INVOKESTATIC,
                plugin.getImplementingClass() + "$__cxx_TypeRes",
                getterMethod,
                Type.getMethodDescriptor(Type.getObjectType("java/lang/Class"), Type.LONG_TYPE),
                false);
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "construct",
                Type.getMethodDescriptor(CxxSupport.CXX_OBJECT_ITF, Type.LONG_TYPE,
                        Type.getObjectType("java/lang/Class")),
                false);

        // Join
        mv.visitLabel(endL);
        mv.visitTypeInsn(CHECKCAST, itf.mapperType.getInternalName());
        mv.visitVarInsn(ASTORE, rslt.index);
        mv.visitVarInsn(ALOAD, rslt.index);

        // Local variable end labels
        mv.visitLabel(peer.end);
        mv.visitLabel(rslt.end);
    }

    private static void CxxRuntime_getOrConstruct_binding(MethodVisitor mv, CxxUtils.LocalManager localManager,
                                                          CxxClassInfo itf, Type implClass, boolean isConst) {
        final int nextIndex = localManager.getNextIndex();
        final CxxUtils.Local peer = localManager.getNext("__cxx_GOC" + nextIndex, Type.LONG_TYPE, 2);
        final CxxUtils.Local rslt = localManager.getNext("__cxx_GOC" + nextIndex + "_R", itf.mapperType, 1);
        final Label endL = new Label();
        final Label constructL = new Label();

        // Local variable start labels
        mv.visitLabel(peer.start);
        mv.visitLabel(rslt.start);

        // Save peer
        mv.visitVarInsn(LSTORE, peer.index);

        // CxxRuntime.get(peer)
        mv.visitVarInsn(LLOAD, peer.index);
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "get",
                Type.getMethodDescriptor(CxxSupport.CXX_OBJECT_ITF, Type.LONG_TYPE),
                false);
        mv.visitInsn(DUP);
        mv.visitTypeInsn(INSTANCEOF, itf.mapperType.getInternalName());
        mv.visitJumpInsn(IFEQ, constructL);

        // Check const-nes
        mv.visitInsn(DUP);
        mv.visitTypeInsn(INSTANCEOF, CxxSupport.CXX_CONST_IMPL_ITF.getInternalName());
        mv.visitJumpInsn(isConst ? IFEQ : IFNE, constructL);

        // Store
        mv.visitTypeInsn(CHECKCAST, itf.mapperType.getInternalName());
        mv.visitVarInsn(ASTORE, rslt.index);
        mv.visitJumpInsn(GOTO, endL);

        // Construct
        mv.visitLabel(constructL);
        mv.visitInsn(POP);
        mv.visitTypeInsn(NEW, implClass.getInternalName());
        mv.visitInsn(DUP);
        mv.visitVarInsn(LLOAD, peer.index);
        mv.visitMethodInsn(INVOKESPECIAL, implClass.getInternalName(), "<init>", "(J)V", false);
        mv.visitVarInsn(ASTORE, rslt.index);

        // Join
        mv.visitLabel(endL);
        mv.visitVarInsn(ALOAD, rslt.index);

        // Local variable end labels
        mv.visitLabel(peer.end);
        mv.visitLabel(rslt.end);
    }

    /**
     * Generates code which pops the top Java object and retrieves the associated unique ID.
     *
     * @param mv Method visitor
     */
    public static void CxxRuntime_getUIDForObject(MethodVisitor mv) {
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "getUIDForObject",
                Type.getMethodDescriptor(Type.LONG_TYPE, Type.getObjectType("java/lang/Object")),
                false);
    }

    /**
     * Generates code which pops the top long on the stack and retrieves the associated Java object.
     *
     * @param mv   Method visitor
     * @param type Type
     */
    public static void CxxRuntime_getObjectForUID(MethodVisitor mv, CxxType type) {
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "getObjectForUID",
                Type.getMethodDescriptor(Type.getObjectType("java/lang/Object"), Type.LONG_TYPE),
                false);
        mv.visitTypeInsn(CHECKCAST, type.getTypeForJavaObjectType().getInternalName());
    }

    /**
     * Generates code which pops the top long on the stack and constructs a Java Ptr object.
     *
     * @param mv   Method visitor
     * @param type Type
     */
    public static void CxxRuntime_constructPtrForPeer(MethodVisitor mv, CxxType type) {
        if (!type.isPtr() && !type.isRef()) {
            throw new IllegalStateException();
        }
        int depth = 0;
        CxxType rootType = type;
        while (rootType.isPtr()) {
            ++depth;
            rootType = rootType.getInnerTypeForPtr();
        }
        if (rootType.isRef()) {
            ++depth;
            rootType = rootType.getInnerTypeForRef();
        }
        mv.visitLdcInsn(depth);
        mv.visitLdcInsn(rootType.getPtrElementClass());
        mv.visitMethodInsn(INVOKESTATIC,
                CxxSupport.CXX_RUNTIME.getInternalName(),
                "constructPtrForPeer",
                Type.getMethodDescriptor(Type.getObjectType("org/moe/natj/general/ptr/ConstVoidPtr"), Type.LONG_TYPE, Type.INT_TYPE, Type.getObjectType("java/lang/Class")),
                false);
        mv.visitTypeInsn(CHECKCAST, type.getPtrClass().getInternalName());
    }

    /**
     * Generates the 'getClassForType' method for type resolvers.
     *
     * @param cw        ClassWriter
     * @param clazzName Class name
     * @param isConst   Generate the constant variant of this method
     */
    public static void typeResolverClassForType(ClassWriter cw, String clazzName, boolean isConst) {
        final String methodName = isConst ? "getConstClassForType" : "getClassForType";
        final String mapName = isConst ? "constMap" : "map";
        final MethodVisitor mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC,
                methodName,
                Type.getMethodDescriptor(Type.getObjectType("java/lang/Class"), Type.LONG_TYPE),
                null,
                new String[]{});
        mv.visitCode();
        mv.visitFieldInsn(GETSTATIC, clazzName, mapName, "Ljava/util/HashMap;");
        mv.visitVarInsn(LLOAD, 0);
        mv.visitMethodInsn(INVOKESTATIC,
                clazzName,
                "getTypeIndex",
                Type.getMethodDescriptor(Type.INT_TYPE, Type.LONG_TYPE),
                false);
        mv.visitMethodInsn(INVOKESTATIC,
                "java/lang/Integer",
                "valueOf",
                Type.getMethodDescriptor(Type.getObjectType("java/lang/Integer"), Type.INT_TYPE),
                false);
        mv.visitMethodInsn(INVOKEVIRTUAL,
                "java/util/HashMap",
                "get",
                Type.getMethodDescriptor(Type.getObjectType("java/lang/Object"),
                        Type.getObjectType("java/lang/Object")),
                false);
        mv.visitTypeInsn(CHECKCAST, "java/lang/Class");

        // Close
        mv.visitInsn(ARETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Generates the 'getTypeIndex' method for type resolvers.
     *
     * @param cw ClassWriter
     */
    public static void typeResolverTypeIndex(ClassWriter cw) {
        final MethodVisitor mv = cw.visitMethod(ACC_PRIVATE + ACC_STATIC + ACC_NATIVE,
                "getTypeIndex",
                Type.getMethodDescriptor(Type.INT_TYPE, Type.LONG_TYPE),
                null,
                new String[]{});
        mv.visitEnd();
    }

    /**
     * Generates the 'getTypeIndex' method for type resolvers.
     *
     * @param cw            ClassWriter
     * @param clazzName     Class name
     * @param configuration Type resolver plugin configuration
     */
    public static void typeResolverTypeIndexMap(ClassWriter cw, String clazzName,
                                                TypeResolverPluginConfiguration configuration) {
        final Type IntegerType = Type.getObjectType("java/lang/Integer");
        final Type ObjectType = Type.getObjectType("java/lang/Object");
        final String HashMapType = "java/util/HashMap";

        final MethodVisitor mv = cw.visitMethod(ACC_PUBLIC + ACC_STATIC,
                "<clinit>",
                Type.getMethodDescriptor(Type.VOID_TYPE),
                null,
                new String[]{});
        mv.visitCode();
        // Create const map
        mv.visitTypeInsn(NEW, HashMapType);
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, HashMapType, "<init>", "()V", false);
        mv.visitFieldInsn(PUTSTATIC, clazzName, "constMap", "Ljava/util/HashMap;");

        // Create map
        mv.visitTypeInsn(NEW, HashMapType);
        mv.visitInsn(DUP);
        mv.visitMethodInsn(INVOKESPECIAL, HashMapType, "<init>", "()V", false);
        mv.visitFieldInsn(PUTSTATIC, clazzName, "map", "Ljava/util/HashMap;");

        configuration.getTypeMap().entrySet().forEach(entry -> {
            final Integer key = entry.getKey();
            final String value = entry.getValue();

            // Inject to const map
            mv.visitFieldInsn(GETSTATIC, clazzName, "constMap", "Ljava/util/HashMap;");
            mv.visitLdcInsn(key);
            mv.visitMethodInsn(INVOKESTATIC,
                    IntegerType.getInternalName(),
                    "valueOf",
                    Type.getMethodDescriptor(IntegerType, Type.INT_TYPE),
                    false);
            mv.visitLdcInsn(Type.getObjectType(value + "$__cxx_ConstImpl"));
            mv.visitMethodInsn(INVOKEVIRTUAL,
                    HashMapType,
                    "put",
                    Type.getMethodDescriptor(ObjectType, ObjectType, ObjectType),
                    false);
            mv.visitInsn(POP);

            // Inject into map
            mv.visitFieldInsn(GETSTATIC, clazzName, "map", "Ljava/util/HashMap;");
            mv.visitLdcInsn(key);
            mv.visitMethodInsn(INVOKESTATIC,
                    IntegerType.getInternalName(),
                    "valueOf",
                    Type.getMethodDescriptor(IntegerType, Type.INT_TYPE),
                    false);
            mv.visitLdcInsn(Type.getObjectType(value + "$__cxx_Impl"));
            mv.visitMethodInsn(INVOKEVIRTUAL,
                    HashMapType,
                    "put",
                    Type.getMethodDescriptor(ObjectType, ObjectType, ObjectType),
                    false);
            mv.visitInsn(POP);
        });

        // Close
        mv.visitInsn(RETURN);
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }

    /**
     * Creates a Java bridge method for specialized interface methods.
     *
     * @param owningClass   Owning class
     * @param writer        Class writer
     * @param node          Method node
     * @param oldMethodType Old method type
     * @param newMethodType New method type
     * @param isInInterface Is generating bridge method into an interface
     */
    public static void createInterfaceBridgeMethod(String owningClass, ClassWriter writer, MethodNode node,
                                                   Type oldMethodType, Type newMethodType, boolean isInInterface) {
        int brAccess = node.access & ~ACC_ABSTRACT | ACC_BRIDGE | ACC_SYNTHETIC;
        final String[] exceptions = (String[]) node.exceptions.toArray(new String[node.exceptions.size()]);
        final MethodVisitor mv = writer.visitMethod(brAccess, node.name, node.desc, null, exceptions);
        mv.visitCode();
        final Label start = new Label();
        mv.visitLabel(start);
        mv.visitLineNumber(1, start);

        // Load this
        mv.visitVarInsn(ALOAD, 0);

        // Load and check parameters
        Type[] oldArgumentTypes = oldMethodType.getArgumentTypes();
        Type[] newArgumentTypes = newMethodType.getArgumentTypes();
        int localIndex = 1;
        for (int i = 0, length = oldArgumentTypes.length; i < length; i++) {
            Type oldType = oldArgumentTypes[i];
            Type newType = newArgumentTypes[i];
            if (oldType.getSort() != newType.getSort()) {
                throw new IllegalStateException("Conflicting parameter types for specialized method");
            }
            localIndex += BCGen.loadType(mv, oldType, localIndex);
            if (!oldType.equals(newType)) {
                mv.visitTypeInsn(CHECKCAST, newType.getInternalName());
            }
        }

        // Invoke bridged method
        final int opcode = isInInterface ? INVOKEINTERFACE : INVOKEVIRTUAL;
        mv.visitMethodInsn(opcode, owningClass, node.name, newMethodType.getDescriptor(), isInInterface);

        // Return and close
        BCGen.returnType(mv, newMethodType.getReturnType());
        mv.visitMaxs(0, 0);
        mv.visitEnd();
    }
}
