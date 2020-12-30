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
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSLayoutFormatOptions {
    @Generated @NUInt public static final long AlignAllLeft = 0x0000000000000002L;
    @Generated @NUInt public static final long AlignAllRight = 0x0000000000000004L;
    @Generated @NUInt public static final long AlignAllTop = 0x0000000000000008L;
    @Generated @NUInt public static final long AlignAllBottom = 0x0000000000000010L;
    @Generated @NUInt public static final long AlignAllLeading = 0x0000000000000020L;
    @Generated @NUInt public static final long AlignAllTrailing = 0x0000000000000040L;
    @Generated @NUInt public static final long AlignAllCenterX = 0x0000000000000200L;
    @Generated @NUInt public static final long AlignAllCenterY = 0x0000000000000400L;
    @Generated @NUInt public static final long AlignAllLastBaseline = 0x0000000000000800L;
    @Generated @NUInt public static final long AlignAllBaseline = 0x0000000000000800L;
    @Generated @NUInt public static final long AlignAllFirstBaseline = 0x0000000000001000L;
    @Generated @NUInt public static final long AlignmentMask = 0x000000000000FFFFL;
    /**
     * default
     */
    @Generated @NUInt public static final long DirectionLeadingToTrailing = 0x0000000000000000L;
    @Generated @NUInt public static final long DirectionLeftToRight = 0x0000000000010000L;
    @Generated @NUInt public static final long DirectionRightToLeft = 0x0000000000020000L;
    @Generated @NUInt public static final long DirectionMask = 0x0000000000030000L;

    @Generated
    private NSLayoutFormatOptions() {
    }

    /**
     * default
     */
    @Generated @NUInt public static final long SpacingEdgeToEdge = 0x0000000000000000L;
    /**
     * Valid only for vertical layouts. Between views with text content the value
     * will be used to determine the distance from the last baseline of the view above
     * to the first baseline of the view below. For views without text content the top
     * or bottom edge will be used in lieu of the baseline position.
     * The default spacing "]-[" will be determined from the line heights of the fonts
     * involved in views with text content, when present.
     */
    @Generated @NUInt public static final long SpacingBaselineToBaseline = 0x0000000000080000L;
    /**
     * Valid only for vertical layouts. Between views with text content the value
     * will be used to determine the distance from the last baseline of the view above
     * to the first baseline of the view below. For views without text content the top
     * or bottom edge will be used in lieu of the baseline position.
     * The default spacing "]-[" will be determined from the line heights of the fonts
     * involved in views with text content, when present.
     */
    @Generated @NUInt public static final long SpacingMask = 0x0000000000080000L;
}
