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

package org.moe.natj.processor.cxx.decl;

import org.moe.natj.processor.cxx.CxxClassInfo;
import org.moe.natj.processor.cxx.CxxSupport;
import org.moe.natj.processor.cxx.CxxType;
import org.moe.natj.processor.cxx.CxxTypeKind;
import org.moe.natj.processor.cxx.decl.invokable.InvokableInfo;
import org.moe.natj.processor.cxx.decl.invokable.InvokableKind;
import org.moe.natj.processor.cxx.decl.invokable.MethodVirtuality;
import org.moe.natj.processor.cxx.decl.invokable.OperatorKind;
import org.moe.natj.processor.cxx.decl.variable.VariableInfo;
import org.moe.natj.processor.cxx.decl.variable.VariableKind;
import org.moe.natj.processor.cxx.visitors.CxxAnalyzer;
import org.moe.natj.processor.cxx.visitors.CxxAnnotationVisitors;
import org.moe.natj.processor.signature.JavaTypeSignature;
import org.moe.natj.processor.signature.MethodSignature;
import org.moe.natj.processor.signature.SignatureParser;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Type;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.objectweb.asm.Opcodes.ACC_STATIC;

/**
 * Declaration builder class.
 */
public final class DeclBuilder {

    /**
     * Access flags.
     */
    private final int access;

    /**
     * Name.
     */
    private final String name;

    /**
     * Original method's descriptor.
     */
    private final Type desc;

    /**
     * Original method's signature.
     */
    private final String signature;

    /**
     * Parameters.
     */
    private final List<ParamInfo> params;

    /**
     * Return type.
     */
    private final CxxType type;

    /**
     * Method is static.
     */
    private final boolean isStatic;

    /**
     * Invokable/Variable kind.
     */
    private IKindInfo kind;

    /**
     * C++ identifier or null if getName() should provide this value.
     */
    private String explicitNativeID;

    /**
     * Method virtuality.
     */
    private MethodVirtuality virtuality;

    /**
     * Operator kind.
     */
    private OperatorKind operatorKind;

    /**
     * Type of the constructed value.
     */
    private CxxClassInfo constructorClassInfo;

    /**
     * Invokable is on a const object.
     */
    private boolean invokableIsConst = false;

    /**
     * Field is marked as mutating.
     */
    private boolean fieldIsMutating = false;

    /**
     * Creates a new DeclBuilder instance.
     *
     * @param access   Method access flags
     * @param name     Method name
     * @param desc     Method descriptor
     * @param sign     Method signature
     * @param analyzer C++ analyzer
     */
    public DeclBuilder(int access, String name, String desc, String sign, CxxAnalyzer analyzer) {
        if (name == null) {
            throw new NullPointerException();
        }
        if (desc == null) {
            throw new NullPointerException();
        }
        this.access = access;
        this.name = name;
        this.desc = Type.getMethodType(desc);
        this.signature = sign;
        this.isStatic = (access & ACC_STATIC) == ACC_STATIC;

        // Parse parameters and type
        ArrayList<ParamInfo> params = new ArrayList<>();
        if (signature != null) {
            final MethodSignature methodSignature = SignatureParser.parseMethodSignature(signature);

            if (methodSignature.parameters.size() == this.desc.getArgumentTypes().length) {
                type = CxxType.fromType(this.desc.getReturnType(), methodSignature.result, analyzer);
                final Type[] descTypes = this.desc.getArgumentTypes();
                final List<JavaTypeSignature> sigTypes = methodSignature.parameters;
                for (int i = 0, numDescTypes = descTypes.length; i < numDescTypes; i++) {
                    final Type argType = descTypes[i];
                    final JavaTypeSignature argSignature = sigTypes.get(i);
                    final CxxType paramType = CxxType.fromType(argType, argSignature, analyzer);
                    params.add(new ParamInfo(paramType));
                }

            } else {
                type = processTypeInfoNoSignature(analyzer, params);
            }

        } else {
            type = processTypeInfoNoSignature(analyzer, params);
        }
        this.params = Collections.unmodifiableList(params);
    }

    /**
     * Processes type information assuming there is no usable signature.
     *
     * @param analyzer C++ analyzer
     * @param params   Parameter information list
     * @return Processed return type
     */
    private CxxType processTypeInfoNoSignature(CxxAnalyzer analyzer, ArrayList<ParamInfo> params) {
        for (Type argType : this.desc.getArgumentTypes()) {
            params.add(new ParamInfo(CxxType.fromType(argType, null, analyzer)));
        }
        return CxxType.fromType(this.desc.getReturnType(), null, analyzer);
    }

