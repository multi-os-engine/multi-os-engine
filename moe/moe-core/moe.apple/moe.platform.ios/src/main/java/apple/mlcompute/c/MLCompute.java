package apple.mlcompute.c;

import org.moe.natj.c.CRuntime;
import org.moe.natj.c.ann.CFunction;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.objc.map.ObjCStringMapper;

@Generated
@Library("MLCompute")
@Runtime(CRuntime.class)
public final class MLCompute {
    static {
        NatJ.register();
    }

    @Generated
    private MLCompute() {
    }

    /**
     * Returns a textual description of the activation type, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCActivationTypeDebugDescription(int activationType);

    /**
     * Returns a textual description of the arithmetic operation, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCArithmeticOperationDebugDescription(int operation);

    /**
     * Returns a textual description of the padding policy, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCPaddingPolicyDebugDescription(int paddingPolicy);

    /**
     * Returns a textual description of the loss type, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCLossTypeDebugDescription(int lossType);

    /**
     * Returns a textual description of the reduction type, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCReductionTypeDebugDescription(int reductionType);

    /**
     * Returns a textual description of the padding type, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCPaddingTypeDebugDescription(int paddingType);

    /**
     * Returns a textual description of the convolution type, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCConvolutionTypeDebugDescription(int convolutionType);

    /**
     * Returns a textual description of the pooling type, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCPoolingTypeDebugDescription(int poolingType);

    /**
     * Returns a textual description of the softmax operation, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCSoftmaxOperationDebugDescription(int operation);

    /**
     * Returns a textual description of the sample mode, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCSampleModeDebugDescription(int mode);

    /**
     * Returns a textual description of the LSTM result mode, suitable for debugging.
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCLSTMResultModeDebugDescription(long mode);

    /**
     * Returns a textual description of the comparison operation, suitable for debugging.
     * 
     * API-Since: 14.5
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCComparisonOperationDebugDescription(int operation);

    /**
     * Returns a textual description of the gradient clipping type, suitable for debugging.
     * 
     * API-Since: 15.0
     */
    @Generated
    @CFunction
    @MappedReturn(ObjCStringMapper.class)
    public static native String MLCGradientClippingTypeDebugDescription(int gradientClippingType);
}
