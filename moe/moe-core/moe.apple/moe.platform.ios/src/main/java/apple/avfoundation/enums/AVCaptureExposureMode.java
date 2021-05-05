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
 * [@enum] AVCaptureExposureMode
 * 
 *    Constants indicating the mode of the exposure on the receiver's device, if it has adjustable exposure.
 * 
 * [@constant] AVCaptureExposureModeLocked
 *    Indicates that the exposure should be locked at its current value.
 * [@constant] AVCaptureExposureModeAutoExpose
 *    Indicates that the device should automatically adjust exposure once and then change the exposure mode to AVCaptureExposureModeLocked.
 * [@constant] AVCaptureExposureModeContinuousAutoExposure
 *    Indicates that the device should automatically adjust exposure when needed.
 * [@constant] AVCaptureExposureModeCustom
 *    Indicates that the device should only adjust exposure according to user provided ISO, exposureDuration values.
 */
@Generated
public final class AVCaptureExposureMode {
    @Generated @NInt public static final long Locked = 0x0000000000000000L;
    @Generated @NInt public static final long AutoExpose = 0x0000000000000001L;
    @Generated @NInt public static final long ContinuousAutoExposure = 0x0000000000000002L;
    @Generated @NInt public static final long Custom = 0x0000000000000003L;

    @Generated
    private AVCaptureExposureMode() {
    }
}
