package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Optimization levels to tradeoff compilation time for even more runtime performance by running more passes.
 */
@Generated
public final class MPSGraphOptimization {
    @Generated
    private MPSGraphOptimization() {
    }

    /**
     * Graph performs core optimizations only.
     * 
     * API-Since: 15.4
     */
    @Generated public static final long Level0 = 0x0000000000000000L;
    /**
     * Graph performs additional Optimizations, like using the placement pass to dispatch across different HW blocks
     * like the NeuralEngine and CPU along with the GPU.
     * 
     * API-Since: 15.4
     */
    @Generated public static final long Level1 = 0x0000000000000001L;
}