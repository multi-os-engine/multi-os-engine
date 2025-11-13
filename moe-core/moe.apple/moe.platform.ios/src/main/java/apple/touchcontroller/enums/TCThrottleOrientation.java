package apple.touchcontroller.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Defines the orientation of the throttle.
 * 
 * API-Since: 26.0
 */
@Generated
public final class TCThrottleOrientation {
    @Generated
    private TCThrottleOrientation() {
    }

    /**
     * A vertical throttle.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Vertical = 0x0000000000000000L;
    /**
     * A horizontal throttle.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Horizontal = 0x0000000000000001L;
}