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

package apple.addressbook.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * To check the app's access to contact data. Based upon the access, the app could
 * display or hide its UI elements that would access any AddressBook API.
 * 
 * kABAuthorizationStatusNotDetermined
 * The user has not yet made a choice regarding whether this app can access the data class.
 * 
 * kABAuthorizationStatusRestricted
 * This application is not authorized to access the data class. The user cannot change
 * this application’s status, possibly due to active restrictions such as parental controls
 * being in place.
 * 
 * kABAuthorizationStatusDenied
 * The user explicitly denied access to the data class for this application.
 * 
 * kABAuthorizationStatusAuthorized
 * This application is authorized to access the data class.
 */
@Generated
public final class ABAuthorizationStatus {
    /**
     * deprecated, use CNAuthorizationStatusNotDetermined
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * deprecated, use CNAuthorizationStatusRestricted
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * deprecated, use CNAuthorizationStatusDenied
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * deprecated, use CNAuthorizationStatusAuthorized
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;

    @Generated
    private ABAuthorizationStatus() {
    }
}
