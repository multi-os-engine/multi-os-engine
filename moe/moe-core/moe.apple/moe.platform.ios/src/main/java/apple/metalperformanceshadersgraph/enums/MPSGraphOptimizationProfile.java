package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Optimization profile used as heuristic as graph compiler optimizes network.
 */
@Generated
public final class MPSGraphOptimizationProfile {
    @Generated
    private MPSGraphOptimizationProfile() {
    }

    /**
     * Default, graph optimized for performance.
     * 
     * API-Since: 15.4
     */
    @Generated public static final long Performance = 0x0000000000000000L;
    /**
     * Graph optimized for power efficiency.
     * 
     * API-Since: 15.4
     */
    @Generated public static final long PowerEfficiency = 0x0000000000000001L;
}