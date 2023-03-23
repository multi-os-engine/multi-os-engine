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

package apple.corebluetooth.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] CBPeripheralManagerAuthorizationStatus
 * 
 * Represents the current state of a CBPeripheralManager.
 * 
 * [@constant] CBPeripheralManagerAuthorizationStatusNotDetermined User has not yet made a choice with regards to this
 * application.
 * [@constant] CBPeripheralManagerAuthorizationStatusRestricted This application is not authorized to share data while
 * backgrounded. The user cannot change this application’s status, possibly due to active restrictions such as parental
 * controls being in place.
 * [@constant] CBPeripheralManagerAuthorizationStatusDenied User has explicitly denied this application from sharing
 * data while backgrounded.
 * [@constant] CBPeripheralManagerAuthorizationStatusAuthorized User has authorized this application to share data while
 * backgrounded.
 * 
 * 
 * API-Since: 7.0
 * Deprecated-Since: 13.0
 * Deprecated-Message: Use CBManagerAuthorization instead
 */
@Deprecated
@Generated
public final class CBPeripheralManagerAuthorizationStatus {
    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use CBManagerAuthorization instead
     */
    @Deprecated @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use CBManagerAuthorization instead
     */
    @Deprecated @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use CBManagerAuthorization instead
     */
    @Deprecated @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use CBManagerAuthorization instead
     */
    @Deprecated @Generated @NInt public static final long Authorized = 0x0000000000000003L;

    @Generated
    private CBPeripheralManagerAuthorizationStatus() {
    }
}
