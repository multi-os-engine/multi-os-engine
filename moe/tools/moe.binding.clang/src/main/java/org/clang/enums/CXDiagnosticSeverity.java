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
 * Describes the severity of a particular diagnostic.
 */
@Generated
public final class CXDiagnosticSeverity {
    /**
     * A diagnostic that has been suppressed, e.g., by a command-line
     * option.
     */
    @Generated public static final int Ignored = 0x00000000;
    /**
     * This diagnostic is a note that should be attached to the
     * previous (non-note) diagnostic.
     */
    @Generated public static final int Note = 0x00000001;
    /**
     * This diagnostic indicates suspicious code that may not be
     * wrong.
     */
    @Generated public static final int Warning = 0x00000002;
    /**
     * This diagnostic indicates that the code is ill-formed.
     */
    @Generated public static final int Error = 0x00000003;
    /**
     * This diagnostic indicates that the code is ill-formed such
     * that future parser recovery is unlikely to produce useful
     * results.
     */
    @Generated public static final int Fatal = 0x00000004;

    @Generated
    private CXDiagnosticSeverity() {
    }
}
