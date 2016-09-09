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

package ios.uikit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;

import ios.NSObject;
import ios.coregraphics.opaque.CGImageRef;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.coregraphics.struct.CGSize;
import ios.coreimage.CIImage;
import ios.foundation.NSArray;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.foundation.NSData;
import ios.foundation.protocol.NSSecureCoding;
import ios.uikit.protocol.UIAccessibilityIdentification;
import ios.uikit.struct.UIEdgeInsets;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIImage extends NSObject implements NSSecureCoding,
		UIAccessibilityIdentification {
	static {
		NatJ.register();
	}

	@Generated
	protected UIImage(Pointer peer) {
		super(peer);
	}

	/**
	 * CGImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/CGImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("CGImage")
	public native CGImageRef CGImage();

	/**
	 * CIImage</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/CIImage">iOS Dev Center</a>
	 */
	@Generated
	@Selector("CIImage")
	public native CIImage CIImage();

	@Generated
	@Selector("accessibilityIdentifier")
	public native String accessibilityIdentifier();

	/**
	 * alignmentRectInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/alignmentRectInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alignmentRectInsets")
	@ByValue
	public native UIEdgeInsets alignmentRectInsets();

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIImage alloc();

	/**
	 * animatedImageNamed:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/animatedImageNamed:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animatedImageNamed:duration:")
	public static native UIImage animatedImageNamedDuration(String name,
			double duration);

	/**
	 * animatedImageWithImages:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/animatedImageWithImages:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animatedImageWithImages:duration:")
	public static native UIImage animatedImageWithImagesDuration(
			NSArray<? extends UIImage> images, double duration);

	/**
	 * animatedResizableImageNamed:capInsets:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/animatedResizableImageNamed:capInsets:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animatedResizableImageNamed:capInsets:duration:")
	public static native UIImage animatedResizableImageNamedCapInsetsDuration(
			String name, @ByValue UIEdgeInsets capInsets, double duration);

	/**
	 * animatedResizableImageNamed:capInsets:resizingMode:duration:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/animatedResizableImageNamed:capInsets:resizingMode:duration:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("animatedResizableImageNamed:capInsets:resizingMode:duration:")
	public static native UIImage animatedResizableImageNamedCapInsetsResizingModeDuration(
			String name, @ByValue UIEdgeInsets capInsets,
			@NInt long resizingMode, double duration);

	/**
	 * capInsets</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/capInsets">iOS Dev Center</a>
	 */
	@Generated
	@Selector("capInsets")
	@ByValue
	public native UIEdgeInsets capInsets();

	/**
	 * drawAsPatternInRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/drawAsPatternInRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawAsPatternInRect:")
	public native void drawAsPatternInRect(@ByValue CGRect rect);

	/**
	 * drawAtPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/drawAtPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawAtPoint:")
	public native void drawAtPoint(@ByValue CGPoint point);

	/**
	 * drawAtPoint:blendMode:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/drawAtPoint:blendMode:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawAtPoint:blendMode:alpha:")
	public native void drawAtPointBlendModeAlpha(@ByValue CGPoint point,
			int blendMode, @NFloat double alpha);

	/**
	 * drawInRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/drawInRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawInRect:")
	public native void drawInRect(@ByValue CGRect rect);

	/**
	 * drawInRect:blendMode:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/drawInRect:blendMode:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("drawInRect:blendMode:alpha:")
	public native void drawInRectBlendModeAlpha(@ByValue CGRect rect,
			int blendMode, @NFloat double alpha);

	/**
	 * duration</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/duration">iOS Dev Center</a>
	 */
	@Generated
	@Selector("duration")
	public native double duration();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * imageAsset</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/imageAsset">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageAsset")
	public native UIImageAsset imageAsset();

	/**
	 * imageNamed:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageNamed:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageNamed:")
	public static native UIImage imageNamed(String name);

	/**
	 * imageNamed:inBundle:compatibleWithTraitCollection:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageNamed:inBundle:compatibleWithTraitCollection:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageNamed:inBundle:compatibleWithTraitCollection:")
	public static native UIImage imageNamedInBundleCompatibleWithTraitCollection(
			String name, NSBundle bundle, UITraitCollection traitCollection);

	/**
	 * imageOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/imageOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageOrientation")
	@NInt
	public native long imageOrientation();

	/**
	 * imageWithAlignmentRectInsets:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/imageWithAlignmentRectInsets:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithAlignmentRectInsets:")
	public native UIImage imageWithAlignmentRectInsets(
			@ByValue UIEdgeInsets alignmentInsets);

	/**
	 * imageWithCGImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageWithCGImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCGImage:")
	public static native UIImage imageWithCGImage(CGImageRef cgImage);

	/**
	 * imageWithCGImage:scale:orientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageWithCGImage:scale:orientation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCGImage:scale:orientation:")
	public static native UIImage imageWithCGImageScaleOrientation(
			CGImageRef cgImage, @NFloat double scale, @NInt long orientation);

	/**
	 * imageWithCIImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageWithCIImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCIImage:")
	public static native UIImage imageWithCIImage(CIImage ciImage);

	/**
	 * imageWithCIImage:scale:orientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageWithCIImage:scale:orientation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithCIImage:scale:orientation:")
	public static native UIImage imageWithCIImageScaleOrientation(
			CIImage ciImage, @NFloat double scale, @NInt long orientation);

	/**
	 * imageWithContentsOfFile:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageWithContentsOfFile:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithContentsOfFile:")
	public static native UIImage imageWithContentsOfFile(String path);

	/**
	 * imageWithData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageWithData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithData:")
	public static native UIImage imageWithData(NSData data);

	/**
	 * imageWithData:scale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/clm/UIImage/imageWithData:scale:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithData:scale:")
	public static native UIImage imageWithDataScale(NSData data,
			@NFloat double scale);

	/**
	 * imageWithRenderingMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/imageWithRenderingMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageWithRenderingMode:")
	public native UIImage imageWithRenderingMode(@NInt long renderingMode);

	/**
	 * images</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/images">iOS Dev Center</a>
	 */
	@Generated
	@Selector("images")
	public native NSArray<? extends UIImage> images();

	@Generated
	@Selector("init")
	public native UIImage init();

	/**
	 * initWithCGImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/initWithCGImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGImage:")
	public native UIImage initWithCGImage(CGImageRef cgImage);

	/**
	 * initWithCGImage:scale:orientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/initWithCGImage:scale:orientation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGImage:scale:orientation:")
	public native UIImage initWithCGImageScaleOrientation(CGImageRef cgImage,
			@NFloat double scale, @NInt long orientation);

	/**
	 * initWithCIImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/initWithCIImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCIImage:")
	public native UIImage initWithCIImage(CIImage ciImage);

	/**
	 * initWithCIImage:scale:orientation:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/initWithCIImage:scale:orientation:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCIImage:scale:orientation:")
	public native UIImage initWithCIImageScaleOrientation(CIImage ciImage,
			@NFloat double scale, @NInt long orientation);

	@Generated
	@Selector("initWithCoder:")
	public native UIImage initWithCoder(NSCoder aDecoder);

	/**
	 * initWithContentsOfFile:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/initWithContentsOfFile:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithContentsOfFile:")
	public native UIImage initWithContentsOfFile(String path);

	/**
	 * initWithData:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/initWithData:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithData:")
	public native UIImage initWithData(NSData data);

	/**
	 * initWithData:scale:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/initWithData:scale:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithData:scale:")
	public native UIImage initWithDataScale(NSData data, @NFloat double scale);

	/**
	 * leftCapWidth</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/leftCapWidth">iOS Dev Center</a>
	 */
	@Generated
	@Selector("leftCapWidth")
	@NInt
	public native long leftCapWidth();

	/**
	 * renderingMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/renderingMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("renderingMode")
	@NInt
	public native long renderingMode();

	/**
	 * resizableImageWithCapInsets:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/resizableImageWithCapInsets:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resizableImageWithCapInsets:")
	public native UIImage resizableImageWithCapInsets(
			@ByValue UIEdgeInsets capInsets);

	/**
	 * resizableImageWithCapInsets:resizingMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/resizableImageWithCapInsets:resizingMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resizableImageWithCapInsets:resizingMode:")
	public native UIImage resizableImageWithCapInsetsResizingMode(
			@ByValue UIEdgeInsets capInsets, @NInt long resizingMode);

	/**
	 * resizingMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/resizingMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("resizingMode")
	@NInt
	public native long resizingMode();

	/**
	 * scale</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/scale">iOS Dev Center</a>
	 */
	@Generated
	@Selector("scale")
	@NFloat
	public native double scale();

	@Generated
	@Selector("setAccessibilityIdentifier:")
	public native void setAccessibilityIdentifier(String value);

	/**
	 * size</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/size">iOS Dev Center</a>
	 */
	@Generated
	@Selector("size")
	@ByValue
	public native CGSize size();

	/**
	 * stretchableImageWithLeftCapWidth:topCapHeight:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/stretchableImageWithLeftCapWidth:topCapHeight:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stretchableImageWithLeftCapWidth:topCapHeight:")
	public native UIImage stretchableImageWithLeftCapWidthTopCapHeight(
			@NInt long leftCapWidth, @NInt long topCapHeight);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * topCapHeight</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/topCapHeight">iOS Dev Center</a>
	 */
	@Generated
	@Selector("topCapHeight")
	@NInt
	public native long topCapHeight();

	/**
	 * traitCollection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/traitCollection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("traitCollection")
	public native UITraitCollection traitCollection();

	/**
	 * flipsForRightToLeftLayoutDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instp/UIImage/flipsForRightToLeftLayoutDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("flipsForRightToLeftLayoutDirection")
	public native boolean flipsForRightToLeftLayoutDirection();

	/**
	 * imageFlippedForRightToLeftLayoutDirection</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIImage_Class/index.html#//apple_ref/occ/instm/UIImage/imageFlippedForRightToLeftLayoutDirection">iOS Dev Center</a>
	 */
	@Generated
	@Selector("imageFlippedForRightToLeftLayoutDirection")
	public native UIImage imageFlippedForRightToLeftLayoutDirection();

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
