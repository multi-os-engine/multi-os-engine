package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NInt;

/**
 * Used in MTLIOCommandQueueDescriptor to set the MTLIOQueue priority at creation time.
 * 
 * API-Since: 16.0
 */
@Generated
public final class MTLIOPriority {
    @Generated
    private MTLIOPriority() {
    }

    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long High = 0x0000000000000000L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Normal = 0x0000000000000001L;
    /**
     * API-Since: 16.0
     */
    @Generated @NInt public static final long Low = 0x0000000000000002L;
}