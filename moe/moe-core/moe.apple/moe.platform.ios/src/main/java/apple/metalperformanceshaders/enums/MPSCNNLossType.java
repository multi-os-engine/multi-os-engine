package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSCNNLossType {
    @Generated
    private MPSCNNLossType() {
    }

    /**
     * API-Since: 11.3
     */
    @Generated public static final int MeanAbsoluteError = 0x00000000;
    /**
     * Mean Squared Error
     * 
     * API-Since: 11.3
     */
    @Generated public static final int MeanSquaredError = 0x00000001;
    /**
     * SoftMax Cross Entropy
     * 
     * API-Since: 11.3
     */
    @Generated public static final int SoftMaxCrossEntropy = 0x00000002;
    /**
     * Sigmoid Cross Entropy
     * 
     * API-Since: 11.3
     */
    @Generated public static final int SigmoidCrossEntropy = 0x00000003;
    /**
     * Categorical Cross Entropy
     * 
     * API-Since: 11.3
     */
    @Generated public static final int CategoricalCrossEntropy = 0x00000004;
    /**
     * Hinge
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Hinge = 0x00000005;
    /**
     * Huber
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Huber = 0x00000006;
    /**
     * Cosine Distance
     * 
     * API-Since: 11.3
     */
    @Generated public static final int CosineDistance = 0x00000007;
    /**
     * Log
     * 
     * API-Since: 11.3
     */
    @Generated public static final int Log = 0x00000008;
    /**
     * Kullback-Leibler Divergence
     * 
     * API-Since: 11.3
     */
    @Generated public static final int KullbackLeiblerDivergence = 0x00000009;
    /**
     * Holds the number of MPSCNNLossTypes
     */
    @Generated public static final int Count = 0x0000000A;
}