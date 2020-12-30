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
 * @enum       CTFontSymbolicTraits
 * @abstract   Symbolic representation of stylistic font attributes.
 * @discussion CTFontSymbolicTraits symbolically describes stylistic aspects of a font. The top 4 bits is used to describe appearance of the font while the lower 28 bits for typeface. The font appearance information represented by the upper 4 bits can be used for stylistic font matching.
 */
@Generated
public final class CTFontSymbolicTraits {
    /**
     * Additional detail available via kCTFontSlantTrait
     */
    @Generated public static final int TraitItalic = 0x00000001;
    /**
     * Additional detail available via kCTFontWeightTrait
     */
    @Generated public static final int TraitBold = 0x00000002;
    /**
     * Expanded and condensed traits are mutually exclusive
     */
    @Generated public static final int TraitExpanded = 0x00000020;
    /**
     * Additional detail available via kCTFontWidthTrait
     */
    @Generated public static final int TraitCondensed = 0x00000040;
    /**
     * Use fixed-pitch glyphs if available. May have multiple glyph advances (most CJK glyphs may contain two spaces)
     */
    @Generated public static final int TraitMonoSpace = 0x00000400;
    /**
     * Use vertical glyph variants and metrics
     */
    @Generated public static final int TraitVertical = 0x00000800;
    /**
     * Synthesize appropriate attributes for UI rendering such as control titles if necessary
     */
    @Generated public static final int TraitUIOptimized = 0x00001000;
    /**
     * Color glyphs ('sbix', 'COLR', or 'SVG ') are available.
     */
    @Generated public static final int TraitColorGlyphs = 0x00002000;
    /**
     * The font is a CFR (Composite font reference), a cascade list is expected per font.
     */
    @Generated public static final int TraitComposite = 0x00004000;
    @Generated public static final int TraitClassMask = 0xF0000000;
    /**
     * Mask for the font class
     */
    @Generated public static final int ItalicTrait = 0x00000001;
    /**
     * Mask for the font class
     */
    @Generated public static final int BoldTrait = 0x00000002;
    /**
     * Mask for the font class
     */
    @Generated public static final int ExpandedTrait = 0x00000020;
    /**
     * Mask for the font class
     */
    @Generated public static final int CondensedTrait = 0x00000040;
    /**
     * Mask for the font class
     */
    @Generated public static final int MonoSpaceTrait = 0x00000400;
    /**
     * Mask for the font class
     */
    @Generated public static final int VerticalTrait = 0x00000800;
    /**
     * Mask for the font class
     */
    @Generated public static final int UIOptimizedTrait = 0x00001000;
    /**
     * Mask for the font class
     */
    @Generated public static final int ColorGlyphsTrait = 0x00002000;
    /**
     * Mask for the font class
     */
    @Generated public static final int CompositeTrait = 0x00004000;
    /**
     * Mask for the font class
     */
    @Generated public static final int ClassMaskTrait = 0xF0000000;

    @Generated
    private CTFontSymbolicTraits() {
    }
}
