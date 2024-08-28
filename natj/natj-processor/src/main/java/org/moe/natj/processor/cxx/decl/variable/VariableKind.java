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

package org.moe.natj.processor.cxx.decl.variable;

import org.moe.natj.processor.cxx.decl.IKindInfo;

/**
 * This enum represents the different kinds of variable accesses.
 */
public enum VariableKind implements IKindInfo {
    /**
     * Global variable value getter.
     */
    GLOBAL_VARIABLE_GETTER("gvg"),

    /**
     * Global variable value setter.
     */
    GLOBAL_VARIABLE_SETTER("gvs"),

    /**
     * Class-static variable value getter.
     */
    CLASS_FIELD_GETTER("cfg"),

    /**
     * Class-static variable value setter.
     */
    CLASS_FIELD_SETTER("cfs"),

    /**
     * Class-instance variable value getter.
     */
    INSTANCE_FIELD_GETTER("ifg"),

    /**
     * Class-instance variable value setter.
     */
    INSTANCE_FIELD_SETTER("ifs"),
    //
    ;

    /**
     * Category name.
     */
    public final String category;

    /**
     * Create a new VariableKind.
     *
     * @param category Category name
     */
    VariableKind(String category) {
        this.category = category;
    }

    @Override
    public boolean nativeHasIdentifier() {
        return true;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public boolean isInGlobalContext() {
        switch (this) {
            case GLOBAL_VARIABLE_GETTER:
            case GLOBAL_VARIABLE_SETTER:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean isInClassContext() {
        switch (this) {
            case INSTANCE_FIELD_GETTER:
            case INSTANCE_FIELD_SETTER:
            case CLASS_FIELD_GETTER:
            case CLASS_FIELD_SETTER:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean isClassMember() {
        return isInstanceField();
    }

    /**
     * Tells whether or not this enum value is a global variable value accessor.
     *
     * @return True iff enum value is a global variable value accessor
     */
    public boolean isGlobalVariable() {
        switch (this) {
            case GLOBAL_VARIABLE_GETTER:
            case GLOBAL_VARIABLE_SETTER:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this enum value is a class-static variable value accessor.
     *
     * @return True iff enum value is a class-static variable value accessor
     */
    public boolean isClassField() {
        switch (this) {
            case CLASS_FIELD_GETTER:
            case CLASS_FIELD_SETTER:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this enum value is a class-instance variable value accessor.
     *
     * @return True iff enum value is a class-instance variable value accessor
     */
    public boolean isInstanceField() {
        switch (this) {
            case INSTANCE_FIELD_GETTER:
            case INSTANCE_FIELD_SETTER:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this enum value is a variable value getter accessor.
     *
     * @return True iff enum value is a variable value getter accessor
     */
    public boolean isGetter() {
        switch (this) {
            case GLOBAL_VARIABLE_GETTER:
            case CLASS_FIELD_GETTER:
            case INSTANCE_FIELD_GETTER:
                return true;
            default:
                return false;
        }
    }

    /**
     * Tells whether or not this enum value is a variable value setter accessor.
     *
     * @return True iff enum value is a variable value setter accessor
     */
    public boolean isSetter() {
        return !isGetter();
    }
}
