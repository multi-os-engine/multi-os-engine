package apple.phase.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * [@enum] PHASESoundEventPrepareState
 * <p>
 * Sound event prepare state
 */
@Generated
public final class PHASESoundEventPrepareState {
    @Generated
    private PHASESoundEventPrepareState() {
    }

    @Generated @NInt public static final long PrepareNotStarted = 0x0000000000000000L;
    @Generated @NInt public static final long PrepareInProgress = 0x0000000000000001L;
    @Generated @NInt public static final long Prepared = 0x0000000000000002L;
}
