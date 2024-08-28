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
 * [@enum] AVCaptureDevicePosition
 * 
 * Constants indicating the physical position of an AVCaptureDevice's hardware on the system.
 * 
 * [@constant] AVCaptureDevicePositionUnspecified
 * Indicates that the device's position relative to the system hardware is unspecified.
 * [@constant] AVCaptureDevicePositionBack
 * Indicates that the device is physically located on the back of the system hardware.
 * [@constant] AVCaptureDevicePositionFront
 * Indicates that the device is physically located on the front of the system hardware.
 * 
 * API-Since: 4.0
 */
@Generated
public final class AVCaptureDevicePosition {
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long Unspecified = 0x0000000000000000L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long Back = 0x0000000000000001L;
    /**
     * API-Since: 4.0
     */
    @Generated @NInt public static final long Front = 0x0000000000000002L;

    @Generated
    private AVCaptureDevicePosition() {
    }
}
