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
import apple.coregraphics.opaque.ColorSyncProfileRef;
import apple.coregraphics.struct.CGColorDataFormat;
import apple.coregraphics.struct.CGDataConsumerCallbacks;
import apple.coregraphics.struct.CGDataProviderDirectCallbacks;
import apple.coregraphics.struct.CGDataProviderSequentialCallbacks;
import apple.coregraphics.struct.CGFunctionCallbacks;
import apple.coregraphics.struct.CGPathElement;
import apple.coregraphics.struct.CGPatternCallbacks;
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
import apple.corefoundation.struct.CGAffineTransformComponents;
import apple.corefoundation.struct.CGAffineTransform;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.corefoundation.struct.CGSize;
import apple.corefoundation.struct.CGVector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Generated
@Library("CoreGraphics")
@Runtime(CRuntime.class)
public final class CoreGraphics {
    /**
     * The maximum allowed value of a CGFontIndex. Always <= USHRT_MAX - 1.
     */
    @Generated public static final char kCGFontIndexMax = 0xFFFE;
    /**
     * A value representing an invalid CGFontIndex. Always <= USHRT_MAX.
     */
    @Generated public static final char kCGFontIndexInvalid = 0xFFFF;
    /**
     * The maximum allowed value of a CGGlyph.
     */
    @Generated public static final char kCGGlyphMax = 0xFFFE;

    static {
        NatJ.register();
    }

    @Generated
    private CoreGraphics() {
    }

    /**
     * Make a point from `(x, y)'.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGPoint CGPointMake(@NFloat double x, @NFloat double y);

    /**
     * Make a size from `(width, height)'.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGSize CGSizeMake(@NFloat double width, @NFloat double height);

    /**
     * Make a vector from `(dx, dy)'.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGVector CGVectorMake(@NFloat double dx, @NFloat double dy);

    /**
     * Make a rect from `(x, y; width, height)'.
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGRect CGRectMake(@NFloat double x, @NFloat double y, @NFloat double width,
            @NFloat double height);

    /**
     * Return the leftmost x-value of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMinX(@ByValue CGRect rect);

    /**
     * Return the midpoint x-value of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMidX(@ByValue CGRect rect);

    /**
     * Return the rightmost x-value of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMaxX(@ByValue CGRect rect);

    /**
     * Return the smallest y-value of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMinY(@ByValue CGRect rect);

    /**
     * Return the midpoint y-value of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMidY(@ByValue CGRect rect);

    /**
     * Return the largest y-value of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMaxY(@ByValue CGRect rect);

    /**
     * Return the width of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetWidth(@ByValue CGRect rect);

    /**
     * Return the height of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetHeight(@ByValue CGRect rect);

    /**
     * Return true if `point1' and `point2' are the same, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPointEqualToPoint(@ByValue CGPoint point1, @ByValue CGPoint point2);

    /**
     * Return true if `size1' and `size2' are the same, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGSizeEqualToSize(@ByValue CGSize size1, @ByValue CGSize size2);

    /**
     * Return true if `rect1' and `rect2' are the same, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectEqualToRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    /**
     * Standardize `rect' -- i.e., convert it to an equivalent rect which has
     * positive width and height.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectStandardize(@ByValue CGRect rect);

    /**
     * Return true if `rect' is empty (that is, if it has zero width or height),
     * false otherwise. A null rect is defined to be empty.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectIsEmpty(@ByValue CGRect rect);

    /**
     * Return true if `rect' is the null rectangle, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectIsNull(@ByValue CGRect rect);

    /**
     * Return true if `rect' is the infinite rectangle, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectIsInfinite(@ByValue CGRect rect);

    /**
     * Inset `rect' by `(dx, dy)' -- i.e., offset its origin by `(dx, dy)', and
     * decrease its size by `(2*dx, 2*dy)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectInset(@ByValue CGRect rect, @NFloat double dx, @NFloat double dy);

    /**
     * Expand `rect' to the smallest rect containing it with integral origin and
     * size.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectIntegral(@ByValue CGRect rect);

    /**
     * Return the union of `r1' and `r2'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectUnion(@ByValue CGRect r1, @ByValue CGRect r2);

    /**
     * Return the intersection of `r1' and `r2'. This may return a null rect.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectIntersection(@ByValue CGRect r1, @ByValue CGRect r2);

    /**
     * Offset `rect' by `(dx, dy)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectOffset(@ByValue CGRect rect, @NFloat double dx, @NFloat double dy);

    /**
     * Make two new rectangles, `slice' and `remainder', by dividing `rect' with
     * a line that's parallel to one of its sides, specified by `edge' -- either
     * `CGRectMinXEdge', `CGRectMinYEdge', `CGRectMaxXEdge', or
     * `CGRectMaxYEdge'. The size of `slice' is determined by `amount', which
     * measures the distance from the specified edge.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGRectDivide(@ByValue CGRect rect,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGRect slice,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGRect remainder,
            @NFloat double amount, int edge);

    /**
     * Return true if `point' is contained in `rect', false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectContainsPoint(@ByValue CGRect rect, @ByValue CGPoint point);

    /**
     * Return true if `rect2' is contained in `rect1', false otherwise. `rect2'
     * is contained in `rect1' if the union of `rect1' and `rect2' is equal to
     * `rect1'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectContainsRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    /**
     * Return true if `rect1' intersects `rect2', false otherwise. `rect1'
     * intersects `rect2' if the intersection of `rect1' and `rect2' is not the
     * null rect.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectIntersectsRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    /**
     * Return a dictionary representation of `point'.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFDictionaryRef CGPointCreateDictionaryRepresentation(@ByValue CGPoint point);

    /**
     * Make a CGPoint from the contents of `dict' (presumably returned earlier
     * from `CGPointCreateDictionaryRepresentation') and store the value in
     * `point'. Returns true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPointMakeWithDictionaryRepresentation(@Nullable CFDictionaryRef dict,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGPoint point);

    /**
     * Return a dictionary representation of `size'.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFDictionaryRef CGSizeCreateDictionaryRepresentation(@ByValue CGSize size);

    /**
     * Make a CGSize from the contents of `dict' (presumably returned earlier
     * from `CGSizeCreateDictionaryRepresentation') and store the value in
     * `size'. Returns true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGSizeMakeWithDictionaryRepresentation(@Nullable CFDictionaryRef dict,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGSize size);

    /**
     * Return a dictionary representation of `rect'.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CFDictionaryRef CGRectCreateDictionaryRepresentation(@ByValue CGRect arg1);

    /**
     * Make a CGRect from the contents of `dict' (presumably returned earlier
     * from `CGRectCreateDictionaryRepresentation') and store the value in
     * `rect'. Returns true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGRectMakeWithDictionaryRepresentation(@Nullable CFDictionaryRef dict,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect rect);

    @Generated
    @Inline
    @CFunction
    public static native boolean __CGPointEqualToPoint(@ByValue CGPoint point1, @ByValue CGPoint point2);

    @Generated
    @Inline
    @CFunction
    public static native boolean __CGSizeEqualToSize(@ByValue CGSize size1, @ByValue CGSize size2);

    /**
     * Return the transform [ a b c d tx ty ].
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMake(@NFloat double a, @NFloat double b, @NFloat double c,
            @NFloat double d, @NFloat double tx, @NFloat double ty);

    /**
     * Return a transform which translates by `(tx, ty)':
     * t' = [ 1 0 0 1 tx ty ]
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeTranslation(@NFloat double tx, @NFloat double ty);

    /**
     * Return a transform which scales by `(sx, sy)':
     * t' = [ sx 0 0 sy 0 0 ]
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeScale(@NFloat double sx, @NFloat double sy);

    /**
     * Return a transform which rotates by `angle' radians:
     * t' = [ cos(angle) sin(angle) -sin(angle) cos(angle) 0 0 ]
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeRotation(@NFloat double angle);

    /**
     * Return true if `t' is the identity transform, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGAffineTransformIsIdentity(@ByValue CGAffineTransform t);

    /**
     * Translate `t' by `(tx, ty)' and return the result:
     * t' = [ 1 0 0 1 tx ty ] * t
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformTranslate(@ByValue CGAffineTransform t, @NFloat double tx,
            @NFloat double ty);

    /**
     * Scale `t' by `(sx, sy)' and return the result:
     * t' = [ sx 0 0 sy 0 0 ] * t
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformScale(@ByValue CGAffineTransform t, @NFloat double sx,
            @NFloat double sy);

    /**
     * Rotate `t' by `angle' radians and return the result:
     * t' = [ cos(angle) sin(angle) -sin(angle) cos(angle) 0 0 ] * t
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformRotate(@ByValue CGAffineTransform t, @NFloat double angle);

    /**
     * Invert `t' and return the result. If `t' has zero determinant, then `t'
     * is returned unchanged.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformInvert(@ByValue CGAffineTransform t);

    /**
     * Concatenate `t2' to `t1' and return the result:
     * t' = t1 * t2
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformConcat(@ByValue CGAffineTransform t1,
            @ByValue CGAffineTransform t2);

    /**
     * Return true if `t1' and `t2' are equal, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGAffineTransformEqualToTransform(@ByValue CGAffineTransform t1,
            @ByValue CGAffineTransform t2);

    /**
     * Transform `point' by `t' and return the result:
     * p' = p * t
     * where p = [ x y 1 ].
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGPointApplyAffineTransform(@ByValue CGPoint point, @ByValue CGAffineTransform t);

    /**
     * Transform `size' by `t' and return the result:
     * s' = s * t
     * where s = [ width height 0 ].
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGSizeApplyAffineTransform(@ByValue CGSize size, @ByValue CGAffineTransform t);

    /**
     * Transform `rect' by `t' and return the result. Since affine transforms do
     * not preserve rectangles in general, this function returns the smallest
     * rectangle which contains the transformed corner points of `rect'. If `t'
     * consists solely of scales, flips and translations, then the returned
     * rectangle coincides with the rectangle constructed from the four
     * transformed corners.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectApplyAffineTransform(@ByValue CGRect rect, @ByValue CGAffineTransform t);

    /**
     * Definitions of inline functions. **
     */
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

    /**
     * Return the CFTypeID for CGDataProviderRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGDataProviderGetTypeID();

    /**
     * Create a sequential-access data provider using `callbacks' to provide the
     * data. `info' is passed to each of the callback functions.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateSequential(@Nullable VoidPtr info,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderSequentialCallbacks callbacks);

    /**
     * Create a direct-access data provider using `callbacks' to supply `size'
     * bytes of data. `info' is passed to each of the callback functions.
     * The underlying data must not change for the life of the data provider.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateDirect(@Nullable VoidPtr info, long size,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderDirectCallbacks callbacks);

    /**
     * Create a direct-access data provider using `data', an array of `size'
     * bytes. `releaseData' is called when the data provider is freed, and is
     * passed `info' as its first argument.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithData(@Nullable VoidPtr info,
            @Nullable ConstVoidPtr data, @NUInt long size,
            @Nullable @FunctionPtr(name = "call_CGDataProviderCreateWithData") Function_CGDataProviderCreateWithData releaseData);

    /**
     * Create a direct-access data provider which reads from `data'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithCFData(@Nullable CFDataRef data);

    /**
     * Create a data provider reading from `url'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithURL(@Nullable CFURLRef url);

    /**
     * Create a data provider reading from `filename'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithFilename(
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String filename);

    /**
     * Equivalent to `CFRetain(provider)', but doesn't crash (as CFRetain does)
     * if `provider' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderRetain(@Nullable CGDataProviderRef provider);

    /**
     * Equivalent to `CFRelease(provider)', but doesn't crash (as CFRelease
     * does) if `provider' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGDataProviderRelease(@Nullable CGDataProviderRef provider);

    /**
     * Return a copy of the data specified by provider. Returns NULL if a
     * complete copy of the data can't be obtained (for example, if the
     * underlying data is too large to fit in memory).
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDataRef CGDataProviderCopyData(@Nullable CGDataProviderRef provider);

    /**
     * Create a DeviceGray color space.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceGray();

    /**
     * Create a DeviceRGB color space.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceRGB();

    /**
     * Create a DeviceCMYK color space.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceCMYK();

    /**
     * Please use `CGColorSpaceCreateWithICCData'
     * 
     * API-Since: 2.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithICCProfile(@Nullable CFDataRef data);

    /**
     * Create an ICC-based color space. `nComponents' specifies the number of
     * color components in the color space defined by the ICC profile data. This
     * must match the number of components actually in the ICC profile, and must
     * be 1, 3, or 4. `range' is an array of 2*nComponents numbers specifying
     * the minimum and maximum valid values of the corresponding color
     * components, so that for color component k, range[2*k] <= c[k] <=
     * range[2*k+1], where c[k] is the k'th color component. `profile' is a data
     * provider specifying the ICC profile. `alternate' specifies an alternate
     * color space to be used in case the ICC profile is not supported. It must
     * have `nComponents' color components. If `alternate' is NULL, then the
     * color space used will be DeviceGray, DeviceRGB, or DeviceCMYK, depending
     * on whether `nComponents' is 1, 3, or 4, respectively.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateICCBased(@NUInt long nComponents,
            @Nullable ConstNFloatPtr range, @Nullable CGDataProviderRef profile, @Nullable CGColorSpaceRef alternate);

    /**
     * Create an indexed color space. A sample value in an indexed color space
     * is treated as an index into the color table of the color space. `base'
     * specifies the base color space in which the values in the color table are
     * to be interpreted. `lastIndex' is an integer which specifies the maximum
     * valid index value; it must be less than or equal to 255. `colorTable' is
     * an array of m * (lastIndex + 1) bytes, where m is the number of color
     * components in the base color space. Each byte is an unsigned integer in
     * the range 0 to 255 that is scaled to the range of the corresponding color
     * component in the base color space.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateIndexed(@Nullable CGColorSpaceRef baseSpace,
            @NUInt long lastIndex,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String colorTable);

    /**
     * Create a pattern color space. `baseSpace' is the underlying color space
     * of the pattern color space. For colored patterns, `baseSpace' should be
     * NULL; for uncolored patterns, `baseSpace' specifies the color space of
     * colors which will be painted through the pattern.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreatePattern(@Nullable CGColorSpaceRef baseSpace);

    /**
     * Please use `CGColorSpaceCreateWithColorSyncProfile'
     * 
     * API-Since: 9.0
     * Deprecated-Since: 15.0
     * Deprecated-Message: No longer supported
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithPlatformColorSpace(@Nullable ConstVoidPtr ref);

    /**
     * Create a color space using `name' as the identifier for the color
     * space.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithName(@Nullable CFStringRef name);

    /**
     * Equivalent to `CFRetain(space)', except it doesn't crash (as CFRetain
     * does) if `space' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceRetain(@Nullable CGColorSpaceRef space);

    /**
     * Equivalent to `CFRelease(space)', except it doesn't crash (as CFRelease
     * does) if `space' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGColorSpaceRelease(@Nullable CGColorSpaceRef space);

    /**
     * Same as `CGColorSpaceGetName' but with ownership released to the caller.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGColorSpaceCopyName(@Nullable CGColorSpaceRef space);

    /**
     * Return the CFTypeID for CGColorSpaces.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetTypeID();

    /**
     * Return the number of color components in the color space `space'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetNumberOfComponents(@Nullable CGColorSpaceRef space);

    /**
     * Return the color space model of `space'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGColorSpaceGetModel(@Nullable CGColorSpaceRef space);

    /**
     * Return the base color space of `space' if `space' is a pattern or indexed
     * color space; otherwise, return NULL. To determine whether a color space
     * is an indexed or pattern color space, use `CGColorSpaceGetModel'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceGetBaseColorSpace(@Nullable CGColorSpaceRef space);

    /**
     * Return the number of entries in the color table of `space' if `space' is
     * an indexed color space; otherwise, return 0. To determine whether a color
     * space is an indexed color space, use `CGColorSpaceGetModel'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetColorTableCount(@Nullable CGColorSpaceRef space);

    /**
     * Copy the entries in the color table of `space' to `table' if `space' is
     * an indexed color space; otherwise, do nothing. The array pointed to by
     * `table' should be at least as large as the number of entries in the color
     * table; the returned data is in the same format as that passed to
     * `CGColorSpaceCreateIndexed'. To determine whether a color space is an
     * indexed color space, use `CGColorSpaceGetModel'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGColorSpaceGetColorTable(@Nullable CGColorSpaceRef space, @Nullable BytePtr table);

    /**
     * Please use `CGColorSpaceCopyICCData'
     * 
     * API-Since: 2.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: No longer supported
     */
    @Nullable
    @Deprecated
    @Generated
    @CFunction
    public static native CFDataRef CGColorSpaceCopyICCProfile(@Nullable CGColorSpaceRef space);

