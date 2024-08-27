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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public final class ObjCExternalCategoryManager extends ObjCClassManager {

    /**
     * Logger for the class
     */
    private static final Logger LOG = LoggerFactory.getLogger(ObjCExternalCategoryManager.class);

    /**
     * Manager of the category's class
     */
    protected final ObjCClassManager categoryClassManager;

    /**
     * Create a new class manager
     *
     * @param indexer     indexer
     * @param packageName package name
     * @param unitName    class name
     * @param superName   super class's name
     */
    public ObjCExternalCategoryManager(Indexer indexer, String name_fq, ObjCClassManager categoryClassManager) {
        super(indexer, name_fq + "Ext", categoryClassManager.originalName, null, null);

        // Set value
        this.categoryClassManager = categoryClassManager;
    }

    @Override
    public void preparationPhase_Initialize() {
        super.preparationPhase_Initialize();
    }

    @Override
    public void preparationPhase_MemberTypeValidation() {
        for (ObjCMethod method : allMethods) {
            validateMember(method);
            method.updateFamily(originalName);
        }
    }

    @Override
    public void preparationPhase_MemberMerge() {
        for (ObjCMethod method : allMethods) {
            if (method.getFamily() == ObjCMethodFamily.INIT) {
                initMethods.add(method);
            } else if (method.getFamily() == ObjCMethodFamily.FACTORY) {
                factoryMethods.add(method);
            }
        }
    }

    @Override
    public void preparationPhase_MemberManipulation() {
        for (ObjCMethod method : allMethods) {
            fixNameCollisionForMethod(method);
        }
    }

    @Override
    public void preparationPhase_Final() {
        sortAllMethods();
    }

    @Override
    public void update() {
        ClassMemberEditor cme = updateClass();
        for (ObjCMethod method : allMethods) {
            update(method, cme);
        }
        cme.close();
    }

    private ClassMemberEditor updateClass() {
        try {
            ClassEditor editor = new ClassEditor(this, getClassDecl(), isNew());
            if (editor.isEditable()) {
                editor.setClass();
                editor.setClassName(getUnitName());
                editor.setSuperClass(null);
                editor.setInterfaces();
                editor.setStaticInitializer();

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setFinal();
                modifiers.setObjCCategory(addImport(categoryClassManager));
                modifiers.setRuntime(addImport(Constants.ObjCRuntimeFQ));
                if (libraryName != null) {
                    modifiers.setLibrary(libraryName);
                }
                if (isDeprecated()) {
                    modifiers.setDeprecated();
                }
                modifiers.setGenerated();

                XcodeDocumentation doc = new XcodeDocumentation(getComment(), getEditGroup());
                editor.setJavaDoc(doc);

                editor.close();
            }

            ConstructorEditor emptyC = editor.getMemberEditor().setConstructor();
            if (emptyC != null && emptyC.isEditable()) {
                emptyC.getModifiers().setPrivate();
                emptyC.getModifiers().setGenerated();
                emptyC.setBodyAsEmpty();
                emptyC.close();
            }

            logOK(Statistics.OBJC_CLASS);
            return editor.getMemberEditor();
        } catch (GeneratorException e) {
            logFAIL(Statistics.OBJC_CLASS, getFullyQualifiedName(), null, LOG, e);
            return null;
        }
    }

    private void update(ObjCMethod method, ClassMemberEditor cme) {
        if (method.isDisabled() || method.isExternalUnit()) {
            return;
        }

        try {
            if (cme == null) {
                throw new GeneratorException("container (" + getFullyQualifiedName() + ") failed");
            }

            MethodEditor editor = cme.getObjCMethodBinder(method.getSelector(), method.isStatic());
            if (editor == null) {
                if (cme.hasMethod(method.getJavaName(), method.isStatic(), method.getArguments().size() + 1)) {
                    editor = cme.getMehtod(method.getJavaName(), method.isStatic(), method.getArguments().size() + 1);
                } else {
                    editor = cme.newMethod();
                }
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(method.getJavaName());
                if (isCreatorMethod(method)) {
                    editor.setType(new Type(categoryClassManager.getUnitName()), methCreatorRetTResolver);
                } else {
                    editor.setType(method.getType(), methTResolver);
                }
                editor.setArgumentCount(method.getArguments().size() + (method.isStatic() ? 0 : 1));
                int idx = 0;
                if (!method.isStatic()) {
                    editor.setArgument(idx, "_object", new Type(categoryClassManager.originalName), methTResolver);
                    ++idx;
                }
                for (CalleeArgument arg : method.getArguments()) {
                    editor.setArgument(idx, arg.getName(), arg.getType(), methTResolver);
                    ++idx;
                }

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setStatic();
                modifiers.setNative();
                if (method.isStatic()) {
                    modifiers.setCategoryClassMethod();
                }
                modifiers.setSelector(method.getSelector());
                if (method.isDeprecated()) {
                    modifiers.setDeprecated();
                }
                if (method.isOptional()) {
                    modifiers.setIsOptional();
                }
                if (method.isRetainedReturn() && method.getType().isObjCObject()) {
                    modifiers.setOwned();
                }
                modifiers.setGenerated();

                // Add documentation
                if (method.getPropertyName() == null) {
                    String type = null;
                    type = method.isStatic() ?
                            XcodeDocumentation.DocInterfaceClassMethodType :
                            XcodeDocumentation.DocInterfaceMethodType;
                    if (type != null) {
                        try {
                            XcodeDocumentation doc = new XcodeDocumentation(getIndexer(),
                                    XcodeDocumentation.DocObjectiveCLanguage, type, originalName, method.getSelector(), method.getComment(),
                                    getEditGroup());
                            editor.setJavaDoc(doc, method.getArguments());
                        } catch (IOException e) {
                        }
                    }
                } else {
                    String type = null;
                    type = XcodeDocumentation.DocInterfacePropertyType;
                    if (type != null) {
                        try {
                            XcodeDocumentation doc = new XcodeDocumentation(getIndexer(),
                                    XcodeDocumentation.DocObjectiveCLanguage, type, originalName,
                                    method.getPropertyName(), method.getComment(), getEditGroup());
                            editor.setJavaDoc(doc, method.getArguments());
                        } catch (IOException e) {
                        }
                    }
                }

                editor.close();
            }

            if (method.getOwner() == this) {
                logOK(method.getStatisticsCategory());
            }
        } catch (GeneratorException e) {
            logFAIL(method.getStatisticsCategory(), method.getSelector(), getFullyQualifiedName(), LOG, e);
        }

        if (method.getOwner() == this) {
            updateFunctionCBOrBlockInterface(cme, method);
        }
    }

}
