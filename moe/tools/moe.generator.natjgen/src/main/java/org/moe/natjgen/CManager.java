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

import org.eclipse.core.runtime.CoreException;
import org.moe.natjgen.TypeResolver.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public final class CManager extends AbstractUnitManager {

    /**
     * Logger for the class
     */
    private static final Logger LOG = LoggerFactory.getLogger(CManager.class);

    /**
     * Functions in the framework
     */
    private final ArrayList<CFunction> functions = new ArrayList<CFunction>(512);

    /**
     * Variables in the framework
     */
    private final ArrayList<CVariable> variables = new ArrayList<CVariable>(512);

    /**
     * Additional manager for C inline functions
     */
    private final CInlineManager inlineManager;

    /**
     * Function type resolver
     */
    private static final TypeResolver funcTResolver;

    /**
     * Variable type resolver
     */
    private static final TypeResolver varTResolver;

    static {
        funcTResolver = new TypeResolver("C Function", Constants.CRuntime, Context.C);
        funcTResolver.set(TypeResolver.VOID, TypeResolver.BOTH, false, true, true);
        funcTResolver.add(TypeResolver.VOID, TypeResolver.RETURN, true, false, false);
        funcTResolver.set(TypeResolver.PRIMITIVE, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.STRUCT, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.OPAQUE, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.FUNCTION_CB, TypeResolver.BOTH, false, true, false);
        funcTResolver.set(TypeResolver.OBJC_OBJECT, TypeResolver.BOTH, true, true, true);
        funcTResolver.set(TypeResolver.OBJC_CLASS, TypeResolver.BOTH, true, false, false);
        funcTResolver.set(TypeResolver.OBJC_SELECTOR, TypeResolver.BOTH, true, false, false);
        funcTResolver.set(TypeResolver.OBJC_BLOCK, TypeResolver.BOTH, true, false, false);
        funcTResolver.setSupportedMappers(
                new String[] { Constants.CStringMapper, Constants.ObjCStringMapper, Constants.CStringArrayMapper
                });

        varTResolver = new TypeResolver("C Variable", Constants.CRuntime, Context.C);
        varTResolver.set(TypeResolver.VOID, TypeResolver.RETURN, false, true, true);
        varTResolver.set(TypeResolver.PRIMITIVE, TypeResolver.RETURN, true, true, true);
        varTResolver.set(TypeResolver.STRUCT, TypeResolver.RETURN, true, true, true);
        varTResolver.set(TypeResolver.OPAQUE, TypeResolver.RETURN, true, true, true);
        varTResolver.set(TypeResolver.OBJC_OBJECT, TypeResolver.RETURN, true, true, true);
        varTResolver.set(TypeResolver.OBJC_CLASS, TypeResolver.RETURN, true, false, false);
        varTResolver.set(TypeResolver.OBJC_SELECTOR, TypeResolver.RETURN, true, false, false);
        varTResolver.setSupportedMappers(new String[] { Constants.CStringMapper, Constants.ObjCStringMapper
        });
    }

    private String libraryName;

    public void setLibraryName(String libraryName) {
        if (libraryName != null && libraryName.length() == 0) {
            libraryName = null;
        }
        this.libraryName = libraryName;
    }

    /**
     * Create a new C function manager
     *
     * @param indexer     indexer
     * @param packageName package name
     * @param unitName    unit name
     */
    protected CManager(Indexer indexer, String name_fq) {
        super(indexer, name_fq);
        String outputPath = indexer.getConfiguration().getDemangledInlineFunctionsNativeBindingOutputPath();
        if (outputPath == null || outputPath.length() == 0) {
            inlineManager = null;
        } else {
            inlineManager = new CInlineManager(this, new File(outputPath));
        }
    }

    /**
     * Cached function path match
     */
    private final String funcPathMatch[] = new String[] { TypeConfiguration.C_FUNCTION, null,
            TypeConfiguration.LOCATION, null
    };

    /**
     * Cached variable path match
     */
    private final String varPathMatch[] = new String[] { TypeConfiguration.C_VARIABLE, null
    };

    @Override
    public void preparationPhase_MemberTypeValidation() {
        TypeConfiguration tConf = getIndexer().getInputTypeConfiguration();

        for (CFunction function : functions) {
            validateMember(function);

            // Update uncertain binding resolving
            if (!function.getDontGenerate()) {
                funcPathMatch[1] = function.getName();

                funcPathMatch[3] = "-1";
                function.getType().setPreferredResolving(tConf.getPreferredType(funcPathMatch));

                int idx = 0;
                for (CalleeArgument arg : function.getArguments()) {
                    funcPathMatch[3] = Integer.toString(idx);
                    arg.getType().setPreferredResolving(tConf.getPreferredType(funcPathMatch));
                    ++idx;
                }
            }
        }

        for (CVariable variable : variables) {
            validateMember(variable);

            // Update uncertain binding resolving
            if (!variable.getDontGenerate()) {
                varPathMatch[1] = variable.getName();
                variable.getType().setPreferredResolving(tConf.getPreferredType(varPathMatch));
            }
        }
    }

    @Override
    public boolean isSupported() {
        return true;
    }

    @Override
    public void update() {
        ClassMemberEditor cme = updateClass();
        for (CFunction function : functions) {
            update(function, cme);
            // Adding functions to the inline manager is done here, because here
            // we can check support for it.
            if (inlineManager != null && function.isInline() && !function.getDontGenerate()) {
                inlineManager.addFunction(function);
            }
        }
        for (CVariable variable : variables) {
            update(variable, cme);
        }
        cme.close();
        try {
            if (inlineManager != null) {
                inlineManager.endEdit();
            }
        } catch (CoreException e) {
            LOG.error("inline c function manager failed", e);
        }
    }

    @Override
    public void cleanup() {
        functions.clear();
        variables.clear();
    }

    /**
     * Add C function
     *
     * @param function function
     */
    public void addFunction(CFunction function) {
        if (getFunctionWithJavaName(function.getJavaName()) == null) {
            functions.add(function);
        }
    }

    /**
     * Add C variable
     *
     * @param variable variable
     */
    public void addVariable(CVariable variable) {
        if (getVariableWithJavaName(variable.getJavaName()) == null) {
            variables.add(variable);
        }
    }

    /**
     * Get the C function with a given name
     *
     * @param name name
     * @return resolved function
     */
    public CFunction getFunction(String name) {
        for (CFunction function : functions) {
            if (function.getName().equals(name)) {
                return function;
            }
        }

        return null;
    }

    /**
     * Get the C variable with a given name
     *
     * @param name name
     * @return resolved variable
     */
    public CVariable getVariable(String name) {
        for (CVariable variable : variables) {
            if (variable.getName().equals(name)) {
                return variable;
            }
        }

        return null;
    }

    /**
     * Get the C function with a given java name
     *
     * @param javaname java name
     * @return resolved function
     */
    private final CFunction getFunctionWithJavaName(String javaname) {
        for (CFunction function : functions) {
            if (function.getJavaName().equals(javaname)) {
                return function;
            }
        }

        return null;
    }

    /**
     * Get the C variable with a given java name
     *
     * @param javaname java name
     * @return resolved variable
     */
    private final CVariable getVariableWithJavaName(String javaname) {
        for (CVariable variable : variables) {
            if (variable.getJavaName().equals(javaname)) {
                return variable;
            }
        }

        return null;
    }

    /**
     * Validates a function
     *
     * @param function function
     */
    private void validateMember(CFunction function) {
        if (function.getDontGenerate()) {
            return;
        }

        boolean isValid = true;
        ArrayList<String> problems = new ArrayList<String>();
        if (!function.isSupported(getGenerator(), problems)) {
            isValid = false;
        } else {
            if (function.isInline() && inlineManager == null) {
                problems.add(funcTResolver.getName() + " " + function.getName() + " cannot be generated, "
                        + Configuration.CONFKEY_INLINE_FUNCTION_BINDING_OUTPUT_PATH
                        + " is not defined in configuration");
                isValid = false;
            }
            if (function.getType().isCallback()) {
                CallbackManager cbman = function.getType().getCallbackManager();
                if (cbman == null) {
                    cbman = new CallbackManager(this, function, -1);
                    function.getType().setCallbackManager(cbman);
                }
                if (!cbman.isSupported()) {
                    problems.add("unhadled callback at return type [" + function.getType() + "]");
                    isValid = false;
                }
            }
            if (!funcTResolver.supports(function.getType(), false)) {
                problems.add(
                        funcTResolver.getName() + " resolver doesn't handle return type [" + function.getType() + "]");
                isValid = false;
            }

            int idx = 0;
            for (CalleeArgument arg : function.getArguments()) {
                if (arg.getType().isCallback()) {
                    CallbackManager cbman = arg.getType().getCallbackManager();
                    if (cbman == null) {
                        cbman = new CallbackManager(this, function, idx);
                        arg.getType().setCallbackManager(cbman);
                    }
                    if (!cbman.isSupported()) {
                        problems.add(
                                "unhadled callback at arg(" + arg.getName() + "@" + idx + ") type [" + arg.getType()
                                        + "]");
                        isValid = false;
                    }
                }
                if (!funcTResolver.supports(arg.getType(), true)) {
                    problems.add(funcTResolver.getName() + " resolver doesn't handle arg(" + arg.getName() + "@" + idx
                            + ") type [" + arg.getType() + "]");
                    isValid = false;
                }
                ++idx;
            }
        }

        if (!isValid) {
            function.setDontGenerate();
            log(Statistics.SKIPPING, Statistics.C_FUNCTION, function.getName(), null, problems);
        }
    }

    /**
     * Validates a variable
     *
     * @param variable variable
     */
    private void validateMember(CVariable variable) {
        if (variable.getDontGenerate()) {
            return;
        }

        boolean isValid = true;
        ArrayList<String> problems = new ArrayList<String>();
        if (!variable.isSupported(getGenerator(), problems)) {
            isValid = false;
        } else {
            if (!varTResolver.supports(variable.getType(), false)) {
                problems.add(varTResolver.getName() + " resolver doesn't handle type [" + variable.getType() + "]");
                isValid = false;
            }
        }

        if (!isValid) {
            variable.setDontGenerate();
            log(Statistics.SKIPPING, Statistics.C_VARIABLE, variable.getName(), null, problems);
        }
    }

    /**
     * Update class information
     *
     * @return ClassMemberEditor for the class
     * @throws GeneratorException
     */
    private ClassMemberEditor updateClass() {
        try {
            ClassEditor editor = new ClassEditor(this, getClassDecl(), isNew());
            if (editor.isEditable()) {
                editor.setClass();
                editor.setClassName(getUnitName());
                editor.setSuperClass(null);
                editor.setInterfaces((String[])null);
                editor.setStaticInitializer();

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setFinal();
                modifiers.setRuntime(addImport(Constants.CRuntimeFQ));
                if (libraryName != null) {
                    modifiers.setLibrary(libraryName);
                }
                modifiers.setGenerated();

                editor.close();
            }

            ConstructorEditor emptyC = editor.getMemberEditor().setConstructor();
            if (emptyC != null && emptyC.isEditable()) {
                emptyC.getModifiers().setPrivate();
                emptyC.getModifiers().setGenerated();
                emptyC.setBodyAsEmpty();
                emptyC.close();
            }

            return editor.getMemberEditor();
        } catch (GeneratorException e) {
            LOG.error("class update failed " + getFullyQualifiedName(), e);
            return null;
        }
    }

    /**
     * Update function binder method information
     *
     * @param function function
     * @param cme      class member editor
     * @throws GeneratorException
     */
    private void update(CFunction function, ClassMemberEditor cme) {
        if (function.getDontGenerate()) {
            return;
        }

        try {
            if (cme == null) {
                throw new GeneratorException("container (" + getFullyQualifiedName() + ") failed");
            }

            final int numArgs = function.getArguments().size() + (function.isVariadic() ? 1 : 0);
            MethodEditor editor = cme.getCFunctionBinder(function.getName());
            if (editor == null) {
                if (cme.hasMethod(function.getJavaName(), true, numArgs)) {
                    editor = cme.getMehtod(function.getJavaName(), true, numArgs);
                } else {
                    editor = cme.newMethod();
                }
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(function.getJavaName());
                editor.setType(function.getType(), funcTResolver);
                editor.setArgumentCount(numArgs);
                int idx = 0;
                for (CalleeArgument arg : function.getArguments()) {
                    editor.setArgument(idx, arg.getName(), arg.getType(), funcTResolver);
                    ++idx;
                }
                if (function.isVariadic()) {
                    editor.setVariadicArgument(idx, function.getVariadicName());
                }

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setStatic();
                modifiers.setNative();
                modifiers.setCFunction(function.getJavaName().equals(function.getName()) ? null : function.getName());
                if (function.isDeprecated()) {
                    modifiers.setDeprecated();
                }
                if (function.isInline()) {
                    modifiers.setInline();
                }
                if (function.isVariadic()) {
                    modifiers.setVariadic();
                }
                modifiers.setGenerated();

                try {
                    XcodeDocumentation doc = new XcodeDocumentation(getIndexer(), XcodeDocumentation.DocCLanguage,
                            XcodeDocumentation.DocFunctionType, "-", function.getName(), getEditGroup());
                    editor.setJavaDoc(doc, function.getArguments());
                } catch (IOException e) {
                }

                editor.close();
            }

            // Add uncertain bindings to outputTypeConfiguration
            TypeConfiguration otc = getIndexer().getOutputTypeConfiguration();
            funcPathMatch[1] = function.getName();
            for (MethodEditor.UncertainElem uncert : editor.getUncertains()) {
                funcPathMatch[3] = uncert.getLocation();
                if (uncert.getDescriptor().isFallback()) {
                    logType(Statistics.UNCERTAIN_TYPE, Statistics.C_FUNCTION);
                    otc.setPreferredType(funcPathMatch, null, uncert.getDescriptor().getOptions());
                } else {
                    logType(Statistics.RESOLVED_UNCERTAIN_TYPE, Statistics.C_FUNCTION);
                    otc.setPreferredType(funcPathMatch, uncert.getDescriptor().getResolved(),
                            uncert.getDescriptor().getOptions());
                }
            }

            // Return type + arg types - resolved types
            int count = 1 + function.getArguments().size() - editor.getUncertains().size();
            for (int i = 0; i < count; ++i) {
                logType(Statistics.RESOLVED_TYPE, Statistics.C_FUNCTION);
            }

            logOK(Statistics.C_FUNCTION);
        } catch (GeneratorException e) {
            logFAIL(Statistics.C_FUNCTION, function.getName(), getFullyQualifiedName(), LOG, e);
        }

        updateFunctionCBOrBlockInterface(cme, function);
    }

    /**
     * Update variable getter method information
     *
     * @param function function
     * @param cme      class member editor
     * @throws GeneratorException
     */
    private void update(CVariable variable, ClassMemberEditor cme) {
        if (variable.getValue() != null) {
            updateContant(variable, cme);
            return;
        }

        if (variable.getDontGenerate()) {
            return;
        }

        try {
            MethodEditor editor = cme.getCVariableBinder(variable.getName(), true);
            if (editor == null) {
                if (cme.hasMethod(variable.getJavaName(), true, 0)) {
                    editor = cme.getMehtod(variable.getJavaName(), true, 0);
                } else {
                    editor = cme.newMethod();
                }
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(variable.getJavaName());
                editor.setType(variable.getType(), varTResolver);
                editor.setArgumentCount(0);

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setStatic();
                modifiers.setNative();
                modifiers.setCVariable(variable.getJavaName().equals(variable.getName()) ? null : variable.getName(),
                        true);
                modifiers.setGenerated();

                editor.close();
            }

            // Add uncertain bindings to outputTypeConfiguration
            TypeConfiguration otc = getIndexer().getOutputTypeConfiguration();
            varPathMatch[1] = variable.getName();
            for (MethodEditor.UncertainElem uncert : editor.getUncertains()) {
                if (uncert.getDescriptor().isFallback()) {
                    logType(Statistics.UNCERTAIN_TYPE, Statistics.C_VARIABLE);
                    otc.setPreferredType(varPathMatch, null, uncert.getDescriptor().getOptions());
                } else {
                    logType(Statistics.RESOLVED_UNCERTAIN_TYPE, Statistics.C_VARIABLE);
                    otc.setPreferredType(varPathMatch, uncert.getDescriptor().getResolved(),
                            uncert.getDescriptor().getOptions());
                }
            }

            // Return type - resolved types
            int count = 1 - editor.getUncertains().size();
            for (int i = 0; i < count; ++i) {
                logType(Statistics.RESOLVED_TYPE, Statistics.C_VARIABLE);
            }

            logOK(Statistics.C_VARIABLE);
        } catch (GeneratorException e) {
            logFAIL(Statistics.C_VARIABLE, variable.getName(), getFullyQualifiedName(), LOG, e);
        }
    }

    private void updateContant(CVariable variable, ClassMemberEditor cme) {
        if (variable.getDontGenerate()) {
            return;
        }

        try {
            if (cme == null) {
                throw new GeneratorException("container (" + getFullyQualifiedName() + ") failed");
            }
            FieldEditor editor = null;
            if (cme.hasField(variable.getName())) {
                editor = cme.getField(variable.getName());
            } else {
                editor = cme.newField();
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(variable.getName());
                editor.setType(variable.getType(), TypeResolver.PRIMITIVE_RESOLVER);
                ConstantValue constantValue = variable.getValue();
                if (constantValue.hasDifferent32BitValue()) {
                    editor.setInitializer(variable.getType(), constantValue.getValue(), constantValue.getValue32());
                } else {
                    editor.setInitializer(variable.getType(), constantValue.getValue());
                }

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setStatic();
                modifiers.setFinal();
                modifiers.setGenerated();

                editor.close();
            }
            logOK(Statistics.C_VARIABLE);
        } catch (GeneratorException ex) {
            logFAIL(Statistics.C_VARIABLE, variable.getName(), getFullyQualifiedName(), LOG, ex);
        }
    }

    public void resetEditorState() {
        for (CFunction function : functions) {
            function.clearEdited();
        }
        for (CVariable variable : variables) {
            variable.clearEdited();
        }
    }

    public void disableUneditedMethods() {
        for (CFunction function : functions) {
            if (!function.isEdited()) {
                function.setDontGenerate();
            }
        }
        for (CVariable variable : variables) {
            if (!variable.isEdited()) {
                variable.setDontGenerate();
            }
        }
    }

}
