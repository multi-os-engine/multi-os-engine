package apple.metalperformanceshaders;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
 * MPSImageEuclideanDistanceTransform
 * 
 * Perform a Euclidean Distance Transform
 * 
 * API-Since: 11.3
 */
@Generated
@Library("MetalPerformanceShaders")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPSImageEuclideanDistanceTransform extends MPSUnaryImageKernel {
    static {
        NatJ.register();
    }

    @Generated
    protected MPSImageEuclideanDistanceTransform(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MPSImageEuclideanDistanceTransform alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MPSImageEuclideanDistanceTransform allocWithZone(VoidPtr zone);

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
    public native MPSImageEuclideanDistanceTransform init();

    @Generated
    @Selector("initWithCoder:")
    public native MPSImageEuclideanDistanceTransform initWithCoder(NSCoder aDecoder);

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
    public native MPSImageEuclideanDistanceTransform initWithCoderDevice(NSCoder aDecoder,
            @Mapped(ObjCObjectMapper.class) Object device);

    /**
     * Specifies information to apply the statistics min-max operation on an image.
     * 
     * @param device The device the filter will run on
     * @return A valid MPSImageEuclideanDistanceTransform object or nil, if failure.
     */
    @Generated
    @Selector("initWithDevice:")
    public native MPSImageEuclideanDistanceTransform initWithDevice(@Mapped(ObjCObjectMapper.class) Object device);

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
    public static native MPSImageEuclideanDistanceTransform new_objc();

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

    /**
     * [@property] searchLimitRadius
     * 
     * Defines a search scope size around output pixel to limit closest non-zero pixel search. Optional variable.
     * 
     * When the non-zeroes in the input image are on average very far away from each other (ie. the distances are
     * large),
     * the distance calculation algorithm has to work harder to find the closest pixel. If you don't care about getting
     * exact
     * results beyond a certain distance you can use this property to limit the search space and speed up the kernels.
     * In case there are no non-zero pixels within this search scope around the output pixel, then the output value will
     * be some number that is larger than this search limit. Normally you should be fine with the default value of
     * FLT_MAX,
     * which results in the exact EDT, so use this only if you need additional performance.
     * Typical good values are: 32, 64, 96, 128.
     * Default: FLT_MAX
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("searchLimitRadius")
    public native float searchLimitRadius();

    /**
     * [@property] searchLimitRadius
     * 
     * Defines a search scope size around output pixel to limit closest non-zero pixel search. Optional variable.
     * 
     * When the non-zeroes in the input image are on average very far away from each other (ie. the distances are
     * large),
     * the distance calculation algorithm has to work harder to find the closest pixel. If you don't care about getting
     * exact
     * results beyond a certain distance you can use this property to limit the search space and speed up the kernels.
     * In case there are no non-zero pixels within this search scope around the output pixel, then the output value will
     * be some number that is larger than this search limit. Normally you should be fine with the default value of
     * FLT_MAX,
     * which results in the exact EDT, so use this only if you need additional performance.
     * Typical good values are: 32, 64, 96, 128.
     * Default: FLT_MAX
     * 
     * API-Since: 14.0
     */
    @Generated
    @Selector("setSearchLimitRadius:")
    public native void setSearchLimitRadius(float value);
}
