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
 * MPSNNOptimizerAdam
 * <p>
 * The MPSNNOptimizerAdam performs an Adam Update
 * <p>
 * Initialization time
 * m[0] = 0 (Initialize initial 1st moment vector aka momentum, user is responsible for this)
 * v[0] = 0 (Initialize initial 2nd moment vector aka velocity, user is responsible for this)
 * t = 0 (Initialize timestep)
 * <p>
 * https://arxiv.org/abs/1412.6980
 * <p>
 * At update time:
 * t = t + 1
 * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
 * <p>
 * m[t] = beta1 * m[t-1] + (1 - beta1) * g
 * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
 * variable = variable - lr[t] * m[t] / (sqrt(v[t]) + epsilon)
 * <p>
 * where,
 * g is gradient of error wrt variable
 * v[t] is velocity
 * m[t] is momentum
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNOptimizerAdam extends MPSNNOptimizer {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNOptimizerAdam(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNOptimizerAdam alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNOptimizerAdam allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] beta1
     * <p>
     * The beta1 at which we update values
     * <p>
     * Default value is 0.9
     */
    @Generated
    @Selector("beta1")
    public native double beta1();

    /**
     * [@property] beta2
     * <p>
     * The beta2 at which we update values
     * <p>
     * Default value is 0.999
     */
    @Generated
    @Selector("beta2")
    public native double beta2();

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
     * Encode an AMSGrad variant of MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * At update time:
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1],v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel[t]) + epsilon)
     *
     * @param commandBuffer                   A valid MTLCommandBuffer to receive the encoded kernel.
     * @param batchNormalizationGradientState A valid MPSCNNBatchNormalizationState object which specifies the input
     *                                        state with gradients for this update.
     * @param batchNormalizationSourceState   A valid MPSCNNBatchNormalizationState object which specifies the input
     *                                        state with original gamma/beta for this update.
     * @param inputMomentumVectors            An array MPSVector object which specifies the gradient momentum vectors
     *                                        which will
     *                                        be updated and overwritten. The index 0 corresponds to gamma, index 1
     *                                        corresponds to beta, array can be of
     *                                        size 1 in which case beta won't be updated
     * @param inputVelocityVectors            An array MPSVector object which specifies the gradient velocity vectors
     *                                        which will
     *                                        be updated and overwritten. The index 0 corresponds to gamma, index 1
     *                                        corresponds to beta, array can be of
     *                                        size 1 in which case beta won't be updated
     * @param maximumVelocityVectors          An array MPSVector object which specifies the maximum velocity vectors
     *                                        which will
     *                                        be updated and overwritten. The index 0 corresponds to weights, index 1
     *                                        corresponds to biases, array can be of
     *                                        size 1 in which case biases won't be updated. May be nil, if nil then
     *                                        normal Adam optimizer behaviour is followed.
     * @param resultState                     A valid MPSCNNNormalizationGammaAndBetaState object which specifies the
     *                                        resultValues state which will
     *                                        be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputMomentumVectors:inputVelocityVectors:maximumVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationGradientStateBatchNormalizationSourceStateInputMomentumVectorsInputVelocityVectorsMaximumVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationGradientState,
            MPSCNNBatchNormalizationState batchNormalizationSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, NSArray<? extends MPSVector> inputVelocityVectors,
            NSArray<? extends MPSVector> maximumVelocityVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * Encode an MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * variable = variable - lr[t] * m[t] / (sqrt(v[t]) + epsilon)
     *
     * @param commandBuffer                   A valid MTLCommandBuffer to receive the encoded kernel.
     * @param batchNormalizationGradientState A valid MPSCNNBatchNormalizationState object which specifies the input
     *                                        state with gradients for this update.
     * @param batchNormalizationSourceState   A valid MPSCNNBatchNormalizationState object which specifies the input
     *                                        state with original gamma/beta for this update.
     * @param inputMomentumVectors            An array MPSVector object which specifies the gradient momentum vectors
     *                                        which will
     *                                        be updated and overwritten. The index 0 corresponds to gamma, index 1
     *                                        corresponds to beta, array can be of
     *                                        size 1 in which case beta won't be updated
     * @param inputVelocityVectors            An array MPSVector object which specifies the gradient velocity vectors
     *                                        which will
     *                                        be updated and overwritten. The index 0 corresponds to gamma, index 1
     *                                        corresponds to beta, array can be of
     *                                        size 1 in which case beta won't be updated
     * @param resultState                     A valid MPSCNNNormalizationGammaAndBetaState object which specifies the
     *                                        resultValues state which will
     *                                        be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationGradientStateBatchNormalizationSourceStateInputMomentumVectorsInputVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationGradientState,
            MPSCNNBatchNormalizationState batchNormalizationSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, NSArray<? extends MPSVector> inputVelocityVectors,
            MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * Encode an AMSGrad variant of MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * At update time:
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1],v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel[t]) + epsilon)
     *
     * @param commandBuffer           A valid MTLCommandBuffer to receive the encoded kernel.
     * @param batchNormalizationState A valid MPSCNNBatchNormalizationState object which specifies the input state with
     *                                gradients and original gamma/beta for this update.
     * @param inputMomentumVectors    An array MPSVector object which specifies the gradient momentum vectors which will
     *                                be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds
     *                                to beta, array can be of
     *                                size 1 in which case beta won't be updated
     * @param inputVelocityVectors    An array MPSVector object which specifies the gradient velocity vectors which will
     *                                be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds
     *                                to beta, array can be of
     *                                size 1 in which case beta won't be updated
     * @param maximumVelocityVectors  An array MPSVector object which specifies the maximum velocity vectors which will
     *                                be updated and overwritten. The index 0 corresponds to weights, index 1
     *                                corresponds to biases, array can be of
     *                                size 1 in which case biases won't be updated. May be nil, if nil then normal Adam
     *                                optimizer behaviour is followed.
     * @param resultState             A valid MPSCNNNormalizationGammaAndBetaState object which specifies the
     *                                resultValues state which will
     *                                be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationState:inputMomentumVectors:inputVelocityVectors:maximumVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationStateInputMomentumVectorsInputVelocityVectorsMaximumVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState, NSArray<? extends MPSVector> inputMomentumVectors,
            NSArray<? extends MPSVector> inputVelocityVectors, NSArray<? extends MPSVector> maximumVelocityVectors,
            MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * Encode an MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * variable = variable - lr[t] * m[t] / (sqrt(v[t]) + epsilon)
     *
     * @param commandBuffer           A valid MTLCommandBuffer to receive the encoded kernel.
     * @param batchNormalizationState A valid MPSCNNBatchNormalizationState object which specifies the input state with
     *                                gradients and original gamma/beta for this update.
     * @param inputMomentumVectors    An array MPSVector object which specifies the gradient momentum vectors which will
     *                                be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds
     *                                to beta, array can be of
     *                                size 1 in which case beta won't be updated
     * @param inputVelocityVectors    An array MPSVector object which specifies the gradient velocity vectors which will
     *                                be updated and overwritten. The index 0 corresponds to gamma, index 1 corresponds
     *                                to beta, array can be of
     *                                size 1 in which case beta won't be updated
     * @param resultState             A valid MPSCNNNormalizationGammaAndBetaState object which specifies the
     *                                resultValues state which will
     *                                be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationStateInputMomentumVectorsInputVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState, NSArray<? extends MPSVector> inputMomentumVectors,
            NSArray<? extends MPSVector> inputVelocityVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    /**
     * Encode an AMSGrad variant of MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * At update time:
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1],v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel[t]) + epsilon)
     *
     * @param commandBuffer            A valid MTLCommandBuffer to receive the encoded kernel.
     * @param convolutionGradientState A valid MPSCNNConvolutionGradientState object which specifies the input state
     *                                 with gradients for this update.
     * @param convolutionSourceState   A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the input
     *                                 state with values to be updated.
     * @param inputMomentumVectors     An array MPSVector object which specifies the gradient momentum vectors which
     *                                 will
     *                                 be updated and overwritten. The index 0 corresponds to weights, index 1
     *                                 corresponds to biases, array can be of
     *                                 size 1 in which case biases won't be updated
     * @param inputVelocityVectors     An array MPSVector object which specifies the gradient velocity vectors which
     *                                 will
     *                                 be updated and overwritten. The index 0 corresponds to weights, index 1
     *                                 corresponds to biases, array can be of
     *                                 size 1 in which case biases won't be updated
     * @param maximumVelocityVectors   An array MPSVector object which specifies the maximum velocity vectors which will
     *                                 be updated and overwritten. The index 0 corresponds to weights, index 1
     *                                 corresponds to biases, array can be of
     *                                 size 1 in which case biases won't be updated. May be nil, if nil then normal Adam
     *                                 optimizer behaviour is followed.
     * @param resultState              A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the
     *                                 resultValues state which will
     *                                 be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputMomentumVectors:inputVelocityVectors:maximumVelocityVectors:resultState:")
    public native void encodeToCommandBufferConvolutionGradientStateConvolutionSourceStateInputMomentumVectorsInputVelocityVectorsMaximumVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState convolutionGradientState,
            MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, NSArray<? extends MPSVector> inputVelocityVectors,
            NSArray<? extends MPSVector> maximumVelocityVectors, MPSCNNConvolutionWeightsAndBiasesState resultState);

    /**
     * Encode an MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * variable = variable - lr[t] * m[t] / (sqrt(v[t]) + epsilon)
     *
     * @param commandBuffer            A valid MTLCommandBuffer to receive the encoded kernel.
     * @param convolutionGradientState A valid MPSCNNConvolutionGradientState object which specifies the input state
     *                                 with gradients for this update.
     * @param convolutionSourceState   A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the input
     *                                 state with values to be updated.
     * @param inputMomentumVectors     An array MPSVector object which specifies the gradient momentum vectors which
     *                                 will
     *                                 be updated and overwritten. The index 0 corresponds to weights, index 1
     *                                 corresponds to biases, array can be of
     *                                 size 1 in which case biases won't be updated
     * @param inputVelocityVectors     An array MPSVector object which specifies the gradient velocity vectors which
     *                                 will
     *                                 be updated and overwritten. The index 0 corresponds to weights, index 1
     *                                 corresponds to biases, array can be of
     *                                 size 1 in which case biases won't be updated
     * @param resultState              A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the
     *                                 resultValues state which will
     *                                 be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBufferConvolutionGradientStateConvolutionSourceStateInputMomentumVectorsInputVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState convolutionGradientState,
            MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, NSArray<? extends MPSVector> inputVelocityVectors,
            MPSCNNConvolutionWeightsAndBiasesState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientMatrix:inputValuesMatrix:inputMomentumMatrix:inputVelocityMatrix:maximumVelocityMatrix:resultValuesMatrix:")
    public native void encodeToCommandBufferInputGradientMatrixInputValuesMatrixInputMomentumMatrixInputVelocityMatrixMaximumVelocityMatrixResultValuesMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputGradientMatrix,
            MPSMatrix inputValuesMatrix, MPSMatrix inputMomentumMatrix, MPSMatrix inputVelocityMatrix,
            MPSMatrix maximumVelocityMatrix, MPSMatrix resultValuesMatrix);

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientMatrix:inputValuesMatrix:inputMomentumMatrix:inputVelocityMatrix:resultValuesMatrix:")
    public native void encodeToCommandBufferInputGradientMatrixInputValuesMatrixInputMomentumMatrixInputVelocityMatrixResultValuesMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputGradientMatrix,
            MPSMatrix inputValuesMatrix, MPSMatrix inputMomentumMatrix, MPSMatrix inputVelocityMatrix,
            MPSMatrix resultValuesMatrix);

    /**
     * Encode an AMSGrad variant of MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * At update time:
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * maxVel[t] = max(maxVel[t-1],v[t])
     * variable = variable - lr[t] * m[t] / (sqrt(maxVel[t]) + epsilon)
     *
     * @param commandBuffer         A valid MTLCommandBuffer to receive the encoded kernel.
     * @param inputGradientVector   A valid MPSVector object which specifies the input vector of gradients for this
     *                              update.
     * @param inputValuesVector     A valid MPSVector object which specifies the input vector of values to be updated.
     * @param inputMomentumVector   A valid MPSVector object which specifies the gradient momentum vector which will
     *                              be updated and overwritten.
     * @param inputVelocityVector   A valid MPSVector object which specifies the gradient velocity vector which will
     *                              be updated and overwritten.
     * @param maximumVelocityVector A valid MPSVector object which specifies the maximum velocity vector which will
     *                              be updated and overwritten. May be nil, if nil then normal Adam optimizer behaviour
     *                              is followed.
     * @param resultValuesVector    A valid MPSCNNConvolutionWeightsAndBiasesState object which specifies the
     *                              resultValues state which will
     *                              be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputMomentumVector:inputVelocityVector:maximumVelocityVector:resultValuesVector:")
    public native void encodeToCommandBufferInputGradientVectorInputValuesVectorInputMomentumVectorInputVelocityVectorMaximumVelocityVectorResultValuesVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSVector inputGradientVector,
            MPSVector inputValuesVector, MPSVector inputMomentumVector, MPSVector inputVelocityVector,
            MPSVector maximumVelocityVector, MPSVector resultValuesVector);

    /**
     * Encode an MPSNNOptimizerAdam object to a command buffer to perform out of place update
     * <p>
     * The following operations would be applied
     * <p>
     * t = t + 1
     * lr[t] = learningRate * sqrt(1 - beta2^t) / (1 - beta1^t)
     * <p>
     * m[t] = beta1 * m[t-1] + (1 - beta1) * g
     * v[t] = beta2 * v[t-1] + (1 - beta2) * (g ^ 2)
     * variable = variable - lr[t] * m[t] / (sqrt(v[t]) + epsilon)
     *
     * @param commandBuffer       A valid MTLCommandBuffer to receive the encoded kernel.
     * @param inputGradientVector A valid MPSVector object which specifies the input vector of gradients for this
     *                            update.
     * @param inputValuesVector   A valid MPSVector object which specifies the input vector of values to be updated.
     * @param inputMomentumVector A valid MPSVector object which specifies the gradient momentum vector which will
     *                            be updated and overwritten.
     * @param inputVelocityVector A valid MPSVector object which specifies the gradient velocity vector which will
     *                            be updated and overwritten.
     * @param resultValuesVector  A valid MPSVector object which specifies the resultValues vector which will
     *                            be updated and overwritten.
     */
    @Generated
    @Selector("encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputMomentumVector:inputVelocityVector:resultValuesVector:")
    public native void encodeToCommandBufferInputGradientVectorInputValuesVectorInputMomentumVectorInputVelocityVectorResultValuesVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSVector inputGradientVector,
            MPSVector inputValuesVector, MPSVector inputMomentumVector, MPSVector inputVelocityVector,
            MPSVector resultValuesVector);

    /**
     * [@property] epsilon
     * <p>
     * The epsilon at which we update values
     * <p>
     * This value is usually used to ensure to avoid divide by 0, default value is 1e-8
     */
    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNOptimizerAdam init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNOptimizerAdam initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNOptimizerAdam initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNOptimizerAdam initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Full initialization for the adam update
     *
     * @param device              The device on which the kernel will execute.
     * @param beta1               The beta1 to update values
     * @param beta2               The beta2 to update values
     * @param epsilon             The epsilon at which we update values
     * @param timeStep            The timeStep at which values will start updating
     * @param optimizerDescriptor The optimizerDescriptor which will have a bunch of properties to be applied
     * @return A valid MPSNNOptimizerAdam object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:beta1:beta2:epsilon:timeStep:optimizerDescriptor:")
    public native MPSNNOptimizerAdam initWithDeviceBeta1Beta2EpsilonTimeStepOptimizerDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, double beta1, double beta2, float epsilon,
            @NUInt long timeStep, MPSNNOptimizerDescriptor optimizerDescriptor);

    /**
     * Convenience initialization for the adam update
     *
     * @param device       The device on which the kernel will execute.
     * @param learningRate The learningRate at which we will update values
     * @return A valid MPSNNOptimizerAdam object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:learningRate:")
    public native MPSNNOptimizerAdam initWithDeviceLearningRate(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            float learningRate);

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

    @Generated
    @Owned
    @Selector("new")
    public static native MPSNNOptimizerAdam new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] timeStep
     * <p>
     * Current timeStep for the update, number of times update has occurred
     */
    @Generated
    @Selector("setTimeStep:")
    public native void setTimeStep(@NUInt long value);

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

    /**
     * [@property] timeStep
     * <p>
     * Current timeStep for the update, number of times update has occurred
     */
    @Generated
    @Selector("timeStep")
    @NUInt
    public native long timeStep();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
