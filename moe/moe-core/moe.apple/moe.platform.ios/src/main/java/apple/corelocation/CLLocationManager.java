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

package apple.corelocation;

import apple.NSObject;
import apple.corelocation.protocol.CLLocationManagerDelegate;
import apple.foundation.NSArray;
import apple.foundation.NSData;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * CLLocationManager
 * 
 * Discussion:
 * The CLLocationManager object is your entry point to the location service.
 * 
 * API-Since: 2.0
 */
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

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLLocationManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native CLLocationManager allocWithZone(VoidPtr zone);

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Deprecated. Use the instance property authorizationStatus instead.
     * 
     * API-Since: 4.2
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @Selector("authorizationStatus")
    public static native int authorizationStatus_static();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

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

    /**
     * deferredLocationUpdatesAvailable
     * 
     * Discussion:
     * Returns YES if the device supports deferred location updates, otherwise NO.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: You can remove calls to this method
     */
    @Deprecated
    @Generated
    @Selector("deferredLocationUpdatesAvailable")
    public static native boolean deferredLocationUpdatesAvailable();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * headingAvailable
     * 
     * Discussion:
     * Returns YES if the device supports the heading service, otherwise NO.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("headingAvailable")
    public static native boolean headingAvailable_static();

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    /**
     * isMonitoringAvailableForClass:
     * 
     * Discussion:
     * Determines whether the device supports monitoring for the specified type of region.
     * If NO, all attempts to monitor the specified type of region will fail.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isMonitoringAvailableForClass:")
    public static native boolean isMonitoringAvailableForClass(Class regionClass);

    /**
     * isRangingAvailable
     * 
     * Discussion:
     * Determines whether the device supports ranging.
     * If NO, all attempts to range beacons will fail.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("isRangingAvailable")
    public static native boolean isRangingAvailable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * locationServicesEnabled
     * 
     * Discussion:
     * Determines whether the user has location services enabled.
     * If NO, and you proceed to call other CoreLocation API, user will be prompted with the warning
     * dialog. You may want to check this property and use location services only when explicitly requested by the user.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("locationServicesEnabled")
    public static native boolean locationServicesEnabled_static();

    @Generated
    @Owned
    @Selector("new")
    public static native CLLocationManager new_objc();

    /**
     * regionMonitoringAvailable
     * 
     * Discussion:
     * Deprecated. Use +isMonitoringAvailableForClass: instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 7.0
     */
    @Generated
    @Deprecated
    @Selector("regionMonitoringAvailable")
    public static native boolean regionMonitoringAvailable();

    /**
     * regionMonitoringEnabled
     * 
     * Discussion:
     * Deprecated. Use +isMonitoringAvailableForClass: and -authorizationStatus instead.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: Use +isMonitoringAvailableForClass: and -authorizationStatus instead
     */
    @Generated
    @Deprecated
    @Selector("regionMonitoringEnabled")
    public static native boolean regionMonitoringEnabled();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * significantLocationChangeMonitoringAvailable
     * 
     * Discussion:
     * Returns YES if the device supports significant location change monitoring, otherwise NO.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("significantLocationChangeMonitoringAvailable")
    public static native boolean significantLocationChangeMonitoringAvailable();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * activityType
     * 
     * Discussion:
     * Specifies the type of user activity. Currently affects behavior such as
     * the determination of when location updates may be automatically paused.
     * By default, CLActivityTypeOther is used.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("activityType")
    @NInt
    public native long activityType();

    /**
     * allowDeferredLocationUpdatesUntilTraveled:timeout:
     * 
     * Discussion:
     * Indicate that the application will allow the location manager to defer
     * location updates until an exit criterion is met. This may allow the
     * device to enter a low-power state in which updates are held for later
     * delivery. Once an exit condition is met, the location manager will
     * continue normal updates until this method is invoked again.
     * 
     * Exit conditions, distance and timeout, can be specified using the constants
     * CLLocationDistanceMax and CLTimeIntervalMax, respectively, if you are
     * trying to achieve an unlimited distance or timeout.
     * 
     * The CLLocationManagerDelegate will continue to receive normal updates as
     * long as the application remains in the foreground. While the process is
     * in the background, the device may be able to enter a low-power state for
     * portions of the specified distance and time interval. While in this
     * state, locations will be coalesced for later delivery.
     * 
     * Location updates will be deferred as much as is reasonable to save
     * power. If another process is using location, the device may not enter a
     * low-power state and instead updates will continue normally. Deferred
     * updates may be interspersed with normal updates if the device exits and
     * re-enters a low-power state.
     * 
     * All location updates, including deferred updates, will be delivered via
     * the delegate callback locationManager:didUpdateLocations:
     * 
     * When deferred updates have ended, the manager will invoke the delegate
     * callback locationManagerDidFinishDeferredUpdates:withError:. An error
     * will be returned if the manager will not defer updates and the exit
     * criteria have not been met.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: You can remove calls to this method
     */
    @Deprecated
    @Generated
    @Selector("allowDeferredLocationUpdatesUntilTraveled:timeout:")
    public native void allowDeferredLocationUpdatesUntilTraveledTimeout(double distance, double timeout);

    /**
     * allowsBackgroundLocationUpdates
     * 
     * Discussion:
     * By default, this is NO for applications linked against iOS 9.0 or later,
     * regardless of minimum deployment target.
     * 
     * With UIBackgroundModes set to include "location" in Info.plist, you must
     * also set this property to YES at runtime whenever calling
     * -startUpdatingLocation with the intent to continue in the background.
     * 
     * Setting this property to YES when UIBackgroundModes does not include
     * "location" is a fatal error.
     * 
     * Resetting this property to NO is equivalent to omitting "location" from
     * the UIBackgroundModes value. Access to location is still permitted
     * whenever the application is running (ie not suspended), and has
     * sufficient authorization (ie it has WhenInUse authorization and is in
     * use, or it has Always authorization). However, the app will still be
     * subject to the usual task suspension rules.
     * 
     * See -requestWhenInUseAuthorization and -requestAlwaysAuthorization for
     * more details on possible authorization values.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("allowsBackgroundLocationUpdates")
    public native boolean allowsBackgroundLocationUpdates();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CLLocationManagerDelegate delegate();

    /**
     * desiredAccuracy
     * 
     * Discussion:
     * The desired location accuracy. The location service will try its best to achieve
     * your desired accuracy. However, it is not guaranteed. To optimize
     * power performance, be sure to specify an appropriate accuracy for your usage scenario (eg,
     * use a large accuracy value when only a coarse location is needed). Use kCLLocationAccuracyBest to
     * achieve the best possible accuracy. Use kCLLocationAccuracyBestForNavigation for navigation.
     * The default value varies by platform.
     */
    @Generated
    @Selector("desiredAccuracy")
    public native double desiredAccuracy();

    /**
     * disallowDeferredLocationUpdates
     * 
     * Discussion:
     * Disallow deferred location updates if previously enabled. Any outstanding
     * updates will be sent and regular location updates will resume.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: You can remove calls to this method
     */
    @Deprecated
    @Generated
    @Selector("disallowDeferredLocationUpdates")
    public native void disallowDeferredLocationUpdates();

    /**
     * dismissHeadingCalibrationDisplay
     * 
     * Discussion:
     * Dismiss the heading calibration immediately.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("dismissHeadingCalibrationDisplay")
    public native void dismissHeadingCalibrationDisplay();

    /**
     * distanceFilter
     * 
     * Discussion:
     * Specifies the minimum update distance in meters. Client will not be notified of movements of less
     * than the stated value, unless the accuracy has improved. Pass in kCLDistanceFilterNone to be
     * notified of all movements. By default, kCLDistanceFilterNone is used.
     */
    @Generated
    @Selector("distanceFilter")
    public native double distanceFilter();

    /**
     * heading
     * 
     * Discussion:
     * Returns the latest heading update received, or nil if none is available.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("heading")
    public native CLHeading heading();

    /**
     * headingAvailable
     * 
     * Discussion:
     * Deprecated. Use +headingAvailable instead.
     * 
     * API-Since: 3.0
     * Deprecated-Since: 4.0
     */
    @Generated
    @Deprecated
    @Selector("headingAvailable")
    public native boolean headingAvailable();

    /**
     * headingFilter
     * 
     * Discussion:
     * Specifies the minimum amount of change in degrees needed for a heading service update. Client will not
     * be notified of updates less than the stated filter value. Pass in kCLHeadingFilterNone to be
     * notified of all updates. By default, 1 degree is used.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("headingFilter")
    public native double headingFilter();

    /**
     * headingOrientation
     * 
     * Discussion:
     * Specifies a physical device orientation from which heading calculation should be referenced. By default,
     * CLDeviceOrientationPortrait is used. CLDeviceOrientationUnknown, CLDeviceOrientationFaceUp, and
     * CLDeviceOrientationFaceDown are ignored.
     * 
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("headingOrientation")
    public native int headingOrientation();

    @Generated
    @Selector("init")
    public native CLLocationManager init();

    /**
     * location
     * 
     * Discussion:
     * The last location received. Will be nil until a location has been received.
     */
    @Generated
    @Selector("location")
    public native CLLocation location();

    /**
     * locationServicesEnabled
     * 
     * Discussion:
     * Deprecated. Use +locationServicesEnabled instead.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 4.0
     */
    @Generated
    @Deprecated
    @Selector("locationServicesEnabled")
    public native boolean locationServicesEnabled();

    /**
     * maximumRegionMonitoringDistance
     * 
     * Discussion:
     * the maximum region size, in terms of a distance from a central point, that the framework can support.
     * Attempts to register a region larger than this will generate a kCLErrorRegionMonitoringFailure.
     * This value may vary based on the hardware features of the device, as well as on dynamically changing resource
     * constraints.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("maximumRegionMonitoringDistance")
    public native double maximumRegionMonitoringDistance();

    /**
     * monitoredRegions
     * 
     * Discussion:
     * Retrieve a set of objects for the regions that are currently being monitored. If any location manager
     * has been instructed to monitor a region, during this or previous launches of your application, it will
     * be present in this set.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("monitoredRegions")
    public native NSSet<? extends CLRegion> monitoredRegions();

    /**
     * pausesLocationUpdatesAutomatically
     * 
     * Discussion:
     * Specifies that location updates may automatically be paused when possible.
     * By default, this is YES for applications linked against iOS 6.0 or later.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("pausesLocationUpdatesAutomatically")
    public native boolean pausesLocationUpdatesAutomatically();

    /**
     * purpose
     * 
     * Discussion:
     * Allows the application to specify what location will be used for in their app. This
     * will be displayed along with the standard Location permissions dialogs. This property will need to be
     * set prior to calling startUpdatingLocation.
     * 
     * Deprecated. Set the purpose string in Info.plist using key NSLocationUsageDescription.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 6.0
     * Deprecated-Message: Set the purpose string in Info.plist using key NSLocationUsageDescription
     */
    @Generated
    @Deprecated
    @Selector("purpose")
    public native String purpose();

    /**
     * rangedRegions
     * 
     * Discussion:
     * Retrieve a set of objects representing the regions for which this location manager is actively providing ranging.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use -rangedBeaconConstraints
     */
    @Deprecated
    @Generated
    @Selector("rangedRegions")
    public native NSSet<? extends CLRegion> rangedRegions();

    /**
     * requestAlwaysAuthorization
     * 
     * Discussion:
     * When -authorizationStatus == kCLAuthorizationStatusNotDetermined,
     * calling this method will start the process of requesting "always"
     * authorization from the user. Any authorization change as a result of
     * the prompt will be reflected via the usual delegate callback:
     * -locationManager:didChangeAuthorizationStatus:.
     * 
     * If possible, perform this call in response to direct user request for a
     * location-based service so that the reason for the prompt will be clear,
     * and the utility of a one-time grant is maximized.
     * 
     * If received, "always" authorization grants access to the user's location
     * via any CLLocationManager API. In addition, monitoring APIs may launch
     * your app into the background when they detect an event. Even if killed by
     * the user, launch events triggered by monitoring APIs will cause a
     * relaunch.
     * 
     * "Always" authorization presents a significant risk to user privacy, and
     * as such requesting it is discouraged unless background launch behavior
     * is genuinely required. Do not call +requestAlwaysAuthorization unless
     * you think users will thank you for doing so.
     * 
     * An application which currently has "when-in-use" authorization and has
     * never before requested "always" authorization may use this method to
     * request "always" authorization one time only. Otherwise, if
     * -authorizationStatus != kCLAuthorizationStatusNotDetermined, (ie
     * generally after the first call) this method will do nothing.
     * 
     * If your app is not currently in use, this method will do nothing.
     * 
     * Both the NSLocationAlwaysAndWhenInUseUsageDescription and
     * NSLocationWhenInUseUsageDescription keys must be specified in your
     * Info.plist; otherwise, this method will do nothing, as your app will be
     * assumed not to support Always authorization.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("requestAlwaysAuthorization")
    public native void requestAlwaysAuthorization();

    /**
     * requestLocation
     * 
     * Discussion:
     * Request a single location update.
     * 
     * The service will attempt to determine location with accuracy according
     * to the desiredAccuracy property. The location update will be delivered
     * via the standard delegate callback, i.e. locationManager:didUpdateLocations:
     * 
     * If the best available location has lower accuracy, then it will be
     * delivered via the standard delegate callback after timeout.
     * 
     * If no location can be determined, the locationManager:didFailWithError:
     * delegate callback will be delivered with error location unknown.
     * 
     * There can only be one outstanding location request and this method can
     * not be used concurrently with startUpdatingLocation or
     * allowDeferredLocationUpdates. Calling either of those methods will
     * immediately cancel the location request. The method
     * stopUpdatingLocation can be used to explicitly cancel the request.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("requestLocation")
    public native void requestLocation();

    /**
     * requestStateForRegion:
     * 
     * Discussion:
     * Asynchronously retrieve the cached state of the specified region. The state is returned to the delegate via
     * locationManager:didDetermineState:forRegion:.
     * 
     * API-Since: 7.0
     */
    @Generated
    @Selector("requestStateForRegion:")
    public native void requestStateForRegion(CLRegion region);

    /**
     * requestWhenInUseAuthorization
     * 
     * Discussion:
     * When -authorizationStatus == kCLAuthorizationStatusNotDetermined,
     * calling this method will trigger a prompt to request "when-in-use"
     * authorization from the user. Any authorization change as a result of
     * the prompt will be reflected via the usual delegate callback:
     * -locationManager:didChangeAuthorizationStatus:.
     * 
     * If possible, perform this call in response to direct user request for a
     * location-based service so that the reason for the prompt will be clear,
     * and the utility of a one-time grant is maximized.
     * 
     * If received, "when-in-use" authorization grants access to the user's
     * location via any CoreLocation API as long as your app is being actively
     * used by the user. Typically this means your app must be in the
     * foreground. If you start a Continuous Background Location session (see
     * -allowsBackgroundLocationUpdates), then CoreLocation will maintain
     * visibility for your app as it enters the background. This will enable
     * your app to continue receiving location information even as another app
     * enters the foreground. Your app will remain visible in this way until
     * location updates are stopped or your app is killed by the user.
     * 
     * When -authorizationStatus != kCLAuthorizationStatusNotDetermined, (ie
     * generally after the first call) this method will do nothing.
     * 
     * If your app is not currently in use, this method will do nothing.
     * 
     * The NSLocationWhenInUseUsageDescription key must be specified in your
     * Info.plist; otherwise, this method will do nothing, as your app will be
     * assumed not to support WhenInUse authorization.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("requestWhenInUseAuthorization")
    public native void requestWhenInUseAuthorization();

    /**
     * activityType
     * 
     * Discussion:
     * Specifies the type of user activity. Currently affects behavior such as
     * the determination of when location updates may be automatically paused.
     * By default, CLActivityTypeOther is used.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setActivityType:")
    public native void setActivityType(@NInt long value);

    /**
     * allowsBackgroundLocationUpdates
     * 
     * Discussion:
     * By default, this is NO for applications linked against iOS 9.0 or later,
     * regardless of minimum deployment target.
     * 
     * With UIBackgroundModes set to include "location" in Info.plist, you must
     * also set this property to YES at runtime whenever calling
     * -startUpdatingLocation with the intent to continue in the background.
     * 
     * Setting this property to YES when UIBackgroundModes does not include
     * "location" is a fatal error.
     * 
     * Resetting this property to NO is equivalent to omitting "location" from
     * the UIBackgroundModes value. Access to location is still permitted
     * whenever the application is running (ie not suspended), and has
     * sufficient authorization (ie it has WhenInUse authorization and is in
     * use, or it has Always authorization). However, the app will still be
     * subject to the usual task suspension rules.
     * 
     * See -requestWhenInUseAuthorization and -requestAlwaysAuthorization for
     * more details on possible authorization values.
     * 
     * API-Since: 9.0
     */
    @Generated
    @Selector("setAllowsBackgroundLocationUpdates:")
    public native void setAllowsBackgroundLocationUpdates(boolean value);

    @Generated
    @Selector("setDelegate:")
    public native void setDelegate_unsafe(@Mapped(ObjCObjectMapper.class) CLLocationManagerDelegate value);

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
     * desiredAccuracy
     * 
     * Discussion:
     * The desired location accuracy. The location service will try its best to achieve
     * your desired accuracy. However, it is not guaranteed. To optimize
     * power performance, be sure to specify an appropriate accuracy for your usage scenario (eg,
     * use a large accuracy value when only a coarse location is needed). Use kCLLocationAccuracyBest to
     * achieve the best possible accuracy. Use kCLLocationAccuracyBestForNavigation for navigation.
     * The default value varies by platform.
     */
    @Generated
    @Selector("setDesiredAccuracy:")
    public native void setDesiredAccuracy(double value);

    /**
     * distanceFilter
     * 
     * Discussion:
     * Specifies the minimum update distance in meters. Client will not be notified of movements of less
     * than the stated value, unless the accuracy has improved. Pass in kCLDistanceFilterNone to be
     * notified of all movements. By default, kCLDistanceFilterNone is used.
     */
    @Generated
    @Selector("setDistanceFilter:")
    public native void setDistanceFilter(double value);

    /**
     * headingFilter
     * 
     * Discussion:
     * Specifies the minimum amount of change in degrees needed for a heading service update. Client will not
     * be notified of updates less than the stated filter value. Pass in kCLHeadingFilterNone to be
     * notified of all updates. By default, 1 degree is used.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("setHeadingFilter:")
    public native void setHeadingFilter(double value);

    /**
     * headingOrientation
     * 
     * Discussion:
     * Specifies a physical device orientation from which heading calculation should be referenced. By default,
     * CLDeviceOrientationPortrait is used. CLDeviceOrientationUnknown, CLDeviceOrientationFaceUp, and
     * CLDeviceOrientationFaceDown are ignored.
     * 
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("setHeadingOrientation:")
    public native void setHeadingOrientation(int value);

    /**
     * pausesLocationUpdatesAutomatically
     * 
     * Discussion:
     * Specifies that location updates may automatically be paused when possible.
     * By default, this is YES for applications linked against iOS 6.0 or later.
     * 
     * API-Since: 6.0
     */
    @Generated
    @Selector("setPausesLocationUpdatesAutomatically:")
    public native void setPausesLocationUpdatesAutomatically(boolean value);

    /**
     * purpose
     * 
     * Discussion:
     * Allows the application to specify what location will be used for in their app. This
     * will be displayed along with the standard Location permissions dialogs. This property will need to be
     * set prior to calling startUpdatingLocation.
     * 
     * Deprecated. Set the purpose string in Info.plist using key NSLocationUsageDescription.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 6.0
     * Deprecated-Message: Set the purpose string in Info.plist using key NSLocationUsageDescription
     */
    @Generated
    @Deprecated
    @Selector("setPurpose:")
    public native void setPurpose(String value);

    /**
     * startMonitoringForRegion:
     * 
     * Discussion:
     * Start monitoring the specified region.
     * 
     * If a region of the same type with the same identifier is already being monitored for this application,
     * it will be removed from monitoring. For circular regions, the region monitoring service will prioritize
     * regions by their size, favoring smaller regions over larger regions.
     * 
     * This is done asynchronously and may not be immediately reflected in monitoredRegions.
     * 
     * API-Since: 5.0
     */
    @Generated
    @Selector("startMonitoringForRegion:")
    public native void startMonitoringForRegion(CLRegion region);

    /**
     * startMonitoringForRegion:desiredAccuracy:
     * 
     * Discussion:
     * Start monitoring the specified region. desiredAccuracy represents the distance past the border of the region at
     * which the application would like to be notified that the region border has been crossed. This is useful to
     * prevent
     * repeated notifications when the user is on the border of the region. This value will be honored on a best-effort
     * basis,
     * and may not be respected if desiredAccuracy is large with respect to the size of the region, or if the device is
     * not
     * capable of providing the precision desired.
     * 
     * If a region of the same type with the same identifier is already being monitored for this application, it will be
     * removed from monitoring.
     * 
     * This is done asynchronously and may not be immediately reflected in monitoredRegions.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 6.0
     */
    @Generated
    @Deprecated
    @Selector("startMonitoringForRegion:desiredAccuracy:")
    public native void startMonitoringForRegionDesiredAccuracy(CLRegion region, double accuracy);

    /**
     * startMonitoringSignificantLocationChanges
     * 
     * Discussion:
     * Start monitoring significant location changes. The behavior of this service is not affected by the
     * desiredAccuracy
     * or distanceFilter properties. Locations will be delivered through the same delegate callback as the standard
     * location service.
     * 
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("startMonitoringSignificantLocationChanges")
    public native void startMonitoringSignificantLocationChanges();

    /**
     * startMonitoringVisits
     * 
     * Discussion:
     * Begin monitoring for visits. All CLLLocationManagers allocated by your
     * application, both current and future, will deliver detected visits to
     * their delegates. This will continue until -stopMonitoringVisits is sent
     * to any such CLLocationManager, even across application relaunch events.
     * 
     * Detected visits are sent to the delegate's -locationManager:didVisit:
     * method.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("startMonitoringVisits")
    public native void startMonitoringVisits();

    /**
     * startRangingBeaconsInRegion:
     * 
     * Discussion:
     * Start calculating ranges for beacons in the specified region.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use -startRangingBeaconsSatisfyingConstraint:
     */
    @Deprecated
    @Generated
    @Selector("startRangingBeaconsInRegion:")
    public native void startRangingBeaconsInRegion(CLBeaconRegion region);

    /**
     * startUpdatingHeading
     * 
     * Discussion:
     * Start updating heading.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("startUpdatingHeading")
    public native void startUpdatingHeading();

    /**
     * startUpdatingLocation
     * 
     * Discussion:
     * Start updating locations.
     */
    @Generated
    @Selector("startUpdatingLocation")
    public native void startUpdatingLocation();

    /**
     * stopMonitoringForRegion:
     * 
     * Discussion:
     * Stop monitoring the specified region. It is valid to call stopMonitoringForRegion: for a region that was
     * registered
     * for monitoring with a different location manager object, during this or previous launches of your application.
     * 
     * This is done asynchronously and may not be immediately reflected in monitoredRegions.
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("stopMonitoringForRegion:")
    public native void stopMonitoringForRegion(CLRegion region);

    /**
     * stopMonitoringSignificantLocationChanges
     * 
     * Discussion:
     * Stop monitoring significant location changes.
     * 
     * 
     * API-Since: 4.0
     */
    @Generated
    @Selector("stopMonitoringSignificantLocationChanges")
    public native void stopMonitoringSignificantLocationChanges();

    /**
     * stopMonitoringVisits
     * 
     * Discussion:
     * Stop monitoring for visits. To resume visit monitoring, send
     * -startMonitoringVisits.
     * 
     * Note that stopping and starting are asynchronous operations and may not
     * immediately reflect in delegate callback patterns.
     * 
     * API-Since: 8.0
     */
    @Generated
    @Selector("stopMonitoringVisits")
    public native void stopMonitoringVisits();

    /**
     * stopRangingBeaconsInRegion:
     * 
     * Discussion:
     * Stop calculating ranges for the specified region.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use -stopRangingBeaconsSatisfyingConstraint:
     */
    @Deprecated
    @Generated
    @Selector("stopRangingBeaconsInRegion:")
    public native void stopRangingBeaconsInRegion(CLBeaconRegion region);

    /**
     * stopUpdatingHeading
     * 
     * Discussion:
     * Stop updating heading.
     * 
     * API-Since: 3.0
     */
    @Generated
    @Selector("stopUpdatingHeading")
    public native void stopUpdatingHeading();

    /**
     * stopUpdatingLocation
     * 
     * Discussion:
     * Stop updating locations.
     */
    @Generated
    @Selector("stopUpdatingLocation")
    public native void stopUpdatingLocation();

    /**
     * showsBackgroundLocationIndicator
     * 
     * Discussion:
     * Specifies that an indicator be shown when the app makes use of continuous
     * background location updates. Starting continuous background location
     * updates requires the app to set UIBackgroundModes to include "location"
     * and to set the property allowsBackgroundLocationUpdates to YES before
     * calling -startUpdatingLocation with the intent to continue in the
     * background.
     * 
     * Note that this property only applies to apps with Always authorization.
     * For apps with WhenInUse authorization, the indicator is always shown when
     * using continuous background location updates in order to maintain user
     * visibility and that the app is still in use.
     * 
     * The default value of this property is NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("setShowsBackgroundLocationIndicator:")
    public native void setShowsBackgroundLocationIndicator(boolean value);

    /**
     * showsBackgroundLocationIndicator
     * 
     * Discussion:
     * Specifies that an indicator be shown when the app makes use of continuous
     * background location updates. Starting continuous background location
     * updates requires the app to set UIBackgroundModes to include "location"
     * and to set the property allowsBackgroundLocationUpdates to YES before
     * calling -startUpdatingLocation with the intent to continue in the
     * background.
     * 
     * Note that this property only applies to apps with Always authorization.
     * For apps with WhenInUse authorization, the indicator is always shown when
     * using continuous background location updates in order to maintain user
     * visibility and that the app is still in use.
     * 
     * The default value of this property is NO.
     * 
     * API-Since: 11.0
     */
    @Generated
    @Selector("showsBackgroundLocationIndicator")
    public native boolean showsBackgroundLocationIndicator();

    /**
     * rangedBeaconConstraints
     * 
     * Discussion:
     * Retrieve a set of beacon constraints for which this location manager is actively providing ranging.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("rangedBeaconConstraints")
    public native NSSet<? extends CLBeaconIdentityConstraint> rangedBeaconConstraints();

    /**
     * startRangingBeaconsSatisfyingConstraint:
     * 
     * Discussion:
     * Start producing ranging measurements for beacons that satisfy
     * the provided constraint. Ranging will continue until you pass
     * an equivalent constraint to stopRangingBeaconsSatisfyingConstraint:.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("startRangingBeaconsSatisfyingConstraint:")
    public native void startRangingBeaconsSatisfyingConstraint(CLBeaconIdentityConstraint constraint);

    /**
     * stopRangingBeaconsSatisfyingConstraint:
     * 
     * Discussion:
     * Stop an earlier beacon ranging request. See startRangingBeaconsSatisfyingConstraint:.
     * 
     * API-Since: 13.0
     */
    @Generated
    @Selector("stopRangingBeaconsSatisfyingConstraint:")
    public native void stopRangingBeaconsSatisfyingConstraint(CLBeaconIdentityConstraint constraint);

    /**
     * accuracyAuthorization
     * 
     * Discussion:
     * Returns information about the calling application's access to accurate location. See the
     * documentation for CLAccuracyAuthorization for information about how to interpret the return value.
     * 
     * Note that this property should generally be interpreted in the context of the authorizationStatus
     * property. For example, if authorizationStatus == kCLAuthorizationStatusNotDetermined then accurate
     * location information cannot be received even when accuracyAuthorization is
     * CLAccuracyAuthorizationFullAccuracy.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("accuracyAuthorization")
    @NInt
    public native long accuracyAuthorization();

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status of the calling application.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("authorizationStatus")
    public native int authorizationStatus();

    /**
     * authorizedForWidgetUpdates
     * 
     * Discussion:
     * Returns true if widgets of the calling application may be eligible to receive location updates.
     * 
     * If the calling application has authorizationStatus == kCLAuthorizationStatusAuthorizedWhenInUse,
     * and authorizedForWidgetUpdates == YES, then widgets will be able to get location updates if called upon
     * to refresh within a few minutes of having been seen.
     * 
     * If the calling application has authorizationStatus == kCLAuthorizationStatusAuthorizedAlways,
     * then authorizedForWidgetUpdates will always be YES.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("isAuthorizedForWidgetUpdates")
    public native boolean isAuthorizedForWidgetUpdates();

    /**
     * requestTemporaryFullAccuracyAuthorizationWithPurposeKey:
     * 
     * Discussion:
     * This is a variant of requestTemporaryAccurateLocationAuthorizationWithPurposeKey:completion:
     * which doesn't take a completion block. This is equivalent to passing in a nil
     * completion block.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("requestTemporaryFullAccuracyAuthorizationWithPurposeKey:")
    public native void requestTemporaryFullAccuracyAuthorizationWithPurposeKey(String purposeKey);

    /**
     * requestTemporaryFullAccuracyAuthorizationWithPurposeKey:completion:
     * 
     * Discussion:
     * If your app doesn't have permission to access accurate location (see
     * -accuracyAuthorization), you can use this method to request temporary access
     * to accurate location. This access will expire automatically, but it won't expire
     * while the user is still engaged with your app. So, for example, while your app
     * is in the foreground your app will retain the temporary access it was granted.
     * Similarly, if your app starts a Continuous Background Location session with the
     * background location indicator enabled (see -showsBackgroundLocationIndicator),
     * your access to accurate location will remain as long as the background location
     * indicator remains enabled. This allows your app to provide session-oriented
     * experiences which require accurate location (e.g. fitness or navigation), even if
     * the user has decided not to grant your app persistent access to accurate location.
     * 
     * When CoreLocation prepares the prompt for display, it will look at the
     * NSLocationTemporaryUsageDescriptionDictionary key in your Info.plist. The value
     * should be a dictionary containing usage descriptions. The purposeKey you provide
     * to this method must correspond to an entry in that dictionary. To retrieve a
     * localized string, CoreLocation will load your InfoPlist.strings file and try to
     * look up a string using the purposeKey you provided. If that fails, CoreLocation
     * will use the content provided in your Info.plist. For example, suppose your
     * Info.plist contains the following.
     * 
     * <key>NSLocationTemporaryUsageDescriptionDictionary</key>
     * <dict>
     * <key>ExampleUsageDescription</key>
     * <string>This app needs accurate location so it can verify that you're in a supported region.</string>
     * <key>AnotherUsageDescription</key>
     * <string>This app needs accurate location so it can show you relevant results.</string>
     * </dict>
     * 
     * In this case, you would be able to provide either "ExampleUsageDescription" or
     * "AnotherUsageDescription" for the purposeKey argument. Passing any other string
     * would result in the prompt not being displayed. To localize these usage
     * descriptions, you would add entries for "ExampleUsageDescription" and
     * "AnotherUsageDescription" to your InfoPlist.strings file.
     * 
     * CoreLocation may decide against showing the user a prompt. For example, if your
     * app already has access to accurate location or it is currently in the background.
     * When that happens, your completion block will be called with an appropriate
     * NSError. If the user responded to the prompt, your completion block will be
     * called with a nil error. At that point, you may query the state of your
     * CLLocationManager to see if you have been granted accurate access.
     * 
     * The completion block will be called in the same threading context where delegate
     * callbacks occur. That is, it will be called on the runloop where the
     * CLLocationManager was originally initialized.
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("requestTemporaryFullAccuracyAuthorizationWithPurposeKey:completion:")
    public native void requestTemporaryFullAccuracyAuthorizationWithPurposeKeyCompletion(String purposeKey,
            @ObjCBlock(name = "call_requestTemporaryFullAccuracyAuthorizationWithPurposeKeyCompletion") Block_requestTemporaryFullAccuracyAuthorizationWithPurposeKeyCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestTemporaryFullAccuracyAuthorizationWithPurposeKeyCompletion {
        @Generated
        void call_requestTemporaryFullAccuracyAuthorizationWithPurposeKeyCompletion(NSError arg0);
    }

    /**
     * startMonitoringLocationPushes
     * 
     * Discussion:
     * Request an Apple Push Notification service token to be used to send location pushes. Incoming location pushes
     * launch the app's Location Push Service Extension. Requires the com.apple.developer.location.push entitlement.
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("startMonitoringLocationPushesWithCompletion:")
    public native void startMonitoringLocationPushesWithCompletion(
            @ObjCBlock(name = "call_startMonitoringLocationPushesWithCompletion") Block_startMonitoringLocationPushesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startMonitoringLocationPushesWithCompletion {
        @Generated
        void call_startMonitoringLocationPushesWithCompletion(NSData token, NSError arg1);
    }

    /**
     * stopMonitoringLocationPushes
     * 
     * Discussion:
     * Stop monitoring for location pushes.
     * 
     * 
     * API-Since: 15.0
     */
    @Generated
    @Selector("stopMonitoringLocationPushes")
    public native void stopMonitoringLocationPushes();
}
