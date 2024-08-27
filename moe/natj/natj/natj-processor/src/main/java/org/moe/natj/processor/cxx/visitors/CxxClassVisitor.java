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
import org.moe.natj.processor.cxx.CxxSupport;
import org.moe.natj.processor.cxx.utility.DiagClassVisitor;
import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.ClassVisitor;
import org.objectweb.asm.MethodVisitor;
import org.objectweb.asm.tree.MethodNode;

import static org.objectweb.asm.Opcodes.ACC_BRIDGE;
import static org.objectweb.asm.Opcodes.ACC_STATIC;

/**
 * This class visitor processes classes/interfaces marked with CxxClass or CxxInheritedClass.
 */
public class CxxClassVisitor extends DiagClassVisitor {

    /**
     * Analyzer.
     */
    private final CxxAnalyzer analyzer;

    /**
     * Class/interface name.
     */
    private String name;

    /**
     * Class is a template.
     */
    private boolean isTemplateClass;

    /**
     * C++ class info.
     */
    private CxxClassInfo classInfo;

    /**
     * Create a new CxxClassVisitor.
     *
     * @param next     Next visitor
     * @param analyzer C++ analyzer
     */
    public CxxClassVisitor(ClassVisitor next, CxxAnalyzer analyzer) {
        super(next);
        if (analyzer == null) {
            throw new NullPointerException();
        }
        this.analyzer = analyzer;
    }

    /**
     * Returns the ClassVisitor.
     *
     * @return ClassVisitor
     */
    ClassVisitor getClassVisitor() {
        return cv;
    }

    /**
     * Returns the class' name.
     *
     * @return class' name
     */
    public String getName() {
        return name;
    }

    @Override
    public void diagVisit(int version, int access, String name, String signature, String superName, String[] interfaces) {
        this.name = name;
        this.classInfo = analyzer.getCxxClassInfoForName(name);
        super.diagVisit(version, access, name, signature, superName, interfaces);
    }

    @Override
    public AnnotationVisitor diagVisitAnnotation(String desc, boolean visible) {
        final AnnotationVisitor superAnnVisitor = super.diagVisitAnnotation(desc, visible);
        if (CxxSupport.CXX_TEMPLATE_ANN.getDescriptor().equals(desc)) {
            isTemplateClass = true;

        } else if (CxxSupport.CXX_HEADER_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxHeader(superAnnVisitor, (values, useQuotes) -> {
                if (useQuotes) {
                    analyzer.getUserHeaders().addAll(values);
                } else {
                    analyzer.getHeaders().addAll(values);
                }
            });

        } else if (CxxSupport.CXX_HEADERS_ANN.getDescriptor().equals(desc)) {
            return CxxAnnotationVisitors.CxxHeaders(superAnnVisitor, (values, useQuotes) -> {
                if (useQuotes) {
                    analyzer.getUserHeaders().addAll(values);
                } else {
                    analyzer.getHeaders().addAll(values);
                }
            });

        } else if (classInfo != null) {
            if (CxxSupport.CXX_DESTRUCTOR_UNAVAILABLE_ANN.getDescriptor().equals(desc)) {
                classInfo.setDestructorUnavailable(true);
            } else if (CxxSupport.CXX_COPY_CONSTRUCTOR_UNAVAILABLE_ANN.getDescriptor().equals(desc)) {
                classInfo.setCopyConstructorUnavailable(true);
            } else if (CxxSupport.CXX_DEFAULT_CONSTRUCTOR_UNAVAILABLE_ANN.getDescriptor().equals(desc)) {
                classInfo.setDefaultConstructorUnavailable(true);
            }
        }
        return superAnnVisitor;
    }

    @Override
    public MethodVisitor diagVisitMethod(int access, String name, String desc, String signature, String[] exceptions) {
        // Safe bridge methods for later
        if ((access & ACC_BRIDGE) == ACC_BRIDGE) {
            if (classInfo != null) {
                final MethodNode node = new MethodNode(access, name, desc, signature, exceptions);
                return new BridgeMethodVisitor(node, classInfo, this, () -> {
                    if (getClassDiagInfo().version >= 52 /* Java 8 */) {
                        node.accept(super.diagVisitMethod(access, name, desc, signature, exceptions));
                    }
                });

            } else {
                return super.diagVisitMethod(access, name, desc, signature, exceptions);
            }
        }

        // Ignore non-static template methods
        if (isTemplateClass && (access & ACC_STATIC) == 0) {
            return super.diagVisitMethod(access, name, desc, signature, exceptions);
        }

        // Process methods
        final MethodNode node = new MethodNode(access, name, desc, signature, exceptions);
        return new CxxMethodVisitor(node, analyzer, classInfo, this);
    }

    @Override
    public void diagVisitEnd() {
        // For inherited classes create a delete operator
        if (classInfo != null && classInfo.isInherited) {
            CxxDeclCollection collection = analyzer.getDeclCollection(classInfo, CxxClassVisitor.this.name);
            BCGen.deleteOp(cv, collection.getImplClass());
            BCGen._cxx_rt_release_java(cv, classInfo);
        }

        super.diagVisitEnd();
    }
}
