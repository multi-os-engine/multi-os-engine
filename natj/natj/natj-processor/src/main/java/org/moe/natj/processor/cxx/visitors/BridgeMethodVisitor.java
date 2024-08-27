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

import org.moe.natj.processor.cxx.CxxClassInfo;
import org.moe.natj.processor.cxx.utility.BridgeMethodDesc;
import org.moe.natj.processor.cxx.utility.DiagMethodVisitor;
import org.moe.natj.processor.cxx.utility.MethodDiagInfo;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.MethodNode;

/**
 * This method visitor finds out information about the bridge method.
 */
public class BridgeMethodVisitor extends DiagMethodVisitor implements Opcodes {
    /**
     * Method node.
     */
    private final MethodNode node;

    /**
     * Owning class info.
     */
    private final CxxClassInfo classInfo;

    /**
     * Bridge method visit ended handler.
     */
    private final IBridgeMethodVisitorHandler handler;

    /**
     * Invoked method descriptor.
     */
    private String invokedDesc;

    /**
     * Visitor handler.
     */
    public interface IBridgeMethodVisitorHandler {
        /**
         * Visit ended event.
         */
        void visitEnded();
    }

    /**
     * Create a new BridgeMethodVisitor instance.
     *
     * @param node      Method node
     * @param classInfo Owning CxxClassInfo
     * @param processor Owning CxxClassVisitor
     * @param handler   Bridge method visit ended handler
     */
    public BridgeMethodVisitor(MethodNode node, CxxClassInfo classInfo,
                               CxxClassVisitor processor, IBridgeMethodVisitorHandler handler) {
        super(node, new MethodDiagInfo(processor.getClassDiagInfo(), node));
        if (node == null) {
            throw new NullPointerException();
        }
        if (classInfo == null) {
            throw new NullPointerException();
        }
        this.node = node;
        this.classInfo = classInfo;
        this.handler = handler;
    }

    @Override
    protected void diagVisitMethodInsn(int opcode, String owner, String name, String desc, boolean itf) {
        super.diagVisitMethodInsn(opcode, owner, name, desc, itf);
        if (opcode == INVOKEINTERFACE) {
            if (invokedDesc != null) {
                throw new IllegalStateException("Invoked method already set for bridge");
            }
            invokedDesc = desc;
        }
    }

    @Override
    public void visitEnd() {
        super.visitEnd();
        if (handler != null) {
            handler.visitEnded();
        }
        classInfo.addBidgeMethod(new BridgeMethodDesc(node, invokedDesc));
    }
}
