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
 * [@enum] AudioFileFlags
 * <p>
 * These are flags that can be used with the CreateURL API call
 * [@constant] kAudioFileFlags_EraseFile
 * If set, then the CreateURL call will erase the contents of an existing file
 * If not set, then the CreateURL call will fail if the file already exists
 * [@constant] kAudioFileFlags_DontPageAlignAudioData
 * Normally, newly created and optimized files will have padding added in order to page align
 * the data to 4KB boundaries. This makes reading the data more efficient.
 * When disk space is a concern, this flag can be set so that the padding will not be added.
 */
@Generated
public final class AudioFileFlags {
    @Generated public static final int EraseFile = 0x00000001;
    @Generated public static final int DontPageAlignAudioData = 0x00000002;

    @Generated
    private AudioFileFlags() {
    }
}
