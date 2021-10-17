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

@Generated
public final class LAPolicy {
    /**
     * Device owner is going to be authenticated using a biometric method (Touch ID or Face ID).
     * <p>
     * Biometric authentication is required. If the biometry is not available, not enrolled,
     * or locked out, then the evaluation of this policy will fail with LAErrorBiometryNotAvailable,
     * LAErrorBiometryNotEnrolled or LAErrorBiometryLockout. Biometry can't be used without a passcode,
     * i.e. when biometry is available, enrolled and not locked out but passcode is not set, then
     * the evaluation will fail with LAErrorPasscodeNotSet.
     * <p>
     * Touch ID authentication dialog contains a cancel button with default title "Cancel"
     * which can be customized using localizedCancelTitle property, and a fallback button with
     * default title "Enter Password" which can be customized using localizedFallbackTitle
     * property. Fallback button is initially hidden and shows up after first unsuccessful
     * Touch ID attempt. Tapping either button causes evaluatePolicy call to fail, returning
     * a distinct error code: LAErrorUserCancel or LAErrorUserFallback.
     * <p>
     * Face ID authentication begins with animating HUD. If it succeeds at first attempt,
     * the HUD will disappear and no other UI is shown. If the first attempt fails, then
     * LocalAuthentication will show a dialog with two buttons: "Cancel" and "Try Face ID Again".
     * After second failure, the buttons are "Cancel" and "Enter Password" with the same
     * semantics as in the case of Touch ID.
     * <p>
     * Biometric authentication will get locked after 5 unsuccessful attempts. After that,
     * users have to unlock it by entering passcode. The passcode can be entered either at
     * Lock Screen or even in app by the means of LAPolicyDeviceOwnerAuthentication.
     * The Lock Screen unlock is preferred user experience because we generaly don't want users to
     * enter their passcode at app's request.
     */
    @Generated @NInt public static final long AuthenticationWithBiometrics = 0x0000000000000001L;
    /**
     * Device owner is going to be authenticated by biometry or device passcode.
     * <p>
     * Biometric or passcode authentication is required. If the biometry is available, enrolled and
     * not locked out, users are asked for it first. Otherwise they are asked to enter device
     * passcode. If passcode is not enabled, policy evaluation will fail with LAErrorPasscodeNotSet.
     * <p>
     * Biometric authentication dialog behaves similarly as the one used by
     * LAPolicyDeviceOwnerAuthenticationWithBiometrics. However, instead of "Enter Password"
     * button there is "Enter Passcode" button which, when tapped, switches the authentication
     * method and allows users to enter device passcode.
     * <p>
     * Passcode authentication will get locked after 6 unsuccessful attempts with progressively
     * increased backoff delay.
     */
    @Generated @NInt public static final long Authentication = 0x0000000000000002L;

    @Generated
    private LAPolicy() {
    }
}
