package apple.metrickit;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSSet;
import apple.metrickit.protocol.MXMetricManagerSubscriber;
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
import org.moe.natj.objc.ann.ObjCClassBinding;
import org.moe.natj.objc.ann.Selector;
import org.moe.natj.objc.map.ObjCObjectMapper;
import apple.foundation.NSError;
import org.moe.natj.general.ann.ReferenceInfo;
import org.moe.natj.general.ptr.Ptr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * MXMetricManager
 * 
 * An instance of this class can be used to retrieve periodic, aggregated power and performance metrics.
 * 
 * To receive metrics, clients must acquire a reference to the shared instance of the metric manager and add an eligible
 * MXMetricManagerSubscriber.
 * 
 * Metrics are not guaranteed to be delivered, but can be expected atleast once per day when conditions permit.
 * 
 * Subscribers to the metric manager can remove themselves using removeSubscriber:subscriber if they no longer wish to
 * receive metrics.
 * 
 * API-Since: 13.0
 */
@Generated
@Library("MetricKit")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MXMetricManager extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected MXMetricManager(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addSubscriber:subscriber
     * 
     * Adds a subscriber to the metric manager.
     * 
     * Subscribers can receive metric payloads by conforming to the MXMetricManagerSubscriber protocol.
     * 
     * @param subscriber An object that conforms to the MXMetricManagerSubscriber protocol.
     */
    @Generated
    @Selector("addSubscriber:")
    public native void addSubscriber(@NotNull @Mapped(ObjCObjectMapper.class) MXMetricManagerSubscriber subscriber);

    @Generated
    @Owned
    @Selector("alloc")
    public static native MXMetricManager alloc();

    @Owned
    @Generated
    @Selector("allocWithZone:")
    public static native MXMetricManager allocWithZone(VoidPtr zone);

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
    public native MXMetricManager init();

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

    /**
     * makeLogHandleWithCategory:category
     * 
     * Retrieve a log handle for flagging critical sections with os_signpost().
     * 
     * The log handle configures persistence for any signposts emit while using the log handle.
     * 
     * @param category A string used to define a log category
     * @return A log handle that can be used with the logging framework.
     */
    @NotNull
    @Generated
    @Selector("makeLogHandleWithCategory:")
    public static native NSObject makeLogHandleWithCategory(@NotNull String category);

    @Generated
    @Owned
    @Selector("new")
    public static native MXMetricManager new_objc();

    /**
     * [@property] pastPayloads
     * 
     * A list of past metric payloads received.
     */
    @NotNull
    @Generated
    @Selector("pastPayloads")
    public native NSArray<? extends MXMetricPayload> pastPayloads();

    /**
     * removeSubscriber:subscriber
     * 
     * Removes a subscriber from the metric manager.
     * 
     * The subscriber indicated, if previously registered, will no longer receive metric payloads.
     * 
     * @param subscriber An object that conforms to the MXMetricManagerSubscriber protocol.
     */
    @Generated
    @Selector("removeSubscriber:")
    public native void removeSubscriber(@NotNull @Mapped(ObjCObjectMapper.class) MXMetricManagerSubscriber subscriber);

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
     * [@property] sharedManager
     * 
     * Singleton instance of MXMetricManager.
     */
    @NotNull
    @Generated
    @Selector("sharedManager")
    public static native MXMetricManager sharedManager();

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    @Generated
    @Selector("version")
    @NInt
    public static native long version_static();

    /**
     * [@property] pastDiagnosticPayloads
     * 
     * A list of past diagnostic payloads received.
     * 
     * API-Since: 14.0
     */
    @NotNull
    @Generated
    @Selector("pastDiagnosticPayloads")
    public native NSArray<? extends MXDiagnosticPayload> pastDiagnosticPayloads();

    /**
     * extendLaunchMeasurementForTaskID:error:
     * 
     * Start measuring an extended launch task with the given task id.
     * 
     * This method tracks extra setup tasks required to make the application perceived as fully launched, such as
     * loading up content from the disk or refreshing data from the network, rendering images, etc.
     * 
     * The first task needs to start before or during @c UISceneDelegate.scene(_:restoreInteractionStateWith:) or
     * before @c UISceneDelegate.sceneDidBecomeActive(_:) is called on the first scene to connect. For example, at the
     * time @c UIApplicationDelegate.application(_:didFinishLaunchingWithOptions:) is called. Other tasks need to start
     * before the last current task is finished, otherwise the extended launch measurement will end.
     * 
     * The maximum number of tasks is 16.
     * 
     * This method needs to be called on the main thread.
     * 
     * @param taskID The task identifier. Must be an unique nonnull custom string.
     * @param error  If an error occurs, this will contain a valid @c NSError object on exit.
     * @return Returns @c YES if the measurement started successfully and @c NO otherwise.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("extendLaunchMeasurementForTaskID:error:")
    public static native boolean extendLaunchMeasurementForTaskIDError(@NotNull String taskID,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);

    /**
     * finishExtendedLaunchMeasurementForTaskID:error:
     * 
     * Signal the end of an extended launch task previously started with @c extendLaunchMeasurementForTaskID:error: .
     * 
     * This method needs to be called on the main thread.
     * 
     * @param taskID The task identifier. Must match the task identifier passed to @c
     *               extendLaunchMeasurementForTaskID:error: .
     * @param error  If an error occurs, this will contain a valid @c NSError object on exit.
     * @return Returns @c YES if the measurement for the task finished successfully and @c NO otherwise.
     * 
     *         API-Since: 16.0
     */
    @Generated
    @Selector("finishExtendedLaunchMeasurementForTaskID:error:")
    public static native boolean finishExtendedLaunchMeasurementForTaskIDError(@NotNull String taskID,
            @Nullable @ReferenceInfo(type = NSError.class) Ptr<NSError> error);
}
