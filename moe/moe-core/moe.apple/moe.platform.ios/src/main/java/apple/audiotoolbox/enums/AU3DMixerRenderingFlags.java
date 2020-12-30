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

package apple.audiotoolbox.enums;

import org.moe.natj.general.ann.Generated;

/**
 * @enum	3D Mixer Rendering Flags
 */
@Generated
public final class AU3DMixerRenderingFlags {
    @Generated public static final int InterAuralDelay = 0x00000001;
    @Generated public static final int DopplerShift = 0x00000002;
    @Generated public static final int DistanceAttenuation = 0x00000004;
    @Generated public static final int DistanceFilter = 0x00000008;
    @Generated public static final int DistanceDiffusion = 0x00000010;
    @Generated public static final int LinearDistanceAttenuation = 0x00000020;
    @Generated public static final int ConstantReverbBlend = 0x00000040;

    @Generated
    private AU3DMixerRenderingFlags() {
    }
}
