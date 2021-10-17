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
 * MPSCNNPoolingAverageGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * Specifies the filter for computing the gradient of the average pooling filter.
 * The operation backpropagates a gradient vector using chain rule.
 * <p>
 * Average pooling forward pass is defined as:
 * <p>
 * out(x) = sum_{dx \in Window(x)} in(s*x+dx) / N(x), where
 * <p>
 * the pooling window definition 'Window(x)' follows MPSCNNPooling specification,
 * 'N(x)' is effective pooling window size in pixels as specified in MPSCNNPoolingAverage,
 * 's' is the pixel stride and in() is the source input image.
 * <p>
 * Hence the partial derivative of the output value wrt. to the input value needed in the
 * gradient backpropagation in MPSCNNPoolingGradient is:
 * <p>
 * d out(x)/d in(y) = sum_{dx \in Window(x)} delta_{s*x+dx, y} / N(x), where
 * <p>
 * delta_{x,y} is the Kronecker delta symbol for which
 * <p>
 * delta_{x,y} =  {  1, when x == y
 * {  0, otherwise.
 * <p>
 * In practice this means that the gradient value for the destination image at pixel 'x' is
 * the sum over these contributions coming from all pooling windows that contribute
 * to the average pooling computation in the forward pass, multiplied by the input
 * gradient value in the source area of the corresponding pooling window.
 * <p>
 * Note: As average pooling is a linear operation of its inputs, the gradient does not
 * depend at all on the original input values, but the original input image size is needed
 * so that we know the limits where the input values seize to exist to inhibit accumulation
 * of gradient values for those pixels. Therefore, as secondary input, any correctly sized
 * image will produce correct results for the gradient backpropagation and hence it is
 * recommended to use a temporary image of correct size (see MPSTemporaryImage) for the
 * secondary source image parameter.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNPoolingAverageGradient extends MPSCNNPoolingGradient {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNPoolingAverageGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNPoolingAverageGradient alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNPoolingAverageGradient allocWithZone(VoidPtr zone);

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
    public native MPSCNNPoolingAverageGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNPoolingAverageGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * See @ref MPSKernel#initWithCoder.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSCNNPoolingAverageGradient
     * @param device   The MTLDevice on which to make the MPSCNNPoolingAverageGradient
     * @return A new MPSCNNPoolingAverageGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNPoolingAverageGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNPoolingAverageGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNPoolingAverageGradient initWithDeviceKernelWidthKernelHeight(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight);

    /**
     * Initialize a gradient average pooling filter
     *
     * @param device          The device the filter will run on
     * @param kernelWidth     The width of the kernel.  Can be an odd or even value.
     * @param kernelHeight    The height of the kernel.  Can be an odd or even value.
     * @param strideInPixelsX The input stride (upsampling factor) in the x dimension.
     * @param strideInPixelsY The input stride (upsampling factor) in the y dimension.
     * @return A valid MPSCNNPoolingGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNPoolingAverageGradient initWithDeviceKernelWidthKernelHeightStrideInPixelsXStrideInPixelsY(
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
    public static native MPSCNNPoolingAverageGradient new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * [@property]   zeroPadSizeX
     * <p>
     * How much zero padding to apply to both left and right borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("setZeroPadSizeX:")
    public native void setZeroPadSizeX(@NUInt long value);

    /**
     * [@property]   zeroPadSizeY
     * <p>
     * How much zero padding to apply to both top and bottom borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("setZeroPadSizeY:")
    public native void setZeroPadSizeY(@NUInt long value);

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

    /**
     * [@property]   zeroPadSizeX
     * <p>
     * How much zero padding to apply to both left and right borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("zeroPadSizeX")
    @NUInt
    public native long zeroPadSizeX();

    /**
     * [@property]   zeroPadSizeY
     * <p>
     * How much zero padding to apply to both top and bottom borders of the input image for average pooling,
     * when using @see edgeMode MPSImageEdgeModeClamp. For @see edgeMode MPSImageEdgeModeZero this property is
     * ignored and the area outside the image is interpreted to contain zeros.
     * The zero padding size is used to shrink the pooling window to fit inside the area bound by the source image
     * and its padding region, but the effect is that the normalization factor of the average computation is computed
     * also for the zeros in the padding region.
     */
    @Generated
    @Selector("zeroPadSizeY")
    @NUInt
    public native long zeroPadSizeY();
}
