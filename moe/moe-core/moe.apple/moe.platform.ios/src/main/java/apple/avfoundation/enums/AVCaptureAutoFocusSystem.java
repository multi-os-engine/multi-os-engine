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
 * [@enum] AVCaptureAutoFocusSystem
 * <p>
 * Constants indicating the autofocus system.
 * <p>
 * [@constant] AVCaptureAutoFocusSystemNone
 * Indicates that autofocus is not available.
 * [@constant] AVCaptureAutoFocusSystemContrastDetection
 * Indicates that autofocus is achieved by contrast detection. Contrast detection performs a focus scan to find the
 * optimal position.
 * [@constant] AVCaptureAutoFocusSystemPhaseDetection
 * Indicates that autofocus is achieved by phase detection. Phase detection has the ability to achieve focus in many
 * cases without a focus scan. Phase detection autofocus is typically less visually intrusive than contrast detection
 * autofocus.
 */
@Generated
public final class AVCaptureAutoFocusSystem {
    @Generated @NInt public static final long None = 0x0000000000000000L;
    @Generated @NInt public static final long ContrastDetection = 0x0000000000000001L;
    @Generated @NInt public static final long PhaseDetection = 0x0000000000000002L;

    @Generated
    private AVCaptureAutoFocusSystem() {
    }
}
