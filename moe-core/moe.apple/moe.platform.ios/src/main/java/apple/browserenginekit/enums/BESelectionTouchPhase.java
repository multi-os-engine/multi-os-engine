package apple.browserenginekit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * API-Since: 17.4
 */
@Generated
public final class BESelectionTouchPhase {
    @Generated
    private BESelectionTouchPhase() {
    }

    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Started = 0x0000000000000000L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Moved = 0x0000000000000001L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long Ended = 0x0000000000000002L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long EndedMovingForward = 0x0000000000000003L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long EndedMovingBackward = 0x0000000000000004L;
    /**
     * API-Since: 17.4
     */
    @Generated @NInt public static final long EndedNotMoving = 0x0000000000000005L;
}