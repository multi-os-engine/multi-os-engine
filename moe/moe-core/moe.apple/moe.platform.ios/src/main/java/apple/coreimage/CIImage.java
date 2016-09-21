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

package apple.coreimage;

import apple.NSObject;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.struct.CGAffineTransform;
import apple.coregraphics.struct.CGRect;
import apple.coregraphics.struct.CGSize;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSData;
import apple.foundation.NSDictionary;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.NSURL;
import apple.foundation.protocol.NSCopying;
import apple.foundation.protocol.NSSecureCoding;
import apple.metal.protocol.MTLTexture;
import apple.uikit.UIImage;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIImage extends NSObject implements NSSecureCoding, NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CIImage(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CIImage alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

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
    @Selector("emptyImage")
    public static native CIImage emptyImage();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("imageWithBitmapData:bytesPerRow:size:format:colorSpace:")
    public static native CIImage imageWithBitmapDataBytesPerRowSizeFormatColorSpace(NSData data,
            @NUInt long bytesPerRow, @ByValue CGSize size, int format, CGColorSpaceRef colorSpace);

    @Generated
    @Selector("imageWithCGImage:")
    public static native CIImage imageWithCGImage(CGImageRef image);

    @Generated
    @Selector("imageWithCGImage:options:")
    public static native CIImage imageWithCGImageOptions(CGImageRef image, NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithCVImageBuffer:")
    public static native CIImage imageWithCVImageBuffer(CVBufferRef imageBuffer);

    @Generated
    @Selector("imageWithCVImageBuffer:options:")
    public static native CIImage imageWithCVImageBufferOptions(CVBufferRef imageBuffer,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithCVPixelBuffer:")
    public static native CIImage imageWithCVPixelBuffer(CVBufferRef pixelBuffer);

    @Generated
    @Selector("imageWithCVPixelBuffer:options:")
    public static native CIImage imageWithCVPixelBufferOptions(CVBufferRef pixelBuffer,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithColor:")
    public static native CIImage imageWithColor(CIColor color);

    @Generated
    @Selector("imageWithContentsOfURL:")
    public static native CIImage imageWithContentsOfURL(NSURL url);

    @Generated
    @Selector("imageWithContentsOfURL:options:")
    public static native CIImage imageWithContentsOfURLOptions(NSURL url, NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithData:")
    public static native CIImage imageWithData(NSData data);

    @Generated
    @Selector("imageWithData:options:")
    public static native CIImage imageWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithImageProvider:size::format:colorSpace:options:")
    public static native CIImage imageWithImageProviderSize_FormatColorSpaceOptions(
            @Mapped(ObjCObjectMapper.class) Object p, @NUInt long width, @NUInt long height, int f, CGColorSpaceRef cs,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithMTLTexture:options:")
    public static native CIImage imageWithMTLTextureOptions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithTexture:size:flipped:colorSpace:")
    public static native CIImage imageWithTextureSizeFlippedColorSpace(int name, @ByValue CGSize size, boolean flipped,
            CGColorSpaceRef colorSpace);

    @Generated
    @Selector("initialize")
    public static native void initialize();

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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("load")
    public static native void load_objc_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

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
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("CGImage")
    public native CGImageRef CGImage();

    @Generated
    @Selector("autoAdjustmentFilters")
    public native NSArray<? extends CIFilter> autoAdjustmentFilters();

    @Generated
    @Selector("autoAdjustmentFiltersWithOptions:")
    public native NSArray<? extends CIFilter> autoAdjustmentFiltersWithOptions(NSDictionary<String, ?> options);

    @Generated
    @Selector("colorSpace")
    public native CGColorSpaceRef colorSpace();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(VoidPtr zone);

    @Generated
    @Selector("encodeWithCoder:")
    public native void encodeWithCoder(NSCoder aCoder);

    @Generated
    @Selector("extent")
    @ByValue
    public native CGRect extent();

    @Generated
    @Selector("imageByApplyingFilter:withInputParameters:")
    public native CIImage imageByApplyingFilterWithInputParameters(String filterName, NSDictionary<String, ?> params);

    @Generated
    @Selector("imageByApplyingGaussianBlurWithSigma:")
    public native CIImage imageByApplyingGaussianBlurWithSigma(double sigma);

    @Generated
    @Selector("imageByApplyingOrientation:")
    public native CIImage imageByApplyingOrientation(int orientation);

    @Generated
    @Selector("imageByApplyingTransform:")
    public native CIImage imageByApplyingTransform(@ByValue CGAffineTransform matrix);

    @Generated
    @Selector("imageByClampingToExtent")
    public native CIImage imageByClampingToExtent();

    @Generated
    @Selector("imageByClampingToRect:")
    public native CIImage imageByClampingToRect(@ByValue CGRect rect);

    @Generated
    @Selector("imageByColorMatchingColorSpaceToWorkingSpace:")
    public native CIImage imageByColorMatchingColorSpaceToWorkingSpace(CGColorSpaceRef colorSpace);

    @Generated
    @Selector("imageByColorMatchingWorkingSpaceToColorSpace:")
    public native CIImage imageByColorMatchingWorkingSpaceToColorSpace(CGColorSpaceRef colorSpace);

    @Generated
    @Selector("imageByCompositingOverImage:")
    public native CIImage imageByCompositingOverImage(CIImage dest);

    @Generated
    @Selector("imageByCroppingToRect:")
    public native CIImage imageByCroppingToRect(@ByValue CGRect rect);

    @Generated
    @Selector("imageByPremultiplyingAlpha")
    public native CIImage imageByPremultiplyingAlpha();

    @Generated
    @Selector("imageBySettingAlphaOneInExtent:")
    public native CIImage imageBySettingAlphaOneInExtent(@ByValue CGRect extent);

    @Generated
    @Selector("imageBySettingProperties:")
    public native CIImage imageBySettingProperties(NSDictionary<?, ?> properties);

    @Generated
    @Selector("imageByUnpremultiplyingAlpha")
    public native CIImage imageByUnpremultiplyingAlpha();

    @Generated
    @Selector("imageTransformForOrientation:")
    @ByValue
    public native CGAffineTransform imageTransformForOrientation(int orientation);

    @Generated
    @Selector("init")
    public native CIImage init();

    @Generated
    @Selector("initWithBitmapData:bytesPerRow:size:format:colorSpace:")
    public native CIImage initWithBitmapDataBytesPerRowSizeFormatColorSpace(NSData data, @NUInt long bytesPerRow,
            @ByValue CGSize size, int format, CGColorSpaceRef colorSpace);

    @Generated
    @Selector("initWithCGImage:")
    public native CIImage initWithCGImage(CGImageRef image);

    @Generated
    @Selector("initWithCGImage:options:")
    public native CIImage initWithCGImageOptions(CGImageRef image, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithCVImageBuffer:")
    public native CIImage initWithCVImageBuffer(CVBufferRef imageBuffer);

    @Generated
    @Selector("initWithCVImageBuffer:options:")
    public native CIImage initWithCVImageBufferOptions(CVBufferRef imageBuffer, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithCVPixelBuffer:")
    public native CIImage initWithCVPixelBuffer(CVBufferRef pixelBuffer);

    @Generated
    @Selector("initWithCVPixelBuffer:options:")
    public native CIImage initWithCVPixelBufferOptions(CVBufferRef pixelBuffer, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithCoder:")
    public native CIImage initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithColor:")
    public native CIImage initWithColor(CIColor color);

    @Generated
    @Selector("initWithContentsOfURL:")
    public native CIImage initWithContentsOfURL(NSURL url);

    @Generated
    @Selector("initWithContentsOfURL:options:")
    public native CIImage initWithContentsOfURLOptions(NSURL url, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithData:")
    public native CIImage initWithData(NSData data);

    @Generated
    @Selector("initWithData:options:")
    public native CIImage initWithDataOptions(NSData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithImage:")
    public native CIImage initWithImage(UIImage image);

    @Generated
    @Selector("initWithImage:options:")
    public native CIImage initWithImageOptions(UIImage image, NSDictionary<?, ?> options);

    @Generated
    @Selector("initWithImageProvider:size::format:colorSpace:options:")
    public native CIImage initWithImageProviderSize_FormatColorSpaceOptions(@Mapped(ObjCObjectMapper.class) Object p,
            @NUInt long width, @NUInt long height, int f, CGColorSpaceRef cs, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithMTLTexture:options:")
    public native CIImage initWithMTLTextureOptions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTexture:size:flipped:colorSpace:")
    public native CIImage initWithTextureSizeFlippedColorSpace(int name, @ByValue CGSize size, boolean flipped,
            CGColorSpaceRef colorSpace);

    @Generated
    @Selector("pixelBuffer")
    public native CVBufferRef pixelBuffer();

    @Generated
    @Selector("properties")
    public native NSDictionary<String, ?> properties();

    @Generated
    @Selector("regionOfInterestForImage:inRect:")
    @ByValue
    public native CGRect regionOfInterestForImageInRect(CIImage image, @ByValue CGRect rect);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("url")
    public native NSURL url();
}
