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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MPSCNNPoolingL2NormGradient
 * [@dependency] This depends on Metal.framework
 * 
 * Specifies the filter for computing the gradient of the L2-Norm pooling filter.
 * The operation backpropagates a gradient vector using chain rule.
 * 
 * L2-Norm pooling forward pass is defined as:
 * 
 * out(x) = sqrt( sum_{dx \in Window(x)} in(s*x+dx) * in(s*x+dx) ), where
 * 
 * the pooling window definition 'Window(x)' follows MPSCNNPooling specification and
 * 's' is the pixel stride and in() is the source input image.
 * 
 * Hence the partial derivative of the output value wrt. to the input value needed in the
 * gradient backpropagation in MPSCNNPoolingGradient is:
 * 
 * d out(x)/d in(y) = sum_{dx \in Window(x)} delta_{s*x+dx, y} in(s*x+dx) / out(x), where
 * 
 * delta_{x,y} is the Kronecker delta symbol for which
 * 
 * delta_{x,y} = { 1, when x == y
 * { 0, otherwise,
 * and out(x) is the L2-norm pooling value at point 'x' defined above.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNPoolingL2NormGradient extends MPSCNNPoolingGradient {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNPoolingL2NormGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNPoolingL2NormGradient alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNPoolingL2NormGradient allocWithZone(VoidPtr zone);

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

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
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
    public native MPSCNNPoolingL2NormGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNPoolingL2NormGradient initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSCNNPoolingL2NormGradient
     * @param device   The MTLDevice on which to make the MPSCNNPoolingL2NormGradient
     * @return A new MPSCNNPoolingL2NormGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNPoolingL2NormGradient initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNPoolingL2NormGradient initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNPoolingL2NormGradient initWithDeviceKernelWidthKernelHeight(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth,
            @NUInt long kernelHeight);

    /**
     * Initialize a gradient L2-norm pooling filter
     * 
     * @param device          The device the filter will run on
     * @param kernelWidth     The width of the kernel. Can be an odd or even value.
     * @param kernelHeight    The height of the kernel. Can be an odd or even value.
     * @param strideInPixelsX The input stride (upsampling factor) in the x dimension.
     * @param strideInPixelsY The input stride (upsampling factor) in the y dimension.
     * @return A valid MPSCNNPoolingL2NormGradient object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNPoolingL2NormGradient initWithDeviceKernelWidthKernelHeightStrideInPixelsXStrideInPixelsY(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth,
            @NUInt long kernelHeight, @NUInt long strideInPixelsX, @NUInt long strideInPixelsY);

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
    public static native MPSCNNPoolingL2NormGradient new_objc();

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
