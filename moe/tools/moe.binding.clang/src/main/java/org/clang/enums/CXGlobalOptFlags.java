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

@Generated
public final class CXGlobalOptFlags {
    /**
     * Used to indicate that no special CXIndex options are needed.
     */
    @Generated public static final int CXGlobalOpt_None = 0x00000000;
    /**
     * Used to indicate that threads that libclang creates for indexing
     * purposes should use background priority.
     * <p>
     * Affects #clang_indexSourceFile, #clang_indexTranslationUnit,
     * #clang_parseTranslationUnit, #clang_saveTranslationUnit.
     */
    @Generated public static final int CXGlobalOpt_ThreadBackgroundPriorityForIndexing = 0x00000001;
    /**
     * Used to indicate that threads that libclang creates for editing
     * purposes should use background priority.
     * <p>
     * Affects #clang_reparseTranslationUnit, #clang_codeCompleteAt,
     * #clang_annotateTokens
     */
    @Generated public static final int CXGlobalOpt_ThreadBackgroundPriorityForEditing = 0x00000002;
    /**
     * Used to indicate that all threads that libclang creates should use
     * background priority.
     */
    @Generated public static final int CXGlobalOpt_ThreadBackgroundPriorityForAll = 0x00000003;

    @Generated
    private CXGlobalOptFlags() {
    }
}
