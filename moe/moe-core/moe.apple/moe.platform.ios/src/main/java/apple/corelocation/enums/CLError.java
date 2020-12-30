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

package apple.corelocation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * CLError
 * 
 * Discussion:
 *   Error returned as code to NSError from CoreLocation.
 */
@Generated
public final class CLError {
    /**
     * location is currently unknown, but CL will keep trying
     */
    @Generated @NInt public static final long LocationUnknown = 0x0000000000000000L;
    /**
     * Access to location or ranging has been denied by the user
     */
    @Generated @NInt public static final long Denied = 0x0000000000000001L;
    /**
     * general, network-related error
     */
    @Generated @NInt public static final long Network = 0x0000000000000002L;
    /**
     * heading could not be determined
     */
    @Generated @NInt public static final long HeadingFailure = 0x0000000000000003L;
    /**
     * Location region monitoring has been denied by the user
     */
    @Generated @NInt public static final long RegionMonitoringDenied = 0x0000000000000004L;
    /**
     * A registered region cannot be monitored
     */
    @Generated @NInt public static final long RegionMonitoringFailure = 0x0000000000000005L;
    /**
     * CL could not immediately initialize region monitoring
     */
    @Generated @NInt public static final long RegionMonitoringSetupDelayed = 0x0000000000000006L;
    /**
     * While events for this fence will be delivered, delivery will not occur immediately
     */
    @Generated @NInt public static final long RegionMonitoringResponseDelayed = 0x0000000000000007L;
    /**
     * A geocode request yielded no result
     */
    @Generated @NInt public static final long GeocodeFoundNoResult = 0x0000000000000008L;
    /**
     * A geocode request yielded a partial result
     */
    @Generated @NInt public static final long GeocodeFoundPartialResult = 0x0000000000000009L;
    /**
     * A geocode request was cancelled
     */
    @Generated @NInt public static final long GeocodeCanceled = 0x000000000000000AL;
    /**
     * Deferred mode failed
     */
    @Generated @NInt public static final long DeferredFailed = 0x000000000000000BL;
    /**
     * Deferred mode failed because location updates disabled or paused
     */
    @Generated @NInt public static final long DeferredNotUpdatingLocation = 0x000000000000000CL;
    /**
     * Deferred mode not supported for the requested accuracy
     */
    @Generated @NInt public static final long DeferredAccuracyTooLow = 0x000000000000000DL;
    /**
     * Deferred mode does not support distance filters
     */
    @Generated @NInt public static final long DeferredDistanceFiltered = 0x000000000000000EL;
    /**
     * Deferred mode request canceled a previous request
     */
    @Generated @NInt public static final long DeferredCanceled = 0x000000000000000FL;
    /**
     * Ranging cannot be performed
     */
    @Generated @NInt public static final long RangingUnavailable = 0x0000000000000010L;
    /**
     * General ranging failure
     */
    @Generated @NInt public static final long RangingFailure = 0x0000000000000011L;

    @Generated
    private CLError() {
    }

    /**
     * Authorization request not presented to user
     */
    @Generated @NInt public static final long PromptDeclined = 0x0000000000000012L;
}
