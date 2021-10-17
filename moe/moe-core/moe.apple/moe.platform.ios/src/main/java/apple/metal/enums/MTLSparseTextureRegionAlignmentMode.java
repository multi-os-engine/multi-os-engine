package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLSparseTextureRegionAlignmentMode
 * <p>
 * MTLSparseTextureRegionAlignmentMode determines type of alignment used when converting from pixel region to tile region.
 */
@Generated
public final class MTLSparseTextureRegionAlignmentMode {
    @Generated
    private MTLSparseTextureRegionAlignmentMode() {
    }

    @Generated @NUInt public static final long Outward = 0x0000000000000000L;
    @Generated @NUInt public static final long Inward = 0x0000000000000001L;
}
