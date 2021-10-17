package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@enum] MTLReadWriteTextureTier
 * <p>
 * MTLReadWriteTextureTier determines support level for read-write texture formats.
 */
@Generated
public final class MTLReadWriteTextureTier {
    @Generated
    private MTLReadWriteTextureTier() {
    }

    @Generated @NUInt public static final long TierNone = 0x0000000000000000L;
    @Generated @NUInt public static final long Tier1 = 0x0000000000000001L;
    @Generated @NUInt public static final long Tier2 = 0x0000000000000002L;
}
