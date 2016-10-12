/*
Copyright (C) 2016 Migeran

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

package org.moe.generator.project;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import static org.moe.generator.project.MOEProjectComposer.Field.*;

public class MOEProjectComposer implements Cloneable {

    public enum Field {
        TARGET_DIRECTORY("target directory"),
        PROJECT_NAME("project name"),
        ORGANIZATION_NAME("organization name"),
        ORGANIZATION_IDENTIFIER("organization identifier"),
        PACKAGE_NAME("package name"),
        IS_SUBPROJECT("is subproject"),
        MOE_VERSION("Multi-OS Engine version"),
        TEMPLATE("template");

        public final String description;

        Field(String description) {
            this.description = description;
        }
    }

    /**
     * The directory where the project should be placed.
     */
    private File targetDirectory;

    /**
     * The name of the project.
     */
    private String projectName;

    /**
     * Name of the organization.
     */
    private String organizationName;

    /**
     * Reverse DNS identifier of the organization.
     */
    private String organizationID;

    /**
     * Java package.
     */
    private String packageName;

    /**
     * Is subproject.
     */
    private boolean isSubproject = false;

    /**
     * Multi-OS Engine version.
     */
    private String moeVersion;

    public enum Template {
//        IOS_JAVA_GAME(Platform.IOS, Language.JAVA, "Game", ID.GAME),
        IOS_JAVA_MASTER_DETAIL(Platform.IOS, Language.JAVA, "Master-Detail Application", ID.MASTER_DETAIL),
//        IOS_JAVA_PAGE_BASED(Platform.IOS, Language.JAVA, "Page-Based Application", ID.PAGE_BASED),
        IOS_JAVA_SINGLE_VIEW(Platform.IOS, Language.JAVA, "Single View Application", ID.SINGE_VIEW),
//        IOS_JAVA_TABBED(Platform.IOS, Language.JAVA, "Tabbed Application", ID.TABBED),
//        IOS_KOTLIN_GAME(Platform.IOS, Language.KOTLIN, "Game", ID.GAME),
//        IOS_KOTLIN_MASTER_DETAIL(Platform.IOS, Language.KOTLIN, "Master-Detail Application", ID.MASTER_DETAIL),
//        IOS_KOTLIN_PAGE_BASED(Platform.IOS, Language.KOTLIN, "Page-Based Application", ID.PAGE_BASED),
//        IOS_KOTLIN_SINGLE_VIEW(Platform.IOS, Language.KOTLIN, "Single View Application", ID.SINGE_VIEW),
//        IOS_KOTLIN_TABBED(Platform.IOS, Language.KOTLIN, "Tabbed Application", ID.TABBED),
        ;

        public final String group;

        public final String language;

        public final String description;

        public final String id;

        Template(String group, String language, String description, String id) {
            this.group = group;
            this.language = language;
            this.description = description;
            this.id = id;
        }

        public static class Platform {
            public static final String IOS = "iOS";
        }

        public static class Language {
            public static final String JAVA = "Java";
            public static final String KOTLIN = "Kotlin";
        }

        public static class ID {
            public static final String GAME = "game";
            public static final String MASTER_DETAIL = "master-detail";
            public static final String PAGE_BASED = "page-based";
            public static final String SINGE_VIEW = "single-view";
            public static final String TABBED = "tabbed";
        }
    }

    /**
     * Template name.
     */
    private Template template = Template.IOS_JAVA_SINGLE_VIEW;

    public File getTargetDirectory() {
        return targetDirectory;
    }

    public MOEProjectComposer setTargetDirectory(File targetDirectory) {
        this.targetDirectory = targetDirectory;
        return this;
    }

    public String getProjectName() {
        return projectName;
    }

    public MOEProjectComposer setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public MOEProjectComposer setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    public String getOrganizationID() {
        return organizationID;
    }

    public MOEProjectComposer setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
        return this;
    }

    public String getPackageName() {
        return packageName;
    }

    public MOEProjectComposer setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    public boolean isSubproject() {
        return isSubproject;
    }

    public MOEProjectComposer setSubproject(boolean subproject) {
        isSubproject = subproject;
        return this;
    }

    public String getMoeVersion() {
        return moeVersion;
    }

    public MOEProjectComposer setMoeVersion(String moeVersion) {
        this.moeVersion = moeVersion;
        return this;
    }

    public Template getTemplate() {
        return template;
    }

    public MOEProjectComposer setTemplate(Template template) {
        this.template = template;
        return this;
    }

    public String getBundleID() {
        return String.valueOf(getOrganizationID()) + "." + String.valueOf(getProjectName());
    }

    public void validate() throws MOEProjectComposerValidationException {
        requireNotNull(TARGET_DIRECTORY, targetDirectory);
        requireNotEmpty(PROJECT_NAME, projectName);
        requireNotEmpty(ORGANIZATION_NAME, organizationName);
        requireNotEmpty(ORGANIZATION_IDENTIFIER, organizationID);
        requireJavaPackage(PACKAGE_NAME, packageName);
        requireVersionNumber(MOE_VERSION, moeVersion);
        requireNotNull(TEMPLATE, template);
    }

    public void compose() throws MOEProjectComposerException {
        try {
            validate();
            new MOEProjectFabricator((MOEProjectComposer)this.clone()).fabricate();
        } catch (MOEProjectComposerException e) {
            throw e;
        } catch (Throwable t) {
            throw new MOEProjectComposerException("an internal error occurred", t);
        }
    }

    /*
     * Validation checks
     */

    private static void requireNotNull(Field field, Object value) throws MOEProjectComposerValidationException {
        if (value == null) {
            throw new MOEProjectComposerValidationException(field, "cannot be null");
        }
    }

    private static void requireNotEmpty(Field field, String value) throws MOEProjectComposerValidationException {
        requireNotNull(field, value);
        if (value.length() == 0) {
            throw new MOEProjectComposerValidationException(field, "cannot be empty");
        }
    }

    private static void requireJavaPackage(Field field, String value) throws MOEProjectComposerValidationException {
        requireNotEmpty(field, value);
        if (!isValidJavaPackage(value)) {
            throw new MOEProjectComposerValidationException(field, "is not a valid Java package name");
        }
    }

    private static void requireVersionNumber(Field field, String version) throws MOEProjectComposerValidationException {
        requireNotEmpty(field, version);
        // Support `x.y.z` and `x.y.+` formats
        if (!version.matches("[\\d]+\\.[\\d]+\\.([\\d]+|\\+)")) {
            throw new MOEProjectComposerValidationException(field, "is not a valid version number");
        }
    }

    /**
     * Set of Java keywords (https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-Keyword), boolean
     * literals and the null literal.
     */
    private static final Set<String> KEYWORDS_BOOLLITERALS_NULLLITERAL;

    static {
        KEYWORDS_BOOLLITERALS_NULLLITERAL = Collections.unmodifiableSet(new HashSet<String>(
                Arrays.asList("abstract", "continue", "for", "new", "switch", "assert", "default", "if", "package",
                        "synchronized", "boolean", "do", "goto", "private", "this", "break", "double", "implements",
                        "protected", "throw", "byte", "else", "import", "public", "throws", "case", "enum",
                        "instanceof", "return", "transient", "catch", "extends", "int", "short", "try", "char", "final",
                        "interface", "static", "void", "class", "finally", "long", "strictfp", "volatile", "const",
                        "float", "native", "super", "while", "true", "false", "null")));
    }

    /**
     * Tells whether or not the specified String is a valid Java package name or not.
     *
     * @param value String to validate
     * @return true iff specified string is a valid package name
     */
    private static boolean isValidJavaPackage(String value) {
        // Spec:
        // https://docs.oracle.com/javase/specs/jls/se8/html/jls-6.html#jls-PackageName
        // https://docs.oracle.com/javase/specs/jls/se8/html/jls-3.html#jls-IdentifierChars
        if (value == null) {
            throw new NullPointerException();
        }
        final String[] components = value.split("\\.");
        for (String component : components) {
            if (component.length() == 0) return false;
            final int length = component.length();
            for (int offset = 0; offset < length; ) {
                final int codepoint = component.codePointAt(offset);
                if (offset == 0) {
                    if (!Character.isJavaIdentifierStart(codepoint)) return false;
                } else {
                    if (!Character.isJavaIdentifierPart(codepoint)) return false;
                }
                offset += Character.charCount(codepoint);
            }
            if (KEYWORDS_BOOLLITERALS_NULLLITERAL.contains(component)) return false;
        }
        return true;
    }

    /*
     * Exceptions
     */

    public static class MOEProjectComposerValidationException extends MOEProjectComposerException {
        private final Field field;

        public MOEProjectComposerValidationException(Field field, String message) {
            super(field.description + " " + message);
            this.field = field;
        }

        public Field getField() {
            return field;
        }
    }

    public static class MOEProjectComposerException extends Exception {
        public MOEProjectComposerException(String message) {
            super(message);
        }

        public MOEProjectComposerException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
