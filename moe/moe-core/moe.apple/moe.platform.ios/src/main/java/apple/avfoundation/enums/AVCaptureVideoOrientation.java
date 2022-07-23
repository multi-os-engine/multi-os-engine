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
 * [@enum] AVCaptureVideoOrientation
 * <p>
 * Constants indicating video orientation, for use with AVCaptureVideoPreviewLayer (see AVCaptureVideoPreviewLayer.h)
 * and AVCaptureConnection (see below).
 * <p>
 * [@constant] AVCaptureVideoOrientationPortrait
 * Indicates that video should be oriented vertically, home button on the bottom.
 * [@constant] AVCaptureVideoOrientationPortraitUpsideDown
 * Indicates that video should be oriented vertically, home button on the top.
 * [@constant] AVCaptureVideoOrientationLandscapeRight
 * Indicates that video should be oriented horizontally, home button on the right.
 * [@constant] AVCaptureVideoOrientationLandscapeLeft
 * Indicates that video should be oriented horizontally, home button on the left.
 */
@Generated
public final class AVCaptureVideoOrientation {
    @Generated @NInt public static final long Portrait = 0x0000000000000001L;
    @Generated @NInt public static final long PortraitUpsideDown = 0x0000000000000002L;
    @Generated @NInt public static final long LandscapeRight = 0x0000000000000003L;
    @Generated @NInt public static final long LandscapeLeft = 0x0000000000000004L;

    @Generated
    private AVCaptureVideoOrientation() {
    }
}
