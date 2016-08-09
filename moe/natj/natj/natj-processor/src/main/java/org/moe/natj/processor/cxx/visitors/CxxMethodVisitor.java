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

package org.moe.natj.processor.cxx.visitors;

import org.moe.natj.processor.cxx.BCGen;
import org.moe.natj.processor.cxx.CxxClassInfo;
import org.moe.natj.processor.cxx.CxxDeclCollection;
import org.moe.natj.processor.cxx.CxxType;
import org.moe.natj.processor.cxx.decl.DeclBuilder;
import org.moe.natj.processor.cxx.decl.DeclInfo;
import org.moe.natj.processor.cxx.decl.ParamInfo;
import org.moe.natj.processor.cxx.decl.invokable.ConstructorInfo;
import org.moe.natj.processor.cxx.decl.invokable.InvokableKind;
import org.moe.natj.processor.cxx.decl.variable.VariableKind;
import org.moe.natj.processor.cxx.utility.DiagMethodVisitor;
import org.moe.natj.processor.cxx.utility.MethodDiagInfo;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.Type;
import org.objectweb.asm.tree.MethodNode;

import static org.objectweb.asm.Opcodes.ACC_NATIVE;
import static org.objectweb.asm.Opcodes.ACC_STATIC;

/**
 * This method visitor processes method of classes/interfaces marked with CxxClass or CxxInheritedClass.
 */
public class CxxMethodVisitor extends DiagMethodVisitor {
    /**
     * Method is static flag.
     */
    private final boolean isStatic;

    /**
     * Method node flag.
     */
    private final MethodNode node;

    /**
     * Declaration builder.
     */
    private final DeclBuilder builder;

    /**
     * C++ analyzer.
     */
    private final CxxAnalyzer analyzer;

    /**
     * Owning CxxClassInfo.
     */
    private final CxxClassInfo classInfo;

    /**
     * Owning CxxClassVisitor.
     */
    private final CxxClassVisitor processor;

    /**
     * Processed parameter index.
     */
    private int paramIndex = 0;

    /**
     * Create a new CxxMethodVisitor instance.
     *
     * @param node      Method node
     * @param analyzer  C++ analyzer
     * @param classInfo Owning CxxClassInfo
     * @param processor Owning CxxClassVisitor
     */
    public CxxMethodVisitor(MethodNode node, CxxAnalyzer analyzer, CxxClassInfo classInfo, CxxClassVisitor processor) {
        super(node, new MethodDiagInfo(processor.getClassDiagInfo(), node));

        if (node == null) {
            throw new NullPointerException();
        }
        if (analyzer == null) {
            throw new NullPointerException();
        }

        this.isStatic = (node.access & ACC_STATIC) == ACC_STATIC;
        this.node = node;
        this.builder = new DeclBuilder(node.access, node.name, node.desc, node.signature, analyzer);
        this.analyzer = analyzer;
        this.classInfo = classInfo;
        this.processor = processor;
    }

    @Override
    public AnnotationVisitor diagVisitAnnotation(String desc, boolean visible) {
        final AnnotationVisitor superAnnVisitor = super.diagVisitAnnotation(desc, visible);
        AnnotationVisitor resultVisitor = builder.applyAnnotation(desc, superAnnVisitor, classInfo);
        if (resultVisitor != null) {
            return resultVisitor;
        }
        resultVisitor = CxxType.applyAnnotation(builder.getType(), desc, superAnnVisitor);
        if (resultVisitor != null) {
            return resultVisitor;
        }
        return superAnnVisitor;
    }

    @Override
    public void diagVisitParameter(String name, int access) {
        ParamInfo param = builder.getParams().get(paramIndex++);
        param.setName(name);
        param.setAccess(access);
        super.diagVisitParameter(name, access);
    }

    @Override
    public AnnotationVisitor diagVisitParameterAnnotation(int parameter, String desc, boolean visible) {
        final AnnotationVisitor superAnnVisitor = super.diagVisitParameterAnnotation(parameter, desc, visible);
        final AnnotationVisitor resultVisitor = CxxType.applyAnnotation(
                builder.getParams().get(parameter).getType(), desc, superAnnVisitor);
        if (resultVisitor != null) {
            return resultVisitor;
        }
        return superAnnVisitor;
    }

    @Override
    public void diagVisitEnd() {
        super.diagVisitEnd();

        // Get decl info
        final DeclInfo info = builder.createInfo();
        if (info == null) {
            node.accept(processor.getClassVisitor());
            return;
        }
        if (classInfo == null && info.getKindInfo().isClassMember()) {
            System.out.println("Ignoring method " + node.name + node.desc + " in class " + processor.getName());
            node.accept(processor.getClassVisitor());
            return;
        }

        CxxDeclCollection collection = analyzer.getDeclCollection(classInfo, processor.getName());

        // For class members, simply add
        if (info.getKindInfo().isClassMember()) {
            if (isStatic) {
                throw new RuntimeException("Assertion failed");
            }
            if (classInfo == null) {
                throw new IllegalStateException();
            }
            classInfo.addMember(info);
            if (classInfo.isInherited) {
                final int infoAccess = info.getAccess();
                if ((infoAccess & ACC_NATIVE) == 0) {
                    node.accept(processor.getClassVisitor());
                    BCGen.toJavaBridge(processor.getClassVisitor(), info, node, classInfo.mapperType, analyzer);
                } else {
                    BCGen.toNativeBridgeInvoker(processor.getClassVisitor(), info, collection.getImplClass(),
                            analyzer);
                }
            } else {
                node.accept(processor.getClassVisitor());
            }
            return;
        }

        if (!isStatic) {
            throw new RuntimeException("Assertion failed");
        }

        // For non-class members, handle appropriately
        collection.add(info);

        if (info.getKindInfo() instanceof InvokableKind) {
            InvokableKind kind = (InvokableKind) info.getKindInfo();
            switch (kind) {
                case FUNCTION:
                case OPERATOR_FUNCTION:
                case CLASS_METHOD: {
                    BCGen.toNativeBridgeInvoker(processor.getClassVisitor(), info, collection.getImplClass(), analyzer);
                    return;
                }
                case CONSTRUCTOR: {
                    // Lookup impl class
                    final CxxClassInfo constructedClassInfo = ((ConstructorInfo) info).getClassInfo();
                    if (constructedClassInfo.isInherited) {
                        BCGen.inheritedConstructorBridge(processor.getClassVisitor(), info, node, collection.getImplClass());
                    } else {
                        final CxxDeclCollection coll = analyzer.getDeclCollection(constructedClassInfo, null);
                        final Type constructedClassType = coll.getImplClass();
                        BCGen.constructorBridge(processor.getClassVisitor(), info, node, constructedClassType, collection.getImplClass());
                    }
                    return;
                }
            }
            throw new IllegalStateException();
        }

        if (info.getKindInfo() instanceof VariableKind) {
            VariableKind kind = (VariableKind) info.getKindInfo();
            switch (kind) {
                case GLOBAL_VARIABLE_GETTER:
                case GLOBAL_VARIABLE_SETTER:
                case CLASS_FIELD_GETTER:
                case CLASS_FIELD_SETTER: {
                    BCGen.toNativeBridgeInvoker(processor.getClassVisitor(), info, collection.getImplClass(), analyzer);
                    return;
                }
            }
            throw new IllegalStateException();
        }

        throw new IllegalStateException();
    }
}
