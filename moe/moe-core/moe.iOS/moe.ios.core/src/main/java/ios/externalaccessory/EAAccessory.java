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

package ios.externalaccessory;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSArray;
import ios.externalaccessory.protocol.EAAccessoryDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("ExternalAccessory")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class EAAccessory extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected EAAccessory(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native EAAccessory alloc();

	/**
	 * connectionID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/connectionID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("connectionID")
	@NUInt
	public native long connectionID();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native EAAccessoryDelegate delegate();

	/**
	 * firmwareRevision</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/firmwareRevision">iOS Dev Center</a>
	 */
	@Generated
	@Selector("firmwareRevision")
	public native String firmwareRevision();

	/**
	 * hardwareRevision</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/hardwareRevision">iOS Dev Center</a>
	 */
	@Generated
	@Selector("hardwareRevision")
	public native String hardwareRevision();

	@Generated
	@Selector("init")
	public native EAAccessory init();

	/**
	 * connected</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/connected">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isConnected")
	public native boolean isConnected();

	/**
	 * manufacturer</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/manufacturer">iOS Dev Center</a>
	 */
	@Generated
	@Selector("manufacturer")
	public native String manufacturer();

	/**
	 * modelNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/modelNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("modelNumber")
	public native String modelNumber();

	/**
	 * name</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/name">iOS Dev Center</a>
	 */
	@Generated
	@Selector("name")
	public native String name();

	/**
	 * protocolStrings</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/protocolStrings">iOS Dev Center</a>
	 */
	@Generated
	@Selector("protocolStrings")
	public native NSArray<String> protocolStrings();

	/**
	 * serialNumber</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/serialNumber">iOS Dev Center</a>
	 */
	@Generated
	@Selector("serialNumber")
	public native String serialNumber();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) EAAccessoryDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/ExternalAccessory/Reference/EAAccessory_class/index.html#//apple_ref/occ/instp/EAAccessory/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) EAAccessoryDelegate value) {
		Object __old = delegate();
		if (value != null) {
			org.moe.natj.objc.ObjCRuntime.associateObjCObject(this, value);
		}
		setDelegate_unsafe(value);
		if (__old != null) {
			org.moe.natj.objc.ObjCRuntime.dissociateObjCObject(this, __old);
		}
	}

	@Generated
	@Selector("dockType")
	public native String dockType();

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
