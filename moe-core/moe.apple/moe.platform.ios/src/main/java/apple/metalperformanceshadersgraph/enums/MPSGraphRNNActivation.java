package apple.metalperformanceshadersgraph.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * The activation modes for RNN operations.
 */
@Generated
public final class MPSGraphRNNActivation {
    @Generated
    private MPSGraphRNNActivation() {
    }

    /**
     * Defines a pass through activation.
     * 
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Defines a ReLU activation.
     * 
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Relu = 0x0000000000000001L;
    /**
     * Defines a Tanh activation.
     * 
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Tanh = 0x0000000000000002L;
    /**
     * Defines a Sigmoid activation.
     * 
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long Sigmoid = 0x0000000000000003L;
    /**
     * Defines a Hard sigmoid activation.
     * 
     * API-Since: 15.4
     */
    @Generated @NUInt public static final long HardSigmoid = 0x0000000000000004L;
}