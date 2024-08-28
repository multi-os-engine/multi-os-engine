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

package apple.corefoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class CFISO8601DateFormatOptions {
    /**
     * The format for year is inferred based on whether or not the week of year option is specified.
     * - if week of year is present, "YYYY" is used to display week dates.
     * - if week of year is not present, "yyyy" is used by default.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Year = 0x0000000000000001L;
    /**
     * The format for year is inferred based on whether or not the week of year option is specified.
     * - if week of year is present, "YYYY" is used to display week dates.
     * - if week of year is not present, "yyyy" is used by default.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Month = 0x0000000000000002L;
    /**
     * This includes the "W" prefix (e.g. "W49")
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long WeekOfYear = 0x0000000000000004L;
    /**
     * The format for day is inferred based on provided options.
     * - if month is not present, day of year ("DDD") is used.
     * - if month is present, day of month ("dd") is used.
     * - if either weekOfMonth or weekOfYear is present, local day of week ("ee") is used.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Day = 0x0000000000000010L;
    /**
     * This uses the format "HHmmss"
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Time = 0x0000000000000020L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long TimeZone = 0x0000000000000040L;
    /**
     * Use space instead of "T"
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long SpaceBetweenDateAndTime = 0x0000000000000080L;
    /**
     * Add separator for date ("-")
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long DashSeparatorInDate = 0x0000000000000100L;
    /**
     * Add separator for time (":")
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long ColonSeparatorInTime = 0x0000000000000200L;
    /**
     * Add ":" separator in timezone (eg. +08:00)
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long ColonSeparatorInTimeZone = 0x0000000000000400L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long FullDate = 0x0000000000000113L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long FullTime = 0x0000000000000660L;
    /**
     * RFC3339
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long InternetDateTime = 0x0000000000000773L;

    @Generated
    private CFISO8601DateFormatOptions() {
    }

    /**
     * Add 3 significant digits of fractional seconds (".SSS")
     * 
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long FractionalSeconds = 0x0000000000000800L;
}
