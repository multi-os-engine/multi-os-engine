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
 * [@enum] AudioQueueProcessingTapFlags
 * 
 * Flags used in conjunction with processing taps
 * 
 * In the flags passed to AudioQueueProcessingTapNew, either the PreEffects
 * or PostEffects flag must be set, but not both.
 * 
 * [@constant] kAudioQueueProcessingTap_PreEffects
 * Signifies that the processing tap is inserted before any effects.
 * Passed to AudioQueueProcessingTapNew and to the callback.
 * [@constant] kAudioQueueProcessingTap_PostEffects
 * Signifies that the processing tap is inserted after any effects.
 * Passed to AudioQueueProcessingTapNew and to the callback.
 * [@constant] kAudioQueueProcessingTap_Siphon
 * Signifies that the processing tap is a siphon; it does not call
 * GetSourceAudio. The callback instead receives the source audio
 * and may not modify it. Passed to AudioQueueProcessingTapNew and to the callback.
 * [@constant] kAudioQueueProcessingTap_StartOfStream
 * Signifies that the source audio is the beginning of a continuous stream,
 * i.e. following the beginning or resumption of playback or recording.
 * Returned from GetSourceAudio.
 * [@constant] kAudioQueueProcessingTap_EndOfStream
 * Signifies that the source audio is past the end of stream. This happens when
 * the audio queue is being stopped asynchronously and has finished playing
 * all of its data. Returned from GetSourceAudio and should be propagated
 * on return from the callback.
 */
@Generated
public final class AudioQueueProcessingTapFlags {
    /**
     * 0x01
     */
    @Generated public static final int PreEffects = 0x00000001;
    /**
     * 0x02
     */
    @Generated public static final int PostEffects = 0x00000002;
    /**
     * 0x04
     */
    @Generated public static final int Siphon = 0x00000004;
    /**
     * 0x100
     */
    @Generated public static final int StartOfStream = 0x00000100;
    /**
     * 0x200
     */
    @Generated public static final int EndOfStream = 0x00000200;

    @Generated
    private AudioQueueProcessingTapFlags() {
    }
}
