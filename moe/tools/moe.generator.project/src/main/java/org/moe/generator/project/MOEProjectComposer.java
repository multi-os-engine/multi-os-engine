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

/**
 * This class configures a MOE project based on the specified settings.
 */
public class MOEProjectComposer implements Cloneable {

    /**
     * Composer fields.
     */
    public enum Field {
        /**
         * Target directory.
         */
        TARGET_DIRECTORY("target directory"),
        /**
         * Project name.
         */
        PROJECT_NAME("project name"),
        /**
         * Organization name.
         */
        ORGANIZATION_NAME("organization name"),
        /**
         * Organization identifier.
         */
        ORGANIZATION_IDENTIFIER("organization identifier"),
        /**
         * Package name.
         */
        PACKAGE_NAME("package name"),
        /**
         * Is subproject.
         */
        IS_SUBPROJECT("is subproject"),
        /**
         * MOE version.
         */
        MOE_VERSION("Multi-OS Engine version"),
        /**
         * Project template.
         */
        TEMPLATE("template");

        /**
         * Field description.
         */
        public final String description;

        /**
         * Creates a new Field instance.
         * @param description Field description
         */
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
     * Is subproject flag.
     */
    private boolean isSubproject = false;

    /**
     * Multi-OS Engine version.
     */
    private String moeVersion;

    /**
     * Project template.
     */
    public enum Template {
        /**
         * OpenGL ES Game Java project template.
         */
        IOS_JAVA_GAME(Platform.IOS, Language.JAVA, "OpenGL ES Game", ID.GAME),
        /**
         * Master-Detail application Java project template.
         */
        IOS_JAVA_MASTER_DETAIL(Platform.IOS, Language.JAVA, "Master-Detail Application", ID.MASTER_DETAIL),
        /**
         * Single view application Java project template.
         */
        IOS_JAVA_SINGLE_VIEW(Platform.IOS, Language.JAVA, "Single View Application", ID.SINGE_VIEW),
        /**
         * OpenGL ES Game Kotlin project template.
         */
        IOS_KOTLIN_GAME(Platform.IOS, Language.KOTLIN, "OpenGL ES Game", ID.GAME),
        /**
         * Master-Detail application Kotlin project template.
         */
        IOS_KOTLIN_MASTER_DETAIL(Platform.IOS, Language.KOTLIN, "Master-Detail Application", ID.MASTER_DETAIL),
        /**
         * Single view application Kotlin project template.
         */
        IOS_KOTLIN_SINGLE_VIEW(Platform.IOS, Language.KOTLIN, "Single View Application", ID.SINGE_VIEW),
        ;

        /**
         * Platform.
         */
        public final String group;

        /**
         * Programming language.
         */
        public final String language;

        /**
         * Template description.
         */
        public final String description;

        /**
         * Template ID.
         */
        public final String id;

        /**
         * Creates a new Template instance.
         * @param group Platform
         * @param language Programming language
         * @param description Template description
         * @param id Template ID
         */
        Template(String group, String language, String description, String id) {
            this.group = group;
            this.language = language;
            this.description = description;
            this.id = id;
        }

        /**
         * Platforms.
         */
        public static class Platform {
            /**
             * iOS platform.
             */
            public static final String IOS = "iOS";
        }

        /**
         * Programming languages.
         */
        public static class Language {
            /**
             * Java.
             */
            public static final String JAVA = "Java";
            /**
             * Kotlin.
             */
            public static final String KOTLIN = "Kotlin";
        }

        /**
         * Template ID.
         */
        public static class ID {
            /**
             * OpenGL ES Game.
             */
            public static final String GAME = "game-gl";
            /**
             * Master-Detail Application.
             */
            public static final String MASTER_DETAIL = "master-detail";
            /**
             * Single View Application.
             */
            public static final String SINGE_VIEW = "single-view";
        }
    }

    /**
     * Template.
     */
    private Template template = Template.IOS_JAVA_SINGLE_VIEW;

    /**
     * Returns the directory where the project should be placed.
     * @return Directory where the project should be placed
     */
    public File getTargetDirectory() {
        return targetDirectory;
    }

    /**
     * Sets the directory where the project should be placed.
     * @param targetDirectory Directory where the project should be placed
     * @return This instance
     */
    public MOEProjectComposer setTargetDirectory(File targetDirectory) {
        this.targetDirectory = targetDirectory;
        return this;
    }

    /**
     * Returns the name of the project.
     * @return Name of the project
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * Sets the name of the project.
     * @param projectName Name of the project
     * @return This instance
     */
    public MOEProjectComposer setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * Returns the name of the organization.
     * @return Name of the organization
     */
    public String getOrganizationName() {
        return organizationName;
    }

    /**
     * Sets the name of the organization.
     * @param organizationName Name of the organization
     * @return This instance
     */
    public MOEProjectComposer setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
        return this;
    }

    /**
     * Returns the reverse DNS identifier of the organization.
     * @return Reverse DNS identifier of the organization
     */
    public String getOrganizationID() {
        return organizationID;
    }

    /**
     * Sets the reverse DNS identifier of the organization.
     * @param organizationID Reverse DNS identifier of the organization
     * @return This instance
     */
    public MOEProjectComposer setOrganizationID(String organizationID) {
        this.organizationID = organizationID;
        return this;
    }