    /**
     * Return a copy of the ICC profile data of `space', or NULL if the color space
     * doesn't have an ICC profile.
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDataRef CGColorSpaceCopyICCData(@Nullable CGColorSpaceRef space);

    /**
     * Return true if gamut of the RGB color space is greater than 85% of NTSC gamut
     * 
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native boolean CGColorSpaceIsWideGamutRGB(@NotNull CGColorSpaceRef arg1);

    /**
     * Return true if `space' can be used as a destination color space; false
     * otherwise.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native boolean CGColorSpaceSupportsOutput(@NotNull CGColorSpaceRef space);

    /**
     * Return the CFTypeID for CGPatternRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPatternGetTypeID();

    /**
     * Create a pattern.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPatternRef CGPatternCreate(@Nullable VoidPtr info, @ByValue CGRect bounds,
            @ByValue CGAffineTransform matrix, @NFloat double xStep, @NFloat double yStep, int tiling,
            boolean isColored,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGPatternCallbacks callbacks);

    /**
     * Equivalent to `CFRetain(pattern)', except it doesn't crash (as CF does)
     * if `pattern' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPatternRef CGPatternRetain(@Nullable CGPatternRef pattern);

    /**
     * Equivalent to `CFRelease(pattern)', except it doesn't crash (as CF does)
     * if `pattern' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPatternRelease(@Nullable CGPatternRef pattern);

    /**
     * Create a color in the color space `space' with color components
     * (including alpha) specified by `components'. `space' may be any color
     * space except a pattern color space.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreate(@Nullable CGColorSpaceRef space, @Nullable ConstNFloatPtr components);

    /**
     * Create a color in color space `space' with pattern `pattern' and
     * components `components'. `space' must be a pattern color space.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateWithPattern(@Nullable CGColorSpaceRef space,
            @Nullable CGPatternRef pattern, @Nullable ConstNFloatPtr components);

    /**
     * Create a copy of `color'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopy(@Nullable CGColorRef color);

    /**
     * Create a copy of `color' with alpha set to `alpha'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopyWithAlpha(@Nullable CGColorRef color, @NFloat double alpha);

    /**
     * Create a copy of `color' by matching existing color to destination color space.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopyByMatchingToColorSpace(@Nullable CGColorSpaceRef arg1, int intent,
            @Nullable CGColorRef color, @Nullable CFDictionaryRef options);

    /**
     * Equivalent to `CFRetain(color)', except it doesn't crash (as CFRetain
     * does) if `color' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorRef CGColorRetain(@Nullable CGColorRef color);

    /**
     * Equivalent to `CFRelease(color)', except it doesn't crash (as CFRelease
     * does) if `color' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGColorRelease(@Nullable CGColorRef color);

    /**
     * Return true if `color1' is equal to `color2'; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGColorEqualToColor(@Nullable CGColorRef color1, @Nullable CGColorRef color2);

    /**
     * Return the number of color components (including alpha) associated with
     * `color'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorGetNumberOfComponents(@Nullable CGColorRef color);

    /**
     * Return the color components (including alpha) associated with `color'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstNFloatPtr CGColorGetComponents(@Nullable CGColorRef color);

    /**
     * Return the alpha component associated with `color'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGColorGetAlpha(@Nullable CGColorRef color);

    /**
     * Return the color space associated with `color'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorGetColorSpace(@Nullable CGColorRef color);

    /**
     * Return the pattern associated with `color', if it's a color in a pattern
     * color space; NULL otherwise.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPatternRef CGColorGetPattern(@Nullable CGColorRef color);

    /**
     * Return the CFTypeID for CGColors.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorGetTypeID();

    /**
     * Return the CFTypeID for CGFontRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGFontGetTypeID();

    /**
     * Return the font defined by the data provided by `provider', or NULL if
     * the font can't be created.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateWithDataProvider(@Nullable CGDataProviderRef provider);

    /**
     * Return the font identified by `name', corresponding to the font's
     * PostScript name or its full name, or NULL if the font can't be
     * created.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateWithFontName(@Nullable CFStringRef name);

    /**
     * Return a font based on `font' with the variation specification dictionary
     * `variations' applied to `font'. A variation specification dictionary
     * contains keys corresponding the variation axis names of the font. Each
     * key is a variation axis name; the value for each key is the value
     * specified for that particular variation axis represented as a
     * CFNumberRef. If a variation axis name is not specified in `variations',
     * then the current value from `font' is used.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateCopyWithVariations(@Nullable CGFontRef font,
            @Nullable CFDictionaryRef variations);

    /**
     * Equivalent to `CFRetain(font)', except it doesn't crash (as CFRetain
     * does) if `font' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGFontRef CGFontRetain(@Nullable CGFontRef font);

    /**
     * Equivalent to `CFRelease(font)', except it doesn't crash (as CFRelease
     * does) if `font' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGFontRelease(@Nullable CGFontRef font);

    /**
     * Return the number of glyphs in `font'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGFontGetNumberOfGlyphs(@Nullable CGFontRef font);

    /**
     * Return the glyph space units/em for `font'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGFontGetUnitsPerEm(@Nullable CGFontRef font);

    /**
     * Return the PostScript name of `font'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyPostScriptName(@Nullable CGFontRef font);

    /**
     * Return the "full name" of `font'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyFullName(@Nullable CGFontRef font);

    /**
     * Return the ascent of `font'. The ascent is the maximum distance above the
     * baseline of glyphs in a font. The value is specified in glyph space
     * units.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGFontGetAscent(@Nullable CGFontRef font);

    /**
     * Return the descent of `font'. The descent is the maximum distance below
     * the baseline of glyphs in a font. The value is specified in glyph space
     * units.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGFontGetDescent(@Nullable CGFontRef font);

    /**
     * Return the leading of `font'. The leading is the spacing between
     * consecutive lines of text in a font. The value is specified in glyph
     * space units.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGFontGetLeading(@Nullable CGFontRef font);

    /**
     * Return the cap height of `font'. The cap height is the distance above the
     * baseline of the top of flat capital letters of glyphs in a font. The
     * value is specified in glyph space units.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGFontGetCapHeight(@Nullable CGFontRef font);

    /**
     * Return the x-height of `font'. The x-height is the distance above the
     * baseline of the top of flat, non-ascending lowercase letters (such as
     * "x") of glyphs in a font. The value is specified in glyph space units.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGFontGetXHeight(@Nullable CGFontRef font);

    /**
     * Return the font bounding box of `font'. The font bounding box is the
     * union of all of the bounding boxes for all the glyphs in a font. The
     * value is specified in glyph space units.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGFontGetFontBBox(@Nullable CGFontRef font);

    /**
     * Return the italic angle of `font', measured in degrees counter-clockwise
     * from the vertical.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGFontGetItalicAngle(@Nullable CGFontRef font);

    /**
     * Return the thickness of the dominant vertical stems of glyphs in `font'.
     * The value is specified in glyph space units.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGFontGetStemV(@Nullable CGFontRef font);

    /**
     * Return an array of the variation axis dictionaries for `font'. Each
     * variation axis dictionary contains values for the variation axis keys
     * listed below. This function returns NULL if `font' doesn't support
     * variations.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CGFontCopyVariationAxes(@Nullable CGFontRef font);

    /**
     * Return the variation specification dictionary from `font'. This
     * dictionary contains keys corresponding the variation axis names of the
     * font. Each key is a variation axis name; the value for each key is the
     * value specified for that particular variation axis represented as a
     * CFNumberRef. This function returns NULL if `font' doesn't support
     * variations.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CGFontCopyVariations(@Nullable CGFontRef font);

    /**
     * Get the advance of each glyph in `glyphs', an array of `count' glyphs,
     * and return it in the corresponding entry of `advances', an array of
     * `count' integers. The advances are specified in glyph space. Returns
     * false if advances can't be retrieved for any reason; true otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGFontGetGlyphAdvances(@Nullable CGFontRef font, @NotNull ConstCharPtr glyphs,
            @NUInt long count, @NotNull IntPtr advances);

    /**
     * Get the bounding box of each glyph in `glyphs', an array of `count'
     * glyphs, and return it in the corresponding entry of `bboxes', an array of
     * `count' rectangles. The bounding boxes are specified in glyph space.
     * Returns false if bounding boxes can't be retrieved for any reason; true
     * otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGFontGetGlyphBBoxes(@Nullable CGFontRef font, @NotNull ConstCharPtr glyphs,
            @NUInt long count,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGRect bboxes);

    /**
     * Return the glyph associated with `name' in `font'. If `name' isn't found
     * in the font, return 0.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native char CGFontGetGlyphWithGlyphName(@Nullable CGFontRef font, @Nullable CFStringRef name);

    /**
     * Return the glyph name of `glyph' in `font', or NULL if `glyph' does not
     * appear in `font'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyGlyphNameForGlyph(@Nullable CGFontRef font, char glyph);

    /**
     * Return true if a subset in the PostScript format `format' can be created
     * for `font'; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGFontCanCreatePostScriptSubset(@Nullable CGFontRef font, int format);

    /**
     * Return an array of font table tags in `font'. Each entry in the array is
     * a four-byte value representing a single TrueType or OpenType font table
     * tag.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CGFontCopyTableTags(@Nullable CGFontRef font);

    /**
     * Return the table in `font' corresponding to `tag', or NULL if no such
     * table exists.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDataRef CGFontCopyTableForTag(@Nullable CGFontRef font, int tag);

    /**
     * Return the CFTypeID for CGGradients.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGGradientGetTypeID();

    /**
     * Creates a gradient by pairing the color components provided in
     * `components' with locations provided in `locations'. If `locations' is
     * NULL, the first color in `colors' will be at location 0, the last color
     * in `colors' will be at location 1, and intervening colors will be at
     * equal intervals in between. Otherwise, each location in `locations'
     * should be a CGFloat between 0 and 1. Each set of color components should
     * specify a color in the color space `space' (which may not be a pattern or
     * indexed color space). The number of locations is specified by `count';
     * the number of color components is the product of `count' and the number
     * of color components of `space'. If no color is provided for 0 or 1, the
     * gradient will use the color provided at the locations closest to 0 and 1
     * for those values.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGGradientRef CGGradientCreateWithColorComponents(@Nullable CGColorSpaceRef space,
            @Nullable ConstNFloatPtr components, @Nullable ConstNFloatPtr locations, @NUInt long count);

    /**
     * Creates a gradient by pairing the colors provided in `colors' with the
     * locations provided in `locations'. `colors' should be a non-empty array
     * of CGColor objects. The colors may be in any color space other than a
     * pattern or indexed color space. If `space' is non-NULL, each color will
     * be converted to that color space and the gradient will drawn in that
     * space; otherwise, each color will be converted to and drawn in the
     * "Generic" RGB color space. If `space' is specified, it may not be a
     * pattern or indexed color space. If `locations' is NULL, the first color
     * in `colors' will be at location 0, the last color in `colors' will be at
     * location 1, and intervening colors will be at equal intervals in between.
     * Otherwise, each location in `locations' should be a CGFloat between 0 and
     * 1; the array of locations should should contain the same number of items
     * as `colors'. If no color is provided for 0 or 1, the gradient will use
     * the color provided at the locations closest to 0 and 1 for those
     * values.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGGradientRef CGGradientCreateWithColors(@Nullable CGColorSpaceRef space,
            @Nullable CFArrayRef colors, @Nullable ConstNFloatPtr locations);

    /**
     * Equivalent to `CFRetain' except that it doesn't crash (as `CFRetain'
     * does) if `gradient' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGGradientRef CGGradientRetain(@Nullable CGGradientRef gradient);

    /**
     * Equivalent to `CFRelease' except that it doesn't crash (as `CFRelease'
     * does) if `gradient' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGGradientRelease(@Nullable CGGradientRef gradient);

    /**
     * Return the CFTypeID for CGImageRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetTypeID();

    /**
     * Create an image.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreate(@NUInt long width, @NUInt long height, @NUInt long bitsPerComponent,
            @NUInt long bitsPerPixel, @NUInt long bytesPerRow, @Nullable CGColorSpaceRef space, int bitmapInfo,
            @Nullable CGDataProviderRef provider, @Nullable ConstNFloatPtr decode, boolean shouldInterpolate,
            int intent);

    /**
     * Create an image mask. Legal values for bits per component are 1, 2, 4 and 8.
     * Bits per pixel must be either the same as bits per component or 8, with
     * exception of 8 bits per component where bits per pixel can be also 16 or 32.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageMaskCreate(@NUInt long width, @NUInt long height,
            @NUInt long bitsPerComponent, @NUInt long bitsPerPixel, @NUInt long bytesPerRow,
            @Nullable CGDataProviderRef provider, @Nullable ConstNFloatPtr decode, boolean shouldInterpolate);

    /**
     * Return a copy of `image'. Only the image structure itself is copied; the
     * underlying data is not.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateCopy(@Nullable CGImageRef image);

    /**
     * Create an image from `source', a data provider of JPEG-encoded data.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithJPEGDataProvider(@Nullable CGDataProviderRef source,
            @Nullable ConstNFloatPtr decode, boolean shouldInterpolate, int intent);

    /**
     * Create an image using `source', a data provider for PNG-encoded data.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithPNGDataProvider(@Nullable CGDataProviderRef source,
            @Nullable ConstNFloatPtr decode, boolean shouldInterpolate, int intent);

    /**
     * Create an image using the data contained within the subrectangle `rect'
     * of `image'.
     * 
     * The new image is created by
     * 1) adjusting `rect' to integral bounds by calling "CGRectIntegral";
     * 2) intersecting the result with a rectangle with origin (0, 0) and size
     * equal to the size of `image';
     * 3) referencing the pixels within the resulting rectangle, treating the
     * first pixel of the image data as the origin of the image.
     * If the resulting rectangle is the null rectangle, this function returns
     * NULL.
     * 
     * If W and H are the width and height of image, respectively, then the
     * point (0,0) corresponds to the first pixel of the image data; the point
     * (W-1, 0) is the last pixel of the first row of the image data; (0, H-1)
     * is the first pixel of the last row of the image data; and (W-1, H-1) is
     * the last pixel of the last row of the image data.
     * 
     * The resulting image retains a reference to the original image, so you may
     * release the original image after calling this function.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithImageInRect(@Nullable CGImageRef image, @ByValue CGRect rect);

    /**
     * Create a new image from `image' masked by `mask', which may be an image
     * mask or an image.
     * 
     * If `mask' is an image mask, then it indicates which parts of the context
     * are to be painted with the image when drawn in a context, and which are
     * to be masked out (left unchanged). The source samples of the image mask
     * determine which areas are painted, acting as an "inverse alpha": if the
     * value of a source sample in the image mask is S, then the corresponding
     * region in `image' is blended with the destination using an alpha of
     * (1-S). (For example, if S is 1, then the region is not painted, while if
     * S is 0, the region is fully painted.)
     * 
     * If `mask' is an image, then it serves as alpha mask for blending the
     * image onto the destination. The source samples of `mask' determine which
     * areas are painted: if the value of the source sample in mask is S, then
     * the corresponding region in image is blended with the destination with an
     * alpha of S. (For example, if S is 0, then the region is not painted,
     * while if S is 1, the region is fully painted.)
     * 
     * The parameter `image' may not be an image mask and may not have an image
     * mask or masking color associated with it.
     * 
     * If `mask' is an image, then it must be in a monochrome color space
     * (e.g. DeviceGray, GenericGray, etc...), may not have alpha, and may not
     * itself be masked by an image mask or a masking color.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithMask(@Nullable CGImageRef image, @Nullable CGImageRef mask);

    /**
     * Create a new image from `image' masked by `components', an array of 2N
     * values { min[1], max[1], ... min[N], max[N] } where N is the number of
     * components in color space of `image'. Any image sample with color value
     * {c[1], ... c[N]} where min[i] <= c[i] <= max[i] for 1 <= i <= N is masked
     * out (that is, not painted).
     * 
     * Each value in `components' must be a valid image sample value: if `image'
     * has integral pixel components, then each value of must be in the range
     * [0..2**bitsPerComponent - 1] (where `bitsPerComponent' is the number of
     * bits/component of `image'); if `image' has floating-point pixel
     * components, then each value may be any floating-point number which is a
     * valid color component.
     * 
     * The parameter `image' may not be an image mask, and may not already have
     * an image mask or masking color associated with it.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithMaskingColors(@Nullable CGImageRef image,
            @Nullable ConstNFloatPtr components);

    /**
     * Create a copy of `image', replacing the image's color space with `space'.
     * Returns NULL if `image' is an image mask, or if the number of components
     * of `space' isn't the same as the number of components of the color space
     * of `image'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateCopyWithColorSpace(@Nullable CGImageRef image,
            @Nullable CGColorSpaceRef space);

    /**
     * Equivalent to `CFRetain(image)'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGImageRetain(@Nullable CGImageRef image);

    /**
     * Equivalent to `CFRelease(image)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGImageRelease(@Nullable CGImageRef image);

    /**
     * Return true if `image' is an image mask, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageIsMask(@Nullable CGImageRef image);

    /**
     * Return the width of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetWidth(@Nullable CGImageRef image);

    /**
     * Return the height of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetHeight(@Nullable CGImageRef image);

    /**
     * Return the number of bits/component of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBitsPerComponent(@Nullable CGImageRef image);

    /**
     * Return the number of bits/pixel of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBitsPerPixel(@Nullable CGImageRef image);

    /**
     * Return the number of bytes/row of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBytesPerRow(@Nullable CGImageRef image);

    /**
     * Return the color space of `image', or NULL if `image' is an image
     * mask.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGImageGetColorSpace(@Nullable CGImageRef image);

    /**
     * Return the alpha info of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGImageGetAlphaInfo(@Nullable CGImageRef image);

    /**
     * Return the data provider of `image'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataProviderRef CGImageGetDataProvider(@Nullable CGImageRef image);

    /**
     * Return the decode array of `image'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstNFloatPtr CGImageGetDecode(@Nullable CGImageRef image);

    /**
     * Return the interpolation parameter of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGImageGetShouldInterpolate(@Nullable CGImageRef image);

    /**
     * Return the rendering intent of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGImageGetRenderingIntent(@Nullable CGImageRef image);

    /**
     * Return the bitmap info of `image'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGImageGetBitmapInfo(@Nullable CGImageRef image);

    /**
     * Return the UTType of `image'.
     * 
     * API-Since: 9.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGImageGetUTType(@Nullable CGImageRef image);

    /**
     * Return the CFTypeID for CGPathRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPathGetTypeID();

    /**
     * Create a mutable path.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutable();

    /**
     * Create a copy of `path'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopy(@Nullable CGPathRef path);

    /**
     * Create a copy of `path' transformed by `transform'.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByTransformingPath(@Nullable CGPathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * Create a mutable copy of `path'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutableCopy(@Nullable CGPathRef path);

    /**
     * Create a mutable copy of `path' transformed by `transform'.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutableCopyByTransformingPath(@Nullable CGPathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * Return a path representing a rectangle bounded by `rect'. The rectangle
     * forms a complete subpath of the path --- that is, it begins with a "move
     * to" and ends with a "close subpath" --- oriented in the clockwise
     * direction. If `transform' is non-NULL, then the lines representing the
     * rectangle will be transformed by `transform' before they are added to the
     * path.
     * 
     * API-Since: 4.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithRect(@ByValue CGRect rect,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * Return a path representing an ellipse bounded by `rect'. The ellipse is
     * approximated by a sequence of Bézier curves. The center of the ellipse is
     * the midpoint of `rect'. If `rect' is square, then the ellipse will be
     * circular with radius equal to one-half the width (equivalently, one-half
     * the height) of `rect'. If `rect' is rectangular, then the major- and
     * minor-axes will be the `width' and `height' of rect. The ellipse forms a
     * complete subpath of the path --- that is, it begins with a "move to" and
     * ends with a "close subpath" --- oriented in the clockwise direction. If
     * `transform' is non-NULL, then the constructed Bézier curves representing
     * the ellipse will be transformed by `transform' before they are added to
     * the path.
     * 
     * API-Since: 5.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithEllipseInRect(@ByValue CGRect rect,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * Return a path representing a rounded rectangle. The rounded rectangle
     * coincides with the edges of `rect'. Each corner is consists of
     * one-quarter of an ellipse with axes equal to `cornerWidth' and
     * `cornerHeight'. The rounded rectangle forms a complete subpath of the
     * path --- that is, it begins with a "move to" and ends with a "close
     * subpath" --- oriented in the clockwise direction. If `transform' is
     * non-NULL, then the path elements representing the rounded rectangle will
     * be transformed by `transform' before they are added to the path.
     * 
     * API-Since: 7.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithRoundedRect(@ByValue CGRect rect, @NFloat double cornerWidth,
            @NFloat double cornerHeight,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * Add a rounded rectangle to `path'. The rounded rectangle coincides with
     * the edges of `rect'. Each corner is consists of one-quarter of an ellipse
     * with axes equal to `cornerWidth' and `cornerHeight'. The rounded
     * rectangle forms a complete subpath of the path --- that is, it begins
     * with a "move to" and ends with a "close subpath" --- oriented in the
     * clockwise direction. If `transform' is non-NULL, then the path elements
     * representing the rounded rectangle will be transformed by `transform'
     * before they are added to the path.
     * 
     * API-Since: 7.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddRoundedRect(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @ByValue CGRect rect, @NFloat double cornerWidth, @NFloat double cornerHeight);

    /**
     * Create a dashed path from `path'. The parameters `phase', `lengths', and
     * `count' have the same meaning as the corresponding parameters for
     * `CGContextSetLineDash'. If `transform' is non-NULL, then the elements of
     * the constructed path will be transformed by `transform' before they are
     * added to the path.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByDashingPath(@Nullable CGPathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @NFloat double phase, @Nullable ConstNFloatPtr lengths, @NUInt long count);

    /**
     * Create a stroked path from `path'. The parameters `lineWidth', `lineCap',
     * `lineJoin', and `miterLimit' have the same meaning as the corresponding
     * CGContext parameters. If `transform' is non-NULL, then the elements of
     * the constructed path will be transformed by `transform' before they are
     * added to the path.
     * 
     * API-Since: 5.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByStrokingPath(@Nullable CGPathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @NFloat double lineWidth, int lineCap, int lineJoin, @NFloat double miterLimit);

    /**
     * Equivalent to `CFRetain(path)', except it doesn't crash (as CFRetain
     * does) if `path' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathRetain(@Nullable CGPathRef path);

    /**
     * Equivalent to `CFRelease(path)', except it doesn't crash (as CFRelease
     * does) if `path' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathRelease(@Nullable CGPathRef path);

    /**
     * Return true if `path1' is equal to `path2'; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPathEqualToPath(@Nullable CGPathRef path1, @Nullable CGPathRef path2);

    /**
     * Move the current point to `(x, y)' in `path' and begin a new subpath. If
     * `m' is non-NULL, then transform `(x, y)' by `m' first.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathMoveToPoint(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double x, @NFloat double y);

    /**
     * Append a straight line segment from the current point to `(x, y)' in
     * `path' and move the current point to `(x, y)'. If `m' is non-NULL, then
     * transform `(x, y)' by `m' first.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddLineToPoint(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double x, @NFloat double y);

    /**
     * Append a quadratic curve from the current point to `(x, y)' with control
     * point `(cpx, cpy)' in `path' and move the current point to `(x, y)'. If
     * `m' is non-NULL, then transform all points by `m' first.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddQuadCurveToPoint(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double cpx, @NFloat double cpy, @NFloat double x, @NFloat double y);

    /**
     * Append a cubic Bézier curve from the current point to `(x,y)' with
     * control points `(cp1x, cp1y)' and `(cp2x, cp2y)' in `path' and move the
     * current point to `(x, y)'. If `m' is non-NULL, then transform all points
     * by `m' first.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddCurveToPoint(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double cp1x, @NFloat double cp1y, @NFloat double cp2x, @NFloat double cp2y, @NFloat double x,
            @NFloat double y);

    /**
     * Append a line from the current point to the starting point of the current
     * subpath of `path' and end the subpath.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathCloseSubpath(@Nullable CGMutablePathRef path);

    /**
     * Add `rect' to `path'. If `m' is non-NULL, then first transform `rect' by
     * `m' before adding it to `path'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddRect(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGRect rect);

    /**
     * Add each rectangle specified by `rects', an array of `count' CGRects, to
     * `path'. If `m' is non-NULL, then first transform each rectangle by `m'
     * before adding it to `path'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddRects(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
            @NUInt long count);

    /**
     * Move to the first element of `points', an array of `count' CGPoints, and
     * append a line from each point to the next point in `points'. If `m' is
     * non-NULL, then first transform each point by `m'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddLines(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
            @NUInt long count);

    /**
     * Add an ellipse (an oval) inside `rect' to `path'. The ellipse is
     * approximated by a sequence of Bézier curves. The center of the ellipse is
     * the midpoint of `rect'. If `rect' is square, then the ellipse will be
     * circular with radius equal to one-half the width (equivalently, one-half
     * the height) of `rect'. If `rect' is rectangular, then the major- and
     * minor-axes will be the `width' and `height' of rect. The ellipse forms a
     * complete subpath of `path' --- that is, it begins with a "move to" and
     * ends with a "close subpath" --- oriented in the clockwise direction. If
     * `m' is non-NULL, then the constructed Bézier curves representing the
     * ellipse will be transformed by `m' before they are added to `path'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddEllipseInRect(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGRect rect);

    /**
     * Add an arc of a circle to `path', possibly preceded by a straight line
     * segment. The arc is approximated by a sequence of Bézier curves. The
     * center of the arc is `(x,y)'; `radius' is its radius. `startAngle' is the
     * angle to the first endpoint of the arc, measured counter-clockwise from
     * the positive x-axis. `startAngle + delta' is the angle to the second
     * endpoint of the arc. If `delta' is positive, then the arc is drawn
     * counter-clockwise; if negative, clockwise. `startAngle' and `delta' are
     * measured in radians. If `matrix' is non-NULL, then the constructed Bézier
     * curves representing the arc will be transformed by `matrix' before they
     * are added to the path.
     * 
     * API-Since: 5.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddRelativeArc(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NFloat double x, @NFloat double y, @NFloat double radius, @NFloat double startAngle, @NFloat double delta);

    /**
     * Add an arc of a circle to `path', possibly preceded by a straight line
     * segment. The arc is approximated by a sequence of Bézier curves. `(x, y)'
     * is the center of the arc; `radius' is its radius; `startAngle' is the
     * angle to the first endpoint of the arc; `endAngle' is the angle to the
     * second endpoint of the arc; and `clockwise' is true if the arc is to be
     * drawn clockwise, false otherwise. `startAngle' and `endAngle' are
     * measured in radians. If `m' is non-NULL, then the constructed Bézier
     * curves representing the arc will be transformed by `m' before they are
     * added to `path'.
     * 
     * Note that using values very near 2π can be problematic. For example,
     * setting `startAngle' to 0, `endAngle' to 2π, and `clockwise' to true will
     * draw nothing. (It's easy to see this by considering, instead of 0 and 2π,
     * the values ε and 2π - ε, where ε is very small.) Due to round-off error,
     * however, it's possible that passing the value `2 * M_PI' to approximate
     * 2π will numerically equal to 2π + δ, for some small δ; this will cause a
     * full circle to be drawn.
     * 
     * If you want a full circle to be drawn clockwise, you should set
     * `startAngle' to 2π, `endAngle' to 0, and `clockwise' to true. This avoids
     * the instability problems discussed above.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddArc(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double x, @NFloat double y, @NFloat double radius, @NFloat double startAngle,
            @NFloat double endAngle, boolean clockwise);

    /**
     * Add an arc of a circle to `path', possibly preceded by a straight line
     * segment. The arc is approximated by a sequence of Bézier curves. `radius'
     * is the radius of the arc. The resulting arc is tangent to the line from
     * the current point of `path' to `(x1, y1)', and the line from `(x1, y1)'
     * to `(x2, y2)'. If `m' is non-NULL, then the constructed Bézier curves
     * representing the arc will be transformed by `m' before they are added to
     * `path'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddArcToPoint(@Nullable CGMutablePathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double x1, @NFloat double y1, @NFloat double x2, @NFloat double y2, @NFloat double radius);

    /**
     * Add `path2' to `path1'. If `m' is non-NULL, then the points in `path2'
     * will be transformed by `m' before they are added to `path1'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathAddPath(@Nullable CGMutablePathRef path1,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @Nullable CGPathRef path2);

    /**
     * Return true if `path' contains no elements, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPathIsEmpty(@Nullable CGPathRef path);

    /**
     * Return true if `path' represents a rectangle, false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPathIsRect(@Nullable CGPathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect rect);

    /**
     * Return the current point of the current subpath of `path'. If there is no
     * current point, then return CGPointZero.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGPathGetCurrentPoint(@Nullable CGPathRef path);

    /**
     * Return the bounding box of `path'. The bounding box is the smallest
     * rectangle completely enclosing all points in the path, including control
     * points for Bézier cubic and quadratic curves. If the path is empty, then
     * return `CGRectNull'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPathGetBoundingBox(@Nullable CGPathRef path);

    /**
     * Return the path bounding box of `path'. The path bounding box is the
     * smallest rectangle completely enclosing all points in the path, *not*
     * including control points for Bézier cubic and quadratic curves. If the
     * path is empty, then return `CGRectNull'.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPathGetPathBoundingBox(@Nullable CGPathRef path);

    /**
     * Return true if `point' is contained in `path'; false otherwise. A point
     * is contained in a path if it is inside the painted region when the path
     * is filled; if `eoFill' is true, then the even-odd fill rule is used to
     * evaluate the painted region of the path, otherwise, the winding-number
     * fill rule is used. If `m' is non-NULL, then the point is transformed by
     * `m' before determining whether the path contains it.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPathContainsPoint(@Nullable CGPathRef path,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGPoint point, boolean eoFill);

    /**
     * For element of `path', call `function', passing it the path element and
     * `info'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPathApply(@Nullable CGPathRef path, @Nullable VoidPtr info,
            @Nullable @FunctionPtr(name = "call_CGPathApply") Function_CGPathApply function);

    /**
     * Return the type of `object'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGPDFObjectGetType(@Nullable CGPDFObjectRef object);

    /**
     * Get the value of `object'. If the type of `object' is equal to `type',
     * then copy the value of `object' to `value' (if it's non-NULL) and return
     * true. Otherwise, if the type of `object' is `kCGPDFObjectTypeInteger' and
     * `type' is equal to `kCGPDFObjectTypeReal', then convert the value of
     * `object' to floating point and copy the result to `value' (if it's
     * non-NULL) and return true. Otherwise, return false.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFObjectGetValue(@Nullable CGPDFObjectRef object, int type,
            @Nullable VoidPtr value);

    /**
     * Return the dictionary of `stream'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFStreamGetDictionary(@Nullable CGPDFStreamRef stream);

    /**
     * Return the data of `stream'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDataRef CGPDFStreamCopyData(@Nullable CGPDFStreamRef stream, @Nullable IntPtr format);

    /**
     * Return the length of `string'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFStringGetLength(@Nullable CGPDFStringRef string);

    /**
     * Return a pointer to the bytes of `string'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CGPDFStringGetBytePtr(@Nullable CGPDFStringRef string);

    /**
     * Return a CFString representing `string' as a "text string". See Section
     * 3.8.1 "Text Strings", PDF Reference: Adobe PDF version 1.6 (5th ed.) for
     * more information.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGPDFStringCopyTextString(@Nullable CGPDFStringRef string);

    /**
     * Convert `string' to a CFDate. See Section 3.8.3 "Dates", PDF Reference:
     * Adobe PDF version 1.6 (5th ed.) for more information.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDateRef CGPDFStringCopyDate(@Nullable CGPDFStringRef string);

    /**
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFArrayGetCount(@Nullable CGPDFArrayRef array);

    /**
     * Look up the object at `index' in `array' and return the result in
     * `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetObject(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable Ptr<CGPDFObjectRef> value);

    /**
     * Look up the object at `index' in `array' and, if it's a null, return
     * true; otherwise, return false.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetNull(@Nullable CGPDFArrayRef array, @NUInt long index);

    /**
     * Look up the object at `index' in `array' and, if it's a boolean, return
     * the result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetBoolean(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable BytePtr value);

    /**
     * Look up the object at `index' in `array' and, if it's an integer, return
     * the result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetInteger(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable NIntPtr value);

    /**
     * Look up the object at `index' in `array' and, if it's a number (real or
     * integer), return the result in `value'. Return true on success; false
     * otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetNumber(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable NFloatPtr value);

    /**
     * Look up the object at `index' in `array' and, if it's a name, return the
     * result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetName(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    /**
     * Look up the object at `index' in `array' and, if it's a string, return
     * the result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetString(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable Ptr<CGPDFStringRef> value);

    /**
     * Look up the object at `index' in `array' and, if it's an array, return it
     * in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetArray(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable Ptr<CGPDFArrayRef> value);

    /**
     * Look up the object at `index' in `array' and, if it's a dictionary,
     * return it in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetDictionary(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable Ptr<CGPDFDictionaryRef> value);

    /**
     * Look up the object at `index' in `array' and, if it's a stream, return it
     * in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetStream(@Nullable CGPDFArrayRef array, @NUInt long index,
            @Nullable Ptr<CGPDFStreamRef> value);

    /**
     * Return the number of entries in `dictionary'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDictionaryGetCount(@Nullable CGPDFDictionaryRef dict);

    /**
     * Look up the object associated with `key' in `dict' and return the result
     * in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetObject(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable Ptr<CGPDFObjectRef> value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's a
     * boolean, return the result in `value'. Return true on success; false
     * otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetBoolean(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable BytePtr value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's an
     * integer, return the result in `value'. Return true on success; false
     * otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetInteger(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable NIntPtr value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's a number
     * (real or integer), return the result in `value'. Return true on success;
     * false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetNumber(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable NFloatPtr value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's a name,
     * return the result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetName(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's a string,
     * return the result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetString(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable Ptr<CGPDFStringRef> value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's an array,
     * return the result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetArray(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable Ptr<CGPDFArrayRef> value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's a
     * dictionary, return the result in `value'. Return true on success; false
     * otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetDictionary(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable Ptr<CGPDFDictionaryRef> value);

    /**
     * Look up the object associated with `key' in `dict' and, if it's a stream,
     * return the result in `value'. Return true on success; false otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetStream(@Nullable CGPDFDictionaryRef dict,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @Nullable Ptr<CGPDFStreamRef> value);

    /**
     * Enumerate all of the keys in `dict', calling `function' once for each
     * key/value pair. Passes the current key, the associated value, and `info'
     * to `function'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFDictionaryApplyFunction(@Nullable CGPDFDictionaryRef dict,
            @Nullable @FunctionPtr(name = "call_CGPDFDictionaryApplyFunction") Function_CGPDFDictionaryApplyFunction function,
            @Nullable VoidPtr info);

    /**
     * Equivalent to `CFRetain(page)', except it doesn't crash (as CFRetain
     * does) if `page' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFPageRef CGPDFPageRetain(@Nullable CGPDFPageRef page);

    /**
     * Equivalent to `CFRelease(page)', except it doesn't crash (as CFRelease
     * does) if `page' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFPageRelease(@Nullable CGPDFPageRef page);

    /**
     * Return the document of `page'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFPageGetDocument(@Nullable CGPDFPageRef page);

    /**
     * Return the page number of `page'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFPageGetPageNumber(@Nullable CGPDFPageRef page);

    /**
     * Return the rectangle associated with `box' in `page'. This is the value
     * of the corresponding entry (such as /MediaBox, /ArtBox, and so on) in the
     * page's dictionary. Return CGRectNull if `page' is not a valid CGPDFPageRef
     * or `box' is not a valid CGPDFBox.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPDFPageGetBoxRect(@Nullable CGPDFPageRef page, int box);

    /**
     * Return the rotation angle (in degrees) of `page'. This is the value of
     * the /Rotate entry in the page's dictionary. Return 0 if `page' is not a valid
     * CGPDFPageRef.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGPDFPageGetRotationAngle(@Nullable CGPDFPageRef page);

    /**
     * Return a transform mapping the box specified by `box' to `rect' as
     * follows:
     * - Compute the effective rect by intersecting the rect associated with
     * `box' and the /MediaBox entry of the page.
     * - Rotate the effective rect according to the page's /Rotate entry.
     * - Center the resulting rect on `rect'. If `rotation' is non-zero, then
     * the rect will rotated clockwise by `rotation' degrees. `rotation'
     * must be a multiple of 90.
     * - Scale the rect down, if necessary, so that it coincides with the
     * edges of `rect'. If `preserveAspectRatio' is true, then the final
     * rect will coincide with the edges of `rect' only in the more
     * restrictive dimension.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGPDFPageGetDrawingTransform(@Nullable CGPDFPageRef page, int box,
            @ByValue CGRect rect, int rotate, boolean preserveAspectRatio);

    /**
     * Return the dictionary of `page'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFPageGetDictionary(@Nullable CGPDFPageRef page);

    /**
     * Return the CFTypeID for CGPDFPageRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFPageGetTypeID();

    /**
     * Create a PDF document, using `provider' to obtain the document's data.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentCreateWithProvider(@Nullable CGDataProviderRef provider);

    /**
     * Create a PDF document from `url'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentCreateWithURL(@Nullable CFURLRef url);

    /**
     * Equivalent to `CFRetain(document)', except it doesn't crash (as CFRetain
     * does) if `document' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentRetain(@Nullable CGPDFDocumentRef document);

    /**
     * Equivalent to `CFRelease(document)', except it doesn't crash (as
     * CFRelease does) if `document' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFDocumentRelease(@Nullable CGPDFDocumentRef document);

    /**
     * Return the major and minor version numbers of `document'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFDocumentGetVersion(@Nullable CGPDFDocumentRef document, @NotNull IntPtr majorVersion,
            @NotNull IntPtr minorVersion);

    /**
     * Return true if the PDF file associated with `document' is encrypted;
     * false otherwise. If the PDF file is encrypted, then a password must be
     * supplied before certain operations are enabled; different passwords may
     * enable different operations.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentIsEncrypted(@Nullable CGPDFDocumentRef document);

    /**
     * Use `password' to decrypt `document' and grant permission for certain
     * operations. Returns true if `password' is a valid password; false
     * otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentUnlockWithPassword(@Nullable CGPDFDocumentRef document,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String password);

    /**
     * Return true if `document' is unlocked; false otherwise. A document is
     * unlocked if it isn't encrypted, or if it is encrypted and a valid
     * password was specified with `CGPDFDocumentUnlockWithPassword'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentIsUnlocked(@Nullable CGPDFDocumentRef document);

    /**
     * Return true if `document' allows printing; false otherwise. Typically,
     * this function returns false only if the document is encrypted and the
     * document's current password doesn't grant permission to perform
     * printing.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentAllowsPrinting(@Nullable CGPDFDocumentRef document);

    /**
     * Return true if `document' allows copying; false otherwise. Typically,
     * this function returns false only if the document is encrypted and the
     * document's current password doesn't grant permission to perform
     * copying.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentAllowsCopying(@Nullable CGPDFDocumentRef document);

    /**
     * Return the number of pages in `document'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDocumentGetNumberOfPages(@Nullable CGPDFDocumentRef document);

    /**
     * Return the page corresponding to `pageNumber', or NULL if no such page
     * exists in the document. Pages are numbered starting at 1.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFPageRef CGPDFDocumentGetPage(@Nullable CGPDFDocumentRef document, @NUInt long pageNumber);

    /**
     * Return the document catalog of `document'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFDocumentGetCatalog(@Nullable CGPDFDocumentRef document);

    /**
     * Return the info dictionary of `document'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFDocumentGetInfo(@Nullable CGPDFDocumentRef document);

    /**
     * Return the "file identifier" array of `document'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFArrayRef CGPDFDocumentGetID(@Nullable CGPDFDocumentRef document);

    /**
     * Return the CFTypeID for CGPDFDocumentRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDocumentGetTypeID();

    /**
     * Return the CFTypeID for CGFunctionRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGFunctionGetTypeID();

    /**
     * Create a CGFunction using `callbacks' to evaluate the function. `info' is
     * passed to each of the callback functions. `domainDimension' is the number
     * of input values to the function; `rangeDimension' is the number of output
     * values from the function.
     * 
     * `domain' is an array of 2M values, where M is the number of input values.
     * For each k from 0 to M-1, domain[2*k] must be less than or equal to
     * domain[2*k+1]. The k'th input value (in[k]) will be clipped to lie in
     * this interval, so that domain[2*k] <= in[k] <= domain[2*k+1]. If `domain'
     * is NULL, then the input values will not be clipped. However, it's
     * strongly recommended that `domain' be specified; each domain interval
     * should specify reasonable values for the minimum and maximum in that
     * dimension.
     * 
     * `range' is an array of 2N values, where N is the number of output values.
     * For each k from 0 to N-1, range[2*k] must be less than or equal to
     * range[2*k+1]. The k'th output value (out[k]) will be clipped to lie in
     * this interval, so that range[2*k] <= out[k] <= range[2*k+1]. If `range'
     * is NULL, then the output values will not be clipped. However, it's
     * strongly recommended that `range' be specified; each range interval
     * should specify reasonable values for the minimum and maximum in that
     * dimension.
     * 
     * The contents of the callbacks structure is copied, so, for example, a
     * pointer to a structure on the stack can be passed to this function.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGFunctionRef CGFunctionCreate(@Nullable VoidPtr info, @NUInt long domainDimension,
            @Nullable ConstNFloatPtr domain, @NUInt long rangeDimension, @Nullable ConstNFloatPtr range,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGFunctionCallbacks callbacks);

    /**
     * Equivalent to `CFRetain(function)', except it doesn't crash (as CFRetain
     * does) if `function' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGFunctionRef CGFunctionRetain(@Nullable CGFunctionRef function);

    /**
     * Equivalent to `CFRelease(function)', except it doesn't crash (as
     * CFRelease does) if `function' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGFunctionRelease(@Nullable CGFunctionRef function);

    /**
     * Return the CFTypeID for CGShadingRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGShadingGetTypeID();

    /**
     * Create a shading defining a color blend which varies along a linear axis
     * between two endpoints and extends indefinitely perpendicular to that
     * axis. The shading may optionally extend beyond either endpoint by
     * continuing the boundary colors indefinitely. The color values are
     * specified in the color space `space'. The starting point of the axis is
     * `start' and the ending point of the axis is `end', both specified in the
     * shading's target coordinate space. The shading function, specified by
     * `function', is a 1-in, N-out function, where N is one more (for alpha)
     * than the number of color components in the shading's color space. The
     * input value 0 corresponds to the color at the starting point of the
     * shading; the input value 1 corresponds to the color at the ending point
     * of the shading. If `extendStart' is true, then the shading will extend
     * beyond the starting point of the axis. If `extendEnd' is true, then the
     * shading will extend beyond the ending point of the axis.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGShadingRef CGShadingCreateAxial(@Nullable CGColorSpaceRef space, @ByValue CGPoint start,
            @ByValue CGPoint end, @Nullable CGFunctionRef function, boolean extendStart, boolean extendEnd);

    /**
     * Create a shading defining a color blend which varies between two circles.
     * The shading may optionally extend beyond either circle by continuing the
     * boundary colors. The color values are specified in the color space
     * `space'. The starting circle has radius `startRadius' and is centered at
     * `start', specified in the shading's target coordinate space. The ending
     * circle has radius `endRadius' and is centered at `end', specified in the
     * shading's target coordinate space. The shading function, specified by
     * `function', is a 1-in, N-out function, where N is one more (for alpha)
     * than the number of color components in the shading's color space. The
     * input value 0 corresponds to the color of the starting circle; the input
     * value 1 corresponds to the color of the ending circle. If `extendStart'
     * is true, then the shading will extend beyond the starting circle. If
     * `extendEnd' is true, then the shading will extend beyond the ending
     * circle.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGShadingRef CGShadingCreateRadial(@Nullable CGColorSpaceRef space, @ByValue CGPoint start,
            @NFloat double startRadius, @ByValue CGPoint end, @NFloat double endRadius,
            @Nullable CGFunctionRef function, boolean extendStart, boolean extendEnd);

    /**
     * Equivalent to `CFRetain(shading)', except it doesn't crash (as CFRetain
     * does) if `shading' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGShadingRef CGShadingRetain(@Nullable CGShadingRef shading);

    /**
     * Equivalent to `CFRelease(shading)', except it doesn't crash (as CFRelease
     * does) if `shading' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGShadingRelease(@Nullable CGShadingRef shading);

    /**
     * Return the CFTypeID for CGContextRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGContextGetTypeID();

    /**
     * Push a copy of the current graphics state onto the graphics state stack.
     * Note that the path is not considered part of the graphics state, and is
     * not saved.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSaveGState(@Nullable CGContextRef c);

    /**
     * Restore the current graphics state from the one on the top of the
     * graphics state stack, popping the graphics state stack in the process.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextRestoreGState(@Nullable CGContextRef c);

    /**
     * Scale the current graphics state's transformation matrix (the CTM) by
     * `(sx, sy)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextScaleCTM(@Nullable CGContextRef c, @NFloat double sx, @NFloat double sy);

    /**
     * Translate the current graphics state's transformation matrix (the CTM) by
     * `(tx, ty)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextTranslateCTM(@Nullable CGContextRef c, @NFloat double tx, @NFloat double ty);

    /**
     * Rotate the current graphics state's transformation matrix (the CTM) by
     * `angle' radians.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextRotateCTM(@Nullable CGContextRef c, @NFloat double angle);

    /**
     * Concatenate the current graphics state's transformation matrix (the CTM)
     * with the affine transform `transform'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextConcatCTM(@Nullable CGContextRef c, @ByValue CGAffineTransform transform);

    /**
     * Return the current graphics state's transformation matrix. Returns
     * CGAffineTransformIdentity in case of inavlid context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetCTM(@Nullable CGContextRef c);

    /**
     * Set the line width in the current graphics state to `width'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineWidth(@Nullable CGContextRef c, @NFloat double width);

    /**
     * Set the line cap in the current graphics state to `cap'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineCap(@Nullable CGContextRef c, int cap);

    /**
     * Set the line join in the current graphics state to `join'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineJoin(@Nullable CGContextRef c, int join);

    /**
     * Set the miter limit in the current graphics state to `limit'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetMiterLimit(@Nullable CGContextRef c, @NFloat double limit);

    /**
     * Set the line dash patttern in the current graphics state of `c'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineDash(@Nullable CGContextRef c, @NFloat double phase,
            @Nullable ConstNFloatPtr lengths, @NUInt long count);

    /**
     * Set the path flatness parameter in the current graphics state of `c' to
     * `flatness'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetFlatness(@Nullable CGContextRef c, @NFloat double flatness);

    /**
     * Set the alpha value in the current graphics state of `c' to `alpha'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetAlpha(@Nullable CGContextRef c, @NFloat double alpha);

    /**
     * Set the blend mode of `context' to `mode'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetBlendMode(@Nullable CGContextRef c, int mode);

    /**
     * Begin a new path. The old path is discarded.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextBeginPath(@Nullable CGContextRef c);

    /**
     * Start a new subpath at point `(x, y)' in the context's path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextMoveToPoint(@Nullable CGContextRef c, @NFloat double x, @NFloat double y);

    /**
     * Append a straight line segment from the current point to `(x, y)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddLineToPoint(@Nullable CGContextRef c, @NFloat double x, @NFloat double y);

    /**
     * Append a cubic Bezier curve from the current point to `(x,y)', with
     * control points `(cp1x, cp1y)' and `(cp2x, cp2y)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddCurveToPoint(@Nullable CGContextRef c, @NFloat double cp1x,
            @NFloat double cp1y, @NFloat double cp2x, @NFloat double cp2y, @NFloat double x, @NFloat double y);

    /**
     * Append a quadratic curve from the current point to `(x, y)', with control
     * point `(cpx, cpy)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddQuadCurveToPoint(@Nullable CGContextRef c, @NFloat double cpx,
            @NFloat double cpy, @NFloat double x, @NFloat double y);

    /**
     * Close the current subpath of the context's path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextClosePath(@Nullable CGContextRef c);

    /**
     * Add a single rect to the context's path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Add a set of rects to the context's path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddRects(@Nullable CGContextRef c,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
            @NUInt long count);

    /**
     * Add a set of lines to the context's path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddLines(@Nullable CGContextRef c,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
            @NUInt long count);

    /**
     * Add an ellipse inside `rect' to the current path of `context'. See the
     * function `CGPathAddEllipseInRect' for more information on how the path
     * for the ellipse is constructed.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddEllipseInRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Add an arc of a circle to the context's path, possibly preceded by a
     * straight line segment. `(x, y)' is the center of the arc; `radius' is its
     * radius; `startAngle' is the angle to the first endpoint of the arc;
     * `endAngle' is the angle to the second endpoint of the arc; and
     * `clockwise' is 1 if the arc is to be drawn clockwise, 0 otherwise.
     * `startAngle' and `endAngle' are measured in radians.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddArc(@Nullable CGContextRef c, @NFloat double x, @NFloat double y,
            @NFloat double radius, @NFloat double startAngle, @NFloat double endAngle, int clockwise);

    /**
     * Add an arc of a circle to the context's path, possibly preceded by a
     * straight line segment. `radius' is the radius of the arc. The arc is
     * tangent to the line from the current point to `(x1, y1)', and the line
     * from `(x1, y1)' to `(x2, y2)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddArcToPoint(@Nullable CGContextRef c, @NFloat double x1, @NFloat double y1,
            @NFloat double x2, @NFloat double y2, @NFloat double radius);

    /**
     * Add `path' to the path of context. The points in `path' are transformed
     * by the CTM of context before they are added.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextAddPath(@Nullable CGContextRef c, @Nullable CGPathRef path);

    /**
     * Replace the path in `context' with the stroked version of the path, using
     * the parameters of `context' to calculate the stroked path. The resulting
     * path is created such that filling it with the appropriate color will
     * produce the same results as stroking the original path. You can use this
     * path in the same way you can use the path of any context; for example,
     * you can clip to the stroked version of a path by calling this function
     * followed by a call to "CGContextClip".
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextReplacePathWithStrokedPath(@Nullable CGContextRef c);

    /**
     * Return true if the path of `context' contains no elements, false
     * otherwise.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGContextIsPathEmpty(@Nullable CGContextRef c);

    /**
     * Return the current point of the current subpath of the path of
     * `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextGetPathCurrentPoint(@Nullable CGContextRef c);

    /**
     * Return the bounding box of the path of `context'. The bounding box is the
     * smallest rectangle completely enclosing all points in the path, including
     * control points for Bezier and quadratic curves.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextGetPathBoundingBox(@Nullable CGContextRef c);

    /**
     * Return a copy of the path of `context'. The returned path is specified in
     * the current user space of `context'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGContextCopyPath(@Nullable CGContextRef c);

    /**
     * Return true if `point' is contained in the current path of `context'. A
     * point is contained within a context's path if it is inside the painted
     * region when the path is stroked or filled with opaque colors using the
     * path drawing mode `mode'. `point' is specified is user space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGContextPathContainsPoint(@Nullable CGContextRef c, @ByValue CGPoint point, int mode);

    /**
     * Draw the context's path using drawing mode `mode'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawPath(@Nullable CGContextRef c, int mode);

    /**
     * Fill the context's path using the winding-number fill rule. Any open
     * subpath of the path is implicitly closed.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextFillPath(@Nullable CGContextRef c);

    /**
     * Fill the context's path using the even-odd fill rule. Any open subpath of
     * the path is implicitly closed.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextEOFillPath(@Nullable CGContextRef c);

    /**
     * Stroke the context's path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextStrokePath(@Nullable CGContextRef c);

    /**
     * Fill `rect' with the current fill color.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextFillRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Fill `rects', an array of `count' CGRects, with the current fill
     * color.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextFillRects(@Nullable CGContextRef c,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
            @NUInt long count);

    /**
     * Stroke `rect' with the current stroke color and the current linewidth.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Stroke `rect' with the current stroke color, using `width' as the the
     * line width.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeRectWithWidth(@Nullable CGContextRef c, @ByValue CGRect rect,
            @NFloat double width);

    /**
     * Clear `rect' (that is, set the region within the rect to transparent).
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextClearRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Fill an ellipse (an oval) inside `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextFillEllipseInRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Stroke an ellipse (an oval) inside `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeEllipseInRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Stroke a sequence of line segments one after another in `context'. The
     * line segments are specified by `points', an array of `count' CGPoints.
     * This function is equivalent to
     * 
     * CGContextBeginPath(context);
     * for (k = 0; k < count; k += 2) {
     * CGContextMoveToPoint(context, s[k].x, s[k].y);
     * CGContextAddLineToPoint(context, s[k+1].x, s[k+1].y);
     * }
     * CGContextStrokePath(context);
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeLineSegments(@Nullable CGContextRef c,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points,
            @NUInt long count);

    /**
     * Intersect the context's path with the current clip path and use the
     * resulting path as the clip path for subsequent rendering operations. Use
     * the winding-number fill rule for deciding what's inside the path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextClip(@Nullable CGContextRef c);

    /**
     * Intersect the context's path with the current clip path and use the
     * resulting path as the clip path for subsequent rendering operations. Use
     * the even-odd fill rule for deciding what's inside the path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextEOClip(@Nullable CGContextRef c);

    /**
     * Add `mask' transformed to `rect' to the clipping area of `context'. The
     * mask, which may be either an image mask or an image, is mapped into the
     * specified rectangle and intersected with the current clipping area of the
     * context.
     * 
     * If `mask' is an image mask, then it clips in a manner identical to the
     * behavior if it were used with "CGContextDrawImage": it indicates an area
     * to be masked out (left unchanged) when drawing. The source samples of the
     * image mask determine which points of the clipping area are changed,
     * acting as an "inverse alpha": if the value of a source sample in the
     * image mask is S, then the corresponding point in the current clipping
     * area will be multiplied by an alpha of (1-S). (For example, if S is 1,
     * then the point in the clipping area becomes clear, while if S is 0, the
     * point in the clipping area is unchanged.
     * 
     * If `mask' is an image, then it serves as alpha mask and is blended with
     * the current clipping area. The source samples of mask determine which
     * points of the clipping area are changed: if the value of the source
     * sample in mask is S, then the corresponding point in the current clipping
     * area will be multiplied by an alpha of S. (For example, if S is 0, then
     * the point in the clipping area becomes clear, while if S is 1, the point
     * in the clipping area is unchanged.
     * 
     * If `mask' is an image, then its color space must be of kCGColorSpaceModelMonochrome
     * model, may not have alpha, and may not be masked by an image mask or masking
     * color.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextClipToMask(@Nullable CGContextRef c, @ByValue CGRect rect,
            @Nullable CGImageRef mask);

    /**
     * Return the bounding box of the clip path of `c' in user space. The
     * bounding box is the smallest rectangle completely enclosing all points in
     * the clip.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextGetClipBoundingBox(@Nullable CGContextRef c);

    /**
     * Intersect the current clipping path with `rect'. Note that this function
     * resets the context's path to the empty path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextClipToRect(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Intersect the current clipping path with the clipping region formed by
     * creating a path consisting of all rects in `rects'. Note that this
     * function resets the context's path to the empty path.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextClipToRects(@Nullable CGContextRef c,
            @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects,
            @NUInt long count);

    /**
     * Set the current fill color in the context `c' to `color'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillColorWithColor(@Nullable CGContextRef c, @Nullable CGColorRef color);

    /**
     * Set the current stroke color in the context `c' to `color'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokeColorWithColor(@Nullable CGContextRef c, @Nullable CGColorRef color);

    /**
     * Set the current fill color space in `context' to `space'. As a
     * side-effect, set the fill color to a default value appropriate for the
     * color space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillColorSpace(@Nullable CGContextRef c, @Nullable CGColorSpaceRef space);

    /**
     * Set the current stroke color space in `context' to `space'. As a
     * side-effect, set the stroke color to a default value appropriate for the
     * color space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokeColorSpace(@Nullable CGContextRef c, @Nullable CGColorSpaceRef space);

    /**
     * Set the components of the current fill color in `context' to the values
     * specifed by `components'. The number of elements in `components' must be
     * one greater than the number of components in the current fill color space
     * (N color components + 1 alpha component). The current fill color space
     * must not be a pattern color space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillColor(@Nullable CGContextRef c, @Nullable ConstNFloatPtr components);

    /**
     * Set the components of the current stroke color in `context' to the values
     * specifed by `components'. The number of elements in `components' must be
     * one greater than the number of components in the current stroke color
     * space (N color components + 1 alpha component). The current stroke color
     * space must not be a pattern color space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokeColor(@Nullable CGContextRef c, @Nullable ConstNFloatPtr components);

    /**
     * Set the components of the current fill color in `context' to the values
     * specifed by `components', and set the current fill pattern to `pattern'.
     * The number of elements in `components' must be one greater than the
     * number of components in the current fill color space (N color components
     * + 1 alpha component). The current fill color space must be a pattern
     * color space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillPattern(@Nullable CGContextRef c, @Nullable CGPatternRef pattern,
            @Nullable ConstNFloatPtr components);

    /**
     * Set the components of the current stroke color in `context' to the values
     * specifed by `components', and set the current stroke pattern to
     * `pattern'. The number of elements in `components' must be one greater
     * than the number of components in the current stroke color space (N color
     * components + 1 alpha component). The current stroke color space must be a
     * pattern color space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokePattern(@Nullable CGContextRef c, @Nullable CGPatternRef pattern,
            @Nullable ConstNFloatPtr components);

    /**
     * Set the pattern phase in the current graphics state of `context' to
     * `phase'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetPatternPhase(@Nullable CGContextRef c, @ByValue CGSize phase);

    /**
     * Set the current fill color space in `context' to `DeviceGray' and set the
     * components of the current fill color to `(gray, alpha)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetGrayFillColor(@Nullable CGContextRef c, @NFloat double gray,
            @NFloat double alpha);

    /**
     * Set the current stroke color space in `context' to `DeviceGray' and set
     * the components of the current stroke color to `(gray, alpha)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetGrayStrokeColor(@Nullable CGContextRef c, @NFloat double gray,
            @NFloat double alpha);

    /**
     * Set the current fill color space in `context' to `DeviceRGB' and set the
     * components of the current fill color to `(red, green, blue, alpha)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetRGBFillColor(@Nullable CGContextRef c, @NFloat double red,
            @NFloat double green, @NFloat double blue, @NFloat double alpha);

    /**
     * Set the current stroke color space in `context' to `DeviceRGB' and set
     * the components of the current stroke color to `(red, green, blue,
     * alpha)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetRGBStrokeColor(@Nullable CGContextRef c, @NFloat double red,
            @NFloat double green, @NFloat double blue, @NFloat double alpha);

    /**
     * Set the current fill color space in `context' to `DeviceCMYK' and set the
     * components of the current fill color to `(cyan, magenta, yellow, black,
     * alpha)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetCMYKFillColor(@Nullable CGContextRef c, @NFloat double cyan,
            @NFloat double magenta, @NFloat double yellow, @NFloat double black, @NFloat double alpha);

    /**
     * Set the current stroke color space in `context' to `DeviceCMYK' and set
     * the components of the current stroke color to `(cyan, magenta, yellow,
     * black, alpha)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetCMYKStrokeColor(@Nullable CGContextRef c, @NFloat double cyan,
            @NFloat double magenta, @NFloat double yellow, @NFloat double black, @NFloat double alpha);

    /**
     * Set the rendering intent in the current graphics state of `context' to
     * `intent'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetRenderingIntent(@Nullable CGContextRef c, int intent);

    /**
     * Draw `image' in the rectangular area specified by `rect' in the context
     * `c'. The image is scaled, if necessary, to fit into `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawImage(@Nullable CGContextRef c, @ByValue CGRect rect,
            @Nullable CGImageRef image);

    /**
     * Draw `image' tiled in the context `c'. The image is scaled to the size
     * specified by `rect' in user space, positioned at the origin of `rect' in
     * user space, then replicated, stepping the width of `rect' horizontally
     * and the height of `rect' vertically, to fill the current clip region.
     * Unlike patterns, the image is tiled in user space, so transformations
     * applied to the CTM affect the final result.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawTiledImage(@Nullable CGContextRef c, @ByValue CGRect rect,
            @Nullable CGImageRef image);

    /**
     * Return the interpolation quality for image rendering of `context'. The
     * interpolation quality is a gstate parameter which controls the level of
     * interpolation performed when an image is interpolated (for example, when
     * scaling the image). Note that it is merely a hint to the context: not all
     * contexts support all interpolation quality levels.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGContextGetInterpolationQuality(@Nullable CGContextRef c);

    /**
     * Set the interpolation quality of `context' to `quality'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetInterpolationQuality(@Nullable CGContextRef c, int quality);

    /**
     * Set the shadow parameters in `context'. `offset' specifies a translation
     * in base-space; `blur' is a non-negative number specifying the amount of
     * blur; `color' specifies the color of the shadow, which may contain a
     * non-opaque alpha value. If `color' is NULL, it's equivalent to specifying
     * a fully transparent color. The shadow is a gstate parameter. After a
     * shadow is specified, all objects drawn subsequently will be shadowed. To
     * turn off shadowing, set the shadow color to a fully transparent color (or
     * pass NULL as the color), or use the standard gsave/grestore mechanism.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetShadowWithColor(@Nullable CGContextRef c, @ByValue CGSize offset,
            @NFloat double blur, @Nullable CGColorRef color);

    /**
     * Equivalent to calling
     * CGContextSetShadowWithColor(context, offset, blur, color)
     * where color is black with 1/3 alpha (i.e., RGBA = {0, 0, 0, 1.0/3.0}) in
     * the DeviceRGB color space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetShadow(@Nullable CGContextRef c, @ByValue CGSize offset, @NFloat double blur);

    /**
     * Fill the current clipping region of `context' with a linear gradient from
     * `startPoint' to `endPoint'. The location 0 of `gradient' corresponds to
     * `startPoint'; the location 1 of `gradient' corresponds to `endPoint';
     * colors are linearly interpolated between these two points based on the
     * values of the gradient's locations. The option flags control whether the
     * gradient is drawn before the start point or after the end point.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawLinearGradient(@Nullable CGContextRef c, @Nullable CGGradientRef gradient,
            @ByValue CGPoint startPoint, @ByValue CGPoint endPoint, int options);

    /**
     * Fill the current clipping region of `context' with a radial gradient
     * between two circles defined by the center point and radius of each
     * circle. The location 0 of `gradient' corresponds to a circle centered at
     * `startCenter' with radius `startRadius'; the location 1 of `gradient'
     * corresponds to a circle centered at `endCenter' with radius `endRadius';
     * colors are linearly interpolated between these two circles based on the
     * values of the gradient's locations. The option flags control whether the
     * gradient is drawn before the start circle or after the end circle.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawRadialGradient(@Nullable CGContextRef c, @Nullable CGGradientRef gradient,
            @ByValue CGPoint startCenter, @NFloat double startRadius, @ByValue CGPoint endCenter,
            @NFloat double endRadius, int options);

    /**
     * Fill the current clipping region of `context' with `shading'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawShading(@Nullable CGContextRef c, @Nullable CGShadingRef shading);

    /**
     * Set the current character spacing in `context' to `spacing'. The
     * character spacing is added to the displacement between the origin of one
     * character and the origin of the next.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetCharacterSpacing(@Nullable CGContextRef c, @NFloat double spacing);

    /**
     * Set the user-space point at which text will be drawn in the context `c'
     * to `(x, y)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetTextPosition(@Nullable CGContextRef c, @NFloat double x, @NFloat double y);

    /**
     * Return the user-space point at which text will be drawn in `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextGetTextPosition(@Nullable CGContextRef c);

    /**
     * Set the text matrix in the context `c' to `t'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetTextMatrix(@Nullable CGContextRef c, @ByValue CGAffineTransform t);

    /**
     * Return the text matrix in the context `c'. Returns CGAffineTransformIdentity
     * if `c' is not a valid context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetTextMatrix(@Nullable CGContextRef c);

    /**
     * Set the text drawing mode in the current graphics state of the context
     * `c' to `mode'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetTextDrawingMode(@Nullable CGContextRef c, int mode);

    /**
     * Set the font in the current graphics state of the context `c' to
     * `font'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetFont(@Nullable CGContextRef c, @Nullable CGFontRef font);

    /**
     * Set the font size in the current graphics state of the context `c' to
     * `size'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetFontSize(@Nullable CGContextRef c, @NFloat double size);

    /**
     * Draw `glyphs', an array of `count' CGGlyphs, at the points specified by
     * `positions'. Each element of `positions' specifies the position from the
     * associated glyph; the positions are specified in user space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextShowGlyphsAtPositions(@Nullable CGContextRef c, @Nullable ConstCharPtr glyphs,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGPoint Lpositions,
            @NUInt long count);

    /**
     * Draw `page' in the current user space of the context `c'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawPDFPage(@Nullable CGContextRef c, @Nullable CGPDFPageRef page);

    /**
     * Begin a new page.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextBeginPage(@Nullable CGContextRef c,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox);

    /**
     * End the current page.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextEndPage(@Nullable CGContextRef c);

    /**
     * Equivalent to `CFRetain(c)'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGContextRef CGContextRetain(@Nullable CGContextRef c);

    /**
     * Equivalent to `CFRelease(c)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextRelease(@Nullable CGContextRef c);

    /**
     * Flush all drawing to the destination.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextFlush(@Nullable CGContextRef c);

    /**
     * Synchronized drawing.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSynchronize(@Nullable CGContextRef c);

    /**
     * Turn on antialiasing if `shouldAntialias' is true; turn it off otherwise.
     * This parameter is part of the graphics state.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldAntialias(@Nullable CGContextRef c, boolean shouldAntialias);

    /**
     * Allow antialiasing in `context' if `allowsAntialiasing' is true; don't
     * allow it otherwise. This parameter is not part of the graphics state. A
     * context will perform antialiasing if both `allowsAntialiasing' and the
     * graphics state parameter `shouldAntialias' are true.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsAntialiasing(@Nullable CGContextRef c, boolean allowsAntialiasing);

    /**
     * Turn on font smoothing if `shouldSmoothFonts' is true; turn it off
     * otherwise. This parameter is part of the graphics state. Note that this
     * doesn't guarantee that font smoothing will occur: not all destination
     * contexts support font smoothing.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldSmoothFonts(@Nullable CGContextRef c, boolean shouldSmoothFonts);

    /**
     * If `allowsFontSmoothing' is true, then allow font smoothing when
     * displaying text in `context'; otherwise, don't allow font smoothing. This
     * parameter is not part of the graphics state. Fonts will be smoothed if
     * they are antialiased when drawn and if both `allowsFontSmoothing' and the
     * graphics state parameter `shouldSmoothFonts' are true.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSmoothing(@Nullable CGContextRef c, boolean allowsFontSmoothing);

    /**
     * If `shouldSubpixelPositionFonts' is true, then glyphs may be placed at
     * subpixel positions (if allowed) when displaying text in `context';
     * otherwise, glyphs will be forced to integer pixel boundaries. This
     * parameter is part of the graphics state.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldSubpixelPositionFonts(@Nullable CGContextRef c,
            boolean shouldSubpixelPositionFonts);

    /**
     * If `allowsFontSubpixelPositioning' is true, then allow font subpixel
     * positioning when displaying text in `context'; otherwise, don't allow
     * subpixel positioning. This parameter is not part of the graphics state. A
     * context will place glyphs at subpixel positions if fonts will be
     * antialiased when drawn and if both `allowsFontSubpixelPositioning' and
     * the graphics state parameter `shouldSubpixelPositionFonts' are true.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSubpixelPositioning(@Nullable CGContextRef c,
            boolean allowsFontSubpixelPositioning);

    /**
     * If `shouldSubpixelQuantizeFonts' is true, then quantize the subpixel
     * positions of glyphs when displaying text in `context'; otherwise, don't
     * quantize the subpixel positions. This parameter is part of the graphics
     * state.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldSubpixelQuantizeFonts(@Nullable CGContextRef c,
            boolean shouldSubpixelQuantizeFonts);

    /**
     * If `allowsFontSubpixelQuantization' is true, then allow font subpixel
     * quantization when displaying text in `context'; otherwise, don't allow
     * subpixel quantization. This parameter is not part of the graphics state.
     * A context quantizes subpixel positions if glyphs will be drawn at
     * subpixel positions and `allowsFontSubpixelQuantization' and the graphics
     * state parameter `shouldSubpixelQuantizeFonts' are both true.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSubpixelQuantization(@Nullable CGContextRef c,
            boolean allowsFontSubpixelQuantization);

    /**
     * Begin a transparency layer in `context'. All subsequent drawing
     * operations until a corresponding `CGContextEndTransparencyLayer' are
     * composited into a fully transparent backdrop (which is treated as a
     * separate destination buffer from the context). After the transparency
     * layer is ended, the result is composited into the context using the
     * global alpha and shadow state of the context. This operation respects the
     * clipping region of the context. After a call to this function, all of the
     * parameters in the graphics state remain unchanged with the exception of
     * the following:
     * - The global alpha is set to 1.
     * - The shadow is turned off.
     * - The blend mode is set to `kCGBlendModeNormal'.
     * Ending the transparency layer restores these parameters to the values
     * they had before `CGContextBeginTransparencyLayer' was called.
     * Transparency layers may be nested.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextBeginTransparencyLayer(@Nullable CGContextRef c,
            @Nullable CFDictionaryRef auxiliaryInfo);

    /**
     * Begin a transparency layer in `context'. This function is identical to
     * `CGContextBeginTransparencyLayer' except that the content of the
     * transparency layer will be bounded by `rect' (specified in user space).
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextBeginTransparencyLayerWithRect(@Nullable CGContextRef c, @ByValue CGRect rect,
            @Nullable CFDictionaryRef auxInfo);

    /**
     * End a tranparency layer.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextEndTransparencyLayer(@Nullable CGContextRef c);

    /**
     * Return the affine transform mapping the user space (abstract coordinates)
     * of `context' to device space (pixels).
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetUserSpaceToDeviceSpaceTransform(@Nullable CGContextRef c);

    /**
     * Transform `point' from the user space of `context' to device space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextConvertPointToDeviceSpace(@Nullable CGContextRef c, @ByValue CGPoint point);

    /**
     * Transform `point' from device space to the user space of `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextConvertPointToUserSpace(@Nullable CGContextRef c, @ByValue CGPoint point);

    /**
     * Transform `size' from the user space of `context' to device space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGContextConvertSizeToDeviceSpace(@Nullable CGContextRef c, @ByValue CGSize size);

    /**
     * Transform `size' from device space to the user space of `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGContextConvertSizeToUserSpace(@Nullable CGContextRef c, @ByValue CGSize size);

    /**
     * Transform `rect' from the user space of `context' to device space. Since
     * affine transforms do not preserve rectangles in general, this function
     * returns the smallest rectangle which contains the transformed corner
     * points of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextConvertRectToDeviceSpace(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * Transform `rect' from device space to the user space of `context'. Since
     * affine transforms do not preserve rectangles in general, this function
     * returns the smallest rectangle which contains the transformed corner
     * points of `rect'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextConvertRectToUserSpace(@Nullable CGContextRef c, @ByValue CGRect rect);

    /**
     * DEPRECATED; use the CoreText API instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: No longer supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextSelectFont(@Nullable CGContextRef c,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NFloat double size, int textEncoding);

    /**
     * DEPRECATED; use the CoreText API instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: No longer supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowText(@Nullable CGContextRef c,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
            @NUInt long length);

    /**
     * DEPRECATED; use the CoreText API instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: No longer supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowTextAtPoint(@Nullable CGContextRef c, @NFloat double x, @NFloat double y,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
            @NUInt long length);

    /**
     * DEPRECATED; use the CoreText API instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: No longer supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphs(@Nullable CGContextRef c, @Nullable ConstCharPtr g,
            @NUInt long count);

    /**
     * DEPRECATED; use the CoreText API instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: No longer supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphsAtPoint(@Nullable CGContextRef c, @NFloat double x, @NFloat double y,
            @Nullable ConstCharPtr glyphs, @NUInt long count);

    /**
     * DEPRECATED; use the CoreText API instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 7.0
     * Deprecated-Message: No longer supported
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphsWithAdvances(@Nullable CGContextRef c, @Nullable ConstCharPtr glyphs,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGSize advances,
            @NUInt long count);

    /**
     * Create a bitmap context. The context draws into a bitmap which is `width'
     * pixels wide and `height' pixels high. The number of components for each
     * pixel is specified by `space', which may also specify a destination color
     * profile. Note that the only legal case when `space' can be NULL is when
     * alpha is specified as kCGImageAlphaOnly. The number of bits for each
     * component of a pixel is specified by `bitsPerComponent'. The number of bytes
     * per pixel is equal to `(bitsPerComponent * number of components + 7)/8'.
     * Each row of the bitmap consists of `bytesPerRow' bytes, which must be at
     * least `width * bytes per pixel' bytes; in addition, `bytesPerRow' must be
     * an integer multiple of the number of bytes per pixel. `data', if non-NULL,
     * points to a block of memory at least `bytesPerRow * height' bytes. If `data'
     * is NULL, the context will allocate the data itself; this data will be freed
     * when the context is deallocated. `bitmapInfo' specifies whether the bitmap
     * should contain an alpha channel and how it's to be generated, along with
     * whether the components are floating-point or integer. If `releaseCallback' is
     * non-NULL, it is called when the context is freed with `releaseInfo' and
     * `data' as arguments.
     * 
     * API-Since: 4.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGContextRef CGBitmapContextCreateWithData(@Nullable VoidPtr data, @NUInt long width,
            @NUInt long height, @NUInt long bitsPerComponent, @NUInt long bytesPerRow, @Nullable CGColorSpaceRef space,
            int bitmapInfo,
            @Nullable @FunctionPtr(name = "call_CGBitmapContextCreateWithData") Function_CGBitmapContextCreateWithData releaseCallback,
            @Nullable VoidPtr releaseInfo);

    /**
     * Create a bitmap context. The context draws into a bitmap which is `width'
     * pixels wide and `height' pixels high. The number of components for each
     * pixel is specified by `space', which may also specify a destination color
     * profile. Note that the only legal case when `space' can be NULL is when
     * alpha is specified as kCGImageAlphaOnly.The number of bits for each component
     * of a pixel is specified by `bitsPerComponent'. The number of bytes per pixel
     * is equal to `(bitsPerComponent * number of components + 7)/8'. Each row of
     * the bitmap consists of `bytesPerRow' bytes, which must be at least
     * `width * bytes per pixel' bytes; in addition, `bytesPerRow' must be an
     * integer multiple of the number of bytes per pixel. `data', if non-NULL,
     * points to a block of memory at least `bytesPerRow * height' bytes.
     * If `data' is NULL, the data for context is allocated automatically and freed
     * when the context is deallocated. `bitmapInfo' specifies whether the bitmap
     * should contain an alpha channel and how it's to be generated, along with
     * whether the components are floating-point or integer.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGContextRef CGBitmapContextCreate(@Nullable VoidPtr data, @NUInt long width,
            @NUInt long height, @NUInt long bitsPerComponent, @NUInt long bytesPerRow, @Nullable CGColorSpaceRef space,
            int bitmapInfo);

    /**
     * Return the data associated with the bitmap context `context', or NULL if
     * `context' is not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr CGBitmapContextGetData(@Nullable CGContextRef context);

    /**
     * Return the width of the bitmap context `context', or 0 if `context' is
     * not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetWidth(@Nullable CGContextRef context);

    /**
     * Return the height of the bitmap context `context', or 0 if `context' is
     * not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetHeight(@Nullable CGContextRef context);

    /**
     * Return the bits per component of the bitmap context `context', or 0 if
     * `context' is not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBitsPerComponent(@Nullable CGContextRef context);

    /**
     * Return the bits per pixel of the bitmap context `context', or 0 if
     * `context' is not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBitsPerPixel(@Nullable CGContextRef context);

    /**
     * Return the bytes per row of the bitmap context `context', or 0 if
     * `context' is not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBytesPerRow(@Nullable CGContextRef context);

    /**
     * Return the color space of the bitmap context `context', or NULL if
     * `context' is not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGBitmapContextGetColorSpace(@Nullable CGContextRef context);

    /**
     * Return the alpha info of the bitmap context `context', or
     * "kCGImageAlphaNone" if `context' is not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGBitmapContextGetAlphaInfo(@Nullable CGContextRef context);

    /**
     * Return the bitmap info of the bitmap context `context', or 0 if `context'
     * is not a bitmap context.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native int CGBitmapContextGetBitmapInfo(@Nullable CGContextRef context);

    /**
     * Return an image containing a snapshot of the bitmap context `context'. If
     * context is not a bitmap context, or if the image cannot be created for
     * any reason, this function returns NULL. This is a "copy" operation ---
     * subsequent changes to context will not affect the contents of the
     * returned image.
     * 
     * Note that in some cases the copy will actually follow "copy-on-write"
     * semantics, so that the actual physical copy of the bits will only occur
     * if the underlying data in the bitmap context is modified. As a
     * consequence, you may wish to use the resulting image and release it
     * before performing more drawing into the bitmap context; in this way, the
     * actual physical copy of the data may be avoided.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGImageRef CGBitmapContextCreateImage(@Nullable CGContextRef context);

    @Generated
    @CFunction
    @NUInt
    public static native long CGColorConversionInfoGetTypeID();

    /**
     * Create CGColorConversionInfoRef for converting color from `src' color space to `dst' color space
     * using kCGRenderingIntentDefault rendering intent.
     * Requirements: CG color spaces must be calibrated (no Device{Gray,RGB,CMYK}, Indexed or DeviceN are allowed).
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreate(@Nullable CGColorSpaceRef src,
            @Nullable CGColorSpaceRef dst);

    /**
     * Create CGColorConversionInfoRef from a list of CG color spaces, transform types and rendering intents.
     * ColorSpaces are iterated from first to last. The list of triples:
     * {CGColorSpaceRef, CGColorConversionInfoTransformType, CGColorRenderingIntent} must be terminated with NULL
     * Requirements: CG color spaces must be calibrated (no Device{Gray,RGB,CMYK}, Indexed or DeviceN are allowed).
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @Variadic()
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreateFromList(@Nullable CFDictionaryRef options,
            @Nullable CGColorSpaceRef arg2, int arg3, int arg4, Object... varargs);

    /**
     * Return the CFTypeID for CGDataConsumerRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGDataConsumerGetTypeID();

    /**
     * Create a data consumer using `callbacks' to handle the data. `info' is
     * passed to each of the callback functions.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreate(@Nullable VoidPtr info,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGDataConsumerCallbacks cbks);

    /**
     * Create a data consumer which writes data to `url'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreateWithURL(@Nullable CFURLRef url);

    /**
     * Create a data consumer which writes to `data'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreateWithCFData(@Nullable CFMutableDataRef data);

    /**
     * Equivalent to `CFRetain(consumer)'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerRetain(@Nullable CGDataConsumerRef consumer);

    /**
     * Equivalent to `CFRelease(consumer)'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGDataConsumerRelease(@Nullable CGDataConsumerRef consumer);

    /**
     * Create a layer of size `size' relative to the context `context'. The
     * value of `size' is specified in default user space (base space) units.
     * The parameter `auxiliaryInfo' should be NULL; it is reserved for future
     * expansion.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGLayerRef CGLayerCreateWithContext(@Nullable CGContextRef context, @ByValue CGSize size,
            @Nullable CFDictionaryRef auxiliaryInfo);

    /**
     * Equivalent to `CFRetain(layer)', except it doesn't crash (as CFRetain
     * does) if `layer' is NULL.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGLayerRef CGLayerRetain(@Nullable CGLayerRef layer);

    /**
     * Equivalent to `CFRelease(layer)', except it doesn't crash (as CFRelease
     * does) if `layer' is NULL.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGLayerRelease(@Nullable CGLayerRef layer);

    /**
     * Return the size of the layer `layer'. CGSizeZero if invalid `layer'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGLayerGetSize(@Nullable CGLayerRef layer);

    /**
     * Return the context of `layer'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGContextRef CGLayerGetContext(@Nullable CGLayerRef layer);

    /**
     * Draw the contents of `layer' into `rect' of `context'. The contents are
     * scaled, if necessary, to fit into `rect'; the rectangle `rect' is in user
     * space.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawLayerInRect(@Nullable CGContextRef context, @ByValue CGRect rect,
            @Nullable CGLayerRef layer);

    /**
     * Draw the contents of `layer' at `point' in `context'. This is equivalent
     * to calling "CGContextDrawLayerInRect" with a rectangle having origin at
     * `point' and size equal to the size of `layer'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGContextDrawLayerAtPoint(@Nullable CGContextRef context, @ByValue CGPoint point,
            @Nullable CGLayerRef layer);

    /**
     * Return the CFTypeID for CGLayerRefs.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGLayerGetTypeID();

    /**
     * Create a content stream from `page'.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithPage(@NotNull CGPDFPageRef page);

    /**
     * Create a content stream from `stream'.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithStream(@NotNull CGPDFStreamRef stream,
            @NotNull CGPDFDictionaryRef streamResources, @Nullable CGPDFContentStreamRef parent);

    /**
     * Increment the retain count of `cs'.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamRetain(@NotNull CGPDFContentStreamRef cs);

    /**
     * Decrement the retain count of `cs'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContentStreamRelease(@NotNull CGPDFContentStreamRef cs);

    /**
     * Return the array of CGPDFStreamRefs comprising the entire content stream
     * of `cs'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CGPDFContentStreamGetStreams(@NotNull CGPDFContentStreamRef cs);

    /**
     * Return the resource named `name' in category `category' of the resource
     * dictionaries of `cs'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFObjectRef CGPDFContentStreamGetResource(@NotNull CGPDFContentStreamRef cs,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category,
            @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * Create a PDF context, using `consumer' for output. `mediaBox' is the
     * default page media bounding box; if NULL, then a default page size is
     * used. `auxiliaryInfo' specifies additional information used by the PDF
     * context when generating the PDF file. The keys and values in
     * `auxiliaryInfo' are described below. If `mediaBox' is non-NULL, then its
     * value overrides the value of `kCGPDFContextMediaBox' if specified in the
     * `auxiliaryInfo' dictionary.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGContextRef CGPDFContextCreate(@Nullable CGDataConsumerRef consumer,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
            @Nullable CFDictionaryRef auxiliaryInfo);

    /**
     * Create a PDF context for writing to `url'. This function behaves in the
     * same manner as the above function, except that the output data will be
     * written to `url'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGContextRef CGPDFContextCreateWithURL(@Nullable CFURLRef url,
            @Nullable @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
            @Nullable CFDictionaryRef auxiliaryInfo);

    /**
     * Close a PDF context. After closing the context, all pending data is
     * written to the context's destination, and the PDF file is completed. No
     * additional data will be written to the context's destionation after
     * closing.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextClose(@Nullable CGContextRef context);

    /**
     * Begin a new page in the PDF context `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextBeginPage(@Nullable CGContextRef context, @Nullable CFDictionaryRef pageInfo);

    /**
     * End the current page in the PDF context `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextEndPage(@Nullable CGContextRef context);

    /**
     * Add the metadata stream specified by `metadata' to the document catalog
     * of `context', as described in Table 3.25, "Entries in the catalog
     * dictionary", of the PDF 1.7 specification. The contents of metadata must
     * be XML formatted according to the Extensible Metadata Platform, as
     * described in section 10.2.2, "Metadata Streams", of the PDF 1.7
     * specification.
     * 
     * API-Since: 4.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextAddDocumentMetadata(@Nullable CGContextRef context,
            @Nullable CFDataRef metadata);

    /**
     * Set the URL associated with `rect' to `url' in the PDF context
     * `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextSetURLForRect(@Nullable CGContextRef context, @NotNull CFURLRef url,
            @ByValue CGRect rect);

    /**
     * Create a PDF destination named `name' at `point' in the current page of
     * the PDF context `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextAddDestinationAtPoint(@Nullable CGContextRef context,
            @NotNull CFStringRef name, @ByValue CGPoint point);

    /**
     * Specify a destination named `name' to jump to when clicking in `rect' of
     * the current page of the PDF context `context'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextSetDestinationForRect(@Nullable CGContextRef context,
            @NotNull CFStringRef name, @ByValue CGRect rect);

    /**
     * Create a scanner.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPDFScannerRef CGPDFScannerCreate(@NotNull CGPDFContentStreamRef cs,
            @Nullable CGPDFOperatorTableRef table, @Nullable VoidPtr info);

    /**
     * Retain `scanner'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFScannerRef CGPDFScannerRetain(@Nullable CGPDFScannerRef scanner);

    /**
     * Release `scanner'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFScannerRelease(@Nullable CGPDFScannerRef scanner);

    /**
     * Scan the content stream of `scanner'. Returns true if the entire stream
     * was scanned successfully; false if scanning failed for some reason (for
     * example, if the stream's data is corrupted).
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerScan(@Nullable CGPDFScannerRef scanner);

    /**
     * Return the content stream associated with `scanner'.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFScannerGetContentStream(@NotNull CGPDFScannerRef scanner);

    /**
     * Pop an object from the stack of `scanner' and return it in `value'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopObject(@NotNull CGPDFScannerRef scanner,
            @Nullable Ptr<CGPDFObjectRef> value);

    /**
     * Pop an object from the stack of `scanner' and, if it's a boolean, return
     * it in `value'. Return false if the top of the stack isn't a boolean.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopBoolean(@NotNull CGPDFScannerRef scanner, @Nullable BytePtr value);

    /**
     * Pop an object from the stack of `scanner' and, if it's an integer, return
     * it in `value'. Return false if the top of the stack isn't an integer.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopInteger(@NotNull CGPDFScannerRef scanner, @Nullable NIntPtr value);

    /**
     * Pop an object from the stack of `scanner' and, if it's a number, return
     * it in `value'. Return false if the top of the stack isn't a number.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopNumber(@NotNull CGPDFScannerRef scanner, @Nullable NFloatPtr value);

    /**
     * Pop an object from the stack of `scanner' and, if it's a name, return it
     * in `value'. Return false if the top of the stack isn't a name.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopName(@NotNull CGPDFScannerRef scanner,
            @Nullable @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    /**
     * Pop an object from the stack of `scanner' and, if it's a string, return
     * it in `value'. Return false if the top of the stack isn't a string.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopString(@NotNull CGPDFScannerRef scanner,
            @Nullable Ptr<CGPDFStringRef> value);

    /**
     * Pop an object from the stack of `scanner' and, if it's an array, return
     * it in `value'. Return false if the top of the stack isn't an array.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopArray(@NotNull CGPDFScannerRef scanner,
            @Nullable Ptr<CGPDFArrayRef> value);

    /**
     * Pop an object from the stack of `scanner' and, if it's a dictionary,
     * return it in `value'. Return false if the top of the stack isn't a
     * dictionary.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopDictionary(@NotNull CGPDFScannerRef scanner,
            @Nullable Ptr<CGPDFDictionaryRef> value);

    /**
     * Pop an object from the stack of `scanner' and, if it's a stream, return
     * it in `value'. Return false if the top of the stack isn't a stream.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopStream(@NotNull CGPDFScannerRef scanner,
            @Nullable Ptr<CGPDFStreamRef> value);

    /**
     * Return an empty operator table.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFOperatorTableRef CGPDFOperatorTableCreate();

    /**
     * Increment the retain count of `table'.
     * 
     * API-Since: 2.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPDFOperatorTableRef CGPDFOperatorTableRetain(@Nullable CGPDFOperatorTableRef table);

    /**
     * Decrement the retain count of `table'.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFOperatorTableRelease(@Nullable CGPDFOperatorTableRef table);

    /**
     * Set the callback for the operator named `name' to `callback'
     * 
     * API-Since: 2.0
     */
    @Generated
    @CFunction
    public static native void CGPDFOperatorTableSetCallback(@Nullable CGPDFOperatorTableRef table,
            @Nullable @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @Nullable @FunctionPtr(name = "call_CGPDFOperatorTableSetCallback") Function_CGPDFOperatorTableSetCallback callback);

