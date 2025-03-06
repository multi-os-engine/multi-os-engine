package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 17.4
 */
@Generated
public final class CPTrafficSide {
    @Generated
    private CPTrafficSide() {
    }

    /**
     * counterclockwise for roundabouts
     * 
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long Right = 0x0000000000000000L;
    /**
     * clockwise for roundabouts
     * 
     * API-Since: 17.4
     */
    @Generated @NUInt public static final long Left = 0x0000000000000001L;
}