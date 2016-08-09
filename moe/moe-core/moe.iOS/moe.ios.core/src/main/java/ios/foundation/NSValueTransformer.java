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

package ios.foundation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSValueTransformer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSValueTransformer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSValueTransformer alloc();

	/**
	 * allowsReverseTransformation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValueTransformer_Class/index.html#//apple_ref/occ/clm/NSValueTransformer/allowsReverseTransformation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsReverseTransformation")
	public static native boolean allowsReverseTransformation();

	@Generated
	@Selector("init")
	public native NSValueTransformer init();

	/**
	 * reverseTransformedValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValueTransformer_Class/index.html#//apple_ref/occ/instm/NSValueTransformer/reverseTransformedValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("reverseTransformedValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object reverseTransformedValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * setValueTransformer:forName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValueTransformer_Class/index.html#//apple_ref/occ/clm/NSValueTransformer/setValueTransformer:forName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValueTransformer:forName:")
	public static native void setValueTransformerForName(
			NSValueTransformer transformer, String name);

	/**
	 * transformedValue:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValueTransformer_Class/index.html#//apple_ref/occ/instm/NSValueTransformer/transformedValue:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transformedValue:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object transformedValue(
			@Mapped(ObjCObjectMapper.class) Object value);

	/**
	 * transformedValueClass</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValueTransformer_Class/index.html#//apple_ref/occ/clm/NSValueTransformer/transformedValueClass">iOS Dev Center</a>
	 */
	@Generated
	@Selector("transformedValueClass")
	public static native Class transformedValueClass();

	/**
	 * valueTransformerForName:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValueTransformer_Class/index.html#//apple_ref/occ/clm/NSValueTransformer/valueTransformerForName:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueTransformerForName:")
	public static native NSValueTransformer valueTransformerForName(String name);

	/**
	 * valueTransformerNames</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSValueTransformer_Class/index.html#//apple_ref/occ/clm/NSValueTransformer/valueTransformerNames">iOS Dev Center</a>
	 */
	@Generated
	@Selector("valueTransformerNames")
	public static native NSArray<String> valueTransformerNames();

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
