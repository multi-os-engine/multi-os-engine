package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASEPlaybackMode
 * 
 * Playback mode.
 * [@constant] PHASEPlaybackModeOneShot
 * Play the sound asset once, then stop.
 * [@constant] PHASEPlaybackModeLooping
 * Loop the sound asset indefinitely.
 */
@Generated
public final class PHASEPlaybackMode {
    @Generated
    private PHASEPlaybackMode() {
    }

    @Generated @NInt public static final long OneShot = 0x0000000000000000L;
    @Generated @NInt public static final long Looping = 0x0000000000000001L;
}
