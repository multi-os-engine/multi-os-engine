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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstNFloatPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.coregraphics.opaque.CGColorRef;
import ios.coregraphics.opaque.CGColorSpaceRef;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
import ios.uikit.UIColor;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreImage")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CIColor extends NSObject implements NSSecureCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected CIColor(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CIColor alloc();

	/**
	 * alpha</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/alpha">iOS Dev Center</a>
	 */
	@Generated
	@Selector("alpha")
	@NFloat
	public native double alpha();

	/**
	 * blue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/blue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("blue")
	@NFloat
	public native double blue();

	/**
	 * colorSpace</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/colorSpace">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorSpace")
	public native CGColorSpaceRef colorSpace();

	/**
	 * colorWithCGColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/clm/CIColor/colorWithCGColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithCGColor:")
	public static native CIColor colorWithCGColor(CGColorRef c);

	/**
	 * colorWithRed:green:blue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/clm/CIColor/colorWithRed:green:blue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithRed:green:blue:")
	public static native CIColor colorWithRedGreenBlue(@NFloat double r,
			@NFloat double g, @NFloat double b);

	/**
	 * colorWithRed:green:blue:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/clm/CIColor/colorWithRed:green:blue:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithRed:green:blue:alpha:")
	public static native CIColor colorWithRedGreenBlueAlpha(@NFloat double r,
			@NFloat double g, @NFloat double b, @NFloat double a);

	/**
	 * colorWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/clm/CIColor/colorWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("colorWithString:")
	public static native CIColor colorWithString(String representation);

	/**
	 * components</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/components">iOS Dev Center</a>
	 */
	@Generated
	@Selector("components")
	public native ConstNFloatPtr components();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	/**
	 * green</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/green">iOS Dev Center</a>
	 */
	@Generated
	@Selector("green")
	@NFloat
	public native double green();

	@Generated
	@Selector("init")
	public native CIColor init();

	/**
	 * initWithCGColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instm/CIColor/initWithCGColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGColor:")
	public native CIColor initWithCGColor(CGColorRef c);

	@Generated
	@Selector("initWithCoder:")
	public native CIColor initWithCoder(NSCoder aDecoder);

	/**
	 * initWithColor:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instm/CIColor/initWithColor:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithColor:")
	public native CIColor initWithColor(UIColor color);

	/**
	 * numberOfComponents</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/numberOfComponents">iOS Dev Center</a>
	 */
	@Generated
	@Selector("numberOfComponents")
	@NUInt
	public native long numberOfComponents();

	/**
	 * red</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/red">iOS Dev Center</a>
	 */
	@Generated
	@Selector("red")
	@NFloat
	public native double red();

	/**
	 * stringRepresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instp/CIColor/stringRepresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringRepresentation")
	public native String stringRepresentation();

	/**
	 * initWithRed:green:blue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instm/CIColor/initWithRed:green:blue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithRed:green:blue:")
	public native CIColor initWithRedGreenBlue(@NFloat double r, @NFloat double g, @NFloat double b);

	/**
	 * initWithRed:green:blue:alpha:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIColor_Class/index.html#//apple_ref/occ/instm/CIColor/initWithRed:green:blue:alpha:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithRed:green:blue:alpha:")
	public native CIColor initWithRedGreenBlueAlpha(@NFloat double r, @NFloat double g, @NFloat double b,
			@NFloat double a);

	@Generated
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

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
	public static native void setVersion_static(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
