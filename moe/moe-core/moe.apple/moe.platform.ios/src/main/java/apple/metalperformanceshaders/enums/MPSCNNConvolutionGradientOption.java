package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSCNNConvolutionGradientOption {
    @Generated
    private MPSCNNConvolutionGradientOption() {
    }

    /**
     * Only compute gradient with respect to data
     */
    @Generated @NUInt public static final long GradientWithData = 0x0000000000000001L;
    /**
     * Only compute gradient with respect to weights and bias
     */
    @Generated @NUInt public static final long GradientWithWeightsAndBias = 0x0000000000000002L;
    /**
     * Compute both gradients
     */
    @Generated @NUInt public static final long All = 0x0000000000000003L;
}