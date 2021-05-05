package apple.carplay.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class CPTripPauseReason {
    @Generated
    private CPTripPauseReason() {
    }

    @Generated @NUInt public static final long Arrived = 0x0000000000000001L;
    @Generated @NUInt public static final long Loading = 0x0000000000000002L;
    @Generated @NUInt public static final long Locating = 0x0000000000000003L;
    @Generated @NUInt public static final long Rerouting = 0x0000000000000004L;
    @Generated @NUInt public static final long ProceedToRoute = 0x0000000000000005L;
}