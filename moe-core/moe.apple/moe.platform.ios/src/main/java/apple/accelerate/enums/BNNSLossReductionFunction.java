package apple.accelerate.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class BNNSLossReductionFunction {
    @Generated
    private BNNSLossReductionFunction() {
    }

    /**
     * API-Since: 14.0
     */
    @Generated public static final int None = 0x00000000;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int Sum = 0x00000001;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int WeightedMean = 0x00000002;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int Mean = 0x00000003;
    /**
     * API-Since: 14.0
     */
    @Generated public static final int NonZeroWeightMean = 0x00000004;
}