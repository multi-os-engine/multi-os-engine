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
import org.moe.natj.general.ann.NInt;

@Generated
public final class NSFormattingContext {
    /**
     * The capitalization context to be used is unknown (this is the default value).
     */
    @Generated @NInt public static final long Unknown = 0x0000000000000000L;
    /**
     * The capitalization context is determined dynamically from the set {NSFormattingContextStandalone, NSFormattingContextBeginningOfSentence, NSFormattingContextMiddleOfSentence}. For example, if a date is placed at the beginning of a sentence, NSFormattingContextBeginningOfSentence is used to format the string automatically. When this context is used, the formatter will return a string proxy that works like a normal string in most cases. After returning from the formatter, the string in the string proxy is formatted by using NSFormattingContextUnknown. When the string proxy is used in stringWithFormat:, we can determine where the %@ is and then set the context accordingly. With the new context, the string in the string proxy will be formatted again and be put into the final string returned from stringWithFormat:.
     */
    @Generated @NInt public static final long Dynamic = 0x0000000000000001L;
    /**
     * The capitalization context if a date or date symbol is to be formatted with capitalization appropriate for stand-alone usage such as an isolated name on a calendar page.
     */
    @Generated @NInt public static final long Standalone = 0x0000000000000002L;
    /**
     * The capitalization context if a date or date symbol is to be formatted with capitalization appropriate for a list or menu item.
     */
    @Generated @NInt public static final long ListItem = 0x0000000000000003L;
    /**
     * The capitalization context if a date or date symbol is to be formatted with capitalization appropriate for the beginning of a sentence.
     */
    @Generated @NInt public static final long BeginningOfSentence = 0x0000000000000004L;
    /**
     * The capitalization context if a date or date symbol is to be formatted with capitalization appropriate for the middle of a sentence.
     */
    @Generated @NInt public static final long MiddleOfSentence = 0x0000000000000005L;

    @Generated
    private NSFormattingContext() {
    }
}
