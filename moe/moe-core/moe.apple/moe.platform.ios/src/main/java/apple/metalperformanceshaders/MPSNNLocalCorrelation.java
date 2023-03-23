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
 * MPSNNLocalCorrelation
 * 
 * The MPSNNLocalCorrelation filter computes the correlation between two images locally with a
 * varying offset on x-y plane between the two source images (controlled by the window and
 * stride properties) and the end result is summed over the feature channels. The results are
 * stored in the different feature channels of the destination image, ordered such that the offset
 * in the x direction is the faster running index.
 * 
 * Given two images A and B, the output image has (2*windowInX + 1)*(2*windowInY + 1)
 * feature channels, with each feature channel computed as:
 * O(x, y, f(m, n)) = sum_z{A(x, y, z) * B(x + M[m], y + N[n], z)}
 * where m runs from {0, 1, ... , (2*windowInX)}, n runs from {0, 1, ... , (2*windowInY)},
 * f(m, n) = n * (2*windowInY + 1) + m,
 * M = {-windowInX*strideInX, (-windowInX + 1)*strideInX, ... 0 ... , (windowInX - 1)*strideInX, windowInX*strideInX},
 * N = {-windowInY*strideInY, (-windowInY + 1)*strideInY, ... 0 ... , (windowInY - 1)*strideInY, windowInX*strideInY}
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSNNLocalCorrelation extends MPSNNReduceBinary {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSNNLocalCorrelation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSNNLocalCorrelation alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSNNLocalCorrelation allocWithZone(VoidPtr zone);

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
    public native MPSNNLocalCorrelation init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSNNLocalCorrelation initWithCoder(NSCoder aDecoder);

    /**
     * NSSecureCoding compatability
     * 
     * See @ref MPSKernel#initWithCoder.
     * 
     * @param aDecoder The NSCoder subclass with your serialized MPSCNNPooling
     * @param device   The MTLDevice on which to make the MPSCNNPooling
     * @return A new MPSCNNPooling object, or nil if failure.
     */
    @Generated
    @Selector("initWithCoder:device:")
    public native MPSNNLocalCorrelation initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Initialize the MPSNNLocalCorrelation filter with default property values.
     * 
     * @param device The device the filter will run on
     * @return A valid MPSNNReduceLocalCorrelation object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSNNLocalCorrelation initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to apply the local correlation operation on an image.
     * 
     * @param device    The device the filter will run on
     * @param windowInX Specifies a symmetric window around 0 for offsetting
     *                  the secondary source in the x dimension.
     * @param windowInY Specifies a symmetric window around 0 for offsetting
     *                  the secondary source in the y dimension.
     * @param strideInX Specifies the stride for the offset in the x dimension.
     * @param strideInY Specifies the stride for the offset in the y dimension.
     * @return A valid MPSNNReduceLocalCorrelation object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:windowInX:windowInY:strideInX:strideInY:")
    public native MPSNNLocalCorrelation initWithDeviceWindowInXWindowInYStrideInXStrideInY(
            @Mapped(ObjCObjectMapper.class) MTLDevice device, @NUInt long windowInX, @NUInt long windowInY,
            @NUInt long strideInX, @NUInt long strideInY);

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
    public static native MPSNNLocalCorrelation new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Specifies the stride for the offset in the x dimension.
     * 
     * strideInX must be > 0. The default value for strideInX is 1.
     */
    @Generated
    @Selector("setStrideInX:")
    public native void setStrideInX(@NUInt long value);

    /**
     * Specifies the stride for the offset in the y dimension.
     * 
     * strideInY must be > 0. The default value for strideInY is 1.
     */
    @Generated
    @Selector("setStrideInY:")
    public native void setStrideInY(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Specifies a symmetric window around 0 for offsetting the secondary source in the x dimension.
     * 
     * The default value for windowInX is 0.
     */
    @Generated
    @Selector("setWindowInX:")
    public native void setWindowInX(@NUInt long value);

    /**
     * Specifies a symmetric window around 0 for offsetting the secondary source in the y dimension.
     * 
     * The default value for windowInY is 0.
     */
    @Generated
    @Selector("setWindowInY:")
    public native void setWindowInY(@NUInt long value);

    /**
     * Specifies the stride for the offset in the x dimension.
     * 
     * strideInX must be > 0. The default value for strideInX is 1.
     */
    @Generated
    @Selector("strideInX")
    @NUInt
    public native long strideInX();

    /**
     * Specifies the stride for the offset in the y dimension.
     * 
     * strideInY must be > 0. The default value for strideInY is 1.
     */
    @Generated
    @Selector("strideInY")
    @NUInt
    public native long strideInY();

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
     * Specifies a symmetric window around 0 for offsetting the secondary source in the x dimension.
     * 
     * The default value for windowInX is 0.
     */
    @Generated
    @Selector("windowInX")
    @NUInt
    public native long windowInX();

    /**
     * Specifies a symmetric window around 0 for offsetting the secondary source in the y dimension.
     * 
     * The default value for windowInY is 0.
     */
    @Generated
    @Selector("windowInY")
    @NUInt
    public native long windowInY();
}
