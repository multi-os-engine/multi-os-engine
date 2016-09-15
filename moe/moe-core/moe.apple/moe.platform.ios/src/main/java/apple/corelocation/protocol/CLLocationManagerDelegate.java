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

@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("CLLocationManagerDelegate")
public interface CLLocationManagerDelegate {
    /**
     * locationManager:didChangeAuthorizationStatus:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didChangeAuthorizationStatus:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didChangeAuthorizationStatus:")
    default void locationManagerDidChangeAuthorizationStatus(CLLocationManager manager, int status) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didDetermineState:forRegion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didDetermineState:forRegion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didDetermineState:forRegion:")
    default void locationManagerDidDetermineStateForRegion(CLLocationManager manager, @NInt long state,
            CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didEnterRegion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didEnterRegion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didEnterRegion:")
    default void locationManagerDidEnterRegion(CLLocationManager manager, CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didExitRegion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didExitRegion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didExitRegion:")
    default void locationManagerDidExitRegion(CLLocationManager manager, CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didFailWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didFailWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didFailWithError:")
    default void locationManagerDidFailWithError(CLLocationManager manager, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didFinishDeferredUpdatesWithError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didFinishDeferredUpdatesWithError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didFinishDeferredUpdatesWithError:")
    default void locationManagerDidFinishDeferredUpdatesWithError(CLLocationManager manager, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didRangeBeacons:inRegion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didRangeBeacons:inRegion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didRangeBeacons:inRegion:")
    default void locationManagerDidRangeBeaconsInRegion(CLLocationManager manager, NSArray<? extends CLBeacon> beacons,
            CLBeaconRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didStartMonitoringForRegion:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didStartMonitoringForRegion:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didStartMonitoringForRegion:")
    default void locationManagerDidStartMonitoringForRegion(CLLocationManager manager, CLRegion region) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didUpdateHeading:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didUpdateHeading:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didUpdateHeading:")
    default void locationManagerDidUpdateHeading(CLLocationManager manager, CLHeading newHeading) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didUpdateLocations:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didUpdateLocations:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didUpdateLocations:")
    default void locationManagerDidUpdateLocations(CLLocationManager manager, NSArray<? extends CLLocation> locations) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:didUpdateToLocation:fromLocation:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didUpdateToLocation:fromLocation:">iOS Dev Center</a>
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
     * locationManager:didVisit:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:didVisit:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:didVisit:")
    default void locationManagerDidVisit(CLLocationManager manager, CLVisit visit) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:monitoringDidFailForRegion:withError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:monitoringDidFailForRegion:withError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:monitoringDidFailForRegion:withError:")
    default void locationManagerMonitoringDidFailForRegionWithError(CLLocationManager manager, CLRegion region,
            NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManager:rangingBeaconsDidFailForRegion:withError:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManager:rangingBeaconsDidFailForRegion:withError:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManager:rangingBeaconsDidFailForRegion:withError:")
    default void locationManagerRangingBeaconsDidFailForRegionWithError(CLLocationManager manager,
            CLBeaconRegion region, NSError error) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManagerDidPauseLocationUpdates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManagerDidPauseLocationUpdates:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManagerDidPauseLocationUpdates:")
    default void locationManagerDidPauseLocationUpdates(CLLocationManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManagerDidResumeLocationUpdates:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManagerDidResumeLocationUpdates:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManagerDidResumeLocationUpdates:")
    default void locationManagerDidResumeLocationUpdates(CLLocationManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * locationManagerShouldDisplayHeadingCalibration:</br>
     * Original documentation: <a href="https://developer.apple.com/library/ios/documentation/CoreLocation/Reference/CLLocationManagerDelegate_Protocol/index.html#//apple_ref/occ/intfm/CLLocationManagerDelegate/locationManagerShouldDisplayHeadingCalibration:">iOS Dev Center</a>
     */
    @Generated
    @IsOptional
    @Selector("locationManagerShouldDisplayHeadingCalibration:")
    default boolean locationManagerShouldDisplayHeadingCalibration(CLLocationManager manager) {
        throw new java.lang.UnsupportedOperationException();
    }
}
