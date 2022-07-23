package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLCounterSamplingPoint
 * <p>
 * MTLCounterSamplingPoint determines type of sampling points that are supported on given device.
 * <p>
 * [@constant] MTLCounterSamplingPointAtStageBoundary
 * Counter sampling points at render, compute, and blit command encoder stage boundary are supported.
 * <p>
 * [@constant] MTLCounterSamplingPointAtDrawBoundary
 * Counter sampling at draw boundary is supported, render encoder method sampleCountersInBuffer can be used for
 * sampling.
 * <p>
 * [@constant] MTLCounterSamplingPointAtDispatchBoundary
 * Counter sampling at compute dispatch boundary is supported, compute encoder method sampleCountersInBuffer can be used
 * for sampling.
 * <p>
 * [@constant] MTLCounterSamplingPointAtTileDispatchBoundary
 * Counter sampling at tile shader dispatch boundary is supported.
 * <p>
 * [@constant] MTLCounterSamplingPointAtBlitBoundary
 * Counter sampling at blit boundary is supported, blit encoder method sampleCountersInBuffer can be used for sampling.
 */
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
