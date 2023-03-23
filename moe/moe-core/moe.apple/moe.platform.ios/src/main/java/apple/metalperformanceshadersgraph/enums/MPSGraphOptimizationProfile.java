package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef] MPSGraphOptimizationProfile
 * 
 * Optimization profile used as heuristic as graph compiler optimizes network
 * 
 * [@constant] MPSGraphOptimizationProfilePerformance Default, optimize for performance
 * [@constant] MPSGraphOptimizationProfilePowerEfficiency optimize for power efficiency
 */
@Generated
public final class MPSGraphOptimizationProfile {
    @Generated
    private MPSGraphOptimizationProfile() {
    }

    /**
     * API-Since: 15.4
     */
    @Generated public static final long Performance = 0x0000000000000000L;
    /**
     * API-Since: 15.4
     */
    @Generated public static final long PowerEfficiency = 0x0000000000000001L;
}