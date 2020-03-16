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
public class MPSNNOptimizerRMSProp extends MPSNNOptimizer {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNOptimizerRMSProp(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNOptimizerRMSProp alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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
    @Selector("decay")
    public native double decay();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationGradientState:batchNormalizationSourceState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationGradientStateBatchNormalizationSourceStateInputSumOfSquaresVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationGradientState,
            MPSCNNBatchNormalizationState batchNormalizationSourceState,
            NSArray<? extends MPSVector> inputSumOfSquaresVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:batchNormalizationState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBufferBatchNormalizationStateInputSumOfSquaresVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNBatchNormalizationState batchNormalizationState,
            NSArray<? extends MPSVector> inputSumOfSquaresVectors, MPSCNNNormalizationGammaAndBetaState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:convolutionGradientState:convolutionSourceState:inputSumOfSquaresVectors:resultState:")
    public native void encodeToCommandBufferConvolutionGradientStateConvolutionSourceStateInputSumOfSquaresVectorsResultState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionGradientState convolutionGradientState,
            MPSCNNConvolutionWeightsAndBiasesState convolutionSourceState,
            NSArray<? extends MPSVector> inputSumOfSquaresVectors, MPSCNNConvolutionWeightsAndBiasesState resultState);

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientMatrix:inputValuesMatrix:inputSumOfSquaresMatrix:resultValuesMatrix:")
    public native void encodeToCommandBufferInputGradientMatrixInputValuesMatrixInputSumOfSquaresMatrixResultValuesMatrix(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSMatrix inputGradientMatrix,
            MPSMatrix inputValuesMatrix, MPSMatrix inputSumOfSquaresMatrix, MPSMatrix resultValuesMatrix);

    @Generated
    @Selector("encodeToCommandBuffer:inputGradientVector:inputValuesVector:inputSumOfSquaresVector:resultValuesVector:")
    public native void encodeToCommandBufferInputGradientVectorInputValuesVectorInputSumOfSquaresVectorResultValuesVector(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSVector inputGradientVector,
            MPSVector inputValuesVector, MPSVector inputSumOfSquaresVector, MPSVector resultValuesVector);

    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSNNOptimizerRMSProp init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNOptimizerRMSProp initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNOptimizerRMSProp initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSNNOptimizerRMSProp initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:decay:epsilon:optimizerDescriptor:")
    public native MPSNNOptimizerRMSProp initWithDeviceDecayEpsilonOptimizerDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, double decay, float epsilon,
            MPSNNOptimizerDescriptor optimizerDescriptor);

    @Generated
    @Selector("initWithDevice:learningRate:")
    public native MPSNNOptimizerRMSProp initWithDeviceLearningRate(@Mapped(ObjCObjectMapper.class) MTLDevice device,
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
    @Selector("version")
    @NInt
    public static native long version_static();
}