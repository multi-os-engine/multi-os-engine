package apple.cinematic;

import apple.NSObject;
import apple.corefoundation.struct.CGRect;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.foundation.protocol.NSCopying;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.moe.natj.c.ann.FunctionPtr;
import org.moe.natj.general.NatJ;
import org.moe.natj.general.Pointer;
import org.moe.natj.general.ann.ByValue;
import org.moe.natj.general.ann.Generated;
import org.moe.natj.general.ann.Library;
import org.moe.natj.general.ann.Mapped;
import org.moe.natj.general.ann.MappedReturn;
import org.moe.natj.general.ann.NInt;
import org.moe.natj.general.ann.NUInt;
import org.moe.natj.general.ann.Owned;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.VoidPtr;
import org.moe.natj.objc.Class;
import org.moe.natj.objc.ObjCRuntime;
import org.moe.natj.objc.SEL;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A cinematic detection of a subject.
 * 
 * Specifies the type, distance (as disparity), bounds (as a normalized rectangle), and time (as CMTime) of the
 * detection.
 * Detections obtained from the cinematic script include a detectionID that can be used to track the detection over
 * time.
 * Some types of detections also include a detectionGroupID that associates related detections (e.g. the face and torso
 * of the same person).
 * 
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNDetection extends NSObject implements NSCopying {
    static {
        NatJ.register();
    }

    @Generated
    protected CNDetection(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * A localized accessibility label converting a specific detection type into a broad category (person, pet, etc.).
     */
    @Generated
    @Selector("accessibilityLabelForDetectionType:")
    @NotNull
    public static native String accessibilityLabelForDetectionType(@NInt long detectionType);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNDetection alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNDetection allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    @Generated
    @Selector("classFallbacksForKeyedArchiver")
    @NotNull
    public static native NSArray<String> classFallbacksForKeyedArchiver();

    @Generated
    @Selector("classForKeyedUnarchiver")
    @NotNull
    public static native Class classForKeyedUnarchiver();

    @Generated
    @Owned
    @Selector("copyWithZone:")
    @MappedReturn(ObjCObjectMapper.class)
    @NotNull
    public native Object copyWithZone(@Nullable VoidPtr zone);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * An unique identifier assigned by the cinematic script to all detections of the same subject and related detection
     * types across time.
     * For example, the face/torso detections of the same person are assigned the same detectionGroupID.
     */
    @Generated
    @Selector("detectionGroupID")
    public native long detectionGroupID();

    /**
     * An unique identifier assigned by the cinematic script to all detections of the same subject and detection type
     * across time.
     * If you build a custom detection track, the detectionID will be assigned when you add it to the script.
     */
    @Generated
    @Selector("detectionID")
    public native long detectionID();

    /**
     * The type of object that was detected (face, torso, cat, dog, etc.)
     */
    @Generated
    @Selector("detectionType")
    @NInt
    public native long detectionType();

    /**
     * Determine the disparity to use to focus on the object in the rectangle.
     * - Parameters:
     * - disparityBuffer: A pixel buffer from the cinematic disparity track for the frame in which the object occurs.
     * - normalizedRect: The rectangle within the disparity buffer where the object occurs, normalized such that (0.0,
     * 0.0) is the top-left and (1.0, 1.0) is the bottom-right of the disparity buffer.
     * - detectionType: The type of object expected within the rectangle. Pass `CNDetectionTypeUnknown` if unknown.
     * - priorDisparity: The disparity of the object in the prior frame. This helps ensure the object is not mistaken
     * for another that enters the same rectangle. Pass `NAN` if there is no known prior, such as in the first frame in
     * which the object is being tracked.
     */
    @Generated
    @Selector("disparityInNormalizedRect:sourceDisparity:detectionType:priorDisparity:")
    public static native float disparityInNormalizedRectSourceDisparityDetectionTypePriorDisparity(
            @ByValue CGRect normalizedRect, @NotNull CVBufferRef sourceDisparity, @NInt long detectionType,
            float priorDisparity);

    /**
     * The disparity to use in order to focus on the object.
     * If the disparity is unknown, use the class method to find it:
     * `disparityInNormalizedRect:sourceDisparity:detectionType:priorDisparity:`.
     */
    @Generated
    @Selector("focusDisparity")
    public native float focusDisparity();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNDetection init();

    /**
     * Initialize a cinematic detection.
     * 
     * For playback and edit, most detections are obtained by from the cinematic script rather than being created.
     * However, if you need to add a custom track, you can build an array of detections to create one.
     * Any detections you create will not have a valid detectionID until the custom track is added to the cinematic
     * script.
     * Doing so will return the assigned detectionID. Any detections newly obtained from the cinematic script will have
     * their assigned detectionID.
     * 
     * - Parameters:
     * - time: the presentation time of the frame in which the detection occurred
     * - detectionType: the type of object that was detected (face, torso, cat, dog, etc.)
     * - normalizedRect: the rectangle within the image where the object occurs, normalized such that (0.0, 0.0) is the
     * top-left and (1.0, 1.0) is the bottom-right
     * - focusDisparity: the disparity to use in order to focus on the object (use the static `disparity` method to
     * compute if unknown)
     */
    @Generated
    @Selector("initWithTime:detectionType:normalizedRect:focusDisparity:")
    public native CNDetection initWithTimeDetectionTypeNormalizedRectFocusDisparity(@ByValue CMTime time,
            @NInt long detectionType, @ByValue CGRect normalizedRect, float focusDisparity);

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
     * Determine whether a given detectionGroupID is valid
     */
    @Generated
    @Selector("isValidDetectionGroupID:")
    public static native boolean isValidDetectionGroupID(long detectionGroupID);

    /**
     * Determine whether a given detectionID is valid
     */
    @Generated
    @Selector("isValidDetectionID:")
    public static native boolean isValidDetectionID(long detectionID);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CNDetection new_objc();

    /**
     * The rectangle within the image where the object occurs, normalized such that (0.0, 0.0) is the top-left and (1.0,
     * 1.0) is the bottom-right.
     */
    @Generated
    @Selector("normalizedRect")
    @ByValue
    public native CGRect normalizedRect();

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

    /**
     * The presentation time of the frame in which the detection occurred.
     */
    @Generated
    @Selector("time")
    @ByValue
    public native CMTime time();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}