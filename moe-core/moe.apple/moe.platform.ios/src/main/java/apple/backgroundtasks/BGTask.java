package apple.backgroundtasks;

import apple.NSObject;
import apple.foundation.NSArray;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * An abstract class representing a task that’s run while the app is in the
 * background.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("BackgroundTasks")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BGTask extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BGTask(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BGTask alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native BGTask allocWithZone(VoidPtr zone);

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

    /**
     * A handler called shortly before the task’s background time expires.
     * 
     * The time allocated by the system for expiration handlers doesn’t vary with
     * the number of background tasks. All expiration handlers must complete before
     * the allocated time.
     * 
     * Not setting an expiration handler results in the system marking your task as
     * complete and unsuccessful instead of sending a warning.
     * 
     * The manager sets the value `expirationHandler` to `nil` after the handler
     * completes.
     * 
     * - Parameters:
     * - expirationHandler: The expiration handler takes no arguments and has no
     * return value. Use the handler to cancel any ongoing work and to do any
     * required cleanup in as short a time as possible.
     * 
     * The handler may be called before the background process uses the full amount of its
     * allocated time.
     */
    @Nullable
    @Generated
    @Selector("expirationHandler")
    @ObjCBlock(name = "call_expirationHandler_ret")
    public native Block_expirationHandler_ret expirationHandler();

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_expirationHandler_ret {
        @Generated
        void call_expirationHandler_ret();
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    /**
     * The string identifier of the task.
     * 
     * The identifier is the same as the one used to register the launch handler in
     * ``BGTaskScheduler/registerForTaskWithIdentifier:usingQueue:launchHandler:``.
     */
    @NotNull
    @Generated
    @Selector("identifier")
    public native String identifier();

    @Generated
    @Selector("init")
    public native BGTask init();

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
    public static native BGTask new_objc();

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * A handler called shortly before the task’s background time expires.
     * 
     * The time allocated by the system for expiration handlers doesn’t vary with
     * the number of background tasks. All expiration handlers must complete before
     * the allocated time.
     * 
     * Not setting an expiration handler results in the system marking your task as
     * complete and unsuccessful instead of sending a warning.
     * 
     * The manager sets the value `expirationHandler` to `nil` after the handler
     * completes.
     * 
     * - Parameters:
     * - expirationHandler: The expiration handler takes no arguments and has no
     * return value. Use the handler to cancel any ongoing work and to do any
     * required cleanup in as short a time as possible.
     * 
     * The handler may be called before the background process uses the full amount of its
     * allocated time.
     */
    @Generated
    @Selector("setExpirationHandler:")
    public native void setExpirationHandler(
            @Nullable @ObjCBlock(name = "call_setExpirationHandler") Block_setExpirationHandler value);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setExpirationHandler {
        @Generated
        void call_setExpirationHandler();
    }

    /**
     * Informs the background task scheduler that the task is complete.
     * 
     * Not calling ``BGTask/setTaskCompletedWithSuccess:`` before the time for the
     * task expires may result in the system killing your app.
     * 
     * You can reschedule an unsuccessful required task.
     * 
     * - Important: If you don’t set an expiration handler, the system will mark
     * your task as complete and unsuccessful instead of sending a warning.
     * 
     * - Parameters:
     * - success: A `Boolean` indicating if the task completed successfully or not.
     */
    @Generated
    @Selector("setTaskCompletedWithSuccess:")
    public native void setTaskCompletedWithSuccess(boolean success);

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
