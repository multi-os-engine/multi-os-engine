package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * [@typedef] MPSGraphRNNActivation
 * 
 * Activation mode for RNN ops.
 */
@Generated
public final class MPSGraphRNNActivation {
    @Generated
    private MPSGraphRNNActivation() {
    }

    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Relu = 0x0000000000000001L;
    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Tanh = 0x0000000000000002L;
    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Sigmoid = 0x0000000000000003L;
    /**
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long HardSigmoid = 0x0000000000000004L;
}