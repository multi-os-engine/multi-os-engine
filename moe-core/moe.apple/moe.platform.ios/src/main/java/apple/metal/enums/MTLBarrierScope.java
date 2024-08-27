package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Describes the types of resources that the a barrier operates on
 * 
 * API-Since: 12.0
 */
@Generated
public final class MTLBarrierScope {
    @Generated
    private MTLBarrierScope() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Buffers = 0x0000000000000001L;
    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long Textures = 0x0000000000000002L;
}