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

package apple.coretext.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFAttributedStringRef;
import apple.corefoundation.opaque.CFCharacterSetRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFErrorRef;
import apple.corefoundation.opaque.CFNumberRef;
import apple.corefoundation.opaque.CFSetRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.corefoundation.struct.CFRange;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGFontRef;
import apple.coregraphics.opaque.CGPathRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coretext.opaque.CTFontCollectionRef;
import apple.coretext.opaque.CTFontDescriptorRef;
import apple.coretext.opaque.CTFontRef;
import apple.coretext.opaque.CTFrameRef;
import apple.coretext.opaque.CTFramesetterRef;
import apple.coretext.opaque.CTGlyphInfoRef;
import apple.coretext.opaque.CTLineRef;
import apple.coretext.opaque.CTParagraphStyleRef;
import apple.coretext.opaque.CTRubyAnnotationRef;
import apple.coretext.opaque.CTRunDelegateRef;
import apple.coretext.opaque.CTRunRef;
import apple.coretext.opaque.CTTextTabRef;
import apple.coretext.opaque.CTTypesetterRef;
import apple.coretext.struct.CTParagraphStyleSetting;
import apple.coretext.struct.CTRunDelegateCallbacks;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BoolPtr;
import org.moe.natj.general.ptr.CharPtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNIntPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("CoreText")
@Runtime(CRuntime.class)
public final class CoreText {
    static {
        NatJ.register();
    }

    @Generated
    private CoreText() {
    }

    @Generated
    @CFunction
    @NUInt
    public static native long CTParagraphStyleGetTypeID();

