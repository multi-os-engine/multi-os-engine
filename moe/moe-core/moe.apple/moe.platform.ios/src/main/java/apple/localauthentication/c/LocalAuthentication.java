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

package apple.localauthentication.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;
import org.jetbrains.annotations.NotNull;

@Generated
@Library("LocalAuthentication")
@Runtime(CRuntime.class)
public final class LocalAuthentication {
    static {
        NatJ.register();
    }

    @Generated
    private LocalAuthentication() {
    }

    /**
     * The maximum value for LAContext touchIDAuthenticationAllowableReuseDuration property.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    public static native double LATouchIDAuthenticationMaximumAllowableReuseDuration();

    /**
     * LocalAuthentication error domain.
     * 
     * API-Since: 8.3
     */
    @NotNull
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String LAErrorDomain();

    @Generated public static final double kLAPolicyDeviceOwnerAuthenticationWithBiometrics = 1.0;
    @Generated public static final double kLAPolicyDeviceOwnerAuthentication = 2.0;
    @Generated public static final double kLAPolicyDeviceOwnerAuthenticationWithWatch = 3.0;
    @Generated public static final double kLAPolicyDeviceOwnerAuthenticationWithBiometricsOrWatch = 4.0;
    @Generated public static final double kLAPolicyDeviceOwnerAuthenticationWithWristDetection = 5.0;
    @Generated public static final double kLACredentialTypeApplicationPassword = 0.0;
    @Generated public static final double kLACredentialSmartCardPIN = -3.0;
    @Generated public static final double kLAErrorAuthenticationFailed = -1.0;
    @Generated public static final double kLAErrorUserCancel = -2.0;
    @Generated public static final double kLAErrorUserFallback = -3.0;
    @Generated public static final double kLAErrorSystemCancel = -4.0;
    @Generated public static final double kLAErrorPasscodeNotSet = -5.0;
    @Generated public static final double kLAErrorTouchIDNotAvailable = -6.0;
    @Generated public static final double kLAErrorTouchIDNotEnrolled = -7.0;
    @Generated public static final double kLAErrorTouchIDLockout = -8.0;
    @Generated public static final double kLAErrorAppCancel = -9.0;
    @Generated public static final double kLAErrorInvalidContext = -10.0;
    @Generated public static final double kLAErrorWatchNotAvailable = -11.0;
    @Generated public static final double kLAErrorNotInteractive = -1004.0;
    @Generated public static final double kLAErrorBiometryNotPaired = -12.0;
    @Generated public static final double kLAErrorBiometryDisconnected = -13.0;
    @Generated public static final double kLAErrorInvalidDimensions = -14.0;
}
