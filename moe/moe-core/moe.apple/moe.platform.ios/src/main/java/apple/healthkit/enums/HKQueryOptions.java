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
 * @enum      HKQueryOptions
 * @abstract  Time interval options are used to describe how an HKSample's time period overlaps with a given time period.
 * 
 * @constant  HKQueryOptionNone               The sample's time period must overlap with the predicate's time period.
 * @constant  HKQueryOptionStrictStartDate    The sample's start date must fall in the time period (>= startDate, < endDate)
 * @constant  HKQueryOptionStrictEndDate      The sample's end date must fall in the time period (>= startDate, < endDate)
 */
@Generated
public final class HKQueryOptions {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long StrictStartDate = 0x0000000000000001L;
    @Generated @NUInt public static final long StrictEndDate = 0x0000000000000002L;

    @Generated
    private HKQueryOptions() {
    }
}
