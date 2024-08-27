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
 * API-Since: 8.0
 */
@Generated
public final class MTLResourceOptions {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long CPUCacheModeDefaultCache = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long CPUCacheModeWriteCombined = 0x0000000000000001L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long StorageModeShared = 0x0000000000000000L;
    /**
     * API-Since: 9.0
     */
    @Generated @NUInt public static final long StorageModePrivate = 0x0000000000000020L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long StorageModeMemoryless = 0x0000000000000030L;
    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long HazardTrackingModeUntracked = 0x0000000000000100L;
    /**
     * Deprecated spellings
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long OptionCPUCacheModeDefault = 0x0000000000000000L;
    /**
     * Deprecated spellings
     * 
     * API-Since: 8.0
     * Deprecated-Since: 16.0
     */
    @Deprecated @Generated @NUInt public static final long OptionCPUCacheModeWriteCombined = 0x0000000000000001L;

    @Generated
    private MTLResourceOptions() {
    }

    /**
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long HazardTrackingModeDefault = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long HazardTrackingModeTracked = 0x0000000000000200L;
}
