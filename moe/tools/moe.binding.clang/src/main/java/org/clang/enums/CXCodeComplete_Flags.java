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
 * Flags that can be passed to \c clang_codeCompleteAt() to
 * modify its behavior.
 * <p>
 * The enumerators in this enumeration can be bitwise-OR'd together to
 * provide multiple options to \c clang_codeCompleteAt().
 */
@Generated
public final class CXCodeComplete_Flags {
    @Generated
    private CXCodeComplete_Flags() {
    }

    /**
     * Whether to include macros within the set of code
     * completions returned.
     */
    @Generated public static final int IncludeMacros = 0x00000001;
    /**
     * Whether to include code patterns for language constructs
     * within the set of code completions, e.g., for loops.
     */
    @Generated public static final int IncludeCodePatterns = 0x00000002;
    /**
     * Whether to include brief documentation within the set of code
     * completions returned.
     */
    @Generated public static final int IncludeBriefComments = 0x00000004;
    /**
     * Whether to speed up completion by omitting top- or namespace-level entities
     * defined in the preamble. There's no guarantee any particular entity is
     * omitted. This may be useful if the headers are indexed externally.
     */
    @Generated public static final int SkipPreamble = 0x00000008;
    /**
     * Whether to include completions with small
     * fix-its, e.g. change '.' to '->' on member access, etc.
     */
    @Generated public static final int IncludeCompletionsWithFixIts = 0x00000010;
}
