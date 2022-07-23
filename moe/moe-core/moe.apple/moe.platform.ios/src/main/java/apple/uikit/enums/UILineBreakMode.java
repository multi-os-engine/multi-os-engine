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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Deprecated: use NSLineBreakMode instead
 */
@Deprecated
@Generated
public final class UILineBreakMode {
    /**
     * Wrap at word boundaries
     */
    @Deprecated @Generated @NInt public static final long WordWrap = 0x0000000000000000L;
    /**
     * Wrap at character boundaries
     */
    @Deprecated @Generated @NInt public static final long CharacterWrap = 0x0000000000000001L;
    /**
     * Simply clip when it hits the end of the rect
     */
    @Deprecated @Generated @NInt public static final long Clip = 0x0000000000000002L;
    /**
     * Truncate at head of line: "...wxyz". Will truncate multiline text on first line
     */
    @Deprecated @Generated @NInt public static final long HeadTruncation = 0x0000000000000003L;
    /**
     * Truncate at tail of line: "abcd...". Will truncate multiline text on last line
     */
    @Deprecated @Generated @NInt public static final long TailTruncation = 0x0000000000000004L;
    /**
     * Truncate middle of line: "ab...yz". Will truncate multiline text in the middle
     */
    @Deprecated @Generated @NInt public static final long MiddleTruncation = 0x0000000000000005L;

    @Generated
    private UILineBreakMode() {
    }
}
