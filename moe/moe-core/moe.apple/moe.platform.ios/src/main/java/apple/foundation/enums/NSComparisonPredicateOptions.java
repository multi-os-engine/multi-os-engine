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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Flags(s) that can be passed to the factory to indicate that a operator operating on strings should do so in a case
 * insensitive fashion.
 */
@Generated
public final class NSComparisonPredicateOptions {
    @Generated @NUInt public static final long CaseInsensitivePredicateOption = 0x0000000000000001L;
    @Generated @NUInt public static final long DiacriticInsensitivePredicateOption = 0x0000000000000002L;
    /**
     * Indicate that the strings to be compared have been preprocessed; this supersedes other options and is intended as
     * a performance optimization option
     */
    @Generated @NUInt public static final long NormalizedPredicateOption = 0x0000000000000004L;

    @Generated
    private NSComparisonPredicateOptions() {
    }
}
