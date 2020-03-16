package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;

@Generated
public final class MPSCNNLossType {
    @Generated
    private MPSCNNLossType() {
    }

    @Generated public static final int MeanAbsoluteError = 0x00000000;
    @Generated public static final int MeanSquaredError = 0x00000001;
    @Generated public static final int SoftMaxCrossEntropy = 0x00000002;
    @Generated public static final int SigmoidCrossEntropy = 0x00000003;
    @Generated public static final int CategoricalCrossEntropy = 0x00000004;
    @Generated public static final int Hinge = 0x00000005;
    @Generated public static final int Huber = 0x00000006;
    @Generated public static final int CosineDistance = 0x00000007;
    @Generated public static final int Log = 0x00000008;
    @Generated public static final int KullbackLeiblerDivergence = 0x00000009;
    @Generated public static final int Count = 0x0000000A;
}