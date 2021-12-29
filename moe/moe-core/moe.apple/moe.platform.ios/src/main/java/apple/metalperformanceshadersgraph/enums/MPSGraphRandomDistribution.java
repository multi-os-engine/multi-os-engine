package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef]    MPSGraphRandomDistribution
 * <p>
 * The distributions supported by MPSGraphRandom ops.
 * <p>
 * [@constant]   MPSGraphRandomDistributionUniform                    The uniform distribution, with samples drawn uniformly from [min, max) for float types, and [min, max] for integer types.
 * [@constant]   MPSGraphRandomDistributionNormal                     The normal distribution defined by mean and standardDeviation.
 * [@constant]   MPSGraphRandomDistributionTruncatedNormal                     The normal distribution defined by mean and standardDeviation, truncated to the range [min, max)
 */
@Generated
public final class MPSGraphRandomDistribution {
    @Generated
    private MPSGraphRandomDistribution() {
    }

    @Generated public static final long Uniform = 0x0000000000000000L;
    @Generated public static final long Normal = 0x0000000000000001L;
    @Generated public static final long TruncatedNormal = 0x0000000000000002L;
}
