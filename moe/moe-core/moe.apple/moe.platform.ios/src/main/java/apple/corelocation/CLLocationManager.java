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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    @Generated
    @Selector("isMonitoringAvailableForClass:")
    public static native boolean isMonitoringAvailableForClass(Class regionClass);

    @Generated
    @Selector("isRangingAvailable")
    public static native boolean isRangingAvailable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Selector("locationServicesEnabled")
    public static native boolean locationServicesEnabled_static();

    @Generated
    @Owned
    @Selector("new")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Deprecated
    @Selector("regionMonitoringAvailable")
    public static native boolean regionMonitoringAvailable();

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

    @Generated
    @Selector("activityType")
    @NInt
    public native long activityType();

    @Generated
    @Selector("allowDeferredLocationUpdatesUntilTraveled:timeout:")
    public native void allowDeferredLocationUpdatesUntilTraveledTimeout(double distance, double timeout);

    @Generated
    @Selector("allowsBackgroundLocationUpdates")
    public native boolean allowsBackgroundLocationUpdates();

    @Generated
    @Selector("delegate")
    @MappedReturn(ObjCObjectMapper.class)
    public native CLLocationManagerDelegate delegate();

    @Generated
    @Selector("desiredAccuracy")
    public native double desiredAccuracy();

    @Generated
    @Selector("disallowDeferredLocationUpdates")
    public native void disallowDeferredLocationUpdates();

    @Generated
    @Selector("dismissHeadingCalibrationDisplay")
    public native void dismissHeadingCalibrationDisplay();

    @Generated
    @Selector("distanceFilter")
    public native double distanceFilter();

    @Generated
    @Selector("heading")
    public native CLHeading heading();

    @Generated
    @Deprecated
    @Selector("headingAvailable")
    public native boolean headingAvailable();

    @Generated
    @Selector("headingFilter")
    public native double headingFilter();

    @Generated
    @Selector("headingOrientation")
    public native int headingOrientation();

    @Generated
    @Selector("init")
    public native CLLocationManager init();

    @Generated
    @Selector("location")
    public native CLLocation location();

    @Generated
    @Deprecated
    @Selector("locationServicesEnabled")
    public native boolean locationServicesEnabled();

    @Generated
    @Selector("maximumRegionMonitoringDistance")
    public native double maximumRegionMonitoringDistance();

    @Generated
    @Selector("monitoredRegions")
    public native NSSet<? extends CLRegion> monitoredRegions();

    @Generated
    @Selector("pausesLocationUpdatesAutomatically")
    public native boolean pausesLocationUpdatesAutomatically();

    @Generated
    @Deprecated
    @Selector("purpose")
    public native String purpose();

    @Generated
    @Selector("rangedRegions")
    public native NSSet<? extends CLRegion> rangedRegions();

    @Generated
    @Selector("requestAlwaysAuthorization")
    public native void requestAlwaysAuthorization();

    @Generated
    @Selector("requestLocation")
    public native void requestLocation();

    @Generated
    @Selector("requestStateForRegion:")
    public native void requestStateForRegion(CLRegion region);

    @Generated
    @Selector("requestWhenInUseAuthorization")
    public native void requestWhenInUseAuthorization();

    @Generated
    @Selector("setActivityType:")
    public native void setActivityType(@NInt long value);

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

    @Generated
    @Selector("setDesiredAccuracy:")
    public native void setDesiredAccuracy(double value);

    @Generated
    @Selector("setDistanceFilter:")
    public native void setDistanceFilter(double value);

    @Generated
    @Selector("setHeadingFilter:")
    public native void setHeadingFilter(double value);

    @Generated
    @Selector("setHeadingOrientation:")
    public native void setHeadingOrientation(int value);

    @Generated
    @Selector("setPausesLocationUpdatesAutomatically:")
    public native void setPausesLocationUpdatesAutomatically(boolean value);

    @Generated
    @Deprecated
    @Selector("setPurpose:")
    public native void setPurpose(String value);

    @Generated
    @Selector("startMonitoringForRegion:")
    public native void startMonitoringForRegion(CLRegion region);

    @Generated
    @Deprecated
    @Selector("startMonitoringForRegion:desiredAccuracy:")
    public native void startMonitoringForRegionDesiredAccuracy(CLRegion region, double accuracy);

    @Generated
    @Selector("startMonitoringSignificantLocationChanges")
    public native void startMonitoringSignificantLocationChanges();

    @Generated
    @Selector("startMonitoringVisits")
    public native void startMonitoringVisits();

    @Generated
    @Selector("startRangingBeaconsInRegion:")
    public native void startRangingBeaconsInRegion(CLBeaconRegion region);

    @Generated
    @Selector("startUpdatingHeading")
    public native void startUpdatingHeading();

    @Generated
    @Selector("startUpdatingLocation")
    public native void startUpdatingLocation();

    @Generated
    @Selector("stopMonitoringForRegion:")
    public native void stopMonitoringForRegion(CLRegion region);

    @Generated
    @Selector("stopMonitoringSignificantLocationChanges")
    public native void stopMonitoringSignificantLocationChanges();

    @Generated
    @Selector("stopMonitoringVisits")
    public native void stopMonitoringVisits();

    @Generated
    @Selector("stopRangingBeaconsInRegion:")
    public native void stopRangingBeaconsInRegion(CLBeaconRegion region);

    @Generated
    @Selector("stopUpdatingHeading")
    public native void stopUpdatingHeading();

    @Generated
    @Selector("stopUpdatingLocation")
    public native void stopUpdatingLocation();

    @Generated
    @Selector("setShowsBackgroundLocationIndicator:")
    public native void setShowsBackgroundLocationIndicator(boolean value);

    @Generated
    @Selector("showsBackgroundLocationIndicator")
    public native boolean showsBackgroundLocationIndicator();

    @Generated
    @Selector("rangedBeaconConstraints")
    public native NSSet<? extends CLBeaconIdentityConstraint> rangedBeaconConstraints();

    @Generated
    @Selector("startRangingBeaconsSatisfyingConstraint:")
    public native void startRangingBeaconsSatisfyingConstraint(CLBeaconIdentityConstraint constraint);

    @Generated
    @Selector("stopRangingBeaconsSatisfyingConstraint:")
    public native void stopRangingBeaconsSatisfyingConstraint(CLBeaconIdentityConstraint constraint);

    @Generated
    @Selector("accuracyAuthorization")
    @NInt
    public native long accuracyAuthorization();

    @Generated
    @Selector("authorizationStatus")
    public native int authorizationStatus();

    @Generated
    @Selector("isAuthorizedForWidgetUpdates")
    public native boolean isAuthorizedForWidgetUpdates();

    @Generated
    @Selector("requestTemporaryFullAccuracyAuthorizationWithPurposeKey:")
    public native void requestTemporaryFullAccuracyAuthorizationWithPurposeKey(String purposeKey);

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
}