    @Generated
    @CFunction
    public static native CTParagraphStyleRef CTParagraphStyleCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") CTParagraphStyleSetting settings,
            @NUInt long settingCount);

    @Generated
    @CFunction
    public static native CTParagraphStyleRef CTParagraphStyleCreateCopy(CTParagraphStyleRef paragraphStyle);

    @Generated
    @CFunction
    public static native boolean CTParagraphStyleGetValueForSpecifier(CTParagraphStyleRef paragraphStyle, int spec,
            @NUInt long valueBufferSize, VoidPtr valueBuffer);

    @Generated
    @CFunction
    @NUInt
    public static native long CTFontDescriptorGetTypeID();

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateWithNameAndSize(CFStringRef name,
            @NFloat double size);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateWithAttributes(CFDictionaryRef attributes);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithAttributes(CTFontDescriptorRef original,
            CFDictionaryRef attributes);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFamily(CTFontDescriptorRef original,
            CFStringRef family);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithSymbolicTraits(CTFontDescriptorRef original,
            int symTraitValue, int symTraitMask);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithVariation(CTFontDescriptorRef original,
            CFNumberRef variationIdentifier, @NFloat double variationValue);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateCopyWithFeature(CTFontDescriptorRef original,
            CFNumberRef featureTypeIdentifier, CFNumberRef featureSelectorIdentifier);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontDescriptorCreateMatchingFontDescriptors(CTFontDescriptorRef descriptor,
            CFSetRef mandatoryAttributes);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontDescriptorCreateMatchingFontDescriptor(
            CTFontDescriptorRef descriptor, CFSetRef mandatoryAttributes);

    @Generated
    @CFunction
    public static native boolean CTFontDescriptorMatchFontDescriptorsWithProgressHandler(CFArrayRef descriptors,
            CFSetRef mandatoryAttributes,
            @ObjCBlock(name = "call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler") Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler progressBlock);

    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontDescriptorCopyAttributes(CTFontDescriptorRef descriptor);

    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontDescriptorCopyAttribute(CTFontDescriptorRef descriptor,
            CFStringRef attribute);

    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontDescriptorCopyLocalizedAttribute(CTFontDescriptorRef descriptor,
            CFStringRef attribute, Ptr<CFStringRef> language);

    @Generated
    @CFunction
    @NUInt
    public static native long CTFontGetTypeID();

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithName(CFStringRef name, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithFontDescriptor(CTFontDescriptorRef descriptor, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithNameAndOptions(CFStringRef name, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NUInt long options);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithFontDescriptorAndOptions(CTFontDescriptorRef descriptor,
            @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NUInt long options);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateUIFontForLanguage(int uiType, @NFloat double size, CFStringRef language);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithAttributes(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CTFontDescriptorRef attributes);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithSymbolicTraits(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            int symTraitValue, int symTraitMask);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateCopyWithFamily(CTFontRef font, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CFStringRef family);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateForString(CTFontRef currentFont, CFStringRef string,
            @ByValue CFRange range);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontCopyFontDescriptor(CTFontRef font);

    @Generated
    @CFunction
    public static native ConstVoidPtr CTFontCopyAttribute(CTFontRef font, CFStringRef attribute);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetSize(CTFontRef font);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CTFontGetMatrix(CTFontRef font);

    @Generated
    @CFunction
    public static native int CTFontGetSymbolicTraits(CTFontRef font);

    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontCopyTraits(CTFontRef font);

    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyPostScriptName(CTFontRef font);

    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyFamilyName(CTFontRef font);

    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyFullName(CTFontRef font);

    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyDisplayName(CTFontRef font);

    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyName(CTFontRef font, CFStringRef nameKey);

    @Generated
    @CFunction
    public static native CFStringRef CTFontCopyLocalizedName(CTFontRef font, CFStringRef nameKey,
            Ptr<CFStringRef> actualLanguage);

    @Generated
    @CFunction
    public static native CFCharacterSetRef CTFontCopyCharacterSet(CTFontRef font);

    @Generated
    @CFunction
    public static native int CTFontGetStringEncoding(CTFontRef font);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopySupportedLanguages(CTFontRef font);

    @Generated
    @CFunction
    public static native boolean CTFontGetGlyphsForCharacters(CTFontRef font, ConstCharPtr characters, CharPtr glyphs,
            @NInt long count);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetAscent(CTFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetDescent(CTFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetLeading(CTFontRef font);

    @Generated
    @CFunction
    public static native int CTFontGetUnitsPerEm(CTFontRef font);

    @Generated
    @CFunction
    @NInt
    public static native long CTFontGetGlyphCount(CTFontRef font);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetBoundingBox(CTFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetUnderlinePosition(CTFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetUnderlineThickness(CTFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetSlantAngle(CTFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetCapHeight(CTFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CTFontGetXHeight(CTFontRef font);

    @Generated
    @CFunction
    public static native char CTFontGetGlyphWithName(CTFontRef font, CFStringRef glyphName);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetBoundingRectsForGlyphs(CTFontRef font, int orientation, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects, @NInt long count);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTFontGetOpticalBoundsForGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect boundingRects, @NInt long count,
            @NUInt long options);

    @Generated
    @CFunction
    public static native double CTFontGetAdvancesForGlyphs(CTFontRef font, int orientation, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize advances, @NInt long count);

    @Generated
    @CFunction
    public static native void CTFontGetVerticalTranslationsForGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize translations, @NInt long count);

    @Generated
    @CFunction
    public static native CGPathRef CTFontCreatePathForGlyph(CTFontRef font, char glyph,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyVariationAxes(CTFontRef font);

    @Generated
    @CFunction
    public static native CFDictionaryRef CTFontCopyVariation(CTFontRef font);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyFeatures(CTFontRef font);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyFeatureSettings(CTFontRef font);

    @Generated
    @CFunction
    public static native CGFontRef CTFontCopyGraphicsFont(CTFontRef font, Ptr<CTFontDescriptorRef> attributes);

    @Generated
    @CFunction
    public static native CTFontRef CTFontCreateWithGraphicsFont(CGFontRef graphicsFont, @NFloat double size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            CTFontDescriptorRef attributes);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyAvailableTables(CTFontRef font, int options);

    @Generated
    @CFunction
    public static native CFDataRef CTFontCopyTable(CTFontRef font, int table, int options);

    @Generated
    @CFunction
    public static native void CTFontDrawGlyphs(CTFontRef font, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint positions, @NUInt long count,
            CGContextRef context);

    @Generated
    @CFunction
    @NInt
    public static native long CTFontGetLigatureCaretPositions(CTFontRef font, char glyph, NFloatPtr positions,
            @NInt long maxPositions);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCopyDefaultCascadeListForLanguages(CTFontRef font,
            CFArrayRef languagePrefList);

    @Generated
    @CFunction
    @NUInt
    public static native long CTFontCollectionGetTypeID();

    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateFromAvailableFonts(CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateWithFontDescriptors(CFArrayRef queryDescriptors,
            CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CTFontCollectionRef CTFontCollectionCreateCopyWithFontDescriptors(CTFontCollectionRef original,
            CFArrayRef queryDescriptors, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptors(CTFontCollectionRef collection);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(
            CTFontCollectionRef collection,
            @FunctionPtr(name = "call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback") Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback sortCallback,
            VoidPtr refCon);

    @Generated
    @CFunction
    public static native CFArrayRef CTFontManagerCreateFontDescriptorsFromURL(CFURLRef fileURL);

    @Generated
    @CFunction
    public static native CTFontDescriptorRef CTFontManagerCreateFontDescriptorFromData(CFDataRef data);

    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterFontsForURL(CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterFontsForURL(CFURLRef fontURL, int scope, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterGraphicsFont(CGFontRef font, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterGraphicsFont(CGFontRef font, Ptr<CFErrorRef> error);

    @Generated
    @CFunction
    public static native boolean CTFontManagerRegisterFontsForURLs(CFArrayRef fontURLs, int scope,
            Ptr<CFArrayRef> errors);

    @Generated
    @CFunction
    public static native boolean CTFontManagerUnregisterFontsForURLs(CFArrayRef fontURLs, int scope,
            Ptr<CFArrayRef> errors);

    @Generated
    @CFunction
    @NUInt
    public static native long CTFrameGetTypeID();

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTFrameGetStringRange(CTFrameRef frame);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTFrameGetVisibleStringRange(CTFrameRef frame);

    @Generated
    @CFunction
    public static native CGPathRef CTFrameGetPath(CTFrameRef frame);

    @Generated
    @CFunction
    public static native CFDictionaryRef CTFrameGetFrameAttributes(CTFrameRef frame);

    @Generated
    @CFunction
    public static native CFArrayRef CTFrameGetLines(CTFrameRef frame);

    @Generated
    @CFunction
    public static native void CTFrameGetLineOrigins(CTFrameRef frame, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint origins);

    @Generated
    @CFunction
    public static native void CTFrameDraw(CTFrameRef frame, CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CTLineGetTypeID();

    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateWithAttributedString(CFAttributedStringRef attrString);

    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateTruncatedLine(CTLineRef line, double width, int truncationType,
            CTLineRef truncationToken);

    @Generated
    @CFunction
    public static native CTLineRef CTLineCreateJustifiedLine(CTLineRef line, @NFloat double justificationFactor,
            double justificationWidth);

    @Generated
    @CFunction
    @NInt
    public static native long CTLineGetGlyphCount(CTLineRef line);

    @Generated
    @CFunction
    public static native CFArrayRef CTLineGetGlyphRuns(CTLineRef line);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTLineGetStringRange(CTLineRef line);

    @Generated
    @CFunction
    public static native double CTLineGetPenOffsetForFlush(CTLineRef line, @NFloat double flushFactor,
            double flushWidth);

    @Generated
    @CFunction
    public static native void CTLineDraw(CTLineRef line, CGContextRef context);

    @Generated
    @CFunction
    public static native double CTLineGetTypographicBounds(CTLineRef line, NFloatPtr ascent, NFloatPtr descent,
            NFloatPtr leading);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTLineGetBoundsWithOptions(CTLineRef line, @NUInt long options);

    @Generated
    @CFunction
    public static native double CTLineGetTrailingWhitespaceWidth(CTLineRef line);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTLineGetImageBounds(CTLineRef line, CGContextRef context);

    @Generated
    @CFunction
    @NInt
    public static native long CTLineGetStringIndexForPosition(CTLineRef line, @ByValue CGPoint position);

    @Generated
    @CFunction
    @NFloat
    public static native double CTLineGetOffsetForStringIndex(CTLineRef line, @NInt long charIndex,
            NFloatPtr secondaryOffset);

    @Generated
    @CFunction
    @NUInt
    public static native long CTTypesetterGetTypeID();

    @Generated
    @CFunction
    public static native CTTypesetterRef CTTypesetterCreateWithAttributedString(CFAttributedStringRef string);

    @Generated
    @CFunction
    public static native CTTypesetterRef CTTypesetterCreateWithAttributedStringAndOptions(CFAttributedStringRef string,
            CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CTLineRef CTTypesetterCreateLineWithOffset(CTTypesetterRef typesetter,
            @ByValue CFRange stringRange, double offset);

    @Generated
    @CFunction
    public static native CTLineRef CTTypesetterCreateLine(CTTypesetterRef typesetter, @ByValue CFRange stringRange);

    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestLineBreakWithOffset(CTTypesetterRef typesetter, @NInt long startIndex,
            double width, double offset);

    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestLineBreak(CTTypesetterRef typesetter, @NInt long startIndex,
            double width);

    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestClusterBreakWithOffset(CTTypesetterRef typesetter,
            @NInt long startIndex, double width, double offset);

    @Generated
    @CFunction
    @NInt
    public static native long CTTypesetterSuggestClusterBreak(CTTypesetterRef typesetter, @NInt long startIndex,
            double width);

    @Generated
    @CFunction
    @NUInt
    public static native long CTFramesetterGetTypeID();

    @Generated
    @CFunction
    public static native CTFramesetterRef CTFramesetterCreateWithAttributedString(CFAttributedStringRef string);

    @Generated
    @CFunction
    public static native CTFrameRef CTFramesetterCreateFrame(CTFramesetterRef framesetter, @ByValue CFRange stringRange,
            CGPathRef path, CFDictionaryRef frameAttributes);

    @Generated
    @CFunction
    public static native CTTypesetterRef CTFramesetterGetTypesetter(CTFramesetterRef framesetter);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize CTFramesetterSuggestFrameSizeWithConstraints(CTFramesetterRef framesetter,
            @ByValue CFRange stringRange, CFDictionaryRef frameAttributes, @ByValue CGSize constraints,
            @UncertainArgument("Options: reference, array Fallback: reference") CFRange fitRange);

    @Generated
    @CFunction
    @NUInt
    public static native long CTGlyphInfoGetTypeID();

    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyphName(CFStringRef glyphName, CTFontRef font,
            CFStringRef baseString);

    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithGlyph(char glyph, CTFontRef font, CFStringRef baseString);

    @Generated
    @CFunction
    public static native CTGlyphInfoRef CTGlyphInfoCreateWithCharacterIdentifier(char cid, short collection,
            CFStringRef baseString);

    @Generated
    @CFunction
    public static native CFStringRef CTGlyphInfoGetGlyphName(CTGlyphInfoRef glyphInfo);

    @Generated
    @CFunction
    public static native char CTGlyphInfoGetCharacterIdentifier(CTGlyphInfoRef glyphInfo);

    @Generated
    @CFunction
    public static native short CTGlyphInfoGetCharacterCollection(CTGlyphInfoRef glyphInfo);

    @Generated
    @CFunction
    @NUInt
    public static native long CTRubyAnnotationGetTypeID();

    @Generated
    @CFunction
    public static native CTRubyAnnotationRef CTRubyAnnotationCreateCopy(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    public static native byte CTRubyAnnotationGetAlignment(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    public static native byte CTRubyAnnotationGetOverhang(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    @NFloat
    public static native double CTRubyAnnotationGetSizeFactor(CTRubyAnnotationRef rubyAnnotation);

    @Generated
    @CFunction
    public static native CFStringRef CTRubyAnnotationGetTextForPosition(CTRubyAnnotationRef rubyAnnotation,
            byte position);

    @Generated
    @CFunction
    @NUInt
    public static native long CTRunGetTypeID();

    @Generated
    @CFunction
    @NInt
    public static native long CTRunGetGlyphCount(CTRunRef run);

    @Generated
    @CFunction
    public static native CFDictionaryRef CTRunGetAttributes(CTRunRef run);

    @Generated
    @CFunction
    public static native int CTRunGetStatus(CTRunRef run);

    @Generated
    @CFunction
    public static native ConstCharPtr CTRunGetGlyphsPtr(CTRunRef run);

    @Generated
    @CFunction
    public static native void CTRunGetGlyphs(CTRunRef run, @ByValue CFRange range, CharPtr buffer);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CGPoint CTRunGetPositionsPtr(CTRunRef run);

    @Generated
    @CFunction
    public static native void CTRunGetPositions(CTRunRef run, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint buffer);

    @Generated
    @CFunction
    @UncertainReturn("Options: reference, array Fallback: reference")
    public static native CGSize CTRunGetAdvancesPtr(CTRunRef run);

    @Generated
    @CFunction
    public static native void CTRunGetAdvances(CTRunRef run, @ByValue CFRange range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize buffer);

    @Generated
    @CFunction
    public static native ConstNIntPtr CTRunGetStringIndicesPtr(CTRunRef run);

    @Generated
    @CFunction
    public static native void CTRunGetStringIndices(CTRunRef run, @ByValue CFRange range, NIntPtr buffer);

    @Generated
    @CFunction
    @ByValue
    public static native CFRange CTRunGetStringRange(CTRunRef run);

    @Generated
    @CFunction
    public static native double CTRunGetTypographicBounds(CTRunRef run, @ByValue CFRange range, NFloatPtr ascent,
            NFloatPtr descent, NFloatPtr leading);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CTRunGetImageBounds(CTRunRef run, CGContextRef context, @ByValue CFRange range);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CTRunGetTextMatrix(CTRunRef run);

    @Generated
    @CFunction
    public static native void CTRunDraw(CTRunRef run, CGContextRef context, @ByValue CFRange range);

    @Generated
    @CFunction
    @NUInt
    public static native long CTRunDelegateGetTypeID();

    @Generated
    @CFunction
    public static native CTRunDelegateRef CTRunDelegateCreate(
            @UncertainArgument("Options: reference, array Fallback: reference") CTRunDelegateCallbacks callbacks,
            VoidPtr refCon);

    @Generated
    @CFunction
    public static native VoidPtr CTRunDelegateGetRefCon(CTRunDelegateRef runDelegate);

    @Generated
    @CFunction
    @NUInt
    public static native long CTTextTabGetTypeID();

    @Generated
    @CFunction
    public static native CTTextTabRef CTTextTabCreate(byte alignment, double location, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native byte CTTextTabGetAlignment(CTTextTabRef tab);

    @Generated
    @CFunction
    public static native double CTTextTabGetLocation(CTTextTabRef tab);

    @Generated
    @CFunction
    public static native CFDictionaryRef CTTextTabGetOptions(CTTextTabRef tab);

    @Generated
    @CFunction
    public static native int CTGetCoreTextVersion();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSymbolicTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontWeightTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontWidthTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSlantTrait();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontURLAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDisplayNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFamilyNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontStyleNameAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontTraitsAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSizeAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontMatrixAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCascadeListAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCharacterSetAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLanguagesAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontBaselineAdjustAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontMacintoshEncodingsAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeaturesAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSettingsAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFixedAdvanceAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOrientationAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFormatAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontRegistrationScopeAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPriorityAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontEnabledAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDownloadableAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDownloadedAttribute();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingSourceDescriptor();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingDescriptors();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingResult();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingPercentage();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingCurrentAssetSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingTotalDownloadedSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingTotalAssetSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptorMatchingError();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCopyrightNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFamilyNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSubFamilyNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontStyleNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontUniqueNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFullNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVersionNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPostScriptNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontTrademarkNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManufacturerNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDesignerNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDescriptionNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVendorURLNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontDesignerURLNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLicenseNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontLicenseURLNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontSampleTextNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontPostScriptCIDNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisMinimumValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisMaximumValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisDefaultValueKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontVariationAxisNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOpenTypeFeatureTag();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontOpenTypeFeatureValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeExclusiveKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureTypeSelectorsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorIdentifierKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorNameKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorDefaultKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontFeatureSelectorSettingKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassRoman();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicCentered();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicLow();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassIdeographicHigh();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassHanging();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassMath();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineReferenceFont();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineOriginalFont();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontCollectionRemoveDuplicatesOption();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorDomain();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerErrorFontURLsKey();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontManagerRegisteredFontsChangedNotification();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFrameProgressionAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathFillRuleAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathWidthAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFrameClippingPathsAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFramePathClippingPathAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTTypesetterOptionDisableBidiProcessing();

    @Generated
    @CVariable()
    public static native CFStringRef kCTTypesetterOptionForcedEmbeddingLevel();

    @Generated
    @CVariable()
    public static native CFStringRef kCTFontAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTForegroundColorFromContextAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTKernAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTLigatureAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTForegroundColorAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTParagraphStyleAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTStrokeWidthAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTStrokeColorAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTUnderlineStyleAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTSuperscriptAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTUnderlineColorAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTVerticalFormsAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTGlyphInfoAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTCharacterShapeAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTLanguageAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTRunDelegateAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineClassAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineInfoAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTBaselineReferenceInfoAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTWritingDirectionAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTRubyAnnotationAttributeName();

    @Generated
    @CVariable()
    public static native CFStringRef kCTTabColumnTerminatorsAttributeName();

    @Generated
    @CFunction
    public static native void CTLineEnumerateCaretOffsets(CTLineRef line,
            @ObjCBlock(name = "call_CTLineEnumerateCaretOffsets") Block_CTLineEnumerateCaretOffsets block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTFontDescriptorMatchFontDescriptorsWithProgressHandler {
        @Generated
        boolean call_CTFontDescriptorMatchFontDescriptorsWithProgressHandler(int arg0, CFDictionaryRef arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback {
        @Generated
        @NInt
        long call_CTFontCollectionCreateMatchingFontDescriptorsSortedWithCallback(VoidPtr arg0, VoidPtr arg1,
                VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CTLineEnumerateCaretOffsets {
        @Generated
        void call_CTLineEnumerateCaretOffsets(double arg0, @NInt long arg1, boolean arg2, BoolPtr arg3);
    }
}