    /**
     * Creates a DeclInfo instance from the specified attributes.
     *
     * @return DeclInfo instance of null
     */
    public DeclInfo createInfo() {
        if (kind == null) {
            return null;
        }

        final JavaMethod javaMethod = new JavaMethod(access, name, desc, signature);
        if (kind instanceof InvokableKind) {
            InvokableKind kind = (InvokableKind) this.kind;
            switch (kind) {
                case FUNCTION:
                    return InvokableInfo.createFunction(javaMethod, params, type, explicitNativeID);
                case OPERATOR_FUNCTION:
                    return InvokableInfo.createOperatorFunction(javaMethod, params, type, operatorKind);
                case CONSTRUCTOR:
                    return InvokableInfo.createConstructor(javaMethod, params, type, constructorClassInfo);
                case INSTANCE_METHOD:
                    return InvokableInfo.createInstanceMethod(javaMethod, params, type, explicitNativeID,
                            virtuality, invokableIsConst);
                case CLASS_METHOD:
                    return InvokableInfo.createClassMethod(javaMethod, params, type, explicitNativeID);
                case OPERATOR:
                    return InvokableInfo.createOperator(javaMethod, params, type, virtuality, operatorKind,
                            invokableIsConst);
                case CAST_OPERATOR:
                    return InvokableInfo.createCastOperator(javaMethod, params, type, virtuality, invokableIsConst);
            }
        }

        if (kind instanceof VariableKind) {
            VariableKind kind = (VariableKind) this.kind;
            switch (kind) {
                case GLOBAL_VARIABLE_GETTER:
                case GLOBAL_VARIABLE_SETTER:
                case CLASS_FIELD_GETTER:
                case CLASS_FIELD_SETTER:
                case INSTANCE_FIELD_GETTER:
                case INSTANCE_FIELD_SETTER:
                    return new VariableInfo(javaMethod, params, type, kind, explicitNativeID, fieldIsMutating);
            }
        }

        throw new IllegalStateException("unreachable");
    }

