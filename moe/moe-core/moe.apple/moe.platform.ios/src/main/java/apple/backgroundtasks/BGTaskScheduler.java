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

/**
 * BGTaskScheduler
 * 
 * The object you use to schedule deferrable work to be done in the background.
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
    public static native boolean automaticallyNotifiesObserversForKey(String key);

    /**
     * Cancel all previously submitted task requests.
     */
    @Generated
    @Selector("cancelAllTaskRequests")
    public native void cancelAllTaskRequests();

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(@Mapped(ObjCObjectMapper.class) Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) Object aTarget, SEL aSelector,
            @Mapped(ObjCObjectMapper.class) Object anArgument);

    /**
     * Cancel a previously submitted task request.
     * 
     * @param identifier The identifier of the previously submitted task request to cancel.
     */
    @Generated
    @Selector("cancelTaskRequestWithIdentifier:")
    public native void cancelTaskRequestWithIdentifier(String identifier);

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

    /**
     * Returns a list of all task requests that have been submitted but not yet completed.
     * 
     * @param completionHandler A block for processing task requests. This block may be executed on a background thread.
     *                          The block has no return value and takes a single parameter, taskRequests, which is an
     *                          array of BGTaskRequest objects. If there are no pending requests, this array is empty.
     *                          The task request objects returned are copies and changing their property values will
     *                          have no immediate effect. To modify the parameters of a pending task request, submit it
     *                          again to the scheduler with submitTaskRequest:error:.
     */
    @Generated
    @Selector("getPendingTaskRequestsWithCompletionHandler:")
    public native void getPendingTaskRequestsWithCompletionHandler(
            @ObjCBlock(name = "call_getPendingTaskRequestsWithCompletionHandler") Block_getPendingTaskRequestsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingTaskRequestsWithCompletionHandler {
        @Generated
        void call_getPendingTaskRequestsWithCompletionHandler(NSArray<? extends BGTaskRequest> taskRequests);
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

    @Generated
    @Selector("keyPathsForValuesAffectingValueForKey:")
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(String key);

    @Generated
    @Owned
    @Selector("new")
    public static native BGTaskScheduler new_objc();

    /**
     * Register a handler to be called for tasks that launch the app.
     * 
     * You must register launch handlers before your application finishes launching. Attempting to register a handler
     * after launch or multiple handlers for the same identifier is an error. Although you may submit task requests from
     * some extensions, only the host app will be launched to handle background work.
     * 
     * @param identifier    The identifier for the task that will be handled by the provided launch handler.
     * @param queue         The queue on which the launch handler and the expiration handler for the task will be
     *                      called. The queue should be serial to ensure consistent ordering. If you pass nil, handlers
     *                      will be called on a background queue.
     * @param launchHandler The block that will be called when the app is launched for the specified task. The block has
     *                      no return value and takes a single parameter, task, a BGTask object. Assign an expiration
     *                      handler to the task's expirationHandler property and call setTaskCompletedWithSuccess: when
     *                      the background work is complete.
     * @return YES if the handler was registered, or NO if it was not because the provided identifier was not present in
     *         the BGTaskSchedulerPermittedIdentifiers array in the app's Info.plist.
     */
    @Generated
    @Selector("registerForTaskWithIdentifier:usingQueue:launchHandler:")
    public native boolean registerForTaskWithIdentifierUsingQueueLaunchHandler(String identifier, NSObject queue,
            @ObjCBlock(name = "call_registerForTaskWithIdentifierUsingQueueLaunchHandler") Block_registerForTaskWithIdentifierUsingQueueLaunchHandler launchHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_registerForTaskWithIdentifierUsingQueueLaunchHandler {
        @Generated
        void call_registerForTaskWithIdentifierUsingQueueLaunchHandler(BGTask task);
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

    @Generated
    @Selector("sharedScheduler")
    public static native BGTaskScheduler sharedScheduler();

    /**
     * Submit a request to be launched in the background to perform work.
     * 
     * Submitting a task request with the same identifier as an existing request will replace that request.
     * 
     * @param taskRequest The task request object representing the parameters of the background task to be scheduled.
     * @param error       If an error occurs, upon return contains an error object that indicates why the request was
     *                    rejected.
     * @return YES if the request was successfully submitted, NO if there was an error
     */
    @Generated
    @Selector("submitTaskRequest:error:")
    public native boolean submitTaskRequestError(BGTaskRequest taskRequest,
            @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();
}
