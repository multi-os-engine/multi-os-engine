package apple.matter.enums;

import org.moe.natj.general.ann.Generated;

/**
 * API-Since: 16.1
 */
@Generated
public final class MTRColorControlColorLoopDirection {
    @Generated
    private MTRColorControlColorLoopDirection() {
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 18.2
     * Deprecated-Message: Please use MTRColorControlColorLoopDirectionDecrement
     */
    @Deprecated @Generated public static final byte DecrementHue = 0;
    /**
     * API-Since: 16.1
     * Deprecated-Since: 18.2
     * Deprecated-Message: Please use MTRColorControlColorLoopDirectionIncrement
     */
    @Deprecated @Generated public static final byte IncrementHue = 1;
    /**
     * API-Since: 18.2
     */
    @Generated public static final byte Decrement = 0;
    /**
     * API-Since: 18.2
     */
    @Generated public static final byte Increment = 1;
}