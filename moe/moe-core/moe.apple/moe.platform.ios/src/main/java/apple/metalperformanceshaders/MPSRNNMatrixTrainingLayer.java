package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLOrigin;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.NUIntPtr;
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
public class MPSRNNMatrixTrainingLayer extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRNNMatrixTrainingLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Selector("accumulateWeightGradients")
    public native boolean accumulateWeightGradients();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRNNMatrixTrainingLayer alloc();

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
    @Owned
    @Selector("copyWithZone:device:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZoneDevice(VoidPtr zone, @Mapped(ObjCObjectMapper.class) MTLDevice device);

    @Generated
    @Selector("createTemporaryWeightGradientMatrices:dataType:commandBuffer:")
    public native void createTemporaryWeightGradientMatricesDataTypeCommandBuffer(NSMutableArray<MPSMatrix> matricesOut,
            int dataType, @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer);

    @Generated
    @Selector("createWeightGradientMatrices:dataType:")
    public native void createWeightGradientMatricesDataType(NSMutableArray<MPSMatrix> matricesOut, int dataType);

    @Generated
    @Selector("createWeightMatrices:")
    public native void createWeightMatrices(NSMutableArray<MPSMatrix> matricesOut);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeCopyWeightsToCommandBuffer:weights:matrixId:matrix:copyFromWeightsToMatrix:matrixOffset:")
    public native void encodeCopyWeightsToCommandBufferWeightsMatrixIdMatrixCopyFromWeightsToMatrixMatrixOffset(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> weights,
            @NUInt long matrixId, MPSMatrix matrix, boolean copyFromWeightsToMatrix, @ByValue MTLOrigin matrixOffset);

    @Generated
    @Selector("encodeForwardSequenceToCommandBuffer:sourceMatrices:destinationMatrices:trainingStates:weights:")
    public native void encodeForwardSequenceToCommandBufferSourceMatricesDestinationMatricesTrainingStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NSArray<? extends MPSMatrix> destinationMatrices, NSMutableArray<MPSRNNMatrixTrainingState> trainingStates,
            NSArray<? extends MPSMatrix> weights);

    @Generated
    @Selector("encodeForwardSequenceToCommandBuffer:sourceMatrices:sourceOffsets:destinationMatrices:destinationOffsets:trainingStates:recurrentInputState:recurrentOutputStates:weights:")
    public native void encodeForwardSequenceToCommandBufferSourceMatricesSourceOffsetsDestinationMatricesDestinationOffsetsTrainingStatesRecurrentInputStateRecurrentOutputStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NUIntPtr sourceOffsets, NSArray<? extends MPSMatrix> destinationMatrices, NUIntPtr destinationOffsets,
            NSMutableArray<MPSRNNMatrixTrainingState> trainingStates, MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates, NSArray<? extends MPSMatrix> weights);

    @Generated
    @Selector("encodeGradientSequenceToCommandBuffer:forwardSources:forwardSourceOffsets:sourceGradients:sourceGradientOffsets:destinationGradients:destinationOffsets:weightGradients:trainingStates:recurrentInputState:recurrentOutputStates:weights:")
    public native void encodeGradientSequenceToCommandBufferForwardSourcesForwardSourceOffsetsSourceGradientsSourceGradientOffsetsDestinationGradientsDestinationOffsetsWeightGradientsTrainingStatesRecurrentInputStateRecurrentOutputStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> forwardSources,
            NUIntPtr forwardSourceOffsets, NSArray<? extends MPSMatrix> sourceGradients, NUIntPtr sourceGradientOffsets,
            NSArray<? extends MPSMatrix> destinationGradients, NUIntPtr destinationOffsets,
            NSArray<? extends MPSMatrix> weightGradients, NSArray<? extends MPSRNNMatrixTrainingState> trainingStates,
            MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates, NSArray<? extends MPSMatrix> weights);

    @Generated
    @Selector("encodeGradientSequenceToCommandBuffer:forwardSources:sourceGradients:destinationGradients:weightGradients:trainingStates:weights:")
    public native void encodeGradientSequenceToCommandBufferForwardSourcesSourceGradientsDestinationGradientsWeightGradientsTrainingStatesWeights(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> forwardSources,
            NSArray<? extends MPSMatrix> sourceGradients, NSArray<? extends MPSMatrix> destinationGradients,
            NSArray<? extends MPSMatrix> weightGradients, NSArray<? extends MPSRNNMatrixTrainingState> trainingStates,
            NSArray<? extends MPSMatrix> weights);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRNNMatrixTrainingLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSRNNMatrixTrainingLayer initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSRNNMatrixTrainingLayer initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSRNNMatrixTrainingLayer initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:rnnDescriptor:trainableWeights:")
    public native MPSRNNMatrixTrainingLayer initWithDeviceRnnDescriptorTrainableWeights(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSRNNDescriptor rnnDescriptor,
            NSMutableArray<MPSMatrix> trainableWeights);

    @Generated
    @Selector("inputFeatureChannels")
    @NUInt
    public native long inputFeatureChannels();

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
    @Selector("outputFeatureChannels")
    @NUInt
    public native long outputFeatureChannels();

    @Generated
    @Selector("recurrentOutputIsTemporary")
    public native boolean recurrentOutputIsTemporary();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setAccumulateWeightGradients:")
    public native void setAccumulateWeightGradients(boolean value);

    @Generated
    @Selector("setRecurrentOutputIsTemporary:")
    public native void setRecurrentOutputIsTemporary(boolean value);

    @Generated
    @Selector("setStoreAllIntermediateStates:")
    public native void setStoreAllIntermediateStates(boolean value);

    @Generated
    @Selector("setTrainingStateIsTemporary:")
    public native void setTrainingStateIsTemporary(boolean value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("storeAllIntermediateStates")
    public native boolean storeAllIntermediateStates();

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
    @Selector("trainingStateIsTemporary")
    public native boolean trainingStateIsTemporary();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}