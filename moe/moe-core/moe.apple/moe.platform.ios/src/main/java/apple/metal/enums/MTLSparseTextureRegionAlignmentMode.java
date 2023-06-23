package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLSparseTextureRegionAlignmentMode
 * 
 * MTLSparseTextureRegionAlignmentMode determines type of alignment used when converting from pixel region to tile
 * region.
 * 
 * API-Since: 13.0
 */
@Generated
public final class MTLSparseTextureRegionAlignmentMode {
    @Generated
    private MTLSparseTextureRegionAlignmentMode() {
    }

    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Outward = 0x0000000000000000L;
    /**
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Inward = 0x0000000000000001L;
}
