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
 * [@enum] HKCategoryValueOvulationTestResult
 * 
 * Set of values that may be used for HKCategorySamples with the
 * HKCategoryTypeIdentifierOvulationTestResult type.
 * 
 * This category value tracks the result of a home ovulation test that use surges in hormone levels to
 * indicate fertility.
 * 
 * API-Since: 9.0
 */
@Generated
public final class HKCategoryValueOvulationTestResult {
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Negative = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     * Deprecated-Since: 13.0
     */
    @Deprecated @Generated @NInt public static final long Positive = 0x0000000000000002L;
    /**
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Indeterminate = 0x0000000000000003L;

    @Generated
    private HKCategoryValueOvulationTestResult() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long LuteinizingHormoneSurge = 0x0000000000000002L;
    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long EstrogenSurge = 0x0000000000000004L;
}
