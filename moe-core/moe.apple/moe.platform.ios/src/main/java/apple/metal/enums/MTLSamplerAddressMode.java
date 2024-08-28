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
 * [@enum] MTLSamplerAddressMode
 * 
 * Options for what value is returned when a fetch falls outside the bounds of a texture.
 * 
 * [@constant] MTLSamplerAddressModeClampToEdge
 * Texture coordinates will be clamped between 0 and 1.
 * 
 * [@constant] MTLSamplerAddressModeMirrorClampToEdge
 * Mirror the texture while coordinates are within -1..1, and clamp to edge when outside.
 * 
 * [@constant] MTLSamplerAddressModeRepeat
 * Wrap to the other side of the texture, effectively ignoring fractional parts of the texture coordinate.
 * 
 * [@constant] MTLSamplerAddressModeMirrorRepeat
 * Between -1 and 1 the texture is mirrored across the 0 axis. The image is repeated outside of that range.
 * 
 * [@constant] MTLSamplerAddressModeClampToZero
 * ClampToZero returns transparent zero (0,0,0,0) for images with an alpha channel, and returns opaque zero (0,0,0,1)
 * for images without an alpha channel.
 * 
 * [@constant] MTLSamplerAddressModeClampToBorderColor
 * Clamp to border color returns the value specified by the borderColor variable of the MTLSamplerDesc.
 * 
 * API-Since: 8.0
 */
@Generated
public final class MTLSamplerAddressMode {
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long ClampToEdge = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long Repeat = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long MirrorRepeat = 0x0000000000000003L;
    /**
     * API-Since: 8.0
     */
    @Generated @NUInt public static final long ClampToZero = 0x0000000000000004L;

    @Generated
    private MTLSamplerAddressMode() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long MirrorClampToEdge = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long ClampToBorderColor = 0x0000000000000005L;
}
