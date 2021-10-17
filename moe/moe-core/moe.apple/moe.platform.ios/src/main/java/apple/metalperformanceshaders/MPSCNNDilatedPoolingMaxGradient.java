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
 * MPSCNNDilatedPoolingMaxGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * Specifies the filter for computing the gradient of the dilated max pooling filter.
 * For details see comments on MPSCNNPoolingMaxGradient.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNDilatedPoolingMaxGradient extends MPSCNNPoolingGradient {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNDilatedPoolingMaxGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNDilatedPoolingMaxGradient alloc();

    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNDilatedPoolingMaxGradient allocWithZone(VoidPtr zone);

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
    public native MPSCNNDilatedPoolingMaxGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNDilatedPoolingMaxGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * See @ref MPSKernel#initWithCoder.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSCNNPoolingMaxGradient
     * @param device   The MTLDevice on which to make the MPSCNNPoolingMaxGradient
     * @return A new MPSCNNPoolingMaxGradient object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNDilatedPoolingMaxGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNDilatedPoolingMaxGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNDilatedPoolingMaxGradient initWithDeviceKernelWidthKernelHeight(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight);

    /**
     * Initialize a MPSCNNDilatedPoolingMaxGradient pooling filter
     *
     * @param device          The device the filter will run on
     * @param kernelWidth     The width of the kernel.  Can be an odd or even value.
     * @param kernelHeight    The height of the kernel.  Can be an odd or even value.
     * @param dilationRateX   The dilation rate in the x dimension.
     * @param dilationRateY   The dilation rate in the y dimension.
     * @param strideInPixelsX The output stride (downsampling factor) in the x dimension.
     * @param strideInPixelsY The output stride (downsampling factor) in the y dimension.
     * @return A valid MPSCNNDilatedPoolingMax object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:dilationRateX:dilationRateY:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNDilatedPoolingMaxGradient initWithDeviceKernelWidthKernelHeightDilationRateXDilationRateYStrideInPixelsXStrideInPixelsY(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth, @NUInt long kernelHeight,
            @NUInt long dilationRateX, @NUInt long dilationRateY, @NUInt long strideInPixelsX,
            @NUInt long strideInPixelsY);

    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:strideInPixelsX:strideInPixelsY:")
    public native MPSCNNDilatedPoolingMaxGradient initWithDeviceKernelWidthKernelHeightStrideInPixelsXStrideInPixelsY(
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
    public static native MPSCNNDilatedPoolingMaxGradient new_objc();

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