    /**
     * The "zero" point -- equivalent to CGPointMake(0, 0).
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGPoint CGPointZero();

    /**
     * The "zero" size -- equivalent to CGSizeMake(0, 0).
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGSize CGSizeZero();

    /**
     * The "zero" rectangle -- equivalent to CGRectMake(0, 0, 0, 0).
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGRect CGRectZero();

    /**
     * The "empty" rect. This is the rectangle returned when, for example, we
     * intersect two disjoint rectangles. Note that the null rect is not the
     * same as the zero rect.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGRect CGRectNull();

    /**
     * The infinite rectangle.
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGRect CGRectInfinite();

    /**
     * The identity transform: [ 1 0 0 1 0 0 ].
     * 
     * API-Since: 2.0
     */
    @Generated
    @CVariable()
    @ByValue
    public static native CGAffineTransform CGAffineTransformIdentity();

    /**
     * The name of the "Generic" Gray color space. It is a legacy
     * color space so use it only if you definitely know that you
     * need it. If you need just a reasonable monochrome color space,
     * please use Generic Gray Gamma 2.2, i.e. use
     * kCGColorSpaceGenericGrayGamma2_2 name instead of
     * kCGColorSpaceGenericGray.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericGray();

    /**
     * The name of the "Generic" RGB color space. It is a legacy
     * color space so use it only if you definitely know that you
     * need it. If you need just a reasonable RGB color space,
     * please use sRGB, i.e. use kCGColorSpaceSRGB name
     * instead of kCGColorSpaceGenericRGB.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericRGB();

    /**
     * The name of the "Generic" CMYK color space.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericCMYK();

    /**
     * API-Since: 9.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3();

    /**
     * The name of the "Generic" linear RGB color space. This is the same as
     * `kCGColorSpaceGenericRGB' but with a 1.0 gamma.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericRGBLinear();

    /**
     * The name of the Adobe RGB (1998) color space. For more information, see
     * "Adobe RGB (1998) Color Image Encoding", Version 2005-05, Adobe Systems
     * Inc. (http://www.adobe.com).
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceAdobeRGB1998();

    /**
     * The name of the sRGB color space. The capitalization in the name, while
     * strictly inaccurate, avoids interpretational ambiguity. For more
     * information, see IEC 61966-2-1 (1999-10): "Multimedia systems and
     * equipment - Colour measurement and management - Part 2-1: Colour
     * management - Default RGB colour space - sRGB".
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceSRGB();

    /**
     * The "Generic" gray color space with γ = 2.2.
     * 
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericGrayGamma2_2();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericXYZ();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceACESCGLinear();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_709();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceROMMRGB();

    /**
     * API-Since: 9.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDCIP3();

    /**
     * The name of the extended sRGB color space.
     * The extended sRGB color space allows to specify colors beyond the range of [0.0, 1.0],
     * while still preserving the colorimetry and encoding of sRGB (see above for more details).
     * The negative values will be encoded as the signed reflection of original encoding functions,
     * i.e. y(x) = sign(x)*f(abs(x)) where f(x) represents the encoding function.
     * The capitalization in the name is for avoiding interpretational ambiguity.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedSRGB();

    /**
     * The name of the sRGB color space variant with linear gamma
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceLinearSRGB();

    /**
     * The name of the extended sRGB color space variant with linear gamma
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearSRGB();

    /**
     * The name of the extended Gray color space. This color space has the same colorimetry as Generic Gray 2.2.
     * The negative values will be encoded as the signed reflection of original encoding functions,
     * i.e. y(x) = sign(x)*f(abs(x)) where f(x) represents the encoding function.
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedGray();

    /**
     * The name of the Generic Gray 2.2 color space variant with linear gamma
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceLinearGray();

    /**
     * The name of the extended Generic Gray 2.2 color space variant with linear gamma
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearGray();

    /**
     * The key used to obtain the variation axis name from a variation axis
     * dictionary. The value obtained with this key is a CFStringRef specifying
     * the name of the variation axis.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisName();

    /**
     * The key used to obtain the minimum variation axis value from a variation
     * axis dictionary. The value obtained with this key is a CFNumberRef
     * specifying the minimum value of the variation axis.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisMinValue();

    /**
     * The key used to obtain the maximum variation axis value from a variation
     * axis dictionary. The value obtained with this key is a CFNumberRef
     * specifying the maximum value of the variation axis.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisMaxValue();

    /**
     * The key used to obtain the default variation axis value from a variation
     * axis dictionary. The value obtained with this key is a CFNumberRef
     * specifying the default value of the variation axis.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGFontVariationAxisDefaultValue();

    /**
     * CFBooleanRef which can be used as option to create CGColorConversionInfoRef, when Black Point Compensation is
     * desired
     * 
     * API-Since: 10.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorConversionBlackPointCompensation();

    /**
     * The media box for the document or for a given page. Optional; if present,
     * the value of this key must be a CFData containing a CGRect (stored by
     * value, not by reference).
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextMediaBox();

    /**
     * The crop box for the document or for a given page. Optional; if present,
     * the value of this key must be a CFData containing a CGRect (stored by
     * value, not by reference).
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextCropBox();

    /**
     * The bleed box for the document or for a given page. Optional; if present,
     * the value of this key must be a CFData containing a CGRect (stored by
     * value, not by reference).
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextBleedBox();

    /**
     * The trim box for the document or for a given page. Optional; if present,
     * the value of this key must be a CFData containing a CGRect (stored by
     * value, not by reference).
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextTrimBox();

    /**
     * The art box for the document or for a given page. Optional; if present,
     * the value of this key must be a CFData containing a CGRect (stored by
     * value, not by reference).
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextArtBox();

    /**
     * The document's title. Optional; if present, the value of this key must be
     * a CFString.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextTitle();

    /**
     * The name of the person who created this document. Optional; if present,
     * the value of this key must be a CFString.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAuthor();

    /**
     * The subject of a document. Optional; if present, the value of this key
     * must be a CFString.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextSubject();

    /**
     * The keywords for this document. This key is optional. If the value of
     * this key is a CFString, the /Keywords entry will be the specified string.
     * If the value of this key is a CFArray, then it must be an array of
     * CFStrings. The /Keywords entry will in this case be the concatenation of
     * the specified strings separated by commas (","). In addition, an entry
     * with the key "/AAPL:Keywords" will be stored in the document information
     * dictionary; its value is an array consisting of each of the specified
     * strings. The value of this key must be in one of the above forms;
     * otherwise, this key is ignored.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextKeywords();

    /**
     * The name of the application that created the original data used to create
     * this document. Optional; if present, the value of this key must be a
     * CFString.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextCreator();

    /**
     * The "owner password" of the PDF document. If this key is specified, the
     * document will be encrypted using the value as the owner password;
     * otherwise, the document will not be encrypted. The value of this key must
     * be a CFStringRef which can be represented in ASCII encoding; only the
     * first 32 bytes will be used for the password. There is no default value
     * for this key.
     * 
     * If the value of this key cannot be represented in ASCII, the document
     * will not be created and the creation function will return NULL.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextOwnerPassword();

    /**
     * The "user password" of the PDF document. If the document is encrypted,
     * then the value of this key will be the user password for the document; if
     * unspecified, the user password will be the empty string. The value of
     * this key must be a CFStringRef which can be represented in ASCII
     * encoding; only the first 32 bytes will be used for the password.
     * 
     * If the value of this key cannot be represented in ASCII, the document
     * will not be created and the creation function will return NULL.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextUserPassword();

    /**
     * Specifies the encryption key length in bits; see Table 3.18 "Entries
     * common to all encryption dictionaries", PDF Reference: Adobe PDF version
     * 1.5 (4th ed.) for more info. Optional; if present, the value of this key
     * must be a CFNumber with value which is a multiple of 8 between 40 and
     * 128, inclusive. If this key is absent or invalid, the encryption key
     * length defaults to 40 bits.
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextEncryptionKeyLength();

    /**
     * Used to specify whether the document allows printing when unlocked with
     * the user password. The value of this key must be a CFBooleanRef. The
     * default value of this key is "kCFBooleanTrue".
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAllowsPrinting();

    /**
     * Used to specify whether the document allows copying when unlocked with
     * the user password. The value of this key must be a CFBooleanRef. The
     * default value of this key is "kCFBooleanTrue".
     * 
     * API-Since: 2.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAllowsCopying();

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGDataProviderCreateWithData {
        @Generated
        void call_CGDataProviderCreateWithData(@Nullable VoidPtr arg0, @NotNull ConstVoidPtr arg1, @NUInt long arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGPathApply {
        @Generated
        void call_CGPathApply(@Nullable VoidPtr arg0,
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGPathElement arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGPDFDictionaryApplyFunction {
        @Generated
        void call_CGPDFDictionaryApplyFunction(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String arg0,
                @NotNull CGPDFObjectRef arg1, @Nullable VoidPtr arg2);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGBitmapContextCreateWithData {
        @Generated
        void call_CGBitmapContextCreateWithData(@Nullable VoidPtr arg0, @Nullable VoidPtr arg1);
    }

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGPDFOperatorTableSetCallback {
        @Generated
        void call_CGPDFOperatorTableSetCallback(@NotNull CGPDFScannerRef arg0, @Nullable VoidPtr arg1);
    }

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native VoidPtr CGDataProviderGetInfo(@Nullable CGDataProviderRef provider);

    /**
     * Create an ICC-based color space using the ICC profile raw data specified by
     * `data' which can be either CFDataRef or CGDataProviderRef
     * 
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithICCData(@Nullable ConstVoidPtr data);

    /**
     * Return the system name of the color space. This applies to all color spaces
     * created using `CGColorSpaceCreateWithName' as well as to ICC-based colorspaces
     * created using `CGColorSpaceCreateWithICCData' or `CGColorSpaceCreateICCBased'
     * if they are equivalent to respective named system color spaces. Device color spaces
     * also return unique names. This function will return NULL for other color spaces.
     * Example:
     * CGColorSpaceRef space = CGColorSpaceCreateWithICCData(icc_data);
     * CFStringRef name = CGColorSpaceGetName(space);
     * if (name != NULL && CFEqual(name, kCGColorSpaceDisplayP3)) {
     * // your color space is Display P3
     * ...
     * }
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFStringRef CGColorSpaceGetName(@Nullable CGColorSpaceRef space);

    /**
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native void CGPathApplyWithBlock(@NotNull CGPathRef path,
            @NotNull @ObjCBlock(name = "call_CGPathApplyWithBlock") Block_CGPathApplyWithBlock block);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGPathApplyWithBlock {
        @Generated
        void call_CGPathApplyWithBlock(
                @NotNull @UncertainArgument("Options: reference, array Fallback: reference") CGPathElement element);
    }

    /**
     * Return the document outline in the form of a CFDictionary tree containing the kCGPDFOutline keys.
     * 
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFDictionaryRef CGPDFDocumentGetOutline(@NotNull CGPDFDocumentRef document);

    /**
     * Return the document access permissions.
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native int CGPDFDocumentGetAccessPermissions(@NotNull CGPDFDocumentRef document);

    /**
     * Reset the current clip of `c' to the default value.
     */
    @Generated
    @CFunction
    public static native void CGContextResetClip(@NotNull CGContextRef c);

