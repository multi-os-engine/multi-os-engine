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
 * Distribution—the layout along the stacking axis.
 * 
 * All UIStackViewDistribution enum values fit first and last arranged subviews tightly to the container,
 * and except for UIStackViewDistributionFillEqually, fit all items to intrinsicContentSize when possible.
 * 
 * API-Since: 9.0
 */
@Generated
public final class UIStackViewDistribution {
    /**
     * When items do not fit (overflow) or fill (underflow) the space available
     * adjustments occur according to compressionResistance or hugging
     * priorities of items, or when that is ambiguous, according to arrangement
     * order.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Fill = 0x0000000000000000L;
    /**
     * Items are all the same size.
     * When space allows, this will be the size of the item with the largest
     * intrinsicContentSize (along the axis of the stack).
     * Overflow or underflow adjustments are distributed equally among the items.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long FillEqually = 0x0000000000000001L;
    /**
     * Overflow or underflow adjustments are distributed among the items proportional
     * to their intrinsicContentSizes.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long FillProportionally = 0x0000000000000002L;
    /**
     * Additional underflow spacing is divided equally in the spaces between the items.
     * Overflow squeezing is controlled by compressionResistance priorities followed by
     * arrangement order.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long EqualSpacing = 0x0000000000000003L;
    /**
     * Equal center-to-center spacing of the items is maintained as much
     * as possible while still maintaining a minimum edge-to-edge spacing within the
     * allowed area.
     * Additional underflow spacing is divided equally in the spacing. Overflow
     * squeezing is distributed first according to compressionResistance priorities
     * of items, then according to subview order while maintaining the configured
     * (edge-to-edge) spacing as a minimum.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long EqualCentering = 0x0000000000000004L;

    @Generated
    private UIStackViewDistribution() {
    }
}
