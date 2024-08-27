package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 12.0
 */
@Generated
public final class CPTripPauseReason {
    @Generated
    private CPTripPauseReason() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Arrived = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Loading = 0x0000000000000002L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Locating = 0x0000000000000003L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Rerouting = 0x0000000000000004L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long ProceedToRoute = 0x0000000000000005L;
}