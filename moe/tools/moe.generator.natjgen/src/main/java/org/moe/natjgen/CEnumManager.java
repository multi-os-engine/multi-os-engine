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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;

public final class CEnumManager extends AbstractUnitManager {

    /**
     * Logger for the class
     */
    private static final Logger LOG = LoggerFactory.getLogger(CEnumManager.class);

    /**
     * Array containing all constants in the enum
     */
    private final ArrayList<CEnumConstant> constants = new ArrayList<CEnumConstant>(32);

    /**
     * Indicates whether the prefix trimming is enabled or not
     */
    private boolean prefixTrimEnabled = true;

    private final String sourceFile;

    private final ArrayList<String> aliases = new ArrayList<String>();

    public static final String INVALID_NAME = "<invalid>";

    private String originalName;

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    /**
     * Create an enumerated type manager
     *
     * @param indexer     indexer
     * @param packageName package name
     * @param unitName    enum name
     */
    protected CEnumManager(Indexer indexer, String name_fq, String originalName, String sourceFile) {
        super(indexer, name_fq);

        this.originalName = originalName;
        this.sourceFile = sourceFile;
    }

    /**
     * Returns the constants in the enum
     *
     * @return constant
     */
    public final ArrayList<CEnumConstant> getConstants() {
        return constants;
    }

    /**
     * Disabled prefix trimming (non-revertable action!)
     */
    public void disablePrefixTrim() {
        prefixTrimEnabled = false;
    }

    @Override
    public boolean isSupported() {
        if (aliases.size() == 1 && (getUnitName().startsWith("_") || getUnitName().equals(INVALID_NAME))) {
            setUnitName(aliases.get(0));
            aliases.clear();
        }

        if (getUnitName().equals(INVALID_NAME)) {
            return false;
        }

        return true;
    }

    @Override
    public void preparationPhase_MemberManipulation() {
        if (prefixTrimEnabled) {
            trimPrefix();
        }
    }

    @Override
    public void update() {
        ClassMemberEditor cme = updateClass();
        for (CEnumConstant constant : constants) {
            update(constant, cme);
        }
        cme.close();
    }

    @Override
    public void cleanup() {
        constants.clear();
    }

    public void addAlias(String name, String sourceFile) {
        if (sourceFile.equals(this.sourceFile) && !name.startsWith("_")) {
            aliases.add(name);
        }
    }

    /**
     * Try to trim the prefixes of all constants
     */
    private void trimPrefix() {
        final String enumName = originalName;

        if (constants.size() < 2 || INVALID_NAME.equals(enumName)) {
            return;
        }

        final ArrayList<ArrayList<String>> decomposedConstants = new ArrayList<ArrayList<String>>(constants.size());
        for (CEnumConstant constant : constants) {
            final String name = constant.getName();
            final int nameLength = name.length();
            final ArrayList<String> decomposedConstant = new ArrayList<String>();
            decomposedConstants.add(decomposedConstant);

            // Split by upper-case and underscore characters
            int start = 0, curr = 0;
            while (curr < nameLength) {
                char c = name.charAt(curr);
                if (c == '_' || Character.isUpperCase(c)) {
                    if (start != curr) {
                        decomposedConstant.add(name.substring(start, curr));
                        start = curr;
                    }
                    curr++;
                } else {
                    ++curr;
                }
            }
            decomposedConstant.add(name.substring(start, curr));

            // Join single upper-case components
            curr = 0;
            while (curr < decomposedConstant.size()) {
                start = curr;
                String currStr = decomposedConstant.get(curr);
                if ((currStr.length() != 1 && !isUpperCaseOrNumber(currStr)) || !Character
                        .isUpperCase(currStr.charAt(0))) {
                    ++curr;
                    continue;
                }
                ++curr;
                if (curr >= decomposedConstant.size()) {
                    break;
                }
                while (curr < decomposedConstant.size()) {
                    currStr = decomposedConstant.get(curr);
                    if ((currStr.length() != 1 && !isUpperCaseOrNumber(currStr)) || !Character
                            .isUpperCase(currStr.charAt(0))) {
                        break;
                    }
                    ++curr;
                }
                int len = curr - start;
                if (len > 1) {
                    StringBuilder sb = new StringBuilder(len);
                    for (int i = start; i < curr; ++i) {
                        sb.append(decomposedConstant.remove(start));
                    }
                    decomposedConstant.add(start, sb.toString());
                    curr = start + 1;
                }
            }
        }

        // Lookup common prefixes
        boolean looping = true;
        int lastCommonIdx = -1;
        while (looping) {
            // Get baseline prefix
            if (lastCommonIdx + 1 >= decomposedConstants.get(0).size() - 1) {
                break;
            }
            final String baseline = decomposedConstants.get(0).get(lastCommonIdx + 1);

            for (int i = 1; i < decomposedConstants.size(); ++i) {
                // Get compare prefix
                if (lastCommonIdx + 1 >= decomposedConstants.get(i).size() - 1) {
                    looping = false;
                    break;
                }
                final String compare = decomposedConstants.get(i).get(lastCommonIdx + 1);

                // Compare prefixes
                if (!compare.equals(baseline)) {
                    looping = false;
                    break;
                }
            }
            if (looping) {
                ++lastCommonIdx;
            }
        }

        // No common prefixes were found
        if (lastCommonIdx < 0) {
            return;
        }

        StringBuilder sb = new StringBuilder(256);
        for (int i = 0; i < constants.size(); ++i) {
            sb.setLength(0);
            ArrayList<String> list = decomposedConstants.get(i);
            for (int o = lastCommonIdx + 1; o < list.size(); ++o) {
                sb.append(list.get(o));
            }
            constants.get(i).setName(sb.toString());
        }
    }

