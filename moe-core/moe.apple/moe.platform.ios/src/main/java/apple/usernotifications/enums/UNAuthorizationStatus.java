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

package apple.usernotifications.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 10.0
 */
@Generated
public final class UNAuthorizationStatus {
    /**
     * The user has not yet made a choice regarding whether the application may post user notifications.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long NotDetermined = 0x0000000000000000L;
    /**
     * The application is not authorized to post user notifications.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Denied = 0x0000000000000001L;
    /**
     * The application is authorized to post user notifications.
     * 
     * API-Since: 10.0
     */
    @Generated @NInt public static final long Authorized = 0x0000000000000002L;

    @Generated
    private UNAuthorizationStatus() {
    }

    /**
     * The application is authorized to post non-interruptive user notifications.
     * 
     * API-Since: 12.0
     */
    @Generated @NInt public static final long Provisional = 0x0000000000000003L;
    /**
     * The application is temporarily authorized to post notifications. Only available to app clips.
     * 
     * API-Since: 14.0
     */
    @Generated @NInt public static final long Ephemeral = 0x0000000000000004L;
}
