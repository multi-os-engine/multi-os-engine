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
 * These options apply to the various search/find and comparison methods (except where noted).
 */
@Generated
public final class NSStringCompareOptions {
    @Generated @NUInt public static final long CaseInsensitiveSearch = 0x0000000000000001L;
    /**
     * Exact character-by-character equivalence
     */
    @Generated @NUInt public static final long LiteralSearch = 0x0000000000000002L;
    /**
     * Search from end of source string
     */
    @Generated @NUInt public static final long BackwardsSearch = 0x0000000000000004L;
    /**
     * Search is limited to start (or end, if NSBackwardsSearch) of source string
     */
    @Generated @NUInt public static final long AnchoredSearch = 0x0000000000000008L;
    /**
     * Added in 10.2; Numbers within strings are compared using numeric value, that is, Foo2.txt < Foo7.txt < Foo25.txt; only applies to compare methods, not find
     */
    @Generated @NUInt public static final long NumericSearch = 0x0000000000000040L;
    /**
     * If specified, ignores diacritics (o-umlaut == o)
     */
    @Generated @NUInt public static final long DiacriticInsensitiveSearch = 0x0000000000000080L;
    /**
     * If specified, ignores width differences ('a' == UFF41)
     */
    @Generated @NUInt public static final long WidthInsensitiveSearch = 0x0000000000000100L;
    /**
     * If specified, comparisons are forced to return either NSOrderedAscending or NSOrderedDescending if the strings are equivalent but not strictly equal, for stability when sorting (e.g. "aaa" > "AAA" with NSCaseInsensitiveSearch specified)
     */
    @Generated @NUInt public static final long ForcedOrderingSearch = 0x0000000000000200L;
    /**
     * Applies to rangeOfString:..., stringByReplacingOccurrencesOfString:..., and replaceOccurrencesOfString:... methods only; the search string is treated as an ICU-compatible regular expression; if set, no other options can apply except NSCaseInsensitiveSearch and NSAnchoredSearch
     */
    @Generated @NUInt public static final long RegularExpressionSearch = 0x0000000000000400L;

    @Generated
    private NSStringCompareOptions() {
    }
}
