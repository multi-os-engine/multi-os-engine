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

@Generated
public final class NSLineBreakMode {
    /**
     * Wrap at word boundaries, default
     */
    @Generated @NInt public static final long WordWrapping = 0x0000000000000000L;
    /**
     * Wrap at character boundaries
     */
    @Generated @NInt public static final long CharWrapping = 0x0000000000000001L;
    /**
     * Simply clip
     */
    @Generated @NInt public static final long Clipping = 0x0000000000000002L;
    /**
     * Truncate at head of line: "...wxyz"
     */
    @Generated @NInt public static final long TruncatingHead = 0x0000000000000003L;
    /**
     * Truncate at tail of line: "abcd..."
     */
    @Generated @NInt public static final long TruncatingTail = 0x0000000000000004L;
    /**
     * Truncate middle of line:  "ab...yz"
     */
    @Generated @NInt public static final long TruncatingMiddle = 0x0000000000000005L;

    @Generated
    private NSLineBreakMode() {
    }
}
