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

package apple.eventkit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] EKAuthorizationStatus
 * 
 * This enumerated type is used to indicate the currently granted authorization status for a specific
 * entity type.
 * [@constant] EKAuthorizationStatusNotDetermined The user has not yet made a choice regarding whether this application
 * may access the service.
 * [@constant] EKAuthorizationStatusRestricted This application is not authorized to access the service.
 * The user cannot change this application’s status, possibly due to
 * active restrictions such as parental controls being in place.
 * [@constant] EKAuthorizationStatusDenied The user explicitly denied access to the service for this application.
 * 
 * [@constant] EKAuthorizationStatusWriteOnly This application is authorized to save new items.
 * [@constant] EKAuthorizationStatusFullAccess This application is authorized to read or modify all data for the
 * service.
 * [@constant] EKAuthorizationStatusAuthorized (Deprecated) This application is authorized to access the service.
 * 
 * API-Since: 6.0
 */
@Generated
public final class EKAuthorizationStatus {
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * API-Since: 6.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * API-Since: 6.0
     * Deprecated-Since: 17.0
     * Deprecated-Message: Check for full access or write only access
     */
    @Deprecated @Generated @NInt public static final long Authorized = 0x0000000000000003L;

    @Generated
    private EKAuthorizationStatus() {
    }

    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long FullAccess = 0x0000000000000003L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long WriteOnly = 0x0000000000000004L;
}
