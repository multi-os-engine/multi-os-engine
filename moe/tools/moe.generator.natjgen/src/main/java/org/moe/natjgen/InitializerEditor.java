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

package org.moe.natjgen;

import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import java.util.List;

public class InitializerEditor extends EditContext {

    private final Initializer decl;
    private final ModifierEditor modifiers;

    InitializerEditor(AbstractUnitManager manager, Initializer decl) {
        super(manager);
        this.decl = decl;
        this.modifiers = new ModifierEditor(manager, decl, Initializer.MODIFIERS2_PROPERTY, true);
    }

    @Override
    public boolean isEditable() {
        return modifiers.isEditable();
    }

    @Override
    public void close() throws GeneratorException {
        modifiers.close();
    }

    public ModifierEditor getModifiers() {
        return modifiers;
    }

    @SuppressWarnings("unchecked")
    public boolean hasNatJRegister() {
        Block block = (Block)getRewrite().get(decl, Initializer.BODY_PROPERTY);

        if (block == null) {
            return false;
        }

        ListRewrite block_stmts = getRewrite().getListRewrite(block, Block.STATEMENTS_PROPERTY);
        for (Statement stmt : (List<Statement>)block_stmts.getRewrittenList()) {
            if (stmt instanceof ExpressionStatement) {
                Expression expr = (Expression)getRewrite().get(stmt, ExpressionStatement.EXPRESSION_PROPERTY);
                if (expr instanceof MethodInvocation) {
                    Expression cls = (Expression)getRewrite().get(expr, MethodInvocation.EXPRESSION_PROPERTY);
                    if (!(cls instanceof SimpleName)) {
                        continue;
                    }

                    String identifier = (String)getRewrite().get(cls, SimpleName.IDENTIFIER_PROPERTY);
                    if (!identifier.equals(Constants.NatJ) && !identifier.equals(Constants.NatJFQ)) {
                        continue;
                    }

                    SimpleName method = (SimpleName)getRewrite().get(expr, MethodInvocation.NAME_PROPERTY);
                    String methodId = (String)getRewrite().get(method, SimpleName.IDENTIFIER_PROPERTY);
                    if (methodId.equals(Constants.NatJRegisterMethod)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void insertNatJRegister() throws GeneratorException {
        editLock();

        Block block = (Block)getRewrite().get(decl, Initializer.BODY_PROPERTY);

        if (block == null) {
            block = getAST().newBlock();
            getRewrite().set(decl, Initializer.BODY_PROPERTY, block, getEditGroup());
        }

        ListRewrite block_stmts = getRewrite().getListRewrite(block, Block.STATEMENTS_PROPERTY);
        MethodInvocation invoke = getAST().newMethodInvocation();
        ExpressionStatement expr_stmt = getAST().newExpressionStatement(invoke);
        block_stmts.insertFirst(expr_stmt, getEditGroup());
        getRewrite().set(invoke, MethodInvocation.EXPRESSION_PROPERTY,
                getAST().newSimpleName(getManager().addImport(Constants.NatJFQ)), getEditGroup());
        getRewrite().set(invoke, MethodInvocation.NAME_PROPERTY, getAST().newSimpleName(Constants.NatJRegisterMethod),
                getEditGroup());
    }

}
