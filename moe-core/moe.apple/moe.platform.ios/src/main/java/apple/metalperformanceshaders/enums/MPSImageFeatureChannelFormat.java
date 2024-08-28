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

package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSImageFeatureChannelFormat {
    /**
     * uint8_t with value [0,255] encoding [0,1.0]
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Unorm8 = 0x0000000000000001L;
    /**
     * uint16_t with value [0,65535] encoding [0,1.0]
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Unorm16 = 0x0000000000000002L;
    /**
     * IEEE-754 16-bit floating-point value. "half precision" Representable normal range is +-[2**-14, 65504], 0,
     * Infinity, NaN. 11 bits of precision + exponent.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Float16 = 0x0000000000000003L;
    /**
     * IEEE-754 32-bit floating-point value. "single precision" (standard float type in C) 24 bits of precision +
     * exponent
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long Float32 = 0x0000000000000004L;

    @Generated
    private MPSImageFeatureChannelFormat() {
    }

    /**
     * No format. This can mean according to context invalid format or any format. In the
     * latter case, it is an invitation to MPS to pick a format.
     * 
     * API-Since: 10.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Reserved for later expansion
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long _reserved0 = 0x0000000000000005L;
    /**
     * Always last
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Count = 0x0000000000000006L;
}
