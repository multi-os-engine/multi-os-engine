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
 * @enum       CTParagraphStyleSpecifier
 * @abstract   These constants are used to query and modify the CTParagraphStyle
 *             object.
 * 
 * @discussion Each specifier has a type and a default value associated with it.
 *             The type must always be observed when setting or fetching the
 *             value from the CTParagraphStyle object. In addition, some
 *             specifiers affect the behavior of both the framesetter and
 *             the typesetter, and others only affect the behavior of the
 *             framesetter; this is also noted below.
 * 
 * @constant   kCTParagraphStyleSpecifierAlignment
 *             The text alignment. Natural text alignment is realized as
 *             left or right alignment, depending on the line sweep direction
 *             of the first script contained in the paragraph.
 * 
 *             Type: CTTextAlignment
 *             Default: kCTTextAlignmentNatural
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierFirstLineHeadIndent
 *             The distance in points from the leading margin of a frame to
 *             the beginning of the paragraph's first line. This value is always
 *             nonnegative.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierHeadIndent
 *             The distance in points from the leading margin of a text
 *             container to the beginning of lines other than the first.
 *             This value is always nonnegative.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierTailIndent
 *             The distance in points from the margin of a frame to the end of
 *             lines. If positive, this value is the distance from the leading
 *             margin (for example, the left margin in left-to-right text).
 *             If 0 or negative, it's the distance from the trailing margin.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierTabStops
 *             The CTTextTab objects, sorted by location, that define the tab
 *             stops for the paragraph style.
 * 
 *             Type: CFArray of CTTextTabRef
 *             Default: 12 left-aligned tabs, spaced by 28.0 points
 *             Application: CTFramesetter, CTTypesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierDefaultTabInterval
 *             The document-wide default tab interval. Tabs after the last
 *             specified by kCTParagraphStyleSpecifierTabStops are placed at
 *             integer multiples of this distance (if positive).
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter, CTTypesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierLineBreakMode
 *             The mode that should be used to break lines when laying out
 *             the paragraph's text.
 * 
 *             Type: CTLineBreakMode
 *             Default: kCTLineBreakByWordWrapping
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierLineHeightMultiple
 *             The line height multiple. The natural line height of the
 *             receiver is multiplied by this factor (if positive) before
 *             being constrained by minimum and maximum line height.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierMaximumLineHeight
 *             The maximum height that any line in the frame will occupy,
 *             regardless of the font size or size of any attached graphic.
 *             Glyphs and graphics exceeding this height will overlap
 *             neighboring lines. A maximum height of 0 implies
 *             no line height limit. This value is always nonnegative.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierMinimumLineHeight
 *             The minimum height that any line in the frame will occupy,
 *             regardless of the font size or size of any attached graphic.
 *             This value is always nonnegative.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierLineSpacing
 *             Deprecated.
 *             Use kCTParagraphStyleSpecifierMaximumLineSpacing, kCTParagraphStyleSpecifierMinimumLineSpacing,
 *             and kCTParagraphStyleSpecifierLineSpacingAdjustment to control
 *             space between lines.
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierParagraphSpacing
 *             The space added at the end of the paragraph to separate it from
 *             the following paragraph. This value is always nonnegative and is
 *             determined by adding the previous paragraph's
 *             kCTParagraphStyleSpecifierParagraphSpacing setting and the
 *             current paragraph's kCTParagraphStyleSpecifierParagraphSpacingBefore
 *             setting.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierParagraphSpacingBefore
 *             The distance between the paragraph's top and the beginning of
 *             its text content.
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierBaseWritingDirection
 *             The base writing direction of the lines.
 * 
 *             Type: CTWritingDirection
 *             Default: kCTWritingDirectionNatural
 *             Application: CTFramesetter, CTTypesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierMaximumLineSpacing
 *             The maximum space in points between lines within the paragraph
 *             (commonly known as leading).
 * 
 *             Type: CGFloat
 *             Default: some large number.
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierMinimumLineSpacing
 *             The minimum space in points between lines within the paragraph
 *             (commonly known as leading).
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierLineSpacingAdjustment
 *             The space in points added between lines within the paragraph
 *             (commonly known as leading). 
 * 
 *             Type: CGFloat
 *             Default: 0.0
 *             Application: CTFramesetter
 * 
 * 
 * @constant   kCTParagraphStyleSpecifierLineBoundsOptions
 *             The options controlling the alignment of the line edges with
 *             the leading and trailing margins.
 * 
 *             Type: CTLineBoundsOptions
 *             Default: 0 (no options)
 *             Application: CTTypesetter
 */
@Generated
public final class CTParagraphStyleSpecifier {
    @Generated public static final int Alignment = 0x00000000;
    @Generated public static final int FirstLineHeadIndent = 0x00000001;
    @Generated public static final int HeadIndent = 0x00000002;
    @Generated public static final int TailIndent = 0x00000003;
    @Generated public static final int TabStops = 0x00000004;
    @Generated public static final int DefaultTabInterval = 0x00000005;
    @Generated public static final int LineBreakMode = 0x00000006;
    @Generated public static final int LineHeightMultiple = 0x00000007;
    @Generated public static final int MaximumLineHeight = 0x00000008;
    @Generated public static final int MinimumLineHeight = 0x00000009;
    @Generated public static final int LineSpacing = 0x0000000A;
    @Generated public static final int ParagraphSpacing = 0x0000000B;
    @Generated public static final int ParagraphSpacingBefore = 0x0000000C;
    @Generated public static final int BaseWritingDirection = 0x0000000D;
    @Generated public static final int MaximumLineSpacing = 0x0000000E;
    @Generated public static final int MinimumLineSpacing = 0x0000000F;
    @Generated public static final int LineSpacingAdjustment = 0x00000010;
    @Generated public static final int LineBoundsOptions = 0x00000011;
    @Generated public static final int Count = 0x00000012;

    @Generated
    private CTParagraphStyleSpecifier() {
    }
}
