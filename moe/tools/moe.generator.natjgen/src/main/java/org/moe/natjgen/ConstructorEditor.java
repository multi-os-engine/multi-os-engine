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
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.SuperConstructorInvocation;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

public class ConstructorEditor extends MethodEditor {

    public ConstructorEditor(AbstractUnitManager manager, MethodDeclaration decl, boolean isNew) {
        super(manager, decl, isNew);
        if (isNew) {
            getRewrite().set(decl, MethodDeclaration.NAME_PROPERTY, getAST().newSimpleName(getManager().getUnitName()),
                    getEditGroup());
            getRewrite().set(decl, MethodDeclaration.CONSTRUCTOR_PROPERTY, Boolean.TRUE, getEditGroup());
        }
    }

    public void setBodyAsEmpty() {
        Block block = getAST().newBlock();
        getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, block, getEditGroup());
    }

    public void setBodyAsSuperInitWithClassAsArg() {
        Block block = getAST().newBlock();
        getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, block, getEditGroup());
        ListRewrite block_stmts = getRewrite().getListRewrite(block, Block.STATEMENTS_PROPERTY);
        SuperConstructorInvocation invoke = getAST().newSuperConstructorInvocation();
        block_stmts.insertLast(invoke, getEditGroup());
        ListRewrite invoke_args = getRewrite().getListRewrite(invoke, SuperConstructorInvocation.ARGUMENTS_PROPERTY);
        TypeLiteral literal = getAST().newTypeLiteral();
        invoke_args.insertLast(literal, getEditGroup());
        getRewrite().set(literal, TypeLiteral.TYPE_PROPERTY,
                getAST().newSimpleType(getAST().newName(getManager().getUnitName())), getEditGroup());
    }

    public void setBodyAsSuperInitWithPointerAsArg(String varname) {
        Block block = getAST().newBlock();
        getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, block, getEditGroup());
        ListRewrite block_stmts = getRewrite().getListRewrite(block, Block.STATEMENTS_PROPERTY);
        SuperConstructorInvocation invoke = getAST().newSuperConstructorInvocation();
        block_stmts.insertLast(invoke, getEditGroup());
        ListRewrite invoke_args = getRewrite().getListRewrite(invoke, SuperConstructorInvocation.ARGUMENTS_PROPERTY);
        invoke_args.insertLast(getAST().newSimpleName(varname), getEditGroup());
    }

    public void setBodyAsSuperInitWithFieldSetters(String[] setters, String[] getters) {
        if (setters == null || getters == null || setters.length != getters.length) {
            throw new IllegalArgumentException();
        }

        Block block = getAST().newBlock();
        getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, block, getEditGroup());
        ListRewrite block_stmts = getRewrite().getListRewrite(block, Block.STATEMENTS_PROPERTY);
        SuperConstructorInvocation invoke = getAST().newSuperConstructorInvocation();
        block_stmts.insertLast(invoke, getEditGroup());
        ListRewrite invoke_args = getRewrite().getListRewrite(invoke, SuperConstructorInvocation.ARGUMENTS_PROPERTY);
        TypeLiteral literal = getAST().newTypeLiteral();
        invoke_args.insertLast(literal, getEditGroup());
        getRewrite().set(literal, TypeLiteral.TYPE_PROPERTY,
                getAST().newSimpleType(getAST().newName(getManager().getUnitName())), getEditGroup());

        for (int i = 0; i < setters.length; i++) {
            MethodInvocation setfieldinvoke = getAST().newMethodInvocation();
            Statement stmt = getAST().newExpressionStatement(setfieldinvoke);
            block_stmts.insertLast(stmt, getEditGroup());
            getRewrite().set(setfieldinvoke, MethodInvocation.NAME_PROPERTY, getAST().newSimpleName(setters[i]),
                    getEditGroup());
            ListRewrite arglrw = getRewrite().getListRewrite(setfieldinvoke, MethodInvocation.ARGUMENTS_PROPERTY);
            arglrw.insertLast(getAST().newSimpleName(getters[i]), getEditGroup());
        }
    }

}
