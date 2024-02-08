package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGPathRef;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import apple.vision.protocol.VNRequestRevisionProviding;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The VNContour class describes a contour provided by a VNContoursObservation.
 * 
 * VNContour objects are lightweight objects that act as a façade which allows access to a small slice of the usually
 * much larger block of data owned by a VNContoursObservation that represents all of the contours detected in an image.
 * While the interface does present the notion of a hierarchy of parent/child contours, the implementation purposefully
 * does not contain any explicit internal bookkeeping for this relationship. Instead, contours are uniquely identified
 * via their indexPath property.
 * As a side effect of this choice, repeated calls to methods that would return relational contours (e.g.,
 * -childContours or -childContourAtIndex:error:) are NOT guaranteed to return the same VNContour instances over and
 * over again. If this kind of parent/child object stability is an absolute requirement of the client, then they are
 * responsible for creating the necessary data structures to represent and build that instance-stable hierarchy.
 * 
 * API-Since: 14.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNContour extends NSObject implements NSCopying, VNRequestRevisionProviding {
    static {
        NatJ.register();
    }

    @Generated
    protected VNContour(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNContour alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNContour allocWithZone(VoidPtr zone);

    /**
     * The aspect ratio of the contour from the original image aspect ratio expressed as width/height
     */
    @Generated
    @Selector("aspectRatio")
    public native float aspectRatio();

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

    /**
     * Returns a VNContour object that is a child of this VNContour at the specified index.
     * 
     * @param childContourIndex The index into the childContours array.
     * @param error             The error returned if the child contour cannot be provided.
     * @return The VNContour object at the specified index path, or nil of a failure occurs.
     */
    @Nullable
    @Generated
    @Selector("childContourAtIndex:error:")
    public native VNContour childContourAtIndexError(@NUInt long childContourIndex,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * The total number of child contours in the target contour.
     * 
     * The use of this property is preferred over childContours.count due to the cost of building the child objects.
     */
    @Generated
    @Selector("childContourCount")
    @NInt
    public native long childContourCount();

    /**
     * The array of the contours enclosed by the target contour.
     * 
     * This property may come with the cost of instantiating new VNContour objects; therefore, clients are strongly
     * encouraged to hold the results in a local variable instead of repeatedly invoking it.
     */
    @NotNull
    @Generated
    @Selector("childContours")
    public native NSArray<? extends VNContour> childContours();

    @NotNull
    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @NotNull
    @Generated
    @Selector("classForKeyedUnarchiver")
    public static native Class classForKeyedUnarchiver();

    @NotNull
    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public native Object copyWithZone(@Nullable VoidPtr zone);

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

    /**
     * The path to the target VNContour as it is stored in the owning VNContoursObservation's hierarchy of contours.
     */
    @NotNull
    @Generated
    @Selector("indexPath")
    public native NSIndexPath indexPath();

    @Generated
    @Selector("init")
    public native VNContour init();

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
    public static native VNContour new_objc();

    /**
     * The contour represented as a CGPath in normalized coordinates.
     * 
     * The path is owned by this object and therefore will be alive as long as the the observation is alive.
     */
    @NotNull
    @Generated
    @Selector("normalizedPath")
    public native CGPathRef normalizedPath();

    /**
     * The number of points that describe the contour.
     */
    @Generated
    @Selector("pointCount")
    @NInt
    public native long pointCount();

    /**
     * Simplifies the contour's collection of points into a polygon using the Ramer Douglas Peucker Algorithm.
     * 
     * See <https://en.wikipedia.org/wiki/Ramer–Douglas–Peucker_algorithm>
     * 
     * @param epsilon Points that have a perpendicular distance to the line segment they are on which are greater than
     *                epsilon are kept, others are eliminated.
     * @param error   The error returned if a simplified contour cannot be created.
     * @return A new VNContour object with a simplified polygon consisting of a subset of the points that defined the
     *         original VNContour.
     */
    @Nullable
    @Generated
    @Selector("polygonApproximationWithEpsilon:error:")
    public native VNContour polygonApproximationWithEpsilonError(float epsilon,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("requestRevision")
    @NUInt
    public native long requestRevision();

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
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();
}
