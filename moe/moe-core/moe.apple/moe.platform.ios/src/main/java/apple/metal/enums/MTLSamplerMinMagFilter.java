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
 * [@enum] MTLSamplerMinMagFilter
 * <p>
 * Options for filtering texels within a mip level.
 * <p>
 * [@constant] MTLSamplerMinMagFilterNearest
 * Select the single texel nearest to the sample point.
 * <p>
 * [@constant] MTLSamplerMinMagFilterLinear
 * Select two texels in each dimension, and interpolate linearly between them.  Not all devices support linear filtering for all formats.  Integer textures can not use linear filtering on any device, and only some devices support linear filtering of Float textures.
 */
@Generated
public final class MTLSamplerMinMagFilter {
    @Generated @NUInt public static final long Nearest = 0x0000000000000000L;
    @Generated @NUInt public static final long Linear = 0x0000000000000001L;

    @Generated
    private MTLSamplerMinMagFilter() {
    }
}
