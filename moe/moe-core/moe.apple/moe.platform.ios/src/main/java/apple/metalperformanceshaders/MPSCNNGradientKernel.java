package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandBuffer;
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
 * MPSCNNGradientKernel
 * 
 * Gradient kernels are the backwards pass of a MPSCNNKernel
 *               used during training to calculate gradient back propagation.
 *               These take as arguments the gradient result from the next filter
 *               and the source image for the forward version of the filter.
 *               There is also a MPSNNGradientState passed from MPSCNNKernel
 *               to MPSCNNGradientKernel that contains information about the
 *               MPSCNNKernel parameters at the time it encoded and possibly
 *               also additional MTLResources to enable it to do its job.
 * 
 * [@code]
 *           Training graph (partial):
 * 
 *               ---> input image ---------> MPSCNNKernel ------>  resultImage ------>-->-->-->.
 *                              \                  |                                           |
 *                               '------.    MPSNNGradientState                         loss estimation
 *                                       \         |                                           |
 *                                        V        V                                           V
 *               <--- result gradient <- MPSCNNGradientKernel <---  input gradient <--<--<--<---'
 * 
 *               In general operation, starting with the input image, the sequence of events is:
 *               1a)  Invoke padding policy to find result size for MPSCNNKernel.  This
 *                    also configures some MPSCNNKernel parameters such as offset.
 *               1b)  Use the MPSImageDescriptor from 1a to make resultImage.
 *               1c)  Call MPSCNNKernel -encode...
 *               2) stages 1a-c are repeated for other forward passes in the inference portion of the graph
 *               3) We estimate the loss resulting from the whole inference computation so far (see MPSCNNLoss.h>
 *               4) stages 5a-c are repeated for corresponding backward gradient passes in the graph
 *               5a) Invoke padding policy on the MPSCNNGradientKernel shown above. This sets the
 *                   MPSCNNGradientKernel parameters to correspond with those in the forward pass
 *               5b) The result gradient for the MPSCNNGradientKernel is created from the MPSImageDescriptor from 5a
 *               5c) Call MPSCNNGradientKernel -encode with the input image, input gradient, result gradient and MPSNNGradientState
 *               6) pass the result gradient on to leftward gradient passes.
 * [@endcode]
 * 
 *               For MPSCNNKernels that are trained, there may be other accompanying training kernels that
 *               need to be called in addition to the gradient kernel to update convolution weights or batch
 *               normalization parameters, for example. Steps 1a-c and 5a-c can be combined in a single -encode
 *               call. These return the result image or gradient out the left hand side.
 * 
 *               For purposes of inheritance the gradient image is the MPSCNNBinaryKernel primary image
 *               and the source image is the MPSCNNBinaryKernel secondary image. Various secondary properties
 *               such as kernel size are copies of the forward inference pass parameters of similar name
 *               are set automatically when -[MPSCNNGradientKernel destinationImageDescriptorForSourceImages:sourceStates:]
 *               is called.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNGradientKernel extends MPSCNNBinaryKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNGradientKernel(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNGradientKernel alloc();

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
     * Encode a gradient filter and return a gradient
     * 
     * During training, gradient filters are used to calculate the gradient
     *             associated with the loss for each feature channel in the forward pass
     *             source image. For those nodes that are trainable, these are then used
     *             to refine the value used in the trainable parameter. They consume
     *             a source gradient image which contains the gradients corresponding
     *             with the forward pass destination image, and calculate the gradients
     *             corresponding to the forward pass source image.
     * 
     *             A gradient filter consumes a MPSNNGradientState object which captured
     *             various forward pass properties such as offset and edgeMode at the time
     *             the forward pass was encoded. These are transferred to the MPSCNNBinaryKernel
     *             secondary image properties automatically when this method creates its
     *             destination image.
     * 
     * @param      commandBuffer   The MTLCommandBuffer on which to encode
     * @param      sourceGradient  The gradient image from the "next" filter in the graph (in the inference direction)
     * @param      sourceImage     The image used as source image by the forward inference pass
     * @param      gradientState   The MPSNNGradientState or MPSNNBinaryGradientState subclass produced by the forward
     *                             inference pass
     * @return   The result gradient from the gradient filter
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceGradient:sourceImage:gradientState:")
    public native MPSImage encodeToCommandBufferSourceGradientSourceImageGradientState(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceGradient,
            MPSImage sourceImage, MPSState gradientState);

    /**
     * Encode a gradient filter and return a gradient
     * 
     * During training, gradient filters are used to calculate the gradient
     *             associated with the loss for each feature channel in the forward pass
     *             source image. For those nodes that are trainable, these are then used
     *             to refine the value used in the trainable parameter. They consume
     *             a source gradient image which contains the gradients corresponding
     *             with the forward pass destination image, and calculate the gradients
     *             corresponding to the forward pass source image.
     * 
     *             A gradient filter consumes a MPSNNGradientState object which captured
     *             various forward pass properties such as offset and edgeMode at the time
     *             the forward pass was encoded. These are transferred to the MPSCNNBinaryKernel
     *             secondary image properties automatically when you use -[MPSCNNGradientKernel
     *             destinationImageDescriptorForSourceImages:sourceStates:]. If you do not call
     *             this method, then you are responsible for configuring all of the primary and
     *             secondary image properties in MPSCNNBinaryKernel. Please see class description
     *             for expected ordering of operations.
     * 
     * @param      commandBuffer   The MTLCommandBuffer on which to encode
     * @param      sourceGradient  The gradient image from the "next" filter in the graph
     * @param      sourceImage     The image used as source image from the forward pass
     * @param      gradientState   The MPSNNGradientState and MPSNNBinaryGradientState subclass produced by the
     *                             forward pass
     * @param      destinationGradient  The MPSImage into which to write the filter result
     */
    @Generated
    @Selector("encodeToCommandBuffer:sourceGradient:sourceImage:gradientState:destinationGradient:")
    public native void encodeToCommandBufferSourceGradientSourceImageGradientStateDestinationGradient(
            @Mapped(ObjCObjectMapper.class) MTLCommandBuffer commandBuffer, MPSImage sourceGradient,
            MPSImage sourceImage, MPSState gradientState, MPSImage destinationGradient);

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNGradientKernel init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNGradientKernel initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * While the standard NSSecureCoding/NSCoding method
     *             -initWithCoder: should work, since the file can't
     *             know which device your data is allocated on, we
     *             have to guess and may guess incorrectly.  To avoid
     *             that problem, use initWithCoder:device instead.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSKernel
     * @param      device      The MTLDevice on which to make the MPSKernel
     * @return     A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNGradientKernel initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Standard init with default properties per filter type
     * 
     * @param      device      The device that the filter will be used on. May not be NULL.
     * @return     A pointer to the newly initialized object. This will fail, returning
     *             nil if the device is not supported. Devices must be
     *             MTLFeatureSet_iOS_GPUFamily2_v1 or later.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNGradientKernel initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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

    /**
     * [@property]   kernelOffsetX
     * 
     * Offset in the kernel reference frame to position the kernel in the X dimension
     * 
     * In some cases, the input gradient must be upsampled with zero insertion
     *             to account for things like strides in the forward MPSCNNKernel pass.
     *             As such, the offset, which describes a X,Y offset in the source coordinate
     *             space is insufficient to fully describe the offset applied to a kernel.
     *             The kernel offset is the offset after upsampling. Both the source offset
     *             and kernel offset are additive:  effective offset = source offset * stride + kernel offset.
     *             The offset is applied to the (upsampled) source gradient
     */
    @Generated
    @Selector("kernelOffsetX")
    @NInt
    public native long kernelOffsetX();

    /**
     * [@property]   kernelOffsetY
     * 
     * Offset in the kernel reference frame to position the kernel in the Y dimension
     * 
     * In some cases, the input gradient must be upsampled with zero insertion
     *             to account for things like strides in the forward MPSCNNKernel pass.
     *             As such, the offset, which describes a X,Y offset in the source coordinate
     *             space is insufficient to fully describe the offset applied to a kernel.
     *             The kernel offset is the offset after upsampling. Both the source offset
     *             and kernel offset are additive:  effective offset = source offset * stride + kernel offset.
     *              The offset is applied to the (upsampled) source gradient
     */
    @Generated
    @Selector("kernelOffsetY")
    @NInt
    public native long kernelOffsetY();

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

    /**
     * [@property]   kernelOffsetX
     * 
     * Offset in the kernel reference frame to position the kernel in the X dimension
     * 
     * In some cases, the input gradient must be upsampled with zero insertion
     *             to account for things like strides in the forward MPSCNNKernel pass.
     *             As such, the offset, which describes a X,Y offset in the source coordinate
     *             space is insufficient to fully describe the offset applied to a kernel.
     *             The kernel offset is the offset after upsampling. Both the source offset
     *             and kernel offset are additive:  effective offset = source offset * stride + kernel offset.
     *             The offset is applied to the (upsampled) source gradient
     */
    @Generated
    @Selector("setKernelOffsetX:")
    public native void setKernelOffsetX(@NInt long value);

    /**
     * [@property]   kernelOffsetY
     * 
     * Offset in the kernel reference frame to position the kernel in the Y dimension
     * 
     * In some cases, the input gradient must be upsampled with zero insertion
     *             to account for things like strides in the forward MPSCNNKernel pass.
     *             As such, the offset, which describes a X,Y offset in the source coordinate
     *             space is insufficient to fully describe the offset applied to a kernel.
     *             The kernel offset is the offset after upsampling. Both the source offset
     *             and kernel offset are additive:  effective offset = source offset * stride + kernel offset.
     *              The offset is applied to the (upsampled) source gradient
     */
    @Generated
    @Selector("setKernelOffsetY:")
    public native void setKernelOffsetY(@NInt long value);

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