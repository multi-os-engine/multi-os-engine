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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.opaque.CGColorRef;
import ios.coreimage.CIColor;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("UIKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class UIColor extends NSObject implements NSSecureCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected UIColor(Pointer peer) {
		super(peer);
	}

	/**
	 * CGColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/CGColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("CGColor")
	public native CGColorRef CGColor();

	/**
	 * CIColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instp/UIColor/CIColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("CIColor")
	public native CIColor CIColor();

	@Generated
	@Owned
	@Selector("alloc")
	public static native UIColor alloc();

	/**
	 * blackColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/blackColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("blackColor")
	public static native UIColor blackColor();

	/**
	 * blueColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/blueColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("blueColor")
	public static native UIColor blueColor();

	/**
	 * brownColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/brownColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("brownColor")
	public static native UIColor brownColor();

	/**
	 * clearColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/clearColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("clearColor")
	public static native UIColor clearColor();

	/**
	 * colorWithAlphaComponent:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/colorWithAlphaComponent:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithAlphaComponent:")
	public native UIColor colorWithAlphaComponent(@NFloat double alpha);

	/**
	 * colorWithCGColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/colorWithCGColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithCGColor:")
	public static native UIColor colorWithCGColor(CGColorRef cgColor);

	/**
	 * colorWithCIColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/colorWithCIColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithCIColor:")
	public static native UIColor colorWithCIColor(CIColor ciColor);

	/**
	 * colorWithHue:saturation:brightness:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/colorWithHue:saturation:brightness:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithHue:saturation:brightness:alpha:")
	public static native UIColor colorWithHueSaturationBrightnessAlpha(
			@NFloat double hue, @NFloat double saturation,
			@NFloat double brightness, @NFloat double alpha);

	/**
	 * colorWithPatternImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/colorWithPatternImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithPatternImage:")
	public static native UIColor colorWithPatternImage(UIImage image);

	/**
	 * colorWithRed:green:blue:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/colorWithRed:green:blue:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithRed:green:blue:alpha:")
	public static native UIColor colorWithRedGreenBlueAlpha(@NFloat double red,
			@NFloat double green, @NFloat double blue, @NFloat double alpha);

	/**
	 * colorWithWhite:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/colorWithWhite:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithWhite:alpha:")
	public static native UIColor colorWithWhiteAlpha(@NFloat double white,
			@NFloat double alpha);

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * cyanColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/cyanColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cyanColor")
	public static native UIColor cyanColor();

	/**
	 * darkGrayColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/darkGrayColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("darkGrayColor")
	public static native UIColor darkGrayColor();

	/**
	 * darkTextColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/darkTextColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("darkTextColor")
	public static native UIColor darkTextColor();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * getHue:saturation:brightness:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/getHue:saturation:brightness:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getHue:saturation:brightness:alpha:")
	public native boolean getHueSaturationBrightnessAlpha(NFloatPtr hue,
			NFloatPtr saturation, NFloatPtr brightness, NFloatPtr alpha);

	/**
	 * getRed:green:blue:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/getRed:green:blue:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getRed:green:blue:alpha:")
	public native boolean getRedGreenBlueAlpha(NFloatPtr red, NFloatPtr green,
			NFloatPtr blue, NFloatPtr alpha);

	/**
	 * getWhite:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/getWhite:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getWhite:alpha:")
	public native boolean getWhiteAlpha(NFloatPtr white, NFloatPtr alpha);

	/**
	 * grayColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/grayColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("grayColor")
	public static native UIColor grayColor();

	/**
	 * greenColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/greenColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("greenColor")
	public static native UIColor greenColor();

	/**
	 * groupTableViewBackgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/groupTableViewBackgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("groupTableViewBackgroundColor")
	public static native UIColor groupTableViewBackgroundColor();

	@Generated
	@Selector("init")
	public native UIColor init();

	/**
	 * initWithCGColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/initWithCGColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGColor:")
	public native UIColor initWithCGColor(CGColorRef cgColor);

	/**
	 * initWithCIColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/initWithCIColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCIColor:")
	public native UIColor initWithCIColor(CIColor ciColor);

	@Generated
	@Selector("initWithCoder:")
	public native UIColor initWithCoder(NSCoder aDecoder);

	/**
	 * initWithHue:saturation:brightness:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/initWithHue:saturation:brightness:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithHue:saturation:brightness:alpha:")
	public native UIColor initWithHueSaturationBrightnessAlpha(
			@NFloat double hue, @NFloat double saturation,
			@NFloat double brightness, @NFloat double alpha);

	/**
	 * initWithPatternImage:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/initWithPatternImage:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithPatternImage:")
	public native UIColor initWithPatternImage(UIImage image);

	/**
	 * initWithRed:green:blue:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/initWithRed:green:blue:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithRed:green:blue:alpha:")
	public native UIColor initWithRedGreenBlueAlpha(@NFloat double red,
			@NFloat double green, @NFloat double blue, @NFloat double alpha);

	/**
	 * initWithWhite:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/initWithWhite:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithWhite:alpha:")
	public native UIColor initWithWhiteAlpha(@NFloat double white,
			@NFloat double alpha);

	/**
	 * lightGrayColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/lightGrayColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lightGrayColor")
	public static native UIColor lightGrayColor();

	/**
	 * lightTextColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/lightTextColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lightTextColor")
	public static native UIColor lightTextColor();

	/**
	 * magentaColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/magentaColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("magentaColor")
	public static native UIColor magentaColor();

	/**
	 * orangeColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/orangeColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("orangeColor")
	public static native UIColor orangeColor();

	/**
	 * purpleColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/purpleColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("purpleColor")
	public static native UIColor purpleColor();

	/**
	 * redColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/redColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("redColor")
	public static native UIColor redColor();

	/**
	 * scrollViewTexturedBackgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/scrollViewTexturedBackgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("scrollViewTexturedBackgroundColor")
	public static native UIColor scrollViewTexturedBackgroundColor();

	/**
	 * set</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/set">iOS Dev Center</a>
	 */
	@Generated
	@Selector("set")
	public native void set();

	/**
	 * setFill</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/setFill">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setFill")
	public native void setFill();

	/**
	 * setStroke</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/instm/UIColor/setStroke">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setStroke")
	public native void setStroke();

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	/**
	 * underPageBackgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/underPageBackgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("underPageBackgroundColor")
	public static native UIColor underPageBackgroundColor();

	/**
	 * viewFlipsideBackgroundColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/viewFlipsideBackgroundColor">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("viewFlipsideBackgroundColor")
	public static native UIColor viewFlipsideBackgroundColor();

	/**
	 * whiteColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/whiteColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("whiteColor")
	public static native UIColor whiteColor();

	/**
	 * yellowColor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/UIKit/Reference/UIColor_Class/index.html#//apple_ref/occ/clm/UIColor/yellowColor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("yellowColor")
	public static native UIColor yellowColor();

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
