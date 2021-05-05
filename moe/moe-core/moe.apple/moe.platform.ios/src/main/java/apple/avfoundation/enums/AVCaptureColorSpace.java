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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVCaptureColorSpace
 * 
 *    Constants indicating active or supported video color space.
 * 
 * [@constant] AVCaptureColorSpace_sRGB
 *    The sGRB color space ( https://www.w3.org/Graphics/Color/srgb )
 * [@constant] AVCaptureColorSpace_P3_D65
 *    The P3 D65 wide color space which uses Illuminant D65 as the white point.
 * [@constant] AVCaptureColorSpace_HLG_BT2020
 *    The BT2020 wide color space which uses Illuminant D65 as the white point and Hybrid Log-Gamma as the transfer function.
 */
@Generated
public final class AVCaptureColorSpace {
    @Generated @NInt public static final long _sRGB = 0x0000000000000000L;
    @Generated @NInt public static final long _P3_D65 = 0x0000000000000001L;

    @Generated
    private AVCaptureColorSpace() {
    }

    @Generated
    @NInt
    public static final long _HLG_BT2020 = 0x0000000000000002L;
}
