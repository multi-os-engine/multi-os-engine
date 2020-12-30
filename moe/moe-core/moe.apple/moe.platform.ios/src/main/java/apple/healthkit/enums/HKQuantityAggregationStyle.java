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

package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * @enum          HKQuantityAggregationStyle
 * @discussion    Describes how quantities can be aggregated over time.
 * 
 * @constant      HKQuantityAggregationStyleCumulative                        Samples may be summed over a time interval.
 * @constant      HKQuantityAggregationStyleDiscreteArithmetic                Samples may be averaged over a time interval using the arithmetic mean
 * @constant      HKQuantityAggregationStyleDiscreteTemporallyWeighted        Samples may be averaged over a time interval using a temporally weighted integration function
 * @constant      HKQuantityAggregationStyleDiscreteEquivalentContinuousLevel Samples may be combined over a time interval by computing the equivalent continuous sound level; see IEC 61672-1
 */
@Generated
public final class HKQuantityAggregationStyle {
    @Generated @NInt public static final long Cumulative = 0x0000000000000000L;
    @Generated @NInt public static final long Discrete = 0x0000000000000001L;

    @Generated
    private HKQuantityAggregationStyle() {
    }

    @Generated @NInt public static final long DiscreteArithmetic = 0x0000000000000001L;
    @Generated @NInt public static final long DiscreteTemporallyWeighted = 0x0000000000000002L;
    @Generated @NInt public static final long DiscreteEquivalentContinuousLevel = 0x0000000000000003L;
}
