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

import org.moe.natjgen.TypeResolver.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public class CStructManager extends AbstractUnitManager {

    /**
     * Logger for the class
     */
    private static final Logger LOG = LoggerFactory.getLogger(CStructManager.class);

    /**
     * Array containing all fields in the struct
     */
    private final ArrayList<CStructField> fields = new ArrayList<CStructField>();
    private final ArrayList<Type> fieldSecondaryTypes = new ArrayList<Type>();

    private final String sourceFile;

    private final String USR;

    private final ArrayList<String> aliases = new ArrayList<String>();

    public static final String INVALID_NAME = "<invalid>";

    private boolean hasConstructorCompatibleFields = true;

    private long alignment = -1;

    private long naturalAlignment = -1;

    private int numberOfModelDowngraderRuns = 0;

    /**
     * Field type resolver
     */
    private static final TypeResolver fieldTResolver;

    static {
        fieldTResolver = new TypeResolver("Struct Field", Constants.CRuntime, Context.C);
        fieldTResolver.set(TypeResolver.VOID, TypeResolver.BOTH, false, true, true);
        fieldTResolver.set(TypeResolver.PRIMITIVE, TypeResolver.BOTH, true, true, true);
        fieldTResolver.set(TypeResolver.STRUCT, TypeResolver.BOTH, true, true, true);
        fieldTResolver.set(TypeResolver.OPAQUE, TypeResolver.BOTH, true, true, true);
        fieldTResolver.set(TypeResolver.FUNCTION_CB, TypeResolver.BOTH, false, true, false);
        fieldTResolver.setSupportedMappers(new String[] { Constants.CStringMapper, Constants.CStringArrayMapper
        });
    }

    private boolean declarationComplete;

    /**
     * Create a struct manager
     *
     * @param indexer     indexer
     * @param packageName package name
     * @param unitName    struct name
     * @param USR         struct USR
     */
    protected CStructManager(Indexer indexer, String name_fq, String sourceFile, String USR) {
        super(indexer, name_fq);
        this.sourceFile = sourceFile;
        this.USR = USR;
    }

    /**
     * Indicates whether the struct is supported or not.
     */
    @Override
    public boolean isSupported() {
        return isSupported(null);
    }

    /**
     * Collects faults related to structural damage and returns support
     * information
     *
     * @param problems target array for information
     * @return true is struct is supported otherwise false
     */
    private boolean isSupported(ArrayList<String> problems) {
        if (fatalMessage != null) {
            Util.addProblem(fatalMessage, problems);
            return false;
        }

        if (aliases.size() == 1 && (getUnitName().startsWith("_") || getUnitName().equals(INVALID_NAME))) {
            setUnitName(aliases.get(0));
            aliases.clear();
        }

        if (getUnitName().equals(INVALID_NAME)) {
            Util.addProblem("struct's name was not resolved", problems);
            return false;
        }

        boolean isSupported = true;
        ArrayList<String> innerP = problems == null ? null : new ArrayList<String>();
        for (CStructField field : fields) {
            if (innerP != null) {
                innerP.clear();
            }

            if (field.isBitField()) {
                Util.addProblem("bitfield \"" + field.getGetterName() + "\" is not supported", problems);
                isSupported = false;
            }

            if (!field.getType().isSupported(getGenerator(), innerP)) {
                boolean fallbacked = false;
                if (field.getType().isPointer()) {
                    Type inner = field.getType().getInnerType();
                    if (inner.getKind() == Type.Struct) {
                        if (USR.equals(inner.getElementName())) {
                            LOG.debug("Fallbacked " + getUnitName() + ": " + field.getName());
                            fallbacked = true;
                        }
                    }
                }
                if (!fallbacked) {
                    Util.transferProblems("bad field \"" + field.getGetterName() + "\" type", innerP, problems);
                    isSupported = false;
                    continue;
                }
            }

            boolean supportsRead = true;
            if (!fieldTResolver.supports(field.getType(), false)) {
                supportsRead = false;
            }

            boolean supportsWrite = true;
            if (!fieldTResolver.supports(field.getType(), true)) {
                supportsWrite = false;
                hasConstructorCompatibleFields = false;
            }

            if (field.getConstantArraySize() > 1) {
                hasConstructorCompatibleFields = false;
            }

            if (field.getType().isCallback()) {
                CallbackManager cbman = field.getType().getCallbackManager();
                if (cbman == null) {
                    cbman = new CallbackManager(this, field.getSetter(), 0);
                    field.getType().setCallbackManager(cbman);
                }
                if (!cbman.isSupported()) {
                    Util.addProblem("unhadled callback at arg(" + field.getGetterName() + "@" + fields.indexOf(field)
                            + ") type [" + field.getType() + "]", problems);
                    isSupported = false;
                    continue;
                }
            }

            if (!supportsRead && !supportsWrite) {
                Util.addProblem("\"" + field.getGetterName() + "\" field's type \"" + field.getRawType()
                        + "\" not supported by resolver \"" + fieldTResolver.getName() + "\"", problems);
                isSupported = false;
                continue;
            }
        }

        return isSupported;
    }

    /**
     * Report failure of a generation
     */
    public void reportFailure() {
        ArrayList<String> problems = new ArrayList<String>();
        isSupported(problems);
        log(Statistics.SKIPPING, Statistics.C_STRUCT, getUnitName(), null, problems);
    }

    private String fatalMessage;

    /**
     * Tells whether the struct has a fatal problem or not.
     *
     * @return true is the struct has a fatal flaw, otherwise false
     */
    public boolean isFatal() {
        return fatalMessage != null;
    }

    /**
     * Set fatal information, this will implicitly disable generation of the
     * unit
     *
     * @param string
     */
    public void setFatal(String string) {
        fatalMessage = string;
    }

    /**
     * Returns the fields in the struct
     *
     * @return fields
     */
    public final ArrayList<CStructField> getFields() {
        return fields;
    }

    public ArrayList<Type> getFieldSecondaryTypes() {
        return fieldSecondaryTypes;
    }

    public void flattenSecondaryFieldTypes() {
        if (isFatal()) {
            fieldSecondaryTypes.clear();
            return;
        }

        if (fieldSecondaryTypes.size() != fields.size()) {
            setFatal("Failed to merge secondary field types");
            LOG.debug(USR + ": " + fatalMessage);
            fieldSecondaryTypes.clear();
            return;
        }

        int i = 0;
        for (Type t : fieldSecondaryTypes) {
            Type ft = fields.get(i).getRawType();
            if (!ft.setDowngradable(t)) {
                setFatal("Failed to merge secondary field types for field #" + i);
                LOG.debug(USR + ": " + fatalMessage);
                break;
            }
            ++i;
        }

        fieldSecondaryTypes.clear();
    }

    /**
     * Cached field path match
     */
    private final String fieldPathMatch[] = new String[] { TypeConfiguration.C_STRUCT, null, TypeConfiguration.FIELD,
            null
    };

    @Override
    public void preparationPhase_MemberTypeValidation() {
        TypeConfiguration tConf = getIndexer().getInputTypeConfiguration();

        fieldPathMatch[1] = getUnitName();
        for (CStructField field : fields) {
            fieldPathMatch[3] = field.getName();
            field.getType().setPreferredResolving(tConf.getPreferredType(fieldPathMatch));
        }

        calculateNaturalAlignment();
    }

    @Override
    public void update() {
        ClassMemberEditor cme;
        try {
            cme = updateClass();
        } catch (GeneratorException e) {
            logFAIL(Statistics.C_STRUCT, getFullyQualifiedName(), null, LOG, e);
            return;
        }

        int order = 0;
        for (CStructField field : fields) {
            try {
                if (fieldTResolver.supports(field.getType(), false)) {
                    updateField(field, order, cme, true);
                } else {
                    log(Statistics.INCOMPLETE, Statistics.C_STRUCT_FIELD, field.getGetterName(), getUnitName(),
                            fieldTResolver.getName() + " doesn't support this return type");
                }
                if (fieldTResolver.supports(field.getType(), true)) {
                    updateField(field, order, cme, false);
                } else {
                    log(Statistics.INCOMPLETE, Statistics.C_STRUCT_FIELD, field.getGetterName(), getUnitName(),
                            fieldTResolver.getName() + " doesn't support this argument type");
                }
                logOK(Statistics.C_STRUCT_FIELD);
            } catch (GeneratorException e) {
                logFAIL(Statistics.C_STRUCT_FIELD, field.getGetterName(), getFullyQualifiedName(), LOG, e);
            }

            try {
                Type t = field.getType();
                if (t.isCallback()) {
                    CallbackManager cbman = t.getCallbackManager();
                    if (cbman == null) {
                        throw new RuntimeException();
                    }
                    cbman.update(cme);
                    logOK(Statistics.CALLBACK);
                }
            } catch (GeneratorException e) {
                logFAIL(Statistics.CALLBACK, field.getGetterName(), getFullyQualifiedName(), LOG, e);
            }

            ++order;
        }

        cme.close();
        logOK(Statistics.C_STRUCT);
    }

    @Override
    public void cleanup() {
        fields.clear();
    }

    public void addAlias(String name, String sourceFile) {
        if (sourceFile.equals(this.sourceFile)) {
            if (!name.startsWith("_")) {
                aliases.add(name);
            } else {
                if (INVALID_NAME.equals(getUnitName())) {
                    aliases.add(name);
                }
            }
        }
    }

    /**
     * Update class information
     *
     * @return ClassMemberEditor for the class
     * @throws GeneratorException
     */
    private ClassMemberEditor updateClass() throws GeneratorException {
        ClassEditor editor = new ClassEditor(this, getClassDecl(), isNew());
        if (editor.isEditable()) {
            editor.setClass();
            editor.setClassName(getUnitName());
            editor.setSuperClass(addImport(Constants.StructObjectFQ));
            editor.setInterfaces();

            editor.setNatJCacheField();
            editor.setStaticInitializer();

            ModifierEditor modifiers = editor.getModifiers();
            modifiers.setPublic();
            modifiers.setFinal();
            modifiers.setStructure(alignment != naturalAlignment ? (int)alignment : 0);
            if (alignment != naturalAlignment) {
                // LOG.debug("Non-default alignment for struct \"" +
                // getUnitName() + "\": " + alignment + " instead of " +
                // naturalAlignment);
            }
            modifiers.setGenerated();

            XcodeDocumentation doc = new XcodeDocumentation(getComment(), getEditGroup());
            editor.setJavaDoc(doc);

            editor.close();
        }

        if (fields.size() > 0) {
            ConstructorEditor emptyC = editor.getMemberEditor().setConstructor();
            if (emptyC != null && emptyC.isEditable()) {
                emptyC.getModifiers().setPublic();
                emptyC.getModifiers().setGenerated();
                emptyC.setBodyAsSuperInitWithClassAsArg();
                emptyC.close();
            }
        }

        Type pointerCAT = new Type(Constants.PointerFQ, true);
        String pointerCAN = "peer";
        ConstructorEditor pointerC = editor.getMemberEditor().setConstructor(pointerCAT);
        if (pointerC != null && pointerC.isEditable()) {
            pointerC.getModifiers().setProtected();
            pointerC.getModifiers().setGenerated();
            pointerC.setArgumentCount(1);
            pointerC.setArgument(0, pointerCAN, pointerCAT, TypeResolver.PRIMITIVE_RESOLVER);
            pointerC.setBodyAsSuperInitWithPointerAsArg(pointerCAN);
            pointerC.close();
        }

        int numfields = fields.size();
        if (hasConstructorCompatibleFields && numfields > 0 && numfields < 5) {
            Type fields_T[] = new Type[numfields];
            String fields_G[] = new String[numfields];
            String fields_S[] = new String[numfields];
            int idx = 0;
            for (CStructField field : fields) {
                fields_T[idx] = field.getType();
                fields_G[idx] = field.getGetterName();
                fields_S[idx] = field.getSetterName();
                ++idx;
            }
            ConstructorEditor elemC = editor.getMemberEditor().setConstructor(fields_T);
            if (elemC != null && elemC.isEditable()) {
                elemC.getModifiers().setPublic();
                elemC.getModifiers().setGenerated();
                elemC.setArgumentCount(numfields);
                for (int i = 0; i < numfields; ++i) {
                    elemC.setArgument(i, fields_G[i], fields_T[i], fieldTResolver);
                }
                elemC.setBodyAsSuperInitWithFieldSetters(fields_S, fields_G);
                elemC.close();
            }
        }

        return editor.getMemberEditor();
    }

    /**
     * Update field getter/setter method information
     *
     * @param field    field
     * @param order    order of the field
     * @param cme      class member editor
     * @param isGetter true if method is getter otherwise false
     * @throws GeneratorException
     */
    private void updateField(CStructField field, int order, ClassMemberEditor cme, boolean isGetter)
            throws GeneratorException {
        String name = isGetter ? field.getGetterName() : field.getSetterName();
        int argCount = isGetter ? 0 : 1;
        if (field.getConstantArraySize() > 1) {
            ++argCount;
        }

        MethodEditor editor = cme.getStructFieldBinder(order, isGetter);
        if (editor == null) {
            if (cme.hasMethod(name, false, argCount)) {
                editor = cme.getMehtod(name, false, argCount);
            } else {
                editor = cme.newMethod();
            }
        }

        if (editor != null && editor.isEditable()) {

            editor.setName(name);
            editor.setArgumentCount(argCount);

            int idx = 0;
            if (isGetter) {
                editor.setType(field.getType(), fieldTResolver);
            } else {
                editor.setType(new Type(), TypeResolver.PRIMITIVE_RESOLVER);
                editor.setArgument(idx++, "value", field.getType(), fieldTResolver);
            }
            if (field.getConstantArraySize() > 1) {
                editor.setArgument(idx++, "field_idx", new Type(Type.INT_SIZE), TypeResolver.PRIMITIVE_RESOLVER);
            }

            ModifierEditor modifiers = editor.getModifiers();
            modifiers.setPublic();
            modifiers.setNative();
            modifiers.setStructureField(order, isGetter, field.getConstantArraySize());
            modifiers.setGenerated();

            XcodeDocumentation doc = new XcodeDocumentation(field.getComment(), getEditGroup());
            editor.setJavaDoc(doc, null);

            editor.close();
        }

        // Add uncertain bindings to outputTypeConfiguration
        TypeConfiguration otc = getIndexer().getOutputTypeConfiguration();
        fieldPathMatch[3] = field.getName();
        for (MethodEditor.UncertainElem uncert : editor.getUncertains()) {
            if (uncert.getDescriptor().isFallback()) {
                logType(Statistics.UNCERTAIN_TYPE, Statistics.C_STRUCT_FIELD);
                otc.setPreferredType(fieldPathMatch, null, uncert.getDescriptor().getOptions());
            } else {
                logType(Statistics.RESOLVED_UNCERTAIN_TYPE, Statistics.C_STRUCT_FIELD);
                otc.setPreferredType(fieldPathMatch, uncert.getDescriptor().getResolved(),
                        uncert.getDescriptor().getOptions());
            }
        }

        // Return type + arg types - resolved types
        int count = 1;
        for (int i = 0; i < count; ++i) {
            logType(Statistics.RESOLVED_TYPE, Statistics.C_STRUCT_FIELD);
        }

        try {
            Type t = field.getType();
            if (t.isCallback()) {
                CallbackManager cbman = t.getCallbackManager();
                if (cbman == null) {
                    throw new RuntimeException();
                }
                cbman.update(cme);
                logOK(Statistics.CALLBACK);
            }
        } catch (GeneratorException e) {
            logFAIL(Statistics.CALLBACK, field.getName(), getFullyQualifiedName(), LOG, e);
        }
    }

    public long getAlignment() {
        return alignment;
    }

    public void setAlignment(long alignment) {
        this.alignment = alignment;
    }

    private void calculateNaturalAlignment() {
        long max = 1;
        for (CStructField field : fields) {
            long align = field.getType().getDataAlignment(getGenerator());
            if (max < align) {
                max = align;
            }
        }
        naturalAlignment = max;
    }

    public boolean isModelDowngraderExecuting() {
        return numberOfModelDowngraderRuns == 1;
    }

    public void incModelDowngraderExecutionCount() {
        ++this.numberOfModelDowngraderRuns;
    }

    public void setDeclarationComplete(boolean declarationComplete) {
        this.declarationComplete = declarationComplete;
    }

    public boolean isDeclarationComplete() {
        return declarationComplete;
    }
}
