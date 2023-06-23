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

package apple.mediaplayer.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 3.0
 */
@Generated
public final class MPMediaType {
    /**
     * audio
     * 
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Music = 0x0000000000000001L;
    /**
     * audio
     * 
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Podcast = 0x0000000000000002L;
    /**
     * audio
     * 
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long AudioBook = 0x0000000000000004L;
    /**
     * audio
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long AudioITunesU = 0x0000000000000008L;
    /**
     * audio
     * 
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long AnyAudio = 0x00000000000000FFL;
    /**
     * video
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long Movie = 0x0000000000000100L;
    /**
     * video
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long TVShow = 0x0000000000000200L;
    /**
     * video
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long VideoPodcast = 0x0000000000000400L;
    /**
     * video
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long MusicVideo = 0x0000000000000800L;
    /**
     * video
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long VideoITunesU = 0x0000000000001000L;
    /**
     * video
     * 
     * API-Since: 7.0
     */
    @Generated @NUInt public static final long HomeVideo = 0x0000000000002000L;
    /**
     * video
     * 
     * API-Since: 5.0
     */
    @Generated @NUInt public static final long AnyVideo = 0x000000000000FF00L;
    /**
     * video
     * 
     * API-Since: 3.0
     */
    @Generated @NUInt public static final long Any = org.moe.natj.general.NatJ.is64Bit() ?
            0xFFFFFFFFFFFFFFFFL :
            0x00000000FFFFFFFFL;

    @Generated
    private MPMediaType() {
    }
}
