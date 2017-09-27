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
    @Generated @NUInt public static final long Year = 0x0000000000000001L;
    @Generated @NUInt public static final long Month = 0x0000000000000002L;
    @Generated @NUInt public static final long WeekOfYear = 0x0000000000000004L;
    @Generated @NUInt public static final long Day = 0x0000000000000010L;
    @Generated @NUInt public static final long Time = 0x0000000000000020L;
    @Generated @NUInt public static final long TimeZone = 0x0000000000000040L;
    @Generated @NUInt public static final long SpaceBetweenDateAndTime = 0x0000000000000080L;
    @Generated @NUInt public static final long DashSeparatorInDate = 0x0000000000000100L;
    @Generated @NUInt public static final long ColonSeparatorInTime = 0x0000000000000200L;
    @Generated @NUInt public static final long ColonSeparatorInTimeZone = 0x0000000000000400L;
    @Generated @NUInt public static final long FullDate = 0x0000000000000113L;
    @Generated @NUInt public static final long FullTime = 0x0000000000000660L;
    @Generated @NUInt public static final long InternetDateTime = 0x0000000000000773L;

    @Generated
    private CFISO8601DateFormatOptions() {
    }

    @Generated @NUInt public static final long FractionalSeconds = 0x0000000000000800L;
}