    /**
     * API-Since: 11.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreateFromListWithArguments(
            @Nullable CFDictionaryRef options, @Nullable CGColorSpaceRef arg2, int arg3, int arg4, BytePtr arg5);

    /**
     * Set the outline in the PDF created by a CGPDFContext (no effect in other types of CGContexts).
     * 
     * API-Since: 11.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextSetOutline(@NotNull CGContextRef context, @Nullable CFDictionaryRef outline);

    /**
     * The name of the "Generic" L*a*b* color space. This is the same as
     * L*a*b* colorspace created by `CGColorSpaceCreateLab' with
     * white_point[0.9642, 1.0, 0.8249] (i.e. D50), black_point[0.0, 0.0, 0.0]
     * and range [-128, 128, -128, 128].
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceGenericLab();

    /**
     * Key: kCGPDFOutlineTitle
     * Value: CFString
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineTitle();

    /**
     * Key: kCGPDFOutlineChildren
     * Value: CFArray of CFDictionaries
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineChildren();

    /**
     * Key: kCGPDFOutlineDestination
     * Value: CFNumber (for a one-indexed page number) or CFURL
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineDestination();

    /**
     * Key: kCGPDFOutlineDestinationRect
     * Value: CFDictionary from CGRectCreateDictionaryRepresentation. Only valid when the destination is a page number.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFOutlineDestinationRect();

    /**
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorConversionTRCSize();

    /**
     * The document's access permissions, expressed as a CFNumber. The number is
     * defined by ORing together the desired CGPDFAccessPermissions values.
     * 
     * API-Since: 11.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextAccessPermissions();

    /**
     * Return true if color space uses transfer functions defined in ITU Rec.2100
     * Please use CGColorSpaceUsesITUR_2100TF instead
     * 
     * API-Since: 13.0
     * Deprecated-Since: 13.4
     * Deprecated-Message: No longer supported
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean CGColorSpaceIsHDR(@NotNull CGColorSpaceRef arg1);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native ConstVoidPtr CGColorSpaceCopyPropertyList(@NotNull CGColorSpaceRef space);

    /**
     * API-Since: 10.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithPropertyList(@NotNull ConstVoidPtr plist);

    /**
     * Create a color in the "Generic Gray Gamma 2.2 color space.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateGenericGrayGamma2_2(@NFloat double gray, @NFloat double alpha);

    /**
     * Create a color in sRGB color space.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateSRGB(@NFloat double red, @NFloat double green, @NFloat double blue,
            @NFloat double alpha);

    /**
     * Return the byte order info of `image'.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int CGImageGetByteOrderInfo(@Nullable CGImageRef image);

    /**
     * Return the pixel format of `image'.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native int CGImageGetPixelFormatInfo(@Nullable CGImageRef image);

    /**
     * Enumerate all of the objects in `array', calling the block-function `block' once
     * for each value in the array. Passes the current iterator index, the current
     * value, and `info' to `block'. If `block' returns true, iteration will continue
     * over all values. If `block' returns false, iteration will stop and return
     * early.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void CGPDFArrayApplyBlock(@Nullable CGPDFArrayRef array,
            @Nullable @ObjCBlock(name = "call_CGPDFArrayApplyBlock") Block_CGPDFArrayApplyBlock block,
            @Nullable VoidPtr info);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGPDFArrayApplyBlock {
        @Generated
        boolean call_CGPDFArrayApplyBlock(@NUInt long index, @NotNull CGPDFObjectRef value, @Nullable VoidPtr info);
    }

    /**
     * Enumerate all of the keys in `dict', calling the block-function `block' once
     * for each key/value pair. Passes the current key, the associated value, and
     * `info' to `block'. If `block' returns true, iteration will continue over all
     * key/value pairs. If `block' returns false, iteration will stop and return
     * early.
     * 
     * API-Since: 12.0
     */
    @Generated
    @CFunction
    public static native void CGPDFDictionaryApplyBlock(@Nullable CGPDFDictionaryRef dict,
            @Nullable @ObjCBlock(name = "call_CGPDFDictionaryApplyBlock") Block_CGPDFDictionaryApplyBlock block,
            @Nullable VoidPtr info);

