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

package org.clang.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Flags that control how translation units are saved.
 * <p>
 * The enumerators in this enumeration type are meant to be bitwise
 * ORed together to specify which options should be used when
 * saving the translation unit.
 */
@Generated
public final class CXSaveTranslationUnit_Flags {
    /**
     * Used to indicate that no special saving options are needed.
     */
    @Generated public static final int CXSaveTranslationUnit_None = 0x00000000;

    @Generated
    private CXSaveTranslationUnit_Flags() {
    }
}
