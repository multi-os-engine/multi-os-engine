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

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.IfStatement;
import org.eclipse.jdt.core.dom.InfixExpression;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.PrimitiveType.Code;
import org.eclipse.jdt.core.dom.ReturnStatement;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.ThrowStatement;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.VariableDeclarationExpression;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.moe.natjgen.ModifierEditor.UncertainDescriptor;

import java.util.ArrayList;
import java.util.List;

public class MethodEditor extends EditContext {

    protected final MethodDeclaration methodDecl;
    protected final ModifierEditor modifiers;
    private final ArrayList<UncertainElem> uncertains = new ArrayList<MethodEditor.UncertainElem>();

    public MethodEditor(AbstractUnitManager manager, MethodDeclaration methodDecl, boolean isNew) {
        super(manager);
        this.methodDecl = methodDecl;
        this.modifiers = new ModifierEditor(manager, methodDecl, MethodDeclaration.MODIFIERS2_PROPERTY, isNew);
    }

    @Override
    public boolean isEditable() {
        return modifiers.isEditable();
    }

    @Override
    public void close() throws NotEditableException {
        editLock();

        modifiers.close();
    }

    public ModifierEditor getModifiers() {
        return modifiers;
    }

    public MethodDeclaration getMethodDecl() {
        return methodDecl;
    }

    public String getName() {
        SimpleName name = (SimpleName)getRewrite().get(methodDecl, MethodDeclaration.NAME_PROPERTY);
        if (name != null) {
            return (String)getRewrite().get(name, SimpleName.IDENTIFIER_PROPERTY);
        }
        return null;
    }

    public void setName(String methodName) throws GeneratorException {
        editLock();

        SimpleName property = (SimpleName)getRewrite().get(methodDecl, MethodDeclaration.NAME_PROPERTY);
        if (property == null || !property.getFullyQualifiedName().equals(methodName)) {
            getRewrite().set(methodDecl, MethodDeclaration.NAME_PROPERTY, getAST().newName(methodName), getEditGroup());
        }
    }

    @SuppressWarnings("unchecked")
    public void setArgumentCount(int size) throws GeneratorException {
        editLock();

        ListRewrite mlrw = getRewrite().getListRewrite(methodDecl, MethodDeclaration.PARAMETERS_PROPERTY);

        int idx = 0;
        for (SingleVariableDeclaration decl : (List<SingleVariableDeclaration>)mlrw.getRewrittenList()) {
            if (idx < size) {
                ++idx;
            } else {
                mlrw.remove(decl, getEditGroup());
            }
        }
        for (; idx < size; ++idx) {
            mlrw.insertLast(getAST().newSingleVariableDeclaration(), getEditGroup());
        }
    }

    @SuppressWarnings("unchecked")
    public void setArgument(int idx, String arg_name, Type type, TypeResolver resolver) throws GeneratorException {
        editLock();

        ListRewrite mlrw = getRewrite().getListRewrite(methodDecl, MethodDeclaration.PARAMETERS_PROPERTY);
        List<SingleVariableDeclaration> list = (List<SingleVariableDeclaration>)mlrw.getRewrittenList();
        SingleVariableDeclaration svd = list.get(idx);

        SimpleName property = (SimpleName)getRewrite().get(svd, SingleVariableDeclaration.NAME_PROPERTY);
        if (property == null || !property.getFullyQualifiedName().equals(arg_name)) {
            getRewrite().set(svd, SingleVariableDeclaration.NAME_PROPERTY, getAST().newName(arg_name), getEditGroup());
        }

        ModifierEditor argmod = new ModifierEditor(getManager(), svd, SingleVariableDeclaration.MODIFIERS2_PROPERTY,
                true);
        resolver.resolve(getManager(), svd, SingleVariableDeclaration.TYPE_PROPERTY, argmod, type, true);
        argmod.close();

        // Add uncertain descriptor
        UncertainDescriptor udesc = argmod.getUncertainDescriptor();
        if (udesc != null) {
            uncertains.add(new UncertainElem(Integer.toString(idx), udesc));
        }
    }

