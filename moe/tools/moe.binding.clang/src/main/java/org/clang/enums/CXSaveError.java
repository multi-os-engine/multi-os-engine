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
 * Describes the kind of error that occurred (if any) in a call to
 * \c clang_saveTranslationUnit().
 */
@Generated
public final class CXSaveError {
    /**
     * Indicates that no error occurred while saving a translation unit.
     */
    @Generated public static final int None = 0x00000000;
    /**
     * Indicates that an unknown error occurred while attempting to save
     * the file.
     * <p>
     * This error typically indicates that file I/O failed when attempting to
     * write the file.
     */
    @Generated public static final int Unknown = 0x00000001;
    /**
     * Indicates that errors during translation prevented this attempt
     * to save the translation unit.
     * <p>
     * Errors that prevent the translation unit from being saved can be
     * extracted using \c clang_getNumDiagnostics() and \c clang_getDiagnostic().
     */
    @Generated public static final int TranslationErrors = 0x00000002;
    /**
     * Indicates that the translation unit to be saved was somehow
     * invalid (e.g., NULL).
     */
    @Generated public static final int InvalidTU = 0x00000003;

    @Generated
    private CXSaveError() {
    }
}
