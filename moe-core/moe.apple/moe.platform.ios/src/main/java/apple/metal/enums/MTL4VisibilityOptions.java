package apple.metal.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * Memory consistency options for synchronization commands.
 * 
 * API-Since: 26.0
 */
@Generated
public final class MTL4VisibilityOptions {
    @Generated
    private MTL4VisibilityOptions() {
    }

    /**
     * Don't flush caches. When you use this option on a barrier, it turns it into an execution barrier.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Flushes caches to the GPU (device) memory coherence point.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long Device = 0x0000000000000001L;
    /**
     * Flushes caches to ensure that aliased virtual addresses are memory consistent.
     * 
     * On some systems this may be the GPU+CPU (system) memory coherence point
     * and on other systems it may be the GPU (device) memory coherence point.
     * 
     * API-Since: 26.0
     */
    @Generated @NUInt public static final long ResourceAlias = 0x0000000000000002L;
}