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

package ios.homekit;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSError;
import ios.homekit.protocol.HMHomeManagerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("HomeKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class HMHomeManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected HMHomeManager(Pointer peer) {
		super(peer);
	}

	/**
	 * addHomeWithName:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instm/HMHomeManager/addHomeWithName:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("addHomeWithName:completionHandler:")
	public native void addHomeWithNameCompletionHandler(
			String homeName,
			@ObjCBlock(name = "call_addHomeWithNameCompletionHandler") Block_addHomeWithNameCompletionHandler completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_addHomeWithNameCompletionHandler {
		@Generated
		void call_addHomeWithNameCompletionHandler(HMHome arg0,
				NSError arg1);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native HMHomeManager alloc();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instp/HMHomeManager/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native HMHomeManagerDelegate delegate();

	/**
	 * homes</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instp/HMHomeManager/homes">iOS Dev Center</a>
	 */
	@Generated
	@Selector("homes")
	public native NSArray<? extends HMHome> homes();

	@Generated
	@Selector("init")
	public native HMHomeManager init();

	/**
	 * primaryHome</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instp/HMHomeManager/primaryHome">iOS Dev Center</a>
	 */
	@Generated
	@Selector("primaryHome")
	public native HMHome primaryHome();

	/**
	 * removeHome:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instm/HMHomeManager/removeHome:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("removeHome:completionHandler:")
	public native void removeHomeCompletionHandler(
			HMHome home,
			@ObjCBlock(name = "call_removeHomeCompletionHandler") Block_removeHomeCompletionHandler completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_removeHomeCompletionHandler {
		@Generated
		void call_removeHomeCompletionHandler(NSError arg0);
	}

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instp/HMHomeManager/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) HMHomeManagerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instp/HMHomeManager/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) HMHomeManagerDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	/**
	 * updatePrimaryHome:completionHandler:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/HomeKit/Reference/HMHomeManager_Class/index.html#//apple_ref/occ/instm/HMHomeManager/updatePrimaryHome:completionHandler:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("updatePrimaryHome:completionHandler:")
	public native void updatePrimaryHomeCompletionHandler(
			HMHome home,
			@ObjCBlock(name = "call_updatePrimaryHomeCompletionHandler") Block_updatePrimaryHomeCompletionHandler completion);

	@Runtime(ObjCRuntime.class)
	@Generated
	public interface Block_updatePrimaryHomeCompletionHandler {
		@Generated
		void call_updatePrimaryHomeCompletionHandler(NSError arg0);
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
