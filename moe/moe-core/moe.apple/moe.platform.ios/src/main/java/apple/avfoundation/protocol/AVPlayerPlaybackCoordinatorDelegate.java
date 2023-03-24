package apple.avfoundation.protocol;

import apple.avfoundation.AVPlayerItem;
import apple.avfoundation.AVPlayerPlaybackCoordinator;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.ann.IsOptional;
import org.moe.natj.objc.ann.ObjCProtocolName;
import org.moe.natj.objc.ann.Selector;
import apple.foundation.NSArray;
import apple.foundation.NSValue;
import org.jetbrains.annotations.NotNull;

/**
 * [@protocol] AVPlayerPlaybackCoordinatorDelegate
 * 
 * Delegate protocol for AVPlayerPlaybackCoordinator.
 * 
 * API-Since: 15.0
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerPlaybackCoordinatorDelegate")
public interface AVPlayerPlaybackCoordinatorDelegate {
    /**
     * playbackCoordinator:identifierForPlayerItem:
     * 
     * Called by the coordinator to identify AVPlayerItems played by the coordinator's AVPlayer.
     * 
     * Implementing this method allows the coordinator to establish identity of two items created from different URLs,
     * e.g., because one participant is using a local cache and the other a remote URL.
     * If the method is not implemented, the coordinator will derive the identifier from the item's asset.
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("playbackCoordinator:identifierForPlayerItem:")
    default String playbackCoordinatorIdentifierForPlayerItem(@NotNull AVPlayerPlaybackCoordinator coordinator,
            @NotNull AVPlayerItem playerItem) {
        throw new java.lang.UnsupportedOperationException();
    }

    /**
     * playbackCoordinator:interstitialTimeRangesForPlayerItem:
     * 
     * Called by the coordinator to obtain time ranges in the AVPlayerItem that do not correspond to the primary
     * content.
     * 
     * Implement this method to provide the coordinator a list of sample accurate time ranges that represent
     * interstitials in the player item.
     * The coordinator would use this along with the waiting policy for the playingInterstitial suspension to coordinate
     * playback across the group.
     * If the playingInterstitial suspension is part of AVPlaybackCoordinator.suspensionReasonsThatTriggerWaiting, then
     * the coordinator would wait for other participants to complete the interstitial before proceeding with playback.
     * And if the playingInterstitial suspension is not a part of
     * AVPlaybackCoordinator.suspensionReasonsThatTriggerWaiting then the coordinator will not wait for the participant
     * playing the interstitial.
     * Instead, that participant would jump to catch up with the rest of the group when they finish playing the
     * interstitial.
     * This delegate method is expected to return an array of NSValues with each value containing a CMTimeRange that
     * represents the interstitial.
     * If the method is not implemented, the coordinator would assume that the entire item corresponds to the primary
     * content.
     * 
     * API-Since: 15.4
     */
    @NotNull
    @Generated
    @IsOptional
    @Selector("playbackCoordinator:interstitialTimeRangesForPlayerItem:")
    default NSArray<? extends NSValue> playbackCoordinatorInterstitialTimeRangesForPlayerItem(
            @NotNull AVPlayerPlaybackCoordinator coordinator, @NotNull AVPlayerItem playerItem) {
        throw new java.lang.UnsupportedOperationException();
    }
}
