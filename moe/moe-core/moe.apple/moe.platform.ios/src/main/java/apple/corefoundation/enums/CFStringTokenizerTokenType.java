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
 * Token type
 * CFStringTokenizerGoToTokenAtIndex / CFStringTokenizerAdvanceToNextToken returns
 * the type of current token.
 */
@Generated
public final class CFStringTokenizerTokenType {
    /**
     * Have no token.
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Normal token
     */
    @Generated @NUInt public static final long Normal = 0x0000000000000001L;
    /**
     * Compound token which may contain subtokens but with no derived subtokens.
     * Its subtokens can be obtained by calling CFStringTokenizerGetCurrentSubTokens.
     */
    @Generated @NUInt public static final long HasSubTokensMask = 0x0000000000000002L;
    /**
     * Compound token which may contain derived subtokens.
     * Its subtokens and derived subtokens can be obtained by calling
     * CFStringTokenizerGetCurrentSubTokens.
     */
    @Generated @NUInt public static final long HasDerivedSubTokensMask = 0x0000000000000004L;
    /**
     * Compound token which may contain derived subtokens.
     * Its subtokens and derived subtokens can be obtained by calling
     * CFStringTokenizerGetCurrentSubTokens.
     */
    @Generated @NUInt public static final long HasHasNumbersMask = 0x0000000000000008L;
    /**
     * Compound token which may contain derived subtokens.
     * Its subtokens and derived subtokens can be obtained by calling
     * CFStringTokenizerGetCurrentSubTokens.
     */
    @Generated @NUInt public static final long HasNonLettersMask = 0x0000000000000010L;
    /**
     * Compound token which may contain derived subtokens.
     * Its subtokens and derived subtokens can be obtained by calling
     * CFStringTokenizerGetCurrentSubTokens.
     */
    @Generated @NUInt public static final long IsCJWordMask = 0x0000000000000020L;

    @Generated
    private CFStringTokenizerTokenType() {
    }
}
