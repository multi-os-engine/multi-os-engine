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
import org.moe.natj.general.ann.MappedReturn;
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

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("beta1")
    public native double beta1();

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

    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputMomentumVectors:inputVelocityVectors:maximumVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationGradientStateBatchNormalizationSourceStateInputMomentumVectorsInputVelocityVectorsMaximumVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationGradientState,
            MPSCNNBatchNormalizationState batchNormalizationSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, NSArray<? extends MPSVector> inputVelocityVectors,
            NSArray<? extends MPSVector> maximumVelocityVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationGradientStateBatchNormalizationSourceStateInputMomentumVectorsInputVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationGradientState,
            MPSCNNBatchNormalizationState batchNormalizationSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, NSArray<? extends MPSVector> inputVelocityVectors,
            MPSCNNNormalizationGammaAndBetaState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationState:inputMomentumVectors:inputVelocityVectors:maximumVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationStateInputMomentumVectorsInputVelocityVectorsMaximumVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState, NSArray<? extends MPSVector> inputMomentumVectors,
            NSArray<? extends MPSVector> inputVelocityVectors, NSArray<? extends MPSVector> maximumVelocityVectors,
            MPSCNNNormalizationGammaAndBetaState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationState:inputMomentumVectors:inputVelocityVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationStateInputMomentumVectorsInputVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState, NSArray<? extends MPSVector> inputMomentumVectors,
            NSArray<? extends MPSVector> inputVelocityVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputMomentumVectors:inputVelocityVectors:maximumVelocityVectors:resultState:")
    public native void encodeToCommandBufferConvolutionGradientStateConvolutionSourceStateInputMomentumVectorsInputVelocityVectorsMaximumVelocityVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState convolutionGradientState,
            MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState,
            NSArray<? extends MPSVector> inputMomentumVectors, NSArray<? extends MPSVector> inputVelocityVectors,
            NSArray<? extends MPSVector> maximumVelocityVectors, MPSCNNConvolutionWeightsAndBiasesState resultState);

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

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputMomentumVector:inputVelocityVector:maximumVelocityVector:resultValuesVector:")
    public native void encodeToCommandBufferInputGradientVectorInputValuesVectorInputMomentumVectorInputVelocityVectorMaximumVelocityVectorResultValuesVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSVector inputGradientVector,
            MPSVector inputValuesVector, MPSVector inputMomentumVector, MPSVector inputVelocityVector,
            MPSVector maximumVelocityVector, MPSVector resultValuesVector);

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputMomentumVector:inputVelocityVector:resultValuesVector:")
    public native void encodeToCommandBufferInputGradientVectorInputValuesVectorInputMomentumVectorInputVelocityVectorResultValuesVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSVector inputGradientVector,
            MPSVector inputValuesVector, MPSVector inputMomentumVector, MPSVector inputVelocityVector,
            MPSVector resultValuesVector);

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

    @Generated
    @Selector("initWithDevice:beta1:beta2:epsilon:timeStep:optimizerDescriptor:")
    public native MPSNNOptimizerAdam initWithDeviceBeta1Beta2EpsilonTimeStepOptimizerDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, double beta1, double beta2, float epsilon,
            @NUInt long timeStep, MPSNNOptimizerDescriptor optimizerDescriptor);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

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

    @Generated
    @Selector("timeStep")
    @NUInt
    public native long timeStep();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}