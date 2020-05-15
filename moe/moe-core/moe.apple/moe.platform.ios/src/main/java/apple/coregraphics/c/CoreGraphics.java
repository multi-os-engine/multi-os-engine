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

package apple.coregraphics.c;

import apple.corefoundation.opaque.CFArrayRef;
import apple.corefoundation.opaque.CFDataRef;
import apple.corefoundation.opaque.CFDateRef;
import apple.corefoundation.opaque.CFDictionaryRef;
import apple.corefoundation.opaque.CFMutableDataRef;
import apple.corefoundation.opaque.CFStringRef;
import apple.corefoundation.opaque.CFURLRef;
import apple.coregraphics.opaque.CGColorConversionInfoRef;
import apple.coregraphics.opaque.CGColorRef;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.CGContextRef;
import apple.coregraphics.opaque.CGDataConsumerRef;
import apple.coregraphics.opaque.CGDataProviderRef;
import apple.coregraphics.opaque.CGFontRef;
import apple.coregraphics.opaque.CGFunctionRef;
import apple.coregraphics.opaque.CGGradientRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.opaque.CGLayerRef;
import apple.coregraphics.opaque.CGMutablePathRef;
import apple.coregraphics.opaque.CGPDFArrayRef;
import apple.coregraphics.opaque.CGPDFContentStreamRef;
import apple.coregraphics.opaque.CGPDFDictionaryRef;
import apple.coregraphics.opaque.CGPDFDocumentRef;
import apple.coregraphics.opaque.CGPDFObjectRef;
import apple.coregraphics.opaque.CGPDFOperatorTableRef;
import apple.coregraphics.opaque.CGPDFPageRef;
import apple.coregraphics.opaque.CGPDFScannerRef;
import apple.coregraphics.opaque.CGPDFStreamRef;
import apple.coregraphics.opaque.CGPDFStringRef;
import apple.coregraphics.opaque.CGPathRef;
import apple.coregraphics.opaque.CGPatternRef;
import apple.coregraphics.opaque.CGShadingRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGDataConsumerCallbacks;
import apple.coregraphics.struct.CGDataProviderDirectCallbacks;
import apple.coregraphics.struct.CGDataProviderSequentialCallbacks;
import apple.coregraphics.struct.CGFunctionCallbacks;
import apple.coregraphics.struct.CGPathElement;
import apple.coregraphics.struct.CGPatternCallbacks;
import apple.coregraphics.struct.CGPoint;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.coregraphics.struct.CGVector;
import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.c.ann.Inline;
import org.moe.natj.c.ann.Variadic;
import org.moe.natj.c.map.CStringArrayMapper;
import org.moe.natj.c.map.CStringMapper;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ann.UncertainArgument;
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.BytePtr;
import org.moe.natj.general.ptr.ConstCharPtr;
import org.moe.natj.general.ptr.ConstNFloatPtr;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.IntPtr;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.NIntPtr;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ann.ObjCBlock;

@Generated
@Library("CoreGraphics")
@Runtime(CRuntime.class)
public final class CoreGraphics {
    @Generated public static final char kCGFontIndexMax = 0xFFFE;
    @Generated public static final char kCGFontIndexInvalid = 0xFFFF;
    @Generated public static final char kCGGlyphMax = 0xFFFE;

    static {
        NatJ.register();
    }

