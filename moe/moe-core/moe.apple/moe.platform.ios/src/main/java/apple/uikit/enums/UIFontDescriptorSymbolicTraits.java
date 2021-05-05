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

package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class UIFontDescriptorSymbolicTraits {
    /**
     * Symbolic Font Traits (Typeface info - lower 16 bits of UIFontDescriptorSymbolicTraits)
     * UIFontDescriptorSymbolicTraits symbolically describes stylistic aspects of a font. The upper 16 bits is used to describe appearance of the font whereas the lower 16 bits for typeface. The font appearance information represented by the upper 16 bits can be used for stylistic font matching.
     */
    @Generated public static final int TraitItalic = 0x00000001;
    /**
     * Symbolic Font Traits (Typeface info - lower 16 bits of UIFontDescriptorSymbolicTraits)
     * UIFontDescriptorSymbolicTraits symbolically describes stylistic aspects of a font. The upper 16 bits is used to describe appearance of the font whereas the lower 16 bits for typeface. The font appearance information represented by the upper 16 bits can be used for stylistic font matching.
     */
    @Generated public static final int TraitBold = 0x00000002;
    /**
     * expanded and condensed traits are mutually exclusive
     */
    @Generated public static final int TraitExpanded = 0x00000020;
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
     * Use tighter leading values
     */
    @Generated public static final int TraitTightLeading = 0x00008000;
    /**
     * Use looser leading values
     */
    @Generated public static final int TraitLooseLeading = 0x00010000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassMask = 0xF0000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassUnknown = 0x00000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassOldStyleSerifs = 0x10000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassTransitionalSerifs = 0x20000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassModernSerifs = 0x30000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassClarendonSerifs = 0x40000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassSlabSerifs = 0x50000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassFreeformSerifs = 0x70000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassSansSerif = 0x80000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassOrnamentals = 0x90000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassScripts = 0xA0000000;
    /**
     * Font appearance info (upper 16 bits of NSFontSymbolicTraits
     * UIFontDescriptorClassFamily classifies certain stylistic qualities of the font. These values correspond closely to the font class values in the OpenType 'OS/2' table. The class values are bundled in the upper four bits of the UIFontDescriptorSymbolicTraits and can be accessed via UIFontDescriptorClassMask. For specific meaning of each identifier, refer to the OpenType specification.
     */
    @Generated public static final int ClassSymbolic = 0xC0000000;

    @Generated
    private UIFontDescriptorSymbolicTraits() {
    }
}
