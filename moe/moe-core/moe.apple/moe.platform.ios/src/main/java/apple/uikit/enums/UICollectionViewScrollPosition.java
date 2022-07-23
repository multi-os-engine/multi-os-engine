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
public final class UICollectionViewScrollPosition {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * The vertical positions are mutually exclusive to each other, but are bitwise or-able with the horizontal scroll
     * positions.
     * Combining positions from the same grouping (horizontal or vertical) will result in an NSInvalidArgumentException.
     */
    @Generated @NUInt public static final long Top = 0x0000000000000001L;
    /**
     * The vertical positions are mutually exclusive to each other, but are bitwise or-able with the horizontal scroll
     * positions.
     * Combining positions from the same grouping (horizontal or vertical) will result in an NSInvalidArgumentException.
     */
    @Generated @NUInt public static final long CenteredVertically = 0x0000000000000002L;
    /**
     * The vertical positions are mutually exclusive to each other, but are bitwise or-able with the horizontal scroll
     * positions.
     * Combining positions from the same grouping (horizontal or vertical) will result in an NSInvalidArgumentException.
     */
    @Generated @NUInt public static final long Bottom = 0x0000000000000004L;
    /**
     * Likewise, the horizontal positions are mutually exclusive to each other.
     */
    @Generated @NUInt public static final long Left = 0x0000000000000008L;
    /**
     * Likewise, the horizontal positions are mutually exclusive to each other.
     */
    @Generated @NUInt public static final long CenteredHorizontally = 0x0000000000000010L;
    /**
     * Likewise, the horizontal positions are mutually exclusive to each other.
     */
    @Generated @NUInt public static final long Right = 0x0000000000000020L;

    @Generated
    private UICollectionViewScrollPosition() {
    }
}