    @Generated
    private CoreGraphics() {
    }

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGPoint CGPointMake(@NFloat double x, @NFloat double y);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGSize CGSizeMake(@NFloat double width, @NFloat double height);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGVector CGVectorMake(@NFloat double dx, @NFloat double dy);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGRect CGRectMake(@NFloat double x, @NFloat double y, @NFloat double width,
            @NFloat double height);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMinX(@ByValue CGRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMidX(@ByValue CGRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMaxX(@ByValue CGRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMinY(@ByValue CGRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMidY(@ByValue CGRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMaxY(@ByValue CGRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetWidth(@ByValue CGRect rect);

    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetHeight(@ByValue CGRect rect);

    @Generated
    @CFunction
    public static native boolean CGPointEqualToPoint(@ByValue CGPoint point1, @ByValue CGPoint point2);

    @Generated
    @CFunction
    public static native boolean CGSizeEqualToSize(@ByValue CGSize size1, @ByValue CGSize size2);

    @Generated
    @CFunction
    public static native boolean CGRectEqualToRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectStandardize(@ByValue CGRect rect);

    @Generated
    @CFunction
    public static native boolean CGRectIsEmpty(@ByValue CGRect rect);

    @Generated
    @CFunction
    public static native boolean CGRectIsNull(@ByValue CGRect rect);

    @Generated
    @CFunction
    public static native boolean CGRectIsInfinite(@ByValue CGRect rect);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectInset(@ByValue CGRect rect, @NFloat double dx, @NFloat double dy);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectIntegral(@ByValue CGRect rect);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectUnion(@ByValue CGRect r1, @ByValue CGRect r2);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectIntersection(@ByValue CGRect r1, @ByValue CGRect r2);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectOffset(@ByValue CGRect rect, @NFloat double dx, @NFloat double dy);

    @Generated
    @CFunction
    public static native void CGRectDivide(@ByValue CGRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect slice,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect remainder, @NFloat double amount,
            int edge);

    @Generated
    @CFunction
    public static native boolean CGRectContainsPoint(@ByValue CGRect rect, @ByValue CGPoint point);

    @Generated
    @CFunction
    public static native boolean CGRectContainsRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    @Generated
    @CFunction
    public static native boolean CGRectIntersectsRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    @Generated
    @CFunction
    public static native CFDictionaryRef CGPointCreateDictionaryRepresentation(@ByValue CGPoint point);

    @Generated
    @CFunction
    public static native boolean CGPointMakeWithDictionaryRepresentation(CFDictionaryRef dict,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint point);

    @Generated
    @CFunction
    public static native CFDictionaryRef CGSizeCreateDictionaryRepresentation(@ByValue CGSize size);

    @Generated
    @CFunction
    public static native boolean CGSizeMakeWithDictionaryRepresentation(CFDictionaryRef dict,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize size);

    @Generated
    @CFunction
    public static native CFDictionaryRef CGRectCreateDictionaryRepresentation(@ByValue CGRect arg1);

    @Generated
    @CFunction
    public static native boolean CGRectMakeWithDictionaryRepresentation(CFDictionaryRef dict,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rect);

    @Generated
    @Inline
    @CFunction
    public static native boolean __CGPointEqualToPoint(@ByValue CGPoint point1, @ByValue CGPoint point2);

    @Generated
    @Inline
    @CFunction
    public static native boolean __CGSizeEqualToSize(@ByValue CGSize size1, @ByValue CGSize size2);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMake(@NFloat double a, @NFloat double b, @NFloat double c,
            @NFloat double d, @NFloat double tx, @NFloat double ty);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeTranslation(@NFloat double tx, @NFloat double ty);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeScale(@NFloat double sx, @NFloat double sy);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeRotation(@NFloat double angle);

    @Generated
    @CFunction
    public static native boolean CGAffineTransformIsIdentity(@ByValue CGAffineTransform t);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformTranslate(@ByValue CGAffineTransform t, @NFloat double tx,
            @NFloat double ty);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformScale(@ByValue CGAffineTransform t, @NFloat double sx,
            @NFloat double sy);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformRotate(@ByValue CGAffineTransform t, @NFloat double angle);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformInvert(@ByValue CGAffineTransform t);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformConcat(@ByValue CGAffineTransform t1,
            @ByValue CGAffineTransform t2);

    @Generated
    @CFunction
    public static native boolean CGAffineTransformEqualToTransform(@ByValue CGAffineTransform t1,
            @ByValue CGAffineTransform t2);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGPointApplyAffineTransform(@ByValue CGPoint point, @ByValue CGAffineTransform t);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGSizeApplyAffineTransform(@ByValue CGSize size, @ByValue CGAffineTransform t);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectApplyAffineTransform(@ByValue CGRect rect, @ByValue CGAffineTransform t);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGAffineTransform __CGAffineTransformMake(@NFloat double a, @NFloat double b, @NFloat double c,
            @NFloat double d, @NFloat double tx, @NFloat double ty);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGPoint __CGPointApplyAffineTransform(@ByValue CGPoint point, @ByValue CGAffineTransform t);

    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGSize __CGSizeApplyAffineTransform(@ByValue CGSize size, @ByValue CGAffineTransform t);

    @Generated
    @CFunction
    @NUInt
    public static native long CGDataProviderGetTypeID();

    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateSequential(VoidPtr info,
            @UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderSequentialCallbacks callbacks);

    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateDirect(VoidPtr info, long size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderDirectCallbacks callbacks);

    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithData(VoidPtr info, ConstVoidPtr data,
            @NUInt long size,
            @FunctionPtr(name = "call_CGDataProviderCreateWithData") Function_CGDataProviderCreateWithData releaseData);

    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithCFData(CFDataRef data);

    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithURL(CFURLRef url);

    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithFilename(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String filename);

    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderRetain(CGDataProviderRef provider);

    @Generated
    @CFunction
    public static native void CGDataProviderRelease(CGDataProviderRef provider);

    @Generated
    @CFunction
    public static native CFDataRef CGDataProviderCopyData(CGDataProviderRef provider);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceGray();

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceRGB();

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceCMYK();

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithICCProfile(CFDataRef data);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateICCBased(@NUInt long nComponents, ConstNFloatPtr range,
            CGDataProviderRef profile, CGColorSpaceRef alternate);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateIndexed(CGColorSpaceRef baseSpace, @NUInt long lastIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String colorTable);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreatePattern(CGColorSpaceRef baseSpace);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithPlatformColorSpace(ConstVoidPtr ref);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithName(CFStringRef name);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceRetain(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native void CGColorSpaceRelease(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native CFStringRef CGColorSpaceCopyName(CGColorSpaceRef space);

    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetNumberOfComponents(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native int CGColorSpaceGetModel(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceGetBaseColorSpace(CGColorSpaceRef space);

    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetColorTableCount(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native void CGColorSpaceGetColorTable(CGColorSpaceRef space, BytePtr table);

    @Generated
    @CFunction
    public static native CFDataRef CGColorSpaceCopyICCProfile(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native CFDataRef CGColorSpaceCopyICCData(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native boolean CGColorSpaceIsWideGamutRGB(CGColorSpaceRef arg1);

    @Generated
    @CFunction
    public static native boolean CGColorSpaceSupportsOutput(CGColorSpaceRef space);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPatternGetTypeID();

    @Generated
    @CFunction
    public static native CGPatternRef CGPatternCreate(VoidPtr info, @ByValue CGRect bounds,
            @ByValue CGAffineTransform matrix, @NFloat double xStep, @NFloat double yStep, int tiling,
            boolean isColored,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPatternCallbacks callbacks);

    @Generated
    @CFunction
    public static native CGPatternRef CGPatternRetain(CGPatternRef pattern);

    @Generated
    @CFunction
    public static native void CGPatternRelease(CGPatternRef pattern);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreate(CGColorSpaceRef space, ConstNFloatPtr components);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateWithPattern(CGColorSpaceRef space, CGPatternRef pattern,
            ConstNFloatPtr components);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopy(CGColorRef color);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopyWithAlpha(CGColorRef color, @NFloat double alpha);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopyByMatchingToColorSpace(CGColorSpaceRef arg1, int intent,
            CGColorRef color, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CGColorRef CGColorRetain(CGColorRef color);

    @Generated
    @CFunction
    public static native void CGColorRelease(CGColorRef color);

    @Generated
    @CFunction
    public static native boolean CGColorEqualToColor(CGColorRef color1, CGColorRef color2);

    @Generated
    @CFunction
    @NUInt
    public static native long CGColorGetNumberOfComponents(CGColorRef color);

    @Generated
    @CFunction
    public static native ConstNFloatPtr CGColorGetComponents(CGColorRef color);

    @Generated
    @CFunction
    @NFloat
    public static native double CGColorGetAlpha(CGColorRef color);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorGetColorSpace(CGColorRef color);

    @Generated
    @CFunction
    public static native CGPatternRef CGColorGetPattern(CGColorRef color);

    @Generated
    @CFunction
    @NUInt
    public static native long CGColorGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CGFontGetTypeID();

    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateWithDataProvider(CGDataProviderRef provider);

    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateWithFontName(CFStringRef name);

    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateCopyWithVariations(CGFontRef font, CFDictionaryRef variations);

    @Generated
    @CFunction
    public static native CGFontRef CGFontRetain(CGFontRef font);

    @Generated
    @CFunction
    public static native void CGFontRelease(CGFontRef font);

    @Generated
    @CFunction
    @NUInt
    public static native long CGFontGetNumberOfGlyphs(CGFontRef font);

    @Generated
    @CFunction
    public static native int CGFontGetUnitsPerEm(CGFontRef font);

    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyPostScriptName(CGFontRef font);

    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyFullName(CGFontRef font);

    @Generated
    @CFunction
    public static native int CGFontGetAscent(CGFontRef font);

    @Generated
    @CFunction
    public static native int CGFontGetDescent(CGFontRef font);

    @Generated
    @CFunction
    public static native int CGFontGetLeading(CGFontRef font);

    @Generated
    @CFunction
    public static native int CGFontGetCapHeight(CGFontRef font);

    @Generated
    @CFunction
    public static native int CGFontGetXHeight(CGFontRef font);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGFontGetFontBBox(CGFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CGFontGetItalicAngle(CGFontRef font);

    @Generated
    @CFunction
    @NFloat
    public static native double CGFontGetStemV(CGFontRef font);

    @Generated
    @CFunction
    public static native CFArrayRef CGFontCopyVariationAxes(CGFontRef font);

    @Generated
    @CFunction
    public static native CFDictionaryRef CGFontCopyVariations(CGFontRef font);

    @Generated
    @CFunction
    public static native boolean CGFontGetGlyphAdvances(CGFontRef font, ConstCharPtr glyphs, @NUInt long count,
            IntPtr advances);

    @Generated
    @CFunction
    public static native boolean CGFontGetGlyphBBoxes(CGFontRef font, ConstCharPtr glyphs, @NUInt long count,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect bboxes);

    @Generated
    @CFunction
    public static native char CGFontGetGlyphWithGlyphName(CGFontRef font, CFStringRef name);

    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyGlyphNameForGlyph(CGFontRef font, char glyph);

    @Generated
    @CFunction
    public static native boolean CGFontCanCreatePostScriptSubset(CGFontRef font, int format);

    @Generated
    @CFunction
    public static native CFArrayRef CGFontCopyTableTags(CGFontRef font);

    @Generated
    @CFunction
    public static native CFDataRef CGFontCopyTableForTag(CGFontRef font, int tag);

    @Generated
    @CFunction
    @NUInt
    public static native long CGGradientGetTypeID();

    @Generated
    @CFunction
    public static native CGGradientRef CGGradientCreateWithColorComponents(CGColorSpaceRef space,
            ConstNFloatPtr components, ConstNFloatPtr locations, @NUInt long count);

    @Generated
    @CFunction
    public static native CGGradientRef CGGradientCreateWithColors(CGColorSpaceRef space, CFArrayRef colors,
            ConstNFloatPtr locations);

    @Generated
    @CFunction
    public static native CGGradientRef CGGradientRetain(CGGradientRef gradient);

    @Generated
    @CFunction
    public static native void CGGradientRelease(CGGradientRef gradient);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetTypeID();

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreate(@NUInt long width, @NUInt long height, @NUInt long bitsPerComponent,
            @NUInt long bitsPerPixel, @NUInt long bytesPerRow, CGColorSpaceRef space, int bitmapInfo,
            CGDataProviderRef provider, ConstNFloatPtr decode, boolean shouldInterpolate, int intent);

    @Generated
    @CFunction
    public static native CGImageRef CGImageMaskCreate(@NUInt long width, @NUInt long height,
            @NUInt long bitsPerComponent, @NUInt long bitsPerPixel, @NUInt long bytesPerRow, CGDataProviderRef provider,
            ConstNFloatPtr decode, boolean shouldInterpolate);

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateCopy(CGImageRef image);

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithJPEGDataProvider(CGDataProviderRef source, ConstNFloatPtr decode,
            boolean shouldInterpolate, int intent);

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithPNGDataProvider(CGDataProviderRef source, ConstNFloatPtr decode,
            boolean shouldInterpolate, int intent);

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithImageInRect(CGImageRef image, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithMask(CGImageRef image, CGImageRef mask);

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithMaskingColors(CGImageRef image, ConstNFloatPtr components);

    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateCopyWithColorSpace(CGImageRef image, CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native CGImageRef CGImageRetain(CGImageRef image);

    @Generated
    @CFunction
    public static native void CGImageRelease(CGImageRef image);

    @Generated
    @CFunction
    public static native boolean CGImageIsMask(CGImageRef image);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetWidth(CGImageRef image);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetHeight(CGImageRef image);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBitsPerComponent(CGImageRef image);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBitsPerPixel(CGImageRef image);

    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBytesPerRow(CGImageRef image);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGImageGetColorSpace(CGImageRef image);

    @Generated
    @CFunction
    public static native int CGImageGetAlphaInfo(CGImageRef image);

    @Generated
    @CFunction
    public static native CGDataProviderRef CGImageGetDataProvider(CGImageRef image);

    @Generated
    @CFunction
    public static native ConstNFloatPtr CGImageGetDecode(CGImageRef image);

    @Generated
    @CFunction
    public static native boolean CGImageGetShouldInterpolate(CGImageRef image);

    @Generated
    @CFunction
    public static native int CGImageGetRenderingIntent(CGImageRef image);

    @Generated
    @CFunction
    public static native int CGImageGetBitmapInfo(CGImageRef image);

    @Generated
    @CFunction
    public static native CFStringRef CGImageGetUTType(CGImageRef image);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPathGetTypeID();

    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutable();

    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopy(CGPathRef path);

    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByTransformingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutableCopy(CGPathRef path);

    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutableCopyByTransformingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithRect(@ByValue CGRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithEllipseInRect(@ByValue CGRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithRoundedRect(@ByValue CGRect rect, @NFloat double cornerWidth,
            @NFloat double cornerHeight,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    @Generated
    @CFunction
    public static native void CGPathAddRoundedRect(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @ByValue CGRect rect, @NFloat double cornerWidth, @NFloat double cornerHeight);

    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByDashingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @NFloat double phase, ConstNFloatPtr lengths, @NUInt long count);

    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByStrokingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @NFloat double lineWidth, int lineCap, int lineJoin, @NFloat double miterLimit);

    @Generated
    @CFunction
    public static native CGPathRef CGPathRetain(CGPathRef path);

    @Generated
    @CFunction
    public static native void CGPathRelease(CGPathRef path);

    @Generated
    @CFunction
    public static native boolean CGPathEqualToPath(CGPathRef path1, CGPathRef path2);

    @Generated
    @CFunction
    public static native void CGPathMoveToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x,
            @NFloat double y);

    @Generated
    @CFunction
    public static native void CGPathAddLineToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x,
            @NFloat double y);

    @Generated
    @CFunction
    public static native void CGPathAddQuadCurveToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double cpx,
            @NFloat double cpy, @NFloat double x, @NFloat double y);

    @Generated
    @CFunction
    public static native void CGPathAddCurveToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double cp1x, @NFloat double cp1y, @NFloat double cp2x, @NFloat double cp2y, @NFloat double x,
            @NFloat double y);

    @Generated
    @CFunction
    public static native void CGPathCloseSubpath(CGMutablePathRef path);

    @Generated
    @CFunction
    public static native void CGPathAddRect(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGPathAddRects(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGPathAddLines(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGPathAddEllipseInRect(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGPathAddRelativeArc(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NFloat double x, @NFloat double y, @NFloat double radius, @NFloat double startAngle, @NFloat double delta);

    @Generated
    @CFunction
    public static native void CGPathAddArc(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x,
            @NFloat double y, @NFloat double radius, @NFloat double startAngle, @NFloat double endAngle,
            boolean clockwise);

    @Generated
    @CFunction
    public static native void CGPathAddArcToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x1,
            @NFloat double y1, @NFloat double x2, @NFloat double y2, @NFloat double radius);

    @Generated
    @CFunction
    public static native void CGPathAddPath(CGMutablePathRef path1,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, CGPathRef path2);

    @Generated
    @CFunction
    public static native boolean CGPathIsEmpty(CGPathRef path);

    @Generated
    @CFunction
    public static native boolean CGPathIsRect(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rect);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGPathGetCurrentPoint(CGPathRef path);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPathGetBoundingBox(CGPathRef path);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPathGetPathBoundingBox(CGPathRef path);

    @Generated
    @CFunction
    public static native boolean CGPathContainsPoint(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGPoint point, boolean eoFill);

    @Generated
    @CFunction
    public static native void CGPathApply(CGPathRef path, VoidPtr info,
            @FunctionPtr(name = "call_CGPathApply") Function_CGPathApply function);

    @Generated
    @CFunction
    public static native int CGPDFObjectGetType(CGPDFObjectRef object);

    @Generated
    @CFunction
    public static native boolean CGPDFObjectGetValue(CGPDFObjectRef object, int type, VoidPtr value);

    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFStreamGetDictionary(CGPDFStreamRef stream);

    @Generated
    @CFunction
    public static native CFDataRef CGPDFStreamCopyData(CGPDFStreamRef stream, IntPtr format);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFStringGetLength(CGPDFStringRef string);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CGPDFStringGetBytePtr(CGPDFStringRef string);

    @Generated
    @CFunction
    public static native CFStringRef CGPDFStringCopyTextString(CGPDFStringRef string);

    @Generated
    @CFunction
    public static native CFDateRef CGPDFStringCopyDate(CGPDFStringRef string);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFArrayGetCount(CGPDFArrayRef array);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetObject(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFObjectRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetNull(CGPDFArrayRef array, @NUInt long index);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetBoolean(CGPDFArrayRef array, @NUInt long index, BytePtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetInteger(CGPDFArrayRef array, @NUInt long index, NIntPtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetNumber(CGPDFArrayRef array, @NUInt long index, NFloatPtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetName(CGPDFArrayRef array, @NUInt long index,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetString(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFStringRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetArray(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFArrayRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetDictionary(CGPDFArrayRef array, @NUInt long index,
            Ptr<CGPDFDictionaryRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetStream(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFStreamRef> value);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDictionaryGetCount(CGPDFDictionaryRef dict);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetObject(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFObjectRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetBoolean(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            BytePtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetInteger(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            NIntPtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetNumber(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            NFloatPtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetName(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetString(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFStringRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetArray(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFArrayRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetDictionary(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFDictionaryRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetStream(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFStreamRef> value);

    @Generated
    @CFunction
    public static native void CGPDFDictionaryApplyFunction(CGPDFDictionaryRef dict,
            @FunctionPtr(name = "call_CGPDFDictionaryApplyFunction") Function_CGPDFDictionaryApplyFunction function,
            VoidPtr info);

    @Generated
    @CFunction
    public static native CGPDFPageRef CGPDFPageRetain(CGPDFPageRef page);

    @Generated
    @CFunction
    public static native void CGPDFPageRelease(CGPDFPageRef page);

    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFPageGetDocument(CGPDFPageRef page);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFPageGetPageNumber(CGPDFPageRef page);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPDFPageGetBoxRect(CGPDFPageRef page, int box);

    @Generated
    @CFunction
    public static native int CGPDFPageGetRotationAngle(CGPDFPageRef page);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGPDFPageGetDrawingTransform(CGPDFPageRef page, int box,
            @ByValue CGRect rect, int rotate, boolean preserveAspectRatio);

    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFPageGetDictionary(CGPDFPageRef page);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFPageGetTypeID();

    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentCreateWithProvider(CGDataProviderRef provider);

    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentCreateWithURL(CFURLRef url);

    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentRetain(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native void CGPDFDocumentRelease(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native void CGPDFDocumentGetVersion(CGPDFDocumentRef document, IntPtr majorVersion,
            IntPtr minorVersion);

    @Generated
    @CFunction
    public static native boolean CGPDFDocumentIsEncrypted(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native boolean CGPDFDocumentUnlockWithPassword(CGPDFDocumentRef document,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String password);

    @Generated
    @CFunction
    public static native boolean CGPDFDocumentIsUnlocked(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native boolean CGPDFDocumentAllowsPrinting(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native boolean CGPDFDocumentAllowsCopying(CGPDFDocumentRef document);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDocumentGetNumberOfPages(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native CGPDFPageRef CGPDFDocumentGetPage(CGPDFDocumentRef document, @NUInt long pageNumber);

    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFDocumentGetCatalog(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFDocumentGetInfo(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native CGPDFArrayRef CGPDFDocumentGetID(CGPDFDocumentRef document);

    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDocumentGetTypeID();

    @Generated
    @CFunction
    @NUInt
    public static native long CGFunctionGetTypeID();

    @Generated
    @CFunction
    public static native CGFunctionRef CGFunctionCreate(VoidPtr info, @NUInt long domainDimension,
            ConstNFloatPtr domain, @NUInt long rangeDimension, ConstNFloatPtr range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGFunctionCallbacks callbacks);

    @Generated
    @CFunction
    public static native CGFunctionRef CGFunctionRetain(CGFunctionRef function);

    @Generated
    @CFunction
    public static native void CGFunctionRelease(CGFunctionRef function);

    @Generated
    @CFunction
    @NUInt
    public static native long CGShadingGetTypeID();

    @Generated
    @CFunction
    public static native CGShadingRef CGShadingCreateAxial(CGColorSpaceRef space, @ByValue CGPoint start,
            @ByValue CGPoint end, CGFunctionRef function, boolean extendStart, boolean extendEnd);

    @Generated
    @CFunction
    public static native CGShadingRef CGShadingCreateRadial(CGColorSpaceRef space, @ByValue CGPoint start,
            @NFloat double startRadius, @ByValue CGPoint end, @NFloat double endRadius, CGFunctionRef function,
            boolean extendStart, boolean extendEnd);

    @Generated
    @CFunction
    public static native CGShadingRef CGShadingRetain(CGShadingRef shading);

    @Generated
    @CFunction
    public static native void CGShadingRelease(CGShadingRef shading);

    @Generated
    @CFunction
    @NUInt
    public static native long CGContextGetTypeID();

    @Generated
    @CFunction
    public static native void CGContextSaveGState(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextRestoreGState(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextScaleCTM(CGContextRef c, @NFloat double sx, @NFloat double sy);

    @Generated
    @CFunction
    public static native void CGContextTranslateCTM(CGContextRef c, @NFloat double tx, @NFloat double ty);

    @Generated
    @CFunction
    public static native void CGContextRotateCTM(CGContextRef c, @NFloat double angle);

    @Generated
    @CFunction
    public static native void CGContextConcatCTM(CGContextRef c, @ByValue CGAffineTransform transform);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetCTM(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextSetLineWidth(CGContextRef c, @NFloat double width);

    @Generated
    @CFunction
    public static native void CGContextSetLineCap(CGContextRef c, int cap);

    @Generated
    @CFunction
    public static native void CGContextSetLineJoin(CGContextRef c, int join);

    @Generated
    @CFunction
    public static native void CGContextSetMiterLimit(CGContextRef c, @NFloat double limit);

    @Generated
    @CFunction
    public static native void CGContextSetLineDash(CGContextRef c, @NFloat double phase, ConstNFloatPtr lengths,
            @NUInt long count);

    @Generated
    @CFunction
    public static native void CGContextSetFlatness(CGContextRef c, @NFloat double flatness);

    @Generated
    @CFunction
    public static native void CGContextSetAlpha(CGContextRef c, @NFloat double alpha);

    @Generated
    @CFunction
    public static native void CGContextSetBlendMode(CGContextRef c, int mode);

    @Generated
    @CFunction
    public static native void CGContextBeginPath(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextMoveToPoint(CGContextRef c, @NFloat double x, @NFloat double y);

    @Generated
    @CFunction
    public static native void CGContextAddLineToPoint(CGContextRef c, @NFloat double x, @NFloat double y);

    @Generated
    @CFunction
    public static native void CGContextAddCurveToPoint(CGContextRef c, @NFloat double cp1x, @NFloat double cp1y,
            @NFloat double cp2x, @NFloat double cp2y, @NFloat double x, @NFloat double y);

    @Generated
    @CFunction
    public static native void CGContextAddQuadCurveToPoint(CGContextRef c, @NFloat double cpx, @NFloat double cpy,
            @NFloat double x, @NFloat double y);

    @Generated
    @CFunction
    public static native void CGContextClosePath(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextAddRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextAddRects(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGContextAddLines(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGContextAddEllipseInRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextAddArc(CGContextRef c, @NFloat double x, @NFloat double y, @NFloat double radius,
            @NFloat double startAngle, @NFloat double endAngle, int clockwise);

    @Generated
    @CFunction
    public static native void CGContextAddArcToPoint(CGContextRef c, @NFloat double x1, @NFloat double y1,
            @NFloat double x2, @NFloat double y2, @NFloat double radius);

    @Generated
    @CFunction
    public static native void CGContextAddPath(CGContextRef c, CGPathRef path);

    @Generated
    @CFunction
    public static native void CGContextReplacePathWithStrokedPath(CGContextRef c);

    @Generated
    @CFunction
    public static native boolean CGContextIsPathEmpty(CGContextRef c);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextGetPathCurrentPoint(CGContextRef c);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextGetPathBoundingBox(CGContextRef c);

    @Generated
    @CFunction
    public static native CGPathRef CGContextCopyPath(CGContextRef c);

    @Generated
    @CFunction
    public static native boolean CGContextPathContainsPoint(CGContextRef c, @ByValue CGPoint point, int mode);

    @Generated
    @CFunction
    public static native void CGContextDrawPath(CGContextRef c, int mode);

    @Generated
    @CFunction
    public static native void CGContextFillPath(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextEOFillPath(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextStrokePath(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextFillRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextFillRects(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGContextStrokeRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextStrokeRectWithWidth(CGContextRef c, @ByValue CGRect rect, @NFloat double width);

    @Generated
    @CFunction
    public static native void CGContextClearRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextFillEllipseInRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextStrokeEllipseInRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextStrokeLineSegments(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGContextClip(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextEOClip(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextClipToMask(CGContextRef c, @ByValue CGRect rect, CGImageRef mask);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextGetClipBoundingBox(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextClipToRect(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGContextClipToRects(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGContextSetFillColorWithColor(CGContextRef c, CGColorRef color);

    @Generated
    @CFunction
    public static native void CGContextSetStrokeColorWithColor(CGContextRef c, CGColorRef color);

    @Generated
    @CFunction
    public static native void CGContextSetFillColorSpace(CGContextRef c, CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native void CGContextSetStrokeColorSpace(CGContextRef c, CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native void CGContextSetFillColor(CGContextRef c, ConstNFloatPtr components);

    @Generated
    @CFunction
    public static native void CGContextSetStrokeColor(CGContextRef c, ConstNFloatPtr components);

    @Generated
    @CFunction
    public static native void CGContextSetFillPattern(CGContextRef c, CGPatternRef pattern, ConstNFloatPtr components);

    @Generated
    @CFunction
    public static native void CGContextSetStrokePattern(CGContextRef c, CGPatternRef pattern,
            ConstNFloatPtr components);

    @Generated
    @CFunction
    public static native void CGContextSetPatternPhase(CGContextRef c, @ByValue CGSize phase);

    @Generated
    @CFunction
    public static native void CGContextSetGrayFillColor(CGContextRef c, @NFloat double gray, @NFloat double alpha);

    @Generated
    @CFunction
    public static native void CGContextSetGrayStrokeColor(CGContextRef c, @NFloat double gray, @NFloat double alpha);

    @Generated
    @CFunction
    public static native void CGContextSetRGBFillColor(CGContextRef c, @NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    @Generated
    @CFunction
    public static native void CGContextSetRGBStrokeColor(CGContextRef c, @NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    @Generated
    @CFunction
    public static native void CGContextSetCMYKFillColor(CGContextRef c, @NFloat double cyan, @NFloat double magenta,
            @NFloat double yellow, @NFloat double black, @NFloat double alpha);

    @Generated
    @CFunction
    public static native void CGContextSetCMYKStrokeColor(CGContextRef c, @NFloat double cyan, @NFloat double magenta,
            @NFloat double yellow, @NFloat double black, @NFloat double alpha);

    @Generated
    @CFunction
    public static native void CGContextSetRenderingIntent(CGContextRef c, int intent);

    @Generated
    @CFunction
    public static native void CGContextDrawImage(CGContextRef c, @ByValue CGRect rect, CGImageRef image);

    @Generated
    @CFunction
    public static native void CGContextDrawTiledImage(CGContextRef c, @ByValue CGRect rect, CGImageRef image);

    @Generated
    @CFunction
    public static native int CGContextGetInterpolationQuality(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextSetInterpolationQuality(CGContextRef c, int quality);

    @Generated
    @CFunction
    public static native void CGContextSetShadowWithColor(CGContextRef c, @ByValue CGSize offset, @NFloat double blur,
            CGColorRef color);

    @Generated
    @CFunction
    public static native void CGContextSetShadow(CGContextRef c, @ByValue CGSize offset, @NFloat double blur);

    @Generated
    @CFunction
    public static native void CGContextDrawLinearGradient(CGContextRef c, CGGradientRef gradient,
            @ByValue CGPoint startPoint, @ByValue CGPoint endPoint, int options);

    @Generated
    @CFunction
    public static native void CGContextDrawRadialGradient(CGContextRef c, CGGradientRef gradient,
            @ByValue CGPoint startCenter, @NFloat double startRadius, @ByValue CGPoint endCenter,
            @NFloat double endRadius, int options);

    @Generated
    @CFunction
    public static native void CGContextDrawShading(CGContextRef c, CGShadingRef shading);

    @Generated
    @CFunction
    public static native void CGContextSetCharacterSpacing(CGContextRef c, @NFloat double spacing);

    @Generated
    @CFunction
    public static native void CGContextSetTextPosition(CGContextRef c, @NFloat double x, @NFloat double y);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextGetTextPosition(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextSetTextMatrix(CGContextRef c, @ByValue CGAffineTransform t);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetTextMatrix(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextSetTextDrawingMode(CGContextRef c, int mode);

    @Generated
    @CFunction
    public static native void CGContextSetFont(CGContextRef c, CGFontRef font);

    @Generated
    @CFunction
    public static native void CGContextSetFontSize(CGContextRef c, @NFloat double size);

    @Generated
    @CFunction
    public static native void CGContextShowGlyphsAtPositions(CGContextRef c, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint Lpositions, @NUInt long count);

    @Generated
    @CFunction
    public static native void CGContextDrawPDFPage(CGContextRef c, CGPDFPageRef page);

    @Generated
    @CFunction
    public static native void CGContextBeginPage(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox);

    @Generated
    @CFunction
    public static native void CGContextEndPage(CGContextRef c);

    @Generated
    @CFunction
    public static native CGContextRef CGContextRetain(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextRelease(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextFlush(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextSynchronize(CGContextRef c);

    @Generated
    @CFunction
    public static native void CGContextSetShouldAntialias(CGContextRef c, boolean shouldAntialias);

    @Generated
    @CFunction
    public static native void CGContextSetAllowsAntialiasing(CGContextRef c, boolean allowsAntialiasing);

    @Generated
    @CFunction
    public static native void CGContextSetShouldSmoothFonts(CGContextRef c, boolean shouldSmoothFonts);

    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSmoothing(CGContextRef c, boolean allowsFontSmoothing);

    @Generated
    @CFunction
    public static native void CGContextSetShouldSubpixelPositionFonts(CGContextRef c,
            boolean shouldSubpixelPositionFonts);

    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSubpixelPositioning(CGContextRef c,
            boolean allowsFontSubpixelPositioning);

    @Generated
    @CFunction
    public static native void CGContextSetShouldSubpixelQuantizeFonts(CGContextRef c,
            boolean shouldSubpixelQuantizeFonts);

    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSubpixelQuantization(CGContextRef c,
            boolean allowsFontSubpixelQuantization);

    @Generated
    @CFunction
    public static native void CGContextBeginTransparencyLayer(CGContextRef c, CFDictionaryRef auxiliaryInfo);

    @Generated
    @CFunction
    public static native void CGContextBeginTransparencyLayerWithRect(CGContextRef c, @ByValue CGRect rect,
            CFDictionaryRef auxInfo);

    @Generated
    @CFunction
    public static native void CGContextEndTransparencyLayer(CGContextRef c);

    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetUserSpaceToDeviceSpaceTransform(CGContextRef c);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextConvertPointToDeviceSpace(CGContextRef c, @ByValue CGPoint point);

    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextConvertPointToUserSpace(CGContextRef c, @ByValue CGPoint point);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGContextConvertSizeToDeviceSpace(CGContextRef c, @ByValue CGSize size);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGContextConvertSizeToUserSpace(CGContextRef c, @ByValue CGSize size);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextConvertRectToDeviceSpace(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextConvertRectToUserSpace(CGContextRef c, @ByValue CGRect rect);

    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextSelectFont(CGContextRef c,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NFloat double size, int textEncoding);

    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowText(CGContextRef c,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
            @NUInt long length);

    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowTextAtPoint(CGContextRef c, @NFloat double x, @NFloat double y,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
            @NUInt long length);

    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphs(CGContextRef c, ConstCharPtr g, @NUInt long count);

    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphsAtPoint(CGContextRef c, @NFloat double x, @NFloat double y,
            ConstCharPtr glyphs, @NUInt long count);

    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphsWithAdvances(CGContextRef c, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize advances, @NUInt long count);

    @Generated
    @CFunction
    public static native CGContextRef CGBitmapContextCreateWithData(VoidPtr data, @NUInt long width, @NUInt long height,
            @NUInt long bitsPerComponent, @NUInt long bytesPerRow, CGColorSpaceRef space, int bitmapInfo,
            @FunctionPtr(name = "call_CGBitmapContextCreateWithData") Function_CGBitmapContextCreateWithData releaseCallback,
            VoidPtr releaseInfo);

    @Generated
    @CFunction
    public static native CGContextRef CGBitmapContextCreate(VoidPtr data, @NUInt long width, @NUInt long height,
            @NUInt long bitsPerComponent, @NUInt long bytesPerRow, CGColorSpaceRef space, int bitmapInfo);

    @Generated
    @CFunction
    public static native VoidPtr CGBitmapContextGetData(CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetWidth(CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetHeight(CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBitsPerComponent(CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBitsPerPixel(CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBytesPerRow(CGContextRef context);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGBitmapContextGetColorSpace(CGContextRef context);

    @Generated
    @CFunction
    public static native int CGBitmapContextGetAlphaInfo(CGContextRef context);

    @Generated
    @CFunction
    public static native int CGBitmapContextGetBitmapInfo(CGContextRef context);

    @Generated
    @CFunction
    public static native CGImageRef CGBitmapContextCreateImage(CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CGColorConversionInfoGetTypeID();

    @Generated
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreate(CGColorSpaceRef src, CGColorSpaceRef dst);

    @Generated
    @Variadic()
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreateFromList(CFDictionaryRef options,
            CGColorSpaceRef arg2, int arg3, int arg4, Object... varargs);

    @Generated
    @CFunction
    @NUInt
    public static native long CGDataConsumerGetTypeID();

    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreate(VoidPtr info,
            @UncertainArgument("Options: reference, array Fallback: reference") CGDataConsumerCallbacks cbks);

    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreateWithURL(CFURLRef url);

    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreateWithCFData(CFMutableDataRef data);

    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerRetain(CGDataConsumerRef consumer);

    @Generated
    @CFunction
    public static native void CGDataConsumerRelease(CGDataConsumerRef consumer);

    @Generated
    @CFunction
    public static native CGLayerRef CGLayerCreateWithContext(CGContextRef context, @ByValue CGSize size,
            CFDictionaryRef auxiliaryInfo);

    @Generated
    @CFunction
    public static native CGLayerRef CGLayerRetain(CGLayerRef layer);

    @Generated
    @CFunction
    public static native void CGLayerRelease(CGLayerRef layer);

    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGLayerGetSize(CGLayerRef layer);

    @Generated
    @CFunction
    public static native CGContextRef CGLayerGetContext(CGLayerRef layer);

    @Generated
    @CFunction
    public static native void CGContextDrawLayerInRect(CGContextRef context, @ByValue CGRect rect, CGLayerRef layer);

    @Generated
    @CFunction
    public static native void CGContextDrawLayerAtPoint(CGContextRef context, @ByValue CGPoint point, CGLayerRef layer);

    @Generated
    @CFunction
    @NUInt
    public static native long CGLayerGetTypeID();

    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithPage(CGPDFPageRef page);

    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithStream(CGPDFStreamRef stream,
            CGPDFDictionaryRef streamResources, CGPDFContentStreamRef parent);

    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamRetain(CGPDFContentStreamRef cs);

    @Generated
    @CFunction
    public static native void CGPDFContentStreamRelease(CGPDFContentStreamRef cs);

    @Generated
    @CFunction
    public static native CFArrayRef CGPDFContentStreamGetStreams(CGPDFContentStreamRef cs);

    @Generated
    @CFunction
    public static native CGPDFObjectRef CGPDFContentStreamGetResource(CGPDFContentStreamRef cs,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    @Generated
    @CFunction
    public static native CGContextRef CGPDFContextCreate(CGDataConsumerRef consumer,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
            CFDictionaryRef auxiliaryInfo);

    @Generated
    @CFunction
    public static native CGContextRef CGPDFContextCreateWithURL(CFURLRef url,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
            CFDictionaryRef auxiliaryInfo);

    @Generated
    @CFunction
    public static native void CGPDFContextClose(CGContextRef context);

    @Generated
    @CFunction
    public static native void CGPDFContextBeginPage(CGContextRef context, CFDictionaryRef pageInfo);

    @Generated
    @CFunction
    public static native void CGPDFContextEndPage(CGContextRef context);

    @Generated
    @CFunction
    public static native void CGPDFContextAddDocumentMetadata(CGContextRef context, CFDataRef metadata);

    @Generated
    @CFunction
    public static native void CGPDFContextSetURLForRect(CGContextRef context, CFURLRef url, @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native void CGPDFContextAddDestinationAtPoint(CGContextRef context, CFStringRef name,
            @ByValue CGPoint point);

    @Generated
    @CFunction
    public static native void CGPDFContextSetDestinationForRect(CGContextRef context, CFStringRef name,
            @ByValue CGRect rect);

    @Generated
    @CFunction
    public static native CGPDFScannerRef CGPDFScannerCreate(CGPDFContentStreamRef cs, CGPDFOperatorTableRef table,
            VoidPtr info);

    @Generated
    @CFunction
    public static native CGPDFScannerRef CGPDFScannerRetain(CGPDFScannerRef scanner);

    @Generated
    @CFunction
    public static native void CGPDFScannerRelease(CGPDFScannerRef scanner);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerScan(CGPDFScannerRef scanner);

    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFScannerGetContentStream(CGPDFScannerRef scanner);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopObject(CGPDFScannerRef scanner, Ptr<CGPDFObjectRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopBoolean(CGPDFScannerRef scanner, BytePtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopInteger(CGPDFScannerRef scanner, NIntPtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopNumber(CGPDFScannerRef scanner, NFloatPtr value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopName(CGPDFScannerRef scanner,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopString(CGPDFScannerRef scanner, Ptr<CGPDFStringRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopArray(CGPDFScannerRef scanner, Ptr<CGPDFArrayRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopDictionary(CGPDFScannerRef scanner, Ptr<CGPDFDictionaryRef> value);

    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopStream(CGPDFScannerRef scanner, Ptr<CGPDFStreamRef> value);

    @Generated
    @CFunction
    public static native CGPDFOperatorTableRef CGPDFOperatorTableCreate();

    @Generated
    @CFunction
    public static native CGPDFOperatorTableRef CGPDFOperatorTableRetain(CGPDFOperatorTableRef table);

    @Generated
    @CFunction
    public static native void CGPDFOperatorTableRelease(CGPDFOperatorTableRef table);

    @Generated
    @CFunction
    public static native void CGPDFOperatorTableSetCallback(CGPDFOperatorTableRef table,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @FunctionPtr(name = "call_CGPDFOperatorTableSetCallback") Function_CGPDFOperatorTableSetCallback callback);

    @Generated
    @CVariable()
    @ByValue
    public static native CGPoint CGPointZero();

    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CGSizeZero();

    @Generated
    @CVariable()
    @ByValue
    public static native CGRect CGRectZero();

    @Generated
    @CVariable()
    @ByValue
    public static native CGRect CGRectNull();

    @Generated
    @CVariable()
    @ByValue
    public static native CGRect CGRectInfinite();

    @Generated
    @CVariable()
    @ByValue
    public static native CGAffineTransform CGAffineTransformIdentity();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericGray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericCMYK();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericRGBLinear();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceAdobeRGB1998();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceSRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericGrayGamma2_2();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericXYZ();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceACESCGLinear();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_709();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceROMMRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDCIP3();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedSRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceLinearSRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearSRGB();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedGray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceLinearGray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearGray();

    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisName();

    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisMinValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisMaxValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisDefaultValue();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorConversionBlackPointCompensation();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextMediaBox();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextCropBox();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextBleedBox();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextTrimBox();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextArtBox();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAuthor();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextSubject();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextKeywords();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextCreator();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextOwnerPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextUserPassword();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextEncryptionKeyLength();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAllowsPrinting();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAllowsCopying();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGDataProviderCreateWithData {
        @Generated
        void call_CGDataProviderCreateWithData(VoidPtr arg0, ConstVoidPtr arg1, @NUInt long arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGPathApply {
        @Generated
        void call_CGPathApply(VoidPtr arg0,
                @UncertainArgument("Options: reference, array Fallback: reference") CGPathElement arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGPDFDictionaryApplyFunction {
        @Generated
        void call_CGPDFDictionaryApplyFunction(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0,
                CGPDFObjectRef arg1, VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGBitmapContextCreateWithData {
        @Generated
        void call_CGBitmapContextCreateWithData(VoidPtr arg0, VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGPDFOperatorTableSetCallback {
        @Generated
        void call_CGPDFOperatorTableSetCallback(CGPDFScannerRef arg0, VoidPtr arg1);
    }

    @Generated
    @CFunction
    public static native VoidPtr CGDataProviderGetInfo(CGDataProviderRef provider);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithICCData(ConstVoidPtr data);

    @Generated
    @CFunction
    public static native CFStringRef CGColorSpaceGetName(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native void CGPathApplyWithBlock(CGPathRef path,
            @ObjCBlock(name = "call_CGPathApplyWithBlock") Block_CGPathApplyWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGPathApplyWithBlock {
        @Generated
        void call_CGPathApplyWithBlock(
                @UncertainArgument("Options: reference, array Fallback: reference") CGPathElement arg0);
    }

    @Generated
    @CFunction
    public static native CFDictionaryRef CGPDFDocumentGetOutline(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native int CGPDFDocumentGetAccessPermissions(CGPDFDocumentRef document);

    @Generated
    @CFunction
    public static native void CGContextResetClip(CGContextRef c);

    @Generated
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreateFromListWithArguments(
            CFDictionaryRef options, CGColorSpaceRef arg2, int arg3, int arg4, BytePtr arg5);

    @Generated
    @CFunction
    public static native void CGPDFContextSetOutline(CGContextRef context, CFDictionaryRef outline);

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericLab();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineTitle();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineChildren();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineDestination();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineDestinationRect();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorConversionTRCSize();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAccessPermissions();

    @Generated
    @CFunction
    public static native boolean CGColorSpaceIsHDR(CGColorSpaceRef arg1);

    @Generated
    @CFunction
    public static native ConstVoidPtr CGColorSpaceCopyPropertyList(CGColorSpaceRef space);

    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithPropertyList(ConstVoidPtr plist);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateGenericGrayGamma2_2(@NFloat double gray, @NFloat double alpha);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateSRGB(@NFloat double red, @NFloat double green, @NFloat double blue,
            @NFloat double alpha);

    @Generated
    @CFunction
    public static native int CGImageGetByteOrderInfo(CGImageRef image);

    @Generated
    @CFunction
    public static native int CGImageGetPixelFormatInfo(CGImageRef image);

    @Generated
    @CFunction
    public static native void CGPDFArrayApplyBlock(CGPDFArrayRef array,
            @ObjCBlock(name = "call_CGPDFArrayApplyBlock") Block_CGPDFArrayApplyBlock block, VoidPtr info);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGPDFArrayApplyBlock {
        @Generated
        boolean call_CGPDFArrayApplyBlock(@NUInt long arg0, CGPDFObjectRef arg1, VoidPtr arg2);
    }

    @Generated
    @CFunction
    public static native void CGPDFDictionaryApplyBlock(CGPDFDictionaryRef dict,
            @ObjCBlock(name = "call_CGPDFDictionaryApplyBlock") Block_CGPDFDictionaryApplyBlock block, VoidPtr info);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGPDFDictionaryApplyBlock {
        @Generated
        boolean call_CGPDFDictionaryApplyBlock(
                @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String arg0,
                CGPDFObjectRef arg1, VoidPtr arg2);
    }

    @Generated
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreateWithOptions(CGColorSpaceRef src,
            CGColorSpaceRef dst, CFDictionaryRef options);

    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CGPDFTagTypeGetName(int tagType);

    @Generated
    @CFunction
    public static native void CGPDFContextBeginTag(CGContextRef context, int tagType, CFDictionaryRef tagProperties);

    @Generated
    @CFunction
    public static native void CGPDFContextEndTag(CGContextRef context);

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearITUR_2020();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearDisplayP3();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020_PQ_EOTF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3_PQ_EOTF();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3_HLG();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020_HLG();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyActualText();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyAlternativeText();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyTitleText();

    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyLanguageText();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020_PQ();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3_PQ();
}
