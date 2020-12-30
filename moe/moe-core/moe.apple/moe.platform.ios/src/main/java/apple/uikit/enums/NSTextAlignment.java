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
 * Values for NSTextAlignment
 */
@Generated
public final class NSTextAlignment {
    /**
     * Visually left aligned
     */
    @Generated @NInt public static final long Left = 0x0000000000000000L;
    /**
     * Visually centered
     */
    @Generated @NInt public static final long Center = 0x0000000000000001L;
    /**
     * Visually right aligned
     */
    @Generated @NInt public static final long Right = 0x0000000000000002L;
    /**
     * Fully-justified. The last line in a paragraph is natural-aligned.
     */
    @Generated @NInt public static final long Justified = 0x0000000000000003L;
    /**
     * Indicates the default alignment for script
     */
    @Generated @NInt public static final long Natural = 0x0000000000000004L;

    @Generated
    private NSTextAlignment() {
    }
}
