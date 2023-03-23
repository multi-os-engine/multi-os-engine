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
public final class CFCalendarUnit {
    @Generated @NUInt public static final long Era = 0x0000000000000002L;
    @Generated @NUInt public static final long Year = 0x0000000000000004L;
    @Generated @NUInt public static final long Month = 0x0000000000000008L;
    @Generated @NUInt public static final long Day = 0x0000000000000010L;
    @Generated @NUInt public static final long Hour = 0x0000000000000020L;
    @Generated @NUInt public static final long Minute = 0x0000000000000040L;
    @Generated @NUInt public static final long Second = 0x0000000000000080L;
    /**
     * API-Since: 2.0
     * Deprecated-Since: 8.0
     * Deprecated-Message: Use kCFCalendarUnitWeekOfYear or kCFCalendarUnitWeekOfMonth instead
     */
    @Deprecated @Generated @NUInt public static final long Week = 0x0000000000000100L;
    @Generated @NUInt public static final long Weekday = 0x0000000000000200L;
    @Generated @NUInt public static final long WeekdayOrdinal = 0x0000000000000400L;
    /**
     * API-Since: 4.0
     */
    @Generated @NUInt public static final long Quarter = 0x0000000000000800L;
    /**
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long WeekOfMonth = 0x0000000000001000L;
    /**
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long WeekOfYear = 0x0000000000002000L;
    /**
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long YearForWeekOfYear = 0x0000000000004000L;

    @Generated
    private CFCalendarUnit() {
    }
}
