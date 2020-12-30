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

package apple.gameplaykit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Used to adjust the way in which RTree nodes are split when they grow too large.
 * 
 * @enum GKRTreeSplitStrategyHalve Specifies that nodes should be split in half based on insert order.
 * @enum GKRTreeSplitStrategyLinear Specifies that nodes should be split along the best dividing axis.
 * @enum GKRTreeSplitStrategyQuadratic Specifies that nodes should be split into groups with the least area.
 * @enum GKRTreeSplitStrategyReduceOverlap Specifies that nodes should be split as to reduce overlap.
 */
@Generated
public final class GKRTreeSplitStrategy {
    @Generated @NInt public static final long Halve = 0x0000000000000000L;
    @Generated @NInt public static final long Linear = 0x0000000000000001L;
    @Generated @NInt public static final long Quadratic = 0x0000000000000002L;
    @Generated @NInt public static final long ReduceOverlap = 0x0000000000000003L;

    @Generated
    private GKRTreeSplitStrategy() {
    }
}
