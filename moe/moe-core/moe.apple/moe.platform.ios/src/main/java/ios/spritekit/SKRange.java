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

package ios.spritekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NFloat;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSCoder;
import ios.foundation.protocol.NSCoding;
import ios.foundation.protocol.NSCopying;
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
@Library("SpriteKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class SKRange extends NSObject implements NSCoding, NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected SKRange(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native SKRange alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("encodeWithCoder:")
	public native void encodeWithCoder(NSCoder aCoder);

	@Generated
	@Selector("init")
	public native SKRange init();

	@Generated
	@Selector("initWithCoder:")
	public native SKRange initWithCoder(NSCoder aDecoder);

	/**
	 * initWithLowerLimit:upperLimit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/instm/SKRange/initWithLowerLimit:upperLimit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithLowerLimit:upperLimit:")
	public native SKRange initWithLowerLimitUpperLimit(@NFloat double lower,
			@NFloat double upper);

	/**
	 * lowerLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/instp/SKRange/lowerLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("lowerLimit")
	@NFloat
	public native double lowerLimit();

	/**
	 * rangeWithConstantValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/clm/SKRange/rangeWithConstantValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangeWithConstantValue:")
	public static native SKRange rangeWithConstantValue(@NFloat double value);

	/**
	 * rangeWithLowerLimit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/clm/SKRange/rangeWithLowerLimit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangeWithLowerLimit:")
	public static native SKRange rangeWithLowerLimit(@NFloat double lower);

	/**
	 * rangeWithLowerLimit:upperLimit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/clm/SKRange/rangeWithLowerLimit:upperLimit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangeWithLowerLimit:upperLimit:")
	public static native SKRange rangeWithLowerLimitUpperLimit(
			@NFloat double lower, @NFloat double upper);

	/**
	 * rangeWithNoLimits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/clm/SKRange/rangeWithNoLimits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangeWithNoLimits")
	public static native SKRange rangeWithNoLimits();

	/**
	 * rangeWithUpperLimit:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/clm/SKRange/rangeWithUpperLimit:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangeWithUpperLimit:")
	public static native SKRange rangeWithUpperLimit(@NFloat double upper);

	/**
	 * rangeWithValue:variance:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/clm/SKRange/rangeWithValue:variance:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangeWithValue:variance:")
	public static native SKRange rangeWithValueVariance(@NFloat double value,
			@NFloat double variance);

	/**
	 * lowerLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/instp/SKRange/lowerLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setLowerLimit:")
	public native void setLowerLimit(@NFloat double value);

	/**
	 * upperLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/instp/SKRange/upperLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUpperLimit:")
	public native void setUpperLimit(@NFloat double value);

	/**
	 * upperLimit</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/SpriteKit/Reference/SKRange_Ref/index.html#//apple_ref/occ/instp/SKRange/upperLimit">iOS Dev Center</a>
	 */
	@Generated
	@Selector("upperLimit")
	@NFloat
	public native double upperLimit();

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
