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
 * Options to control the display of diagnostics.
 * <p>
 * The values in this enum are meant to be combined to customize the
 * behavior of \c clang_formatDiagnostic().
 */
@Generated
public final class CXDiagnosticDisplayOptions {
    /**
     * Display the source-location information where the
     * diagnostic was located.
     * <p>
     * When set, diagnostics will be prefixed by the file, line, and
     * (optionally) column to which the diagnostic refers. For example,
     * <p>
     * \code
     * test.c:28: warning: extra tokens at end of #endif directive
     * \endcode
     * <p>
     * This option corresponds to the clang flag \c -fshow-source-location.
     */
    @Generated public static final int SourceLocation = 0x00000001;
    /**
     * If displaying the source-location information of the
     * diagnostic, also include the column number.
     * <p>
     * This option corresponds to the clang flag \c -fshow-column.
     */
    @Generated public static final int Column = 0x00000002;
    /**
     * If displaying the source-location information of the
     * diagnostic, also include information about source ranges in a
     * machine-parsable format.
     * <p>
     * This option corresponds to the clang flag
     * \c -fdiagnostics-print-source-range-info.
     */
    @Generated public static final int SourceRanges = 0x00000004;
    /**
     * Display the option name associated with this diagnostic, if any.
     * <p>
     * The option name displayed (e.g., -Wconversion) will be placed in brackets
     * after the diagnostic text. This option corresponds to the clang flag
     * \c -fdiagnostics-show-option.
     */
    @Generated public static final int Option = 0x00000008;
    /**
     * Display the category number associated with this diagnostic, if any.
     * <p>
     * The category number is displayed within brackets after the diagnostic text.
     * This option corresponds to the clang flag
     * \c -fdiagnostics-show-category=id.
     */
    @Generated public static final int CategoryId = 0x00000010;
    /**
     * Display the category name associated with this diagnostic, if any.
     * <p>
     * The category name is displayed within brackets after the diagnostic text.
     * This option corresponds to the clang flag
     * \c -fdiagnostics-show-category=name.
     */
    @Generated public static final int CategoryName = 0x00000020;

    @Generated
    private CXDiagnosticDisplayOptions() {
    }
}
