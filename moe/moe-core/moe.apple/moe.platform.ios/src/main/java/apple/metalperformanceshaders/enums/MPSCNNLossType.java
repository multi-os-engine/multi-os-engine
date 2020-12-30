package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSCNNLossType {
    @Generated
    private MPSCNNLossType() {
    }

    @Generated public static final int MeanAbsoluteError = 0x00000000;
    /**
     * Mean Squared Error
     */
    @Generated public static final int MeanSquaredError = 0x00000001;
    /**
     * SoftMax Cross Entropy
     */
    @Generated public static final int SoftMaxCrossEntropy = 0x00000002;
    /**
     * Sigmoid Cross Entropy
     */
    @Generated public static final int SigmoidCrossEntropy = 0x00000003;
    /**
     * Categorical Cross Entropy
     */
    @Generated public static final int CategoricalCrossEntropy = 0x00000004;
    /**
     * Hinge
     */
    @Generated public static final int Hinge = 0x00000005;
    /**
     * Huber
     */
    @Generated public static final int Huber = 0x00000006;
    /**
     * Cosine Distance
     */
    @Generated public static final int CosineDistance = 0x00000007;
    /**
     * Log
     */
    @Generated public static final int Log = 0x00000008;
    /**
     * Kullback-Leibler Divergence
     */
    @Generated public static final int KullbackLeiblerDivergence = 0x00000009;
    /**
     * Holds the number of MPSCNNLossTypes
     */
    @Generated public static final int Count = 0x0000000A;
}