package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLDevice;
import apple.metal.struct.MTLSize;
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
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * MPSCNNPoolingGradient
 * [@dependency] This depends on Metal.framework
 * 
 * Specifies the base class for computing the gradient of the pooling filters.
 *             The operation backpropagates a gradient vector using the chain rule.
 * 
 *             Given the input gradient vector dL(x) = dL/d out(x), which is the derivative of the
 *             loss-function wrt. (original) pooling filter output the output gradient at position y
 *             (dL/d in(y)) is computed as follows:
 * 
 *                 dL/d in(y) = sum_x (dL/d out(x)) * (d out(x)/d in(y)), where
 * 
 *             the sum runs over the input gradient pixels starting from primaryOffset
 *             extending to primaryOffset + sourceSize. Note here that we need a separate
 *             variable 'sourceSize' to specify which input gradients are included in the output
 *             gradient computation as this information cannot be deduced directly from the cliprect
 *             size due to fractional striding or simply because the user wants to examine a subset
 *             of the contributions to the gradients. In normal operation the sourceSize is specified
 *             as the cliprect.size of the forward pooling filter in order to compute the gradients for
 *             all outputs the forward direction produced and the primaryOffset is set to
 *             cliprect.origin of the original forward pooling operation for the same reason.
 * 
 *             The cliprect property of the filter allows the user to send the gradients to a new location,
 *             which may not match the original forward pooling filter window locations:
 *             The index 'y' in the formula above refers to the pixel location in the secondary source,
 *             which is the source image of the original forward pooling filter and secondaryOffset specifies
 *             the center of the first pooling window as specified in MPSCNNPooling filter specification.
 *             The first (top leftmost) pixel written into the cliprect computes the derivative of the first pixel
 *             within the first pooling window that is contained within the secondary source image and
 *             subsequent values are defined by normal striding rules from secondary source to primary source.
 *             This means that typically the cliprect is set to fill the effective source area of the original forward
 *             operation, clamped to edges of the original source image, which in the normal case is the same size
 *             as the size of the gradient destination image.
 * 
 *             If there are any values in the destination cliprect that do not contribute to the forward
 *             pooling result in the area specified by primaryOffset and sourceSize,
 *             due to large strides or dilation factors or simply because all forward pass induced values would be
 *             outside the source area, then those result values are set to zero.
 * 
 *             The actual value of d out(x) / d in(y) depends on the pooling operation and these are defined in the
 *             subclasses of MPSCNNPoolingGradient.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNPoolingGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNPoolingGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNPoolingGradient alloc();

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

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNPoolingGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNPoolingGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param      aDecoder    The NSCoder subclass with your serialized MPSCNNPoolingGradient
     * @param      device      The MTLDevice on which to make the MPSCNNPoolingGradient
     * @return     A new MPSCNNPooling object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNPoolingGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNPoolingGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a gradient pooling filter
     * 
     * @param      device              The device the filter will run on
     * @param      kernelWidth         The width of the kernel.  Can be an odd or even value.
     * @param      kernelHeight        The height of the kernel.  Can be an odd or even value.
     * @return     A valid MPSCNNPoolingGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNPoolingGradient initWithDeviceKernelWidthKernelHeight(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight);

    /**
     * Initialize a gradient pooling filter
     * 
     * @param      device              The device the filter will run on
     * @param      kernelWidth         The width of the kernel.  Can be an odd or even value.
     * @param      kernelHeight        The height of the kernel.  Can be an odd or even value.
     * @param      strideInPixelsX     The input stride (upsampling factor) in the x dimension.
     * @param      strideInPixelsY     The input stride (upsampling factor) in the y dimension.
     * @return     A valid MPSCNNPoolingGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNPoolingGradient initWithDeviceKernelWidthKernelHeightStrideInPixelsXStrideInPixelsY(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight,
            @NUInt long strideInPixelsX, @NUInt long strideInPixelsY);

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

    /**
     * [@property]   sourceSize
     * 
     * An optional source size which defines together with primaryOffset, the set of input gradient
     *             pixels to take into account in the gradient computations.
     * 
     * A MTLSize that together with primaryOffset indicates which part of the source gradient to consider.
     *             If the area does not lie completely within the primary source image, the intersection between
     *             source area rectangle and primary source bounds is used.
     *             Default: A size where every component is NSUIntegerMax indicating the entire rest of the image,
     *             starting from an offset (see primaryOffset).
     */
    @Generated
    @Selector("setSourceSize:")
    public native void setSourceSize(@ByValue MTLSize value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   sourceSize
     * 
     * An optional source size which defines together with primaryOffset, the set of input gradient
     *             pixels to take into account in the gradient computations.
     * 
     * A MTLSize that together with primaryOffset indicates which part of the source gradient to consider.
     *             If the area does not lie completely within the primary source image, the intersection between
     *             source area rectangle and primary source bounds is used.
     *             Default: A size where every component is NSUIntegerMax indicating the entire rest of the image,
     *             starting from an offset (see primaryOffset).
     */
    @Generated
    @Selector("sourceSize")
    @ByValue
    public native MTLSize sourceSize();

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