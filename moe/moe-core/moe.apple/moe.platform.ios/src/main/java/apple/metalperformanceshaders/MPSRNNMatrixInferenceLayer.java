package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSMutableArray;
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
public class MPSRNNMatrixInferenceLayer extends MPSKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSRNNMatrixInferenceLayer(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSRNNMatrixInferenceLayer alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    @Generated
    @Selector("bidirectionalCombineMode")
    @NUInt
    public native long bidirectionalCombineMode();

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
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeBidirectionalSequenceToCommandBuffer:sourceSequence:destinationForwardMatrices:destinationBackwardMatrices:")
    public native void encodeBidirectionalSequenceToCommandBufferSourceSequenceDestinationForwardMatricesDestinationBackwardMatrices(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceSequence,
            NSArray<? extends MPSMatrix> destinationForwardMatrices,
            NSArray<? extends MPSMatrix> destinationBackwardMatrices);

    @Generated
    @Selector("encodeSequenceToCommandBuffer:sourceMatrices:destinationMatrices:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequenceToCommandBufferSourceMatricesDestinationMatricesRecurrentInputStateRecurrentOutputStates(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NSArray<? extends MPSMatrix> destinationMatrices, MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSRNNMatrixInferenceLayer init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSRNNMatrixInferenceLayer initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSRNNMatrixInferenceLayer initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSRNNMatrixInferenceLayer initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:rnnDescriptor:")
    public native MPSRNNMatrixInferenceLayer initWithDeviceRnnDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSRNNDescriptor rnnDescriptor);

    @Generated
    @Selector("initWithDevice:rnnDescriptors:")
    public native MPSRNNMatrixInferenceLayer initWithDeviceRnnDescriptors(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, NSArray<? extends MPSRNNDescriptor> rnnDescriptors);

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
    @Selector("numberOfLayers")
    @NUInt
    public native long numberOfLayers();

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
    @Selector("setBidirectionalCombineMode:")
    public native void setBidirectionalCombineMode(@NUInt long value);

    @Generated
    @Selector("setRecurrentOutputIsTemporary:")
    public native void setRecurrentOutputIsTemporary(boolean value);

    @Generated
    @Selector("setStoreAllIntermediateStates:")
    public native void setStoreAllIntermediateStates(boolean value);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("encodeSequenceToCommandBuffer:sourceMatrices:sourceOffsets:destinationMatrices:destinationOffsets:recurrentInputState:recurrentOutputStates:")
    public native void encodeSequenceToCommandBufferSourceMatricesSourceOffsetsDestinationMatricesDestinationOffsetsRecurrentInputStateRecurrentOutputStates(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, NSArray<? extends MPSMatrix> sourceMatrices,
            NUIntPtr sourceOffsets, NSArray<? extends MPSMatrix> destinationMatrices, NUIntPtr destinationOffsets,
            MPSRNNRecurrentMatrixState recurrentInputState,
            NSMutableArray<MPSRNNRecurrentMatrixState> recurrentOutputStates);
}