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

/**
 * CLAuthorizationStatus
 * 
 * Discussion:
 *     Represents the current authorization state of the application.
 */
@Generated
public final class CLAuthorizationStatus {
    /**
     * User has not yet made a choice with regards to this application
     */
    @Generated public static final int NotDetermined = 0x00000000;
    /**
     * This application is not authorized to use location services.  Due
     * to active restrictions on location services, the user cannot change
     * this status, and may not have personally denied authorization
     */
    @Generated public static final int Restricted = 0x00000001;
    /**
     * User has explicitly denied authorization for this application, or
     * location services are disabled in Settings.
     */
    @Generated public static final int Denied = 0x00000002;
    /**
     * User has granted authorization to use their location at any
     * time.  Your app may be launched into the background by
     * monitoring APIs such as visit monitoring, region monitoring,
     * and significant location change monitoring.
     * 
     * This value should be used on iOS, tvOS and watchOS.  It is available on
     * MacOS, but kCLAuthorizationStatusAuthorized is synonymous and preferred.
     */
    @Generated public static final int AuthorizedAlways = 0x00000003;
    /**
     * User has granted authorization to use their location only while
     * they are using your app.  Note: You can reflect the user's
     * continued engagement with your app using
     * -allowsBackgroundLocationUpdates.
     * 
     * This value is not available on MacOS.  It should be used on iOS, tvOS and
     * watchOS.
     */
    @Generated public static final int AuthorizedWhenInUse = 0x00000004;
    /**
     * User has authorized this application to use location services.
     * 
     * This value is deprecated or prohibited on iOS, tvOS and watchOS.
     * It should be used on MacOS.
     */
    @Generated public static final int Authorized = 0x00000003;

    @Generated
    private CLAuthorizationStatus() {
    }
}
