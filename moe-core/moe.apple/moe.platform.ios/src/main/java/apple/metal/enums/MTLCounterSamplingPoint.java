package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLCounterSamplingPoint
 * 
 * MTLCounterSamplingPoint determines type of sampling points that are supported on given device.
 * 
 * [@constant] MTLCounterSamplingPointAtStageBoundary
 * Counter sampling points at render, compute, and blit command encoder stage boundary are supported.
 * 
 * [@constant] MTLCounterSamplingPointAtDrawBoundary
 * Counter sampling at draw boundary is supported, render encoder method sampleCountersInBuffer can be used for
 * sampling.
 * 
 * [@constant] MTLCounterSamplingPointAtDispatchBoundary
 * Counter sampling at compute dispatch boundary is supported, compute encoder method sampleCountersInBuffer can be used
 * for sampling.
 * 
 * [@constant] MTLCounterSamplingPointAtTileDispatchBoundary
 * Counter sampling at tile shader dispatch boundary is supported.
 * 
 * [@constant] MTLCounterSamplingPointAtBlitBoundary
 * Counter sampling at blit boundary is supported, blit encoder method sampleCountersInBuffer can be used for sampling.
 * 
 * API-Since: 14.0
 */
@Generated
public final class MTLCounterSamplingPoint {
    @Generated
    private MTLCounterSamplingPoint() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long StageBoundary = 0x0000000000000000L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long DrawBoundary = 0x0000000000000001L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long DispatchBoundary = 0x0000000000000002L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long TileDispatchBoundary = 0x0000000000000003L;
    /**
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long BlitBoundary = 0x0000000000000004L;
}
