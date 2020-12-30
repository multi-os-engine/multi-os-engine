package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * @class MPSCNNPoolingMaxGradient
 * @dependency This depends on Metal.framework
 * @discussion Specifies the filter for computing the gradient of the max pooling filter.
 *             The operation backpropagates a gradient vector using chain rule.
 * 
 *             Dilated Max pooling forward pass is defined as:
 * 
 *                 out(x) = max_{dx \in Window(x)} in(s*x+D*dx), where
 * 
 *             the pooling window definition 'Window(x)' follows MPSCNNPooling specification,
 *             's' is the pixel stride and in() is the source input image and D is the dilation factor.
 *             For MPSCNNPoolingMaxGradient the dilationRate 'D' is one. NOTE: For even-sized pooling
 *             windows with dilation rate greater than one the effective pooling window is centered
 *             around s*x with non-even windows leaning towards top-left corner. For example if
 *             kernel width = 2, dilation rate = 3, then the pooling considers positions '-2' and '+1'
 *             relative to the pooling window center 's*x'.
 * 
 *             Hence the partial derivative of the output value wrt. to the input value needed in the
 *             gradient backpropagation in MPSCNNPoolingGradient is:
 * 
 *                 d out(x)/d in(y) = delta_{x_m, y}, where
 * 
 *             delta_{x,y} is the Kronecker delta symbol (see MPSCNNPoolingAverageGradient) and x_m
 *             is the index of the maximum value in the corresponding pooling window.
 * 
 *             In practice this means that the gradient value for the destination image at pixel 'x' is
 *             the sum over these contributions coming from all pooling windows that contribute
 *             to the max pooling computation in the forward pass, multiplied by the input
 *             gradient value in the source area of the corresponding pooling window. If there are
 *             multiple maximal values within a single pooling window one of them is picked for the
 *             gradient and this decision is implementation specific, which means that it can vary
 *             between different architectures and even between different filter parameters.
 * 
 *             Note: The gradient max pooling needs the secondary input image in order to compute
 *             the indices of maximal values for each pooling window, but this means redundant computations.
 *             Later we may add encode calls to MPSCNNPoolingMax that produce a state that contains the
 *             coordinates of the maximal values to be consumed by the gradient filters.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNPoolingMaxGradient extends MPSCNNPoolingGradient {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNPoolingMaxGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNPoolingMaxGradient alloc();

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
    public native MPSCNNPoolingMaxGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNPoolingMaxGradient initWithCoder(NSCoder aDecoder);

    /**
     * @abstract NSSecureCoding compatability
     * @discussion See @ref MPSKernel#initWithCoder.
     * @param      aDecoder    The NSCoder subclass with your serialized MPSCNNPoolingMaxGradient
     * @param      device      The MTLDevice on which to make the MPSCNNPoolingMaxGradient
     * @return     A new MPSCNNPoolingMaxGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNPoolingMaxGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNPoolingMaxGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNPoolingMaxGradient initWithDeviceKernelWidthKernelHeight(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight);

    /**
     * @abstract  Initialize a gradient max pooling filter
     * @param      device              The device the filter will run on
     * @param      kernelWidth         The width of the kernel.  Can be an odd or even value.
     * @param      kernelHeight        The height of the kernel.  Can be an odd or even value.
     * @param      strideInPixelsX     The input stride (upsampling factor) in the x dimension.
     * @param      strideInPixelsY     The input stride (upsampling factor) in the y dimension.
     * @return     A valid MPSCNNPoolingGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNPoolingMaxGradient initWithDeviceKernelWidthKernelHeightStrideInPixelsXStrideInPixelsY(
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