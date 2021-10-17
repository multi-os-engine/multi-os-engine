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
 * [@enum] MusicSequenceFileTypeID
 * <p>
 * describes different types of files that can be parsed by a music sequence
 * [@constant]	kMusicSequenceFile_AnyType
 * let the system read iMelody files and read and write MIDI files (and any future types)
 * [@constant]	kMusicSequenceFile_MIDIType
 * read and write MIDI files
 * [@constant]	kMusicSequenceFile_iMelodyType
 * read iMelody files
 */
@Generated
public final class MusicSequenceFileTypeID {
    @Generated public static final int _AnyType = 0x00000000;
    @Generated public static final int _MIDIType = 0x6D696469;
    @Generated public static final int _iMelodyType = 0x696D656C;

    @Generated
    private MusicSequenceFileTypeID() {
    }
}
