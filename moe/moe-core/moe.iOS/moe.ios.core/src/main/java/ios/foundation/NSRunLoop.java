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
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.corefoundation.opaque.CFRunLoopRef;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;

@Generated
@Library("Foundation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class NSRunLoop extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected NSRunLoop(Pointer peer) {
		super(peer);
	}

	/**
	 * acceptInputForMode:beforeDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/acceptInputForMode:beforeDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("acceptInputForMode:beforeDate:")
	public native void acceptInputForModeBeforeDate(String mode,
			NSDate limitDate);

	/**
	 * addPort:forMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/addPort:forMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addPort:forMode:")
	public native void addPortForMode(NSPort aPort, String mode);

	/**
	 * addTimer:forMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/addTimer:forMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addTimer:forMode:")
	public native void addTimerForMode(NSTimer timer, String mode);

	@Generated
	@Owned
	@Selector("alloc")
	public static native NSRunLoop alloc();

	/**
	 * cancelPerformSelector:target:argument:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/cancelPerformSelector:target:argument:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelPerformSelector:target:argument:")
	public native void cancelPerformSelectorTargetArgument(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object arg);

	/**
	 * cancelPerformSelectorsWithTarget:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/cancelPerformSelectorsWithTarget:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("cancelPerformSelectorsWithTarget:")
	public native void cancelPerformSelectorsWithTarget(
			@Mapped(ObjCObjectMapper.class) Object target);

	/**
	 * currentMode</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instp/NSRunLoop/currentMode">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentMode")
	public native String currentMode();

	/**
	 * currentRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/clm/NSRunLoop/currentRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@Selector("currentRunLoop")
	public static native NSRunLoop currentRunLoop();

	/**
	 * getCFRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/getCFRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@Selector("getCFRunLoop")
	public native CFRunLoopRef getCFRunLoop();

	@Generated
	@Selector("init")
	public native NSRunLoop init();

	/**
	 * limitDateForMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/limitDateForMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("limitDateForMode:")
	public native NSDate limitDateForMode(String mode);

	/**
	 * mainRunLoop</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/clm/NSRunLoop/mainRunLoop">iOS Dev Center</a>
	 */
	@Generated
	@Selector("mainRunLoop")
	public static native NSRunLoop mainRunLoop();

	/**
	 * performSelector:target:argument:order:modes:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/performSelector:target:argument:order:modes:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("performSelector:target:argument:order:modes:")
	public native void performSelectorTargetArgumentOrderModes(SEL aSelector,
			@Mapped(ObjCObjectMapper.class) Object target,
			@Mapped(ObjCObjectMapper.class) Object arg, @NUInt long order,
			NSArray<String> modes);

	/**
	 * removePort:forMode:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/removePort:forMode:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removePort:forMode:")
	public native void removePortForMode(NSPort aPort, String mode);

	/**
	 * run</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/run">iOS Dev Center</a>
	 */
	@Generated
	@Selector("run")
	public native void run();

	/**
	 * runMode:beforeDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/runMode:beforeDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("runMode:beforeDate:")
	public native boolean runModeBeforeDate(String mode, NSDate limitDate);

	/**
	 * runUntilDate:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/Cocoa/Reference/Foundation/Classes/NSRunLoop_Class/index.html#//apple_ref/occ/instm/NSRunLoop/runUntilDate:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("runUntilDate:")
	public native void runUntilDate(NSDate limitDate);

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
