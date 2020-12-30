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
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] CFCharacterSetPredefinedSet
 *        Type of the predefined CFCharacterSet selector values.
 */
@Generated
public final class CFCharacterSetPredefinedSet {
    /**
     * Control character set (Unicode General Category Cc and Cf)
     */
    @Generated @NInt public static final long Control = 0x0000000000000001L;
    /**
     * Whitespace character set (Unicode General Category Zs and U0009 CHARACTER TABULATION)
     */
    @Generated @NInt public static final long Whitespace = 0x0000000000000002L;
    /**
     * Whitespace and Newline character set (Unicode General Category Z*, U000A ~ U000D, and U0085)
     */
    @Generated @NInt public static final long WhitespaceAndNewline = 0x0000000000000003L;
    /**
     * Decimal digit character set
     */
    @Generated @NInt public static final long DecimalDigit = 0x0000000000000004L;
    /**
     * Letter character set (Unicode General Category L* & M*)
     */
    @Generated @NInt public static final long Letter = 0x0000000000000005L;
    /**
     * Lowercase character set (Unicode General Category Ll)
     */
    @Generated @NInt public static final long LowercaseLetter = 0x0000000000000006L;
    /**
     * Uppercase character set (Unicode General Category Lu and Lt)
     */
    @Generated @NInt public static final long UppercaseLetter = 0x0000000000000007L;
    /**
     * Non-base character set (Unicode General Category M*)
     */
    @Generated @NInt public static final long NonBase = 0x0000000000000008L;
    /**
     * Canonically decomposable character set
     */
    @Generated @NInt public static final long Decomposable = 0x0000000000000009L;
    /**
     * Alpha Numeric character set (Unicode General Category L*, M*, & N*)
     */
    @Generated @NInt public static final long AlphaNumeric = 0x000000000000000AL;
    /**
     * Punctuation character set (Unicode General Category P*)
     */
    @Generated @NInt public static final long Punctuation = 0x000000000000000BL;
    /**
     * Titlecase character set (Unicode General Category Lt)
     */
    @Generated @NInt public static final long CapitalizedLetter = 0x000000000000000DL;
    /**
     * Symbol character set (Unicode General Category S*)
     */
    @Generated @NInt public static final long Symbol = 0x000000000000000EL;
    /**
     * Newline character set (U000A ~ U000D, U0085, U2028, and U2029)
     */
    @Generated @NInt public static final long Newline = 0x000000000000000FL;
    /**
     * Illegal character set
     */
    @Generated @NInt public static final long Illegal = 0x000000000000000CL;

    @Generated
    private CFCharacterSetPredefinedSet() {
    }
}
