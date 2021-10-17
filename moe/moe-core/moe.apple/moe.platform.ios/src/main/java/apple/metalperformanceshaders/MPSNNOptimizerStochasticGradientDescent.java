package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSNNOptimizerStochasticGradientDescent
 * <p>
 * The MPSNNOptimizerStochasticGradientDescent performs a gradient descent with an optional momentum Update
 * RMSProp is also known as root mean square propagation.
 * <p>
 * useNesterov == NO:
 * m[t]     = momentumScale * m[t-1] + learningRate * g
 * variable = variable - m[t]
 * <p>
 * useNesterov == YES:
 * m[t]     = momentumScale * m[t-1] + g
 * variable = variable - (learningRate * (g + m[t] * momentumScale))
 * <p>
 * <p>
 * where,
 * g    is gradient of error wrt variable
 * m[t] is momentum of gradients it is a state we keep updating every update iteration
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNOptimizerStochasticGradientDescent extends MPSNNOptimizer {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNOptimizerStochasticGradientDescent(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNOptimizerStochasticGradientDescent alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNOptimizerStochasticGradientDescent allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Encode an MPSNNOptimizerStochasticGradientDescent object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * <p>
     * useNesterov == NO:
     * m[t]     = momentumScale * m[t-1] + learningRate * g
     * variable = variable - m[t]
     * <p>
     * useNesterov == YES:
     * m[t]     = momentumScale * m[t-1] + g
     * variable = variable - (learningRate * (g + m[t] * momentumScale))
     * <p>
     * inputMomentumVector == nil
     * variable = variable - (learningRate * g)
     * <p>
     * where,
     * g    is gradient of error wrt variable
     * m[t] is momentum of gradients it is a state we keep updating every update iteration
     *
     * @param commandBuffer                   A valid MTLCommandBuffer to receive the encoded kernel.
     * @param batchNormalizationGradientState A valid MPSCNNBatchNormalizationState object which specifies the input state with gradients for this update.
     * @param batchNormalizationSourceState   A valid MPSCNNBatchNormalizationState object which specifies the input state with original gamma/beta for this update.
     * @param inputMomentumVectors            An array MPSVector object which specifies the gradient momentum vectors which will
     *                                        be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds to beta, array can be of
     *                                        size 1 in which case beta won't be updated
     * @param resultState                     A valid MPSCNNNormalizationGammaAndBetaState object which specifies the resultValues state which will
     *                                        be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputMomentumVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationGradientStateBatchNormalizationSourceStateInputMomentumVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationGradientState,
            MPSCNNBatchNormalizationState batchNormalizationSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * Encode an MPSNNOptimizerStochasticGradientDescent object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * <p>
     * useNesterov == NO:
     * m[t]     = momentumScale * m[t-1] + learningRate * g
     * variable = variable - m[t]
     * <p>
     * useNesterov == YES:
     * m[t]     = momentumScale * m[t-1] + g
     * variable = variable - (learningRate * (g + m[t] * momentumScale))
     * <p>
     * inputMomentumVector == nil
     * variable = variable - (learningRate * g)
     * <p>
     * where,
     * g    is gradient of error wrt variable
     * m[t] is momentum of gradients it is a state we keep updating every update iteration
     *
     * @param commandBuffer           A valid MTLCommandBuffer to receive the encoded kernel.
     * @param batchNormalizationState A valid MPSCNNBatchNormalizationState object which specifies the input state with gradients and original gamma/beta for this update.
     * @param inputMomentumVectors    An array MPSVector object which specifies the gradient momentum vectors which will
     *                                be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds to beta, array can be of
     *                                size 1 in which case beta won't be updated
     * @param resultState             A valid MPSCNNNormalizationGammaAndBetaState object which specifies the resultValues state which will
     *                                be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationState:inputMomentumVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationStateInputMomentumVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState, NSArray<? extends MPSVector> inputMomentumVectors,
            MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * Encode an MPSNNOptimizerStochasticGradientDescent object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * <p>
     * useNesterov == NO:
     * m[t]     = momentumScale * m[t-1] + learningRate * g
     * variable = variable - m[t]
     * <p>
     * useNesterov == YES:
     * m[t]     = momentumScale * m[t-1] + g
     * variable = variable - (learningRate * (g + m[t] * momentumScale))
     * <p>
     * inputMomentumVector == nil
     * variable = variable - (learningRate * g)
     * <p>
     * where,
     * g    is gradient of error wrt variable
     * m[t] is momentum of gradients it is a state we keep updating every update iteration
     *
     * @param commandBuffer            A valid MTLCommandBuffer to receive the encoded kernel.
     * @param convolutionGradientState A valid MPSCNNConvolutionGradientState object which specifies the input state with gradients for this update.
     * @param convolutionSourceState   A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the input state with values to be updated.
     * @param inputMomentumVectors     An array MPSVector object which specifies the gradient momentum vectors which will
     *                                 be updated and overwritten. The index 0 corresponds to weights, index 1 corresponds to biases, array can be of
     *                                 size 1 in which case biases won't be updated
     * @param resultState              A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the resultValues state which will
     *                                 be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputMomentumVectors:resultState:")
    public native void encodeToCommandBufferConvolutionGradientStateConvolutionSourceStateInputMomentumVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState convolutionGradientState,
            MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, MPSCNNConvolutionWeightsAndBiasesState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientMatrix:inputValuesMatrix:inputMomentumMatrix:resultValuesMatrix:")
    public native void encodeToCommandBufferInputGradientMatrixInputValuesMatrixInputMomentumMatrixResultValuesMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputGradientMatrix,
            MPSMatrix inputValuesMatrix, MPSMatrix inputMomentumMatrix, MPSMatrix resultValuesMatrix);

    /**
     * Encode an MPSNNOptimizerStochasticGradientDescent object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * <p>
     * useNesterov == NO:
     * m[t]     = momentumScale * m[t-1] + learningRate * g
     * variable = variable - m[t]
     * <p>
     * useNesterov == YES:
     * m[t]     = momentumScale * m[t-1] + g
     * variable = variable - (learningRate * (g + m[t] * momentumScale))
     * <p>
     * inputMomentumVector == nil
     * variable = variable - (learningRate * g)
     * <p>
     * where,
     * g    is gradient of error wrt variable
     * m[t] is momentum of gradients it is a state we keep updating every update iteration
     *
     * @param commandBuffer       A valid MTLCommandBuffer to receive the encoded kernel.
     * @param inputGradientVector A valid MPSVector object which specifies the input vector of gradients for this update.
     * @param inputValuesVector   A valid MPSVector object which specifies the input vector of values to be updated.
     * @param inputMomentumVector A valid MPSVector object which specifies the gradient momentum vector which will
     *                            be updated and overwritten.
     * @param resultValuesVector  A valid MPSVector object which specifies the resultValues vector which will
     *                            be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputMomentumVector:resultValuesVector:")
    public native void encodeToCommandBufferInputGradientVectorInputValuesVectorInputMomentumVectorResultValuesVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSVector inputGradientVector,
            MPSVector inputValuesVector, MPSVector inputMomentumVector, MPSVector resultValuesVector);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNOptimizerStochasticGradientDescent init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNOptimizerStochasticGradientDescent initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNOptimizerStochasticGradientDescent initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNOptimizerStochasticGradientDescent initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Convenience initialization for the momentum update
     *
     * @param device       The device on which the kernel will execute.
     * @param learningRate The learningRate which will be applied
     * @return A valid MPSNNOptimizerStochasticGradientDescent object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:learningRate:")
    public native MPSNNOptimizerStochasticGradientDescent initWithDeviceLearningRate(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, float learningRate);

    @Generated
    @Selector("initWithDevice:momentumScale:useNestrovMomentum:optimizerDescriptor:")
    public native MPSNNOptimizerStochasticGradientDescent initWithDeviceMomentumScaleUseNestrovMomentumOptimizerDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, float momentumScale, boolean useNestrovMomentum,
            MPSNNOptimizerDescriptor optimizerDescriptor);

    @Generated
    @Selector("instanceMethodForSelector:")
    @FunctionPtr(name = "call_instanceMethodForSelector_ret")
    public static native NSObject.Function_instanceMethodForSelector_ret instanceMethodForSelector(SEL aSelector);

    @Generated
    @Selector("instanceMethodSignatureForSelector:")
    public static native NSMethodSignature instanceMethodSignatureForSelector(SEL aSelector);

    @Generated
    @Selector("instancesRespondToSelector:")
    public static native boolean instancesRespondToSelector(SEL aSelector);

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    /**
     * [@property]   momentumScale
     * <p>
     * The momentumScale at which we update momentum for values array
     * <p>
     * Default value is 0.0
     */
    @Generated
    @Selector("momentumScale")
    public native float momentumScale();

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNOptimizerStochasticGradientDescent new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    @Generated
    @Selector("useNestrovMomentum")
    public native boolean useNestrovMomentum();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * Full initialization for the momentum update
     *
     * @param device              The device on which the kernel will execute.
     * @param momentumScale       The momentumScale to update momentum for values array
     * @param useNesterovMomentum Use the Nesterov style momentum update
     * @param optimizerDescriptor The optimizerDescriptor which will have a bunch of properties to be applied
     * @return A valid MPSNNOptimizerMomentum object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:momentumScale:useNesterovMomentum:optimizerDescriptor:")
    public native MPSNNOptimizerStochasticGradientDescent initWithDeviceMomentumScaleUseNesterovMomentumOptimizerDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, float momentumScale, boolean useNesterovMomentum,
            MPSNNOptimizerDescriptor optimizerDescriptor);

    /**
     * [@property]   useNesterovMomentum
     * <p>
     * Nesterov momentum is considered an improvement on the usual momentum update
     * <p>
     * Default value is NO
     * [@note]       Maps to old useNestrovMomentum property
     */
    @Generated
    @Selector("useNesterovMomentum")
    public native boolean useNesterovMomentum();
}
