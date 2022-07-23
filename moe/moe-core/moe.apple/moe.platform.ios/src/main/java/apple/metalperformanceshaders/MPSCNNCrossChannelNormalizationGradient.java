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
 * MPSCNNCrossChannelNormalizationGradient
 * [@dependency] This depends on Metal.framework
 * <p>
 * Specifies the normalization gradient filter across feature channels.
 * This normalization filter applies the filter to a local region across nearby feature channels,
 * but with no spatial extent (i.e., they have shape kernelSize x 1 x 1).
 * The normalized output is given by:
 * Y(i,j,k) = X(i,j,k) / L(i,j,k)^beta,
 * where the normalizing factor is:
 * L(i,j,k) = delta + alpha/N * (sum_{q in Q(k)} X(i,j,q)^2, where
 * N is the kernel size. The window Q(k) itself is defined as:
 * Q(k) = [max(0, k-floor(N/2)), min(D-1, k+floor((N-1)/2)], where
 * <p>
 * k is the feature channel index (running from 0 to D-1) and
 * D is the number of feature channels, and alpha, beta and delta are paremeters.
 * It is the end-users responsibility to ensure that the combination of the
 * parameters delta and alpha does not result in a situation where the denominator
 * becomes zero - in such situations the resulting pixel-value is undefined.
 * <p>
 * OutputGradient:
 * dZ/dX(i,j,k) = dZ/dY(i,j,k) * (L(i,j,k)^-beta) - 2 * alpha * beta * X(i,j,k) * ( sum_{r in R(k)} dZ/dY(i,j,r) *
 * X(i,j,r) * (L(i,j,r) ^ (-beta-1)) )
 * N is the kernel size. The window L(i) and K(j) itself is defined as:
 * R(k) = [max(0, k-floor((N-1)/2)), min(D-1, k+floor(N/2)]
 * <p>
 * For correct gradient computation all parameters must be the same as the original normalization filter.
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNCrossChannelNormalizationGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNCrossChannelNormalizationGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNCrossChannelNormalizationGradient alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNCrossChannelNormalizationGradient allocWithZone(VoidPtr zone);

    /**
     * [@property] alpha
     * <p>
     * The value of alpha. Default is 1.0. Must be non-negative.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * [@property] beta
     * <p>
     * The value of beta. Default is 5.0
     */
    @Generated
    @Selector("beta")
    public native float beta();

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

    /**
     * [@property] delta
     * <p>
     * The value of delta. Default is 1.0
     */
    @Generated
    @Selector("delta")
    public native float delta();

    @Generated
    @Selector("description")
    public static native String description_static();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MPSCNNCrossChannelNormalizationGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNCrossChannelNormalizationGradient initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * <p>
     * While the standard NSSecureCoding/NSCoding method
     * -initWithCoder: should work, since the file can't
     * know which device your data is allocated on, we
     * have to guess and may guess incorrectly. To avoid
     * that problem, use initWithCoder:device instead.
     *
     * @param aDecoder The NSCoder subclass with your serialized MPSKernel
     * @param device   The MTLDevice on which to make the MPSKernel
     * @return A new MPSKernel object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSCNNCrossChannelNormalizationGradient initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNCrossChannelNormalizationGradient initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a cross channel normalization gradient filter
     *
     * @param device     The device the filter will run on
     * @param kernelSize The kernel filter size in each dimension.
     * @return A valid MPSCNNCrossChannelNormalization object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:kernelSize:")
    public native MPSCNNCrossChannelNormalizationGradient initWithDeviceKernelSize(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelSize);

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
     * [@property] kernelSize
     * <p>
     * The size of the square filter window. Default is 5
     */
    @Generated
    @Selector("kernelSize")
    @NUInt
    public native long kernelSize();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native MPSCNNCrossChannelNormalizationGradient new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] alpha
     * <p>
     * The value of alpha. Default is 1.0. Must be non-negative.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(float value);

    /**
     * [@property] beta
     * <p>
     * The value of beta. Default is 5.0
     */
    @Generated
    @Selector("setBeta:")
    public native void setBeta(float value);

    /**
     * [@property] delta
     * <p>
     * The value of delta. Default is 1.0
     */
    @Generated
    @Selector("setDelta:")
    public native void setDelta(float value);

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
