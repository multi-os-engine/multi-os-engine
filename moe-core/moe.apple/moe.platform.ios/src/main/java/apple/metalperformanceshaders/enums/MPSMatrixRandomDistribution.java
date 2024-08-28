package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSMatrixRandomDistribution {
    @Generated
    private MPSMatrixRandomDistribution() {
    }

    /**
     * Generate random bits according to the distribution of the underlying generator.
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Default = 0x0000000000000001L;
    /**
     * Generate uniformly distributed random floating point values in the interval [0, 1).
     * 
     * API-Since: 13.0
     */
    @Generated @NUInt public static final long Uniform = 0x0000000000000002L;
    /**
     * Generate normally distributed random floating point values.
     * 
     * API-Since: 14.0
     */
    @Generated @NUInt public static final long Normal = 0x0000000000000003L;
}