package apple.cinematic;

import apple.NSObject;
import apple.corefoundation.struct.CGPoint;
import apple.corefoundation.struct.CGRect;
import apple.coremedia.struct.CMTime;
import apple.corevideo.opaque.CVBufferRef;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metal.protocol.MTLCommandQueue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * Converts a normalized point or rectangle into a detection track that tracks an object over time.
 * 
 * API-Since: 17.0
 */
@Generated
@Library("Cinematic")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CNObjectTracker extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CNObjectTracker(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CNObjectTracker alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CNObjectTracker allocWithZone(VoidPtr zone);

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

    /**
     * Continue tracking an object for which tracking has started, and add a new detection to the detection track being
     * built.
     * - Parameters:
     * - time: the presentation time of the frame to be added to the detection track
     * - Returns: a prediction of where the object is in the source image
     */
    @Generated
    @Selector("continueTrackingAt:sourceImage:sourceDisparity:")
    @Nullable
    public native CNBoundsPrediction continueTrackingAtSourceImageSourceDisparity(@ByValue CMTime time,
            @NotNull CVBufferRef sourceImage, @NotNull CVBufferRef sourceDisparity);

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Find the bounds of an object at the given point. Can be used to convert a normalized point in an image to a
     * rectangle that can be used to start tracking.
     * - Parameters:
     * - point: location of object in image in normalized coordinates where (0.0, 0.0) is the upper left corner, and
     * (1.0, 1.0) is the lower right
     * - sourceImage: pixel buffer containing the image
     * - Returns: A prediction, which includes bounds that can be used to start tracking, or `nil` if no discernible
     * object is detected.
     */
    @Generated
    @Selector("findObjectAtPoint:sourceImage:")
    @Nullable
    public native CNBoundsPrediction findObjectAtPointSourceImage(@ByValue CGPoint point,
            @NotNull CVBufferRef sourceImage);

    /**
     * Finish constructing the detection track and return it.
     * - Returns: a detection track which tracks the object
     */
    @Generated
    @Selector("finishDetectionTrack")
    @NotNull
    public native CNDetectionTrack finishDetectionTrack();

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native CNObjectTracker init();

    /**
     * Create a new detection track builder.
     * - Parameters:
     * - commandQueue: the command queue of a metal device to which commands should be submitted to perform work
     */
    @Generated
    @Selector("initWithCommandQueue:")
    public native CNObjectTracker initWithCommandQueue(
            @Mapped(ObjCObjectMapper.class) @NotNull MTLCommandQueue commandQueue);

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
     * Indicates whether the current device supports object detection and tracking.
     */
    @Generated
    @Selector("isSupported")
    public static native boolean isSupported();

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CNObjectTracker new_objc();

    /**
     * Reset the builder to construct a new detection track.
     */
    @Generated
    @Selector("resetDetectionTrack")
    public native void resetDetectionTrack();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Start creating a detection track to track an object within the given bounds.
     * - Parameters:
     * - time: the presentation time of the first frame in the detection track
     * - normalizedBounds: the bounds of the object to track in normalized coordinates where (0.0, 0.0) is the upper
     * left corner, and (1.0, 1.0) is the lower right
     * - sourceImage: image buffer containing the image
     * - sourceDisparity: disparity buffer containing depth information
     * - Returns: whether the object can be tracked
     * - Note: if the object can be tracked, a detection is added to the detection track being built
     */
    @Generated
    @Selector("startTrackingAt:within:sourceImage:sourceDisparity:")
    public native boolean startTrackingAtWithinSourceImageSourceDisparity(@ByValue CMTime time,
            @ByValue CGRect normalizedBounds, @NotNull CVBufferRef sourceImage, @NotNull CVBufferRef sourceDisparity);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Deprecated
    @Selector("useStoredAccessor")
    public static native boolean useStoredAccessor();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}