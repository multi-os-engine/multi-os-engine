package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSCNNReductionType {
    @Generated
    private MPSCNNReductionType() {
    }

    @Generated public static final int None = 0x00000000;
    /**
     * Sum
     */
    @Generated public static final int Sum = 0x00000001;
    /**
     * Mean
     */
    @Generated public static final int Mean = 0x00000002;
    /**
     * Sum divided by the number of non-zero weights
     */
    @Generated public static final int SumByNonZeroWeights = 0x00000003;
    /**
     * Holds the number of MPSCNNReductionTypes
     */
    @Generated public static final int Count = 0x00000004;
}