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

package apple.mediaplayer.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.c.ann.CVariable;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("MediaPlayer")
@Runtime(CRuntime.class)
public final class MediaPlayer {
    static {
        NatJ.register();
    }

    @Generated
    private MediaPlayer() {
    }

    /**
     * API-Since: 2.0
     * Deprecated-Since: 11.3
     * Deprecated-Message: Use MPVolumeView to present volume controls.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void MPVolumeSettingsAlertShow();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 11.3
     * Deprecated-Message: Use MPVolumeView to present volume controls.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native void MPVolumeSettingsAlertHide();

    /**
     * API-Since: 2.0
     * Deprecated-Since: 11.3
     * Deprecated-Message: Use MPVolumeView to present volume controls.
     */
    @Deprecated
    @Generated
    @CFunction
    public static native boolean MPVolumeSettingsAlertIsVisible();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaEntityPropertyPersistentID();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPersistentID();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyMediaType();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyTitle();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumTitle();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumPersistentID();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtist();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtistPersistentID();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumArtist();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumArtistPersistentID();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyGenre();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyGenrePersistentID();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyComposer();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyComposerPersistentID();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPlaybackDuration();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumTrackNumber();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumTrackCount();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyDiscNumber();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyDiscCount();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtwork();

    /**
     * API-Since: 7.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsExplicit();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyLyrics();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsCompilation();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyReleaseDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyBeatsPerMinute();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyComments();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAssetURL();

    /**
     * filterable
     * 
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsCloudItem();

    /**
     * filterable
     * 
     * API-Since: 9.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyHasProtectedAsset();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPodcastTitle();

    /**
     * filterable
     * 
     * API-Since: 4.2
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPodcastPersistentID();

    /**
     * filterable
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPlayCount();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertySkipCount();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyRating();

    /**
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyLastPlayedDate();

    /**
     * API-Since: 4.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyUserGrouping();

    /**
     * API-Since: 6.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyBookmarkTime();

    /**
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyDateAdded();

    /**
     * Any items or playlists which were previously cached should be re-evaluated from queries when
     * MPMediaLibraryDidChangeNotification is posted.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaLibraryDidChangeNotification();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyPersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyName();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyPlaylistAttributes();

    /**
     * For playlists with attribute MPMediaPlaylistAttributeGenius, the seedItems are the MPMediaItems which were used
     * to the generate the playlist.
     * Returns nil for playlists without MPMediaPlaylistAttributeGenius set.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertySeedItems();

    /**
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyDescriptionText();

    /**
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyAuthorDisplayName();

    /**
     * Posted when the prepared state changes of an object conforming to the MPMediaPlayback protocol changes.
     * This supersedes MPMoviePlayerContentPreloadDidFinishNotification.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaybackIsPreparedToPlayDidChangeNotification();

    /**
     * Posted when the scaling mode changes.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerScalingModeDidChangeNotification();

    /**
     * Posted when movie playback ends or a user exits playback.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackDidFinishNotification();

    /**
     * NSNumber (MPMovieFinishReason)
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackDidFinishReasonUserInfoKey();

    /**
     * Posted when the playback state changes, either programatically or by the user.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackStateDidChangeNotification();

    /**
     * Posted when the network load state changes.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerLoadStateDidChangeNotification();

    /**
     * Posted when the currently playing movie changes.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerNowPlayingMovieDidChangeNotification();

    /**
     * Posted when the movie player enters or exits fullscreen mode.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerWillEnterFullscreenNotification();

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerDidEnterFullscreenNotification();

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerWillExitFullscreenNotification();

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerDidExitFullscreenNotification();

    /**
     * NSNumber of double (NSTimeInterval)
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerFullscreenAnimationDurationUserInfoKey();

    /**
     * NSNumber of NSUInteger (UIViewAnimationCurve)
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerFullscreenAnimationCurveUserInfoKey();

    /**
     * Posted when the movie player begins or ends playing video via AirPlay.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerIsAirPlayVideoActiveDidChangeNotification();

    /**
     * Posted when the ready for display state changes.
     * 
     * API-Since: 6.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerReadyForDisplayDidChangeNotification();

    /**
     * Calling -prepareToPlay on the movie player will begin determining movie properties asynchronously.
     * These notifications are posted when the associated movie property becomes available.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieMediaTypesAvailableNotification();

    /**
     * Posted if the movieSourceType is MPMovieSourceTypeUnknown when preparing for playback.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieSourceTypeAvailableNotification();

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieDurationAvailableNotification();

    /**
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieNaturalSizeAvailableNotification();

    /**
     * Posted when each thumbnail image request is completed.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailImageRequestDidFinishNotification();

    /**
     * UIImage, may be nil if an error occurred.
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailImageKey();

    /**
     * NSNumber (double)
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailTimeKey();

    /**
     * NSError
     * 
     * API-Since: 3.2
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVPlayerViewController in AVKit
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailErrorKey();

    /**
     * Posted when new timed metadata arrives.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVFoundation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataUpdatedNotification();

    /**
     * NSDictionary of the most recent MPTimedMetadata objects.
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVFoundation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataUserInfoKey();

    /**
     * NSString
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVFoundation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyName();

    /**
     * NSString
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVFoundation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyInfo();

    /**
     * NSString
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVFoundation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyMIMEType();

    /**
     * NSString
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVFoundation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyDataType();

    /**
     * NSString (ISO 639-2)
     * 
     * API-Since: 4.0
     * Deprecated-Since: 9.0
     * Deprecated-Message: Use AVFoundation.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyLanguageCode();

    /**
     * Posted when the playback state changes, either programatically or by the user.
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerPlaybackStateDidChangeNotification();

    /**
     * Posted when the currently playing media item changes.
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerNowPlayingItemDidChangeNotification();

    /**
     * Posted when the current volume changes.
     * 
     * API-Since: 3.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerVolumeDidChangeNotification();

    /**
     * Posted when the wirelessRoutesAvailable property changes.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use AVRouteDetectorMultipleRoutesDetectedDidChangeNotification instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPVolumeViewWirelessRoutesAvailableDidChangeNotification();

    /**
     * Posted when the wirelessRouteActive property changes.
     * 
     * API-Since: 7.0
     * Deprecated-Since: 13.0
     * Deprecated-Message: Use AVPlayer.externalPlaybackActive KVO instead.
     */
    @Deprecated
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPVolumeViewWirelessRouteActiveDidChangeNotification();