    @Runtime(CRuntime.class)
    @Generated
    public interface Block_CGPDFDictionaryApplyBlock {
        @Generated
        boolean call_CGPDFDictionaryApplyBlock(
                @NotNull @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") @Mapped(CStringMapper.class) String key,
                @NotNull CGPDFObjectRef value, @Nullable VoidPtr info);
    }

    /**
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorConversionInfoRef CGColorConversionInfoCreateWithOptions(@NotNull CGColorSpaceRef src,
            @NotNull CGColorSpaceRef dst, @Nullable CFDictionaryRef options);

    /**
     * For a given CGPDFTagType, return a C-string that matches the names defined in section 10.7.3: Standard Structure
     * Types.
     * These are defined on pages 899 - 912. Returns NULL for an unknown value.
     * 
     * API-Since: 13.0
     */
    @Nullable
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CGPDFTagTypeGetName(int tagType);

    /**
     * Sets the current tag to the given tagType with an associated tagProperties dictionary. The previous tag will be
     * pushed
     * to a tag-stack. The previous tag can be restored through CGPDFContextEndTag(...). This new tag will record any
     * future
     * drawing commands to the given context as part of itself, unless another tag is pushed or the tag is popped. When
     * the
     * PDF context is serialized to a PDF file, these tags will create marked content sequences around the associated
     * draw commands
     * around the page's content stream. Note that tagProperties is an optional dictionary that allows you to specificy
     * additional
     * properties of the marked content: content may want to re-declare how text should be extracted, any alt text for
     * figures,
     * or explicitly declare what language the text is in. All child-tags (tags pushed on top of other tags) will
     * inherit their
     * parent tag's properties.
     * 
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextBeginTag(@NotNull CGContextRef context, int tagType,
            @Nullable CFDictionaryRef tagProperties);

    /**
     * Pop the current tag. Sets the current tag to the previous tag on the tag-stack. If there was no previous tag,
     * then the
     * current tag will be set to the root document tag (of type CGPDFTagTypeDocument).
     * 
     * API-Since: 13.0
     */
    @Generated
    @CFunction
    public static native void CGPDFContextEndTag(@NotNull CGContextRef context);