    private static boolean isUpperCaseOrNumber(String str) {
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            if (Character.isDigit(c)) continue;
            if (Character.isUpperCase(c)) continue;
            return false;
        }
        return true;
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

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setFinal();
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

            logOK(Statistics.C_ENUM);
            return editor.getMemberEditor();
        } catch (GeneratorException ex) {
            logFAIL(Statistics.C_ENUM, getFullyQualifiedName(), null, LOG, ex);
            return null;
        }
    }

    /**
     * Update constant enum information
     *
     * @param constant constant
     * @param cme      class member editor
     * @throws GeneratorException
     */
    private void update(CEnumConstant constant, ClassMemberEditor cme) {
        if (constant.getDontGenerate()) {
            return;
        }

        try {
            if (cme == null) {
                throw new GeneratorException("container (" + getFullyQualifiedName() + ") failed");
            }
            FieldEditor editor = null;
            if (cme.hasField(constant.getName())) {
                editor = cme.getField(constant.getName());
            } else {
                editor = cme.newField();
            }

            if (editor != null && editor.isEditable()) {
                editor.setName(constant.getName());
                editor.setType(constant.getType(), TypeResolver.PRIMITIVE_RESOLVER);
                ConstantValue constantValue = constant.getValue();
                if (constantValue.hasDifferent32BitValue()) {
                    editor.setInitializer(constant.getType(), constantValue.getValue(), constantValue.getValue32());
                } else {
                    editor.setInitializer(constant.getType(), constantValue.getValue());
                }

                ModifierEditor modifiers = editor.getModifiers();
                modifiers.setPublic();
                modifiers.setStatic();
                modifiers.setFinal();
                modifiers.setGenerated();

                XcodeDocumentation doc = new XcodeDocumentation(constant.getComment(), getEditGroup());
                editor.setJavaDoc(doc);

                editor.close();
            }
            logOK(Statistics.C_ENUM_CONST);
        } catch (GeneratorException ex) {
            logFAIL(Statistics.C_ENUM_CONST, constant.getName(), getFullyQualifiedName(), LOG, ex);
        }
    }

    public CEnumConstant getConstant(String const_name) {
        for (CEnumConstant constant : constants) {
            if (const_name.equals(constant.getName())) {
                return constant;
            }
        }
        return null;
    }

    public void resetEditorState() {
        for (CEnumConstant constant : constants) {
            constant.clearEdited();
        }
    }

    public void disableUneditedMethods() {
        for (CEnumConstant constant : constants) {
            if (!constant.isEdited()) {
                constant.setDontGenerate();
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder();
        b.append("<enum name=\"" + StringEscapeUtils.escapeXml(getFullyQualifiedName()) + "\">");
        for (CEnumConstant constant : constants) {
            if (!constant.getDontGenerate()) {
                b.append(constant);
            }
        }
        b.append("</enum>");
        return b.toString();
    }
}
