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

/**
 * [@protocol]	AVPlayerPlaybackCoordinatorDelegate
 * <p>
 * Delegate protocol for AVPlayerPlaybackCoordinator.
 */
@Generated
@Library("AVFoundation")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("AVPlayerPlaybackCoordinatorDelegate")
public interface AVPlayerPlaybackCoordinatorDelegate {
    /**
     * playbackCoordinator:identifierForPlayerItem:
     * <p>
     * Called by the coordinator to identify AVPlayerItems played by the coordinator's AVPlayer.
     * <p>
     * Implementing this method allows the coordinator to establish identity of two items created from different URLs, e.g., because one participant is using a local cache and the other a remote URL.
     * If the method is not implemented, the coordinator will derive the identifier from the item's asset.
     */
    @Generated
    @IsOptional
    @Selector("playbackCoordinator:identifierForPlayerItem:")
    default String playbackCoordinatorIdentifierForPlayerItem(AVPlayerPlaybackCoordinator coordinator,
            AVPlayerItem playerItem) {
        throw new java.lang.UnsupportedOperationException();
    }
}
