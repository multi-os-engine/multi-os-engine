package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * The distributions supported by MPSGraphRandom ops.
 */
@Generated
public final class MPSGraphRandomDistribution {
    @Generated
    private MPSGraphRandomDistribution() {
    }

    /**
     * The uniform distribution, with samples drawn uniformly from [min, max) for float types, and [min, max] for
     * integer types.
     * 
     * API-Since: 15.4
     */
    @Generated public static final long Uniform = 0x0000000000000000L;
    /**
     * The normal distribution defined by mean and standardDeviation.
     * 
     * API-Since: 15.4
     */
    @Generated public static final long Normal = 0x0000000000000001L;
    /**
     * The normal distribution defined by mean and standardDeviation, truncated to the range [min, max)
     * 
     * API-Since: 15.4
     */
    @Generated public static final long TruncatedNormal = 0x0000000000000002L;
}