    @SuppressWarnings("unchecked")
    public void setVariadicArgument(int idx, String arg_name) throws GeneratorException {
        editLock();

        ListRewrite mlrw = getRewrite().getListRewrite(methodDecl, MethodDeclaration.PARAMETERS_PROPERTY);
        List<SingleVariableDeclaration> list = (List<SingleVariableDeclaration>)mlrw.getRewrittenList();
        SingleVariableDeclaration svd = list.get(idx);

        SimpleName property = (SimpleName)getRewrite().get(svd, SingleVariableDeclaration.NAME_PROPERTY);
        if (property == null || !property.getFullyQualifiedName().equals(arg_name)) {
            getRewrite().set(svd, SingleVariableDeclaration.NAME_PROPERTY, getAST().newName(arg_name), getEditGroup());
        }

        SimpleType type = getAST().newSimpleType(getAST().newName("Object"));
        getRewrite().set(svd, SingleVariableDeclaration.TYPE_PROPERTY, type, getEditGroup());
        getRewrite().set(svd, SingleVariableDeclaration.VARARGS_PROPERTY, Boolean.TRUE, getEditGroup());
    }

    public void setType(Type type, TypeResolver resolver) throws GeneratorException {
        editLock();

        resolver.resolve(getManager(), methodDecl, MethodDeclaration.RETURN_TYPE2_PROPERTY, modifiers, type, false);

        // Add uncertain descriptor
        UncertainDescriptor udesc = modifiers.getUncertainDescriptor();
        if (udesc != null) {
            uncertains.add(new UncertainElem("-1", udesc));
        }
    }

    public ArrayList<UncertainElem> getUncertains() {
        return uncertains;
    }

    public boolean isCFunctionBinder(String nfunction) {
        return modifiers.isCFunctionBinder(nfunction, getName());
    }

    public boolean isCVariableBinder(String name, boolean isGetter) {
        return modifiers.isCVariableBinder(name, getName(), isGetter);
    }

    public boolean isStructFieldBinder(int order, boolean isGetter) {
        return modifiers.isStructFieldBinder(order, isGetter);
    }

    public boolean isObjCMethodBinder(String selector, boolean isStatic) {
        return modifiers.isObjCMethodBinder(selector, isStatic);
    }

    @SuppressWarnings("unchecked")
    public boolean hasArgumentTypeMatch(Type[] args) {
        ListRewrite a_lrw = getRewrite().getListRewrite(methodDecl, MethodDeclaration.PARAMETERS_PROPERTY);
        List<SingleVariableDeclaration> svds = a_lrw.getRewrittenList();
        if (svds.size() != args.length) {
            return false;
        }

        for (int i = 0; i < args.length; ++i) {
            SingleVariableDeclaration vdec = (SingleVariableDeclaration)svds.get(0);
            org.eclipse.jdt.core.dom.Type type = (org.eclipse.jdt.core.dom.Type)getRewrite()
                    .get(vdec, SingleVariableDeclaration.TYPE_PROPERTY);
            if (!isSimilarTo(args[i], type)) {
                return false;
            }
        }

        return true;
    }

    public boolean isSimilarTo(Type natjType, org.eclipse.jdt.core.dom.Type domType) {
        if (domType instanceof PrimitiveType) {
            return isSimilarToPrimitiveType(natjType, domType);
        } else if (domType instanceof SimpleType) {
            return isSimilarToSimpleType(natjType, domType);
        }
        return false;
    }

    private boolean isSimilarToPrimitiveType(Type natjType, org.eclipse.jdt.core.dom.Type domType) {
        if (!natjType.isPrimitive() && !natjType.isVoid()) {
            return false;
        }

        Code c = (Code)getRewrite().get(domType, PrimitiveType.PRIMITIVE_TYPE_CODE_PROPERTY);
        return c.toString().equals(natjType.toString());
    }

    private boolean isSimilarToSimpleType(Type natjType, org.eclipse.jdt.core.dom.Type domType) {
        if (natjType.isPrimitive() || natjType.isVoid()) {
            return false;
        }

        Name simplename = (Name)getRewrite().get(domType, SimpleType.NAME_PROPERTY);
        return natjType.isSimilarTo(simplename.getFullyQualifiedName());
    }

