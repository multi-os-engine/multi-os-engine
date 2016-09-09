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
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

import ios.NSObject;
import ios.foundation.NSSet;
import ios.corelocation.protocol.CLLocationManagerDelegate;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.SEL;
import ios.foundation.NSArray;
import ios.foundation.NSMethodSignature;

@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLLocationManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected CLLocationManager(Pointer peer) {
		super(peer);
	}

	/**
	 * activityType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/activityType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("activityType")
	@NInt
	public native long activityType();

	@Generated
	@Owned
	@Selector("alloc")
	public static native CLLocationManager alloc();

	/**
	 * allowDeferredLocationUpdatesUntilTraveled:timeout:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/allowDeferredLocationUpdatesUntilTraveled:timeout:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowDeferredLocationUpdatesUntilTraveled:timeout:")
	public native void allowDeferredLocationUpdatesUntilTraveledTimeout(
			double distance, double timeout);

	/**
	 * authorizationStatus</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/authorizationStatus">iOS Dev Center</a>
	 */
	@Generated
	@Selector("authorizationStatus")
	public static native int authorizationStatus();

	/**
	 * deferredLocationUpdatesAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/deferredLocationUpdatesAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("deferredLocationUpdatesAvailable")
	public static native boolean deferredLocationUpdatesAvailable();

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("delegate")
	@MappedReturn(ObjCObjectMapper.class)
	public native CLLocationManagerDelegate delegate();

	/**
	 * desiredAccuracy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/desiredAccuracy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("desiredAccuracy")
	public native double desiredAccuracy();

	/**
	 * disallowDeferredLocationUpdates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/disallowDeferredLocationUpdates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("disallowDeferredLocationUpdates")
	public native void disallowDeferredLocationUpdates();

	/**
	 * dismissHeadingCalibrationDisplay</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/dismissHeadingCalibrationDisplay">iOS Dev Center</a>
	 */
	@Generated
	@Selector("dismissHeadingCalibrationDisplay")
	public native void dismissHeadingCalibrationDisplay();

	/**
	 * distanceFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/distanceFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("distanceFilter")
	public native double distanceFilter();

	/**
	 * heading</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/heading">iOS Dev Center</a>
	 */
	@Generated
	@Selector("heading")
	public native CLHeading heading();

	/**
	 * headingAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/headingAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("headingAvailable")
	public static native boolean headingAvailable_static();

	/**
	 * headingAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/headingAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("headingAvailable")
	public native boolean headingAvailable();

	/**
	 * headingFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/headingFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("headingFilter")
	public native double headingFilter();

	/**
	 * headingOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/headingOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("headingOrientation")
	public native int headingOrientation();

	@Generated
	@Selector("init")
	public native CLLocationManager init();

	/**
	 * isMonitoringAvailableForClass:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/isMonitoringAvailableForClass:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isMonitoringAvailableForClass:")
	public static native boolean isMonitoringAvailableForClass(Class regionClass);

	/**
	 * isRangingAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/isRangingAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("isRangingAvailable")
	public static native boolean isRangingAvailable();

	/**
	 * location</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/location">iOS Dev Center</a>
	 */
	@Generated
	@Selector("location")
	public native CLLocation location();

	/**
	 * locationServicesEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/locationServicesEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Selector("locationServicesEnabled")
	public static native boolean locationServicesEnabled_static();

	/**
	 * locationServicesEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/locationServicesEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("locationServicesEnabled")
	public native boolean locationServicesEnabled();

	/**
	 * maximumRegionMonitoringDistance</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/maximumRegionMonitoringDistance">iOS Dev Center</a>
	 */
	@Generated
	@Selector("maximumRegionMonitoringDistance")
	public native double maximumRegionMonitoringDistance();

	/**
	 * monitoredRegions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/monitoredRegions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("monitoredRegions")
	public native NSSet<? extends CLRegion> monitoredRegions();

	/**
	 * pausesLocationUpdatesAutomatically</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/pausesLocationUpdatesAutomatically">iOS Dev Center</a>
	 */
	@Generated
	@Selector("pausesLocationUpdatesAutomatically")
	public native boolean pausesLocationUpdatesAutomatically();

	/**
	 * purpose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/purpose">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("purpose")
	public native String purpose();

	/**
	 * rangedRegions</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/rangedRegions">iOS Dev Center</a>
	 */
	@Generated
	@Selector("rangedRegions")
	public native NSSet<? extends CLRegion> rangedRegions();

	/**
	 * regionMonitoringAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/regionMonitoringAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("regionMonitoringAvailable")
	public static native boolean regionMonitoringAvailable();

	/**
	 * regionMonitoringEnabled</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/regionMonitoringEnabled">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("regionMonitoringEnabled")
	public static native boolean regionMonitoringEnabled();

	/**
	 * requestAlwaysAuthorization</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/requestAlwaysAuthorization">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestAlwaysAuthorization")
	public native void requestAlwaysAuthorization();

	/**
	 * requestStateForRegion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/requestStateForRegion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestStateForRegion:")
	public native void requestStateForRegion(CLRegion region);

	/**
	 * requestWhenInUseAuthorization</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/requestWhenInUseAuthorization">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestWhenInUseAuthorization")
	public native void requestWhenInUseAuthorization();

	/**
	 * activityType</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/activityType">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setActivityType:")
	public native void setActivityType(@NInt long value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/delegate">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDelegate:")
	public native void setDelegate_unsafe(
			@Mapped(ObjCObjectMapper.class) CLLocationManagerDelegate value);

	/**
	 * delegate</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/delegate">iOS Dev Center</a>
	 */
	@Generated
	public void setDelegate(@Mapped(ObjCObjectMapper.class) CLLocationManagerDelegate value) {
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
	 * desiredAccuracy</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/desiredAccuracy">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDesiredAccuracy:")
	public native void setDesiredAccuracy(double value);

	/**
	 * distanceFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/distanceFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setDistanceFilter:")
	public native void setDistanceFilter(double value);

	/**
	 * headingFilter</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/headingFilter">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHeadingFilter:")
	public native void setHeadingFilter(double value);

	/**
	 * headingOrientation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/headingOrientation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setHeadingOrientation:")
	public native void setHeadingOrientation(int value);

	/**
	 * pausesLocationUpdatesAutomatically</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/pausesLocationUpdatesAutomatically">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setPausesLocationUpdatesAutomatically:")
	public native void setPausesLocationUpdatesAutomatically(boolean value);

	/**
	 * purpose</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/purpose">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("setPurpose:")
	public native void setPurpose(String value);

	/**
	 * significantLocationChangeMonitoringAvailable</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/clm/CLLocationManager/significantLocationChangeMonitoringAvailable">iOS Dev Center</a>
	 */
	@Generated
	@Selector("significantLocationChangeMonitoringAvailable")
	public static native boolean significantLocationChangeMonitoringAvailable();

	/**
	 * startMonitoringForRegion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/startMonitoringForRegion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startMonitoringForRegion:")
	public native void startMonitoringForRegion(CLRegion region);

	/**
	 * startMonitoringForRegion:desiredAccuracy:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/startMonitoringForRegion:desiredAccuracy:">iOS Dev Center</a>
	 */
	@Generated
	@Deprecated
	@Selector("startMonitoringForRegion:desiredAccuracy:")
	public native void startMonitoringForRegionDesiredAccuracy(CLRegion region,
			double accuracy);

	/**
	 * startMonitoringSignificantLocationChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/startMonitoringSignificantLocationChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startMonitoringSignificantLocationChanges")
	public native void startMonitoringSignificantLocationChanges();

	/**
	 * startMonitoringVisits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/startMonitoringVisits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startMonitoringVisits")
	public native void startMonitoringVisits();

	/**
	 * startRangingBeaconsInRegion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/startRangingBeaconsInRegion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startRangingBeaconsInRegion:")
	public native void startRangingBeaconsInRegion(CLBeaconRegion region);

	/**
	 * startUpdatingHeading</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/startUpdatingHeading">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startUpdatingHeading")
	public native void startUpdatingHeading();

	/**
	 * startUpdatingLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/startUpdatingLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("startUpdatingLocation")
	public native void startUpdatingLocation();

	/**
	 * stopMonitoringForRegion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/stopMonitoringForRegion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopMonitoringForRegion:")
	public native void stopMonitoringForRegion(CLRegion region);

	/**
	 * stopMonitoringSignificantLocationChanges</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/stopMonitoringSignificantLocationChanges">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopMonitoringSignificantLocationChanges")
	public native void stopMonitoringSignificantLocationChanges();

	/**
	 * stopMonitoringVisits</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/stopMonitoringVisits">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopMonitoringVisits")
	public native void stopMonitoringVisits();

	/**
	 * stopRangingBeaconsInRegion:</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/stopRangingBeaconsInRegion:">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopRangingBeaconsInRegion:")
	public native void stopRangingBeaconsInRegion(CLBeaconRegion region);

	/**
	 * stopUpdatingHeading</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/stopUpdatingHeading">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopUpdatingHeading")
	public native void stopUpdatingHeading();

	/**
	 * stopUpdatingLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/stopUpdatingLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("stopUpdatingLocation")
	public native void stopUpdatingLocation();

	/**
	 * allowsBackgroundLocationUpdates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/allowsBackgroundLocationUpdates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("allowsBackgroundLocationUpdates")
	public native boolean allowsBackgroundLocationUpdates();

	/**
	 * requestLocation</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instm/CLLocationManager/requestLocation">iOS Dev Center</a>
	 */
	@Generated
	@Selector("requestLocation")
	public native void requestLocation();

	/**
	 * allowsBackgroundLocationUpdates</br>
	Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManager_Class/index.html#//apple_ref/occ/instp/CLLocationManager/allowsBackgroundLocationUpdates">iOS Dev Center</a>
	 */
	@Generated
	@Selector("setAllowsBackgroundLocationUpdates:")
	public native void setAllowsBackgroundLocationUpdates(boolean value);

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
