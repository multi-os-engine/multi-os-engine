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


import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.ConstVoidPtr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.moe.natj.objc.map.ObjCStringMapper;

import ios.NSObject;
import ios.foundation.protocol.NSCopying;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSPointerFunctions extends NSObject implements NSCopying {
	static {
		NatJ.register();
	}

	@Generated
	protected NSPointerFunctions(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSPointerFunctions alloc();

	@Generated
	@Owned
	@Selector("copyWithZone:")
	@MappedReturn(ObjCObjectMapper.class)
	public native Object copyWithZone(VoidPtr zone);

	@Generated
	@Selector("init")
	public native NSPointerFunctions init();

	/**
	 * initWithOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instm/NSPointerFunctions/initWithOptions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithOptions:")
	public native NSPointerFunctions initWithOptions(@NUInt long options);

	/**
	 * pointerFunctionsWithOptions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/clm/NSPointerFunctions/pointerFunctionsWithOptions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pointerFunctionsWithOptions:")
	public static native NSPointerFunctions pointerFunctionsWithOptions(
			@NUInt long options);

	/**
	 * descriptionFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/descriptionFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDescriptionFunction:")
	public native void setDescriptionFunction(
			@FunctionPtr(name = "call_setDescriptionFunction") Function_setDescriptionFunction value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Function_setDescriptionFunction {
		@Generated
		@MappedReturn(ObjCStringMapper.class)
		String call_setDescriptionFunction(ConstVoidPtr arg0);
	}

	/**
	 * sizeFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/sizeFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setSizeFunction:")
	public native void setSizeFunction(
			@FunctionPtr(name = "call_setSizeFunction") Function_setSizeFunction value);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Function_setSizeFunction {
		@Generated
		@NUInt
		long call_setSizeFunction(ConstVoidPtr arg0);
	}

	/**
	 * usesStrongWriteBarrier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/usesStrongWriteBarrier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUsesStrongWriteBarrier:")
	public native void setUsesStrongWriteBarrier(boolean value);

	/**
	 * usesWeakReadAndWriteBarriers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/usesWeakReadAndWriteBarriers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setUsesWeakReadAndWriteBarriers:")
	public native void setUsesWeakReadAndWriteBarriers(boolean value);

	/**
	 * usesStrongWriteBarrier</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/usesStrongWriteBarrier">iOS Dev Center</a>
	 */
	@Generated
	@Selector("usesStrongWriteBarrier")
	public native boolean usesStrongWriteBarrier();

	/**
	 * usesWeakReadAndWriteBarriers</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/usesWeakReadAndWriteBarriers">iOS Dev Center</a>
	 */
	@Generated
	@Selector("usesWeakReadAndWriteBarriers")
	public native boolean usesWeakReadAndWriteBarriers();

	/**
	 * descriptionFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/descriptionFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("descriptionFunction")
	@FunctionPtr(name = "call_descriptionFunction_ret")
	public native Function_descriptionFunction_ret descriptionFunction();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Function_descriptionFunction_ret {
		@Generated
		@MappedReturn(ObjCStringMapper.class)
		String call_descriptionFunction_ret(ConstVoidPtr arg0);
	}

	/**
	 * sizeFunction</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSPointerFunctions_Class/index.html#//apple_ref/occ/instp/NSPointerFunctions/sizeFunction">iOS Dev Center</a>
	 */
	@Generated
	@Selector("sizeFunction")
	@FunctionPtr(name = "call_sizeFunction_ret")
	public native Function_sizeFunction_ret sizeFunction();

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Function_sizeFunction_ret {
		@Generated
		@NUInt
		long call_sizeFunction_ret(ConstVoidPtr arg0);
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
	public static native void setVersion(@NInt long aVersion);

	@Generated
	@Selector("superclass")
	public static native Class superclass_static();

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
