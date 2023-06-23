package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNDepthWiseConvolutionDescriptor can be used to create MPSCNNConvolution object that does depthwise convolution
 * 
 * Depthwise convolution applies different filter to each input feature channel i.e. no cross channel mixing.
 * Number of outputFeatureChannels can be greater than number of inputFeatureChannels, in which case convolution
 * expects channelMultipler = outputFeactureChannels/inputFeatureChannels number of filters for each input channel.
 * This means channelMultipler filters are applied to each input feature channel producing channelMultipler output
 * feature channels.
 * All channelMultipler output feature channels produced by single input feature channel are stored togather in output
 * image i.e.
 * output[x,y,k*channelMultiplier + q] = input[x,y,k] * filter[k,q]
 * where * here denotes convolution.
 * group must be 1.
 * Weights array returned by MPSCNNConvolutionDataProvier is interpreted as
 * Weights [inputFeatureChannels] [channelMultiplier] [kH] [kW]
 * = Weights [ inputFeatureChannels * channelMultiplier ] [kH] [kW]
 * = Weights [ outputFeatureChannels ] [kH] [kW]
 * 
 * Currently only channel multipler of 1 is supported i.e. inputFeatureChannels == outputFeatureChannels
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNDepthWiseConvolutionDescriptor extends MPSCNNConvolutionDescriptor {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNDepthWiseConvolutionDescriptor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNDepthWiseConvolutionDescriptor alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNDepthWiseConvolutionDescriptor allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @NotNull @Mapped(ObjCObjectMapper.class) Object aTarget, @NotNull SEL aSelector,
            @Nullable @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * [@property] channelMultiplier
     * 
     * Ratio of outputFeactureChannel to inputFeatureChannels for depthwise convolution i.e. how many output feature
     * channels are
     * produced by each input channel.
     */
    @Generated
    @Selector("channelMultiplier")
    @NUInt
    public native long channelMultiplier();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:")
    public static native MPSCNNDepthWiseConvolutionDescriptor cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannels(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels);

    @NotNull
    @Deprecated
    @Generated
    @Selector("cnnConvolutionDescriptorWithKernelWidth:kernelHeight:inputFeatureChannels:outputFeatureChannels:neuronFilter:")
    public static native MPSCNNDepthWiseConvolutionDescriptor cnnConvolutionDescriptorWithKernelWidthKernelHeightInputFeatureChannelsOutputFeatureChannelsNeuronFilter(
            @NUInt long kernelWidth, @NUInt long kernelHeight, @NUInt long inputFeatureChannels,
            @NUInt long outputFeatureChannels, @Nullable MPSCNNNeuron neuronFilter);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNDepthWiseConvolutionDescriptor init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNDepthWiseConvolutionDescriptor initWithCoder(@NotNull NSCoder aDecoder);

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

    @NotNull
    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNDepthWiseConvolutionDescriptor new_objc();

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
