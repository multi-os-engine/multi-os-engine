package apple.vision;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSIndexSet;
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
import org.moe.natj.objc.ann.ObjCBlock;
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;

/**
 * A base class for all tracking requests.
 * 
 * Since this class is not meant to be directly instantiated, no initializers are available.
 * 
 * API-Since: 11.0
 */
@Generated
@Library("Vision")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class VNTrackingRequest extends VNImageBasedRequest {
    static {
        NatJ.register();
    }

    @Generated
    protected VNTrackingRequest(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native VNTrackingRequest alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native VNTrackingRequest allocWithZone(VoidPtr zone);

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
    public native VNTrackingRequest init();

    @Generated
    @Selector("initWithCompletionHandler:")
    public native VNTrackingRequest initWithCompletionHandler(
            @ObjCBlock(name = "call_initWithCompletionHandler") VNRequest.Block_initWithCompletionHandler completionHandler);

    /**
     * [@property] property inputObservation
     * 
     * The observation object that defines a region to track. Providing an observation not returned from a tracker (e.g.
     * user-defined, or from a detector) begins a new tracker for the sequence. Providing an observation that was
     * returned from a tracker continues the use of that tracker, to track the region to the next frame. In general,
     * unless documented in the request's documentation, the rectangle must be defined in normalized coordinates (both
     * dimensions normalized to [0,1] with the origin at the lower-left corner).
     */
    @Generated
    @Selector("inputObservation")
    public native VNDetectedObjectObservation inputObservation();

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

    /**
     * [@property] property lastFrame
     * 
     * This property allows marking the last frame for tracking using current tracker. If set to YES, the results for
     * this frame will be processed and returned and the current tracker will be released to the pool of available
     * trackers
     */
    @Generated
    @Selector("isLastFrame")
    public native boolean isLastFrame();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native VNTrackingRequest new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * [@property] property inputObservation
     * 
     * The observation object that defines a region to track. Providing an observation not returned from a tracker (e.g.
     * user-defined, or from a detector) begins a new tracker for the sequence. Providing an observation that was
     * returned from a tracker continues the use of that tracker, to track the region to the next frame. In general,
     * unless documented in the request's documentation, the rectangle must be defined in normalized coordinates (both
     * dimensions normalized to [0,1] with the origin at the lower-left corner).
     */
    @Generated
    @Selector("setInputObservation:")
    public native void setInputObservation(VNDetectedObjectObservation value);

    /**
     * [@property] property lastFrame
     * 
     * This property allows marking the last frame for tracking using current tracker. If set to YES, the results for
     * this frame will be processed and returned and the current tracker will be released to the pool of available
     * trackers
     */
    @Generated
    @Selector("setLastFrame:")
    public native void setLastFrame(boolean value);

    /**
     * [@property] property trackingLevel
     * 
     * Tracking level allows tuning tracking algorithm to prefer speed (VNRequestTrackingLevelFast) vs. tracking object
     * location accuracy (VNRequestTrackingLevelAccurate). This property has no effect on general purpose object tracker
     * (VNTrackObjectRequest) revision 2 (VNTrackObjectRequestRevision2)
     */
    @Generated
    @Selector("setTrackingLevel:")
    public native void setTrackingLevel(@NUInt long value);

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * [@property] property trackingLevel
     * 
     * Tracking level allows tuning tracking algorithm to prefer speed (VNRequestTrackingLevelFast) vs. tracking object
     * location accuracy (VNRequestTrackingLevelAccurate). This property has no effect on general purpose object tracker
     * (VNTrackObjectRequest) revision 2 (VNTrackObjectRequestRevision2)
     */
    @Generated
    @Selector("trackingLevel")
    @NUInt
    public native long trackingLevel();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    @Generated
    @Selector("currentRevision")
    @NUInt
    public static native long currentRevision();

    @Generated
    @Selector("defaultRevision")
    @NUInt
    public static native long defaultRevision();

    @Generated
    @Selector("supportedRevisions")
    public static native NSIndexSet supportedRevisions();
}
