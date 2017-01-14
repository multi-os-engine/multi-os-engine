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

import org.moe.natjgen.MethodEditor.UncertainElem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;

public class ObjCProtocolManager extends ObjCClassManager {

    /**
     * Logger for the class
     */
    private static final Logger LOG = LoggerFactory.getLogger(ObjCProtocolManager.class);

    /**
     * Create a new protocol manager
     *
     * @param indexer     indexer
     * @param packageName package name
     * @param unitName    protocol name
     */
    public ObjCProtocolManager(Indexer indexer, String name_fq, String originalName, String runtimeName) {
        super(indexer, name_fq, originalName, null, runtimeName);
    }

    /**
     * Returns the methods of the protocol
     *
     * @return methods
     */
    public final ArrayList<ObjCMethod> getMethods() {
        return allMethods;
    }

    @Override
    public void preparationPhase_Initialize() {
        super.preparationPhase_Initialize();
    }

    @Override
    public void preparationPhase_MemberTypeValidation() {
        for (ObjCMethod method : allMethods) {
            validateMember(method);
            if (method.isDisabled()) {
                continue;
            }
            updateMemberPreferredTypes(method);
        }
    }

    @Override
    public void preparationPhase_MemberMerge() {
        // Do nothing
    }

    @Override
    public void preparationPhase_MemberManipulation() {
        super.preparationPhase_MemberManipulation();
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
                editor.setInterface();
                editor.setClassName(getUnitName());
                editor.setSuperClass(null);
                String itfs[] = new String[protocols.size()];
                int idx = 0;
                for (ObjCProtocolManager pman : protocols) {
                    itfs[idx++] = addImport(pman);
                }
                editor.setInterfaces(itfs);

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                if (runtimeName != null && runtimeName.length() > 0 && !originalName.equals(runtimeName)) {
                    modifiers.setObjCProtocolName(runtimeName);
                    modifiers.setObjCProtocolSourceName(originalName);
                } else {
                    modifiers.setObjCProtocolName(originalName);
                }
                modifiers.setRuntime(addImport(Constants.ObjCRuntimeFQ));
                if (libraryName != null) {
                    modifiers.setLibrary(libraryName);
                }
                modifiers.setGenerated();

                editor.close();
            }
            logOK(Statistics.OBJC_PROTOCOL);
            return editor.getMemberEditor();
        } catch (GeneratorException e) {
            logFAIL(Statistics.OBJC_PROTOCOL, getFullyQualifiedName(), null, LOG, e);
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
            String javaName;
            MethodEditor editor;
            if (method.isStatic()) {
                javaName = "_" + method.getJavaName();
                editor = cme.getObjCProtocolClassMethodBinder(method.getJavaName());
            } else {
                javaName = method.getJavaName();
                editor = cme.getObjCMethodBinder(method.getSelector(), false);
            }

            final int numArgs = method.getArguments().size() + (method.isVariadic() ? 1 : 0);
            if (editor == null) {
                if (cme.hasMethod(javaName, false, numArgs)) {
                    editor = cme.getMehtod(javaName, false, numArgs);
                } else {
                    editor = cme.newMethod();
                }
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(javaName);
                editor.setType(method.getType(), methTResolver);
                editor.setArgumentCount(numArgs);
                int idx = 0;
                for (CalleeArgument arg : method.getArguments()) {
                    editor.setArgument(idx, arg.getName(), arg.getType(), methTResolver);
                    ++idx;
                }
                if (method.isVariadic()) {
                    editor.setVariadicArgument(idx, method.getVariadicName());
                }

                ModifierEditor modifiers = editor.getModifiers();
                if (method.isStatic()) {
                    modifiers.setProtocolClassMethod(method.getJavaName());
                }
                modifiers.setSelector(method.getSelector());
                if (method.isDeprecated()) {
                    modifiers.setDeprecated();
                }
                if (method.isOptional()) {
                    modifiers.setIsOptional();
                    modifiers.setDefault();
                    editor.setBodyAsProtocolDefaultMethod(method.getType());
                }
                if (method.isRetainedReturn() && method.getType().isObjCObject()) {
                    modifiers.setOwned();
                }
                if (method.isVariadic()) {
                    modifiers.setVariadic();
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
                                    XcodeDocumentation.DocObjectiveCLanguage, type, originalName, method.getSelector(),
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
                                    method.getPropertyName(), getEditGroup());
                            editor.setJavaDoc(doc, method.getArguments());
                        } catch (IOException e) {
                        }
                    }
                }

                editor.close();
            }

            // Add uncertain bindings to outputTypeConfiguration
            if (method.getOwner() == this) {
                TypeConfiguration otc = getIndexer().getOutputTypeConfiguration();
                methPathMatch[2] = method.isStatic() ?
                        TypeConfiguration.CLASS_METHOD :
                        TypeConfiguration.INSTANCE_METHOD;
                methPathMatch[3] = method.getSelector();
                for (UncertainElem uncert : editor.getUncertains()) {
                    methPathMatch[5] = uncert.getLocation();
                    if (uncert.getDescriptor().isFallback()) {
                        logType(Statistics.UNCERTAIN_TYPE, method.getStatisticsCategory());
                        otc.setPreferredType(methPathMatch, null, uncert.getDescriptor().getOptions());
                    } else {
                        logType(Statistics.RESOLVED_UNCERTAIN_TYPE, method.getStatisticsCategory());
                        otc.setPreferredType(methPathMatch, uncert.getDescriptor().getResolved(),
                                uncert.getDescriptor().getOptions());
                    }
                }

                // Return type + arg types - resolved types
                int count = 1 + method.getArguments().size() - editor.getUncertains().size();
                for (int i = 0; i < count; ++i) {
                    logType(Statistics.RESOLVED_TYPE, method.getStatisticsCategory());
                }
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
