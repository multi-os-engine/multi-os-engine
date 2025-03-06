package apple.coremotion;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSOperationQueue;
import apple.foundation.NSSet;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
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
 * CMHeadphoneActivityManager
 * 
 * Discussion:
 * The CMHeadphoneActivityManager object is your entry point to the headphone activity service.
 * 
 * API-Since: 18.0
 */
@Generated
@Library("CoreMotion")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CMHeadphoneActivityManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CMHeadphoneActivityManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native CMHeadphoneActivityManager alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CMHeadphoneActivityManager allocWithZone(VoidPtr zone);

    /**
     * authorizationStatus
     * 
     * Discussion:
     * Returns the current authorization status for headphone activity.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("authorizationStatus")
    @NInt
    public static native long authorizationStatus();

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
    public native CMHeadphoneActivityManager init();

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
     * activityActive
     * 
     * Discussion:
     * Determines whether the CMHeadphoneActivityManager is currently providing
     * headphone motion activity updates.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isActivityActive")
    public native boolean isActivityActive();

    /**
     * activityAvailable
     * 
     * Discussion:
     * Determines whether headphone motion activity is available.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isActivityAvailable")
    public native boolean isActivityAvailable();

    /**
     * statusActive
     * 
     * Discussion:
     * Determines whether the CMHeadphoneActivityManager is currently providing
     * status updates.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isStatusActive")
    public native boolean isStatusActive();

    /**
     * statusAvailable
     * 
     * Discussion:
     * Determines whether headphone status is available.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("isStatusAvailable")
    public native boolean isStatusAvailable();

    @Generated
    @Selector("isSubclassOfClass:")
    public static native boolean isSubclassOfClass(Class aClass);

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    @Generated
    @Owned
    @Selector("new")
    public static native CMHeadphoneActivityManager new_objc();

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
     * startActivityUpdatesToQueue:withHandler:
     * 
     * Discussion:
     * Starts headphone activity updates, providing data to the given handler through the given queue.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("startActivityUpdatesToQueue:withHandler:")
    public native void startActivityUpdatesToQueueWithHandler(@NotNull NSOperationQueue queue,
            @ObjCBlock(name = "call_startActivityUpdatesToQueueWithHandler") @NotNull Block_startActivityUpdatesToQueueWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startActivityUpdatesToQueueWithHandler {
        @Generated
        void call_startActivityUpdatesToQueueWithHandler(@Nullable CMMotionActivity activity, @Nullable NSError error);
    }

    /**
     * startStatusUpdatesToQueue:withHandler:
     * 
     * Discussion:
     * Starts headphone status updates (Connected/Disconnected), providing data to the given handler through the given
     * queue.
     * Connected will only be sent when a compatible headphone is connected.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("startStatusUpdatesToQueue:withHandler:")
    public native void startStatusUpdatesToQueueWithHandler(@NotNull NSOperationQueue queue,
            @ObjCBlock(name = "call_startStatusUpdatesToQueueWithHandler") @NotNull Block_startStatusUpdatesToQueueWithHandler handler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startStatusUpdatesToQueueWithHandler {
        @Generated
        void call_startStatusUpdatesToQueueWithHandler(@NInt long status, @Nullable NSError error);
    }

    /**
     * stopActivityUpdates
     * 
     * Discussion:
     * Stops headphone activity updates.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("stopActivityUpdates")
    public native void stopActivityUpdates();

    /**
     * stopStatusUpdates
     * 
     * Discussion:
     * Stops headphone status updates.
     * 
     * API-Since: 18.0
     */
    @Generated
    @Selector("stopStatusUpdates")
    public native void stopStatusUpdates();

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