    public void setJavaDoc(XcodeDocumentation doc, ArrayList<CalleeArgument> args) {
        getRewrite().set(methodDecl, MethodDeclaration.JAVADOC_PROPERTY, doc.getJavaDoc(getRewrite(), args),
                getEditGroup());
    }

    public boolean isStatic() {
        return modifiers.isStatic();
    }

    public boolean isObjCProtocolClassMethodBinder(String jmethod) {
        return modifiers.isObjCProtocolClassMethodBinder(jmethod);
    }

    @SuppressWarnings("unchecked")
    public void setBodyAsMethodCaller(String jmethod, Type rettype, ArrayList<CalleeArgument> arguments) {
        Block code = (Block)getRewrite().get(methodDecl, MethodDeclaration.BODY_PROPERTY);
        if (code == null) {
            code = getAST().newBlock();
            getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, code, getEditGroup());
        }
        ListRewrite statements = getRewrite().getListRewrite(code, Block.STATEMENTS_PROPERTY);
        for (ASTNode object : (List<ASTNode>)statements.getRewrittenList()) {
            statements.remove(object, getEditGroup());
        }

        MethodInvocation invoke = getAST().newMethodInvocation();
        getRewrite().set(invoke, MethodInvocation.NAME_PROPERTY, getAST().newSimpleName(jmethod), getEditGroup());

        if (rettype.isVoid()) {
            ExpressionStatement expr_stmt = getAST().newExpressionStatement(invoke);
            statements.insertLast(expr_stmt, getEditGroup());
        } else {
            ReturnStatement return_stmt = getAST().newReturnStatement();
            statements.insertLast(return_stmt, getEditGroup());
            getRewrite().set(return_stmt, ReturnStatement.EXPRESSION_PROPERTY, invoke, getEditGroup());
        }

        if (arguments.size() > 0) {
            ListRewrite args = getRewrite().getListRewrite(invoke, MethodInvocation.ARGUMENTS_PROPERTY);
            for (CalleeArgument arg : arguments) {
                args.insertLast(getAST().newSimpleName(arg.getName()), getEditGroup());
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void setBodyAsProtocolDefaultMethod(Type rettype) {
        Block code = (Block)getRewrite().get(methodDecl, MethodDeclaration.BODY_PROPERTY);
        if (code == null) {
            code = getAST().newBlock();
            getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, code, getEditGroup());
        }
        ListRewrite statements = getRewrite().getListRewrite(code, Block.STATEMENTS_PROPERTY);
        for (ASTNode object : (List<ASTNode>)statements.getRewrittenList()) {
            statements.remove(object, getEditGroup());
        }

        Name uoe = getAST().newName("java.lang.UnsupportedOperationException");
        SimpleType uoet = getAST().newSimpleType(uoe);
        ClassInstanceCreation cic = getAST().newClassInstanceCreation();
        getRewrite().set(cic, ClassInstanceCreation.TYPE_PROPERTY, uoet, getEditGroup());
        ThrowStatement th = getAST().newThrowStatement();
        getRewrite().set(th, ThrowStatement.EXPRESSION_PROPERTY, cic, getEditGroup());
        statements.insertLast(th, getEditGroup());
    }

    public void setEmptyBodyForMethod(Type rettype) {
        Block code = getAST().newBlock();
        getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, code, getEditGroup());

    }

    public static class UncertainElem {

        private final UncertainDescriptor descriptor;
        private final String location;

        public UncertainElem(String location, UncertainDescriptor descriptor) {
            if (location == null || descriptor == null) {
                throw new IllegalArgumentException();
            }
            this.location = location;
            this.descriptor = descriptor;
        }

        public String getLocation() {
            return location;
        }

        public UncertainDescriptor getDescriptor() {
            return descriptor;
        }

        @Override
        public String toString() {
            return location + " -> " + descriptor.getDescription();
        }

    }

    @SuppressWarnings("unchecked")
    public int getNumArgs() {
        ListRewrite mlrw = getRewrite().getListRewrite(methodDecl, MethodDeclaration.PARAMETERS_PROPERTY);
        List<SingleVariableDeclaration> list = (List<SingleVariableDeclaration>)mlrw.getRewrittenList();
        return list.size();
    }

