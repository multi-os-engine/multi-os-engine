package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates the different support levels for sparse buffers.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLBufferSparseTier {
    @Generated
    private MTLBufferSparseTier() {
    }

    /**
     * Indicates that the buffer is not sparse.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long TierNone = 0x0000000000000000L;
    /**
     * Indicates support for sparse buffers tier 1.
     * 
     * Tier 1 sparse buffers allow the following:
     * * Partial memory backing at sparse page granularity.
     * * Defined behavior for accessing an *unbacked* buffer range.
     * 
     * An unbacked buffer range indicates a range within the buffer that doesn't
     * have memory backing at a given point in time. Accessing an unbacked buffer
     * range of a sparse buffer produces the following results:
     * * Reading return zero.
     * * Writing produces no result.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Tier1 = 0x0000000000000001L;
}