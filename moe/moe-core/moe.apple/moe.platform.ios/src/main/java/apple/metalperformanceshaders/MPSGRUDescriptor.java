package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metalperformanceshaders.protocol.MPSCNNConvolutionDataSource;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSGRUDescriptor extends MPSRNNDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSGRUDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSGRUDescriptor alloc();

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
    @Selector("createGRUDescriptorWithInputFeatureChannels:outputFeatureChannels:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object createGRUDescriptorWithInputFeatureChannelsOutputFeatureChannels(
            @NUInt long inputFeatureChannels, @NUInt long outputFeatureChannels);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("flipOutputGates")
    public native boolean flipOutputGates();

    @Generated
    @Selector("gatePnormValue")
    public native float gatePnormValue();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSGRUDescriptor init();

    @Generated
    @Selector("inputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateInputWeights();

    @Generated
    @Selector("inputGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource inputGateRecurrentWeights();

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
    @Selector("outputGateInputGateWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateInputGateWeights();

    @Generated
    @Selector("outputGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateInputWeights();

    @Generated
    @Selector("outputGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource outputGateRecurrentWeights();

    @Generated
    @Selector("recurrentGateInputWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource recurrentGateInputWeights();

    @Generated
    @Selector("recurrentGateRecurrentWeights")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource recurrentGateRecurrentWeights();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setFlipOutputGates:")
    public native void setFlipOutputGates(boolean value);

    @Generated
    @Selector("setGatePnormValue:")
    public native void setGatePnormValue(float value);

    @Generated
    @Selector("setInputGateInputWeights:")
    public native void setInputGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setInputGateRecurrentWeights:")
    public native void setInputGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setOutputGateInputGateWeights:")
    public native void setOutputGateInputGateWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setOutputGateInputWeights:")
    public native void setOutputGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setOutputGateRecurrentWeights:")
    public native void setOutputGateRecurrentWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setRecurrentGateInputWeights:")
    public native void setRecurrentGateInputWeights(@Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setRecurrentGateRecurrentWeights:")
    public native void setRecurrentGateRecurrentWeights(
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}