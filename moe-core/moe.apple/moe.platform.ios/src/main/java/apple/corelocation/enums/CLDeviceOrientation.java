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

package apple.corelocation.enums;

import org.moe.natj.general.ann.Generated;

/**
 * CLDeviceOrientation
 * 
 * Discussion:
 * Specifies a physical device orientation, equivalent to UIDeviceOrientation.
 */
@Generated
public final class CLDeviceOrientation {
    @Generated public static final int Unknown = 0x00000000;
    @Generated public static final int Portrait = 0x00000001;
    @Generated public static final int PortraitUpsideDown = 0x00000002;
    @Generated public static final int LandscapeLeft = 0x00000003;
    @Generated public static final int LandscapeRight = 0x00000004;
    @Generated public static final int FaceUp = 0x00000005;
    @Generated public static final int FaceDown = 0x00000006;

    @Generated
    private CLDeviceOrientation() {
    }
}
