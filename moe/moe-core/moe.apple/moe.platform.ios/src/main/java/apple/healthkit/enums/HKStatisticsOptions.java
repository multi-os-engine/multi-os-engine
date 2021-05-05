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
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum]          HKStatisticsOptions
 * 
 * Options for specifying which statistics to calculate
 * 
 * When querying for HKStatistics objects, an options bitmask will specify which statistics will be
 *                calculated.
 * 
 *                Statistics are classified as discrete or cumulative.  If a discrete statistics option is specified for a
 *                cumulative HKQuantityType, an exception will be thrown.  If a cumulative statistics options is specified
 *                for a discrete HKQuantityType, an exception will also be thrown.
 * 
 * [@constant]      HKStatisticsOptionNone
 * [@constant]      HKStatisticsOptionSeparateBySource
 * [@constant]      HKStatisticsOptionDiscreteAverage      Calculate averageQuantity when creating statistics.
 * [@constant]      HKStatisticsOptionDiscreteMin          Calculate minQuantity when creating statistics.
 * [@constant]      HKStatisticsOptionDiscreteMax          Calculate maxQuantity when creating statistics.
 * [@constant]      HKStatisticsOptionCumulativeSum        Calculate sumQuantity when creating statistics.
 * [@constant]      HKStatisticsOptionMostRecent           Calculate mostRecentQuantity when creating statistics.
 * [@constant]      HKStatisticsOptionDuration             Calculate duration when creating statistics.
 */
@Generated
public final class HKStatisticsOptions {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long SeparateBySource = 0x0000000000000001L;
    @Generated @NUInt public static final long DiscreteAverage = 0x0000000000000002L;
    @Generated @NUInt public static final long DiscreteMin = 0x0000000000000004L;
    @Generated @NUInt public static final long DiscreteMax = 0x0000000000000008L;
    @Generated @NUInt public static final long CumulativeSum = 0x0000000000000010L;

    @Generated
    private HKStatisticsOptions() {
    }

    @Generated @NUInt public static final long MostRecent = 0x0000000000000020L;
    @Generated @NUInt public static final long DiscreteMostRecent = 0x0000000000000020L;
    @Generated @NUInt public static final long Duration = 0x0000000000000040L;
}
