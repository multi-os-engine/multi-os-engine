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
 * -----------------------------------------------------------------------------
 * MPNowPlayingInfoCenter provides an interface for setting the current now
 * playing information for the application. This information will be displayed
 * wherever now playing information typically appears, such as the lock screen
 * and app switcher. The now playing info dictionary contains a group of
 * metadata properties for a now playing item. The list of property constants
 * is available in <MediaPlayer/MPMediaItem.h>. The properties which are
 * currently supported include:
 * <p>
 * MPMediaItemPropertyAlbumTitle
 * MPMediaItemPropertyAlbumTrackCount
 * MPMediaItemPropertyAlbumTrackNumber
 * MPMediaItemPropertyArtist
 * MPMediaItemPropertyArtwork
 * MPMediaItemPropertyComposer
 * MPMediaItemPropertyDiscCount
 * MPMediaItemPropertyDiscNumber
 * MPMediaItemPropertyGenre
 * MPMediaItemPropertyPersistentID
 * MPMediaItemPropertyPlaybackDuration
 * MPMediaItemPropertyTitle
 * <p>
 * In addition, metadata properties specific to the current playback session
 * may also be specified -- see "Additional metadata properties" below.
 */
@Generated
public final class MPNowPlayingInfoMediaType {
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    @Generated @NUInt public static final long Audio = 0x0000000000000001L;
    @Generated @NUInt public static final long Video = 0x0000000000000002L;

    @Generated
    private MPNowPlayingInfoMediaType() {
    }
}