    @SuppressWarnings("unchecked")
    public void updateSafePropertyBinding(String getter, String setter, CalleeArgument calleeArgument) {
        Block block = (Block)getRewrite().get(methodDecl, MethodDeclaration.BODY_PROPERTY);
        if (block == null) {
            block = getAST().newBlock();
            getRewrite().set(methodDecl, MethodDeclaration.BODY_PROPERTY, block, getEditGroup());
        }
        ListRewrite block_stmts = getRewrite().getListRewrite(block, Block.STATEMENTS_PROPERTY);
        for (ASTNode object : (List<ASTNode>)block_stmts.getRewrittenList()) {
            block_stmts.remove(object, getEditGroup());
        }

        /**
         * <ObjCRuntimeFQ>
         */
        Name objc_runtime = getAST().newName(Constants.ObjCRuntimeFQ);

        /**
         * Object __old = <getter>()
         */
        SimpleType objcobj_type = getAST().newSimpleType(getAST().newName("Object"));
        MethodInvocation getter_inv = getAST().newMethodInvocation();
        getRewrite().set(getter_inv, MethodInvocation.NAME_PROPERTY, getAST().newName(getter), getEditGroup());

        Name old_obj = getAST().newName("__old");
        VariableDeclarationFragment vdf = getAST().newVariableDeclarationFragment();
        getRewrite().set(vdf, VariableDeclarationFragment.NAME_PROPERTY, old_obj, getEditGroup());
        getRewrite().set(vdf, VariableDeclarationFragment.INITIALIZER_PROPERTY, getter_inv, getEditGroup());
        VariableDeclarationExpression vde = getAST().newVariableDeclarationExpression(vdf);
        getRewrite().set(vde, VariableDeclarationExpression.TYPE_PROPERTY, ASTNode.copySubtree(getAST(), objcobj_type),
                getEditGroup());
        insertStatement(block_stmts, vde);

        /**
         * <ObjCRuntimeFQ>.associateObjCObject(this, <argument>)
         */
        MethodInvocation assoc_inv = getAST().newMethodInvocation();
        getRewrite().set(assoc_inv, MethodInvocation.EXPRESSION_PROPERTY, objc_runtime, getEditGroup());
        getRewrite().set(assoc_inv, MethodInvocation.NAME_PROPERTY, getAST().newName("associateObjCObject"),
                getEditGroup());
        ListRewrite assoc_inv_args = getRewrite().getListRewrite(assoc_inv, MethodInvocation.ARGUMENTS_PROPERTY);
        assoc_inv_args.insertLast(getAST().newThisExpression(), getEditGroup());
        assoc_inv_args.insertLast(getAST().newSimpleName(calleeArgument.getName()), getEditGroup());

        /**
         * if (<arg> != null) { ObjCRuntime.associateObjCObject(this, <arg>); }
         */
        {
            Block con_block = getAST().newBlock();
            ListRewrite con_block_stmt = getRewrite().getListRewrite(con_block, Block.STATEMENTS_PROPERTY);
            insertStatement(con_block_stmt, assoc_inv);

            InfixExpression con_obj_nonnull = getAST().newInfixExpression();
            getRewrite().set(con_obj_nonnull, InfixExpression.OPERATOR_PROPERTY, InfixExpression.Operator.NOT_EQUALS,
                    getEditGroup());
            getRewrite().set(con_obj_nonnull, InfixExpression.LEFT_OPERAND_PROPERTY,
                    getAST().newSimpleName(calleeArgument.getName()), getEditGroup());
            getRewrite().set(con_obj_nonnull, InfixExpression.RIGHT_OPERAND_PROPERTY, getAST().newNullLiteral(),
                    getEditGroup());

            IfStatement if_obj_nonnull = getAST().newIfStatement();
            getRewrite().set(if_obj_nonnull, IfStatement.EXPRESSION_PROPERTY, con_obj_nonnull, getEditGroup());
            getRewrite().set(if_obj_nonnull, IfStatement.THEN_STATEMENT_PROPERTY, con_block, getEditGroup());
            block_stmts.insertLast(if_obj_nonnull, getEditGroup());
        }

        /**
         * <setter>(...)
         */
        MethodInvocation setter_inv = getAST().newMethodInvocation();
        getRewrite().set(setter_inv, MethodInvocation.NAME_PROPERTY, getAST().newName(setter), getEditGroup());
        ListRewrite setter_inv_args = getRewrite().getListRewrite(setter_inv, MethodInvocation.ARGUMENTS_PROPERTY);
        setter_inv_args.insertLast(getAST().newSimpleName(calleeArgument.getName()), getEditGroup());
        insertStatement(block_stmts, setter_inv);

        /**
         * <ObjCRuntimeFQ>.dissociateObjCObject(this, old)
         */
        MethodInvocation unassoc_inv = getAST().newMethodInvocation();
        getRewrite().set(unassoc_inv, MethodInvocation.EXPRESSION_PROPERTY, ASTNode.copySubtree(getAST(), objc_runtime),
                getEditGroup());
        getRewrite().set(unassoc_inv, MethodInvocation.NAME_PROPERTY, getAST().newName("dissociateObjCObject"),
                getEditGroup());
        ListRewrite unassoc_inv_args = getRewrite().getListRewrite(unassoc_inv, MethodInvocation.ARGUMENTS_PROPERTY);
        unassoc_inv_args.insertLast(getAST().newThisExpression(), getEditGroup());
        unassoc_inv_args.insertLast(ASTNode.copySubtree(getAST(), old_obj), getEditGroup());

        /**
         * if (__old != null) { ObjCRuntime.dissociateObjCObject(this, __old); }
         */
        {
            Block con_block = getAST().newBlock();
            ListRewrite con_block_stmt = getRewrite().getListRewrite(con_block, Block.STATEMENTS_PROPERTY);
            insertStatement(con_block_stmt, unassoc_inv);

            InfixExpression con_obj_nonnull = getAST().newInfixExpression();
            getRewrite().set(con_obj_nonnull, InfixExpression.OPERATOR_PROPERTY, InfixExpression.Operator.NOT_EQUALS,
                    getEditGroup());
            getRewrite()
                    .set(con_obj_nonnull, InfixExpression.LEFT_OPERAND_PROPERTY, ASTNode.copySubtree(getAST(), old_obj),
                            getEditGroup());
            getRewrite().set(con_obj_nonnull, InfixExpression.RIGHT_OPERAND_PROPERTY, getAST().newNullLiteral(),
                    getEditGroup());

            IfStatement if_obj_nonnull = getAST().newIfStatement();
            getRewrite().set(if_obj_nonnull, IfStatement.EXPRESSION_PROPERTY, con_obj_nonnull, getEditGroup());
            getRewrite().set(if_obj_nonnull, IfStatement.THEN_STATEMENT_PROPERTY, con_block, getEditGroup());
            block_stmts.insertLast(if_obj_nonnull, getEditGroup());
        }
    }

    private void insertStatement(ListRewrite stmts, Expression expr) {
        Statement stmt = getAST().newExpressionStatement(expr);
        stmts.insertLast(stmt, getEditGroup());
    }

    @Override
    public String toString() {
        return methodDecl.toString();
    }

    @SuppressWarnings("unchecked")
    public void setTemplates(ArrayList<ObjCGenericParamType> genericParamTypes) throws GeneratorException {
        editLock();

        ListRewrite params = getRewrite().getListRewrite(methodDecl, MethodDeclaration.TYPE_PARAMETERS_PROPERTY);
        for (ASTNode object : (List<ASTNode>)params.getRewrittenList()) {
            params.remove(object, getEditGroup());
        }

        for (ObjCGenericParamType genericParamType : genericParamTypes) {
            TypeParameter typeParameter = getAST().newTypeParameter();
            params.insertLast(typeParameter, getEditGroup());
            getRewrite()
                    .set(typeParameter, TypeParameter.NAME_PROPERTY, getAST().newSimpleName(genericParamType.getName()),
                            getEditGroup());
        }
    }

}
