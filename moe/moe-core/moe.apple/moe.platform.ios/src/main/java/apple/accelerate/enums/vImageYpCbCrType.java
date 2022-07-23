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

package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] vImageYpCbCrType
 * <p>
 * An encoding of an image format type to be used with RGB <-> Y'CbCr conversions in vImage/Conversions.h
 * <p>
 * These formats enumerate different vImage/CoreVideo Y'CbCr pixel formats.
 *
 * @see CVPixelBuffer OSTypes in CVPixelBuffer.h
 */
@Generated
public final class vImageYpCbCrType {
    /**
     * 2vuy
     */
    @Generated public static final int kvImage422CbYpCrYp8 = 0x00000000;
    /**
     * yuvs / yuvf
     */
    @Generated public static final int kvImage422YpCbYpCr8 = 0x00000001;
    /**
     * a2vy
     */
    @Generated public static final int kvImage422CbYpCrYp8_AA8 = 0x00000002;
    /**
     * y420 / f420
     */
    @Generated public static final int kvImage420Yp8_Cb8_Cr8 = 0x00000003;
    /**
     * 420v / 420f
     */
    @Generated public static final int kvImage420Yp8_CbCr8 = 0x00000004;
    /**
     * r408 / y408
     */
    @Generated public static final int kvImage444AYpCbCr8 = 0x00000005;
    /**
     * v308
     */
    @Generated public static final int kvImage444CrYpCb8 = 0x00000006;
    /**
     * v408
     */
    @Generated public static final int kvImage444CbYpCrA8 = 0x00000007;
    /**
     * v410
     */
    @Generated public static final int kvImage444CrYpCb10 = 0x00000008;
    /**
     * v210
     */
    @Generated public static final int kvImage422CrYpCbYpCbYpCbYpCrYpCrYp10 = 0x00000009;
    /**
     * v216 16-bit
     */
    @Generated public static final int kvImage422CbYpCrYp16 = 0x0000000D;
    /**
     * y416
     */
    @Generated public static final int kvImage444AYpCbCr16 = 0x0000000E;

    @Generated
    private vImageYpCbCrType() {
    }
}
