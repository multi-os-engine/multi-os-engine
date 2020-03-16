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

@Generated
public final class AVAudio3DMixingRenderingAlgorithm {
    @Generated @NInt public static final long EqualPowerPanning = 0x0000000000000000L;
    @Generated @NInt public static final long SphericalHead = 0x0000000000000001L;
    @Generated @NInt public static final long HRTF = 0x0000000000000002L;
    @Generated @NInt public static final long SoundField = 0x0000000000000003L;
    @Generated @NInt public static final long StereoPassThrough = 0x0000000000000005L;

    @Generated
    private AVAudio3DMixingRenderingAlgorithm() {
    }

    @Generated @NInt public static final long HRTFHQ = 0x0000000000000006L;
    @Generated @NInt public static final long Auto = 0x0000000000000007L;
}