    /**
     * API-Since: 12.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearITUR_2020();

    /**
     * API-Since: 12.3
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedLinearDisplayP3();

    /**
     * API-Since: 12.6
     * Deprecated-Since: 13.4
     * Deprecated-Message: No longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020_PQ_EOTF();

    /**
     * API-Since: 12.6
     * Deprecated-Since: 13.4
     * Deprecated-Message: No longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3_PQ_EOTF();

    /**
     * API-Since: 12.6
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3_HLG();

    /**
     * API-Since: 12.6
     * Deprecated-Since: 14.0
     * Deprecated-Message: No longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020_HLG();

    /**
     * Actual text, defined on page 860:
     * "Text that is an exact replacement for the structure element and its children..."
     * "...useful when extracting the document’s contents in support of accessibility..."
     * This can be used to more precisely control what string is extracted by a user when
     * they copy and paste from a document.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyActualText();

    /**
     * Alternative text, defined on page 860:
     * "An alternate description of the structure element and its children in human-readable form".
     * This is typically used for graphical content, like an image.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyAlternativeText();

    /**
     * Title, defined on page 859:
     * Title of the node in a human-readable form. This should *not* be used for accessibility,
     * but can be useful when presenting the structure of a tagged node tree.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyTitleText();

    /**
     * Language of text content, defined on page 860:
     * Typically you should use the document's catalog to get its language, but if a section
     * of text is not the same language as the document, this may be set and allow you to
     * look at what language it is hinting at.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFTagPropertyLanguageText();

    /**
     * API-Since: 13.4
     * Deprecated-Since: 14.0
     * Deprecated-Message: No longer supported
     */
    @NotNull
    @Deprecated
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020_PQ();

