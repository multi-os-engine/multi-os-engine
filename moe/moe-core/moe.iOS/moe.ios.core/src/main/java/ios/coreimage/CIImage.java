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

package ios.coreimage;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.opaque.CGColorSpaceRef;
import ios.coregraphics.opaque.CGImageRef;
import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.corevideo.opaque.CVBufferRef;
import ios.foundation.NSArray;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.NSDictionary;
import ios.foundation.NSURL;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.uikit.UIImage;
import ios.metal.protocol.MTLTexture;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

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
	@Owned
	@Selector("alloc")
	public static native CIImage alloc();

	/**
	 * autoAdjustmentFiltersWithOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/autoAdjustmentFiltersWithOptions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("autoAdjustmentFiltersWithOptions:")
	public native NSArray<? extends CIFilter> autoAdjustmentFiltersWithOptions(NSDictionary<String, ?> options);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * emptyImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/emptyImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("emptyImage")
	public static native CIImage emptyImage();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * extent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instp/CIImage/extent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("extent")
	@ByValue
	public native CGRect extent();

	/**
	 * imageByApplyingFilter:withInputParameters:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/imageByApplyingFilter:withInputParameters:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageByApplyingFilter:withInputParameters:")
	public native CIImage imageByApplyingFilterWithInputParameters(
			String filterName, NSDictionary<String, ?> params);

	/**
	 * imageByApplyingOrientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/imageByApplyingOrientation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageByApplyingOrientation:")
	public native CIImage imageByApplyingOrientation(int orientation);

	/**
	 * imageByApplyingTransform:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/imageByApplyingTransform:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageByApplyingTransform:")
	public native CIImage imageByApplyingTransform(
			@ByValue CGAffineTransform matrix);

	/**
	 * imageByClampingToExtent</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/imageByClampingToExtent">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageByClampingToExtent")
	public native CIImage imageByClampingToExtent();

	/**
	 * imageByCompositingOverImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/imageByCompositingOverImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageByCompositingOverImage:")
	public native CIImage imageByCompositingOverImage(CIImage dest);

	/**
	 * imageByCroppingToRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/imageByCroppingToRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageByCroppingToRect:")
	public native CIImage imageByCroppingToRect(@ByValue CGRect rect);

	/**
	 * imageTransformForOrientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/imageTransformForOrientation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageTransformForOrientation:")
	@ByValue
	public native CGAffineTransform imageTransformForOrientation(int orientation);

	/**
	 * imageWithBitmapData:bytesPerRow:size:format:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithBitmapData:bytesPerRow:size:format:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithBitmapData:bytesPerRow:size:format:colorSpace:")
	public static native CIImage imageWithBitmapDataBytesPerRowSizeFormatColorSpace(
			NSData data, @NUInt long bytesPerRow, @ByValue CGSize size, int format,
			CGColorSpaceRef colorSpace);

	/**
	 * imageWithCGImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithCGImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCGImage:")
	public static native CIImage imageWithCGImage(CGImageRef image);

	/**
	 * imageWithCGImage:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithCGImage:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCGImage:options:")
	public static native CIImage imageWithCGImageOptions(CGImageRef image,
			NSDictionary<String, ?> options);

	/**
	 * imageWithCVPixelBuffer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithCVPixelBuffer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCVPixelBuffer:")
	public static native CIImage imageWithCVPixelBuffer(CVBufferRef pixelBuffer);

	/**
	 * imageWithCVPixelBuffer:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithCVPixelBuffer:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCVPixelBuffer:options:")
	public static native CIImage imageWithCVPixelBufferOptions(
			CVBufferRef pixelBuffer, NSDictionary<String, ?> options);

	/**
	 * imageWithColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithColor:")
	public static native CIImage imageWithColor(CIColor color);

	/**
	 * imageWithContentsOfURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithContentsOfURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithContentsOfURL:")
	public static native CIImage imageWithContentsOfURL(NSURL url);

	/**
	 * imageWithContentsOfURL:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithContentsOfURL:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithContentsOfURL:options:")
	public static native CIImage imageWithContentsOfURLOptions(NSURL url,
			NSDictionary<String, ?> options);

	/**
	 * imageWithData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithData:")
	public static native CIImage imageWithData(NSData data);

	/**
	 * imageWithData:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithData:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithData:options:")
	public static native CIImage imageWithDataOptions(NSData data,
			NSDictionary<String, ?> options);

	/**
	 * imageWithTexture:size:flipped:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithTexture:size:flipped:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithTexture:size:flipped:colorSpace:")
	public static native CIImage imageWithTextureSizeFlippedColorSpace(
			int name, @ByValue CGSize size, boolean flipped, CGColorSpaceRef colorSpace);

	@Generated
	@Selector("init")
	public native CIImage init();

	/**
	 * initWithBitmapData:bytesPerRow:size:format:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithBitmapData:bytesPerRow:size:format:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithBitmapData:bytesPerRow:size:format:colorSpace:")
	public native CIImage initWithBitmapDataBytesPerRowSizeFormatColorSpace(
			NSData data, @NUInt long bytesPerRow, @ByValue CGSize size, int format,
			CGColorSpaceRef colorSpace);

	/**
	 * initWithCGImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithCGImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGImage:")
	public native CIImage initWithCGImage(CGImageRef image);

	/**
	 * initWithCGImage:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithCGImage:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGImage:options:")
	public native CIImage initWithCGImageOptions(CGImageRef image,
			NSDictionary<String, ?> options);

	/**
	 * initWithCVPixelBuffer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithCVPixelBuffer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCVPixelBuffer:")
	public native CIImage initWithCVPixelBuffer(CVBufferRef pixelBuffer);

	/**
	 * initWithCVPixelBuffer:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithCVPixelBuffer:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCVPixelBuffer:options:")
	public native CIImage initWithCVPixelBufferOptions(CVBufferRef pixelBuffer,
			NSDictionary<String, ?> options);

	@Generated
	@Selector("initWithCoder:")
	public native CIImage initWithCoder(NSCoder aDecoder);

	/**
	 * initWithColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithColor:")
	public native CIImage initWithColor(CIColor color);

	/**
	 * initWithContentsOfURL:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithContentsOfURL:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithContentsOfURL:")
	public native CIImage initWithContentsOfURL(NSURL url);

	/**
	 * initWithContentsOfURL:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithContentsOfURL:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithContentsOfURL:options:")
	public native CIImage initWithContentsOfURLOptions(NSURL url, NSDictionary<String, ?> options);

	/**
	 * initWithData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithData:")
	public native CIImage initWithData(NSData data);

	/**
	 * initWithData:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithData:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithData:options:")
	public native CIImage initWithDataOptions(NSData data, NSDictionary<String, ?> options);

	/**
	 * initWithImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithImage:")
	public native CIImage initWithImage(UIImage image);

	/**
	 * initWithImage:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithImage:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithImage:options:")
	public native CIImage initWithImageOptions(UIImage image,
			NSDictionary<?, ?> options);

	/**
	 * initWithTexture:size:flipped:colorSpace:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithTexture:size:flipped:colorSpace:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithTexture:size:flipped:colorSpace:")
	public native CIImage initWithTextureSizeFlippedColorSpace(int name,
			@ByValue CGSize size, boolean flipped, CGColorSpaceRef colorSpace);

	/**
	 * properties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instp/CIImage/properties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("properties")
	public native NSDictionary<String, ?> properties();

	/**
	 * regionOfInterestForImage:inRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/regionOfInterestForImage:inRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("regionOfInterestForImage:inRect:")
	@ByValue
	public native CGRect regionOfInterestForImageInRect(CIImage image,
			@ByValue CGRect rect);

	/**
	 * colorSpace</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instp/CIImage/colorSpace">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorSpace")
	public native CGColorSpaceRef colorSpace();

	/**
	 * imageWithCVImageBuffer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithCVImageBuffer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCVImageBuffer:")
	public static native CIImage imageWithCVImageBuffer(CVBufferRef imageBuffer);

	/**
	 * imageWithCVImageBuffer:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithCVImageBuffer:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCVImageBuffer:options:")
	public static native CIImage imageWithCVImageBufferOptions(CVBufferRef imageBuffer, NSDictionary<String, ?> options);

	/**
	 * imageWithImageProvider:size::format:colorSpace:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithImageProvider:size::format:colorSpace:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithImageProvider:size::format:colorSpace:options:")
	public static native CIImage imageWithImageProviderSize_FormatColorSpaceOptions(
			@Mapped(ObjCObjectMapper.class) Object p, @NUInt long width, @NUInt long height, int f, CGColorSpaceRef cs,
			NSDictionary<String, ?> options);

	/**
	 * imageWithMTLTexture:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/clm/CIImage/imageWithMTLTexture:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithMTLTexture:options:")
	public static native CIImage imageWithMTLTextureOptions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
			NSDictionary<String, ?> options);

	/**
	 * initWithCVImageBuffer:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithCVImageBuffer:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCVImageBuffer:")
	public native CIImage initWithCVImageBuffer(CVBufferRef imageBuffer);

	/**
	 * initWithCVImageBuffer:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithCVImageBuffer:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCVImageBuffer:options:")
	public native CIImage initWithCVImageBufferOptions(CVBufferRef imageBuffer, NSDictionary<String, ?> options);

	/**
	 * initWithImageProvider:size::format:colorSpace:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithImageProvider:size::format:colorSpace:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithImageProvider:size::format:colorSpace:options:")
	public native CIImage initWithImageProviderSize_FormatColorSpaceOptions(@Mapped(ObjCObjectMapper.class) Object p,
			@NUInt long width, @NUInt long height, int f, CGColorSpaceRef cs, NSDictionary<String, ?> options);

	/**
	 * initWithMTLTexture:options:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instm/CIImage/initWithMTLTexture:options:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithMTLTexture:options:")
	public native CIImage initWithMTLTextureOptions(@Mapped(ObjCObjectMapper.class) MTLTexture texture,
			NSDictionary<String, ?> options);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * url</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIImage_Class/index.html#//apple_ref/occ/instp/CIImage/url">iOS Dev Center</a>
	 */
	@Generated
	@Selector("url")
	public native NSURL url();

	@Generated
	@Selector("accessInstanceVariablesDirectly")
	public static native boolean accessInstanceVariablesDirectly();

	@Generated
	@Selector("allocWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public static native Object allocWithZone(VoidPtr zone);

	@Generated
	@Selector("automaticallyNotifiesObserversForKey:")
	public static native boolean automaticallyNotifiesObserversForKey(String key);

	@Generated
	@Selector("cancelPreviousPerformRequestsWithTarget:")
	public static native void cancelPreviousPerformRequestsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object aTarget);

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
	@Selector("hash")
	@NUInt
	public static native long hash_static();

	@Generated
	@Selector("initialize")
	public static native void initialize();

	@Generated
	@Selector("instanceMethodForSelector:")
	@FunctionPtr(name = "call_instanceMethodForSelector_ret")
	public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(
			SEL aSelector);

	@Generated
	@Selector("instanceMethodSignatureForSelector:")
	public static native NSMethodSignature instanceMethodSignatureForSelector(
			SEL aSelector);

	@Generated
	@Selector("instancesRespondToSelector:")
	public static native boolean instancesRespondToSelector(SEL aSelector);

	@Generated
	@Selector("isSubclassOfClass:")
	public static native boolean isSubclassOfClass(Class aClass);

	@Generated
	@Selector("keyPathsForValuesAffectingValueForKey:")
	public static native NSSet<String> keyPathsForValuesAffectingValueForKey(
			String key);

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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
