package apple.uikit.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Begins: when at least minimumNumberOfTouches have moved enough to be considered a pan
 * Changes: when a finger moves while at least minimumNumberOfTouches are down
 * Ends: when all fingers have lifted
 * 
 * API-Since: 13.4
 */
@Generated
public final class UIScrollType {
    @Generated
    private UIScrollType() {
    }

    /**
     * Discrete scrolls originate from devices like a scroll wheel mouse
     * 
     * API-Since: 13.4
     */
    @Generated @NUInt public static final long Discrete = 0x0000000000000000L;
    /**
     * Continuous scrolls originate from devices like trackpads
     * 
     * API-Since: 13.4
     */
    @Generated @NUInt public static final long Continuous = 0x0000000000000001L;
}