package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@typedef]    MPSGraphRandomNormalSamplingMethod
 * <p>
 * Specify what sampling method to use when generating values in the normal distribution.
 * <p>
 * [@constant]   MPSGraphRandomNormalSamplingInvCDF                    Use inverse erf to convert uniform values to values in the normal distribution
 * [@constant]   MPSGraphRandomNormalSamplingBoxMuller                     Use Box Muller transform to convert uniform values to values in the normal distribution. For bounded distributions this is a rejection sampling method.
 */
@Generated
public final class MPSGraphRandomNormalSamplingMethod {
    @Generated
    private MPSGraphRandomNormalSamplingMethod() {
    }

    @Generated public static final long InvCDF = 0x0000000000000000L;
    @Generated public static final long BoxMuller = 0x0000000000000001L;
}
