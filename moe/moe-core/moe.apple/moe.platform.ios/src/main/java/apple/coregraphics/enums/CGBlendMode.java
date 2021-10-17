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

package apple.coregraphics.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Blend modes.
 * <p>
 * The blend modes from kCGBlendModeNormal to kCGBlendModeLuminosity are
 * supported in Mac OS X 10.4 and later. The Porter-Duff blend modes (from
 * kCGBlendModeClear to kCGBlendModePlusLighter) are supported in Mac OS X
 * 10.5 and later. The names of the Porter-Duff blend modes are historical.
 * <p>
 * Note that the Porter-Duff blend modes are not necessarily supported in
 * every context. In particular, they are only guaranteed to work in
 * bitmap-based contexts, such as those created by CGBitmapContextCreate. It
 * is your responsibility to make sure that they do what you want when you
 * use them in a CGContext.
 */
@Generated
public final class CGBlendMode {
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Normal = 0x00000000;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Multiply = 0x00000001;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Screen = 0x00000002;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Overlay = 0x00000003;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Darken = 0x00000004;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Lighten = 0x00000005;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int ColorDodge = 0x00000006;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int ColorBurn = 0x00000007;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int SoftLight = 0x00000008;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int HardLight = 0x00000009;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Difference = 0x0000000A;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Exclusion = 0x0000000B;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Hue = 0x0000000C;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Saturation = 0x0000000D;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Color = 0x0000000E;
    /**
     * Available in Mac OS X 10.4 & later.
     */
    @Generated public static final int Luminosity = 0x0000000F;
    /**
     * R = 0
     */
    @Generated public static final int Clear = 0x00000010;
    /**
     * R = S
     */
    @Generated public static final int Copy = 0x00000011;
    /**
     * R = S*Da
     */
    @Generated public static final int SourceIn = 0x00000012;
    /**
     * R = S*(1 - Da)
     */
    @Generated public static final int SourceOut = 0x00000013;
    /**
     * R = S*Da + D*(1 - Sa)
     */
    @Generated public static final int SourceAtop = 0x00000014;
    /**
     * R = S*(1 - Da) + D
     */
    @Generated public static final int DestinationOver = 0x00000015;
    /**
     * R = D*Sa
     */
    @Generated public static final int DestinationIn = 0x00000016;
    /**
     * R = D*(1 - Sa)
     */
    @Generated public static final int DestinationOut = 0x00000017;
    /**
     * R = S*(1 - Da) + D*Sa
     */
    @Generated public static final int DestinationAtop = 0x00000018;
    /**
     * R = S*(1 - Da) + D*(1 - Sa)
     */
    @Generated public static final int XOR = 0x00000019;
    /**
     * R = MAX(0, (1 - D) + (1 - S))
     */
    @Generated public static final int PlusDarker = 0x0000001A;
    /**
     * R = MIN(1, S + D)
     */
    @Generated public static final int PlusLighter = 0x0000001B;

    @Generated
    private CGBlendMode() {
    }
}
