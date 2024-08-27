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
 * This class is a wrapper class for MethodVisitor. It adds detailed diagnostic information to exceptions.
 */
public class DiagMethodVisitor extends MethodVisitor {

    /**
     * Method information.
     */
    private final MethodDiagInfo methodDiagInfo;

    /**
     * Creates a new DiagClassVisitor instance.
     *
     * @param methodDiagInfo Method information
     */
    protected DiagMethodVisitor(MethodDiagInfo methodDiagInfo) {
        super(ASM5);
        if (methodDiagInfo == null) {
            throw new NullPointerException();
        }
        this.methodDiagInfo = methodDiagInfo;
    }

    /**
     * Creates a new DiagClassVisitor instance.
     *
     * @param mv             Method visitor
     * @param methodDiagInfo Method information
     */
    protected DiagMethodVisitor(MethodVisitor mv, MethodDiagInfo methodDiagInfo) {
        super(ASM5, mv);
        if (methodDiagInfo == null) {
            throw new NullPointerException();
        }
        this.methodDiagInfo = methodDiagInfo;
    }

    /**
     * Returns method information.
     *
     * @return Method information
     */
    public MethodDiagInfo getMethodDiagInfo() {
        return methodDiagInfo;
    }

    @Override
    /**/ public void visitParameter(String name, int access) {
        try {
            diagVisitParameter(name, access);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("name", name);
            pex.put("access", access);
            throw pex;
        }
    }

    @Override
    /**/ public AnnotationVisitor visitAnnotationDefault() {
        try {
            return diagVisitAnnotationDefault();
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            throw pex;
        }
    }

