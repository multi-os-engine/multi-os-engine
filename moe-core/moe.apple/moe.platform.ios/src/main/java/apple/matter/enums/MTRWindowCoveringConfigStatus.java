package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRWindowCoveringConfigStatus {
    @Generated
    private MTRWindowCoveringConfigStatus() {
    }

    /**
     * API-Since: 16.1
     */
    @Generated public static final byte Operational = 1;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte OnlineReserved = 2;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte LiftMovementReversed = 4;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte LiftPositionAware = 8;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte TiltPositionAware = 16;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte LiftEncoderControlled = 32;
    /**
     * API-Since: 16.1
     */
    @Generated public static final byte TiltEncoderControlled = 64;
}