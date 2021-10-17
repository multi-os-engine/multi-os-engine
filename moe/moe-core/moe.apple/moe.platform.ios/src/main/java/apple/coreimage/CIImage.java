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
import apple.avfoundation.AVDepthData;
import apple.avfoundation.AVPortraitEffectsMatte;
import apple.avfoundation.AVSemanticSegmentationMatte;
import apple.coregraphics.opaque.CGColorSpaceRef;
import apple.coregraphics.opaque.CGImageRef;
import apple.coregraphics.opaque.IOSurfaceRef;
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
import apple.imageio.opaque.CGImageSourceRef;
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
    public static native CIImage allocWithZone(VoidPtr zone);

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

    /**
     * Create an empty Image.
     */
    @Generated
    @Selector("emptyImage")
    public static native CIImage emptyImage();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * Creates a new image whose bitmap data is from 'data'. Each row contains 'bytesPerRow'
     * bytes. The dimensions of the image are defined by 'size'. 'format' defines
     * the format and size of each pixel. 'colorSpace' defines the color space
     * that the image is defined in, if nil, the image is not color matched.
     */
    @Generated
    @Selector("imageWithBitmapData:bytesPerRow:size:format:colorSpace:")
    public static native CIImage imageWithBitmapDataBytesPerRowSizeFormatColorSpace(NSData data,
            @NUInt long bytesPerRow, @ByValue CGSize size, int format, CGColorSpaceRef colorSpace);

    /**
     * Creates a new image from the contents of 'image'.
     */
    @Generated
    @Selector("imageWithCGImage:")
    public static native CIImage imageWithCGImage(CGImageRef image);

    @Generated
    @Selector("imageWithCGImage:options:")
    public static native CIImage imageWithCGImageOptions(CGImageRef image, NSDictionary<String, ?> options);

    /**
     * Creates a new image whose data is from the contents of a CVImageBuffer.
     */
    @Generated
    @Selector("imageWithCVImageBuffer:")
    public static native CIImage imageWithCVImageBuffer(CVBufferRef imageBuffer);

    @Generated
    @Selector("imageWithCVImageBuffer:options:")
    public static native CIImage imageWithCVImageBufferOptions(CVBufferRef imageBuffer,
            NSDictionary<String, ?> options);

    /**
     * Creates a new image whose data is from the contents of a CVPixelBufferRef.
     */
    @Generated
    @Selector("imageWithCVPixelBuffer:")
    public static native CIImage imageWithCVPixelBuffer(CVBufferRef pixelBuffer);

    @Generated
    @Selector("imageWithCVPixelBuffer:options:")
    public static native CIImage imageWithCVPixelBufferOptions(CVBufferRef pixelBuffer,
            NSDictionary<String, ?> options);

    /**
     * Return or initialize a new image with an infinite amount of the color
     * 'color'.
     */
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

    /**
     * Create a new CIImage populated when rendered with  data provided by 'p'.
     * The provider object 'p' is retained until the image is deallocated.
     * The 'options' dictionary supports kCIImageProviderTileSize as well as
     * other options defined in CIImage.h
     */
    @Generated
    @Selector("imageWithImageProvider:size::format:colorSpace:options:")
    public static native CIImage imageWithImageProviderSize_FormatColorSpaceOptions(
            @Mapped(ObjCObjectMapper.class) Object p, @NUInt long width, @NUInt long height, int f, CGColorSpaceRef cs,
            NSDictionary<String, ?> options);

    /**
     * Creates a new image referencing the contents of the Metal texture object.
     * The texture type must be MTLTextureType2D and the texture format must be unsigned normalized or floating-point.
     * When rendering a CIImage referencing this Metal texture, there should not be any uncommitted Metal comand buffers writing to the texture.
     */
    @Generated
    @Selector("imageWithMTLTexture:options:")
    public static native CIImage imageWithMTLTextureOptions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            NSDictionary<String, ?> options);

    /**
     * Creates a new image referencing the contents of the GL texture object
     * with identifier 'name'. The texture should have dimensions as defined
     * by 'size'. If 'flipped' is true, then the contents of the texture are
     * flipped vertically when referenced. 'colorSpace' defines the color space
     * that the image is defined in, if nil, the texture is not color matched.
     */
    @Generated
    @Selector("imageWithTexture:size:flipped:colorSpace:")
    public static native CIImage imageWithTextureSizeFlippedColorSpace(int name, @ByValue CGSize size, boolean flipped,
            CGColorSpaceRef colorSpace);

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
    @Owned
    @Selector("new")
    public static native CIImage new_objc();

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

    /**
     * Returns a CGImageRef if the CIImage was created with [CIImage imageWithCGImage] or [CIImage imageWithContentsOfURL] and no options.
     * Otherwise this property will be nil and calling [CIContext createCGImage:fromRect:] is recommended.
     */
    @Generated
    @Selector("CGImage")
    public native CGImageRef CGImage();

    /**
     * Return an array of filters to apply to an image to improve its
     * skin tones, saturation, contrast, shadows and repair red-eyes or LED-eyes.
     * <p>
     * The options dictionary can contain a CIDetectorImageOrientation key value.
     * The value for this key is an integer NSNumber from 1..8 such as that
     * found in kCGImagePropertyOrientation.  If present, the adjustment will be done
     * based on that orientation but any coordinates in the returned filters will
     * still be based on those of the sender image.
     */
    @Generated
    @Selector("autoAdjustmentFilters")
    public native NSArray<? extends CIFilter> autoAdjustmentFilters();

    @Generated
    @Selector("autoAdjustmentFiltersWithOptions:")
    public native NSArray<? extends CIFilter> autoAdjustmentFiltersWithOptions(NSDictionary<String, ?> options);

    /**
     * Returns if possible the color space of the image it was defined in.
     * This method will return nil, if the color space cannot be determined.
     */
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
    public native void encodeWithCoder(NSCoder coder);

    /**
     * Return a rect the defines the bounds of non-(0,0,0,0) pixels
     */
    @Generated
    @Selector("extent")
    @ByValue
    public native CGRect extent();

    /**
     * A convenience method for applying a filter to an image.
     * The method returns outputImage of the filter after setting the
     * filter's inputImage to the method receiver and other parameters
     * from the key/value pairs of 'params'.
     */
    @Generated
    @Selector("imageByApplyingFilter:withInputParameters:")
    public native CIImage imageByApplyingFilterWithInputParameters(String filterName, NSDictionary<String, ?> params);

    /**
     * Return a new image by applying a gaussian blur to the receiver.
     */
    @Generated
    @Selector("imageByApplyingGaussianBlurWithSigma:")
    public native CIImage imageByApplyingGaussianBlurWithSigma(double sigma);

    /**
     * Returns a new image representing the original image with a transform applied to it based on an orientation value.
     * CGImagePropertyOrientation enum values from 1 to 8 as defined in the TIFF spec are supported.
     * Returns original image if the image is of infinite extent.
     */
    @Generated
    @Selector("imageByApplyingOrientation:")
    public native CIImage imageByApplyingOrientation(int orientation);

    /**
     * Returns a new image representing the original image with the transform
     * 'matrix' appended to it.
     */
    @Generated
    @Selector("imageByApplyingTransform:")
    public native CIImage imageByApplyingTransform(@ByValue CGAffineTransform matrix);

    /**
     * Return a new infinite image by replicating the edge pixels of the receiver image.
     */
    @Generated
    @Selector("imageByClampingToExtent")
    public native CIImage imageByClampingToExtent();

    /**
     * Return a new infinite image by replicating the edge pixels of a rectangle.
     * This is equivalent to the CICrop filter.
     */
    @Generated
    @Selector("imageByClampingToRect:")
    public native CIImage imageByClampingToRect(@ByValue CGRect rect);

    /**
     * Return a new image by color matching from the colorSpace to the context's working space.
     * This method will return nil if the CGColorSpace is not kCGColorSpaceModelRGB.
     */
    @Generated
    @Selector("imageByColorMatchingColorSpaceToWorkingSpace:")
    public native CIImage imageByColorMatchingColorSpaceToWorkingSpace(CGColorSpaceRef colorSpace);

    /**
     * Return a new image by color matching from the context's working space to the colorSpace.
     * This method will return nil if the CGColorSpace is not kCGColorSpaceModelRGB.
     */
    @Generated
    @Selector("imageByColorMatchingWorkingSpaceToColorSpace:")
    public native CIImage imageByColorMatchingWorkingSpaceToColorSpace(CGColorSpaceRef colorSpace);

    /**
     * Return a new image formed by compositing the receiver image over 'dest'.
     * This is equivalent to the CISourceOverCompositing filter.
     */
    @Generated
    @Selector("imageByCompositingOverImage:")
    public native CIImage imageByCompositingOverImage(CIImage dest);

    /**
     * Return a new image cropped to a rectangle.
     */
    @Generated
    @Selector("imageByCroppingToRect:")
    public native CIImage imageByCroppingToRect(@ByValue CGRect rect);

    /**
     * Return a new image by multiplying the receiver's RGB values by its alpha.
     */
    @Generated
    @Selector("imageByPremultiplyingAlpha")
    public native CIImage imageByPremultiplyingAlpha();

    /**
     * Return a new image with alpha set to 1 within the rectangle and 0 outside.
     */
    @Generated
    @Selector("imageBySettingAlphaOneInExtent:")
    public native CIImage imageBySettingAlphaOneInExtent(@ByValue CGRect extent);

    /**
     * Return a new image by changing the recevier's properties.
     */
    @Generated
    @Selector("imageBySettingProperties:")
    public native CIImage imageBySettingProperties(NSDictionary<?, ?> properties);

    /**
     * Return a new image by dividing the receiver's RGB values by its alpha.
     */
    @Generated
    @Selector("imageByUnpremultiplyingAlpha")
    public native CIImage imageByUnpremultiplyingAlpha();

    /**
     * Returns a CGAffineTransform for an orientation value that can be applied to an image.
     * CGImagePropertyOrientation enum values from 1 to 8 as defined in the TIFF spec are supported.
     * Returns CGAffineTransformIdentity if the image is of infinite extent.
     */
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

    /**
     * Initializers.
     */
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
    public native CIImage initWithCoder(NSCoder coder);

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
    public native CIImage initWithImageOptions(UIImage image, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithImageProvider:size::format:colorSpace:options:")
    public native CIImage initWithImageProviderSize_FormatColorSpaceOptions(@Mapped(ObjCObjectMapper.class) Object p,
            @NUInt long width, @NUInt long height, int f, CGColorSpaceRef cs, NSDictionary<String, ?> options);

    /**
     * initWithMTLTexture will return nil if textureType is not MTLTextureType2D.
     */
    @Generated
    @Selector("initWithMTLTexture:options:")
    public native CIImage initWithMTLTextureOptions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithTexture:size:flipped:colorSpace:")
    public native CIImage initWithTextureSizeFlippedColorSpace(int name, @ByValue CGSize size, boolean flipped,
            CGColorSpaceRef colorSpace);

    /**
     * Returns a CVPixelBufferRef if the CIImage was created with [CIImage imageWithCVPixelBuffer] and no options.
     * Otherwise this property will be nil and calling [CIContext render:toCVPixelBuffer:] is recommended.
     * Modifying the contents of this pixelBuffer will cause the CIImage to render with undefined results.
     */
    @Generated
    @Selector("pixelBuffer")
    public native CVBufferRef pixelBuffer();

    /**
     * Returns the metadata properties of an image. If the image is the
     * output of one or more CIFilters, then the metadata of the root inputImage
     * will be returned. See also kCIImageProperties.
     */
    @Generated
    @Selector("properties")
    public native NSDictionary<String, ?> properties();

    /**
     * Returns the rectangle of 'image' that is required to render the
     * rectangle 'rect' of the receiver.  This may return a null rect.
     */
    @Generated
    @Selector("regionOfInterestForImage:inRect:")
    @ByValue
    public native CGRect regionOfInterestForImageInRect(CIImage image, @ByValue CGRect rect);

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Returns the URL of the image when the image was created using the imageWithContentsOfURL APIs.
     * This method will return nil, if the URL cannot be determined.
     */
    @Generated
    @Selector("url")
    public native NSURL url();

    /**
     * Returns a AVDepthData if the CIImage was created with [CIImage imageWithData] or [CIImage imageWithContentsOfURL] and.
     * one the options kCIImageAuxiliaryDepth or kCIImageAuxiliaryDisparity.
     */
    @Generated
    @Selector("depthData")
    public native AVDepthData depthData();

    /**
     * Returns a new image representing the original image transformeded for the given CGImagePropertyOrientation
     */
    @Generated
    @Selector("imageByApplyingCGOrientation:")
    public native CIImage imageByApplyingCGOrientation(int orientation);

    /**
     * A convenience method for applying a filter to an image.
     * The method returns outputImage of the filter after setting the
     * filter's inputImage to the method receiver and any other parameters
     * from the filter's defaults.
     */
    @Generated
    @Selector("imageByApplyingFilter:")
    public native CIImage imageByApplyingFilter(String filterName);

    /**
     * Returns a new image by changing the receiver's sample mode to bilinear interpolation.
     */
    @Generated
    @Selector("imageBySamplingLinear")
    public native CIImage imageBySamplingLinear();

    /**
     * Returns a new image by changing the receiver's sample mode to nearest neighbor.
     */
    @Generated
    @Selector("imageBySamplingNearest")
    public native CIImage imageBySamplingNearest();

    /**
     * Returns a CGAffineTransform for the CGImagePropertyOrientation value that can be applied to an image.
     */
    @Generated
    @Selector("imageTransformForCGOrientation:")
    @ByValue
    public native CGAffineTransform imageTransformForCGOrientation(int orientation);

    /**
     * Creates a new image from the contents of an IOSurface.
     */
    @Generated
    @Selector("imageWithIOSurface:")
    public static native CIImage imageWithIOSurface(IOSurfaceRef surface);

    @Generated
    @Selector("imageWithIOSurface:options:")
    public static native CIImage imageWithIOSurfaceOptions(IOSurfaceRef surface, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithIOSurface:")
    public native CIImage initWithIOSurface(IOSurfaceRef surface);

    @Generated
    @Selector("initWithIOSurface:options:")
    public native CIImage initWithIOSurfaceOptions(IOSurfaceRef surface, NSDictionary<String, ?> options);

    /**
     * Convenience constant color CIImages in the sRGB colorspace.
     */
    @Generated
    @Selector("blackImage")
    public static native CIImage blackImage();

    @Generated
    @Selector("blueImage")
    public static native CIImage blueImage();

    @Generated
    @Selector("clearImage")
    public static native CIImage clearImage();

    @Generated
    @Selector("cyanImage")
    public static native CIImage cyanImage();

    @Generated
    @Selector("grayImage")
    public static native CIImage grayImage();

    @Generated
    @Selector("greenImage")
    public static native CIImage greenImage();

    /**
     * specifying true or false here will override the context's kCIContextHighQualityDownsample setting.
     */
    @Generated
    @Selector("imageByApplyingTransform:highQualityDownsample:")
    public native CIImage imageByApplyingTransformHighQualityDownsample(@ByValue CGAffineTransform matrix,
            boolean highQualityDownsample);

    /**
     * Returns a new image that inserts a intermediate that is cacheable
     * according to the CIContext's kCIContextCacheIntermediates option.
     */
    @Generated
    @Selector("imageByInsertingIntermediate")
    public native CIImage imageByInsertingIntermediate();

    /**
     * Returns a new image that inserts a intermediate that is cacheable
     * independent of the CIContext's kCIContextCacheIntermediates option.
     */
    @Generated
    @Selector("imageByInsertingIntermediate:")
    public native CIImage imageByInsertingIntermediate(boolean cache);

    /**
     * Creates a new image from the contents of 'source'.
     */
    @Generated
    @Selector("imageWithCGImageSource:index:options:")
    public static native CIImage imageWithCGImageSourceIndexOptions(CGImageSourceRef source, @NUInt long index,
            NSDictionary<String, ?> dict);

    @Generated
    @Selector("imageWithDepthData:")
    public static native CIImage imageWithDepthData(AVDepthData data);

    @Generated
    @Selector("imageWithDepthData:options:")
    public static native CIImage imageWithDepthDataOptions(AVDepthData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithPortaitEffectsMatte:")
    public static native CIImage imageWithPortaitEffectsMatte(AVPortraitEffectsMatte matte);

    @Generated
    @Selector("imageWithPortaitEffectsMatte:options:")
    public static native CIImage imageWithPortaitEffectsMatteOptions(AVPortraitEffectsMatte matte,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("imageWithSemanticSegmentationMatte:")
    public static native CIImage imageWithSemanticSegmentationMatte(AVSemanticSegmentationMatte matte);

    @Generated
    @Selector("imageWithSemanticSegmentationMatte:options:")
    public static native CIImage imageWithSemanticSegmentationMatteOptions(AVSemanticSegmentationMatte matte,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithCGImageSource:index:options:")
    public native CIImage initWithCGImageSourceIndexOptions(CGImageSourceRef source, @NUInt long index,
            NSDictionary<String, ?> dict);

    @Generated
    @Selector("initWithDepthData:")
    public native CIImage initWithDepthData(AVDepthData data);

    @Generated
    @Selector("initWithDepthData:options:")
    public native CIImage initWithDepthDataOptions(AVDepthData data, NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithPortaitEffectsMatte:")
    public native CIImage initWithPortaitEffectsMatte(AVPortraitEffectsMatte matte);

    @Generated
    @Selector("initWithPortaitEffectsMatte:options:")
    public native CIImage initWithPortaitEffectsMatteOptions(AVPortraitEffectsMatte matte,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("initWithSemanticSegmentationMatte:")
    public native CIImage initWithSemanticSegmentationMatte(AVSemanticSegmentationMatte matte);

    @Generated
    @Selector("initWithSemanticSegmentationMatte:options:")
    public native CIImage initWithSemanticSegmentationMatteOptions(AVSemanticSegmentationMatte matte,
            NSDictionary<String, ?> options);

    @Generated
    @Selector("magentaImage")
    public static native CIImage magentaImage();

    /**
     * Returns a AVPortraitEffectsMatte if the CIImage was created with [CIImage imageWithData] or [CIImage imageWithContentsOfURL] and.
     * one the options kCIImageAuxiliaryPortraitEffectsMatte.
     */
    @Generated
    @Selector("portraitEffectsMatte")
    public native AVPortraitEffectsMatte portraitEffectsMatte();

    @Generated
    @Selector("redImage")
    public static native CIImage redImage();

    /**
     * Returns a AVSemanticSegmentationMatte if the CIImage was created with [CIImage imageWithData] or [CIImage imageWithContentsOfURL] and.
     * one the options like kCIImageAuxiliarySemanticSegmentationSkinMatte.
     */
    @Generated
    @Selector("semanticSegmentationMatte")
    public native AVSemanticSegmentationMatte semanticSegmentationMatte();

    @Generated
    @Selector("whiteImage")
    public static native CIImage whiteImage();

    @Generated
    @Selector("yellowImage")
    public static native CIImage yellowImage();
}