    @Override
    /**/ public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
        try {
            return diagVisitAnnotation(desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public AnnotationVisitor visitTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        try {
            return diagVisitTypeAnnotation(typeRef, typePath, desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("typeRef", typeRef);
            pex.put("typePath", typePath);
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public AnnotationVisitor visitParameterAnnotation(int parameter, String desc, boolean visible) {
        try {
            return diagVisitParameterAnnotation(parameter, desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("parameter", parameter);
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public void visitAttribute(Attribute attr) {
        try {
            diagVisitAttribute(attr);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("attr", attr);
            throw pex;
        }
    }

    @Override
    /**/ public void visitCode() {
        try {
            diagVisitCode();
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            throw pex;
        }
    }

    @Override
    /**/ public void visitFrame(int type, int nLocal, Object[] local, int nStack, Object[] stack) {
        try {
            diagVisitFrame(type, nLocal, local, nStack, stack);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("type", type);
            pex.put("nLocal", nLocal);
            pex.put("local", local);
            pex.put("nStack", nStack);
            pex.put("stack", stack);
            throw pex;
        }
    }

    @Override
    /**/ public void visitInsn(int opcode) {
        try {
            diagVisitInsn(opcode);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            throw pex;
        }
    }

    @Override
    /**/ public void visitIntInsn(int opcode, int operand) {
        try {
            diagVisitIntInsn(opcode, operand);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            pex.put("operand", operand);
            throw pex;
        }
    }

    @Override
    /**/ public void visitVarInsn(int opcode, int var) {
        try {
            diagVisitVarInsn(opcode, var);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            pex.put("var", var);
            throw pex;
        }
    }

    @Override
    /**/ public void visitTypeInsn(int opcode, String type) {
        try {
            diagVisitTypeInsn(opcode, type);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            pex.put("type", type);
            throw pex;
        }
    }

    @Override
    /**/ public void visitFieldInsn(int opcode, String owner, String name, String desc) {
        try {
            diagVisitFieldInsn(opcode, owner, name, desc);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            pex.put("owner", owner);
            pex.put("name", name);
            pex.put("desc", desc);
            throw pex;
        }
    }

    @Override
    @Deprecated
    /**/ public void visitMethodInsn(int opcode, String owner, String name, String desc) {
        try {
            diagVisitMethodInsn(opcode, owner, name, desc);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            pex.put("owner", owner);
            pex.put("name", name);
            pex.put("desc", desc);
            throw pex;
        }
    }

    @Override
    /**/ public void visitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
        try {
            diagVisitMethodInsn(opcode, owner, name, desc, itf);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            pex.put("owner", owner);
            pex.put("name", name);
            pex.put("desc", desc);
            pex.put("itf", itf);
            throw pex;
        }
    }

    @Override
    /**/ public void visitInvokeDynamicInsn(String name, String desc, Handle bsm, Object... bsmArgs) {
        try {
            diagVisitInvokeDynamicInsn(name, desc, bsm, bsmArgs);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("name", name);
            pex.put("desc", desc);
            pex.put("bsm", bsm);
            pex.put("bsmArgs", bsmArgs);
            throw pex;
        }
    }

    @Override
    /**/ public void visitJumpInsn(int opcode, Label label) {
        try {
            diagVisitJumpInsn(opcode, label);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("opcode", opcode);
            pex.put("label", label);
            throw pex;
        }
    }

    @Override
    /**/ public void visitLabel(Label label) {
        try {
            diagVisitLabel(label);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("label", label);
            throw pex;
        }
    }

    @Override
    /**/ public void visitLdcInsn(Object cst) {
        try {
            diagVisitLdcInsn(cst);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("cst", cst);
            throw pex;
        }
    }

    @Override
    /**/ public void visitIincInsn(int var, int increment) {
        try {
            diagVisitIincInsn(var, increment);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("var", var);
            pex.put("increment", increment);
            throw pex;
        }
    }

    @Override
    /**/ public void visitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
        try {
            diagVisitTableSwitchInsn(min, max, dflt, labels);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("min", min);
            pex.put("max", max);
            pex.put("dflt", dflt);
            pex.put("labels", labels);
            throw pex;
        }
    }

    @Override
    /**/ public void visitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
        try {
            diagVisitLookupSwitchInsn(dflt, keys, labels);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("dflt", dflt);
            pex.put("keys", keys);
            pex.put("labels", labels);
            throw pex;
        }
    }

    @Override
    /**/ public void visitMultiANewArrayInsn(String desc, int dims) {
        try {
            diagVisitMultiANewArrayInsn(desc, dims);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("desc", desc);
            pex.put("dims", dims);
            throw pex;
        }
    }

    @Override
    /**/ public AnnotationVisitor visitInsnAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        try {
            return diagVisitInsnAnnotation(typeRef, typePath, desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("typeRef", typeRef);
            pex.put("typePath", typePath);
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public void visitTryCatchBlock(Label start, Label end, Label handler, String type) {
        try {
            diagVisitTryCatchBlock(start, end, handler, type);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("start", start);
            pex.put("end", end);
            pex.put("handler", handler);
            pex.put("type", type);
            throw pex;
        }
    }

    @Override
    /**/ public AnnotationVisitor visitTryCatchAnnotation(int typeRef, TypePath typePath, String desc,
                                                          boolean visible) {
        try {
            return diagVisitTryCatchAnnotation(typeRef, typePath, desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("typeRef", typeRef);
            pex.put("typePath", typePath);
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public void visitLocalVariable(String name, String desc, String signature, Label start, Label end, int index) {
        try {
            diagVisitLocalVariable(name, desc, signature, start, end, index);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("name", name);
            pex.put("desc", desc);
            pex.put("signature", signature);
            pex.put("start", start);
            pex.put("end", end);
            pex.put("index", index);
            throw pex;
        }
    }

    @Override
    /**/ public AnnotationVisitor visitLocalVariableAnnotation(int typeRef, TypePath typePath, Label[] start,
                                                               Label[] end, int[] index, String desc, boolean visible) {
        try {
            return diagVisitLocalVariableAnnotation(typeRef, typePath, start, end, index, desc, visible);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("typeRef", typeRef);
            pex.put("typePath", typePath);
            pex.put("start", start);
            pex.put("end", end);
            pex.put("index", index);
            pex.put("desc", desc);
            pex.put("visible", visible);
            throw pex;
        }
    }

    @Override
    /**/ public void visitLineNumber(int line, Label start) {
        try {
            diagVisitLineNumber(line, start);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("line", line);
            pex.put("start", start);
            throw pex;
        }
    }

    @Override
    /**/ public void visitMaxs(int maxStack, int maxLocals) {
        try {
            diagVisitMaxs(maxStack, maxLocals);
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            pex.put("maxStack", maxStack);
            pex.put("maxLocals", maxLocals);
            throw pex;
        }
    }

    @Override
    /**/ public void visitEnd() {
        try {
            diagVisitEnd();
        } catch (Throwable ex) {
            ProcessorException pex = new ProcessorException(ex);
            pex.setDiagInfo(methodDiagInfo);
            pex.setMessage(ex.getMessage());
            throw pex;
        }
    }

    /**
     * Bridge method for visitParameter.
     * <p/>
     * See: {@link #visitParameter(String, int)}
     */
    protected void diagVisitParameter(String name, int access) {
        super.visitParameter(name, access);
    }

    /**
     * Bridge method for visitAnnotationDefault.
     * <p/>
     * See: {@link #visitAnnotationDefault()}
     */
    protected AnnotationVisitor diagVisitAnnotationDefault() {
        return super.visitAnnotationDefault();
    }

    /**
     * Bridge method for visitAnnotation.
     * <p/>
     * See: {@link #visitAnnotation(String, boolean)}
     */
    protected AnnotationVisitor diagVisitAnnotation(String desc, boolean visible) {
        return super.visitAnnotation(desc, visible);
    }

    /**
     * Bridge method for visitTypeAnnotation.
     * <p/>
     * See: {@link #visitTypeAnnotation(int, TypePath, String, boolean)}
     */
    protected AnnotationVisitor diagVisitTypeAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        return super.visitTypeAnnotation(typeRef, typePath, desc, visible);
    }

    /**
     * Bridge method for visitParameterAnnotation.
     * <p/>
     * See: {@link #visitParameterAnnotation(int, String, boolean)}
     */
    protected AnnotationVisitor diagVisitParameterAnnotation(int parameter, String desc, boolean visible) {
        return super.visitParameterAnnotation(parameter, desc, visible);
    }

    /**
     * Bridge method for visitAttribute.
     * <p/>
     * See: {@link #visitAttribute(Attribute)}
     */
    protected void diagVisitAttribute(Attribute attr) {
        super.visitAttribute(attr);
    }

    /**
     * Bridge method for visitCode.
     * <p/>
     * See: {@link #visitCode()}
     */
    protected void diagVisitCode() {
        super.visitCode();
    }

    /**
     * Bridge method for visitFrame.
     * <p/>
     * See: {@link #visitFrame(int, int, Object[], int, Object[])}
     */
    protected void diagVisitFrame(int type, int nLocal, Object[] local, int nStack, Object[] stack) {
        super.visitFrame(type, nLocal, local, nStack, stack);
    }

    /**
     * Bridge method for visitInsn.
     * <p/>
     * See: {@link #visitInsn(int)}
     */
    protected void diagVisitInsn(int opcode) {
        super.visitInsn(opcode);
    }

    /**
     * Bridge method for visitIntInsn.
     * <p/>
     * See: {@link #visitIntInsn(int, int)}
     */
    protected void diagVisitIntInsn(int opcode, int operand) {
        super.visitIntInsn(opcode, operand);
    }

    /**
     * Bridge method for visitVarInsn.
     * <p/>
     * See: {@link #visitVarInsn(int, int)}
     */
    protected void diagVisitVarInsn(int opcode, int var) {
        super.visitVarInsn(opcode, var);
    }

    /**
     * Bridge method for visitTypeInsn.
     * <p/>
     * See: {@link #visitTypeInsn(int, String)}
     */
    protected void diagVisitTypeInsn(int opcode, String type) {
        super.visitTypeInsn(opcode, type);
    }

    /**
     * Bridge method for visitFieldInsn.
     * <p/>
     * See: {@link #visitFieldInsn(int, String, String, String)}
     */
    protected void diagVisitFieldInsn(int opcode, String owner, String name, String desc) {
        super.visitFieldInsn(opcode, owner, name, desc);
    }

    /**
     * Bridge method for visitMethodInsn.
     * <p/>
     * See: {@link #visitMethodInsn(int, String, String, String)}
     */
    @Deprecated
    protected void diagVisitMethodInsn(int opcode, String owner, String name, String desc) {
        super.visitMethodInsn(opcode, owner, name, desc);
    }

    /**
     * Bridge method for visitMethodInsn.
     * <p/>
     * See: {@link #visitMethodInsn(int, String, String, String, boolean)}
     */
    protected void diagVisitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
        super.visitMethodInsn(opcode, owner, name, desc, itf);
    }

    /**
     * Bridge method for visitInvokeDynamicInsn.
     * <p/>
     * See: {@link #visitInvokeDynamicInsn(String, String, Handle, Object...)}
     */
    protected void diagVisitInvokeDynamicInsn(String name, String desc, Handle bsm, Object... bsmArgs) {
        super.visitInvokeDynamicInsn(name, desc, bsm, bsmArgs);
    }

    /**
     * Bridge method for visitJumpInsn.
     * <p/>
     * See: {@link #visitJumpInsn(int, Label)}
     */
    protected void diagVisitJumpInsn(int opcode, Label label) {
        super.visitJumpInsn(opcode, label);
    }

    /**
     * Bridge method for visitLabel.
     * <p/>
     * See: {@link #visitLabel(Label)}
     */
    protected void diagVisitLabel(Label label) {
        super.visitLabel(label);
    }

    /**
     * Bridge method for visitLdcInsn.
     * <p/>
     * See: {@link #visitLdcInsn(Object)}
     */
    protected void diagVisitLdcInsn(Object cst) {
        super.visitLdcInsn(cst);
    }

    /**
     * Bridge method for visitIincInsn.
     * <p/>
     * See: {@link #visitIincInsn(int, int)}
     */
    protected void diagVisitIincInsn(int var, int increment) {
        super.visitIincInsn(var, increment);
    }

    /**
     * Bridge method for visitTableSwitchInsn.
     * <p/>
     * See: {@link #visitTableSwitchInsn(int, int, Label, Label...)}
     */
    protected void diagVisitTableSwitchInsn(int min, int max, Label dflt, Label... labels) {
        super.visitTableSwitchInsn(min, max, dflt, labels);
    }

    /**
     * Bridge method for visitLookupSwitchInsn.
     * <p/>
     * See: {@link #visitLookupSwitchInsn(Label, int[], Label[])}
     */
    protected void diagVisitLookupSwitchInsn(Label dflt, int[] keys, Label[] labels) {
        super.visitLookupSwitchInsn(dflt, keys, labels);
    }

    /**
     * Bridge method for visitMultiANewArrayInsn.
     * <p/>
     * See: {@link #visitMultiANewArrayInsn(String, int)}
     */
    protected void diagVisitMultiANewArrayInsn(String desc, int dims) {
        super.visitMultiANewArrayInsn(desc, dims);
    }

    /**
     * Bridge method for visitInsnAnnotation.
     * <p/>
     * See: {@link #visitInsnAnnotation(int, TypePath, String, boolean)}
     */
    protected AnnotationVisitor diagVisitInsnAnnotation(int typeRef, TypePath typePath, String desc, boolean visible) {
        return super.visitInsnAnnotation(typeRef, typePath, desc, visible);
    }

    /**
     * Bridge method for visitTryCatchBlock.
     * <p/>
     * See: {@link #visitTryCatchBlock(Label, Label, Label, String)}
     */
    protected void diagVisitTryCatchBlock(Label start, Label end, Label handler, String type) {
        super.visitTryCatchBlock(start, end, handler, type);
    }

    /**
     * Bridge method for visitTryCatchAnnotation.
     * <p/>
     * See: {@link #visitTryCatchAnnotation(int, TypePath, String, boolean)}
     */
    protected AnnotationVisitor diagVisitTryCatchAnnotation(int typeRef, TypePath typePath, String desc,
                                                            boolean visible) {
        return super.visitTryCatchAnnotation(typeRef, typePath, desc, visible);
    }

    /**
     * Bridge method for visitLocalVariable.
     * <p/>
     * See: {@link #visitLocalVariable(String, String, String, Label, Label, int)}
     */
    protected void diagVisitLocalVariable(String name, String desc, String signature, Label start, Label end,
                                          int index) {
        super.visitLocalVariable(name, desc, signature, start, end, index);
    }

    /**
     * Bridge method for visitLocalVariableAnnotation.
     * <p/>
     * See: {@link #visitLocalVariableAnnotation(int, TypePath, Label[], Label[], int[], String, boolean)}
     */
    protected AnnotationVisitor diagVisitLocalVariableAnnotation(int typeRef, TypePath typePath, Label[] start,
                                                                 Label[] end, int[] index, String desc,
                                                                 boolean visible) {
        return super.visitLocalVariableAnnotation(typeRef, typePath, start, end, index, desc, visible);
    }

    /**
     * Bridge method for visitLineNumber.
     * <p/>
     * See: {@link #visitLineNumber(int, Label)}
     */
    protected void diagVisitLineNumber(int line, Label start) {
        super.visitLineNumber(line, start);
    }

    /**
     * Bridge method for visitMaxs.
     * <p/>
     * See: {@link #visitMaxs(int, int)}
     */
    protected void diagVisitMaxs(int maxStack, int maxLocals) {
        super.visitMaxs(maxStack, maxLocals);
    }

    /**
     * Bridge method for visitEnd.
     * <p/>
     * See: {@link #visitEnd()}
     */
    protected void diagVisitEnd() {
        super.visitEnd();
    }
}
