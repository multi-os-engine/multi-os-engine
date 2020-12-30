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

package apple.foundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class NSByteCountFormatterUnits {
    /**
     * This causes default units appropriate for the platform to be used. Specifying any units explicitly causes just those units to be used in showing the number.
     */
    @Generated @NUInt public static final long Default = 0x0000000000000000L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long Bytes = 0x0000000000000001L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long KB = 0x0000000000000002L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long MB = 0x0000000000000004L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long GB = 0x0000000000000008L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long TB = 0x0000000000000010L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long PB = 0x0000000000000020L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long EB = 0x0000000000000040L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long ZB = 0x0000000000000080L;
    /**
     * Specifying any of the following causes the specified units to be used in showing the number.
     */
    @Generated @NUInt public static final long YBOrHigher = 0x000000000000FF00L;
    /**
     * Can use any unit in showing the number.
     */
    @Generated @NUInt public static final long All = 0x000000000000FFFFL;

    @Generated
    private NSByteCountFormatterUnits() {
    }
}
