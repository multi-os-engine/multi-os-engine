package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Used by MTLIOCommandBuffer to indicate completion status.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLIOStatus {
    @Generated
    private MTLIOStatus() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Pending = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Cancelled = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Error = 0x0000000000000002L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Complete = 0x0000000000000003L;
}