package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Used in MTLIOCommandQueueDescriptor to set the MTLIOQueue type at creation time.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLIOCommandQueueType {
    @Generated
    private MTLIOCommandQueueType() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Concurrent = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Serial = 0x0000000000000001L;
}