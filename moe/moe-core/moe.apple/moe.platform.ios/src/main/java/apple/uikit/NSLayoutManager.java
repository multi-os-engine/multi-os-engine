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

package apple.uikit;

import apple.NSObject;
import apple.coregraphics.opaque.CGContextRef;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSSecureCoding;
import apple.foundation.struct.NSRange;
import apple.uikit.protocol.NSLayoutManagerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstNUIntPtr;
import org.moe.natj.general.ptr.ConstPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.NUIntPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * API-Since: 7.0
 */
@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSLayoutManager extends NSObject implements NSSecureCoding {
    static {
        NatJ.register();
    }

    @Generated
    protected NSLayoutManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native NSLayoutManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native NSLayoutManager allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native NSLayoutManager new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("CGGlyphAtIndex:")
    public native char CGGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * If non-contiguous layout is not enabled, these will cause generation of all glyphs up to and including
     * glyphIndex. The first CGGlyphAtIndex variant returns kCGFontIndexInvalid if the requested index is out of the
     * range (0, numberOfGlyphs), and optionally returns a flag indicating whether the requested index is in range. The
     * second CGGlyphAtIndex variant raises a NSRangeError if the requested index is out of range.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("CGGlyphAtIndex:isValidIndex:")
    public native char CGGlyphAtIndexIsValidIndex(@NUInt long glyphIndex, @Nullable BoolPtr isValidIndex);

    /**
     * Add a container to the end of the array. Must invalidate layout of all glyphs after the previous last container
     * (i.e., glyphs that were not previously laid out because they would not fit anywhere).
     */
    @Generated
    @Selector("addTextContainer:")
    public native void addTextContainer(@NotNull NSTextContainer container);

    /**
     * If YES, then the layout manager may perform glyph generation and layout for a given portion of the text, without
     * having glyphs or layout for preceding portions. The default is NO. Turning this setting on will significantly
     * alter which portions of the text will have glyph generation or layout performed when a given generation-causing
     * method is invoked. It also gives significant performance benefits, especially for large documents.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("allowsNonContiguousLayout")
    public native boolean allowsNonContiguousLayout();

    /**
     * For a glyph corresponding to an attachment, this method returns the size the attachment cell will occupy. Returns
     * {-1,-1} if no attachment size has been set for the specified glyph.
     */
    @Generated
    @Selector("attachmentSizeForGlyphAtIndex:")
    @ByValue
    public native CGSize attachmentSizeForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * Returns the smallest bounding rect which completely encloses the glyphs in the given glyphRange that are in the
     * given container. The range is intersected with the container's range before computing the bounding rect. This
     * method can be used to translate glyph ranges into display rectangles for invalidation. Bounding rects are always
     * in container coordinates.
     */
    @Generated
    @Selector("boundingRectForGlyphRange:inTextContainer:")
    @ByValue
    public native CGRect boundingRectForGlyphRangeInTextContainer(@ByValue NSRange glyphRange,
            @NotNull NSTextContainer container);

    /**
     * If non-contiguous layout is not enabled, this will cause generation of all glyphs up to and including glyphIndex.
     * It will return the character index for the first character associated with the glyph at the specified index.
     */
    @Generated
    @Selector("characterIndexForGlyphAtIndex:")
    @NUInt
    public native long characterIndexForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * Returns the index of the character falling under the given point, expressed in the given container's coordinate
     * system. If no character is under the point, the nearest character is returned, where nearest is defined according
     * to the requirements of selection by touch or mouse. This is not simply equivalent to taking the result of the
     * corresponding glyph index method and converting it to a character index, because in some cases a single glyph
     * represents more than one selectable character, for example an fi ligature glyph. In that case, there will be an
     * insertion point within the glyph, and this method will return one character or the other, depending on whether
     * the specified point lies to the left or the right of that insertion point. In general, this method will return
     * only character indexes for which there is an insertion point (see next method). The partial fraction is a
     * fraction of the distance from the insertion point logically before the given character to the next one, which may
     * be either to the right or to the left depending on directionality.
     */
    @Generated
    @Selector("characterIndexForPoint:inTextContainer:fractionOfDistanceBetweenInsertionPoints:")
    @NUInt
    public native long characterIndexForPointInTextContainerFractionOfDistanceBetweenInsertionPoints(
            @ByValue CGPoint point, @NotNull NSTextContainer container, @Nullable NFloatPtr partialFraction);

    /**
     * Returns the range of characters that generated the glyphs in the given glyphRange. If actualGlyphRange is not
     * NULL, it will return by reference the full range of glyphs generated by the character range returned. This range
     * may be identical or slightly larger than the requested glyph range. For example, if the text storage contains the
     * character (o-umlaut) and the glyph store contains the two atomic glyphs "o" and (umlaut), and if the glyph range
     * given encloses only the first or second glyph, then actualGlyphRange will be set to enclose both glyphs. If the
     * length of glyphRange is zero, the resulting character range will be a zero-length range just after the
     * character(s) corresponding to the preceding glyph, and actualGlyphRange will also be zero-length. If
     * non-contiguous layout is not enabled, this will force the generation of glyphs for all characters up to and
     * including the end of the returned range.
     */
    @Generated
    @Selector("characterRangeForGlyphRange:actualGlyphRange:")
    @ByValue
    public native NSRange characterRangeForGlyphRangeActualGlyphRange(@ByValue NSRange glyphRange,
            @Nullable NSRange actualGlyphRange);

    /**
     * Delegate ***************************
     */
    @Nullable
    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native NSLayoutManagerDelegate delegate();

    /**
     * Drawing support ***********************
     * These methods are primitives for drawing. You can override these to perform additional drawing, or to replace
     * text drawing entirely, but not to change layout. You can call them if you want, but focus must already be locked
     * on the destination view or image. -drawBackgroundForGlyphRange:atPoint: draws the background color and selection
     * and marked range aspects of the text display, along with block decoration such as table backgrounds and borders.
     * -drawGlyphsForGlyphRange:atPoint: draws the actual glyphs, including attachments, as well as any underlines or
     * strikethroughs. In either case all of the specified glyphs must lie in a single container.
     */
    @Generated
    @Selector("drawBackgroundForGlyphRange:atPoint:")
    public native void drawBackgroundForGlyphRangeAtPoint(@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

    @Generated
    @Selector("drawGlyphsForGlyphRange:atPoint:")
    public native void drawGlyphsForGlyphRangeAtPoint(@ByValue NSRange glyphsToShow, @ByValue CGPoint origin);

    /**
     * These two methods parallel the two corresponding underline methods, but draw strikethroughs instead of
     * underlines.
     */
    @Generated
    @Selector("drawStrikethroughForGlyphRange:strikethroughType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawStrikethroughForGlyphRangeStrikethroughTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long strikethroughVal, @NFloat double baselineOffset,
            @ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * The first of these methods actually draws an appropriate underline for the glyph range given. The second method
     * potentially breaks the range it is given up into subranges and calls drawUnderline... for ranges that should
     * actually have the underline drawn. As examples of why there are two methods, consider two situations. First, in
     * all cases you don't want to underline the leading and trailing whitespace on a line. The -underlineGlyphRange...
     * method is passed glyph ranges that have underlining turned on, but it will then look for this leading and
     * trailing white space and only pass the ranges that should actually be underlined to -drawUnderline... Second, if
     * the underlineType: indicates that only words, (i.e., no whitespace), should be underlined, then
     * -underlineGlyphRange... will carve the range it is passed up into words and only pass word ranges to
     * -drawUnderline.
     */
    @Generated
    @Selector("drawUnderlineForGlyphRange:underlineType:baselineOffset:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void drawUnderlineForGlyphRangeUnderlineTypeBaselineOffsetLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long underlineVal, @NFloat double baselineOffset,
            @ByValue CGRect lineRect, @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * Returns whether the glyph will draw outside of its line fragment rect. This will cause glyph generation and
     * layout for the line fragment containing the specified glyph, or if non-contiguous layout is not enabled, up to
     * and including that line fragment.
     */
    @Generated
    @Selector("drawsOutsideLineFragmentForGlyphAtIndex:")
    public native boolean drawsOutsideLineFragmentForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(@NotNull NSCoder coder);

    /**
     * These methods allow clients to specify exactly the portions of the document for which they wish to have glyphs or
     * layout. This is particularly important if non-contiguous layout is enabled. The layout manager still reserves the
     * right to perform glyph generation or layout for larger ranges. If non-contiguous layout is not enabled, then the
     * range in question will always effectively be extended to start at the beginning of the text.
     */
    @Generated
    @Selector("ensureGlyphsForCharacterRange:")
    public native void ensureGlyphsForCharacterRange(@ByValue NSRange charRange);

    @Generated
    @Selector("ensureGlyphsForGlyphRange:")
    public native void ensureGlyphsForGlyphRange(@ByValue NSRange glyphRange);

    @Generated
    @Selector("ensureLayoutForBoundingRect:inTextContainer:")
    public native void ensureLayoutForBoundingRectInTextContainer(@ByValue CGRect bounds,
            @NotNull NSTextContainer container);

    @Generated
    @Selector("ensureLayoutForCharacterRange:")
    public native void ensureLayoutForCharacterRange(@ByValue NSRange charRange);

    @Generated
    @Selector("ensureLayoutForGlyphRange:")
    public native void ensureLayoutForGlyphRange(@ByValue NSRange glyphRange);

    @Generated
    @Selector("ensureLayoutForTextContainer:")
    public native void ensureLayoutForTextContainer(@NotNull NSTextContainer container);

    /**
     * Enumerates enclosing rects for glyphRange in textContainer. If a selected range is given in the second argument,
     * the rectangles returned will be correct for drawing the selection. Selection rectangles are generally more
     * complicated than enclosing rectangles and supplying a selected range is the clue these methods use to determine
     * whether to go to the trouble of doing this special work. If the caller is interested in this more from an
     * enclosing point of view rather than a selection point of view, pass {NSNotFound, 0} as the selected range. This
     * method will do the minimum amount of work required to answer the question.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("enumerateEnclosingRectsForGlyphRange:withinSelectedGlyphRange:inTextContainer:usingBlock:")
    public native void enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock(
            @ByValue NSRange glyphRange, @ByValue NSRange selectedRange, @NotNull NSTextContainer textContainer,
            @NotNull @ObjCBlock(name = "call_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock") Block_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock block);

    /**
     * Enumerates line fragments intersecting with glyphRange.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("enumerateLineFragmentsForGlyphRange:usingBlock:")
    public native void enumerateLineFragmentsForGlyphRangeUsingBlock(@ByValue NSRange glyphRange,
            @NotNull @ObjCBlock(name = "call_enumerateLineFragmentsForGlyphRangeUsingBlock") Block_enumerateLineFragmentsForGlyphRangeUsingBlock block);

    /**
     * Return info about the extra line fragment. The extra line fragment is used for displaying the line at the end of
     * document when the last character in the document causes a line or paragraph break. Since the extra line is not
     * associated with any glyph inside the layout manager, the information is handed separately from other line
     * fragment rects. Typically the extra line fragment is placed in the last document content text container along
     * with other normal line fragment rects. Line fragment rects and line fragment used rects are always in container
     * coordinates.
     */
    @Generated
    @Selector("extraLineFragmentRect")
    @ByValue
    public native CGRect extraLineFragmentRect();

    @Nullable
    @Generated
    @Selector("extraLineFragmentTextContainer")
    public native NSTextContainer extraLineFragmentTextContainer();

    @Generated
    @Selector("extraLineFragmentUsedRect")
    @ByValue
    public native CGRect extraLineFragmentUsedRect();

    /**
     * This is the primitive used by -drawBackgroundForGlyphRange:atPoint: for actually filling rects with a particular
     * background color, whether due to a background color attribute, a selected or marked range highlight, a block
     * decoration, or any other rect fill needed by that method. As with -showCGGlyphs:..., the character range and
     * color are merely for informational purposes; the color will already be set in the graphics state. If for any
     * reason you modify it, you must restore it before returning from this method. You should never call this method,
     * but you might override it. The default implementation will simply fill the specified rect array.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("fillBackgroundRectArray:count:forCharacterRange:color:")
    public native void fillBackgroundRectArrayCountForCharacterRangeColor(
            @NotNull @ReferenceInfo(type = CGRect.class) ConstPtr<CGRect> rectArray, @NUInt long rectCount,
            @ByValue NSRange charRange, @NotNull UIColor color);

    @Generated
    @Selector("firstUnlaidCharacterIndex")
    @NUInt
    public native long firstUnlaidCharacterIndex();

    @Generated
    @Selector("firstUnlaidGlyphIndex")
    @NUInt
    public native long firstUnlaidGlyphIndex();

    @Generated
    @Selector("fractionOfDistanceThroughGlyphForPoint:inTextContainer:")
    @NFloat
    public native double fractionOfDistanceThroughGlyphForPointInTextContainer(@ByValue CGPoint point,
            @NotNull NSTextContainer container);

    /**
     * Returns (by reference for the "get" method) the character index or glyph index or both of the first unlaid
     * character/glyph in the layout manager at this time.
     */
    @Generated
    @Selector("getFirstUnlaidCharacterIndex:glyphIndex:")
    public native void getFirstUnlaidCharacterIndexGlyphIndex(@Nullable NUIntPtr charIndex,
            @Nullable NUIntPtr glyphIndex);

    /**
     * Fills a passed-in buffer with a sequence of CGGlyphs. They will also optionally fill other passed-in buffers with
     * the glyph properties, character indexes, and bidi levels corresponding to these glyphs. Each pointer passed in
     * should either be NULL, or else point to sufficient memory to hold glyphRange.length elements. These methods
     * return the number of glyphs filled in.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("getGlyphsInRange:glyphs:properties:characterIndexes:bidiLevels:")
    @NUInt
    public native long getGlyphsInRangeGlyphsPropertiesCharacterIndexesBidiLevels(@ByValue NSRange glyphRange,
            @Nullable CharPtr glyphBuffer, @Nullable NIntPtr props, @Nullable NUIntPtr charIndexBuffer,
            @Nullable BytePtr bidiLevelBuffer);

    /**
     * Allows clients to obtain all insertion points for a line fragment in one call. The caller specifies the line
     * fragment by supplying one character index within it, and can choose whether to obtain primary or alternate
     * insertion points, and whether they should be in logical or in display order. The return value is the number of
     * insertion points returned. Each pointer passed in should either be NULL, or else point to sufficient memory to
     * hold as many elements as there are insertion points in the line fragment (which cannot be more than the number of
     * characters + 1). The positions buffer passed in will be filled in with the positions of the insertion points, in
     * the order specified, and the charIndexes buffer passed in will be filled in with the corresponding character
     * indexes. Positions indicate a transverse offset relative to the line fragment rect's origin. Internal caching is
     * used to ensure that repeated calls to this method for the same line fragment (possibly with differing values for
     * other arguments) will not be significantly more expensive than a single call.
     */
    @Generated
    @Selector("getLineFragmentInsertionPointsForCharacterAtIndex:alternatePositions:inDisplayOrder:positions:characterIndexes:")
    @NUInt
    public native long getLineFragmentInsertionPointsForCharacterAtIndexAlternatePositionsInDisplayOrderPositionsCharacterIndexes(
            @NUInt long charIndex, boolean aFlag, boolean dFlag, @Nullable NFloatPtr positions,
            @Nullable NUIntPtr charIndexes);

    /**
     * Use -CGGlyphAtIndex: instead
     */
    @Generated
    @Selector("glyphAtIndex:")
    public native char glyphAtIndex(@NUInt long glyphIndex);

    /**
     * Use -CGGlyphAtIndex:isValidIndex: instead
     */
    @Generated
    @Selector("glyphAtIndex:isValidIndex:")
    public native char glyphAtIndexIsValidIndex(@NUInt long glyphIndex, @Nullable BoolPtr isValidIndex);

    /**
     * If non-contiguous layout is not enabled, this will cause generation of all glyphs up to and including those
     * associated with the specified character. It will return the glyph index for the first glyph associated with the
     * character at the specified index.
     */
    @Generated
    @Selector("glyphIndexForCharacterAtIndex:")
    @NUInt
    public native long glyphIndexForCharacterAtIndex(@NUInt long charIndex);

    @Generated
    @Selector("glyphIndexForPoint:inTextContainer:")
    @NUInt
    public native long glyphIndexForPointInTextContainer(@ByValue CGPoint point, @NotNull NSTextContainer container);

    /**
     * Returns the index of the glyph falling under the given point, expressed in the given container's coordinate
     * system. If no glyph is under the point, the nearest glyph is returned, where nearest is defined according to the
     * requirements of selection by touch or mouse. Clients who wish to determine whether the the point actually lies
     * within the bounds of the glyph returned should follow this with a call to
     * boundingRectForGlyphRange:inTextContainer: and test whether the point falls in the rect returned by that method.
     * If partialFraction is non-NULL, it will return by reference the fraction of the distance between the location of
     * the glyph returned and the location of the next glyph.
     */
    @Generated
    @Selector("glyphIndexForPoint:inTextContainer:fractionOfDistanceThroughGlyph:")
    @NUInt
    public native long glyphIndexForPointInTextContainerFractionOfDistanceThroughGlyph(@ByValue CGPoint point,
            @NotNull NSTextContainer container, @Nullable NFloatPtr partialFraction);

    /**
     * Returns a contiguous glyph range containing all glyphs that would need to be displayed in order to draw all
     * glyphs that fall (even partially) within the bounding rect given. This range might include glyphs which do not
     * fall into the rect at all. At most this will return the glyph range for the whole container. The
     * WithoutAdditionalLayout variant will not generate glyphs or perform layout in attempting to answer, and thus may
     * not be entirely correct. Bounding rects are always in container coordinates.
     */
    @Generated
    @Selector("glyphRangeForBoundingRect:inTextContainer:")
    @ByValue
    public native NSRange glyphRangeForBoundingRectInTextContainer(@ByValue CGRect bounds,
            @NotNull NSTextContainer container);

    @Generated
    @Selector("glyphRangeForBoundingRectWithoutAdditionalLayout:inTextContainer:")
    @ByValue
    public native NSRange glyphRangeForBoundingRectWithoutAdditionalLayoutInTextContainer(@ByValue CGRect bounds,
            @NotNull NSTextContainer container);

    /**
     * Returns the range of glyphs that are generated from the characters in the given charRange. If actualCharRange is
     * not NULL, it will return by reference the actual range of characters that fully define the glyph range returned.
     * This range may be identical to or slightly larger than the requested character range. For example, if the text
     * storage contains the characters "o" and (umlaut) and the glyph store contains the single precomposed glyph
     * (o-umlaut), and if the character range given encloses only the first or second character, then actualCharRange
     * will be set to enclose both characters. If the length of charRange is zero, the resulting glyph range will be a
     * zero-length range just after the glyph(s) corresponding to the preceding character, and actualCharRange will also
     * be zero-length. If non-contiguous layout is not enabled, this will force the generation of glyphs for all
     * characters up to and including the end of the specified range.
     */
    @Generated
    @Selector("glyphRangeForCharacterRange:actualCharacterRange:")
    @ByValue
    public native NSRange glyphRangeForCharacterRangeActualCharacterRange(@ByValue NSRange charRange,
            @Nullable NSRange actualCharRange);

    /**
     * Returns the range of characters which have been laid into the given container. This is a less efficient method
     * than the similar -textContainerForGlyphAtIndex:effectiveRange:.
     */
    @Generated
    @Selector("glyphRangeForTextContainer:")
    @ByValue
    public native NSRange glyphRangeForTextContainer(@NotNull NSTextContainer container);

    /**
     * Even if non-contiguous layout is allowed, it may not always be used, and there may not always be layout holes.
     * This method returns YES if there might currently be non-contiguous portions of the text laid out.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("hasNonContiguousLayout")
    public native boolean hasNonContiguousLayout();

    /**
     * 0.0 - 1.0. Whenever (width of the real contents of the line) / (the line fragment width) is below this value,
     * hyphenation will be attempted when laying out the line. By default, the value is 0.0, meaning hyphenation is off.
     * A value of 1.0 causes hyphenation to be attempted always. Note that hyphenation will slow down text layout and
     * increase memory usage, so it should be used sparingly. Maybe overridden on a per-paragraph basis by the
     * NSParagraphStyle's hyphenationFactor.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.
     */
    @Deprecated
    @Generated
    @Selector("hyphenationFactor")
    @NFloat
    public native double hyphenationFactor();

    /**
     * Designated Initializer. Sets up this instance. The NSLayoutManager starts off without an NSTextStorage.
     */
    @Generated
    @Selector("init")
    public native NSLayoutManager init();

    @Generated
    @Selector("initWithCoder:")
    public native NSLayoutManager initWithCoder(@NotNull NSCoder coder);

    /**
     * Insert a container into the array before the container at index. Must invalidate layout of all glyphs in the
     * containers from the one previously at index to the last container.
     */
    @Generated
    @Selector("insertTextContainer:atIndex:")
    public native void insertTextContainerAtIndex(@NotNull NSTextContainer container, @NUInt long index);

    /**
     * These methods invalidate display for the glyph or character range given. For the character range variant, unlaid
     * parts of the range are remembered and will be redisplayed at some point later when the layout is available. For
     * the glyph range variant any part of the range that does not yet have glyphs generated is ignored. Neither method
     * actually causes layout.
     */
    @Generated
    @Selector("invalidateDisplayForCharacterRange:")
    public native void invalidateDisplayForCharacterRange(@ByValue NSRange charRange);

    @Generated
    @Selector("invalidateDisplayForGlyphRange:")
    public native void invalidateDisplayForGlyphRange(@ByValue NSRange glyphRange);

    /**
     * This removes all glyphs for the old character range, adjusts the character indices of all the subsequent glyphs
     * by the change in length, and invalidates the new character range. If actualCharRange is non-NULL it will be set
     * to the actual range invalidated after any necessary expansion.
     */
    @Generated
    @Selector("invalidateGlyphsForCharacterRange:changeInLength:actualCharacterRange:")
    public native void invalidateGlyphsForCharacterRangeChangeInLengthActualCharacterRange(@ByValue NSRange charRange,
            @NInt long delta, @Nullable NSRange actualCharRange);

    /**
     * This method invalidates the layout information for the given range of characters. If actualCharRange is non-NULL
     * it will be set to the actual range invalidated after any necessary expansion.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("invalidateLayoutForCharacterRange:actualCharacterRange:")
    public native void invalidateLayoutForCharacterRangeActualCharacterRange(@ByValue NSRange charRange,
            @Nullable NSRange actualCharRange);

    /**
     * API-Since: 7.0
     */
    @Generated
    @Selector("isValidGlyphIndex:")
    public native boolean isValidGlyphIndex(@NUInt long glyphIndex);

    /**
     * Returns the rect for the line fragment in which the given glyph is laid and (optionally) by reference the whole
     * range of glyphs that are in that fragment. This will cause glyph generation and layout for the line fragment
     * containing the specified glyph, or if non-contiguous layout is not enabled, up to and including that line
     * fragment. Line fragment rects are always in container coordinates.
     */
    @Generated
    @Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:")
    @ByValue
    public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            @Nullable NSRange effectiveGlyphRange);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("lineFragmentRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    @ByValue
    public native CGRect lineFragmentRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(@NUInt long glyphIndex,
            @Nullable NSRange effectiveGlyphRange, boolean flag);

    /**
     * Returns the usage rect for the line fragment in which the given glyph is laid and (optionally) by reference the
     * whole range of glyphs that are in that fragment. This will cause glyph generation and layout for the line
     * fragment containing the specified glyph, or if non-contiguous layout is not enabled, up to and including that
     * line fragment. Line fragment used rects are always in container coordinates.
     */
    @Generated
    @Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:")
    @ByValue
    public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            @Nullable NSRange effectiveGlyphRange);

    /**
     * API-Since: 9.0
     */
    @Generated
    @Selector("lineFragmentUsedRectForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    @ByValue
    public native CGRect lineFragmentUsedRectForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
            @NUInt long glyphIndex, @Nullable NSRange effectiveGlyphRange, boolean flag);

    /**
     * Returns the location for the given glyph within its line fragment. If this glyph does not have an explicit
     * location set for it (i.e., it is part of (but not first in) a sequence of nominally spaced characters), the
     * location is calculated by glyph advancements from the location of the most recent preceding glyph with a location
     * set. Glyph locations are relative to their line fragment rect's origin. This will cause glyph generation and
     * layout for the line fragment containing the specified glyph, or if non-contiguous layout is not enabled, up to
     * and including that line fragment.
     */
    @Generated
    @Selector("locationForGlyphAtIndex:")
    @ByValue
    public native CGPoint locationForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * Some glyphs are not shown. This method returns whether the given glyph has been designated as not shown. This
     * will cause glyph generation and layout for the line fragment containing the specified glyph, or if non-contiguous
     * layout is not enabled, up to and including that line fragment.
     */
    @Generated
    @Selector("notShownAttributeForGlyphAtIndex:")
    public native boolean notShownAttributeForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * Returns the total number of glyphs. If non-contiguous layout is not enabled, this will force generation of glyphs
     * for all characters.
     */
    @Generated
    @Selector("numberOfGlyphs")
    @NUInt
    public native long numberOfGlyphs();

    /**
     * Sent from processEditing in NSTextStorage. The newCharRange is the range in the final string which was explicitly
     * edited. The invalidatedRange includes portions that changed as a result of attribute fixing. invalidatedRange is
     * either equal to newCharRange or larger. Layout managers should not change the contents of the text storage during
     * the execution of this message.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("processEditingForTextStorage:edited:range:changeInLength:invalidatedRange:")
    public native void processEditingForTextStorageEditedRangeChangeInLengthInvalidatedRange(
            @NotNull NSTextStorage textStorage, @NUInt long editMask, @ByValue NSRange newCharRange, @NInt long delta,
            @ByValue NSRange invalidatedCharRange);

    /**
     * If non-contiguous layout is not enabled, this will cause generation of all glyphs up to and including glyphIndex.
     * It will return the glyph property associated with the glyph at the specified index.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("propertyForGlyphAtIndex:")
    @NInt
    public native long propertyForGlyphAtIndex(@NUInt long glyphIndex);

    /**
     * Returns the range including the first glyph from glyphIndex on back that has a location set and up to, but not
     * including the next glyph that has a location set.
     */
    @Generated
    @Selector("rangeOfNominallySpacedGlyphsContainingIndex:")
    @ByValue
    public native NSRange rangeOfNominallySpacedGlyphsContainingIndex(@NUInt long glyphIndex);

    /**
     * Removes the container at index from the array. Must invalidate layout of all glyphs in the container being
     * removed and any containers which come after it.
     */
    @Generated
    @Selector("removeTextContainerAtIndex:")
    public native void removeTextContainerAtIndex(@NUInt long index);

    /**
     * If YES, then the layout manager may perform glyph generation and layout for a given portion of the text, without
     * having glyphs or layout for preceding portions. The default is NO. Turning this setting on will significantly
     * alter which portions of the text will have glyph generation or layout performed when a given generation-causing
     * method is invoked. It also gives significant performance benefits, especially for large documents.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setAllowsNonContiguousLayout:")
    public native void setAllowsNonContiguousLayout(boolean value);

    /**
     * For a glyph corresponding to an attachment, this method should be called to set the size the attachment cell will
     * occupy.
     */
    @Generated
    @Selector("setAttachmentSize:forGlyphRange:")
    public native void setAttachmentSizeForGlyphRange(@ByValue CGSize attachmentSize, @ByValue NSRange glyphRange);

    /**
     * Delegate ***************************
     */
    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Nullable @Mapped(ObjCObjectMapper.class) NSLayoutManagerDelegate value);

    /**
     * Delegate ***************************
     */
    @Generated
    public void setDelegate(@Nullable @Mapped(ObjCObjectMapper.class) NSLayoutManagerDelegate value) {
        Object __old = delegate();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setDelegate_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * Used to indicate that a particular glyph for some reason will draw outside of its line fragment rect. This can
     * commonly happen if a fixed line height is used (consider a 12 point line height and a 24 point glyph). This
     * information is important for determining whether additional lines need to be redrawn as a result of changes to
     * any given line fragment.
     */
    @Generated
    @Selector("setDrawsOutsideLineFragment:forGlyphAtIndex:")
    public native void setDrawsOutsideLineFragmentForGlyphAtIndex(boolean flag, @NUInt long glyphIndex);

    /**
     * Sets the bounds and container for the extra line fragment. The extra line fragment is used when the text backing
     * ends with a hard line break or when the text backing is totally empty, to define the extra line which needs to be
     * displayed at the end of the text. Line fragment rects and line fragment used rects are always in container
     * coordinates. This method should be invoked only when there is a non-empty extra line fragment.
     */
    @Generated
    @Selector("setExtraLineFragmentRect:usedRect:textContainer:")
    public native void setExtraLineFragmentRectUsedRectTextContainer(@ByValue CGRect fragmentRect,
            @ByValue CGRect usedRect, @NotNull NSTextContainer container);

    /**
     * Sets the initial glyphs and properties for a character range. This method is invoked mainly from the glyph
     * generation process. Only place apps are allowed to directly call this method is from
     * -layoutManager:shouldGenerateGlyphs:properties:characterIndexes:forGlyphRange:. Each array has glyphRange.length
     * items. charIndexes must be contiguous (no skipped indexes). It allows multiple items to have a same character
     * index (a character index generating multiple glyph IDs). Due to the font substitution, aFont passed into this
     * method might not match the font in the attributes dictionary. Calling this method for a range with the layout
     * information invalidates the layout and display.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("setGlyphs:properties:characterIndexes:font:forGlyphRange:")
    public native void setGlyphsPropertiesCharacterIndexesFontForGlyphRange(@NotNull ConstCharPtr glyphs,
            @NotNull ConstNIntPtr props, @NotNull ConstNUIntPtr charIndexes, @NotNull UIFont aFont,
            @ByValue NSRange glyphRange);

    /**
     * 0.0 - 1.0. Whenever (width of the real contents of the line) / (the line fragment width) is below this value,
     * hyphenation will be attempted when laying out the line. By default, the value is 0.0, meaning hyphenation is off.
     * A value of 1.0 causes hyphenation to be attempted always. Note that hyphenation will slow down text layout and
     * increase memory usage, so it should be used sparingly. Maybe overridden on a per-paragraph basis by the
     * NSParagraphStyle's hyphenationFactor.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Please use usesDefaultHyphenation or -[NSParagraphStyle hyphenationFactor] instead.
     */
    @Deprecated
    @Generated
    @Selector("setHyphenationFactor:")
    public native void setHyphenationFactor(@NFloat double value);

    /**
     * Associates the given line fragment bounds with the given range of glyphs. The typesetter should call this method
     * second, after setting the line fragment rect and before setting the location or any of the layout bits. In the
     * course of layout, all glyphs should end up being included in a range passed to this method, but only glyphs which
     * start a new line fragment should be at the start of such ranges. Line fragment rects and line fragment used rects
     * are always in container coordinates.
     */
    @Generated
    @Selector("setLineFragmentRect:forGlyphRange:usedRect:")
    public native void setLineFragmentRectForGlyphRangeUsedRect(@ByValue CGRect fragmentRect,
            @ByValue NSRange glyphRange, @ByValue CGRect usedRect);

    /**
     * Sets the location for the first glyph of the given range. Setting the location for a glyph range implies that its
     * first glyph is not nominally spaced with respect to the previous glyph. In the course of layout, all glyphs
     * should end up being included in a range passed to this method, but only glyphs which start a new nominal range
     * should be at the start of such ranges. The first glyph in a line fragment should always start a new nominal
     * range. Glyph locations are given relative to their line fragment rect's origin.
     */
    @Generated
    @Selector("setLocation:forStartOfGlyphRange:")
    public native void setLocationForStartOfGlyphRange(@ByValue CGPoint location, @ByValue NSRange glyphRange);

    /**
     * Some glyphs are not shown. The typesetter decides which ones and sets this attribute in the layout manager to
     * ensure that those glyphs will not be displayed.
     */
    @Generated
    @Selector("setNotShownAttribute:forGlyphAtIndex:")
    public native void setNotShownAttributeForGlyphAtIndex(boolean flag, @NUInt long glyphIndex);

    /**
     * If YES, then control characters will be rendered visibly (usually like "^M"). The default is NO.
     */
    @Generated
    @Selector("setShowsControlCharacters:")
    public native void setShowsControlCharacters(boolean value);

    /**
     * If YES, then whitespace and other "invisible" characters will be shown with special glyphs or other drawing. The
     * default is NO.
     */
    @Generated
    @Selector("setShowsInvisibleCharacters:")
    public native void setShowsInvisibleCharacters(boolean value);

    /**
     * Associates the given container with the given range of glyphs. This method should be called by the typesetter
     * first, before setting line fragment rect or any of the layout bits, for each range of glyphs it lays out. This
     * method will reset several key layout attributes (like not shown and draws outside line fragment) to their default
     * values. In the course of layout, all glyphs should end up being included in a range passed to this method. The
     * range passed in is not expected to be the entire range of glyphs for that text container; usually, in fact, it
     * will be the range for a given line fragment being laid out in that container.
     */
    @Generated
    @Selector("setTextContainer:forGlyphRange:")
    public native void setTextContainerForGlyphRange(@NotNull NSTextContainer container, @ByValue NSRange glyphRange);

    /**
     * Accessor for the NSTextStorage object owning the receiver.
     * Avoid assigning a text storage directly through this property. Adding a layout manager to a text storage through
     * -[NSTextStorage addLayoutManager:] will use the property for assigning the new text storage.
     */
    @Generated
    @Selector("setTextStorage:")
    public native void setTextStorage_unsafe(@Nullable NSTextStorage value);

    /**
     * Accessor for the NSTextStorage object owning the receiver.
     * Avoid assigning a text storage directly through this property. Adding a layout manager to a text storage through
     * -[NSTextStorage addLayoutManager:] will use the property for assigning the new text storage.
     */
    @Generated
    public void setTextStorage(@Nullable NSTextStorage value) {
        Object __old = textStorage();
        if (value != null) {
            org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
        }
        setTextStorage_unsafe(value);
        if (__old != null) {
            org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
        }
    }

    /**
     * By default, a layout manager will use leading as specified by the font. However, this is not appropriate for most
     * UI text, for which a fixed leading is usually specified by UI layout guidelines. These methods allow the use of
     * the font's leading to be turned off.
     */
    @Generated
    @Selector("setUsesFontLeading:")
    public native void setUsesFontLeading(boolean value);

    /**
     * This is the glyph rendering primitive method. Renders glyphs at positions into the graphicsContext. The positions
     * are in the user space coordinate system. graphicsContext that passed in is already configured according to the
     * text attributes arguments: font, textMatrix, and attributes. The font argument represents the font applied to the
     * graphics state. The value can be different from the NSFontAttributeName value in the attributes argument because
     * of various font substitutions that the system automatically executes. The textMatrix is the affine transform
     * mapping the text space coordinate system to the user space coordinate system. The tx and ty components of
     * textMatrix are ignored since Quartz overrides them with the glyph positions.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @Selector("showCGGlyphs:positions:count:font:matrix:attributes:inContext:")
    public native void showCGGlyphsPositionsCountFontMatrixAttributesInContext(@NotNull ConstCharPtr glyphs,
            @NotNull @ReferenceInfo(type = CGPoint.class) ConstPtr<CGPoint> positions, @NUInt long glyphCount,
            @NotNull UIFont font, @ByValue CGAffineTransform textMatrix, @NotNull NSDictionary<String, ?> attributes,
            @NotNull CGContextRef graphicsContext);

    /**
     * If YES, then control characters will be rendered visibly (usually like "^M"). The default is NO.
     */
    @Generated
    @Selector("showsControlCharacters")
    public native boolean showsControlCharacters();

    /**
     * If YES, then whitespace and other "invisible" characters will be shown with special glyphs or other drawing. The
     * default is NO.
     */
    @Generated
    @Selector("showsInvisibleCharacters")
    public native boolean showsInvisibleCharacters();

    @Generated
    @Selector("strikethroughGlyphRange:strikethroughType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void strikethroughGlyphRangeStrikethroughTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long strikethroughVal, @ByValue CGRect lineRect,
            @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * Called by NSTextContainer whenever it changes size or shape. Invalidates layout of all glyphs in container and
     * all subsequent containers.
     */
    @Generated
    @Selector("textContainerChangedGeometry:")
    public native void textContainerChangedGeometry(@NotNull NSTextContainer container);

    /**
     * Returns the container in which the given glyph is laid and (optionally) by reference the whole range of glyphs
     * that are in that container. This will cause glyph generation and layout for the line fragment containing the
     * specified glyph, or if non-contiguous layout is not enabled, up to and including that line fragment; if
     * non-contiguous layout is not enabled and effectiveGlyphRange is non-NULL, this will additionally cause glyph
     * generation and layout for the entire text container containing the specified glyph.
     */
    @Nullable
    @Generated
    @Selector("textContainerForGlyphAtIndex:effectiveRange:")
    public native NSTextContainer textContainerForGlyphAtIndexEffectiveRange(@NUInt long glyphIndex,
            @Nullable NSRange effectiveGlyphRange);

    /**
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @Selector("textContainerForGlyphAtIndex:effectiveRange:withoutAdditionalLayout:")
    public native NSTextContainer textContainerForGlyphAtIndexEffectiveRangeWithoutAdditionalLayout(
            @NUInt long glyphIndex, @Nullable NSRange effectiveGlyphRange, boolean flag);

    /**
     * NSTextContainer objects owner by the receiver.
     */
    @NotNull
    @Generated
    @Selector("textContainers")
    public native NSArray<? extends NSTextContainer> textContainers();

    /**
     * Accessor for the NSTextStorage object owning the receiver.
     * Avoid assigning a text storage directly through this property. Adding a layout manager to a text storage through
     * -[NSTextStorage addLayoutManager:] will use the property for assigning the new text storage.
     */
    @Nullable
    @Generated
    @Selector("textStorage")
    public native NSTextStorage textStorage();

    /**
     * Returns a range of truncated glyph range for a line fragment containing the specified index. When there is no
     * truncation for the line fragment, it returns {NSNotFound, 0}.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("truncatedGlyphRangeInLineFragmentForGlyphAtIndex:")
    @ByValue
    public native NSRange truncatedGlyphRangeInLineFragmentForGlyphAtIndex(@NUInt long glyphIndex);

    @Generated
    @Selector("underlineGlyphRange:underlineType:lineFragmentRect:lineFragmentGlyphRange:containerOrigin:")
    public native void underlineGlyphRangeUnderlineTypeLineFragmentRectLineFragmentGlyphRangeContainerOrigin(
            @ByValue NSRange glyphRange, @NInt long underlineVal, @ByValue CGRect lineRect,
            @ByValue NSRange lineGlyphRange, @ByValue CGPoint containerOrigin);

    /**
     * Returns the container's currently used area. This determines the size that the view would need to be in order to
     * display all the glyphs that are currently laid into the container. This causes neither glyph generation nor
     * layout. Used rects are always in container coordinates.
     */
    @Generated
    @Selector("usedRectForTextContainer:")
    @ByValue
    public native CGRect usedRectForTextContainer(@NotNull NSTextContainer container);

    /**
     * By default, a layout manager will use leading as specified by the font. However, this is not appropriate for most
     * UI text, for which a fixed leading is usually specified by UI layout guidelines. These methods allow the use of
     * the font's leading to be turned off.
     */
    @Generated
    @Selector("usesFontLeading")
    public native boolean usesFontLeading();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock {
        @Generated
        void call_enumerateEnclosingRectsForGlyphRangeWithinSelectedGlyphRangeInTextContainerUsingBlock(
                @ByValue CGRect rect, @NotNull BoolPtr stop);
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enumerateLineFragmentsForGlyphRangeUsingBlock {
        @Generated
        void call_enumerateLineFragmentsForGlyphRangeUsingBlock(@ByValue CGRect rect, @ByValue CGRect usedRect,
                @NotNull NSTextContainer textContainer, @ByValue NSRange glyphRange, @NotNull BoolPtr stop);
    }

    /**
     * When YES, enables internal security analysis for malicious inputs and activates defensive behaviors. By enabling
     * this functionality, it's possible certain text such as a very long paragraph might result in unexpected layout.
     * NO by default.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("limitsLayoutForSuspiciousContents")
    public native boolean limitsLayoutForSuspiciousContents();

    /**
     * When YES, enables internal security analysis for malicious inputs and activates defensive behaviors. By enabling
     * this functionality, it's possible certain text such as a very long paragraph might result in unexpected layout.
     * NO by default.
     * 
     * API-Since: 12.0
     */
    @Generated
    @Selector("setLimitsLayoutForSuspiciousContents:")
    public native void setLimitsLayoutForSuspiciousContents(boolean value);

    /**
     * When YES, NSLayoutManager will attempt to hyphenate when wrapping lines. May be overridden on a per-paragraph
     * basis by the NSParagraphStyle's hyphenationFactor. The receiver makes the best effort to decide the exact logic
     * including the hyphenation factor based on the context. The default value is NO. Can be overridden by the
     * preference key @"NSUsesDefaultHyphenation".
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("setUsesDefaultHyphenation:")
    public native void setUsesDefaultHyphenation(boolean value);

    /**
     * This is the glyph rendering primitive method. Renders glyphs at positions into the CGContext. The positions are
     * in the user space coordinate system. CGContext that is passed in is already configured according to the text
     * attributes arguments: font, textMatrix, and attributes. The font argument represents the font applied to the
     * graphics state. The value can be different from the NSFontAttributeName value in the attributes argument because
     * of various font substitutions that the system automatically executes. The textMatrix is the affine transform
     * mapping the text space coordinate system to the user space coordinate system. The tx and ty components of
     * textMatrix are ignored since Quartz overrides them with the glyph positions.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("showCGGlyphs:positions:count:font:textMatrix:attributes:inContext:")
    public native void showCGGlyphsPositionsCountFontTextMatrixAttributesInContext(@NotNull ConstCharPtr glyphs,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions,
            @NInt long glyphCount, @NotNull UIFont font, @ByValue CGAffineTransform textMatrix,
            @NotNull NSDictionary<String, ?> attributes, @NotNull CGContextRef CGContext);

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * When YES, NSLayoutManager will attempt to hyphenate when wrapping lines. May be overridden on a per-paragraph
     * basis by the NSParagraphStyle's hyphenationFactor. The receiver makes the best effort to decide the exact logic
     * including the hyphenation factor based on the context. The default value is NO. Can be overridden by the
     * preference key @"NSUsesDefaultHyphenation".
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("usesDefaultHyphenation")
    public native boolean usesDefaultHyphenation();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
