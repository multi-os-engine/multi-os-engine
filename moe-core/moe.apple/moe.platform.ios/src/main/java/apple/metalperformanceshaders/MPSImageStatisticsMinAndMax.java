package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.struct.MTLRegion;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
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
 * MPSImageStatisticsMinAndMax
 * 
 * The MPSImageStatisticsMinAndMax computes the minimum and maximum pixel values for a given region of an image.
 * The min and max values are written to the destination image at the following pixel locations:
 * - min value is written at pixel location (0, 0)
 * - max value is written at pixel location (1, 0)
 * 
 * 
 * API-Since: 11.0
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageStatisticsMinAndMax extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageStatisticsMinAndMax(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageStatisticsMinAndMax alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageStatisticsMinAndMax allocWithZone(VoidPtr zone);

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

    /**
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSUnaryImageKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     * 
     * The clipRect specified in MPSUnaryImageKernel is used to control the origin in the destination texture
     * where the min, max values are written. The clipRect.width must be >=2. The clipRect.height must be >= 1.
     */
    @Generated
    @Selector("clipRectSource")
    @ByValue
    public native MTLRegion clipRectSource();

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
    public native MPSImageStatisticsMinAndMax init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageStatisticsMinAndMax initWithCoder(@NotNull NSCoder aDecoder);

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
    public native MPSImageStatisticsMinAndMax initWithCoderDevice(@NotNull NSCoder aDecoder,
            @NotNull @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to apply the statistics min-max operation on an image.
     * 
     * @param device The device the filter will run on
     * @return A valid MPSImageStatisticsMinAndMax object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSImageStatisticsMinAndMax initWithDevice(@NotNull @Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSImageStatisticsMinAndMax new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] clipRectSource
     * 
     * The source rectangle to use when reading data.
     * 
     * A MTLRegion that indicates which part of the source to read. If the clipRectSource does not lie
     * completely within the source image, the intersection of the image bounds and clipRectSource will
     * be used. The clipRectSource replaces the MPSUnaryImageKernel offset parameter for this filter.
     * The latter is ignored. Default: MPSRectNoClip, use the entire source texture.
     * 
     * The clipRect specified in MPSUnaryImageKernel is used to control the origin in the destination texture
     * where the min, max values are written. The clipRect.width must be >=2. The clipRect.height must be >= 1.
     */
    @Generated
    @Selector("setClipRectSource:")
    public native void setClipRectSource(@ByValue MTLRegion value);

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
