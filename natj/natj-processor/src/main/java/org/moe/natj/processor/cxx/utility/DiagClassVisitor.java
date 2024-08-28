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

package org.moe.natj.processor.cxx.utility;

import org.objectweb.asm.*;

import static org.objectweb.asm.Opcodes.ASM5;

/**
 * This class is a wrapper class for ClassVisitor. It adds detailed diagnostic information to exceptions.
 */
public class DiagClassVisitor extends ClassVisitor {

    /**
     * Class information.
     */
    private ClassDiagInfo classDiagInfo;

    /**
     * Creates a new DiagClassVisitor instance.
     */
    protected DiagClassVisitor() {
        super(ASM5);
    }

    /**
     * Creates a new DiagClassVisitor instance.
     *
     * @param cv Class visitor
     */
    protected DiagClassVisitor(ClassVisitor cv) {
        super(ASM5, cv);
    }

    /**
     * Returns class information.
     *
     * @return Class information
     */
    public ClassDiagInfo getClassDiagInfo() {
        return classDiagInfo;
    }

    @Override
    /**/ public final void visit(int version, int access, String name, String signature, String superName,
                                 String[] interfaces) {
        classDiagInfo = new ClassDiagInfo(version, access, name, signature, superName, interfaces);
        try {
            diagVisit(version, access, name, signature, superName, interfaces);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            throw pex;
        }
    }

    @Override
    /**/ public final void visitSource(String source, String debug) {
        try {
            diagVisitSource(source, debug);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("source", source);
            pex.put("debug", debug);
            throw pex;
        }
    }

    @Override
    /**/ public final void visitOuterClass(String owner, String name, String desc) {
        try {
            diagVisitOuterClass(owner, name, desc);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("owner", owner);
            pex.put("name", name);
            pex.put("desc", desc);
            throw pex;
        }
    }

    @Override
    /**/ public final AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        try {
            return diagVisitAnnotation(desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public final AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        try {
            return diagVisitTypeAnnotation(typeRef, typePath, desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("typeRef", typeRef);
            pex.put("typePath", typePath);
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public final void visitAttribute(Attribute attr) {
        try {
            diagVisitAttribute(attr);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("attr", attr);
            throw pex;
        }
    }

    @Override
    /**/ public final void visitInnerClass(String name, String outerName, String innerName, int access) {
        try {
            diagVisitInnerClass(name, outerName, innerName, access);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("name", name);
            pex.put("outerName", outerName);
            pex.put("innerName", innerName);
            pex.put("access", access);
            throw pex;
        }
    }

    @Override
    /**/ public final FieldVisitor visitField(int access, String name, String desc, String signature, Object value) {
        try {
            return diagVisitField(access, name, desc, signature, value);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("access", access);
            pex.put("name", name);
            pex.put("desc", desc);
            pex.put("signature", signature);
            pex.put("value", value);
            throw pex;
        }
    }

    @Override
    /**/ public final MethodVisitor visitMethod(int access, String name, String desc, String signature,
                                                String[] exceptions) {
        try {
            return diagVisitMethod(access, name, desc, signature, exceptions);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("access", access);
            pex.put("name", name);
            pex.put("desc", desc);
            pex.put("signature", signature);
            pex.put("exceptions", exceptions);
            throw pex;
        }
    }

    @Override
    /**/ public final void visitEnd() {
        try {
            diagVisitEnd();
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(classDiagInfo);
            pex.setMessage(ex.getMessage());
            throw pex;
        }
    }

    /**
     * Bridge method for visit.
     * <p/>
     * See: {@link #visit(int, int, String, String, String, String[])}
     */
    protected void diagVisit(int version, int access, String name, String signature, String superName,
                             String[] interfaces) {
        super.visit(version, access, name, signature, superName, interfaces);
    }

    /**
     * Bridge method for visitSource.
     * <p/>
     * {@link #visitSource(String, String)}
     */
    protected void diagVisitSource(String source, String debug) {
        super.visitSource(source, debug);
    }

    /**
     * Bridge method for visitOuterClass.
     * <p/>
     * {@link #visitOuterClass(String, String, String)}
     */
    protected void diagVisitOuterClass(String owner, String name, String desc) {
        super.visitOuterClass(owner, name, desc);
    }

    /**
     * Bridge method for visitAnnotation.
     * <p/>
     * {@link #visitAnnotation(String, boolean)}
     */
    protected AnnotationVisitor diagVisitAnnotation(String desc, boolean visible) {
        return super.visitAnnotation(desc, visible);
    }

    /**
     * Bridge method for visitTypeAnnotation.
     * <p/>
     * {@link #visitTypeAnnotation(int, TypePath, String, boolean)}
     */
    protected AnnotationVisitor diagVisitTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        return super.visitTypeAnnotation(typeRef, typePath, desc, visible);
    }

    /**
     * Bridge method for visitAttribute.
     * <p/>
     * {@link #visitAttribute(Attribute)}
     */
    protected void diagVisitAttribute(Attribute attr) {
        super.visitAttribute(attr);
    }

    /**
     * Bridge method for visitInnerClass.
     * <p/>
     * {@link #visitInnerClass(String, String, String, int)}
     */
    protected void diagVisitInnerClass(String name, String outerName, String innerName, int access) {
        super.visitInnerClass(name, outerName, innerName, access);
    }

    /**
     * Bridge method for visitField.
     * <p/>
     * {@link #visitField(int, String, String, String, Object)}
     */
    protected FieldVisitor diagVisitField(int access, String name, String desc, String signature, Object value) {
        return super.visitField(access, name, desc, signature, value);
    }

    /**
     * Bridge method for visitMethod.
     * <p/>
     * {@link #visitMethod(int, String, String, String, String[])}
     */
    protected MethodVisitor diagVisitMethod(int access, String name, String desc, String signature,
                                            String[] exceptions) {
        return super.visitMethod(access, name, desc, signature, exceptions);
    }

    /**
     * Bridge method for visitEnd.
     * <p/>
     * {@link #visitEnd()}
     */
    protected void diagVisitEnd() {
        super.visitEnd();
    }
}
