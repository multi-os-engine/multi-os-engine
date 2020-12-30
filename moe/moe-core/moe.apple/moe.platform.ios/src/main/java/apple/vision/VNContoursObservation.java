package apple.vision;

import apple.NSObject;
import apple.coregraphics.opaque.CGPathRef;
import apple.foundation.NSArray;
import apple.foundation.NSCoder;
import apple.foundation.NSError;
import apple.foundation.NSIndexPath;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
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
import org.moe.natj.objc.ann.ProtocolClassMethod;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * @brief An observation that provides all of the detected contours in an image.
 * @discussion Contours can be referenced as a flattened array or as a tree of enclosing parent contours to enclosed child contours.
 * 
 *      ┌ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─
 *                         ┌───────────────────┐   │
 *      │        Λ         │       ┌─────────┐ │
 *              ╱ ╲        │       │         │ │   │
 *      │      ╱   ╲       │       │         │ │
 *            ╱     ╲      │       │ C       │ │   │
 *      │    ▕   A   ▏     │       └─────────┘ │
 *            ╲     ╱      │                   │   │
 *      │      ╲   ╱       │ B                 │
 *              ╲ ╱        └───────────────────┘   │
 *      │        V
 *                                                 │
 *      └ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ─
 * 
 *         Contour A index 0, index path [0].
 *         Contour B index 1, index path [1].
 *         Contour C index 2, index path [1, 0].
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNContoursObservation extends VNObservation {
    static {
        NatJ.register();
    }

    @Generated
    protected VNContoursObservation(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNContoursObservation alloc();

    @Generated
    @Selector("allocWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object allocWithZone(VoidPtr zone);

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

    /**
     * @brief Returns the VNContour object at the specified index, irrespective of hierarchy.
     * @param contourIndex The index of the contour to request. Valid values are in the range [0..contourCount-1].
     * @param error The error returned if the index path is out of range.
     * @return The detected VNContour at the specified index without regard to hierarchy.
     */
    @Generated
    @Selector("contourAtIndex:error:")
    public native VNContour contourAtIndexError(@NInt long contourIndex,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @brief Returns the VNContour object at the specified index path.
     * @details Use the indexPath property from a VNContour instance to pass to this method.
     * @param indexPath The index path is the heirarchical path to the contour.
     * @param error The error returned if the index path is out of range.
     * @return The VNContour object at the specified index path.
     */
    @Generated
    @Selector("contourAtIndexPath:error:")
    public native VNContour contourAtIndexPathError(NSIndexPath indexPath,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * @brief The total number of contours detected.
     */
    @Generated
    @Selector("contourCount")
    @NInt
    public native long contourCount();

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
    public native VNContoursObservation init();

    @Generated
    @Selector("initWithCoder:")
    public native VNContoursObservation initWithCoder(NSCoder coder);

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
    @MappedReturn(ObjCObjectMapper.class)
    public static native Object new_objc();

    /**
     * @brief Obtain all of the contours represented as a CGPath in normalized coordinates.
     * @details The path is owned by the observation and therefore will be alive as long as the the observation is alive.
     */
    @Generated
    @Selector("normalizedPath")
    public native CGPathRef normalizedPath();

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

    /**
     * @brief The total number of top-level contours detected.
     */
    @Generated
    @Selector("topLevelContourCount")
    @NInt
    public native long topLevelContourCount();

    /**
     * @brief An array of the top level contours (i.e. contours that are not enclosed inside another contour),.
     * @details This array constitutes the top of the contour hierarchy. Each contour object can be further iterated to determine its children.
     * @see VNContour for more information.
     */
    @Generated
    @Selector("topLevelContours")
    public native NSArray<? extends VNContour> topLevelContours();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}