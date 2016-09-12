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

package ios.corebluetooth;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.foundation.NSArray;
import ios.foundation.NSData;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreBluetooth")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CBMutableCharacteristic extends CBCharacteristic {
	static {
		NatJ.register();
	}

	@Generated
	protected CBMutableCharacteristic(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CBMutableCharacteristic alloc();

	/**
	 * descriptors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/descriptors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("descriptors")
	public native NSArray<? extends CBDescriptor> descriptors();

	@Generated
	@Selector("init")
	public native CBMutableCharacteristic init();

	/**
	 * initWithType:properties:value:permissions:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instm/CBMutableCharacteristic/initWithType:properties:value:permissions:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithType:properties:value:permissions:")
	public native CBMutableCharacteristic initWithTypePropertiesValuePermissions(
			CBUUID UUID, @NUInt long properties, NSData value,
			@NUInt long permissions);

	/**
	 * permissions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/permissions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("permissions")
	@NUInt
	public native long permissions();

	/**
	 * properties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/properties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("properties")
	@NUInt
	public native long properties();

	/**
	 * descriptors</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/descriptors">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDescriptors:")
	public native void setDescriptors(NSArray<? extends CBDescriptor> value);

	/**
	 * permissions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/permissions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPermissions:")
	public native void setPermissions(@NUInt long value);

	/**
	 * properties</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/properties">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setProperties:")
	public native void setProperties(@NUInt long value);

	/**
	 * value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setValue:")
	public native void setValue(NSData value);

	/**
	 * subscribedCentrals</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/subscribedCentrals">iOS Dev Center</a>
	 */
	@Generated
	@Selector("subscribedCentrals")
	public native NSArray<? extends CBCentral> subscribedCentrals();

	/**
	 * value</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreBluetooth/Reference/CBMutableCharacteristic_Class/index.html#//apple_ref/occ/instp/CBMutableCharacteristic/value">iOS Dev Center</a>
	 */
	@Generated
	@Selector("value")
	public native NSData value();

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
