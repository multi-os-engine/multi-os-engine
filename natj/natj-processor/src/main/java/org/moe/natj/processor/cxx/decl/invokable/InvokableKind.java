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

package org.moe.natj.processor.cxx.decl.invokable;

import org.moe.natj.processor.cxx.decl.IKindInfo;

/**
 * This enum represents the different type of invokable functions.
 */
public enum InvokableKind implements IKindInfo {
    /*
    Global context
     */

    /**
     * C++ function.
     */
    FUNCTION("fn"),

    /**
     * Non-member operator.
     */
    OPERATOR_FUNCTION("fnop"),

    /*
    Class context
     */

    /**
     * Class constructor.
     */
    CONSTRUCTOR("c"),

    /**
     * Instance method.
     */
    INSTANCE_METHOD("im"),

    /**
     * Class method.
     */
    CLASS_METHOD("cm"),

    /**
     * Member operator.
     */
    OPERATOR("op"),

    /**
     * Member cast operator.
     */
    CAST_OPERATOR("cop"),
    //
    ;

    /**
     * Category name.
     */
    public final String category;

    /**
     * Create a new InvokableKind.
     *
     * @param category Category string
     */
    InvokableKind(String category) {
        this.category = category;
    }

    @Override
    public boolean nativeHasIdentifier() {
        switch (this) {
            case FUNCTION:
            case INSTANCE_METHOD:
            case CLASS_METHOD:
                return true;
            default:
                return false;
        }
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public boolean isInGlobalContext() {
        switch (this) {
            case FUNCTION:
            case OPERATOR_FUNCTION:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean isInClassContext() {
        switch (this) {
            case CONSTRUCTOR:
            case INSTANCE_METHOD:
            case CLASS_METHOD:
            case OPERATOR:
            case CAST_OPERATOR:
                return true;
            default:
                return false;
        }
    }

    @Override
    public boolean isClassMember() {
        switch (this) {
            case INSTANCE_METHOD:
            case OPERATOR:
            case CAST_OPERATOR:
                return true;
            default:
                return false;
        }
    }
}
