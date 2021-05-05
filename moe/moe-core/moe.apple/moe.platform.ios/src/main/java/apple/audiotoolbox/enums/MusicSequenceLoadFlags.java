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
 * [@enum] MusicSequenceLoadFlags
 * 
 * Flags used to customise loading behaviour
 * 	[@constant]	kMusicSequenceLoadSMF_PreserveTracks
 * 		If this flag is set the resultant Sequence will contain:
 * 		a tempo track
 * 		a track for each track found in the SMF
 * 			This is the default behavior
 * [@constant]	kMusicSequenceLoadSMF_ChannelsToTracks
 * 		If this flag is set the resultant Sequence will contain:
 * 		a tempo track
 * 		1 track for each MIDI Channel that is found in the SMF
 * 		1 track for SysEx or MetaEvents - this will be the last track 
 * 		in the sequence after the LoadSMFWithFlags calls
 */
@Generated
public final class MusicSequenceLoadFlags {
    @Generated public static final int PreserveTracks = 0x00000000;
    @Generated public static final int ChannelsToTracks = 0x00000001;

    @Generated
    private MusicSequenceLoadFlags() {
    }
}
