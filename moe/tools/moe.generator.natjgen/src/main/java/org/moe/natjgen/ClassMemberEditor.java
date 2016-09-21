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

import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassMemberEditor extends EditContext {

    private final ArrayList<MethodEditor> allMethods = new ArrayList<MethodEditor>();
    private final ArrayList<MethodEditor> managedMethods = new ArrayList<MethodEditor>();

    private final ArrayList<ConstructorEditor> allConstructors = new ArrayList<ConstructorEditor>();
    private final ArrayList<ConstructorEditor> managedConstructors = new ArrayList<ConstructorEditor>();

    private final ArrayList<FieldEditor> allFields = new ArrayList<FieldEditor>();
    private final ArrayList<FieldEditor> managedFields = new ArrayList<FieldEditor>();

    private final ArrayList<InitializerEditor> allStaticInitializers = new ArrayList<InitializerEditor>();

    private final ArrayList<ClassEditor> allClasses = new ArrayList<ClassEditor>();
    private final ArrayList<ClassEditor> managedClasses = new ArrayList<ClassEditor>();

    private final ListRewrite lrw;

    ClassMemberEditor(AbstractUnitManager manager, TypeDeclaration classDecl) {
        super(manager);
        this.lrw = getRewrite().getListRewrite(classDecl, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
        read();
    }

    @Override
    public boolean isEditable() {
        return true;
    }

    @Override
    public void close() {
        // Clean up methods
        ArrayList<MethodEditor> unmanaged_m = new ArrayList<MethodEditor>();
        unmanaged_m.addAll(allConstructors);
        unmanaged_m.addAll(allMethods);
        unmanaged_m.removeAll(managedConstructors);
        unmanaged_m.removeAll(managedMethods);

        Iterator<MethodEditor> it_m = unmanaged_m.iterator();
        while (it_m.hasNext()) {
            if (!it_m.next().getModifiers().isGenerated()) {
                it_m.remove();
            }
        }

        for (MethodEditor editor : unmanaged_m) {
            lrw.remove(editor.getMethodDecl(), getEditGroup());
        }

        // Clean up fields
        ArrayList<FieldEditor> unmanaged_f = new ArrayList<FieldEditor>();
        unmanaged_f.addAll(allFields);
        unmanaged_f.removeAll(managedFields);

        Iterator<FieldEditor> it_f = unmanaged_f.iterator();
        while (it_f.hasNext()) {
            if (!it_f.next().getModifiers().isGenerated()) {
                it_f.remove();
            }
        }

        for (FieldEditor editor : unmanaged_f) {
            lrw.remove(editor.getFieldDecl(), getEditGroup());
        }

        // Clean up classes & interfaces
        ArrayList<ClassEditor> unmanaged_c = new ArrayList<ClassEditor>();
        unmanaged_c.addAll(allClasses);
        unmanaged_c.removeAll(managedClasses);

        Iterator<ClassEditor> it_c = unmanaged_c.iterator();
        while (it_c.hasNext()) {
            if (!it_c.next().getModifiers().isGenerated()) {
                it_c.remove();
            }
        }

        for (ClassEditor editor : unmanaged_c) {
            lrw.remove(editor.getTypeDecl(), getEditGroup());
        }
    }

    @SuppressWarnings("unchecked")
    private void read() {
        // Update already existing functions
        for (BodyDeclaration decl : (List<BodyDeclaration>)lrw.getRewrittenList()) {
            if (decl instanceof MethodDeclaration) {
                if (((Boolean)getRewrite().get(decl, MethodDeclaration.CONSTRUCTOR_PROPERTY)).booleanValue() == true) {
                    allConstructors.add(new ConstructorEditor(getManager(), (MethodDeclaration)decl, false));
                } else {
                    allMethods.add(new MethodEditor(getManager(), (MethodDeclaration)decl, false));
                }
            } else if (decl instanceof FieldDeclaration) {
                allFields.add(new FieldEditor(getManager(), (FieldDeclaration)decl, false));
            } else if (decl instanceof Initializer) {
                InitializerEditor editor = new InitializerEditor(getManager(), (Initializer)decl);
                if (editor.getModifiers().isStatic()) {
                    allStaticInitializers.add(editor);
                }
            } else if (decl instanceof TypeDeclaration) {
                allClasses.add(new ClassEditor(getManager(), (TypeDeclaration)decl, false));
            }
        }
    }

    public boolean hasMethod(String jname, boolean isStatic, int argCount) {
        for (MethodEditor editor : allMethods) {
            if (editor.getName().equals(jname) && editor.isStatic() == isStatic && editor.getNumArgs() == argCount) {
                return true;
            }
        }
        return false;
    }

    public MethodEditor getMehtod(String jname, boolean isStatic, int argCount) {
        for (MethodEditor editor : allMethods) {
            if (editor.getName().equals(jname) && editor.isStatic() == isStatic && editor.getNumArgs() == argCount) {
                managedMethods.add(editor);
                return editor;
            }
        }
        return null;
    }

    public MethodEditor newMethod() {
        MethodDeclaration mdecl = getAST().newMethodDeclaration();
        lrw.insertLast(mdecl, getEditGroup());
        MethodEditor editor = new MethodEditor(getManager(), mdecl, true);
        allMethods.add(editor);
        managedMethods.add(editor);
        return editor;
    }

    public MethodEditor getCFunctionBinder(String nfunction) {
        for (MethodEditor editor : allMethods) {
            if (editor.isCFunctionBinder(nfunction)) {
                managedMethods.add(editor);
                return editor;
            }
        }
        return null;
    }

    public MethodEditor getCVariableBinder(String name, boolean isGetter) {
        for (MethodEditor editor : allMethods) {
            if (editor.isCVariableBinder(name, isGetter)) {
                managedMethods.add(editor);
                return editor;
            }
        }
        return null;
    }

    public boolean hasField(String jname) {
        for (FieldEditor editor : allFields) {
            if (editor.getName().equals(jname)) {
                return true;
            }
        }
        return false;
    }

    public FieldEditor getField(String jname) {
        for (FieldEditor editor : allFields) {
            if (editor.getName().equals(jname)) {
                managedFields.add(editor);
                return editor;
            }
        }
        return null;
    }

    public FieldEditor newField() {
        FieldDeclaration mdecl = getAST().newFieldDeclaration(getAST().newVariableDeclarationFragment());
        lrw.insertLast(mdecl, getEditGroup());
        FieldEditor editor = new FieldEditor(getManager(), mdecl, true);
        allFields.add(editor);
        managedFields.add(editor);
        return editor;
    }

    public ArrayList<InitializerEditor> getStaticInitializers() {
        return allStaticInitializers;
    }

    public InitializerEditor newInitializer() throws GeneratorException {
        Initializer init = getAST().newInitializer();
        lrw.insertFirst(init, getEditGroup());
        InitializerEditor editor = new InitializerEditor(getManager(), init);
        allStaticInitializers.add(editor);
        return editor;
    }

    public MethodEditor getStructFieldBinder(int order, boolean isGetter) {
        for (MethodEditor editor : allMethods) {
            if (editor.isStructFieldBinder(order, isGetter)) {
                managedMethods.add(editor);
                return editor;
            }
        }
        return null;
    }

    public ConstructorEditor setConstructor(Type... args) throws GeneratorException {
        editLock();

        ConstructorEditor editor = null;
        for (ConstructorEditor it : allConstructors) {
            if (it.hasArgumentTypeMatch(args)) {
                managedConstructors.add(it);
                editor = it;
            }
        }

        if (editor == null) {
            editor = newConstructor();
        }

        return editor;
    }

    private ConstructorEditor newConstructor() throws NotEditableException {
        editLock();

        MethodDeclaration mdecl = getAST().newMethodDeclaration();
        MethodDeclaration lastConstructor = null;
        for (Object obj : lrw.getRewrittenList()) {
            if (obj instanceof MethodDeclaration) {
                MethodDeclaration rwlmdecl = (MethodDeclaration)obj;
                if (rwlmdecl.isConstructor()) {
                    lastConstructor = rwlmdecl;
                }
            }
        }
        if (lastConstructor != null) {
            lrw.insertAfter(mdecl, lastConstructor, getEditGroup());
        } else {
            lrw.insertLast(mdecl, getEditGroup());
        }
        ConstructorEditor editor = new ConstructorEditor(getManager(), mdecl, true);
        allConstructors.add(editor);
        managedConstructors.add(editor);
        return editor;
    }

    public MethodEditor getObjCMethodBinder(String selector, boolean isStatic) {
        for (MethodEditor editor : allMethods) {
            if (editor.isObjCMethodBinder(selector, isStatic)) {
                managedMethods.add(editor);
                return editor;
            }
        }
        return null;
    }

    public MethodEditor getObjCProtocolClassMethodBinder(String jmethod) {
        for (MethodEditor editor : allMethods) {
            if (editor.isObjCProtocolClassMethodBinder(jmethod)) {
                managedMethods.add(editor);
                return editor;
            }
        }
        return null;
    }

    public ClassEditor getBlockClass(String className) {
        for (ClassEditor editor : allClasses) {
            if (className.equals(editor.getClassName())) {
                managedClasses.add(editor);
                return editor;
            }
        }
        TypeDeclaration newCls = getAST().newTypeDeclaration();
        lrw.insertLast(newCls, getEditGroup());
        ClassEditor editor = new ClassEditor(getManager(), newCls, true);
        allClasses.add(editor);
        managedClasses.add(editor);
        return editor;
    }
}
