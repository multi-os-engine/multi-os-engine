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
 * @enum MusicSequenceType
 * @abstract	A sequence type
 * @discussion Different sequence types to describe the basic mode of operation of a sequence's time line
 * 			You cannot change a music sequence's type to samples/seconds if there are tempo events
 * 			The type will also define how the sequence is saved to a MIDI file:
 * 				Beats - normal midi file
 * 				Seconds - midi file with SMPTE time
 * 				Samples - cannot be saved to a midi file
 * @constant	kMusicSequenceType_Beats
 * 				The default/normal type of a sequence.
 * 				Tempo track defines the number of beats per second and can have multiple tempo events
 * @constant	kMusicSequenceType_Seconds
 * 				A music sequence with a single 60bpm tempo event
 * @constant	kMusicSequenceType_Samples
 * 				A music sequence with a single tempo event that represents the audio sample rate
 */
@Generated
public final class MusicSequenceType {
    @Generated public static final int Beats = 0x62656174;
    @Generated public static final int Seconds = 0x73656373;
    @Generated public static final int Samples = 0x73616D70;

    @Generated
    private MusicSequenceType() {
    }
}
