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

package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] AVAuthorizationStatus
 * 
 *    Constants indicating the client's authorization to the underlying hardware supporting a media type.
 * 
 * [@constant] AVAuthorizationStatusNotDetermined
 *    Indicates that the user has not yet made a choice regarding whether the client can access the hardware.
 * [@constant] AVAuthorizationStatusRestricted
 *    The client is not authorized to access the hardware for the media type. The user cannot change the client's status, possibly due to active restrictions such as parental controls being in place.
 * [@constant] AVAuthorizationStatusDenied
 *    The user explicitly denied access to the hardware supporting a media type for the client.
 * [@constant] AVAuthorizationStatusAuthorized
 *    The client is authorized to access the hardware supporting a media type.
 */
@Generated
public final class AVAuthorizationStatus {
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;

    @Generated
    private AVAuthorizationStatus() {
    }
}
