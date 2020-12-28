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
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.ParameterizedType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import java.util.ArrayList;
import java.util.List;

public class ClassEditor extends EditContext {

    private final TypeDeclaration classDecl;
    private final ModifierEditor modifiers;
    private final ClassMemberEditor memberEditor;

    public ClassEditor(AbstractUnitManager manager, TypeDeclaration classDecl, boolean isNew) {
        super(manager);
        this.classDecl = classDecl;
        this.modifiers = new ModifierEditor(manager, classDecl, TypeDeclaration.MODIFIERS2_PROPERTY, isNew);
        this.memberEditor = new ClassMemberEditor(getManager(), classDecl);
    }

    @Override
    public boolean isEditable() {
        return modifiers.isEditable();
    }

    @Override
    public void close() throws GeneratorException {
        editLock();
        modifiers.close();
    }

    public ASTNode getTypeDecl() {
        return classDecl;
    }

    public ModifierEditor getModifiers() {
        return modifiers;
    }

    public ClassMemberEditor getMemberEditor() {
        return memberEditor;
    }

    public void setClass() throws GeneratorException {
        setInterface(false);
    }

    public void setInterface() throws GeneratorException {
        setInterface(true);
    }

    private void setInterface(boolean isInterface) throws GeneratorException {
        editLock();

        Boolean property = (Boolean)getRewrite().get(classDecl, TypeDeclaration.INTERFACE_PROPERTY);
        if (property == null || property.booleanValue() != isInterface) {
            getRewrite().set(classDecl, TypeDeclaration.INTERFACE_PROPERTY, new Boolean(isInterface), getEditGroup());
        }
    }

    public String getClassName() {
        SimpleName property = (SimpleName)getRewrite().get(classDecl, TypeDeclaration.NAME_PROPERTY);
        if (property == null) {
            return null;
        }
        return property.getIdentifier();
    }

    public void setClassName(String className) throws GeneratorException {
        editLock();

        SimpleName property = (SimpleName)getRewrite().get(classDecl, TypeDeclaration.NAME_PROPERTY);
        if (property == null || !property.getFullyQualifiedName().equals(className)) {
            getRewrite().set(classDecl, TypeDeclaration.NAME_PROPERTY, getAST().newName(className), getEditGroup());
        }
    }

    public void setSuperClass(String super_name) throws GeneratorException {
        editLock();

        Type super_type = (Type)getRewrite().get(classDecl, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY);
        if (super_name == null) {
            if (super_type != null) {
                getRewrite().remove(super_type, getEditGroup());
            }
        } else {
            if (super_type == null || !super_type.toString().equals(super_name)) {
                getRewrite().set(classDecl, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY,
                        getAST().newSimpleType(getAST().newName(super_name)), getEditGroup());
            }
        }
    }

    @SuppressWarnings("unchecked")
    public void setSuperClass(String super_name, ArrayList<org.moe.natjgen.Type> paramTypes) throws GeneratorException {
        if (paramTypes.size() == 0) {
            setSuperClass(super_name);
            return;
        }

        editLock();

        // Clear old super
        final Type super_type = (Type)getRewrite().get(classDecl, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY);
        if (super_type != null) {
            getRewrite().remove(super_type, getEditGroup());
        }
        // We're done if there is no superclass
        if (super_name == null) {
            return;
        }

        // Create new super type
        SimpleType simpleType = getAST().newSimpleType(getAST().newName(super_name));
        if (!getManager().getClass().equals(ObjCClassManager.class)) {
            getRewrite().set(classDecl, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY, simpleType, getEditGroup());
            return;
        }

        try {
            ObjCClassManager manager = (ObjCClassManager)getManager();
            ParameterizedType parameterizedType = getAST().newParameterizedType(simpleType);
            for (org.moe.natjgen.Type type : paramTypes) {
                Type typeArgument = TypeResolver
                        .CreateObjCGenericTypeArgument(ObjCClassManager.methTResolver, manager, type);
                parameterizedType.typeArguments().add(typeArgument);
            }
            getRewrite().set(classDecl, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY, parameterizedType, getEditGroup());
        } catch (GeneratorException ex) {
            getRewrite().set(classDecl, TypeDeclaration.SUPERCLASS_TYPE_PROPERTY, simpleType, getEditGroup());
        }
    }

    @SuppressWarnings("unchecked")
    public void setInterfaces(String... interfaces) throws GeneratorException {
        editLock();

        ListRewrite ilrw = getRewrite().getListRewrite(classDecl, TypeDeclaration.SUPER_INTERFACE_TYPES_PROPERTY);

        int idx = 0;
        final int count = interfaces == null ? 0 : interfaces.length;
        for (Type it : (List<Type>)ilrw.getRewrittenList()) {
            if (idx < count) {
                Name name = (Name)getRewrite().get(it, SimpleType.NAME_PROPERTY);
                if (!name.equals(interfaces[idx])) {
                    ilrw.replace(it, getAST().newSimpleType(getAST().newName(interfaces[idx])), getEditGroup());
                }
                ++idx;
            } else {
                ilrw.remove(it, getEditGroup());
            }
        }
        for (; idx < count; ++idx) {
            ilrw.insertLast(getAST().newSimpleType(getAST().newName(interfaces[idx])), getEditGroup());
        }
    }

    public void setStaticInitializer() throws GeneratorException {
        editLock();

        ArrayList<InitializerEditor> inits = memberEditor.getStaticInitializers();
        if (inits.size() == 0) {
            updateStaticInitializer(null);
        } else {
            for (InitializerEditor editor : inits) {
                if (editor.hasNatJRegister()) {
                    return;
                }
            }
            updateStaticInitializer(inits.get(0));
        }
    }

    private void updateStaticInitializer(InitializerEditor initializerEditor) throws GeneratorException {
        editLock();

        if (initializerEditor == null) {
            initializerEditor = memberEditor.newInitializer();
            initializerEditor.getModifiers().setStatic();
        }

        initializerEditor.insertNatJRegister();
    }

    public void setNatJCacheField() throws GeneratorException {
        editLock();

        FieldEditor editor = memberEditor.getField(FieldEditor.NATJ_CACHE_FIELD);
        if (editor == null) {
            editor = memberEditor.newField();
        } else {
            editor.forceEdit();
        }

        editor.setName(FieldEditor.NATJ_CACHE_FIELD);
        editor.setType(new org.moe.natjgen.Type(org.moe.natjgen.Type.LONG_SIZE), TypeResolver.PRIMITIVE_RESOLVER);

        ModifierEditor modifiers = editor.getModifiers();
        modifiers.setPrivate();
        modifiers.setStatic();
        editor.close();
    }

    @SuppressWarnings("unchecked")
    public void setTemplates(ArrayList<ObjCGenericParamType> genericParamTypes) throws GeneratorException {
        editLock();

        ListRewrite params = getRewrite().getListRewrite(classDecl, TypeDeclaration.TYPE_PARAMETERS_PROPERTY);
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

    public void setJavaDoc(XcodeDocumentation doc) {
        getRewrite().set(classDecl, TypeDeclaration.JAVADOC_PROPERTY, doc.getJavaDoc(getRewrite(), null),
                getEditGroup());
    }

}
