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
 * [@enum]		AudioPanningMode
 * 
 * Different panning algorithms.
 * [@constant]   kPanningMode_SoundField
 * 	Sound field panning algorithm
 * [@constant]   kPanningMode_VectorBasedPanning
 * 	Vector based panning algorithm
 */
@Generated
public final class AudioPanningMode {
    @Generated public static final int SoundField = 0x00000003;
    @Generated public static final int VectorBasedPanning = 0x00000004;

    @Generated
    private AudioPanningMode() {
    }
}
