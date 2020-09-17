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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaEntityPropertyPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyMediaType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyArtistPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumArtist();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyAlbumArtistPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyGenre();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyGenrePersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyComposer();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyIsCloudItem();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyHasProtectedAsset();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPodcastTitle();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPodcastPersistentID();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaLibraryDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyPersistentID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyPlaylistAttributes();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaybackIsPreparedToPlayDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerScalingModeDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackDidFinishNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackDidFinishReasonUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerPlaybackStateDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerLoadStateDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerNowPlayingMovieDidChangeNotification();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerFullscreenAnimationDurationUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerFullscreenAnimationCurveUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerIsAirPlayVideoActiveDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerReadyForDisplayDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMovieMediaTypesAvailableNotification();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailImageRequestDidFinishNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailImageKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailTimeKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerThumbnailErrorKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataUpdatedNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataUserInfoKey();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyName();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyInfo();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyMIMEType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyDataType();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMoviePlayerTimedMetadataKeyLanguageCode();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerPlaybackStateDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerNowPlayingItemDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerVolumeDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPVolumeViewWirelessRoutesAvailableDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPVolumeViewWirelessRouteActiveDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPErrorDomain();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyElapsedPlaybackTime();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyDefaultPlaybackRate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackQueueIndex();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackQueueCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyChapterNumber();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyChapterCount();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyIsLiveStream();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyAvailableLanguageOptions();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyCurrentLanguageOptions();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoCollectionIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyExternalContentIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyExternalUserProfileIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyPlaybackProgress();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyMediaType();

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

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaItemPropertyPlaybackStoreID();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMusicPlayerControllerQueueDidChangeNotification();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyServiceIdentifier();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyAssetURL();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPNowPlayingInfoPropertyCurrentPlaybackDate();

    @Generated
    @CVariable()
    @MappedReturn(ObjCStringMapper.class)
    public static native String MPMediaPlaylistPropertyCloudGlobalID();
}
