package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSCNNReductionType {
    @Generated
    private MPSCNNReductionType() {
    }

    /**
     * API-Since: 11.3
     */
    @Generated public static final int None = 0x00000000;
    /**
     * Sum
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Sum = 0x00000001;
    /**
     * Mean
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Mean = 0x00000002;
    /**
     * Sum divided by the number of non-zero weights
     * 
     * API-Since: 11.3
     */
    @Generated public static final int SumByNonZeroWeights = 0x00000003;
    /**
     * Holds the number of MPSCNNReductionTypes
     */
    @Generated public static final int Count = 0x00000004;
}