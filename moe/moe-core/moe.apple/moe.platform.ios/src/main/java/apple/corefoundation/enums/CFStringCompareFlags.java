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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Find and compare flags; these are OR'ed together and provided as CFStringCompareFlags in the various functions.
 */
@Generated
public final class CFStringCompareFlags {
    @Generated @NUInt public static final long CaseInsensitive = 0x0000000000000001L;
    /**
     * Starting from the end of the string
     */
    @Generated @NUInt public static final long Backwards = 0x0000000000000004L;
    /**
     * Only at the specified starting point
     */
    @Generated @NUInt public static final long Anchored = 0x0000000000000008L;
    /**
     * If specified, loose equivalence is performed (o-umlaut == o, umlaut)
     */
    @Generated @NUInt public static final long Nonliteral = 0x0000000000000010L;
    /**
     * User's default locale is used for the comparisons
     */
    @Generated @NUInt public static final long Localized = 0x0000000000000020L;
    /**
     * Numeric comparison is used; that is, Foo2.txt < Foo7.txt < Foo25.txt
     */
    @Generated @NUInt public static final long Numerically = 0x0000000000000040L;
    /**
     * If specified, ignores diacritics (o-umlaut == o)
     */
    @Generated @NUInt public static final long DiacriticInsensitive = 0x0000000000000080L;
    /**
     * If specified, ignores width differences ('a' == UFF41)
     */
    @Generated @NUInt public static final long WidthInsensitive = 0x0000000000000100L;
    /**
     * If specified, comparisons are forced to return either kCFCompareLessThan or kCFCompareGreaterThan if the strings are equivalent but not strictly equal, for stability when sorting (e.g. "aaa" > "AAA" with kCFCompareCaseInsensitive specified)
     */
    @Generated @NUInt public static final long ForcedOrdering = 0x0000000000000200L;

    @Generated
    private CFStringCompareFlags() {
    }
}
