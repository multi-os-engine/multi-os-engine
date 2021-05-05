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

    @Generated
    @CFunction
    public static native void MPVolumeSettingsAlertShow();

    @Generated
    @CFunction
    public static native void MPVolumeSettingsAlertHide();

    @Generated
    @CFunction
    public static native boolean MPVolumeSettingsAlertIsVisible();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaEntityPropertyPersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyMediaType();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumTitle();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumPersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtist();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtistPersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumArtist();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumArtistPersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyGenre();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyGenrePersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyComposer();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyComposerPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPlaybackDuration();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumTrackNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumTrackCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyDiscNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyDiscCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtwork();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsExplicit();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyLyrics();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsCompilation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyReleaseDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyBeatsPerMinute();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyComments();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAssetURL();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsCloudItem();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyHasProtectedAsset();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPodcastTitle();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPodcastPersistentID();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPlayCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertySkipCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyRating();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyLastPlayedDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyUserGrouping();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyBookmarkTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyDateAdded();

    /**
     * Any items or playlists which were previously cached should be re-evaluated from queries when MPMediaLibraryDidChangeNotification is posted.
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
     * For playlists with attribute MPMediaPlaylistAttributeGenius, the seedItems are the MPMediaItems which were used to the generate the playlist.
     * Returns nil for playlists without MPMediaPlaylistAttributeGenius set.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertySeedItems();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyDescriptionText();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyAuthorDisplayName();

    /**
     * Posted when the prepared state changes of an object conforming to the MPMediaPlayback protocol changes.
     * This supersedes MPMoviePlayerContentPreloadDidFinishNotification.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaybackIsPreparedToPlayDidChangeNotification();

    /**
     * Posted when the scaling mode changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerScalingModeDidChangeNotification();

    /**
     * Posted when movie playback ends or a user exits playback.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackDidFinishNotification();

    /**
     * NSNumber (MPMovieFinishReason)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackDidFinishReasonUserInfoKey();

    /**
     * Posted when the playback state changes, either programatically or by the user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackStateDidChangeNotification();

    /**
     * Posted when the network load state changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerLoadStateDidChangeNotification();

    /**
     * Posted when the currently playing movie changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerNowPlayingMovieDidChangeNotification();

    /**
     * Posted when the movie player enters or exits fullscreen mode.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerWillEnterFullscreenNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerDidEnterFullscreenNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerWillExitFullscreenNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerDidExitFullscreenNotification();

    /**
     * NSNumber of double (NSTimeInterval)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerFullscreenAnimationDurationUserInfoKey();

    /**
     * NSNumber of NSUInteger (UIViewAnimationCurve)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerFullscreenAnimationCurveUserInfoKey();

    /**
     * Posted when the movie player begins or ends playing video via AirPlay.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerIsAirPlayVideoActiveDidChangeNotification();

    /**
     * Posted when the ready for display state changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerReadyForDisplayDidChangeNotification();

    /**
     * Calling -prepareToPlay on the movie player will begin determining movie properties asynchronously.
     * These notifications are posted when the associated movie property becomes available.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieMediaTypesAvailableNotification();

    /**
     * Posted if the movieSourceType is MPMovieSourceTypeUnknown when preparing for playback.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieSourceTypeAvailableNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieDurationAvailableNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieNaturalSizeAvailableNotification();

    /**
     * Posted when each thumbnail image request is completed.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailImageRequestDidFinishNotification();

    /**
     * UIImage, may be nil if an error occurred.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailImageKey();

    /**
     * NSNumber (double)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailTimeKey();

    /**
     * NSError
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailErrorKey();

    /**
     * Posted when new timed metadata arrives.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataUpdatedNotification();

    /**
     * NSDictionary of the most recent MPTimedMetadata objects.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataUserInfoKey();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyName();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyInfo();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyMIMEType();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyDataType();

    /**
     * NSString (ISO 639-2)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyLanguageCode();

    /**
     * Posted when the playback state changes, either programatically or by the user.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerPlaybackStateDidChangeNotification();

    /**
     * Posted when the currently playing media item changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerNowPlayingItemDidChangeNotification();

    /**
     * Posted when the current volume changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerVolumeDidChangeNotification();

    /**
     * Posted when the wirelessRoutesAvailable property changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPVolumeViewWirelessRoutesAvailableDidChangeNotification();

    /**
     * Posted when the wirelessRouteActive property changes.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPVolumeViewWirelessRouteActiveDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPErrorDomain();

    /**
     * NSNumber (double)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyElapsedPlaybackTime();

    /**
     * NSNumber (double)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackRate();

    /**
     * NSNumber (double)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyDefaultPlaybackRate();

    /**
     * NSNumber (NSUInteger)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackQueueIndex();

    /**
     * NSNumber (NSUInteger)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackQueueCount();

    /**
     * NSNumber (NSUInteger)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyChapterNumber();

    /**
     * NSNumber (NSUInteger)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyChapterCount();

    /**
     * NSNumber (BOOL)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyIsLiveStream();

    /**
     * NSArrayRef of MPNowPlayingInfoLanguageOptionGroup
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyAvailableLanguageOptions();

    /**
     * NSArray of MPNowPlayingInfoLanguageOption
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyCurrentLanguageOptions();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoCollectionIdentifier();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyExternalContentIdentifier();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyExternalUserProfileIdentifier();

    /**
     * NSNumber (float)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackProgress();

    /**
     * NSNumber (MPNowPlayingInfoMediaType)
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyMediaType();

    /**
     * Common values used to to populate MPNowPlayingInfoLanguageOption's
     * characteristics property.
     * See the AVMediaSelectionOption documentation about Media Characteristics for more details.
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicIsMainProgramContent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicIsAuxiliaryContent();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicContainsOnlyForcedSubtitles();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicTranscribesSpokenDialog();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicDescribesMusicAndSound();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicEasyToRead();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicDescribesVideo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicLanguageTranslation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicDubbedTranslation();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPLanguageOptionCharacteristicVoiceOverTranslation();

    /**
     * Matches the id used by MPMusicPlayerController to enqueue store tracks
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPlaybackStoreID();

    /**
     * Posted when the queue changes
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerQueueDidChangeNotification();

    /**
     * NSString
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyServiceIdentifier();

    /**
     * NSURL
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyAssetURL();

    /**
     * NSDate
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyCurrentPlaybackDate();

    /**
     * filterable
     */
    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyCloudGlobalID();
}