    /**
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPErrorDomain();

    /**
     * NSNumber (double)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyElapsedPlaybackTime();

    /**
     * NSNumber (double)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackRate();

    /**
     * NSNumber (double)
     * 
     * API-Since: 8.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyDefaultPlaybackRate();

    /**
     * NSNumber (NSUInteger)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackQueueIndex();

    /**
     * NSNumber (NSUInteger)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackQueueCount();

    /**
     * NSNumber (NSUInteger)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyChapterNumber();

    /**
     * NSNumber (NSUInteger)
     * 
     * API-Since: 5.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyChapterCount();

    /**
     * NSNumber (BOOL)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyIsLiveStream();

    /**
     * NSArrayRef of MPNowPlayingInfoLanguageOptionGroup
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyAvailableLanguageOptions();

    /**
     * NSArray of MPNowPlayingInfoLanguageOption
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyCurrentLanguageOptions();

    /**
     * NSString
     * 
     * API-Since: 9.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoCollectionIdentifier();

    /**
     * NSString
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyExternalContentIdentifier();

    /**
     * NSString
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyExternalUserProfileIdentifier();

    /**
     * NSNumber (float)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackProgress();

    /**
     * NSNumber (MPNowPlayingInfoMediaType)
     * 
     * API-Since: 10.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyMediaType();

    /**
     * Common values used to to populate MPNowPlayingInfoLanguageOption's
     * characteristics property.
     * See the AVMediaSelectionOption documentation about Media Characteristics for more details.
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicIsMainProgramContent();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicIsAuxiliaryContent();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicContainsOnlyForcedSubtitles();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicTranscribesSpokenDialog();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicDescribesMusicAndSound();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicEasyToRead();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicDescribesVideo();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicLanguageTranslation();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicDubbedTranslation();

    /**
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicVoiceOverTranslation();

    /**
     * Matches the id used by MPMusicPlayerController to enqueue store tracks
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPlaybackStoreID();

    /**
     * Posted when the queue changes
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerQueueDidChangeNotification();

    /**
     * NSString
     * 
     * API-Since: 11.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyServiceIdentifier();

    /**
     * NSURL
     * 
     * API-Since: 10.3
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyAssetURL();

    /**
     * NSDate
     * 
     * API-Since: 11.1
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyCurrentPlaybackDate();

    /**
     * filterable
     * 
     * API-Since: 9.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyCloudGlobalID();

    /**
     * API-Since: 14.5
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsPreorder();

    /**
     * NSArray of MPAdTimeRange
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyAdTimeRanges();

    /**
     * NSNumber (double)
     * 
     * API-Since: 16.0
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyCreditsStartTime();
}
