package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * The optimization profile used as a heuristic as the graph compiler optimizes the network.
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