    /**
     * API-Since: 13.4
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3_PQ();

    /**
     * Return true if `space' uses extended range [-Inf, +Inf]; false
     * otherwise.
     * 
     * API-Since: 10.0
     */
    @Generated
    @CFunction
    public static native boolean CGColorSpaceUsesExtendedRange(@NotNull CGColorSpaceRef space);

    /**
     * Create a color in the "Generic" gray color space.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateGenericGray(@NFloat double gray, @NFloat double alpha);

    /**
     * Create a color in the "Generic" RGB color space.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateGenericRGB(@NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    /**
     * Create a color in the "Generic" CMYK color space.
     * 
     * API-Since: 13.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateGenericCMYK(@NFloat double cyan, @NFloat double magenta,
            @NFloat double yellow, @NFloat double black, @NFloat double alpha);

    /**
     * Return a constant color. As `CGColorGetConstantColor' is not a "Copy" or
     * "Create" function, it does not necessarily return a new reference each
     * time it's called. As a consequence, you should not release the returned
     * value. However, colors returned from `CGColorGetConstantColor' can be
     * retained and released in a properly nested fashion, just like any other
     * CF type.
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorRef CGColorGetConstantColor(@Nullable CFStringRef colorName);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2100_PQ();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2100_HLG();

    /**
     * Colors in the "Generic" gray color space.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorWhite();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorBlack();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorClear();

    /**
     * The document's PDF/X output intent. Optional; if present, the value of
     * this key must be a CFDictionaryRef. The dictionary is added to the
     * /OutputIntents entry in the PDF file's document catalog. The keys and
     * values contained in the dictionary must match those specified in section
     * 9.10.4 of the PDF 1.4 specification, ISO/DIS 15930-3 document published
     * by ISO/TC 130, and Adobe Technical Note #5413.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextOutputIntent();

    /**
     * The following keys are supported in the output intent dictionary:
     * 
     * kCGPDFXOutputIntentSubtype ("S"): The output intent subtype. This key is
     * required; the value of this key must be a CFString equal to "GTS_PDFX";
     * otherwise, the dictionary is ignored.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFXOutputIntentSubtype();

    /**
     * kCGPDFXOutputConditionIdentifier ("OutputConditionIdentifier"): A string
     * identifying the intended output device or production condition in a
     * human- or machine-readable form. This key is required; the value of this
     * key must be a CFString. For best results, the string should be
     * representable losslessly in ASCII encoding.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFXOutputConditionIdentifier();

    /**
     * kCGPDFXOutputCondition ("OutputCondition"): A text string identifying the
     * intended output device or production condition in a human-readable form.
     * This key is optional; if present, the value of this key must be a
     * CFString.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFXOutputCondition();

    /**
     * kCGPDFXRegistryName ("RegistryName"): A string identifying the registry
     * in which the condition designated by `kCGPDFXOutputConditionIdentifier'
     * is defined. This key is optional; if present, the value of this key must
     * be a CFString. For best results, the string should be representable
     * losslessly in ASCII encoding.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFXRegistryName();

    /**
     * kCGPDFXInfo ("Info"): A human-readable text string containing additional
     * information about the intended target device or production condition.
     * This key is required if the value of `kCGPDFXOutputConditionIdentifier'
     * does not specify a standard production condition; it is optional
     * otherwise. If present, the value of this key must be a CFString.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFXInfo();

    /**
     * kCGPDFXDestinationOutputProfile ("DestOutputProfile"): An ICC profile
     * stream defining the transformation from the PDF document's source colors
     * to output device colorants. This key is required if the value of
     * `kCGPDFXOutputConditionIdentifier' does not specify a standard production
     * condition; it is optional otherwise. If present, the value of this key
     * must be a ICC-based CGColorSpaceRef.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFXDestinationOutputProfile();

    /**
     * The document's output intents. Optional; if present, the value must be a
     * CFArrayRef containing one or more CFDictionaryRefs. The array is added to
     * the PDF document in the /OutputIntents entry in the PDF file's document
     * catalog. Each dictionary in the array must be of form specified above for
     * the `kCGPDFContextOutputIntent' key, except that only the first
     * dictionary in the array may contain the `kCGPDFXOutputIntentSubtype'
     * ("S") key with a value of "GTS_PDFX". If both `kCGPDFContextOutputIntent'
     * and `kCGPDFContextOutputIntents' keys are specified, the former is
     * ignored.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextOutputIntents();

    /**
     * Output a linearized PDF
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextCreateLinearizedPDF();

    /**
     * Output a PDF that conforms to PDF/A-2u (ISO 19005-2). The value of this key
     * must be a CFBooleanRef. The default value of this key is "kCFBooleanFalse".
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGPDFContextCreatePDFA();

    /**
     * Return true if color space uses transfer functions defined in ITU Rec.2100
     * 
     * API-Since: 14.0
     */
    @Generated
    @CFunction
    public static native boolean CGColorSpaceUsesITUR_2100TF(@NotNull CGColorSpaceRef arg1);

