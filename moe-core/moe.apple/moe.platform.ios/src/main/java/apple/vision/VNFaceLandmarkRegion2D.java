package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
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
import org.moe.natj.general.ann.UncertainReturn;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGSize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * VNFaceLandmarkRegion2D
 * 
 * VNFaceLandmarkRegion2D gives access to the 2D landmark points for the region. The points are stored as vector_float2
 * and must not be modified.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNFaceLandmarkRegion2D extends VNFaceLandmarkRegion {
    static {
        NatJ.register();
    }

    @Generated
    protected VNFaceLandmarkRegion2D(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNFaceLandmarkRegion2D alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNFaceLandmarkRegion2D allocWithZone(VoidPtr zone);

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
    public native VNFaceLandmarkRegion2D init();

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
    public static native VNFaceLandmarkRegion2D new_objc();

    /**
     * Obtains the array of normalized landmark points.
     * 
     * Provides the address of a buffer containing the array of CGPoints representing the landmark points. This buffer
     * is owned by the target object and is guaranteed to exist as long as the VNFaceLandmarkRegion2D does.
     * 
     * @return the address of the array of pointCount points.
     */
    @Nullable
    @Generated
    @Selector("normalizedPoints")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CGPoint normalizedPoints();

    /**
     * Provides the array of landmark points in the coordinate space of a specific image size.
     * 
     * Provides the address of a buffer containing the array of CGPoints representing the landmark points in the
     * coordinate space of a specific image size. This buffer is owned by the target object and is guaranteed to exist
     * as long as the VNFaceLandmarkRegion2D does.
     * 
     * @param imageSize The pixel dimensions of the image in which the landmark points are being presented.
     * 
     * @return the address of the array of pointCount points, or NULL if the conversion could not take place.
     */
    @NotNull
    @Generated
    @Selector("pointsInImageOfSize:")
    @UncertainReturn("Options: reference, array Fallback: reference")
    public native CGPoint pointsInImageOfSize(@ByValue CGSize imageSize);

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
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("initWithCoder:")
    public native VNFaceLandmarkRegion2D initWithCoder(@NotNull NSCoder coder);

    /**
     * Obtains the array of accuracy placement estimates per landmark point.
     * 
     * Provides the NSArray object containing landmarks accuracy placement estimates per landmark point. This property
     * is only
     * populated when VNDetectFaceLandmarksRequest object is configured with
     * VNRequestFaceLandmarksConstellation76Points. It is
     * set to nil for other constellations
     * 
     * @return NSArray object of NSNumber(s) initialized to floating point values.
     * 
     *         API-Since: 13.0
     */
    @Nullable
    @Generated
    @Selector("precisionEstimatesPerPoint")
    public native NSArray<? extends NSNumber> precisionEstimatesPerPoint();

    @Generated
    @Selector("supportsSecureCoding")
    public static native boolean supportsSecureCoding();

    @Generated
    @ProtocolClassMethod("supportsSecureCoding")
    public boolean _supportsSecureCoding() {
        return supportsSecureCoding();
    }

    /**
     * Describes how to interpret the points provided by the region.
     * 
     * API-Since: 16.0
     */
    @Generated
    @Selector("pointsClassification")
    @NInt
    public native long pointsClassification();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
