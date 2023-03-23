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
 * [@enum] HKCategoryValueSleepAnalysis
 * 
 * Set of values that may be used for HKCategorySamples with the HKCategoryTypeIdentifierSleepAnalysis type.
 * 
 * To represent the user being both in bed and asleep, use two or more samples with overlapping times. By comparing the
 * start and end times of these samples, it is possible to calculate a number of secondary statistics:
 * 1) The amount of time it took for the user to fall asleep
 * 2) The percentage of time in bed that the user actually spent sleeping,
 * 3) The number of times the user woke while in bed
 * 4) The total amount of time spent both in bed and asleep.
 * 
 * [@constant] HKCategoryValueSleepAnalysisInBed The user is in bed.
 * [@constant] HKCategoryValueSleepAnalysisAwake The user is awake.
 * [@constant] HKCategoryValueSleepAnalysisAsleepUnspecified The user is asleep and no specific stage is specified.
 * [@constant] HKCategoryValueSleepAnalysisAsleepCore Corresponds to Stages 1 and 2 of AASM scoring model.
 * [@constant] HKCategoryValueSleepAnalysisAsleepDeep Corresponds to Stage 3 of AASM scoring model.
 * [@constant] HKCategoryValueSleepAnalysisAsleepREM Corresponds to REM stage of AASM scoring model.
 * 
 * API-Since: 8.0
 */
@Generated
public final class HKCategoryValueSleepAnalysis {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long InBed = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NInt public static final long Asleep = 0x0000000000000001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Awake = 0x0000000000000002L;

    @Generated
    private HKCategoryValueSleepAnalysis() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AsleepUnspecified = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AsleepCore = 0x0000000000000003L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AsleepDeep = 0x0000000000000004L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long AsleepREM = 0x0000000000000005L;
}
