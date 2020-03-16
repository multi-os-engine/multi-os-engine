package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
import apple.metalperformanceshaders.protocol.MPSCNNBatchNormalizationDataSource;
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
public class MPSCNNBatchNormalization extends MPSCNNKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBatchNormalization(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBatchNormalization alloc();

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
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNBatchNormalizationDataSource dataSource();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("encodeToCommandBuffer:sourceImage:batchNormalizationState:destinationImage:")
    public native void encodeToCommandBufferSourceImageBatchNormalizationStateDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            MPSCNNBatchNormalizationState batchNormalizationState, MPSImage destinationImage);

    @Generated
    @Selector("epsilon")
    public native float epsilon();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNBatchNormalization init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNBatchNormalization initWithCoder(NSCoder aDecoder);

    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNBatchNormalization initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNBatchNormalization initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:dataSource:")
    public native MPSCNNBatchNormalization initWithDeviceDataSource(@Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource);

    @Generated
    @Selector("initWithDevice:dataSource:fusedNeuronDescriptor:")
    public native MPSCNNBatchNormalization initWithDeviceDataSourceFusedNeuronDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource,
            MPSNNNeuronDescriptor fusedNeuronDescriptor);

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
    @Selector("numberOfFeatureChannels")
    @NUInt
    public native long numberOfFeatureChannels();

    @Generated
    @Selector("reloadDataSource:")
    public native void reloadDataSource(@Mapped(ObjCObjectMapper.class) MPSCNNBatchNormalizationDataSource dataSource);

    @Generated
    @Selector("reloadGammaAndBetaFromDataSource")
    public native void reloadGammaAndBetaFromDataSource();

    @Generated
    @Selector("reloadGammaAndBetaWithCommandBuffer:gammaAndBetaState:")
    public native void reloadGammaAndBetaWithCommandBufferGammaAndBetaState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNNormalizationGammaAndBetaState gammaAndBetaState);

    @Generated
    @Selector("reloadMeanAndVarianceFromDataSource")
    public native void reloadMeanAndVarianceFromDataSource();

    @Generated
    @Selector("reloadMeanAndVarianceWithCommandBuffer:meanAndVarianceState:")
    public native void reloadMeanAndVarianceWithCommandBufferMeanAndVarianceState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNNormalizationMeanAndVarianceState meanAndVarianceState);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("resultStateForSourceImage:sourceStates:destinationImage:")
    public native MPSCNNBatchNormalizationState resultStateForSourceImageSourceStatesDestinationImage(
            MPSImage sourceImage, NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    @Generated
    @Selector("setEpsilon:")
    public native void setEpsilon(float value);

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
    @Selector("temporaryResultStateForCommandBuffer:sourceImage:sourceStates:destinationImage:")
    public native MPSCNNBatchNormalizationState temporaryResultStateForCommandBufferSourceImageSourceStatesDestinationImage(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceImage,
            NSArray<? extends MPSState> sourceStates, MPSImage destinationImage);

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}