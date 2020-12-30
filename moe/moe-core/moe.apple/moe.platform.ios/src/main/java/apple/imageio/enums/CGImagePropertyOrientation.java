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

package apple.imageio.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Possible int values for kCGImagePropertyTIFFOrientation
 */
@Generated
public final class CGImagePropertyOrientation {
    /**
     * 0th row at top,    0th column on left   - default orientation
     */
    @Generated public static final int Up = 0x00000001;
    /**
     * 0th row at top,    0th column on right  - horizontal flip
     */
    @Generated public static final int UpMirrored = 0x00000002;
    /**
     * 0th row at bottom, 0th column on right  - 180 deg rotation
     */
    @Generated public static final int Down = 0x00000003;
    /**
     * 0th row at bottom, 0th column on left   - vertical flip
     */
    @Generated public static final int DownMirrored = 0x00000004;
    /**
     * 0th row on left,   0th column at top
     */
    @Generated public static final int LeftMirrored = 0x00000005;
    /**
     * 0th row on right,  0th column at top    - 90 deg CW
     */
    @Generated public static final int Right = 0x00000006;
    /**
     * 0th row on right,  0th column on bottom
     */
    @Generated public static final int RightMirrored = 0x00000007;
    /**
     * 0th row on left,   0th column at bottom - 90 deg CCW
     */
    @Generated public static final int Left = 0x00000008;

    @Generated
    private CGImagePropertyOrientation() {
    }
}
