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
 * @enum MTLSamplerBorderColor
 * @abstract Specify the color value that will be clamped to when the sampler address mode is MTLSamplerAddressModeClampToBorderColor.
 * 
 * @constant MTLSamplerBorderColorTransparentBlack
 * Transparent black returns {0,0,0,0} for clamped texture values.
 * 
 * @constant MTLSamplerBorderColorOpaqueBlack
 * OpaqueBlack returns {0,0,0,1} for clamped texture values.
 * 
 * @constant MTLSamplerBorderColorOpaqueWhite
 * OpaqueWhite returns {1,1,1,1} for clamped texture values.
 */
@Generated
public final class MTLSamplerBorderColor {
    /**
     * {0,0,0,0}
     */
    @Generated @NUInt public static final long TransparentBlack = 0x0000000000000000L;
    /**
     * {0,0,0,1}
     */
    @Generated @NUInt public static final long OpaqueBlack = 0x0000000000000001L;
    /**
     * {1,1,1,1}
     */
    @Generated @NUInt public static final long OpaqueWhite = 0x0000000000000002L;

    @Generated
    private MTLSamplerBorderColor() {
    }
}
