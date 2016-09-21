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

import org.apache.commons.lang3.StringEscapeUtils;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.BooleanLiteral;
import org.eclipse.jdt.core.dom.ChildPropertyDescriptor;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.NumberLiteral;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleMemberAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.text.edits.TextEditGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class EditContext {

    /**
     * Logger for the class
     */
    @SuppressWarnings("unused") private static final Logger LOG = LoggerFactory.getLogger(EditContext.class);

    private final AbstractUnitManager manager;

    protected EditContext(AbstractUnitManager manager) {
        this.manager = manager;
    }

    protected AbstractUnitManager getManager() {
        return manager;
    }

    public abstract boolean isEditable();

    public abstract void close() throws GeneratorException;

    public void editLock() throws NotEditableException {
        if (!isEditable()) {
            throw new NotEditableException();
        }
    }

    /**
     * Get rewriter AST
     *
     * @return AST
     */
    protected final AST getAST() {
        return manager.getAST();
    }

    /**
     * Get rewriter
     *
     * @return ASTRewrite
     */
    protected final ASTRewrite getRewrite() {
        return manager.getRewrite();
    }

    /**
     * Get edit group
     *
     * @return edit group
     */
    public TextEditGroup getEditGroup() {
        return manager.getEditGroup();
    }

    /**
     * Removes a given node from the AST if it isn't an instance of the given
     * class
     *
     * @param node  node to check
     * @param clazz class to match
     * @return null if it was removed otherwise the original node
     */
    @SuppressWarnings("unchecked")
    protected final <T extends ASTNode> T removeOnTypeMismatch(Object node, Class<T> clazz) {
        if (node != null && !clazz.isInstance(node)) {
            getRewrite().remove((ASTNode)node, getEditGroup());
            return null;
        }
        return (T)node;
    }

    protected Expression newStringLiteral(String name) {
        StringLiteral literal = getAST().newStringLiteral();
        getRewrite()
                .set(literal, StringLiteral.ESCAPED_VALUE_PROPERTY, "\"" + StringEscapeUtils.escapeJava(name) + "\"",
                        getEditGroup());
        return literal;
    }

    protected void setAnnotationName(Annotation annotation, String[] type) throws GeneratorException {
        if (annotation.isNormalAnnotation()) {
            setAnnotationName(annotation, NormalAnnotation.TYPE_NAME_PROPERTY, type);
        } else if (annotation.isSingleMemberAnnotation()) {
            setAnnotationName(annotation, SingleMemberAnnotation.TYPE_NAME_PROPERTY, type);
        } else if (annotation.isMarkerAnnotation()) {
            setAnnotationName(annotation, MarkerAnnotation.TYPE_NAME_PROPERTY, type);
        }
    }

    protected void setAnnotationName(Annotation annotation, ChildPropertyDescriptor property, String[] type)
            throws GeneratorException {
        editLock();

        Name name = (Name)getRewrite().get(annotation, property);
        if (name == null) {
            getRewrite().set(annotation, property, getAST().newName(type[0]), getEditGroup());
            getManager().addImport(type[1]);
        } else {
            if (type[0].equals(name.getFullyQualifiedName())) {
                getManager().addImport(type[1]);
            } else {
                getRewrite().set(annotation, property, getAST().newName(type[0]), getEditGroup());
                getManager().addImport(type[1]);
            }
        }
    }

    protected void setSMAStringValue(Annotation annotation, String string) throws GeneratorException {
        editLock();

        if (annotation == null) {
            throw new IllegalArgumentException("'annotation' argument cannot be null!");
        }
        if (string == null || string.length() == 0) {
            throw new IllegalArgumentException("'string' argument must have a valid value!");
        }

        StringLiteral literal = removeOnTypeMismatch(
                getRewrite().get(annotation, SingleMemberAnnotation.VALUE_PROPERTY), StringLiteral.class);

        if (literal == null) {
            literal = getAST().newStringLiteral();
            getRewrite().set(annotation, SingleMemberAnnotation.VALUE_PROPERTY, literal, getEditGroup());
        }

        String value = literal.getLiteralValue();
        if (value == null || !value.equals(string)) {
            value = "\"" + string + "\"";
            getRewrite().set(literal, StringLiteral.ESCAPED_VALUE_PROPERTY, value, getEditGroup());
        }
    }

    protected void setSMATypeValue(Annotation annotation, String type) throws GeneratorException {
        editLock();

        if (annotation == null) {
            throw new IllegalArgumentException("'annotation' argument cannot be null!");
        }
        if (type == null || type.length() == 0) {
            throw new IllegalArgumentException("'type' argument must have a valid value!");
        }

        TypeLiteral literal = removeOnTypeMismatch(getRewrite().get(annotation, SingleMemberAnnotation.VALUE_PROPERTY),
                TypeLiteral.class);
        if (literal == null) {
            literal = getAST().newTypeLiteral();
            getRewrite().set(annotation, SingleMemberAnnotation.VALUE_PROPERTY, literal, getEditGroup());
        }

        SimpleType value_type = removeOnTypeMismatch(literal.getType(), SimpleType.class);

        if (value_type == null) {
            getRewrite().set(literal, TypeLiteral.TYPE_PROPERTY, getAST().newSimpleType(getAST().newName(type)),
                    getEditGroup());
        } else {
            if (value_type.getName() == null || !value_type.getName().equals(type)) {
                getRewrite().set(value_type, SimpleType.NAME_PROPERTY, getAST().newName(type), getEditGroup());
            }
        }
    }

    protected void setNAField(Annotation annotation, int index, String key, Expression value)
            throws GeneratorException {
        editLock();

        MemberValuePair mvp = getNAField(annotation, key);

        if (mvp == null) {
            mvp = getAST().newMemberValuePair();
            ListRewrite vlrw = getRewrite().getListRewrite(annotation, NormalAnnotation.VALUES_PROPERTY);
            vlrw.insertLast(mvp, getEditGroup());
            getRewrite().set(mvp, MemberValuePair.NAME_PROPERTY, getAST().newSimpleName(key), getEditGroup());
        }

        getRewrite().set(mvp, MemberValuePair.VALUE_PROPERTY, value, getEditGroup());
    }

    @SuppressWarnings("unchecked")
    protected MemberValuePair getNAField(Annotation annotation, String key) {
        if (annotation.isNormalAnnotation()) {
            ListRewrite vlrw = getRewrite().getListRewrite(annotation, NormalAnnotation.VALUES_PROPERTY);
            for (MemberValuePair mvp : (List<MemberValuePair>)vlrw.getRewrittenList()) {
                SimpleName name = (SimpleName)getRewrite().get(mvp, MemberValuePair.NAME_PROPERTY);
                if (key.equals(name.getFullyQualifiedName())) {
                    return mvp;
                }
            }
            return null;
        }
        throw new RuntimeException();
    }

    protected Expression getNAValue(Annotation annotation, String key) {
        MemberValuePair mvp = getNAField(annotation, key);
        if (mvp != null) {
            return (Expression)getRewrite().get(mvp, MemberValuePair.VALUE_PROPERTY);
        }
        return null;
    }

    protected Boolean getNABooleanValue(Annotation annotation, String key) {
        Expression expr = getNAValue(annotation, key);
        if (expr instanceof BooleanLiteral) {
            return (Boolean)getRewrite().get(expr, BooleanLiteral.BOOLEAN_VALUE_PROPERTY);
        }
        return null;
    }

    protected Integer getNANumberValue(Annotation annotation, String key) {
        Expression expr = getNAValue(annotation, key);
        if (expr instanceof NumberLiteral) {
            return Integer.valueOf((String)getRewrite().get(expr, NumberLiteral.TOKEN_PROPERTY));
        }
        return null;
    }

    protected String getNAStringValue(Annotation annotation, String key) {
        Expression expr = getNAValue(annotation, key);
        if (expr instanceof StringLiteral) {
            String string = (String)getRewrite().get(expr, StringLiteral.ESCAPED_VALUE_PROPERTY);
            if (string != null && string.length() >= 2) {
                return StringEscapeUtils.unescapeJava(string.substring(1, string.length() - 1));
            }
        }
        return null;
    }

    @SuppressWarnings("unchecked")
    protected void removeNAKeysExcluding(Annotation annotation, ArrayList<String> keys) throws GeneratorException {
        editLock();

        ListRewrite vlrw = getRewrite().getListRewrite(annotation, NormalAnnotation.VALUES_PROPERTY);
        List<MemberValuePair> mvpl = (List<MemberValuePair>)vlrw.getRewrittenList();
        int idx = 0;
        for (MemberValuePair mvp : mvpl) {
            if (idx < keys.size()) {
                SimpleName name = (SimpleName)getRewrite().get(mvp, MemberValuePair.NAME_PROPERTY);
                if (!keys.get(idx).equals(name.getFullyQualifiedName())) {
                    vlrw.remove(mvp, getEditGroup());
                }
            } else {
                vlrw.remove(mvp, getEditGroup());
            }
            ++idx;
        }
    }

    protected String getSMAStringValue(Annotation annotation) {
        Expression expr = getSMAValue(annotation);
        if (expr instanceof StringLiteral) {
            String string = (String)getRewrite().get(expr, StringLiteral.ESCAPED_VALUE_PROPERTY);
            if (string != null && string.length() >= 2) {
                return StringEscapeUtils.unescapeJava(string.substring(1, string.length() - 1));
            }
        }
        return null;
    }

    protected Expression getSMAValue(Annotation annotation) {
        if (annotation.isMarkerAnnotation()) {
            return null;
        } else if (annotation.isSingleMemberAnnotation()) {
            return (Expression)getRewrite().get(annotation, SingleMemberAnnotation.VALUE_PROPERTY);
        }
        throw new RuntimeException();
    }

}