    /**
     * Create a linearized copy of the color space if the color space is matrix based.
     * Return NULL if otherwise
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateLinearized(@NotNull CGColorSpaceRef space);

    /**
     * Create a copy of the color space which uses extended range [-Inf, +Inf] if the color space is
     * matrix based. Return NULL if otherwise
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateExtended(@NotNull CGColorSpaceRef space);

    /**
     * Create a linearized copy of the color space which uses extended range [-Inf, +Inf]
     * if the color space is matrix based. Return NULL if otherwise
     * 
     * API-Since: 14.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateExtendedLinearized(@NotNull CGColorSpaceRef space);

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedITUR_2020();

    /**
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedDisplayP3();

    /**
     * Create a color space using ColorSyncProfileRef.
     * To create an extended color space include kCGColorSpaceExtendedRange/kCFBooleanTrue
     * key/value pair in `options' dictionary.
     * 
     * API-Since: 15.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithColorSyncProfile(@Nullable ColorSyncProfileRef arg1,
            @Nullable CFDictionaryRef options);

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean CGColorSpaceIsPQBased(@NotNull CGColorSpaceRef s);

    /**
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    public static native boolean CGColorSpaceIsHLGBased(@NotNull CGColorSpaceRef s);

    @Generated
    @CFunction
    public static native boolean CGConvertColorDataWithFormat(@NUInt long width, @NUInt long height, VoidPtr dst_data,
            @ByValue CGColorDataFormat dst_format, VoidPtr src_data, @ByValue CGColorDataFormat src_format,
            CFDictionaryRef options);

    /**
     * Set a callback for easier detection of error conditions
     * causing CoreGraphics to raise an error.
     * Pass NULL to reset the callback.
     */
    @Generated
    @CFunction
    public static native void CGErrorSetCallback(
            @FunctionPtr(name = "call_CGErrorSetCallback") Function_CGErrorSetCallback callback);

    @Runtime(CRuntime.class)
    @Generated
    public interface Function_CGErrorSetCallback {
        @Generated
        void call_CGErrorSetCallback();
    }

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceLinearITUR_2020();

    /**
     * API-Since: 15.0
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceLinearDisplayP3();

    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceExtendedRange();

    /**
     * API-Since: 15.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_709_PQ();

    /**
     * API-Since: 15.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_2020_sRGBGamma();

    /**
     * Decompose a CGAffineTransform into a scale * shear * rotation * translation
     * 
     * This decomposition method may be used to provide insight into what a
     * arbitrary CGAffineTransform does. This may be necessary, for example, because
     * an algorithm would like to know what the scaling portion of a transform is before rotation,
     * or perhaps because some part of a transform is undesired and your application would like
     * to replace a portion of it with a different transformation.
     * 
     * Since there are many ways to make a affine transform out of other affine transforms
     * this method can not tell us the ordering of geometric steps used to create the original
     * CGAffineTransform. It tells us what the transform does, not how it was made.
     * 
     * @param transform The CGAffineTransform to decompose
     * @return A decomposed set of geometric operations, the product of which is the CGAffineTransform.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransformComponents CGAffineTransformDecompose(@ByValue CGAffineTransform transform);

    /**
     * Create CGAffineTransform from scale * shear * rotation * translation CGAffineTransformComponents
     * 
     * @param components The set of CGAffineTransformComponents to use to create a new CGAffineTransform
     * @return A new CGAffineTransform built from the provided components
     * 
     *         API-Since: 16.0
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeWithComponents(
            @ByValue CGAffineTransformComponents components);

    /**
     * Create a copy of the color space which uses standard range [0.0, 1.0].
     * 
     * API-Since: 16.0
     */
    @NotNull
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateCopyWithStandardRange(@NotNull CGColorSpaceRef s);

    /**
     * Returns a new weakly-simple path without self-intersections and with a normalized orientation. Filling the
     * resulting path using even-odd or non-zero filling is identical.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByNormalizing(@Nullable CGPathRef path, boolean evenOddFillRule);

    /**
     * Returns a new path created by unioning `path` and `maskPath`. Any unclosed subpaths in either path are assumed to
     * be closed. The resulting path is suitable for either even-odd or non-zero filling.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByUnioningPath(@Nullable CGPathRef path,
            @Nullable CGPathRef maskPath, boolean evenOddFillRule);

    /**
     * Returns a new path created by intersecting `path` and `maskPath`. Any unclosed subpaths in either path are
     * assumed to be closed. The resulting path is suitable for either even-odd or non-zero filling.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByIntersectingPath(@Nullable CGPathRef path,
            @Nullable CGPathRef maskPath, boolean evenOddFillRule);

    /**
     * Returns a new path created by subtracting `maskPath` from `path`. Any unclosed subpaths in either path are
     * assumed to be closed. The resulting path is suitable for either even-odd or non-zero filling.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyBySubtractingPath(@Nullable CGPathRef path,
            @Nullable CGPathRef maskPath, boolean evenOddFillRule);

    /**
     * Returns a new path created by exclusive or-ing `path` and `maskPath`. Any unclosed subpaths in either path are
     * assumed to be closed. The resulting path is suitable for either even-odd or non-zero filling.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyBySymmetricDifferenceOfPath(@Nullable CGPathRef path,
            @Nullable CGPathRef maskPath, boolean evenOddFillRule);

    /**
     * Returns a new path created by subtracting the `maskPath` from the line of `path` with the fill of `maskPath`.
     * This returns a potentially open path.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyOfLineBySubtractingPath(@Nullable CGPathRef path,
            @Nullable CGPathRef maskPath, boolean evenOddFillRule);

    /**
     * Returns a new path created by intersecting the line of `path` and the fill of `maskPath`. This returns a
     * potentially open path.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyOfLineByIntersectingPath(@Nullable CGPathRef path,
            @Nullable CGPathRef maskPath, boolean evenOddFillRule);

    /**
     * Return an array of the visually separated components of a path.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CFArrayRef CGPathCreateSeparateComponents(@Nullable CGPathRef path, boolean evenOddFillRule);

    /**
     * Returns a new path that is flattened, converting all curved line segments into straight line approximations. The
     * granularity of the approximations is controlled by `flatteningThreshold` the maximum error tolerance (measured in
     * points) for curves.
     * 
     * API-Since: 16.0
     */
    @Nullable
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByFlattening(@Nullable CGPathRef path,
            @NFloat double flatteningThreshold);

    /**
     * Returns true if path1 and path2 overlap.
     * 
     * API-Since: 16.0
     */
    @Generated
    @CFunction
    public static native boolean CGPathIntersectsPath(@Nullable CGPathRef path1, @Nullable CGPathRef path2,
            boolean evenOddFillRule);

    /**
     * Cleanly stop the scanner on the current operator, releasing any
     * temporary resources.
     */
    @Generated
    @CFunction
    public static native void CGPDFScannerStop(@NotNull CGPDFScannerRef s);

    /**
     * API-Since: 15.1
     */
    @NotNull
    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceITUR_709_HLG();

    @Generated public static final int kCGBitmapByteOrder16Host = 0x00001000;
    @Generated public static final int kCGBitmapByteOrder32Host = 0x00002000;
    @Generated public static final double CG_HDR_BT_2100 = 1.0;
}
