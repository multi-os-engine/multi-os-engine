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

package apple.corelocation.protocol;

import apple.corelocation.CLBeacon;
import apple.corelocation.CLBeaconIdentityConstraint;
import apple.corelocation.CLBeaconRegion;
import apple.corelocation.CLHeading;
import apple.corelocation.CLLocation;
import apple.corelocation.CLLocationManager;
import apple.corelocation.CLRegion;
import apple.corelocation.CLVisit;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;

/**
 * CLLocationManagerDelegate
 * 
 * Discussion:
 * Delegate for CLLocationManager.
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CLLocationManagerDelegate")
public interface CLLocationManagerDelegate {
    /**
     * locationManager:didChangeAuthorizationStatus:
     * 
     * Discussion:
     * Invoked when the authorization status changes for this application.
     * 
     * API-Since: 4.2
     * Deprecated-Since: 14.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("locationManager:didChangeAuthorizationStatus:")
    default void locationManagerDidChangeAuthorizationStatus(CLLocationManager manager, int status) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didDetermineState:forRegion:
     * 
     * Discussion:
     * Invoked when there's a state transition for a monitored region or in response to a request for state via a
     * a call to requestStateForRegion:.
     * 
     * API-Since: 7.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didDetermineState:forRegion:")
    default void locationManagerDidDetermineStateForRegion(CLLocationManager manager, @NInt long state,
            CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didEnterRegion:
     * 
     * Discussion:
     * Invoked when the user enters a monitored region. This callback will be invoked for every allocated
     * CLLocationManager instance with a non-nil delegate that implements this method.
     * 
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didEnterRegion:")
    default void locationManagerDidEnterRegion(CLLocationManager manager, CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didExitRegion:
     * 
     * Discussion:
     * Invoked when the user exits a monitored region. This callback will be invoked for every allocated
     * CLLocationManager instance with a non-nil delegate that implements this method.
     * 
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didExitRegion:")
    default void locationManagerDidExitRegion(CLLocationManager manager, CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didFailWithError:
     * 
     * Discussion:
     * Invoked when an error has occurred. Error types are defined in "CLError.h".
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didFailWithError:")
    default void locationManagerDidFailWithError(CLLocationManager manager, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didFinishDeferredUpdatesWithError:
     * 
     * Discussion:
     * Invoked when deferred updates will no longer be delivered. Stopping
     * location, disallowing deferred updates, and meeting a specified criterion
     * are all possible reasons for finishing deferred updates.
     * 
     * An error will be returned if deferred updates end before the specified
     * criteria are met (see CLError), otherwise error will be nil.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didFinishDeferredUpdatesWithError:")
    default void locationManagerDidFinishDeferredUpdatesWithError(CLLocationManager manager, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didRangeBeacons:inRegion:
     * 
     * Discussion:
     * Invoked when a new set of beacons are available in the specified region.
     * beacons is an array of CLBeacon objects.
     * If beacons is empty, it may be assumed no beacons that match the specified region are nearby.
     * Similarly if a specific beacon no longer appears in beacons, it may be assumed the beacon is no longer received
     * by the device.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("locationManager:didRangeBeacons:inRegion:")
    default void locationManagerDidRangeBeaconsInRegion(CLLocationManager manager, NSArray<? extends CLBeacon> beacons,
            CLBeaconRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didStartMonitoringForRegion:
     * 
     * Discussion:
     * Invoked when a monitoring for a region started successfully.
     * 
     * API-Since: 5.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didStartMonitoringForRegion:")
    default void locationManagerDidStartMonitoringForRegion(CLLocationManager manager, CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didUpdateHeading:
     * 
     * Discussion:
     * Invoked when a new heading is available.
     * 
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didUpdateHeading:")
    default void locationManagerDidUpdateHeading(CLLocationManager manager, CLHeading newHeading) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didUpdateLocations:
     * 
     * Discussion:
     * Invoked when new locations are available. Required for delivery of
     * deferred locations. If implemented, updates will
     * not be delivered to locationManager:didUpdateToLocation:fromLocation:
     * 
     * locations is an array of CLLocation objects in chronological order.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didUpdateLocations:")
    default void locationManagerDidUpdateLocations(CLLocationManager manager, NSArray<? extends CLLocation> locations) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didUpdateToLocation:fromLocation:
     * 
     * Discussion:
     * Invoked when a new location is available. oldLocation may be nil if there is no previous location
     * available.
     * 
     * This method is deprecated. If locationManager:didUpdateLocations: is
     * implemented, this method will not be called.
     * 
     * API-Since: 2.0
     * Deprecated-Since: 6.0
     * Deprecated-Message: Implement -locationManager:didUpdateLocations: instead
     */
    @Generated
    @IsOptional
    @Deprecated
    @Selector("locationManager:didUpdateToLocation:fromLocation:")
    default void locationManagerDidUpdateToLocationFromLocation(CLLocationManager manager, CLLocation newLocation,
            CLLocation oldLocation) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didVisit:
     * 
     * Discussion:
     * Invoked when the CLLocationManager determines that the device has visited
     * a location, if visit monitoring is currently started (possibly from a
     * prior launch).
     * 
     * API-Since: 8.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didVisit:")
    default void locationManagerDidVisit(CLLocationManager manager, CLVisit visit) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:monitoringDidFailForRegion:withError:
     * 
     * Discussion:
     * Invoked when a region monitoring error has occurred. Error types are defined in "CLError.h".
     * 
     * API-Since: 4.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:monitoringDidFailForRegion:withError:")
    default void locationManagerMonitoringDidFailForRegionWithError(CLLocationManager manager, CLRegion region,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:rangingBeaconsDidFailForRegion:withError:
     * 
     * Discussion:
     * Invoked when an error has occurred ranging beacons in a region. Error types are defined in "CLError.h".
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     */
    @Deprecated
    @Generated
    @IsOptional
    @Selector("locationManager:rangingBeaconsDidFailForRegion:withError:")
    default void locationManagerRangingBeaconsDidFailForRegionWithError(CLLocationManager manager,
            CLBeaconRegion region, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Discussion:
     * Invoked when location updates are automatically paused.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("locationManagerDidPauseLocationUpdates:")
    default void locationManagerDidPauseLocationUpdates(CLLocationManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * Discussion:
     * Invoked when location updates are automatically resumed.
     * 
     * In the event that your application is terminated while suspended, you will
     * not receive this notification.
     * 
     * API-Since: 6.0
     */
    @Generated
    @IsOptional
    @Selector("locationManagerDidResumeLocationUpdates:")
    default void locationManagerDidResumeLocationUpdates(CLLocationManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManagerShouldDisplayHeadingCalibration:
     * 
     * Discussion:
     * Invoked when a new heading is available. Return YES to display heading calibration info. The display
     * will remain until heading is calibrated, unless dismissed early via dismissHeadingCalibrationDisplay.
     * 
     * API-Since: 3.0
     */
    @Generated
    @IsOptional
    @Selector("locationManagerShouldDisplayHeadingCalibration:")
    default boolean locationManagerShouldDisplayHeadingCalibration(CLLocationManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didFailRangingBeaconsForConstraint:error:")
    default void locationManagerDidFailRangingBeaconsForConstraintError(CLLocationManager manager,
            CLBeaconIdentityConstraint beaconConstraint, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * API-Since: 13.0
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didRangeBeacons:satisfyingConstraint:")
    default void locationManagerDidRangeBeaconsSatisfyingConstraint(CLLocationManager manager,
            NSArray<? extends CLBeacon> beacons, CLBeaconIdentityConstraint beaconConstraint) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManagerDidChangeAuthorization:
     * 
     * Discussion:
     * Invoked when either the authorizationStatus or
     * accuracyAuthorization properties change
     * 
     * API-Since: 14.0
     */
    @Generated
    @IsOptional
    @Selector("locationManagerDidChangeAuthorization:")
    default void locationManagerDidChangeAuthorization(CLLocationManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }
}
