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
 * [@enum] MTLSamplerMipFilter
 * 
 * Options for selecting and filtering between mipmap levels
 * [@constant] MTLSamplerMipFilterNotMipmapped The texture is sampled as if it only had a single mipmap level.  All samples are read from level 0.
 * [@constant] MTLSamplerMipFilterNearest The nearst mipmap level is selected.
 * [@constant] MTLSamplerMipFilterLinear If the filter falls between levels, both levels are sampled, and their results linearly interpolated between levels.
 */
@Generated
public final class MTLSamplerMipFilter {
    @Generated @NUInt public static final long NotMipmapped = 0x0000000000000000L;
    @Generated @NUInt public static final long Nearest = 0x0000000000000001L;
    @Generated @NUInt public static final long Linear = 0x0000000000000002L;

    @Generated
    private MTLSamplerMipFilter() {
    }
}
