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
 * [@enum] AVCaptureVideoStabilizationMode
 * 
 * Constants indicating the modes of video stabilization supported by the device's format.
 * 
 * [@constant] AVCaptureVideoStabilizationModeOff
 * Indicates that video should not be stabilized.
 * [@constant] AVCaptureVideoStabilizationModeStandard
 * Indicates that video should be stabilized using the standard video stabilization algorithm introduced with iOS 5.0.
 * Standard video stabilization has a reduced field of view. Enabling video stabilization may introduce additional
 * latency into the video capture pipeline.
 * [@constant] AVCaptureVideoStabilizationModeCinematic
 * Indicates that video should be stabilized using the cinematic stabilization algorithm for more dramatic results.
 * Cinematic video stabilization has a reduced field of view compared to standard video stabilization. Enabling
 * cinematic video stabilization introduces much more latency into the video capture pipeline than standard video
 * stabilization and consumes significantly more system memory. Use narrow or identical min and max frame durations in
 * conjunction with this mode.
 * [@constant] AVCaptureVideoStabilizationModeCinematicExtended
 * Indicates that the video should be stabilized using the extended cinematic stabilization algorithm. Enabling extended
 * cinematic stabilization introduces longer latency into the video capture pipeline compared to the
 * AVCaptureVideoStabilizationModeCinematic and consumes more memory, but yields improved stability. It is recommended
 * to use identical or similar min and max frame durations in conjunction with this mode.
 * [@constant] AVCaptureVideoStabilizationModePreviewOptimized
 * Indicates that video should be stabilized using the preview optimized stabilization algorithm. Preview stabilization
 * is a low latency and low power algorithm which is supported only on connections which either have an associated
 * preview layer or have a preview-sized VideoDataOutput.
 * [@constant] AVCaptureVideoStabilizationModeAuto
 * Indicates that the most appropriate video stabilization mode for the device and format should be chosen.
 * 
 * API-Since: 8.0
 */
@Generated
public final class AVCaptureVideoStabilizationMode {
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Off = 0x0000000000000000L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Standard = 0x0000000000000001L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Cinematic = 0x0000000000000002L;
    /**
     * API-Since: 8.0
     */
    @Generated @NInt public static final long Auto = 0xFFFFFFFFFFFFFFFFL;

    @Generated
    private AVCaptureVideoStabilizationMode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NInt public static final long CinematicExtended = 0x0000000000000003L;
    /**
     * API-Since: 17.0
     */
    @Generated @NInt public static final long PreviewOptimized = 0x0000000000000004L;
}
