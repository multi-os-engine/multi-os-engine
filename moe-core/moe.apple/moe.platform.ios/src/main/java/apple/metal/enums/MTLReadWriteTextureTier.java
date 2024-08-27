package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLReadWriteTextureTier
 * 
 * MTLReadWriteTextureTier determines support level for read-write texture formats.
 * 
 * API-Since: 11.0
 */
@Generated
public final class MTLReadWriteTextureTier {
    @Generated
    private MTLReadWriteTextureTier() {
    }

    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long TierNone = 0x0000000000000000L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Tier1 = 0x0000000000000001L;
    /**
     * API-Since: 11.0
     */
    @Generated @NUInt public static final long Tier2 = 0x0000000000000002L;
}
