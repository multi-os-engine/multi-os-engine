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

package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 9.0
 */
@Generated
public final class MTLLanguageVersion {
    @Generated
    private MTLLanguageVersion() {
    }

    /**
     * API-Since: 9.0
     * Deprecated-Since: 16.0
     * Deprecated-Message: Use a newer language standard
     */
    @Deprecated @Generated @NUInt public static final long Version1_0 = 0x0000000000010000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long Version1_1 = 0x0000000000010001L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Version1_2 = 0x0000000000010002L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Version2_0 = 0x0000000000020000L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Version2_1 = 0x0000000000020001L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Version2_2 = 0x0000000000020002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Version2_3 = 0x0000000000020003L;
    /**
     * API-Since: 15.0
     */
    @Generated @NUInt public static final long Version2_4 = 0x0000000000020004L;
    /**
     * API-Since: 16.0
     */
    @Generated @NUInt public static final long Version3_0 = 0x0000000000030000L;
}
