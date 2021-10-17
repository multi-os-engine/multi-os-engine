package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
import apple.metal.protocol.MTLDevice;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNConvolutionTransposeGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * The MPSCNNConvolutionTransposeGradient implementents backward propagation of gradient for MPSCNNConvolutionTranspose forward filter
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNConvolutionTransposeGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNConvolutionTransposeGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNConvolutionTransposeGradient alloc();

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

    /**
     * [@property]   dataSource
     * <p>
     * dataSource with which gradient object was created
     */
    @Generated
    @Selector("dataSource")
    @MappedReturn(ObjCObjectMapper.class)
    public native MPSCNNConvolutionDataSource dataSource();

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * [@property]   gradientOption
     * <p>
     * Option to control which gradient to compute. Default is MPSCNNConvolutionGradientOptionAll
     * which means both gradient with respect to data and gradient with respect to weight and bias are computed.
     */
    @Generated
    @Selector("gradientOption")
    @NUInt
    public native long gradientOption();

    /**
     * [@property]   groups
     * <p>
     * Number of groups input and output channels are divided into.
     */
    @Generated
    @Selector("groups")
    @NUInt
    public native long groups();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNConvolutionTransposeGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNConvolutionTransposeGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly.  To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNConvolutionTransposeGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNConvolutionTransposeGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a convolution transpose gradient (with respect to weights and bias) object.
     *
     * @param device  The MTLDevice on which this MPSCNNConvolutionGradient filter will be used
     * @param weights A pointer to a object that conforms to the MPSCNNConvolutionDataSource
     *                protocol. Note that same data source as provided to forward convolution should be used.
     * @return A valid MPSCNNConvolutionTransposeGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:weights:")
    public native MPSCNNConvolutionTransposeGradient initWithDeviceWeights(
            @Mapped(ObjCObjectMapper.class) MTLDevice device,
            @Mapped(ObjCObjectMapper.class) MPSCNNConvolutionDataSource weights);

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

    /**
     * CPU side reload. Reload the updated weights and biases from data provider into internal weights and bias buffers. Weights and biases
     * gradients needed for update are obtained from MPSCNNConvolutionGradientState object. Data provider passed in init call is used for this purpose.
     */
    @Generated
    @Selector("reloadWeightsAndBiasesFromDataSource")
    public native void reloadWeightsAndBiasesFromDataSource();

    /**
     * GPU side reload. Reload the updated weights and biases from update buffer produced by application enqueued metal kernel into internal weights
     * and biases buffer. Weights and biases gradients needed for update are obtained from MPSCNNConvolutionGradientState object's gradientForWeights and gradientForBiases metal buffer.
     *
     * @param commandBuffer Metal command buffer on which application update kernel was enqueued consuming MPSCNNConvolutionGradientState's gradientForWeights and gradientForBiases buffer
     *                      and producing updateBuffer metal buffer.
     * @param state         MPSCNNConvolutionWeightsAndBiasesState containing weights and biases buffers which have updated weights produced by application's update kernel.
     */
    @Generated
    @Selector("reloadWeightsAndBiasesWithCommandBuffer:state:")
    public native void reloadWeightsAndBiasesWithCommandBufferState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer,
            MPSCNNConvolutionWeightsAndBiasesState state);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property]   gradientOption
     * <p>
     * Option to control which gradient to compute. Default is MPSCNNConvolutionGradientOptionAll
     * which means both gradient with respect to data and gradient with respect to weight and bias are computed.
     */
    @Generated
    @Selector("setGradientOption:")
    public native void setGradientOption(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   sourceGradientFeatureChannels
     * <p>
     * The number of feature channels per pixel in the gradient image (primarySource) of encode call. This is same is outputFeatureChannels
     * or the feature channels of destination image in forward convolution i.e. dataSource.descriptor.outputFeatureChannels
     */
    @Generated
    @Selector("sourceGradientFeatureChannels")
    @NUInt
    public native long sourceGradientFeatureChannels();

    /**
     * [@property]   sourceImageFeatureChannels
     * <p>
     * The number of feature channels per pixel in the input image to forward convolution which is used here as secondarySource.
     * This is same as dataSource.descriptor.inputFeatureChannels. This is also the number of feature channels in destinatin image
     * here i.e. gradient with respect to data.
     */
    @Generated
    @Selector("sourceImageFeatureChannels")
    @NUInt
    public native long sourceImageFeatureChannels();

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
