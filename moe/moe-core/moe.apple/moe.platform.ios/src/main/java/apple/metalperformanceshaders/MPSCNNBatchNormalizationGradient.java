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

/**
 * MPSCNNBatchNormalizationGradient
 * [@dependency] This depends on Metal.framework
 * 
 * MPSCNNBatchNormalizationGradient computes the gradients of a
 *             loss function resulting from a network containing a corresponding
 *             MPSCNNBatchNormalization kernel.
 * 
 *             Two sets of values are computed: the gradient of the loss function
 *             with respect to the batch normalization source images, and the
 *             gradient of the loss function with respect to the scale and bias
 *             terms used to compute the batch normalization.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNBatchNormalizationGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNBatchNormalizationGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNBatchNormalizationGradient alloc();

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
    @Selector("description")
    public static native String description_static();

    /**
     * Encode this operation to a command buffer.  Create an MPSImage to contain
     * the result and return it.
     * See encodeToCommandBuffer:sourceImage:sourceGradient:sourceImage:batchNormalizationState:destinationGradient
     * for further details.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceGradient:sourceImage:batchNormalizationState:")
    public native MPSImage encodeToCommandBufferSourceGradientSourceImageBatchNormalizationState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceGradient,
            MPSImage sourceImage, MPSCNNBatchNormalizationState batchNormalizationState);

    /**
     * Encode this operation to a command buffer for a single image.
     * 
     * @param          commandBuffer               The command buffer.
     * @param          sourceGradient              An MPSImage containing the gradient of the loss function with
     *                                             respect to the results of batch normalization on the source image.
     * @param          sourceImage                 An MPSImage containing the source image for batch normalization.
     * @param          batchNormalizationState     A valid MPSCNNBatchNormalizationState object which
     *                                             has been previously updated using a MPSCNNBatchNormalizationStatisticsGradient
     *                                             kernel and the source images. If the state is temporary its read count will be decremented.
     * @param          destinationGradient         An MPSImage which contains the gradient of the loss function with respect to the source image.
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceGradient:sourceImage:batchNormalizationState:destinationGradient:")
    public native void encodeToCommandBufferSourceGradientSourceImageBatchNormalizationStateDestinationGradient(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceGradient,
            MPSImage sourceImage, MPSCNNBatchNormalizationState batchNormalizationState, MPSImage destinationGradient);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNBatchNormalizationGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNBatchNormalizationGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     *             -initWithCoder: should work, since the file can't
     *             know which device your data is allocated on, we
     *             have to guess and may guess incorrectly.  To avoid
     *             that problem, use a subclass of NSCoder that
     *             implements the <MPSDeviceProvider> protocol  to
     *             tell MPS the MTLDevice to use.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSKernel
     * @param      device      The MTLDevice on which to make the MPSKernel
     * @return     A new MPSCNNBatchNormalizationGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNBatchNormalizationGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNBatchNormalizationGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initializes a batch normalization gradient kernel using a device and neuron descriptor.
     * 
     * @param      device                          The MTLDevice on which this filter will be used
     * @param      fusedNeuronDescriptor           A MPSNNNeuronDescriptor object which specifies a neuron activation function whose
     *                                             gradient should be applied prior to computing the resulting gradient.
     *                                             This neuron descriptor should match that used in the corresponding forward batch
     *                                             normalization kernel as well as the preceeding batch normalization statistics gradient
     *                                             kernel.
     * 
     * @return     A valid MPSCNNBatchNormalizationGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:fusedNeuronDescriptor:")
    public native MPSCNNBatchNormalizationGradient initWithDeviceFusedNeuronDescriptor(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, MPSNNNeuronDescriptor fusedNeuronDescriptor);

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