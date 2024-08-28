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

package apple.contacts.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * The authorization the user has given the application to access an entity type.
 * 
 * API-Since: 9.0
 */
@Generated
public final class CNAuthorizationStatus {
    /**
     * The user has not yet made a choice regarding whether the application may access contact data.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * The application is not authorized to access contact data.
     * The user cannot change this application’s status, possibly due to active restrictions such as parental controls
     * being in place.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Restricted = 0x0000000000000001L;
    /**
     * The user explicitly denied access to contact data for the application.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000002L;
    /**
     * The application is authorized to access contact data.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000003L;

    @Generated
    private CNAuthorizationStatus() {
    }
}
