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
 * Read/Write Options ***************
 */
@Generated
public final class NSDataReadingOptions {
    /**
     * Hint to map the file in if possible and safe
     */
    @Generated @NUInt public static final long DataReadingMappedIfSafe = 0x0000000000000001L;
    /**
     * Hint to get the file not to be cached in the kernel
     */
    @Generated @NUInt public static final long DataReadingUncached = 0x0000000000000002L;
    /**
     * Hint to map the file in if possible. This takes precedence over NSDataReadingMappedIfSafe if both are given.
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long DataReadingMappedAlways = 0x0000000000000008L;
    /**
     * Deprecated name for NSDataReadingMappedIfSafe
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated @Generated @NUInt public static final long DataReadingMapped = 0x0000000000000001L;
    /**
     * Deprecated name for NSDataReadingMapped
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated @Generated @NUInt public static final long MappedRead = 0x0000000000000001L;
    /**
     * Deprecated name for NSDataReadingUncached
     * 
     * API-Since: 2.0
     * Deprecated-Since: 100000.0
     */
    @Deprecated @Generated @NUInt public static final long UncachedRead = 0x0000000000000002L;

    @Generated
    private NSDataReadingOptions() {
    }
}
