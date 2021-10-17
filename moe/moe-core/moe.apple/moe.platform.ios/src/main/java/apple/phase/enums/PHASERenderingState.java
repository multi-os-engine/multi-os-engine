package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASERenderingState
 * <p>
 * Rendering state for sound events.
 * [@constant] PHASERenderingStateStopped
 * The sound event is stopped.
 * [@constant] PHASERenderingStateStarted
 * The sound event is playing back.
 * [@constant] PHASERenderingStatePaused
 * The sound event is paused.
 */
@Generated
public final class PHASERenderingState {
    @Generated
    private PHASERenderingState() {
    }

    @Generated @NInt public static final long Stopped = 0x0000000000000000L;
    @Generated @NInt public static final long Started = 0x0000000000000001L;
    @Generated @NInt public static final long Paused = 0x0000000000000002L;
}
