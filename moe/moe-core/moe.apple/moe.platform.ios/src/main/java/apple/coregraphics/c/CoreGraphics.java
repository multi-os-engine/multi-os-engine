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
import apple.coregraphics.opaque.CGColorConverterRef;
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

    /**
     * CGPointMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGPointMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGPoint CGPointMake(@NFloat double x, @NFloat double y);

    /**
     * CGSizeMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGSizeMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGSize CGSizeMake(@NFloat double width, @NFloat double height);

    /**
     * CGVectorMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGVectorMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGVector CGVectorMake(@NFloat double dx, @NFloat double dy);

    /**
     * CGRectMake</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectMake">iOS Dev Center</a>
     */
    @Generated
    @Inline
    @CFunction
    @ByValue
    public static native CGRect CGRectMake(@NFloat double x, @NFloat double y, @NFloat double width,
            @NFloat double height);

    /**
     * CGRectGetMinX</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetMinX">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMinX(@ByValue CGRect rect);

    /**
     * CGRectGetMidX</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetMidX">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMidX(@ByValue CGRect rect);

    /**
     * CGRectGetMaxX</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetMaxX">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMaxX(@ByValue CGRect rect);

    /**
     * CGRectGetMinY</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetMinY">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMinY(@ByValue CGRect rect);

    /**
     * CGRectGetMidY</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetMidY">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMidY(@ByValue CGRect rect);

    /**
     * CGRectGetMaxY</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetMaxY">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetMaxY(@ByValue CGRect rect);

    /**
     * CGRectGetWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetWidth">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGRectGetWidth(@ByValue CGRect rect);

    /**
     * CGRectGetHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectGetHeight">iOS Dev Center</a>
     */
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

    /**
     * CGRectEqualToRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectEqualToRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGRectEqualToRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    /**
     * CGRectStandardize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectStandardize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectStandardize(@ByValue CGRect rect);

    /**
     * CGRectIsEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectIsEmpty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGRectIsEmpty(@ByValue CGRect rect);

    /**
     * CGRectIsNull</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectIsNull">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGRectIsNull(@ByValue CGRect rect);

    /**
     * CGRectIsInfinite</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectIsInfinite">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGRectIsInfinite(@ByValue CGRect rect);

    /**
     * CGRectInset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectInset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectInset(@ByValue CGRect rect, @NFloat double dx, @NFloat double dy);

    /**
     * CGRectIntegral</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectIntegral">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectIntegral(@ByValue CGRect rect);

    /**
     * CGRectUnion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectUnion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectUnion(@ByValue CGRect r1, @ByValue CGRect r2);

    /**
     * CGRectIntersection</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectIntersection">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectIntersection(@ByValue CGRect r1, @ByValue CGRect r2);

    /**
     * CGRectOffset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectOffset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGRectOffset(@ByValue CGRect rect, @NFloat double dx, @NFloat double dy);

    /**
     * CGRectDivide</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectDivide">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGRectDivide(@ByValue CGRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect slice,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect remainder, @NFloat double amount,
            int edge);

    /**
     * CGRectContainsPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectContainsPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGRectContainsPoint(@ByValue CGRect rect, @ByValue CGPoint point);

    /**
     * CGRectContainsRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectContainsRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGRectContainsRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    /**
     * CGRectIntersectsRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectIntersectsRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGRectIntersectsRect(@ByValue CGRect rect1, @ByValue CGRect rect2);

    /**
     * CGPointCreateDictionaryRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGPointCreateDictionaryRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CGPointCreateDictionaryRepresentation(@ByValue CGPoint point);

    /**
     * CGPointMakeWithDictionaryRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGPointMakeWithDictionaryRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPointMakeWithDictionaryRepresentation(CFDictionaryRef dict,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint point);

    /**
     * CGSizeCreateDictionaryRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGSizeCreateDictionaryRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CGSizeCreateDictionaryRepresentation(@ByValue CGSize size);

    /**
     * CGSizeMakeWithDictionaryRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGSizeMakeWithDictionaryRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGSizeMakeWithDictionaryRepresentation(CFDictionaryRef dict,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize size);

    /**
     * CGRectCreateDictionaryRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectCreateDictionaryRepresentation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CGRectCreateDictionaryRepresentation(@ByValue CGRect arg1);

    /**
     * CGRectMakeWithDictionaryRepresentation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGeometry/index.html#//apple_ref/c/func/CGRectMakeWithDictionaryRepresentation">iOS Dev Center</a>
     */
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

    /**
     * CGAffineTransformMakeTranslation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformMakeTranslation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeTranslation(@NFloat double tx, @NFloat double ty);

    /**
     * CGAffineTransformMakeScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformMakeScale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeScale(@NFloat double sx, @NFloat double sy);

    /**
     * CGAffineTransformMakeRotation</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformMakeRotation">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformMakeRotation(@NFloat double angle);

    /**
     * CGAffineTransformIsIdentity</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformIsIdentity">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGAffineTransformIsIdentity(@ByValue CGAffineTransform t);

    /**
     * CGAffineTransformTranslate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformTranslate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformTranslate(@ByValue CGAffineTransform t, @NFloat double tx,
            @NFloat double ty);

    /**
     * CGAffineTransformScale</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformScale">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformScale(@ByValue CGAffineTransform t, @NFloat double sx,
            @NFloat double sy);

    /**
     * CGAffineTransformRotate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformRotate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformRotate(@ByValue CGAffineTransform t, @NFloat double angle);

    /**
     * CGAffineTransformInvert</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformInvert">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformInvert(@ByValue CGAffineTransform t);

    /**
     * CGAffineTransformConcat</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformConcat">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGAffineTransformConcat(@ByValue CGAffineTransform t1,
            @ByValue CGAffineTransform t2);

    /**
     * CGAffineTransformEqualToTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGAffineTransformEqualToTransform">iOS Dev Center</a>
     */
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

    /**
     * CGRectApplyAffineTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGAffineTransform/index.html#//apple_ref/c/func/CGRectApplyAffineTransform">iOS Dev Center</a>
     */
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

    /**
     * CGDataProviderGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGDataProviderGetTypeID();

    /**
     * CGDataProviderCreateSequential</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderCreateSequential">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateSequential(VoidPtr info,
            @UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderSequentialCallbacks callbacks);

    /**
     * CGDataProviderCreateDirect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderCreateDirect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateDirect(VoidPtr info, long size,
            @UncertainArgument("Options: reference, array Fallback: reference") CGDataProviderDirectCallbacks callbacks);

    /**
     * CGDataProviderCreateWithData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderCreateWithData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithData(VoidPtr info, ConstVoidPtr data,
            @NUInt long size,
            @FunctionPtr(name = "call_CGDataProviderCreateWithData") Function_CGDataProviderCreateWithData releaseData);

    /**
     * CGDataProviderCreateWithCFData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderCreateWithCFData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithCFData(CFDataRef data);

    /**
     * CGDataProviderCreateWithURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderCreateWithURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithURL(CFURLRef url);

    /**
     * CGDataProviderCreateWithFilename</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderCreateWithFilename">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderCreateWithFilename(
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String filename);

    /**
     * CGDataProviderRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGDataProviderRetain(CGDataProviderRef provider);

    /**
     * CGDataProviderRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGDataProviderRelease(CGDataProviderRef provider);

    /**
     * CGDataProviderCopyData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataProvider/index.html#//apple_ref/c/func/CGDataProviderCopyData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CGDataProviderCopyData(CGDataProviderRef provider);

    /**
     * CGColorSpaceCreateDeviceGray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateDeviceGray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceGray();

    /**
     * CGColorSpaceCreateDeviceRGB</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateDeviceRGB">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceRGB();

    /**
     * CGColorSpaceCreateDeviceCMYK</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateDeviceCMYK">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateDeviceCMYK();

    /**
     * CGColorSpaceCreateWithICCProfile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateWithICCProfile">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithICCProfile(CFDataRef data);

    /**
     * CGColorSpaceCreateICCBased</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateICCBased">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateICCBased(@NUInt long nComponents, ConstNFloatPtr range,
            CGDataProviderRef profile, CGColorSpaceRef alternate);

    /**
     * CGColorSpaceCreateIndexed</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateIndexed">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateIndexed(CGColorSpaceRef baseSpace, @NUInt long lastIndex,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String colorTable);

    /**
     * CGColorSpaceCreatePattern</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreatePattern">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreatePattern(CGColorSpaceRef baseSpace);

    /**
     * CGColorSpaceCreateWithName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateWithName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithName(CFStringRef name);

    /**
     * CGColorSpaceRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceRetain(CGColorSpaceRef space);

    /**
     * CGColorSpaceRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGColorSpaceRelease(CGColorSpaceRef space);

    /**
     * CGColorSpaceGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetTypeID();

    /**
     * CGColorSpaceGetNumberOfComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceGetNumberOfComponents">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetNumberOfComponents(CGColorSpaceRef space);

    /**
     * CGColorSpaceGetModel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceGetModel">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGColorSpaceGetModel(CGColorSpaceRef space);

    /**
     * CGColorSpaceGetBaseColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceGetBaseColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceGetBaseColorSpace(CGColorSpaceRef space);

    /**
     * CGColorSpaceGetColorTableCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceGetColorTableCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorSpaceGetColorTableCount(CGColorSpaceRef space);

    /**
     * CGColorSpaceGetColorTable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceGetColorTable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGColorSpaceGetColorTable(CGColorSpaceRef space, BytePtr table);

    /**
     * CGColorSpaceCopyICCProfile</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCopyICCProfile">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CGColorSpaceCopyICCProfile(CGColorSpaceRef space);

    /**
     * CGPatternGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPattern/index.html#//apple_ref/c/func/CGPatternGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPatternGetTypeID();

    /**
     * CGPatternCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPattern/index.html#//apple_ref/c/func/CGPatternCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPatternRef CGPatternCreate(VoidPtr info, @ByValue CGRect bounds,
            @ByValue CGAffineTransform matrix, @NFloat double xStep, @NFloat double yStep, int tiling,
            boolean isColored,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPatternCallbacks callbacks);

    /**
     * CGPatternRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPattern/index.html#//apple_ref/c/func/CGPatternRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPatternRef CGPatternRetain(CGPatternRef pattern);

    /**
     * CGPatternRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPattern/index.html#//apple_ref/c/func/CGPatternRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPatternRelease(CGPatternRef pattern);

    /**
     * CGColorCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreate(CGColorSpaceRef space, ConstNFloatPtr components);

    /**
     * CGColorCreateWithPattern</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorCreateWithPattern">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateWithPattern(CGColorSpaceRef space, CGPatternRef pattern,
            ConstNFloatPtr components);

    /**
     * CGColorCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopy(CGColorRef color);

    /**
     * CGColorCreateCopyWithAlpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorCreateCopyWithAlpha">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopyWithAlpha(CGColorRef color, @NFloat double alpha);

    /**
     * CGColorRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorRef CGColorRetain(CGColorRef color);

    /**
     * CGColorRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGColorRelease(CGColorRef color);

    /**
     * CGColorEqualToColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorEqualToColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGColorEqualToColor(CGColorRef color1, CGColorRef color2);

    /**
     * CGColorGetNumberOfComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorGetNumberOfComponents">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorGetNumberOfComponents(CGColorRef color);

    /**
     * CGColorGetComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorGetComponents">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstNFloatPtr CGColorGetComponents(CGColorRef color);

    /**
     * CGColorGetAlpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorGetAlpha">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGColorGetAlpha(CGColorRef color);

    /**
     * CGColorGetColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorGetColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorGetColorSpace(CGColorRef color);

    /**
     * CGColorGetPattern</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorGetPattern">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPatternRef CGColorGetPattern(CGColorRef color);

    /**
     * CGColorGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColor/index.html#//apple_ref/c/func/CGColorGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGColorGetTypeID();

    /**
     * CGFontGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGFontGetTypeID();

    /**
     * CGFontCreateWithDataProvider</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCreateWithDataProvider">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateWithDataProvider(CGDataProviderRef provider);

    /**
     * CGFontCreateWithFontName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCreateWithFontName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateWithFontName(CFStringRef name);

    /**
     * CGFontCreateCopyWithVariations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCreateCopyWithVariations">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGFontRef CGFontCreateCopyWithVariations(CGFontRef font, CFDictionaryRef variations);

    /**
     * CGFontRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGFontRef CGFontRetain(CGFontRef font);

    /**
     * CGFontRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGFontRelease(CGFontRef font);

    /**
     * CGFontGetNumberOfGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetNumberOfGlyphs">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGFontGetNumberOfGlyphs(CGFontRef font);

    /**
     * CGFontGetUnitsPerEm</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetUnitsPerEm">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGFontGetUnitsPerEm(CGFontRef font);

    /**
     * CGFontCopyPostScriptName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCopyPostScriptName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyPostScriptName(CGFontRef font);

    /**
     * CGFontCopyFullName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCopyFullName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyFullName(CGFontRef font);

    /**
     * CGFontGetAscent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetAscent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGFontGetAscent(CGFontRef font);

    /**
     * CGFontGetDescent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetDescent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGFontGetDescent(CGFontRef font);

    /**
     * CGFontGetLeading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetLeading">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGFontGetLeading(CGFontRef font);

    /**
     * CGFontGetCapHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetCapHeight">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGFontGetCapHeight(CGFontRef font);

    /**
     * CGFontGetXHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetXHeight">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGFontGetXHeight(CGFontRef font);

    /**
     * CGFontGetFontBBox</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetFontBBox">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGFontGetFontBBox(CGFontRef font);

    /**
     * CGFontGetItalicAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetItalicAngle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGFontGetItalicAngle(CGFontRef font);

    /**
     * CGFontGetStemV</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetStemV">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NFloat
    public static native double CGFontGetStemV(CGFontRef font);

    /**
     * CGFontCopyVariationAxes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCopyVariationAxes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CGFontCopyVariationAxes(CGFontRef font);

    /**
     * CGFontCopyVariations</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCopyVariations">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDictionaryRef CGFontCopyVariations(CGFontRef font);

    /**
     * CGFontGetGlyphAdvances</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetGlyphAdvances">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGFontGetGlyphAdvances(CGFontRef font, ConstCharPtr glyphs, @NUInt long count,
            IntPtr advances);

    /**
     * CGFontGetGlyphBBoxes</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetGlyphBBoxes">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGFontGetGlyphBBoxes(CGFontRef font, ConstCharPtr glyphs, @NUInt long count,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect bboxes);

    /**
     * CGFontGetGlyphWithGlyphName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontGetGlyphWithGlyphName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native char CGFontGetGlyphWithGlyphName(CGFontRef font, CFStringRef name);

    /**
     * CGFontCopyGlyphNameForGlyph</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCopyGlyphNameForGlyph">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CGFontCopyGlyphNameForGlyph(CGFontRef font, char glyph);

    /**
     * CGFontCanCreatePostScriptSubset</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCanCreatePostScriptSubset">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGFontCanCreatePostScriptSubset(CGFontRef font, int format);

    /**
     * CGFontCopyTableTags</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCopyTableTags">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CGFontCopyTableTags(CGFontRef font);

    /**
     * CGFontCopyTableForTag</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFont/index.html#//apple_ref/c/func/CGFontCopyTableForTag">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CGFontCopyTableForTag(CGFontRef font, int tag);

    /**
     * CGGradientGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGradient/index.html#//apple_ref/c/func/CGGradientGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGGradientGetTypeID();

    /**
     * CGGradientCreateWithColorComponents</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGradient/index.html#//apple_ref/c/func/CGGradientCreateWithColorComponents">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGGradientRef CGGradientCreateWithColorComponents(CGColorSpaceRef space,
            ConstNFloatPtr components, ConstNFloatPtr locations, @NUInt long count);

    /**
     * CGGradientCreateWithColors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGradient/index.html#//apple_ref/c/func/CGGradientCreateWithColors">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGGradientRef CGGradientCreateWithColors(CGColorSpaceRef space, CFArrayRef colors,
            ConstNFloatPtr locations);

    /**
     * CGGradientRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGradient/index.html#//apple_ref/c/func/CGGradientRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGGradientRef CGGradientRetain(CGGradientRef gradient);

    /**
     * CGGradientRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGGradient/index.html#//apple_ref/c/func/CGGradientRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGGradientRelease(CGGradientRef gradient);

    /**
     * CGImageGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetTypeID();

    /**
     * CGImageCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreate(@NUInt long width, @NUInt long height, @NUInt long bitsPerComponent,
            @NUInt long bitsPerPixel, @NUInt long bytesPerRow, CGColorSpaceRef space, int bitmapInfo,
            CGDataProviderRef provider, ConstNFloatPtr decode, boolean shouldInterpolate, int intent);

    /**
     * CGImageMaskCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageMaskCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageMaskCreate(@NUInt long width, @NUInt long height,
            @NUInt long bitsPerComponent, @NUInt long bitsPerPixel, @NUInt long bytesPerRow, CGDataProviderRef provider,
            ConstNFloatPtr decode, boolean shouldInterpolate);

    /**
     * CGImageCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateCopy(CGImageRef image);

    /**
     * CGImageCreateWithJPEGDataProvider</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreateWithJPEGDataProvider">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithJPEGDataProvider(CGDataProviderRef source, ConstNFloatPtr decode,
            boolean shouldInterpolate, int intent);

    /**
     * CGImageCreateWithPNGDataProvider</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreateWithPNGDataProvider">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithPNGDataProvider(CGDataProviderRef source, ConstNFloatPtr decode,
            boolean shouldInterpolate, int intent);

    /**
     * CGImageCreateWithImageInRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreateWithImageInRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithImageInRect(CGImageRef image, @ByValue CGRect rect);

    /**
     * CGImageCreateWithMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreateWithMask">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithMask(CGImageRef image, CGImageRef mask);

    /**
     * CGImageCreateWithMaskingColors</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreateWithMaskingColors">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateWithMaskingColors(CGImageRef image, ConstNFloatPtr components);

    /**
     * CGImageCreateCopyWithColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageCreateCopyWithColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageCreateCopyWithColorSpace(CGImageRef image, CGColorSpaceRef space);

    /**
     * CGImageRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGImageRetain(CGImageRef image);

    /**
     * CGImageRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGImageRelease(CGImageRef image);

    /**
     * CGImageIsMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageIsMask">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGImageIsMask(CGImageRef image);

    /**
     * CGImageGetWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetWidth">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetWidth(CGImageRef image);

    /**
     * CGImageGetHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetHeight">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetHeight(CGImageRef image);

    /**
     * CGImageGetBitsPerComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetBitsPerComponent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBitsPerComponent(CGImageRef image);

    /**
     * CGImageGetBitsPerPixel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetBitsPerPixel">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBitsPerPixel(CGImageRef image);

    /**
     * CGImageGetBytesPerRow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetBytesPerRow">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGImageGetBytesPerRow(CGImageRef image);

    /**
     * CGImageGetColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGImageGetColorSpace(CGImageRef image);

    /**
     * CGImageGetAlphaInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetAlphaInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGImageGetAlphaInfo(CGImageRef image);

    /**
     * CGImageGetDataProvider</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetDataProvider">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataProviderRef CGImageGetDataProvider(CGImageRef image);

    /**
     * CGImageGetDecode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetDecode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native ConstNFloatPtr CGImageGetDecode(CGImageRef image);

    /**
     * CGImageGetShouldInterpolate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetShouldInterpolate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGImageGetShouldInterpolate(CGImageRef image);

    /**
     * CGImageGetRenderingIntent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetRenderingIntent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGImageGetRenderingIntent(CGImageRef image);

    /**
     * CGImageGetBitmapInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGImage/index.html#//apple_ref/c/func/CGImageGetBitmapInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGImageGetBitmapInfo(CGImageRef image);

    /**
     * CGPathGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPathGetTypeID();

    /**
     * CGPathCreateMutable</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateMutable">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutable();

    /**
     * CGPathCreateCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopy(CGPathRef path);

    /**
     * CGPathCreateCopyByTransformingPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateCopyByTransformingPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByTransformingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * CGPathCreateMutableCopy</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateMutableCopy">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutableCopy(CGPathRef path);

    /**
     * CGPathCreateMutableCopyByTransformingPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateMutableCopyByTransformingPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGMutablePathRef CGPathCreateMutableCopyByTransformingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * CGPathCreateWithRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateWithRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithRect(@ByValue CGRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * CGPathCreateWithEllipseInRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateWithEllipseInRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithEllipseInRect(@ByValue CGRect rect,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * CGPathCreateWithRoundedRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateWithRoundedRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateWithRoundedRect(@ByValue CGRect rect, @NFloat double cornerWidth,
            @NFloat double cornerHeight,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform);

    /**
     * CGPathAddRoundedRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddRoundedRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddRoundedRect(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @ByValue CGRect rect, @NFloat double cornerWidth, @NFloat double cornerHeight);

    /**
     * CGPathCreateCopyByDashingPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateCopyByDashingPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByDashingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @NFloat double phase, ConstNFloatPtr lengths, @NUInt long count);

    /**
     * CGPathCreateCopyByStrokingPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCreateCopyByStrokingPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathCreateCopyByStrokingPath(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform transform,
            @NFloat double lineWidth, int lineCap, int lineJoin, @NFloat double miterLimit);

    /**
     * CGPathRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGPathRetain(CGPathRef path);

    /**
     * CGPathRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathRelease(CGPathRef path);

    /**
     * CGPathEqualToPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathEqualToPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPathEqualToPath(CGPathRef path1, CGPathRef path2);

    /**
     * CGPathMoveToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathMoveToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathMoveToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x,
            @NFloat double y);

    /**
     * CGPathAddLineToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddLineToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddLineToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x,
            @NFloat double y);

    /**
     * CGPathAddQuadCurveToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddQuadCurveToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddQuadCurveToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double cpx,
            @NFloat double cpy, @NFloat double x, @NFloat double y);

    /**
     * CGPathAddCurveToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddCurveToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddCurveToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @NFloat double cp1x, @NFloat double cp1y, @NFloat double cp2x, @NFloat double cp2y, @NFloat double x,
            @NFloat double y);

    /**
     * CGPathCloseSubpath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathCloseSubpath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathCloseSubpath(CGMutablePathRef path);

    /**
     * CGPathAddRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddRect(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGRect rect);

    /**
     * CGPathAddRects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddRects">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddRects(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    /**
     * CGPathAddLines</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddLines">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddLines(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points, @NUInt long count);

    /**
     * CGPathAddEllipseInRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddEllipseInRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddEllipseInRect(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGRect rect);

    /**
     * CGPathAddRelativeArc</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddRelativeArc">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddRelativeArc(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform matrix,
            @NFloat double x, @NFloat double y, @NFloat double radius, @NFloat double startAngle, @NFloat double delta);

    /**
     * CGPathAddArc</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddArc">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddArc(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x,
            @NFloat double y, @NFloat double radius, @NFloat double startAngle, @NFloat double endAngle,
            boolean clockwise);

    /**
     * CGPathAddArcToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddArcToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddArcToPoint(CGMutablePathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, @NFloat double x1,
            @NFloat double y1, @NFloat double x2, @NFloat double y2, @NFloat double radius);

    /**
     * CGPathAddPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathAddPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathAddPath(CGMutablePathRef path1,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m, CGPathRef path2);

    /**
     * CGPathIsEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathIsEmpty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPathIsEmpty(CGPathRef path);

    /**
     * CGPathIsRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathIsRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPathIsRect(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rect);

    /**
     * CGPathGetCurrentPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathGetCurrentPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGPathGetCurrentPoint(CGPathRef path);

    /**
     * CGPathGetBoundingBox</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathGetBoundingBox">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPathGetBoundingBox(CGPathRef path);

    /**
     * CGPathGetPathBoundingBox</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathGetPathBoundingBox">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPathGetPathBoundingBox(CGPathRef path);

    /**
     * CGPathContainsPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathContainsPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPathContainsPoint(CGPathRef path,
            @UncertainArgument("Options: reference, array Fallback: reference") CGAffineTransform m,
            @ByValue CGPoint point, boolean eoFill);

    /**
     * CGPathApply</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPath/index.html#//apple_ref/c/func/CGPathApply">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPathApply(CGPathRef path, VoidPtr info,
            @FunctionPtr(name = "call_CGPathApply") Function_CGPathApply function);

    /**
     * CGPDFObjectGetType</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFObject/index.html#//apple_ref/c/func/CGPDFObjectGetType">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGPDFObjectGetType(CGPDFObjectRef object);

    /**
     * CGPDFObjectGetValue</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFObject/index.html#//apple_ref/c/func/CGPDFObjectGetValue">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFObjectGetValue(CGPDFObjectRef object, int type, VoidPtr value);

    /**
     * CGPDFStreamGetDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFStream/index.html#//apple_ref/c/func/CGPDFStreamGetDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFStreamGetDictionary(CGPDFStreamRef stream);

    /**
     * CGPDFStreamCopyData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFStream/index.html#//apple_ref/c/func/CGPDFStreamCopyData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDataRef CGPDFStreamCopyData(CGPDFStreamRef stream, IntPtr format);

    /**
     * CGPDFStringGetLength</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFString/index.html#//apple_ref/c/func/CGPDFStringGetLength">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFStringGetLength(CGPDFStringRef string);

    /**
     * CGPDFStringGetBytePtr</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFString/index.html#//apple_ref/c/func/CGPDFStringGetBytePtr">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @UncertainReturn("Options: java.string, c.const-byte-ptr Fallback: java.string")
    public static native String CGPDFStringGetBytePtr(CGPDFStringRef string);

    /**
     * CGPDFStringCopyTextString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFString/index.html#//apple_ref/c/func/CGPDFStringCopyTextString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFStringRef CGPDFStringCopyTextString(CGPDFStringRef string);

    /**
     * CGPDFStringCopyDate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFString/index.html#//apple_ref/c/func/CGPDFStringCopyDate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFDateRef CGPDFStringCopyDate(CGPDFStringRef string);

    /**
     * CGPDFArrayGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFArrayGetCount(CGPDFArrayRef array);

    /**
     * CGPDFArrayGetObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetObject">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetObject(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFObjectRef> value);

    /**
     * CGPDFArrayGetNull</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetNull">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetNull(CGPDFArrayRef array, @NUInt long index);

    /**
     * CGPDFArrayGetBoolean</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetBoolean">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetBoolean(CGPDFArrayRef array, @NUInt long index, BytePtr value);

    /**
     * CGPDFArrayGetInteger</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetInteger">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetInteger(CGPDFArrayRef array, @NUInt long index, NIntPtr value);

    /**
     * CGPDFArrayGetNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetNumber(CGPDFArrayRef array, @NUInt long index, NFloatPtr value);

    /**
     * CGPDFArrayGetName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetName(CGPDFArrayRef array, @NUInt long index,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    /**
     * CGPDFArrayGetString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetString(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFStringRef> value);

    /**
     * CGPDFArrayGetArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetArray(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFArrayRef> value);

    /**
     * CGPDFArrayGetDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetDictionary(CGPDFArrayRef array, @NUInt long index,
            Ptr<CGPDFDictionaryRef> value);

    /**
     * CGPDFArrayGetStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFArray/index.html#//apple_ref/c/func/CGPDFArrayGetStream">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFArrayGetStream(CGPDFArrayRef array, @NUInt long index, Ptr<CGPDFStreamRef> value);

    /**
     * CGPDFDictionaryGetCount</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetCount">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDictionaryGetCount(CGPDFDictionaryRef dict);

    /**
     * CGPDFDictionaryGetObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetObject">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetObject(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFObjectRef> value);

    /**
     * CGPDFDictionaryGetBoolean</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetBoolean">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetBoolean(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            BytePtr value);

    /**
     * CGPDFDictionaryGetInteger</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetInteger">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetInteger(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            NIntPtr value);

    /**
     * CGPDFDictionaryGetNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetNumber(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            NFloatPtr value);

    /**
     * CGPDFDictionaryGetName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetName(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    /**
     * CGPDFDictionaryGetString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetString(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFStringRef> value);

    /**
     * CGPDFDictionaryGetArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetArray(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFArrayRef> value);

    /**
     * CGPDFDictionaryGetDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetDictionary(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFDictionaryRef> value);

    /**
     * CGPDFDictionaryGetStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryGetStream">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDictionaryGetStream(CGPDFDictionaryRef dict,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String key,
            Ptr<CGPDFStreamRef> value);

    /**
     * CGPDFDictionaryApplyFunction</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDictionary/index.html#//apple_ref/c/func/CGPDFDictionaryApplyFunction">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFDictionaryApplyFunction(CGPDFDictionaryRef dict,
            @FunctionPtr(name = "call_CGPDFDictionaryApplyFunction") Function_CGPDFDictionaryApplyFunction function,
            VoidPtr info);

    /**
     * CGPDFPageRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFPageRef CGPDFPageRetain(CGPDFPageRef page);

    /**
     * CGPDFPageRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFPageRelease(CGPDFPageRef page);

    /**
     * CGPDFPageGetDocument</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageGetDocument">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFPageGetDocument(CGPDFPageRef page);

    /**
     * CGPDFPageGetPageNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageGetPageNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFPageGetPageNumber(CGPDFPageRef page);

    /**
     * CGPDFPageGetBoxRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageGetBoxRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGPDFPageGetBoxRect(CGPDFPageRef page, int box);

    /**
     * CGPDFPageGetRotationAngle</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageGetRotationAngle">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGPDFPageGetRotationAngle(CGPDFPageRef page);

    /**
     * CGPDFPageGetDrawingTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageGetDrawingTransform">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGPDFPageGetDrawingTransform(CGPDFPageRef page, int box,
            @ByValue CGRect rect, int rotate, boolean preserveAspectRatio);

    /**
     * CGPDFPageGetDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageGetDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFPageGetDictionary(CGPDFPageRef page);

    /**
     * CGPDFPageGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFPage/index.html#//apple_ref/c/func/CGPDFPageGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFPageGetTypeID();

    /**
     * CGPDFDocumentCreateWithProvider</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentCreateWithProvider">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentCreateWithProvider(CGDataProviderRef provider);

    /**
     * CGPDFDocumentCreateWithURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentCreateWithURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentCreateWithURL(CFURLRef url);

    /**
     * CGPDFDocumentRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDocumentRef CGPDFDocumentRetain(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFDocumentRelease(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentGetVersion</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentGetVersion">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFDocumentGetVersion(CGPDFDocumentRef document, IntPtr majorVersion,
            IntPtr minorVersion);

    /**
     * CGPDFDocumentIsEncrypted</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentIsEncrypted">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentIsEncrypted(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentUnlockWithPassword</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentUnlockWithPassword">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentUnlockWithPassword(CGPDFDocumentRef document,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String password);

    /**
     * CGPDFDocumentIsUnlocked</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentIsUnlocked">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentIsUnlocked(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentAllowsPrinting</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentAllowsPrinting">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentAllowsPrinting(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentAllowsCopying</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentAllowsCopying">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFDocumentAllowsCopying(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentGetNumberOfPages</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentGetNumberOfPages">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDocumentGetNumberOfPages(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentGetPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentGetPage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFPageRef CGPDFDocumentGetPage(CGPDFDocumentRef document, @NUInt long pageNumber);

    /**
     * CGPDFDocumentGetCatalog</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentGetCatalog">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFDocumentGetCatalog(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentGetInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentGetInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFDictionaryRef CGPDFDocumentGetInfo(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentGetID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentGetID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFArrayRef CGPDFDocumentGetID(CGPDFDocumentRef document);

    /**
     * CGPDFDocumentGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFDocument/index.html#//apple_ref/c/func/CGPDFDocumentGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGPDFDocumentGetTypeID();

    /**
     * CGFunctionGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFunction/index.html#//apple_ref/c/func/CGFunctionGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGFunctionGetTypeID();

    /**
     * CGFunctionCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFunction/index.html#//apple_ref/c/func/CGFunctionCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGFunctionRef CGFunctionCreate(VoidPtr info, @NUInt long domainDimension,
            ConstNFloatPtr domain, @NUInt long rangeDimension, ConstNFloatPtr range,
            @UncertainArgument("Options: reference, array Fallback: reference") CGFunctionCallbacks callbacks);

    /**
     * CGFunctionRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFunction/index.html#//apple_ref/c/func/CGFunctionRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGFunctionRef CGFunctionRetain(CGFunctionRef function);

    /**
     * CGFunctionRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGFunction/index.html#//apple_ref/c/func/CGFunctionRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGFunctionRelease(CGFunctionRef function);

    /**
     * CGShadingGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGShading/index.html#//apple_ref/c/func/CGShadingGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGShadingGetTypeID();

    /**
     * CGShadingCreateAxial</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGShading/index.html#//apple_ref/c/func/CGShadingCreateAxial">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGShadingRef CGShadingCreateAxial(CGColorSpaceRef space, @ByValue CGPoint start,
            @ByValue CGPoint end, CGFunctionRef function, boolean extendStart, boolean extendEnd);

    /**
     * CGShadingCreateRadial</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGShading/index.html#//apple_ref/c/func/CGShadingCreateRadial">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGShadingRef CGShadingCreateRadial(CGColorSpaceRef space, @ByValue CGPoint start,
            @NFloat double startRadius, @ByValue CGPoint end, @NFloat double endRadius, CGFunctionRef function,
            boolean extendStart, boolean extendEnd);

    /**
     * CGShadingRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGShading/index.html#//apple_ref/c/func/CGShadingRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGShadingRef CGShadingRetain(CGShadingRef shading);

    /**
     * CGShadingRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGShading/index.html#//apple_ref/c/func/CGShadingRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGShadingRelease(CGShadingRef shading);

    /**
     * CGContextGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGContextGetTypeID();

    /**
     * CGContextSaveGState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSaveGState">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSaveGState(CGContextRef c);

    /**
     * CGContextRestoreGState</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextRestoreGState">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextRestoreGState(CGContextRef c);

    /**
     * CGContextScaleCTM</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextScaleCTM">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextScaleCTM(CGContextRef c, @NFloat double sx, @NFloat double sy);

    /**
     * CGContextTranslateCTM</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextTranslateCTM">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextTranslateCTM(CGContextRef c, @NFloat double tx, @NFloat double ty);

    /**
     * CGContextRotateCTM</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextRotateCTM">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextRotateCTM(CGContextRef c, @NFloat double angle);

    /**
     * CGContextConcatCTM</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextConcatCTM">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextConcatCTM(CGContextRef c, @ByValue CGAffineTransform transform);

    /**
     * CGContextGetCTM</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetCTM">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetCTM(CGContextRef c);

    /**
     * CGContextSetLineWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetLineWidth">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineWidth(CGContextRef c, @NFloat double width);

    /**
     * CGContextSetLineCap</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetLineCap">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineCap(CGContextRef c, int cap);

    /**
     * CGContextSetLineJoin</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetLineJoin">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineJoin(CGContextRef c, int join);

    /**
     * CGContextSetMiterLimit</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetMiterLimit">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetMiterLimit(CGContextRef c, @NFloat double limit);

    /**
     * CGContextSetLineDash</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetLineDash">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetLineDash(CGContextRef c, @NFloat double phase, ConstNFloatPtr lengths,
            @NUInt long count);

    /**
     * CGContextSetFlatness</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetFlatness">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetFlatness(CGContextRef c, @NFloat double flatness);

    /**
     * CGContextSetAlpha</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetAlpha">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetAlpha(CGContextRef c, @NFloat double alpha);

    /**
     * CGContextSetBlendMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetBlendMode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetBlendMode(CGContextRef c, int mode);

    /**
     * CGContextBeginPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextBeginPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextBeginPath(CGContextRef c);

    /**
     * CGContextMoveToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextMoveToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextMoveToPoint(CGContextRef c, @NFloat double x, @NFloat double y);

    /**
     * CGContextAddLineToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddLineToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddLineToPoint(CGContextRef c, @NFloat double x, @NFloat double y);

    /**
     * CGContextAddCurveToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddCurveToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddCurveToPoint(CGContextRef c, @NFloat double cp1x, @NFloat double cp1y,
            @NFloat double cp2x, @NFloat double cp2y, @NFloat double x, @NFloat double y);

    /**
     * CGContextAddQuadCurveToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddQuadCurveToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddQuadCurveToPoint(CGContextRef c, @NFloat double cpx, @NFloat double cpy,
            @NFloat double x, @NFloat double y);

    /**
     * CGContextClosePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextClosePath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextClosePath(CGContextRef c);

    /**
     * CGContextAddRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextAddRects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddRects">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddRects(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    /**
     * CGContextAddLines</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddLines">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddLines(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points, @NUInt long count);

    /**
     * CGContextAddEllipseInRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddEllipseInRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddEllipseInRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextAddArc</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddArc">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddArc(CGContextRef c, @NFloat double x, @NFloat double y, @NFloat double radius,
            @NFloat double startAngle, @NFloat double endAngle, int clockwise);

    /**
     * CGContextAddArcToPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddArcToPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddArcToPoint(CGContextRef c, @NFloat double x1, @NFloat double y1,
            @NFloat double x2, @NFloat double y2, @NFloat double radius);

    /**
     * CGContextAddPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextAddPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextAddPath(CGContextRef c, CGPathRef path);

    /**
     * CGContextReplacePathWithStrokedPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextReplacePathWithStrokedPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextReplacePathWithStrokedPath(CGContextRef c);

    /**
     * CGContextIsPathEmpty</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextIsPathEmpty">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGContextIsPathEmpty(CGContextRef c);

    /**
     * CGContextGetPathCurrentPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetPathCurrentPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextGetPathCurrentPoint(CGContextRef c);

    /**
     * CGContextGetPathBoundingBox</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetPathBoundingBox">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextGetPathBoundingBox(CGContextRef c);

    /**
     * CGContextCopyPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextCopyPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPathRef CGContextCopyPath(CGContextRef c);

    /**
     * CGContextPathContainsPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextPathContainsPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGContextPathContainsPoint(CGContextRef c, @ByValue CGPoint point, int mode);

    /**
     * CGContextDrawPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextDrawPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawPath(CGContextRef c, int mode);

    /**
     * CGContextFillPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextFillPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextFillPath(CGContextRef c);

    /**
     * CGContextEOFillPath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextEOFillPath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextEOFillPath(CGContextRef c);

    /**
     * CGContextStrokePath</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextStrokePath">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextStrokePath(CGContextRef c);

    /**
     * CGContextFillRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextFillRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextFillRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextFillRects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextFillRects">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextFillRects(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    /**
     * CGContextStrokeRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextStrokeRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextStrokeRectWithWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextStrokeRectWithWidth">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeRectWithWidth(CGContextRef c, @ByValue CGRect rect, @NFloat double width);

    /**
     * CGContextClearRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextClearRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextClearRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextFillEllipseInRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextFillEllipseInRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextFillEllipseInRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextStrokeEllipseInRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextStrokeEllipseInRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeEllipseInRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextStrokeLineSegments</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextStrokeLineSegments">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextStrokeLineSegments(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint points, @NUInt long count);

    /**
     * CGContextClip</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextClip">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextClip(CGContextRef c);

    /**
     * CGContextEOClip</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextEOClip">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextEOClip(CGContextRef c);

    /**
     * CGContextClipToMask</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextClipToMask">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextClipToMask(CGContextRef c, @ByValue CGRect rect, CGImageRef mask);

    /**
     * CGContextGetClipBoundingBox</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetClipBoundingBox">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextGetClipBoundingBox(CGContextRef c);

    /**
     * CGContextClipToRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextClipToRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextClipToRect(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextClipToRects</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextClipToRects">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextClipToRects(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect rects, @NUInt long count);

    /**
     * CGContextSetFillColorWithColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetFillColorWithColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillColorWithColor(CGContextRef c, CGColorRef color);

    /**
     * CGContextSetStrokeColorWithColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetStrokeColorWithColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokeColorWithColor(CGContextRef c, CGColorRef color);

    /**
     * CGContextSetFillColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetFillColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillColorSpace(CGContextRef c, CGColorSpaceRef space);

    /**
     * CGContextSetStrokeColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetStrokeColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokeColorSpace(CGContextRef c, CGColorSpaceRef space);

    /**
     * CGContextSetFillColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetFillColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillColor(CGContextRef c, ConstNFloatPtr components);

    /**
     * CGContextSetStrokeColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetStrokeColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokeColor(CGContextRef c, ConstNFloatPtr components);

    /**
     * CGContextSetFillPattern</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetFillPattern">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetFillPattern(CGContextRef c, CGPatternRef pattern, ConstNFloatPtr components);

    /**
     * CGContextSetStrokePattern</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetStrokePattern">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetStrokePattern(CGContextRef c, CGPatternRef pattern,
            ConstNFloatPtr components);

    /**
     * CGContextSetPatternPhase</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetPatternPhase">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetPatternPhase(CGContextRef c, @ByValue CGSize phase);

    /**
     * CGContextSetGrayFillColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetGrayFillColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetGrayFillColor(CGContextRef c, @NFloat double gray, @NFloat double alpha);

    /**
     * CGContextSetGrayStrokeColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetGrayStrokeColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetGrayStrokeColor(CGContextRef c, @NFloat double gray, @NFloat double alpha);

    /**
     * CGContextSetRGBFillColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetRGBFillColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetRGBFillColor(CGContextRef c, @NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    /**
     * CGContextSetRGBStrokeColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetRGBStrokeColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetRGBStrokeColor(CGContextRef c, @NFloat double red, @NFloat double green,
            @NFloat double blue, @NFloat double alpha);

    /**
     * CGContextSetCMYKFillColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetCMYKFillColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetCMYKFillColor(CGContextRef c, @NFloat double cyan, @NFloat double magenta,
            @NFloat double yellow, @NFloat double black, @NFloat double alpha);

    /**
     * CGContextSetCMYKStrokeColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetCMYKStrokeColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetCMYKStrokeColor(CGContextRef c, @NFloat double cyan, @NFloat double magenta,
            @NFloat double yellow, @NFloat double black, @NFloat double alpha);

    /**
     * CGContextSetRenderingIntent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetRenderingIntent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetRenderingIntent(CGContextRef c, int intent);

    /**
     * CGContextDrawImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextDrawImage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawImage(CGContextRef c, @ByValue CGRect rect, CGImageRef image);

    /**
     * CGContextDrawTiledImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextDrawTiledImage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawTiledImage(CGContextRef c, @ByValue CGRect rect, CGImageRef image);

    /**
     * CGContextGetInterpolationQuality</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetInterpolationQuality">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGContextGetInterpolationQuality(CGContextRef c);

    /**
     * CGContextSetInterpolationQuality</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetInterpolationQuality">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetInterpolationQuality(CGContextRef c, int quality);

    /**
     * CGContextSetShadowWithColor</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetShadowWithColor">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetShadowWithColor(CGContextRef c, @ByValue CGSize offset, @NFloat double blur,
            CGColorRef color);

    /**
     * CGContextSetShadow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetShadow">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetShadow(CGContextRef c, @ByValue CGSize offset, @NFloat double blur);

    /**
     * CGContextDrawLinearGradient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextDrawLinearGradient">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawLinearGradient(CGContextRef c, CGGradientRef gradient,
            @ByValue CGPoint startPoint, @ByValue CGPoint endPoint, int options);

    /**
     * CGContextDrawRadialGradient</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextDrawRadialGradient">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawRadialGradient(CGContextRef c, CGGradientRef gradient,
            @ByValue CGPoint startCenter, @NFloat double startRadius, @ByValue CGPoint endCenter,
            @NFloat double endRadius, int options);

    /**
     * CGContextDrawShading</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextDrawShading">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawShading(CGContextRef c, CGShadingRef shading);

    /**
     * CGContextSetCharacterSpacing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetCharacterSpacing">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetCharacterSpacing(CGContextRef c, @NFloat double spacing);

    /**
     * CGContextSetTextPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetTextPosition">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetTextPosition(CGContextRef c, @NFloat double x, @NFloat double y);

    /**
     * CGContextGetTextPosition</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetTextPosition">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextGetTextPosition(CGContextRef c);

    /**
     * CGContextSetTextMatrix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetTextMatrix">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetTextMatrix(CGContextRef c, @ByValue CGAffineTransform t);

    /**
     * CGContextGetTextMatrix</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetTextMatrix">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetTextMatrix(CGContextRef c);

    /**
     * CGContextSetTextDrawingMode</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetTextDrawingMode">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetTextDrawingMode(CGContextRef c, int mode);

    /**
     * CGContextSetFont</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetFont">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetFont(CGContextRef c, CGFontRef font);

    /**
     * CGContextSetFontSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetFontSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetFontSize(CGContextRef c, @NFloat double size);

    /**
     * CGContextShowGlyphsAtPositions</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextShowGlyphsAtPositions">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextShowGlyphsAtPositions(CGContextRef c, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGPoint Lpositions, @NUInt long count);

    /**
     * CGContextDrawPDFPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextDrawPDFPage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawPDFPage(CGContextRef c, CGPDFPageRef page);

    /**
     * CGContextBeginPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextBeginPage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextBeginPage(CGContextRef c,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox);

    /**
     * CGContextEndPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextEndPage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextEndPage(CGContextRef c);

    /**
     * CGContextRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGContextRef CGContextRetain(CGContextRef c);

    /**
     * CGContextRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextRelease(CGContextRef c);

    /**
     * CGContextFlush</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextFlush">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextFlush(CGContextRef c);

    /**
     * CGContextSynchronize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSynchronize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSynchronize(CGContextRef c);

    /**
     * CGContextSetShouldAntialias</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetShouldAntialias">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldAntialias(CGContextRef c, boolean shouldAntialias);

    /**
     * CGContextSetAllowsAntialiasing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetAllowsAntialiasing">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsAntialiasing(CGContextRef c, boolean allowsAntialiasing);

    /**
     * CGContextSetShouldSmoothFonts</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetShouldSmoothFonts">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldSmoothFonts(CGContextRef c, boolean shouldSmoothFonts);

    /**
     * CGContextSetAllowsFontSmoothing</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetAllowsFontSmoothing">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSmoothing(CGContextRef c, boolean allowsFontSmoothing);

    /**
     * CGContextSetShouldSubpixelPositionFonts</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetShouldSubpixelPositionFonts">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldSubpixelPositionFonts(CGContextRef c,
            boolean shouldSubpixelPositionFonts);

    /**
     * CGContextSetAllowsFontSubpixelPositioning</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetAllowsFontSubpixelPositioning">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSubpixelPositioning(CGContextRef c,
            boolean allowsFontSubpixelPositioning);

    /**
     * CGContextSetShouldSubpixelQuantizeFonts</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetShouldSubpixelQuantizeFonts">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetShouldSubpixelQuantizeFonts(CGContextRef c,
            boolean shouldSubpixelQuantizeFonts);

    /**
     * CGContextSetAllowsFontSubpixelQuantization</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSetAllowsFontSubpixelQuantization">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextSetAllowsFontSubpixelQuantization(CGContextRef c,
            boolean allowsFontSubpixelQuantization);

    /**
     * CGContextBeginTransparencyLayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextBeginTransparencyLayer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextBeginTransparencyLayer(CGContextRef c, CFDictionaryRef auxiliaryInfo);

    /**
     * CGContextBeginTransparencyLayerWithRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextBeginTransparencyLayerWithRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextBeginTransparencyLayerWithRect(CGContextRef c, @ByValue CGRect rect,
            CFDictionaryRef auxInfo);

    /**
     * CGContextEndTransparencyLayer</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextEndTransparencyLayer">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextEndTransparencyLayer(CGContextRef c);

    /**
     * CGContextGetUserSpaceToDeviceSpaceTransform</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextGetUserSpaceToDeviceSpaceTransform">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGAffineTransform CGContextGetUserSpaceToDeviceSpaceTransform(CGContextRef c);

    /**
     * CGContextConvertPointToDeviceSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextConvertPointToDeviceSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextConvertPointToDeviceSpace(CGContextRef c, @ByValue CGPoint point);

    /**
     * CGContextConvertPointToUserSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextConvertPointToUserSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGPoint CGContextConvertPointToUserSpace(CGContextRef c, @ByValue CGPoint point);

    /**
     * CGContextConvertSizeToDeviceSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextConvertSizeToDeviceSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGContextConvertSizeToDeviceSpace(CGContextRef c, @ByValue CGSize size);

    /**
     * CGContextConvertSizeToUserSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextConvertSizeToUserSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGContextConvertSizeToUserSpace(CGContextRef c, @ByValue CGSize size);

    /**
     * CGContextConvertRectToDeviceSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextConvertRectToDeviceSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextConvertRectToDeviceSpace(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextConvertRectToUserSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextConvertRectToUserSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGRect CGContextConvertRectToUserSpace(CGContextRef c, @ByValue CGRect rect);

    /**
     * CGContextSelectFont</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextSelectFont">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextSelectFont(CGContextRef c,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name,
            @NFloat double size, int textEncoding);

    /**
     * CGContextShowText</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextShowText">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowText(CGContextRef c,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
            @NUInt long length);

    /**
     * CGContextShowTextAtPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextShowTextAtPoint">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowTextAtPoint(CGContextRef c, @NFloat double x, @NFloat double y,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String string,
            @NUInt long length);

    /**
     * CGContextShowGlyphs</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextShowGlyphs">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphs(CGContextRef c, ConstCharPtr g, @NUInt long count);

    /**
     * CGContextShowGlyphsAtPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextShowGlyphsAtPoint">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphsAtPoint(CGContextRef c, @NFloat double x, @NFloat double y,
            ConstCharPtr glyphs, @NUInt long count);

    /**
     * CGContextShowGlyphsWithAdvances</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGContext/index.html#//apple_ref/c/func/CGContextShowGlyphsWithAdvances">iOS Dev Center</a>
     */
    @Generated
    @Deprecated
    @CFunction
    public static native void CGContextShowGlyphsWithAdvances(CGContextRef c, ConstCharPtr glyphs,
            @UncertainArgument("Options: reference, array Fallback: reference") CGSize advances, @NUInt long count);

    /**
     * CGBitmapContextCreateWithData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextCreateWithData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGContextRef CGBitmapContextCreateWithData(VoidPtr data, @NUInt long width, @NUInt long height,
            @NUInt long bitsPerComponent, @NUInt long bytesPerRow, CGColorSpaceRef space, int bitmapInfo,
            @FunctionPtr(name = "call_CGBitmapContextCreateWithData") Function_CGBitmapContextCreateWithData releaseCallback,
            VoidPtr releaseInfo);

    /**
     * CGBitmapContextCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGContextRef CGBitmapContextCreate(VoidPtr data, @NUInt long width, @NUInt long height,
            @NUInt long bitsPerComponent, @NUInt long bytesPerRow, CGColorSpaceRef space, int bitmapInfo);

    /**
     * CGBitmapContextGetData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native VoidPtr CGBitmapContextGetData(CGContextRef context);

    /**
     * CGBitmapContextGetWidth</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetWidth">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetWidth(CGContextRef context);

    /**
     * CGBitmapContextGetHeight</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetHeight">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetHeight(CGContextRef context);

    /**
     * CGBitmapContextGetBitsPerComponent</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetBitsPerComponent">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBitsPerComponent(CGContextRef context);

    /**
     * CGBitmapContextGetBitsPerPixel</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetBitsPerPixel">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBitsPerPixel(CGContextRef context);

    /**
     * CGBitmapContextGetBytesPerRow</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetBytesPerRow">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGBitmapContextGetBytesPerRow(CGContextRef context);

    /**
     * CGBitmapContextGetColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGBitmapContextGetColorSpace(CGContextRef context);

    /**
     * CGBitmapContextGetAlphaInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetAlphaInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGBitmapContextGetAlphaInfo(CGContextRef context);

    /**
     * CGBitmapContextGetBitmapInfo</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextGetBitmapInfo">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native int CGBitmapContextGetBitmapInfo(CGContextRef context);

    /**
     * CGBitmapContextCreateImage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGBitmapContext/index.html#//apple_ref/c/func/CGBitmapContextCreateImage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGImageRef CGBitmapContextCreateImage(CGContextRef context);

    /**
     * CGDataConsumerGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataConsumer/index.html#//apple_ref/c/func/CGDataConsumerGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGDataConsumerGetTypeID();

    /**
     * CGDataConsumerCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataConsumer/index.html#//apple_ref/c/func/CGDataConsumerCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreate(VoidPtr info,
            @UncertainArgument("Options: reference, array Fallback: reference") CGDataConsumerCallbacks cbks);

    /**
     * CGDataConsumerCreateWithURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataConsumer/index.html#//apple_ref/c/func/CGDataConsumerCreateWithURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreateWithURL(CFURLRef url);

    /**
     * CGDataConsumerCreateWithCFData</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataConsumer/index.html#//apple_ref/c/func/CGDataConsumerCreateWithCFData">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerCreateWithCFData(CFMutableDataRef data);

    /**
     * CGDataConsumerRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataConsumer/index.html#//apple_ref/c/func/CGDataConsumerRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGDataConsumerRef CGDataConsumerRetain(CGDataConsumerRef consumer);

    /**
     * CGDataConsumerRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGDataConsumer/index.html#//apple_ref/c/func/CGDataConsumerRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGDataConsumerRelease(CGDataConsumerRef consumer);

    /**
     * CGLayerCreateWithContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGLayerCreateWithContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGLayerRef CGLayerCreateWithContext(CGContextRef context, @ByValue CGSize size,
            CFDictionaryRef auxiliaryInfo);

    /**
     * CGLayerRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGLayerRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGLayerRef CGLayerRetain(CGLayerRef layer);

    /**
     * CGLayerRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGLayerRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGLayerRelease(CGLayerRef layer);

    /**
     * CGLayerGetSize</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGLayerGetSize">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @ByValue
    public static native CGSize CGLayerGetSize(CGLayerRef layer);

    /**
     * CGLayerGetContext</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGLayerGetContext">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGContextRef CGLayerGetContext(CGLayerRef layer);

    /**
     * CGContextDrawLayerInRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGContextDrawLayerInRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawLayerInRect(CGContextRef context, @ByValue CGRect rect, CGLayerRef layer);

    /**
     * CGContextDrawLayerAtPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGContextDrawLayerAtPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGContextDrawLayerAtPoint(CGContextRef context, @ByValue CGPoint point, CGLayerRef layer);

    /**
     * CGLayerGetTypeID</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGLayer/index.html#//apple_ref/c/func/CGLayerGetTypeID">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    @NUInt
    public static native long CGLayerGetTypeID();

    /**
     * CGPDFContentStreamCreateWithPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContentStream/index.html#//apple_ref/c/func/CGPDFContentStreamCreateWithPage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithPage(CGPDFPageRef page);

    /**
     * CGPDFContentStreamCreateWithStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContentStream/index.html#//apple_ref/c/func/CGPDFContentStreamCreateWithStream">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamCreateWithStream(CGPDFStreamRef stream,
            CGPDFDictionaryRef streamResources, CGPDFContentStreamRef parent);

    /**
     * CGPDFContentStreamRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContentStream/index.html#//apple_ref/c/func/CGPDFContentStreamRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFContentStreamRetain(CGPDFContentStreamRef cs);

    /**
     * CGPDFContentStreamRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContentStream/index.html#//apple_ref/c/func/CGPDFContentStreamRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContentStreamRelease(CGPDFContentStreamRef cs);

    /**
     * CGPDFContentStreamGetStreams</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContentStream/index.html#//apple_ref/c/func/CGPDFContentStreamGetStreams">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CFArrayRef CGPDFContentStreamGetStreams(CGPDFContentStreamRef cs);

    /**
     * CGPDFContentStreamGetResource</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContentStream/index.html#//apple_ref/c/func/CGPDFContentStreamGetResource">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFObjectRef CGPDFContentStreamGetResource(CGPDFContentStreamRef cs,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String category,
            @UncertainArgument("Options: java.string, c.const-byte-ptr Fallback: java.string") String name);

    /**
     * CGPDFContextCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGContextRef CGPDFContextCreate(CGDataConsumerRef consumer,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
            CFDictionaryRef auxiliaryInfo);

    /**
     * CGPDFContextCreateWithURL</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextCreateWithURL">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGContextRef CGPDFContextCreateWithURL(CFURLRef url,
            @UncertainArgument("Options: reference, array Fallback: reference") CGRect mediaBox,
            CFDictionaryRef auxiliaryInfo);

    /**
     * CGPDFContextClose</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextClose">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContextClose(CGContextRef context);

    /**
     * CGPDFContextBeginPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextBeginPage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContextBeginPage(CGContextRef context, CFDictionaryRef pageInfo);

    /**
     * CGPDFContextEndPage</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextEndPage">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContextEndPage(CGContextRef context);

    /**
     * CGPDFContextAddDocumentMetadata</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextAddDocumentMetadata">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContextAddDocumentMetadata(CGContextRef context, CFDataRef metadata);

    /**
     * CGPDFContextSetURLForRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextSetURLForRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContextSetURLForRect(CGContextRef context, CFURLRef url, @ByValue CGRect rect);

    /**
     * CGPDFContextAddDestinationAtPoint</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextAddDestinationAtPoint">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContextAddDestinationAtPoint(CGContextRef context, CFStringRef name,
            @ByValue CGPoint point);

    /**
     * CGPDFContextSetDestinationForRect</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFContext/index.html#//apple_ref/c/func/CGPDFContextSetDestinationForRect">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFContextSetDestinationForRect(CGContextRef context, CFStringRef name,
            @ByValue CGRect rect);

    /**
     * CGPDFScannerCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFScannerRef CGPDFScannerCreate(CGPDFContentStreamRef cs, CGPDFOperatorTableRef table,
            VoidPtr info);

    /**
     * CGPDFScannerRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFScannerRef CGPDFScannerRetain(CGPDFScannerRef scanner);

    /**
     * CGPDFScannerRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFScannerRelease(CGPDFScannerRef scanner);

    /**
     * CGPDFScannerScan</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerScan">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerScan(CGPDFScannerRef scanner);

    /**
     * CGPDFScannerGetContentStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerGetContentStream">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFContentStreamRef CGPDFScannerGetContentStream(CGPDFScannerRef scanner);

    /**
     * CGPDFScannerPopObject</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopObject">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopObject(CGPDFScannerRef scanner, Ptr<CGPDFObjectRef> value);

    /**
     * CGPDFScannerPopBoolean</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopBoolean">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopBoolean(CGPDFScannerRef scanner, BytePtr value);

    /**
     * CGPDFScannerPopInteger</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopInteger">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopInteger(CGPDFScannerRef scanner, NIntPtr value);

    /**
     * CGPDFScannerPopNumber</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopNumber">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopNumber(CGPDFScannerRef scanner, NFloatPtr value);

    /**
     * CGPDFScannerPopName</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopName">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopName(CGPDFScannerRef scanner,
            @UncertainArgument("Options: java.string.array, c.const-byte-ptr-ptr Fallback: java.string.array") @Mapped(CStringArrayMapper.class) String[] value);

    /**
     * CGPDFScannerPopString</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopString">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopString(CGPDFScannerRef scanner, Ptr<CGPDFStringRef> value);

    /**
     * CGPDFScannerPopArray</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopArray">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopArray(CGPDFScannerRef scanner, Ptr<CGPDFArrayRef> value);

    /**
     * CGPDFScannerPopDictionary</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopDictionary">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopDictionary(CGPDFScannerRef scanner, Ptr<CGPDFDictionaryRef> value);

    /**
     * CGPDFScannerPopStream</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFScanner/index.html#//apple_ref/c/func/CGPDFScannerPopStream">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native boolean CGPDFScannerPopStream(CGPDFScannerRef scanner, Ptr<CGPDFStreamRef> value);

    /**
     * CGPDFOperatorTableCreate</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFOperatorTable/index.html#//apple_ref/c/func/CGPDFOperatorTableCreate">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFOperatorTableRef CGPDFOperatorTableCreate();

    /**
     * CGPDFOperatorTableRetain</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFOperatorTable/index.html#//apple_ref/c/func/CGPDFOperatorTableRetain">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGPDFOperatorTableRef CGPDFOperatorTableRetain(CGPDFOperatorTableRef table);

    /**
     * CGPDFOperatorTableRelease</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFOperatorTable/index.html#//apple_ref/c/func/CGPDFOperatorTableRelease">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native void CGPDFOperatorTableRelease(CGPDFOperatorTableRef table);

    /**
     * CGPDFOperatorTableSetCallback</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGPDFOperatorTable/index.html#//apple_ref/c/func/CGPDFOperatorTableSetCallback">iOS Dev Center</a>
     */
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

    /**
     * CGColorSpaceCreateWithPlatformColorSpace</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/CGColorSpace/index.html#//apple_ref/c/func/CGColorSpaceCreateWithPlatformColorSpace">iOS Dev Center</a>
     */
    @Generated
    @CFunction
    public static native CGColorSpaceRef CGColorSpaceCreateWithPlatformColorSpace(ConstVoidPtr ref);

    @Generated
    @CFunction
    public static native CGColorRef CGColorCreateCopyByMatchingToColorSpace(CGColorSpaceRef arg1, int intent,
            CGColorRef color, CFDictionaryRef options);

    @Generated
    @CFunction
    public static native CFStringRef CGImageGetUTType(CGImageRef image);

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
    @CFunction
    @NUInt
    public static native long CGColorConverterGetTypeID();

    @Generated
    @Variadic()
    @CFunction
    public static native CGColorConverterRef CGColorConverterCreate(CFDictionaryRef options, CGColorSpaceRef arg2,
            int arg3, int arg4, Object... varargs);

    @Generated
    @CFunction
    public static native CGColorConverterRef CGColorConverterCreateSimple(CGColorSpaceRef from, CGColorSpaceRef to);

    @Generated
    @CFunction
    public static native void CGColorConverterRelease(CGColorConverterRef arg1);

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDisplayP3();

    @Generated
    @CVariable()
    public static native CFStringRef kCGColorSpaceDCIP3();

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
                VoidPtr arg1, VoidPtr arg2);
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
        void call_CGPDFOperatorTableSetCallback(VoidPtr arg0, VoidPtr arg1);
    }
}
