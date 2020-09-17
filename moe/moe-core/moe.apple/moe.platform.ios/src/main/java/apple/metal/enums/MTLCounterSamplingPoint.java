package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MTLCounterSamplingPoint {
    @Generated
    private MTLCounterSamplingPoint() {
    }

    @Generated @NUInt public static final long StageBoundary = 0x0000000000000000L;
    @Generated @NUInt public static final long DrawBoundary = 0x0000000000000001L;
    @Generated @NUInt public static final long DispatchBoundary = 0x0000000000000002L;
    @Generated @NUInt public static final long TileDispatchBoundary = 0x0000000000000003L;
    @Generated @NUInt public static final long BlitBoundary = 0x0000000000000004L;
}