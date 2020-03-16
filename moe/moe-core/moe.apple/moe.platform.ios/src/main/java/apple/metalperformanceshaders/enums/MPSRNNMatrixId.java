package apple.metalperformanceshaders.enums;

import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.NUInt;

@Generated
public final class MPSRNNMatrixId {
    @Generated
    private MPSRNNMatrixId() {
    }

    @Generated @NUInt public static final long SingleGateInputWeights = 0x0000000000000000L;
    @Generated @NUInt public static final long SingleGateRecurrentWeights = 0x0000000000000001L;
    @Generated @NUInt public static final long SingleGateBiasTerms = 0x0000000000000002L;
    @Generated @NUInt public static final long LSTMInputGateInputWeights = 0x0000000000000003L;
    @Generated @NUInt public static final long LSTMInputGateRecurrentWeights = 0x0000000000000004L;
    @Generated @NUInt public static final long LSTMInputGateMemoryWeights = 0x0000000000000005L;
    @Generated @NUInt public static final long LSTMInputGateBiasTerms = 0x0000000000000006L;
    @Generated @NUInt public static final long LSTMForgetGateInputWeights = 0x0000000000000007L;
    @Generated @NUInt public static final long LSTMForgetGateRecurrentWeights = 0x0000000000000008L;
    @Generated @NUInt public static final long LSTMForgetGateMemoryWeights = 0x0000000000000009L;
    @Generated @NUInt public static final long LSTMForgetGateBiasTerms = 0x000000000000000AL;
    @Generated @NUInt public static final long LSTMMemoryGateInputWeights = 0x000000000000000BL;
    @Generated @NUInt public static final long LSTMMemoryGateRecurrentWeights = 0x000000000000000CL;
    @Generated @NUInt public static final long LSTMMemoryGateMemoryWeights = 0x000000000000000DL;
    @Generated @NUInt public static final long LSTMMemoryGateBiasTerms = 0x000000000000000EL;
    @Generated @NUInt public static final long LSTMOutputGateInputWeights = 0x000000000000000FL;
    @Generated @NUInt public static final long LSTMOutputGateRecurrentWeights = 0x0000000000000010L;
    @Generated @NUInt public static final long LSTMOutputGateMemoryWeights = 0x0000000000000011L;
    @Generated @NUInt public static final long LSTMOutputGateBiasTerms = 0x0000000000000012L;
    @Generated @NUInt public static final long GRUInputGateInputWeights = 0x0000000000000013L;
    @Generated @NUInt public static final long GRUInputGateRecurrentWeights = 0x0000000000000014L;
    @Generated @NUInt public static final long GRUInputGateBiasTerms = 0x0000000000000015L;
    @Generated @NUInt public static final long GRURecurrentGateInputWeights = 0x0000000000000016L;
    @Generated @NUInt public static final long GRURecurrentGateRecurrentWeights = 0x0000000000000017L;
    @Generated @NUInt public static final long GRURecurrentGateBiasTerms = 0x0000000000000018L;
    @Generated @NUInt public static final long GRUOutputGateInputWeights = 0x0000000000000019L;
    @Generated @NUInt public static final long GRUOutputGateRecurrentWeights = 0x000000000000001AL;
    @Generated @NUInt public static final long GRUOutputGateInputGateWeights = 0x000000000000001BL;
    @Generated @NUInt public static final long GRUOutputGateBiasTerms = 0x000000000000001CL;
    @Generated @NUInt public static final long _count = 0x000000000000001DL;
}