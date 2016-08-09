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

package org.moe.natj.processor.cxx.decl;

/**
 * Generic declaration kind information.
 */
public interface IKindInfo {
    /**
     * Tells whether the native code requires an identifier or not.
     *
     * @return true if the native code requires an identifier otherwise false
     */
    boolean nativeHasIdentifier();

    /**
     * Returns the category string for this object.
     *
     * @return category string
     */
    String getCategory();

    /**
     * Tells whether the declaration is in global context or not.
     *
     * @return true if the declaration is in global context otherwise false
     */
    boolean isInGlobalContext();

    /**
     * Tells whether the declaration is in a C++ class context or not.
     *
     * @return true if the declaration is in C++ class context otherwise false
     */
    boolean isInClassContext();

    /**
     * Tells whether the declaration is a class member or not.
     *
     * @return true if the declaration is a class member otherwise false
     */
    boolean isClassMember();
}
