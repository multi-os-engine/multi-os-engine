package apple.mlcompute.enums;

import org.moe.natj.general.ann.Generated;

/**
 * [@enum] MLCLossType
 * <p>
 * A loss function.
 */
@Generated
public final class MLCLossType {
    @Generated
    private MLCLossType() {
    }

    /**
     * The mean absolute error loss.
     */
    @Generated public static final int MeanAbsoluteError = 0x00000000;
    /**
     * The mean squared error loss.
     */
    @Generated public static final int MeanSquaredError = 0x00000001;
    /**
     * The softmax cross entropy loss.
     */
    @Generated public static final int SoftmaxCrossEntropy = 0x00000002;
    /**
     * The sigmoid cross entropy loss.
     */
    @Generated public static final int SigmoidCrossEntropy = 0x00000003;
    /**
     * The categorical cross entropy loss.
     */
    @Generated public static final int CategoricalCrossEntropy = 0x00000004;
    /**
     * The hinge loss.
     */
    @Generated public static final int Hinge = 0x00000005;
    /**
     * The Huber loss.
     */
    @Generated public static final int Huber = 0x00000006;
    /**
     * The cosine distance loss.
     */
    @Generated public static final int CosineDistance = 0x00000007;
    /**
     * The log loss.
     */
    @Generated public static final int Log = 0x00000008;
    /**
     * Holds the number of MLCLossTypes
     */
    @Generated public static final int Count = 0x00000009;
}
