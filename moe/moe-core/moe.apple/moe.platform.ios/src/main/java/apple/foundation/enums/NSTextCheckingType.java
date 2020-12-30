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

/**
 * NSTextCheckingResult is a class used to describe items located by text checking.  Each of these objects represents something that has been found during checking--a misspelled word, a sentence with grammatical issues, a detected URL, a straight quote to be replaced with curly quotes, and so forth.
 */
@Generated
public final class NSTextCheckingType {
    /**
     * language identification
     */
    @Generated public static final long Orthography = 0x0000000000000001L;
    /**
     * spell checking
     */
    @Generated public static final long Spelling = 0x0000000000000002L;
    /**
     * grammar checking
     */
    @Generated public static final long Grammar = 0x0000000000000004L;
    /**
     * date/time detection
     */
    @Generated public static final long Date = 0x0000000000000008L;
    /**
     * address detection
     */
    @Generated public static final long Address = 0x0000000000000010L;
    /**
     * link detection
     */
    @Generated public static final long Link = 0x0000000000000020L;
    /**
     * smart quotes
     */
    @Generated public static final long Quote = 0x0000000000000040L;
    /**
     * smart dashes
     */
    @Generated public static final long Dash = 0x0000000000000080L;
    /**
     * fixed replacements, such as copyright symbol for (c)
     */
    @Generated public static final long Replacement = 0x0000000000000100L;
    /**
     * autocorrection
     */
    @Generated public static final long Correction = 0x0000000000000200L;
    /**
     * regular expression matches
     */
    @Generated public static final long RegularExpression = 0x0000000000000400L;
    /**
     * phone number detection
     */
    @Generated public static final long PhoneNumber = 0x0000000000000800L;
    /**
     * transit (e.g. flight) info detection
     */
    @Generated public static final long TransitInformation = 0x0000000000001000L;

    @Generated
    private NSTextCheckingType() {
    }
}
