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
 * [@enum] AudioFileRegionFlags
 * 
 * These are flags for an AudioFileRegion that specify a playback direction.
 * 
 * One or multiple of these flags can be set. For example, if both kAudioFileRegionFlag_LoopEnable and
 * kAudioFileRegionFlag_PlayForward are set, then the region will play as a forward loop. If only
 * kAudioFileRegionFlag_PlayForward is set, then the region will be played forward once.
 * [@constant] kAudioFileRegionFlag_LoopEnable
 * If this flag is set, the region will be looped. One or both of the following must also be set.
 * [@constant] kAudioFileRegionFlag_PlayForward
 * If this flag is set, the region will be played forward.
 * [@constant] kAudioFileRegionFlag_PlayBackward
 * If this flag is set, the region will be played backward.
 */
@Generated
public final class AudioFileRegionFlags {
    @Generated public static final int LoopEnable = 0x00000001;
    @Generated public static final int PlayForward = 0x00000002;
    @Generated public static final int PlayBackward = 0x00000004;

    @Generated
    private AudioFileRegionFlags() {
    }
}
