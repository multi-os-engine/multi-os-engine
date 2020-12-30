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
 * @enum AVCaptureWhiteBalanceMode
 * @abstract
 *    Constants indicating the mode of the white balance on the receiver's device, if it has adjustable white balance.
 * 
 * @constant AVCaptureWhiteBalanceModeLocked
 *    Indicates that the white balance should be locked at its current value.
 * @constant AVCaptureWhiteBalanceModeAutoWhiteBalance
 *    Indicates that the device should automatically adjust white balance once and then change the white balance mode to AVCaptureWhiteBalanceModeLocked.
 * @constant AVCaptureWhiteBalanceModeContinuousAutoWhiteBalance
 *    Indicates that the device should automatically adjust white balance when needed.
 */
@Generated
public final class AVCaptureWhiteBalanceMode {
    @Generated @NInt public static final long Locked = 0x0000000000000000L;
    @Generated @NInt public static final long AutoWhiteBalance = 0x0000000000000001L;
    @Generated @NInt public static final long ContinuousAutoWhiteBalance = 0x0000000000000002L;

    @Generated
    private AVCaptureWhiteBalanceMode() {
    }
}
