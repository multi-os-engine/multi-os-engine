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

import org.eclipse.jdt.core.dom.CastExpression;
import org.eclipse.jdt.core.dom.ConditionalExpression;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.ParenthesizedExpression;
import org.eclipse.jdt.core.dom.PrimitiveType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

public class FieldEditor extends EditContext {

    public static final String NATJ_CACHE_FIELD = "__natjCache";

    private final FieldDeclaration fieldDecl;
    private final ModifierEditor modifiers;

    public FieldEditor(AbstractUnitManager manager, FieldDeclaration fieldDecl, boolean isNew) {
        super(manager);
        this.fieldDecl = fieldDecl;
        this.modifiers = new ModifierEditor(manager, fieldDecl, FieldDeclaration.MODIFIERS2_PROPERTY, isNew);
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

    public FieldDeclaration getFieldDecl() {
        return fieldDecl;
    }

    private VariableDeclarationFragment getFirstFragment() {
        ListRewrite lrw = getRewrite().getListRewrite(fieldDecl, FieldDeclaration.FRAGMENTS_PROPERTY);
        return (VariableDeclarationFragment)lrw.getRewrittenList().get(0);
    }

    public String getName() {
        SimpleName name = (SimpleName)getRewrite().get(getFirstFragment(), VariableDeclarationFragment.NAME_PROPERTY);
        if (name != null) {
            return (String)getRewrite().get(name, SimpleName.IDENTIFIER_PROPERTY);
        }
        return null;
    }

    public void setName(String name) throws NotEditableException {
        editLock();

        getRewrite().set(getFirstFragment(), VariableDeclarationFragment.NAME_PROPERTY, getAST().newSimpleName(name),
                getEditGroup());
    }

    public void setType(Type type, TypeResolver resolver) throws GeneratorException {
        editLock();

        resolver.resolve(getManager(), fieldDecl, FieldDeclaration.TYPE_PROPERTY, modifiers, type, false);
    }

    public void setInitializer(Type type, long constant) throws NotEditableException {
        editLock();

        Expression v = getExpressionForConstantValue(type.getKind(), constant);

        getRewrite().set(getFirstFragment(), VariableDeclarationFragment.INITIALIZER_PROPERTY, v, getEditGroup());
    }

    private Expression getExpressionForConstantValue(int typeKind, long value) {
        switch (typeKind) {
        case Type.Boolean:
            if ((value & 0xFFFFFFFFFFFFFF00L) > 0) {
                throw new IllegalStateException();
            }
            return getAST().newBooleanLiteral(value != 0);
        case Type.Byte: {
            if ((value & 0xFFFFFFFFFFFFFF00L) > 0) {
                throw new IllegalStateException();
            }
            return getAST().newNumberLiteral("" + (byte)(value & 0xFFL));
        }
        case Type.Short: {
            if ((value & 0xFFFFFFFFFFFF0000L) > 0) {
                throw new IllegalStateException();
            }
            return getAST().newNumberLiteral("" + (short)(value & 0xFFFF));
        }
        case Type.Char:
            if ((value & 0xFFFFFFFFFFFF0000L) > 0) {
                throw new IllegalStateException();
            }
            return getAST().newNumberLiteral(String.format("0x%04X", value));
        case Type.Int:
            if ((value & 0xFFFFFFFF00000000L) > 0) {
                throw new IllegalStateException();
            }
            return getAST().newNumberLiteral(String.format("0x%08X", value));
        case Type.Long:
            return getAST().newNumberLiteral(String.format("0x%016XL", value));
        case Type.Float: {
            if ((value & 0xFFFFFFFF00000000L) > 0) {
                throw new IllegalStateException();
            }
            NumberLiteral literal = getAST().newNumberLiteral(String.format("0x%08X", value));
            CastExpression cast = getAST().newCastExpression();
            cast.setType(getAST().newPrimitiveType(PrimitiveType.FLOAT));
            cast.setExpression(literal);
            return cast;
        }
        case Type.Double:
            return getAST().newNumberLiteral(String.format("0x%016XL", value));

        default:
            throw new IllegalStateException();
        }
    }

    public void setInitializer(Type type, long const64, long const32) throws NotEditableException {
        editLock();

        Expression v64 = getExpressionForConstantValue(type.getKind(), const64);
        Expression v32;
        if (type.getDowngradeAnnotation() == null) {
            v32 = getExpressionForConstantValue(type.getKind(), const32);
        } else if (Constants.NIntAnnotationFQ.equals(type.getDowngradeAnnotation())) {
            v32 = getExpressionForConstantValue(type.getKind(), const32);
        } else if (Constants.NUIntAnnotationFQ.equals(type.getDowngradeAnnotation())) {
            v32 = getExpressionForConstantValue(type.getKind(), const32);
        } else if (Constants.NFloatAnnotationFQ.equals(type.getDowngradeAnnotation())) {
            v32 = getExpressionForConstantValue(Type.Float, const32);
        } else {
            throw new IllegalStateException();
        }

        /**
         * <NatJFQ>
         */
        Name objc_runtime = getAST().newName(Constants.NatJFQ);

        /**
         * <NatJFQ>.is64Bit()
         */
        MethodInvocation assoc_inv = getAST().newMethodInvocation();
        getRewrite().set(assoc_inv, MethodInvocation.EXPRESSION_PROPERTY, objc_runtime, getEditGroup());
        getRewrite().set(assoc_inv, MethodInvocation.NAME_PROPERTY, getAST().newName("is64Bit"), getEditGroup());

        /**
         * <NatJFQ>.is64Bit() ? <v64> : <v32>
         */
        ConditionalExpression cond = getAST().newConditionalExpression();
        getRewrite().set(cond, ConditionalExpression.EXPRESSION_PROPERTY, assoc_inv, getEditGroup());
        getRewrite().set(cond, ConditionalExpression.THEN_EXPRESSION_PROPERTY, v64, getEditGroup());
        getRewrite().set(cond, ConditionalExpression.ELSE_EXPRESSION_PROPERTY, v32, getEditGroup());

        /**
         * Add additional casting required by byte, short and char
         */
        if (type.getKind() == Type.Byte || type.getKind() == Type.Short || type.getKind() == Type.Char) {
            CastExpression cast = getAST().newCastExpression();
            if (type.getKind() == Type.Byte) {
                cast.setType(getAST().newPrimitiveType(PrimitiveType.BYTE));
            } else if (type.getKind() == Type.Short) {
                cast.setType(getAST().newPrimitiveType(PrimitiveType.SHORT));
            } else if (type.getKind() == Type.Char) {
                cast.setType(getAST().newPrimitiveType(PrimitiveType.CHAR));
            } else {
                throw new IllegalStateException();
            }
            ParenthesizedExpression parenthesized = getAST().newParenthesizedExpression();
            parenthesized.setExpression(cond);
            cast.setExpression(parenthesized);
            getRewrite()
                    .set(getFirstFragment(), VariableDeclarationFragment.INITIALIZER_PROPERTY, cast, getEditGroup());
        } else {
            getRewrite()
                    .set(getFirstFragment(), VariableDeclarationFragment.INITIALIZER_PROPERTY, cond, getEditGroup());
        }
    }

    public void forceEdit() {
        modifiers.forceEdit();
    }

}
