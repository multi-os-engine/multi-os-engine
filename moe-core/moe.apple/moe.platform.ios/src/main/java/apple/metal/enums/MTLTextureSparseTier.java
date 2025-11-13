package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Enumerates the different support levels for sparse textures.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTLTextureSparseTier {
    @Generated
    private MTLTextureSparseTier() {
    }

    /**
     * Indicates that the texture is not sparse.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long TierNone = 0x0000000000000000L;
    /**
     * Indicates support for sparse textures tier 1.
     * 
     * Tier 1 sparse textures allow the following:
     * * Partial memory backing at sparse tile granularity.
     * * Defined behavior for accessing an unbacked texture region.
     * * Shader feedback on texture access to determine memory backing.
     * 
     * An unbacked texture region indicates a region within the texture that doesn't
     * have memory backing at a given point in time. Accessing an unbacked texture
     * region produces the following results:
     * * Reading returns zero (transparent black) for pixel formats with an alpha (A) channel.
     * * Reading return zero in RGB and one in alpha (A) channels (opaque black) otherwise.
     * * Writing produces no result.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Tier1 = 0x0000000000000001L;
    /**
     * Indicates support for sparse textures tier 2.
     * 
     * In addition to the guarantees tier 1 sparse textures provide,
     * tier 2 sparse textures allow the following:
     * * Obtain per-tile activity counters.
     * 
     * API-Since: 26.0
     */
    @Generated @NInt public static final long Tier2 = 0x0000000000000002L;
}