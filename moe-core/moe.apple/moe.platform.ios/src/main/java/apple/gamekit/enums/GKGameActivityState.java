package apple.gamekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The state of a game activity.
 * 
 * API-Since: 26.0
 */
@Generated
public final class GKGameActivityState {
    @Generated
    private GKGameActivityState() {
    }

    /**
     * The game activity is initialized but has not started.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Initialized = 0x0000000000000000L;
    /**
     * The game activity is active.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Active = 0x0000000000000001L;
    /**
     * The game activity is paused.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Paused = 0x0000000000000002L;
    /**
     * The game activity has ended. This is a terminal state.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Ended = 0x0000000000000004L;
}