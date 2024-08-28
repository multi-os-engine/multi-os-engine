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
public final class NSDateComponentsFormatterZeroFormattingBehavior {
    /**
     * drop none, pad none
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Positional units: drop leading zeros, pad other zeros. All others: drop all zeros.
     */
    @Generated @NUInt public static final long Default = 0x0000000000000001L;
    /**
     * Off: "0h 10m", On: "10m"
     */
    @Generated @NUInt public static final long DropLeading = 0x0000000000000002L;
    /**
     * Off: "1h 0m 10s", On: "1h 10s"
     */
    @Generated @NUInt public static final long DropMiddle = 0x0000000000000004L;
    /**
     * Off: "1h 0m", On: "1h"
     */
    @Generated @NUInt public static final long DropTrailing = 0x0000000000000008L;
    @Generated @NUInt public static final long DropAll = 0x000000000000000EL;
    /**
     * Off: "1:0:10", On: "01:00:10"
     */
    @Generated @NUInt public static final long Pad = 0x0000000000010000L;

    @Generated
    private NSDateComponentsFormatterZeroFormattingBehavior() {
    }
}
