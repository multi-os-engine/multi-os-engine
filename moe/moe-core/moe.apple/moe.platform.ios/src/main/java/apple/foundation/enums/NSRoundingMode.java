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

/**
 * Rounding policies :
 * Original
 * value 1.2  1.21  1.25  1.35  1.27
 * Plain    1.2  1.2   1.3   1.4   1.3
 * Down     1.2  1.2   1.2   1.3   1.2
 * Up       1.2  1.3   1.3   1.4   1.3
 * Bankers  1.2  1.2   1.2   1.4   1.3
 */
@Generated
public final class NSRoundingMode {
    /**
     * Round up on a tie
     */
    @Generated @NUInt public static final long Plain = 0x0000000000000000L;
    /**
     * Always down == truncate
     */
    @Generated @NUInt public static final long Down = 0x0000000000000001L;
    /**
     * Always up
     */
    @Generated @NUInt public static final long Up = 0x0000000000000002L;
    /**
     * on a tie round so last digit is even
     */
    @Generated @NUInt public static final long Bankers = 0x0000000000000003L;

    @Generated
    private NSRoundingMode() {
    }
}
