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
 * [@enum] HKAuthorizationStatus
 * 
 * This enumerated type is used to indicate the currently granted authorization status for a specific
 * HKObjectType.
 * 
 * [@constant] HKAuthorizationStatusNotDetermined The user has not yet made a choice regarding whether this
 * application may save objects of the specified type.
 * [@constant] HKAuthorizationStatusSharingDenied This application is not allowed to save objects of the specified type.
 * [@constant] HKAuthorizationStatusSharingAuthorized This application is authorized to save objects of the specified
 * type.
 * 
 * API-Since: 8.0
 */
@Generated
public final class HKAuthorizationStatus {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SharingDenied = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SharingAuthorized = 0x0000000000000002L;

    @Generated
    private HKAuthorizationStatus() {
    }
}
