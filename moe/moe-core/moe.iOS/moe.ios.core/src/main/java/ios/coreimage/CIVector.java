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
import ios.coregraphics.struct.CGAffineTransform;
import ios.coregraphics.struct.CGPoint;
import ios.coregraphics.struct.CGRect;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCopying;
import ios.foundation.protocol.NSSecureCoding;
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
public class CIVector extends NSObject implements NSCopying, NSSecureCoding {
	static {
		NatJ.register();
	}

	@Generated
	protected CIVector(Pointer peer) {
		super(peer);
	}

	/**
	 * CGAffineTransformValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/CGAffineTransformValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("CGAffineTransformValue")
	@ByValue
	public native CGAffineTransform CGAffineTransformValue();

	/**
	 * CGPointValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/CGPointValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("CGPointValue")
	@ByValue
	public native CGPoint CGPointValue();

	/**
	 * CGRectValue</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/CGRectValue">iOS Dev Center</a>
	 */
	@Generated
	@Selector("CGRectValue")
	@ByValue
	public native CGRect CGRectValue();

	/**
	 * W</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/W">iOS Dev Center</a>
	 */
	@Generated
	@Selector("W")
	@NFloat
	public native double W();

	/**
	 * X</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/X">iOS Dev Center</a>
	 */
	@Generated
	@Selector("X")
	@NFloat
	public native double X();

	/**
	 * Y</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/Y">iOS Dev Center</a>
	 */
	@Generated
	@Selector("Y")
	@NFloat
	public native double Y();

	/**
	 * Z</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/Z">iOS Dev Center</a>
	 */
	@Generated
	@Selector("Z")
	@NFloat
	public native double Z();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CIVector alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	/**
	 * count</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/count">iOS Dev Center</a>
	 */
	@Generated
	@Selector("count")
	@NUInt
	public native long count();

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native CIVector init();

	/**
	 * initWithCGAffineTransform:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithCGAffineTransform:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGAffineTransform:")
	public native CIVector initWithCGAffineTransform(
			@ByValue CGAffineTransform r);

	/**
	 * initWithCGPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithCGPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGPoint:")
	public native CIVector initWithCGPoint(@ByValue CGPoint p);

	/**
	 * initWithCGRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithCGRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithCGRect:")
	public native CIVector initWithCGRect(@ByValue CGRect r);

	@Generated
	@Selector("initWithCoder:")
	public native CIVector initWithCoder(NSCoder aDecoder);

	/**
	 * initWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithString:")
	public native CIVector initWithString(String representation);

	/**
	 * initWithValues:count:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithValues:count:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithValues:count:")
	public native CIVector initWithValuesCount(ConstNFloatPtr values,
			@NUInt long count);

	/**
	 * initWithX:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithX:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithX:")
	public native CIVector initWithX(@NFloat double x);

	/**
	 * initWithX:Y:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithX:Y:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithX:Y:")
	public native CIVector initWithXY(@NFloat double x, @NFloat double y);

	/**
	 * initWithX:Y:Z:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithX:Y:Z:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithX:Y:Z:")
	public native CIVector initWithXYZ(@NFloat double x, @NFloat double y,
			@NFloat double z);

	/**
	 * initWithX:Y:Z:W:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/initWithX:Y:Z:W:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithX:Y:Z:W:")
	public native CIVector initWithXYZW(@NFloat double x, @NFloat double y,
			@NFloat double z, @NFloat double w);

	/**
	 * stringRepresentation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instp/CIVector/stringRepresentation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stringRepresentation")
	public native String stringRepresentation();

	/**
	 * valueAtIndex:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/instm/CIVector/valueAtIndex:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueAtIndex:")
	@NFloat
	public native double valueAtIndex(@NUInt long index);

	/**
	 * vectorWithCGAffineTransform:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithCGAffineTransform:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithCGAffineTransform:")
	public static native CIVector vectorWithCGAffineTransform(
			@ByValue CGAffineTransform t);

	/**
	 * vectorWithCGPoint:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithCGPoint:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithCGPoint:")
	public static native CIVector vectorWithCGPoint(@ByValue CGPoint p);

	/**
	 * vectorWithCGRect:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithCGRect:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithCGRect:")
	public static native CIVector vectorWithCGRect(@ByValue CGRect r);

	/**
	 * vectorWithString:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithString:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithString:")
	public static native CIVector vectorWithString(String representation);

	/**
	 * vectorWithValues:count:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithValues:count:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithValues:count:")
	public static native CIVector vectorWithValuesCount(ConstNFloatPtr values,
			@NUInt long count);

	/**
	 * vectorWithX:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithX:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithX:")
	public static native CIVector vectorWithX(@NFloat double x);

	/**
	 * vectorWithX:Y:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithX:Y:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithX:Y:")
	public static native CIVector vectorWithXY(@NFloat double x,
			@NFloat double y);

	/**
	 * vectorWithX:Y:Z:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithX:Y:Z:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithX:Y:Z:")
	public static native CIVector vectorWithXYZ(@NFloat double x,
			@NFloat double y, @NFloat double z);

	/**
	 * vectorWithX:Y:Z:W:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/GraphicsImaging/Reference/QuartzCoreFramework/Classes/CIVector_Class/index.html#//apple_ref/occ/clm/CIVector/vectorWithX:Y:Z:W:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("vectorWithX:Y:Z:W:")
	public static native CIVector vectorWithXYZW(@NFloat double x,
			@NFloat double y, @NFloat double z, @NFloat double w);

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
