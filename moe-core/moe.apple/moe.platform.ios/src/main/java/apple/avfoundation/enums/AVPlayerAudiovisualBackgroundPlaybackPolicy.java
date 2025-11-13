package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * This policy describes how AVPlayer behaves when the application transitions to UIApplicationStateBackground while
 * playing video.
 * 
 * API-Since: 15.0
 */
@Generated
public final class AVPlayerAudiovisualBackgroundPlaybackPolicy {
    @Generated
    private AVPlayerAudiovisualBackgroundPlaybackPolicy() {
    }

    /**
     * Indicates that the system is free to decide. This is the default policy.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Automatic = 0x0000000000000001L;
    /**
     * Indicates that the player must be paused on going to background.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long Pauses = 0x0000000000000002L;
    /**
     * Indicates that the player continues to play if possible in background.
     * 
     * API-Since: 15.0
     */
    @Generated @NInt public static final long ContinuesIfPossible = 0x0000000000000003L;
}
