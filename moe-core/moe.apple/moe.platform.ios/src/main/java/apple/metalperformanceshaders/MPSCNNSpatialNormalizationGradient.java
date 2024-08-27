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
 * MPSCNNSpatialNormalizationGradient
 * [@dependency] This depends on Metal.framework
 * 
 * Specifies the spatial normalization gradient filter.
 * The spatial normalization for a feature channel applies the filter over local regions which extend
 * spatially, but are in separate feature channels (i.e., they have shape 1 x kernelWidth x kernelHeight).
 * For each feature channel, the function computes the sum of squares of X inside each rectangle, N2(i,j).
 * It then divides each element of X as follows:
 * Y(i,j) = X(i,j) / (delta + alpha/(kw*kh) * N2(i,j))^beta,
 * where kw and kh are the kernelWidth and the kernelHeight.
 * It is the end-users responsibility to ensure that the combination of the
 * parameters delta and alpha does not result in a situation where the denominator
 * becomes zero - in such situations the resulting pixel-value is undefined.
 * 
 * T(i,j) = (delta + alpha/(kw*kh) * N2(i,j))
 * N = kw * kh
 * 
 * OutputGradient:
 * dZ/dX(i,j) = T(i,j)^(-beta) * ( dZ/dY(i,j) - (2*alpha*beta*X(i,j)/T(i,j)) * (sum_{l,k in L(i),K(j)}
 * dZ/dY(l,k)*X(l,k)) )
 * N is the kernel size. The window R(k) itself is defined as:
 * L(i) = [i-floor((kw-1)/2), i+floor(kw/2]
 * K(j) = [j-floor((kh-1)/2), j+floor(kh/2]
 * 
 * For correct gradient computation all parameters must be the same as the original normalization filter.
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSCNNSpatialNormalizationGradient extends MPSCNNGradientKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSCNNSpatialNormalizationGradient(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSCNNSpatialNormalizationGradient alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSCNNSpatialNormalizationGradient allocWithZone(VoidPtr zone);

    /**
     * [@property] alpha
     * 
     * The value of alpha. Default is 1.0. Must be non-negative.
     */
    @Generated
    @Selector("alpha")
    public native float alpha();

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 5.0
     */
    @Generated
    @Selector("beta")
    public native float beta();

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

    /**
     * [@property] delta
     * 
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
    public native MPSCNNSpatialNormalizationGradient init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSCNNSpatialNormalizationGradient initWithCoder(@NotNull NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
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
    public native MPSCNNSpatialNormalizationGradient initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    @Generated
    @Selector("initWithDevice:")
    public native MPSCNNSpatialNormalizationGradient initWithDevice(
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize a spatial normalization filter
     * 
     * @param device       The device the filter will run on
     * @param kernelWidth  The width of the kernel
     * @param kernelHeight The height of the kernel
     * @return A valid MPSCNNSpatialNormalization object or nil, if failure.
     * 
     *         NOTE: For now, kernelWidth must be equal to kernelHeight
     */
    @Generated
    @Selector("initWithDevice:kernelWidth:kernelHeight:")
    public native MPSCNNSpatialNormalizationGradient initWithDeviceKernelWidthKernelHeight(
            @NotNull @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long kernelWidth,
            @NUInt long kernelHeight);

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
    public static native MPSCNNSpatialNormalizationGradient new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] alpha
     * 
     * The value of alpha. Default is 1.0. Must be non-negative.
     */
    @Generated
    @Selector("setAlpha:")
    public native void setAlpha(float value);

    /**
     * [@property] beta
     * 
     * The value of beta. Default is 5.0
     */
    @Generated
    @Selector("setBeta:")
    public native void setBeta(float value);

    /**
     * [@property] delta
     * 
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

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
