package apple.avfoundation.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@typedef] AVPlayerAudiovisualBackgroundPlaybackPolicy
 * <p>
 * This policy describes how AVPlayer behaves when the application transitions to UIApplicationStateBackground while playing video.
 * <p>
 * [@constant]	AVPlayerAudiovisualBackgroundPlaybackPolicyAutomatic
 * Indicates that the system is free to decide. This is the default policy.
 * <p>
 * [@constant]  AVPlayerAudiovisualBackgroundPlaybackPolicyPauses
 * Indicates that the player must be paused on going to background.
 * <p>
 * [@constant]	AVPlayerAudiovisualBackgroundPlaybackPolicyContinuesIfPossible
 * Indicates that the player continues to play if possible in background.
 */
@Generated
public final class AVPlayerAudiovisualBackgroundPlaybackPolicy {
    @Generated
    private AVPlayerAudiovisualBackgroundPlaybackPolicy() {
    }

    @Generated @NInt public static final long Automatic = 0x0000000000000001L;
    @Generated @NInt public static final long Pauses = 0x0000000000000002L;
    @Generated @NInt public static final long ContinuesIfPossible = 0x0000000000000003L;
}
