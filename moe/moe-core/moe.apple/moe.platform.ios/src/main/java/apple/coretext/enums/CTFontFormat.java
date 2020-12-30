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

package apple.coretext.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@constant]   kCTFontFormatUnrecognized
 *             The font is not a recognized format
 * [@constant]   kCTFontFormatOpenTypePostScript
 *             The font is an OpenType format containing PostScript data
 * [@constant]   kCTFontFormatOpenTypeTrueType
 *             The font is an OpenType format containing TrueType data
 * [@constant]   kCTFontFormatTrueType
 *             The font is a recognized TrueType format
 * [@constant]   kCTFontFormatPostScript
 *             The font is a recognized PostScript format
 * [@constant]   kCTFontFormatBitmap
 *             The font is a bitmap only format
 */
@Generated
public final class CTFontFormat {
    @Generated public static final int Unrecognized = 0x00000000;
    @Generated public static final int OpenTypePostScript = 0x00000001;
    @Generated public static final int OpenTypeTrueType = 0x00000002;
    @Generated public static final int TrueType = 0x00000003;
    @Generated public static final int PostScript = 0x00000004;
    @Generated public static final int Bitmap = 0x00000005;

    @Generated
    private CTFontFormat() {
    }
}
