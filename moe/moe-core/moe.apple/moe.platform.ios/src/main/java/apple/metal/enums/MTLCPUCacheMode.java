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
 * @enum MTLCPUCacheMode
 * @abstract Describes what CPU cache mode is used for the CPU's mapping of a texture resource.
 * @constant MTLCPUCacheModeDefaultCache
 * The default cache mode for the system.
 * 
 * @constant MTLCPUCacheModeWriteCombined
 * Write combined memory is optimized for resources that the CPU will write into, but never read.  On some implementations, writes may bypass caches avoiding cache pollution, and reads perform very poorly.
 * 
 * @discussion
 * Applications should only investigate changing the cache mode if writing to normally cached buffers is known to cause performance issues due to cache pollution, as write combined memory can have surprising performance pitfalls.  Another approach is to use non-temporal stores to normally cached memory (STNP on ARMv8, _mm_stream_* on x86_64).
 */
@Generated
public final class MTLCPUCacheMode {
    @Generated @NUInt public static final long DefaultCache = 0x0000000000000000L;
    @Generated @NUInt public static final long WriteCombined = 0x0000000000000001L;

    @Generated
    private MTLCPUCacheMode() {
    }
}