    /**
     * Returns the Java package.
     * @return Java package
     */
    public String getPackageName() {
        return packageName;
    }

    /**
     * Sets the Java package.
     * @param packageName Java package
     * @return This instance
     */
    public MOEProjectComposer setPackageName(String packageName) {
        this.packageName = packageName;
        return this;
    }

    /**
     * Returns the is subproject flag.
     * @return Is subproject flag
     */
    public boolean isSubproject() {
        return isSubproject;
    }

    /**
     * Sets the is subproject flag.
     * @param subproject Is subproject flag
     * @return This instance
     */
    public MOEProjectComposer setSubproject(boolean subproject) {
        isSubproject = subproject;
        return this;
    }

    /**
     * Returns the Multi-OS Engine version.
     * @return Multi-OS Engine version
     */
    public String getMoeVersion() {
        return moeVersion;
    }

    /**
     * Sets the Multi-OS Engine version.
     * @param moeVersion Multi-OS Engine version
     * @return This instance
     */
    public MOEProjectComposer setMoeVersion(String moeVersion) {
        this.moeVersion = moeVersion;
        return this;
    }

    /**
     * Returns the template.
     * @return Template
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * Sets the template.
     * @param template Template
     * @return This instance
     */
    public MOEProjectComposer setTemplate(Template template) {
        this.template = template;
        return this;
    }

    /**
     * Composes the bundle ID from the organization ID and project name.
     * @return Bundle ID
     */
    public String getBundleID() {
        return String.valueOf(getOrganizationID()) + "." + String.valueOf(getProjectName());
    }

    /**
     * Validates the values in the specified fields.
     * @param fields Fields to validate
     * @throws MOEProjectComposerValidationException if validation fails
     */
    public void validate(Field... fields) throws MOEProjectComposerValidationException {
        if (fields == null) {
            fields = Field.values();
        }

        for (Field filed : fields) {
            switch (filed) {
            case TARGET_DIRECTORY: {
                requireNotNull(TARGET_DIRECTORY, targetDirectory);
            }
            break;
            case PROJECT_NAME: {
                requireNotEmpty(PROJECT_NAME, projectName);
            }
            break;
            case ORGANIZATION_NAME: {
                requireNotEmpty(ORGANIZATION_NAME, organizationName);
            }
            break;
            case ORGANIZATION_IDENTIFIER: {
                requireNotEmpty(ORGANIZATION_IDENTIFIER, organizationID);
            }
            break;
            case PACKAGE_NAME: {
                requireJavaPackage(PACKAGE_NAME, packageName);
            }
            break;
            case MOE_VERSION: {
                requireVersionNumber(MOE_VERSION, moeVersion);
            }
            break;
            case TEMPLATE: {
                requireNotNull(TEMPLATE, template);
            }
            break;
            }
        }
    }

    /**
     * Creates the project.
     * @throws MOEProjectComposerException if validation or creation fails
     */
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

    /**
     * Validates that the specified value is not null.
     * @param field Owner field
     * @param value Value to validate
     * @throws MOEProjectComposerValidationException if requirement fails
     */
    private static void requireNotNull(Field field, Object value) throws MOEProjectComposerValidationException {
        if (value == null) {
            throw new MOEProjectComposerValidationException(field, "cannot be null");
        }
    }

    /**
     * Validates that the specified value is not empty.
     * @param field Owner field
     * @param value Value to validate
     * @throws MOEProjectComposerValidationException if requirement fails
     */
    private static void requireNotEmpty(Field field, String value) throws MOEProjectComposerValidationException {
        requireNotNull(field, value);
        if (value.length() == 0) {
            throw new MOEProjectComposerValidationException(field, "cannot be empty");
        }
    }

    /**
     * Validates that the specified value is a valid java package string.
     * @param field Owner field
     * @param value Value to validate
     * @throws MOEProjectComposerValidationException if requirement fails
     */
    private static void requireJavaPackage(Field field, String value) throws MOEProjectComposerValidationException {
        requireNotEmpty(field, value);
        if (!isValidJavaPackage(value)) {
            throw new MOEProjectComposerValidationException(field, "is not a valid Java package name");
        }
    }

    /**
     * Validates that the specified value is a valid version number string.
     * @param field Owner field
     * @param version Value to validate
     * @throws MOEProjectComposerValidationException if requirement fails
     */
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

    /**
     * Validation exception.
     */
    public static class MOEProjectComposerValidationException extends MOEProjectComposerException {
        /**
         * Failed field.
         */
        private final Field field;

        /**
         * Creates a new MOEProjectComposerValidationException instance.
         * @param field Failed field
         * @param message Error message
         */
        public MOEProjectComposerValidationException(Field field, String message) {
            super(field.description + " " + message);
            this.field = field;
        }

        /**
         * Returns the failed field.
         * @return Failed field
         */
        public Field getField() {
            return field;
        }
    }

    /**
     * Composer exception.
     */
    public static class MOEProjectComposerException extends Exception {
        /**
         * Creates a new MOEProjectComposerException instance.
         * @param message Error message
         */
        public MOEProjectComposerException(String message) {
            super(message);
        }

        /**
         * Creates a new MOEProjectComposerException instance.
         * @param message Error message
         * @param cause   Cause
         */
        public MOEProjectComposerException(String message, Throwable cause) {
            super(message, cause);
        }
    }
}
