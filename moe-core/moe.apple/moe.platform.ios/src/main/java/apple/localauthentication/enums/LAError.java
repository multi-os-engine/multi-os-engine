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

package apple.localauthentication.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 8.0
 */
@Generated
public final class LAError {
    /**
     * Authentication was not successful because user failed to provide valid credentials.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long AuthenticationFailed = 0xFFFFFFFFFFFFFFFFL;
    /**
     * Authentication was canceled by user (e.g. tapped Cancel button).
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserCancel = 0xFFFFFFFFFFFFFFFEL;
    /**
     * Authentication was canceled because the user tapped the fallback button (Enter Password).
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long UserFallback = 0xFFFFFFFFFFFFFFFDL;
    /**
     * Authentication was canceled by system (e.g. another application went to foreground).
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long SystemCancel = 0xFFFFFFFFFFFFFFFCL;
    /**
     * Authentication could not start because passcode is not set on the device.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long PasscodeNotSet = 0xFFFFFFFFFFFFFFFBL;
    /**
     * Authentication could not start because Touch ID is not available on the device.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: use LAErrorBiometryNotAvailable
     */
    @Deprecated @Generated @NInt public static final long TouchIDNotAvailable = 0xFFFFFFFFFFFFFFFAL;
    /**
     * Authentication could not start because Touch ID has no enrolled fingers.
     * 
     * API-Since: 8.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: use LAErrorBiometryNotEnrolled
     */
    @Deprecated @Generated @NInt public static final long TouchIDNotEnrolled = 0xFFFFFFFFFFFFFFF9L;
    /**
     * Authentication was not successful because there were too many failed Touch ID attempts and
     * Touch ID is now locked. Passcode is required to unlock Touch ID, e.g. evaluating
     * LAPolicyDeviceOwnerAuthenticationWithBiometrics will ask for passcode as a prerequisite.
     * 
     * API-Since: 9.0
     * Deprecated-Since: 11.0
     * Deprecated-Message: use LAErrorBiometryLockout
     */
    @Deprecated @Generated @NInt public static final long TouchIDLockout = 0xFFFFFFFFFFFFFFF8L;
    /**
     * Authentication was canceled by application (e.g. invalidate was called while
     * authentication was in progress).
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long AppCancel = 0xFFFFFFFFFFFFFFF7L;
    /**
     * LAContext passed to this call has been previously invalidated.
     * 
     * API-Since: 9.0
     */
    @Generated @NInt public static final long InvalidContext = 0xFFFFFFFFFFFFFFF6L;

    @Generated
    private LAError() {
    }

    /**
     * Authentication could not start because biometry is not available on the device.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long BiometryNotAvailable = 0xFFFFFFFFFFFFFFFAL;
    /**
     * Authentication could not start because biometry has no enrolled identities.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long BiometryNotEnrolled = 0xFFFFFFFFFFFFFFF9L;
    /**
     * Authentication was not successful because there were too many failed biometry attempts and
     * biometry is now locked. Passcode is required to unlock biometry, e.g. evaluating
     * LAPolicyDeviceOwnerAuthenticationWithBiometrics will ask for passcode as a prerequisite.
     * 
     * API-Since: 11.0
     */
    @Generated @NInt public static final long BiometryLockout = 0xFFFFFFFFFFFFFFF8L;
    /**
     * Authentication failed because it would require showing UI which has been forbidden
     * by using interactionNotAllowed property.
     * 
     * API-Since: 8.0
     */
    @Generated @NInt public static final long NotInteractive = 0xFFFFFFFFFFFFFC14L;
}