    /**
     * Applies an annotation on this declaration ot the declarations return type.
     *
     * @param desc            Annotation's descriptor
     * @param superAnnVisitor Super annotation visitor
     * @param classInfo       Class info
     * @return Annotation visitor or null
     */
    public AnnotationVisitor applyAnnotation(String desc, AnnotationVisitor superAnnVisitor, CxxClassInfo classInfo) {
        if (CxxSupport.CXX_FUNCTION_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxFunction(superAnnVisitor, value -> {
                assertKindNotSet();
                if (!isStatic) {
                    throw new RuntimeException("@CxxFunction can only be on static methods");
                }
                kind = InvokableKind.FUNCTION;
                explicitNativeID = value;
            });

        } else if (CxxSupport.CXX_OPERATOR_FUNCTION_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxOperatorFunction(superAnnVisitor, value -> {
                assertKindNotSet();
                if (!isStatic) {
                    throw new RuntimeException("@CxxOperatorFunction can only be on static methods");
                }
                if (value.numOperands() != params.size()) {
                    throw new RuntimeException("Methods marked with @CxxOperatorFunction(" + value.name() + ") " +
                            "must have exactly " + value.numOperands() + " parameters");
                }
                kind = InvokableKind.OPERATOR_FUNCTION;
                operatorKind = value;
            });

        } else if (CxxSupport.CXX_CONSTRUCTOR_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxConstructor(superAnnVisitor, () -> {
                assertKindNotSet();
                if (!isStatic) {
                    throw new RuntimeException("@CxxConstructor can only be on static methods");
                }
                if (type.getKind() != CxxTypeKind.CXX_OBJECT) {
                    throw new RuntimeException("Methods marked with @CxxConstructor can only return CxxObject descendants");
                }
                kind = InvokableKind.CONSTRUCTOR;
                constructorClassInfo = type.getClassInfoForCxxObjectType();
            });

        } else if (CxxSupport.CXX_INHERITED_CONSTRUCTOR_ANN.getDescriptor().equals(desc)) {
            assertKindNotSet();
            if (!isStatic) {
                throw new RuntimeException("@CxxInheritedConstructor can only be on static methods");
            }
            if (type.getKind() != CxxTypeKind.LONGLONG) {
                throw new RuntimeException("Methods marked with @CxxInheritedConstructor can only return long");
            }
            if (params.size() < 1 || params.get(0).getType().getKind() != CxxTypeKind.LONGLONG) {
                throw new RuntimeException("Methods marked with @CxxInheritedConstructor must have at least one " +
                        "arguments and the first argument must be a long for the java reference's parameter");
            }
            if (classInfo == null || !classInfo.isInherited) {
                throw new RuntimeException("Methods marked with @CxxInheritedConstructor must declared in a class" +
                        "marked with @CxxInheritedClass");
            }
            kind = InvokableKind.CONSTRUCTOR;
            constructorClassInfo = classInfo;

        } else if (CxxSupport.CXX_METHOD_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxMethod(superAnnVisitor, (value, methodVirtuality, isConst) -> {
                assertKindNotSet();
                kind = isStatic ? InvokableKind.CLASS_METHOD : InvokableKind.INSTANCE_METHOD;
                explicitNativeID = value;
                virtuality = methodVirtuality;
                invokableIsConst = isConst;
            });

        } else if (CxxSupport.CXX_OPERATOR_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxOperator(superAnnVisitor, (value, methodVirtuality, isConst) -> {
                assertKindNotSet();
                if (isStatic) {
                    throw new RuntimeException("@CxxOperator can only be on non-static methods");
                }
                if (value.numOperands() != -1 && value.numOperands() - 1 != params.size()) {
                    throw new RuntimeException("Methods marked with @CxxOperator(" + value.name() + ") " +
                            "must have exactly " + (value.numOperands() - 1) + " parameters");
                }
                kind = InvokableKind.OPERATOR;
                operatorKind = value;
                virtuality = methodVirtuality;
                invokableIsConst = isConst;
            });

        } else if (CxxSupport.CXX_CAST_OPERATOR_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxCastOperator(superAnnVisitor, (methodVirtuality, isConst) -> {
                assertKindNotSet();
                if (isStatic) {
                    throw new RuntimeException("@CxxCastOperator can only be on non-static methods");
                }
                if (params.size() != 0) {
                    throw new RuntimeException("Methods marked with @CxxCastOperator() " +
                            "cannot have any parameters");
                }
                kind = InvokableKind.CAST_OPERATOR;
                virtuality = methodVirtuality;
                invokableIsConst = isConst;
            });

        } else if (CxxSupport.CXX_FIELD_GETTER_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxFieldGetter(superAnnVisitor, value -> {
                assertKindNotSet();
                if (params.size() != 0) {
                    throw new RuntimeException("Methods marked with @CxxFieldGetter must have exactly 0 parameters");
                }
                kind = isStatic ? VariableKind.CLASS_FIELD_GETTER : VariableKind.INSTANCE_FIELD_GETTER;
                explicitNativeID = value;
            });

        } else if (CxxSupport.CXX_FIELD_SETTER_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxFieldSetter(superAnnVisitor, (value, isMutating) -> {
                assertKindNotSet();
                if (params.size() != 1) {
                    throw new RuntimeException("Methods marked with @CxxFieldSetter must have exactly 1 parameter");
                }
                kind = isStatic ? VariableKind.CLASS_FIELD_SETTER : VariableKind.INSTANCE_FIELD_SETTER;
                explicitNativeID = value;
                fieldIsMutating = isMutating;
            });

        } else if (CxxSupport.CXX_GLOBAL_GETTER_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxGlobalGetter(superAnnVisitor, value -> {
                assertKindNotSet();
                if (!isStatic) {
                    throw new RuntimeException("@CxxGlobalGetter can only be on static methods");
                }
                if (params.size() != 0) {
                    throw new RuntimeException("Methods marked with @CxxGlobalGetter must have exactly 0 parameters");
                }
                kind = VariableKind.GLOBAL_VARIABLE_GETTER;
                explicitNativeID = value;
            });

        } else if (CxxSupport.CXX_GLOBAL_SETTER_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxGlobalSetter(superAnnVisitor, value -> {
                assertKindNotSet();
                if (!isStatic) {
                    throw new RuntimeException("@CxxGlobalSetter can only be on static methods");
                }
                if (params.size() != 1) {
                    throw new RuntimeException("Methods marked with @CxxGlobalSetter must have exactly 1 parameter");
                }
                kind = VariableKind.GLOBAL_VARIABLE_SETTER;
                explicitNativeID = value;
            });

        }
        return null;
    }

    /**
     * Asserts that no declaration kind has yet been set.
     */
    private void assertKindNotSet() {
        if (DeclBuilder.this.kind != null) {
            throw new RuntimeException("declaration kind was already set on this method");
        }
    }

    /**
     * Returns the declaration's access flags.
     *
     * @return Access flags
     */
    public int getAccess() {
        return access;
    }

    /**
     * Returns the declaration's name.
     *
     * @return Name
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the declaration's descriptor.
     *
     * @return Descriptor
     */
    public Type getDesc() {
        return desc;
    }

    /**
     * Returns the declaration's return type.
     *
     * @return Return type
     */
    public CxxType getType() {
        return type;
    }

    /**
     * Returns the declaration's parameter types.
     *
     * @return Parameter types
     */
    public List<ParamInfo> getParams() {
        return params;
    }
}
