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
 * [@enum] AVCaptureSessionInterruptionReason
 * 
 *    Constants indicating interruption reason. One of these is returned with the AVCaptureSessionWasInterruptedNotification (see AVCaptureSessionInterruptionReasonKey).
 * 
 * [@constant] AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableInBackground
 *    An interruption caused by the app being sent to the background while using a camera. Camera usage is prohibited while in the background. Beginning in iOS 9.0, AVCaptureSession no longer produces an AVCaptureSessionRuntimeErrorNotification if you attempt to start running a camera while in the background. Instead, it sends an AVCaptureSessionWasInterruptedNotification with AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableInBackground. Provided you don't explicitly call [session stopRunning], your -startRunning request is preserved, and when your app comes back to foreground, you receive AVCaptureSessionInterruptionEndedNotification and your session starts running.
 * [@constant] AVCaptureSessionInterruptionReasonAudioDeviceInUseByAnotherClient
 *    An interruption caused by the audio hardware temporarily being made unavailable, for instance, for a phone call, or alarm.
 * [@constant] AVCaptureSessionInterruptionReasonVideoDeviceInUseByAnotherClient
 *    An interruption caused by the video device temporarily being made unavailable, for instance, when stolen away by another AVCaptureSession.
 * [@constant] AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableWithMultipleForegroundApps
 *    An interruption caused when the app is running in a multi-app layout, causing resource contention and degraded recording quality of service. Given your present AVCaptureSession configuration, the session may only be run if your app occupies the full screen.
 * [@constant] AVCaptureSessionInterruptionReasonVideoDeviceNotAvailableDueToSystemPressure
 *    An interruption caused by the video device temporarily being made unavailable due to system pressure, such as thermal duress. See AVCaptureDevice's AVCaptureSystemPressure category for more information.
 */
@Generated
public final class AVCaptureSessionInterruptionReason {
    @Generated @NInt public static final long VideoDeviceNotAvailableInBackground = 0x0000000000000001L;
    @Generated @NInt public static final long AudioDeviceInUseByAnotherClient = 0x0000000000000002L;
    @Generated @NInt public static final long VideoDeviceInUseByAnotherClient = 0x0000000000000003L;
    @Generated @NInt public static final long VideoDeviceNotAvailableWithMultipleForegroundApps = 0x0000000000000004L;

    @Generated
    private AVCaptureSessionInterruptionReason() {
    }

    @Generated @NInt public static final long VideoDeviceNotAvailableDueToSystemPressure = 0x0000000000000005L;
}
