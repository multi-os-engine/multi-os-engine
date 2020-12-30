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

package apple.healthkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum]      HKErrorCode
 * 
 * [@constant]  HKNoError                           No error.
 * [@constant]  HKErrorHealthDataUnavailable        HealthKit is not available on this device.
 * [@constant]  HKErrorHealthDataRestricted         HealthKit is restricted on this device.
 * [@constant]  HKErrorInvalidArgument              An invalid argument was provided to the API.
 * [@constant]  HKErrorAuthorizationDenied          The application is not authorized to perform the requested operation.
 * [@constant]  HKErrorAuthorizationNotDetermined   The user has not yet chosen whether the application is authorized to
 *                                                perform the requested operation.
 * [@constant]  HKErrorDatabaseInaccessible         Protected health data is inaccessible because the device is locked.
 * [@constant]  HKErrorUserCanceled                 The user canceled the operation.
 * [@constant]  HKErrorAnotherWorkoutSessionStarted Another workout session was started by this or another application.
 * [@constant]  HKErrorUserExitedWorkoutSession     User exited the application while a workout session was running.
 * [@constant]  HKErrorRequiredAuthorizationDenied  The user has not granted the application authorization to access
 *                                                required data types.
 * [@constant]  HKErrorNoData                       No data is available for the requested query and predicate, and so the
 *                                                query's result could not be meaningfully computed.
 */
@Generated
public final class HKErrorCode {
    @Generated @NInt public static final long NoError = 0x0000000000000000L;
    @Generated @NInt public static final long ErrorHealthDataUnavailable = 0x0000000000000001L;
    @Generated @NInt public static final long ErrorHealthDataRestricted = 0x0000000000000002L;
    @Generated @NInt public static final long ErrorInvalidArgument = 0x0000000000000003L;
    @Generated @NInt public static final long ErrorAuthorizationDenied = 0x0000000000000004L;
    @Generated @NInt public static final long ErrorAuthorizationNotDetermined = 0x0000000000000005L;
    @Generated @NInt public static final long ErrorDatabaseInaccessible = 0x0000000000000006L;
    @Generated @NInt public static final long ErrorUserCanceled = 0x0000000000000007L;
    @Generated @NInt public static final long ErrorAnotherWorkoutSessionStarted = 0x0000000000000008L;
    @Generated @NInt public static final long ErrorUserExitedWorkoutSession = 0x0000000000000009L;

    @Generated
    private HKErrorCode() {
    }

    @Generated @NInt public static final long ErrorRequiredAuthorizationDenied = 0x000000000000000AL;
    @Generated @NInt public static final long ErrorNoData = 0x000000000000000BL;
}
