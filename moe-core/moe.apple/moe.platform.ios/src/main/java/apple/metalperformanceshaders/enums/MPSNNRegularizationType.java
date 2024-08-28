package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

/**
 * API-Since: 12.0
 */
@Generated
public final class MPSNNRegularizationType {
    @Generated
    private MPSNNRegularizationType() {
    }

    /**
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long None = 0x0000000000000000L;
    /**
     * Apply L1 regularization. L1 norm of weights, will be considered to be added to the loss to be minimized.
     * the gradient of the regularization loss turns to be 1 scaled with regularizationScale,
     * so we add that to the incoming gradient of value.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long L1 = 0x0000000000000001L;
    /**
     * Apply L2 regularization. L2 norm of weights, will be considered to be added to the loss to be minimized.
     * the gradient of the regularization loss turns to be the original value scaled with regularizationScale,
     * so we add that to the incoming gradient of value.
     * 
     * API-Since: 12.0
     */
    @Generated @NUInt public static final long L2 = 0x0000000000000002L;
}