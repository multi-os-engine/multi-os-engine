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
import org.moe.natj.general.ann.NUInt;

/**
 * @typedef AVMusicSequenceLoadOptions
 * @abstract Determines whether data on different MIDI channels is mapped to multiple tracks, or
 * 	if the tracks are preserved as-is.
 * @discussion
 * 	If AVMusicSequenceLoadSMF_ChannelsToTracks is set, the loaded MIDI Sequence will contain a
 * 	tempo track, one track for each MIDI channel that is found in the SMF, and one track for
 * 	SysEx and/or MetaEvents (this will be the last track in the sequence).
 * 
 * 	If AVMusicSequenceLoadSMF_ChannelsToTracks is not set, the loadad MIDI Sequence will
 * 	contain one track for each track that is found in the SMF, plus a tempo track (if not found
 * 	in the SMF).
 * 
 * 	API_AVAILABLE(macos(10.11), ios(9.0), watchos(2.0), tvos(9.0))
 */
@Generated
public final class AVMusicSequenceLoadOptions {
    /**
     * 0x00
     */
    @Generated @NUInt public static final long PreserveTracks = 0x0000000000000000L;
    /**
     * 0x01
     */
    @Generated @NUInt public static final long ChannelsToTracks = 0x0000000000000001L;

    @Generated
    private AVMusicSequenceLoadOptions() {
    }
}
