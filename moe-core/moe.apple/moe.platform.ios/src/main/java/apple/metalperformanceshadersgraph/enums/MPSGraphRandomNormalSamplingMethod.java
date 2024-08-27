package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * Specify what sampling method to use when generating values in the normal distribution.
 */
@Generated
public final class MPSGraphRandomNormalSamplingMethod {
    @Generated
    private MPSGraphRandomNormalSamplingMethod() {
    }

    /**
     * Use inverse erf to convert uniform values to values in the normal distribution
     * 
     * API-Since: 15.4
     */
    @Generated public static final long InvCDF = 0x0000000000000000L;
    /**
     * Use Box Muller transform to convert uniform values to values in the normal distribution. For bounded
     * distributions this is a rejection sampling method.
     * 
     * API-Since: 15.4
     */
    @Generated public static final long BoxMuller = 0x0000000000000001L;
}
