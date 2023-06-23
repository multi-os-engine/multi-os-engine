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
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] CTLineBoundsOptions
 * 
 * Options for CTLineGetBoundsWithOptions.
 * 
 * Passing 0 (no options) returns the typographic bounds,
 * including typographic leading and shifts.
 * 
 * [@constant] kCTLineBoundsExcludeTypographicLeading
 * Pass this option to exclude typographic leading.
 * 
 * [@constant] kCTLineBoundsExcludeTypographicShifts
 * Pass this option to ignore cross-stream shifts due to
 * positioning (such as kerning or baseline alignment).
 * 
 * [@constant] kCTLineBoundsUseHangingPunctuation
 * Normally line bounds include all glyphs; pass this option to
 * treat standard punctuation hanging off either end of the line
 * as fully hanging.
 * 
 * [@constant] kCTLineBoundsUseGlyphPathBounds
 * Pass this option to use glyph path bounds rather than the
 * default typographic bounds.
 * 
 * [@constant] kCTLineBoundsUseOpticalBounds
 * Pass this option to use optical bounds. This option overrides
 * kCTLineBoundsUseGlyphPathBounds.
 * 
 * [@constant] kCTLineBoundsIncludeLanguageExtents
 * Pass this option to include additional space based on common
 * glyph sequences for various languages. The result is intended
 * to be used when drawing to avoid clipping that may be caused
 * by the typographic bounds. This option does not have any effect
 * when used with kCTLineBoundsUseGlyphPathBounds.
 */
@Generated
public final class CTLineBoundsOptions {
    @Generated @NUInt public static final long ExcludeTypographicLeading = 0x0000000000000001L;
    @Generated @NUInt public static final long ExcludeTypographicShifts = 0x0000000000000002L;
    @Generated @NUInt public static final long UseHangingPunctuation = 0x0000000000000004L;
    @Generated @NUInt public static final long UseGlyphPathBounds = 0x0000000000000008L;
    @Generated @NUInt public static final long UseOpticalBounds = 0x0000000000000010L;
    @Generated @NUInt public static final long IncludeLanguageExtents = 0x0000000000000020L;

    @Generated
    private CTLineBoundsOptions() {
    }
}
