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

package ios.corelocation;


import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;

import ios.corelocation.struct.CLLocationCoordinate2D;
import ios.foundation.NSCoder;
import ios.foundation.NSMutableDictionary;
import ios.foundation.NSNumber;
import ios.foundation.NSUUID;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;
import ios.foundation.NSSet;

@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLBeaconRegion extends CLRegion {
	static {
		NatJ.register();
	}

	@Generated
	protected CLBeaconRegion(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native CLBeaconRegion alloc();

	@Generated
	@Selector("init")
	public native CLBeaconRegion init();

	@Generated
	@Deprecated
	@Selector("initCircularRegionWithCenter:radius:identifier:")
	public native CLBeaconRegion initCircularRegionWithCenterRadiusIdentifier(
			@ByValue CLLocationCoordinate2D center, double radius,
			String identifier);

	/**
	 * initWithProximityUUID:identifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instm/CLBeaconRegion/initWithProximityUUID:identifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithProximityUUID:identifier:")
	public native CLBeaconRegion initWithProximityUUIDIdentifier(
			NSUUID proximityUUID, String identifier);

	/**
	 * initWithProximityUUID:major:identifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instm/CLBeaconRegion/initWithProximityUUID:major:identifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithProximityUUID:major:identifier:")
	public native CLBeaconRegion initWithProximityUUIDMajorIdentifier(
			NSUUID proximityUUID, char major, String identifier);

	/**
	 * initWithProximityUUID:major:minor:identifier:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instm/CLBeaconRegion/initWithProximityUUID:major:minor:identifier:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("initWithProximityUUID:major:minor:identifier:")
	public native CLBeaconRegion initWithProximityUUIDMajorMinorIdentifier(
			NSUUID proximityUUID, char major, char minor, String identifier);

	/**
	 * major</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instp/CLBeaconRegion/major">iOS Dev Center</a>
	 */
	@Generated
	@Selector("major")
	public native NSNumber major();

	/**
	 * minor</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instp/CLBeaconRegion/minor">iOS Dev Center</a>
	 */
	@Generated
	@Selector("minor")
	public native NSNumber minor();

	/**
	 * notifyEntryStateOnDisplay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instp/CLBeaconRegion/notifyEntryStateOnDisplay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("notifyEntryStateOnDisplay")
	public native boolean notifyEntryStateOnDisplay();

	/**
	 * peripheralDataWithMeasuredPower:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instm/CLBeaconRegion/peripheralDataWithMeasuredPower:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("peripheralDataWithMeasuredPower:")
	public native NSMutableDictionary<String, Object> peripheralDataWithMeasuredPower(
			NSNumber measuredPower);

	/**
	 * proximityUUID</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instp/CLBeaconRegion/proximityUUID">iOS Dev Center</a>
	 */
	@Generated
	@Selector("proximityUUID")
	public native NSUUID proximityUUID();

	/**
	 * notifyEntryStateOnDisplay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLBeaconRegion_class/index.html#//apple_ref/occ/instp/CLBeaconRegion/notifyEntryStateOnDisplay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setNotifyEntryStateOnDisplay:")
	public native void setNotifyEntryStateOnDisplay(boolean value);

	@Generated
	@Selector("initWithCoder:")
	public native CLBeaconRegion initWithCoder(NSCoder aDecoder);

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
	@Selector("supportsSecureCoding")
	public static native boolean supportsSecureCoding();

	@Generated
	@ProtocolClassMethod("supportsSecureCoding")
	public boolean _supportsSecureCoding() {
		return supportsSecureCoding();
	}

	@Generated
	@Selector("version")
	@NInt
	public static native long version_static();
}
