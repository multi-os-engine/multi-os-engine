package apple.backgroundtasks;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
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
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ann.Runtime;
import org.moe.natj.general.ptr.Ptr;
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
import apple.opaque.dispatch_queue_t;

/**
 * A class for scheduling task requests that launch your app in the background.
 * 
 * Background tasks give your app a way to run code while the app is suspended.
 * To learn how to register, schedule, and run a background task, see
 * <doc://com.apple.documentation/documentation/uikit/app_and_environment/scenes/preparing_your_ui_to_run_in_the_background/using_background_tasks_to_update_your_app>.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("BackgroundTasks")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class BGTaskScheduler extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected BGTaskScheduler(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native BGTaskScheduler alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native BGTaskScheduler allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * Cancel all scheduled task requests.
     */
    @Generated
    @Selector("cancelAllTaskRequests")
    public native void cancelAllTaskRequests();

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
     * Cancel a previously scheduled task request.
     * 
     * - Parameters:
     * - identifier: The string identifier of the task request to cancel.
     */
    @Generated
    @Selector("cancelTaskRequestWithIdentifier:")
    public native void cancelTaskRequestWithIdentifier(@NotNull String identifier);

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
     * Request a list of unexecuted scheduled task requests.
     * 
     * - Parameters:
     * - completionHandler: The completion handler called with the pending tasks.
     * The handler may execute on a background thread.
     * 
     * The handler takes a single parameter `tasksRequests`, an array of `BGTaskRequest`
     * objects. The array is empty if there are no scheduled tasks.
     * 
     * The objects passed in the array are copies of the existing requests. Changing the
     * attributes of a request has no effect. To change the attributes submit a new
     * task request using ``BGTaskScheduler/submitTaskRequest:error:``.
     */
    @Generated
    @Selector("getPendingTaskRequestsWithCompletionHandler:")
    public native void getPendingTaskRequestsWithCompletionHandler(
            @NotNull @ObjCBlock(name = "call_getPendingTaskRequestsWithCompletionHandler") Block_getPendingTaskRequestsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingTaskRequestsWithCompletionHandler {
        @Generated
        void call_getPendingTaskRequestsWithCompletionHandler(@NotNull NSArray<? extends BGTaskRequest> taskRequests);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native BGTaskScheduler init();

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
    public static native BGTaskScheduler new_objc();

    /**
     * Register a launch handler for the task with the associated identifier that’s
     * executed on the specified queue.
     * 
     * Every identifier in the
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list/bgtaskschedulerpermittedidentifiers>
     * requires a handler. Registration of all launch handlers must be complete
     * before the end of
     * <doc://com.apple.documentation/documentation/uikit/uiapplicationdelegate/1623053-applicationdidfinishlaunching>.
     * 
     * - Important: Register each task identifier only once. The system kills the
     * app on the second registration of the same task identifier.
     * 
     * - Parameters:
     * - identifier: A string containing the identifier of the task.
     * 
     * - queue: A queue for executing the task. Pass `nil` to use a default
     * background queue.
     * 
     * - launchHandler: The system runs the block of code for the launch handler
     * when it launches the app in the background. The block takes a single
     * parameter, a ``BGTask`` object used for assigning an expiration handler and
     * for setting a completion status. The block has no return value.
     * 
     * - Returns: Returns
     * <doc://com.apple.documentation/documentation/objectivec/yes> if the launch
     * handler was registered. Returns
     * <doc://com.apple.documentation/documentation/objectivec/no> if the
     * identifier isn't included in the
     * <doc://com.apple.documentation/documentation/bundleresources/information_property_list/bgtaskschedulerpermittedidentifiers>
     * `Info.plist`.
     */
    @Generated
    @Selector("registerForTaskWithIdentifier:usingQueue:launchHandler:")
    public native boolean registerForTaskWithIdentifierUsingQueueLaunchHandler(@NotNull String identifier,
            @Nullable dispatch_queue_t queue,
            @NotNull @ObjCBlock(name = "call_registerForTaskWithIdentifierUsingQueueLaunchHandler") Block_registerForTaskWithIdentifierUsingQueueLaunchHandler launchHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerForTaskWithIdentifierUsingQueueLaunchHandler {
        @Generated
        void call_registerForTaskWithIdentifierUsingQueueLaunchHandler(@NotNull BGTask task);
    }

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
     * The shared background task scheduler instance.
     */
    @NotNull
    @Generated
    @Selector("sharedScheduler")
    public static native BGTaskScheduler sharedScheduler();

    /**
     * Submit a previously registered background task for execution.
     * 
     * Submitting a task request for an unexecuted task that’s already in the queue
     * replaces the previous task request.
     * 
     * There can be a total of 1 refresh task and 10 processing tasks scheduled at
     * any time. Trying to schedule more tasks returns
     * ``BGTaskSchedulerErrorCode/BGTaskSchedulerErrorCodeTooManyPendingTaskRequests``.
     * 
     * - Parameters:
     * - taskRequest: A background task request object specifying the task
     * - error: On input, a pointer to an error object. If an error occurs, this pointer is set to an error object
     * containing the error information. Specify `nil` for this parameter to ignore the error information.
     * identifier and optional configuration information.
     */
    @Generated
    @Selector("submitTaskRequest:error:")
    public native boolean submitTaskRequestError(@NotNull BGTaskRequest taskRequest,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

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
