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
 * Alignment—the layout transverse to the stacking axis.
 */
@Generated
public final class UIStackViewAlignment {
    /**
     * Align the leading and trailing edges of vertically stacked items
     * or the top and bottom edges of horizontally stacked items tightly to the container.
     */
    @Generated @NInt public static final long Fill = 0x0000000000000000L;
    /**
     * Align the leading edges of vertically stacked items
     * or the top edges of horizontally stacked items tightly to the relevant edge
     * of the container
     */
    @Generated @NInt public static final long Leading = 0x0000000000000001L;
    /**
     * Align the leading edges of vertically stacked items
     * or the top edges of horizontally stacked items tightly to the relevant edge
     * of the container
     */
    @Generated @NInt public static final long Top = 0x0000000000000001L;
    /**
     * Valid for horizontal axis only
     */
    @Generated @NInt public static final long FirstBaseline = 0x0000000000000002L;
    /**
     * Center the items in a vertical stack horizontally
     * or the items in a horizontal stack vertically
     */
    @Generated @NInt public static final long Center = 0x0000000000000003L;
    /**
     * Align the trailing edges of vertically stacked items
     * or the bottom edges of horizontally stacked items tightly to the relevant
     * edge of the container
     */
    @Generated @NInt public static final long Trailing = 0x0000000000000004L;
    /**
     * Align the trailing edges of vertically stacked items
     * or the bottom edges of horizontally stacked items tightly to the relevant
     * edge of the container
     */
    @Generated @NInt public static final long Bottom = 0x0000000000000004L;
    /**
     * Valid for horizontal axis only
     */
    @Generated @NInt public static final long LastBaseline = 0x0000000000000005L;

    @Generated
    private UIStackViewAlignment() {
    }
}
