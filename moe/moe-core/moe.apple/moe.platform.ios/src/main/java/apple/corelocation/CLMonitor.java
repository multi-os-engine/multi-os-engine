package apple.corelocation;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSMethodSignature;
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
 * API-Since: 17.0
 */
@Generated
@Library("CoreLocation")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class CLMonitor extends NSObject {
    static {
        NatJ.register();
    }

    @Generated
    protected CLMonitor(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    /**
     * addConditionForMonitoring:identifier:
     * 
     * Discussion:
     * Adds `condition` to be monitored under `identifier`.
     * It initializes the monitoring state to `CLMonitoringStateUnknown`.
     */
    @Generated
    @Selector("addConditionForMonitoring:identifier:")
    public native void addConditionForMonitoringIdentifier(@NotNull CLCondition condition, @NotNull String identifier);

    /**
     * addConditionForMonitoring:identifier:assumedState
     * 
     * Discussion:
     * Adds `condition` to be monitored under `identifier`.
     * It initializes the monitoring state with the given value.
     */
    @Generated
    @Selector("addConditionForMonitoring:identifier:assumedState:")
    public native void addConditionForMonitoringIdentifierAssumedState(@NotNull CLCondition condition,
            @NotNull String identifier, @NUInt long state);

    @Generated
    @Owned
    @Selector("alloc")
    public static native CLMonitor alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native CLMonitor allocWithZone(VoidPtr zone);

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
    public native CLMonitor init();

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
    @NotNull
    public static native NSSet<String> keyPathsForValuesAffectingValueForKey(@NotNull String key);

    /**
     * monitoredIdentifiers
     * 
     * Discussion:
     * Array containing all the identifiers with each identifying a condition
     * that is monitored.
     */
    @Generated
    @Selector("monitoredIdentifiers")
    @NotNull
    public native NSArray<String> monitoredIdentifiers();

    /**
     * monitoringRecordForIdentifier:
     * 
     * Discussion:
     * Gets the monitoring record containing the condition and last
     * monitoring event, if applicable
     */
    @Generated
    @Selector("monitoringRecordForIdentifier:")
    @Nullable
    public native CLMonitoringRecord monitoringRecordForIdentifier(@NotNull String identifier);

    /**
     * name
     * 
     * Discussion:
     * Name associated with the `CLMonitor` instance.
     */
    @Generated
    @Selector("name")
    @NotNull
    public native String name();

    @Generated
    @Owned
    @Selector("new")
    public static native CLMonitor new_objc();

    /**
     * removeConditionFromMonitoringWithIdentifier:
     * 
     * Discussion:
     * Removes the monitoring record with given `identifier` from monitoring
     */
    @Generated
    @Selector("removeConditionFromMonitoringWithIdentifier:")
    public native void removeConditionFromMonitoringWithIdentifier(@NotNull String identifier);

    /**
     * requestMonitorWithConfiguration:completion:
     * Discussion:
     * Creates or opens, a `CLMonitor` instance with the given name.
     * The completion handler will be called with the instance of `CLMonitor`
     * on the queue that was set in the configuration instance.
     * 
     * Conditions can be added for monitoring or removed from monitoring by
     * this instance of `CLMonitor`. When an event occurs, the passed in block
     * would be called on the specified queue. The callback handler is invoked
     * with this instance of `CLMonitor` and an instance of `CLMonitoringEvent`
     * containing the identifier under which the condition is monitored,
     * an optional instance of `CLCondition` containing specifics, the new
     * state, and the timestamp of the event.
     * 
     * All interaction directly with the returned `CLMonitor` must occur on
     * the specified queue. Failing to do so will result in undefined behavior.
     * 
     * Conditions added to an instance of `CLMonitor` will persist until
     * removed from monitoring. However, CoreLocation will stop monitoring
     * conditions if an event is pending for them, but no `CLMonitor` has been
     * configured to receive it.
     * 
     * The conditions are stored in an opaque file at
     * ~/Library/CoreLocation/BundleId (or Process name)/`name`.monitor.
     * Note that for containerized Apps this will be inside the Data container.
     * Apps need to observe when protected data becomes available using
     * `UIApplicationProtectedDataDidBecomeAvailable` before creating a
     * `CLMonitor` instance. Persistence of Conditions enables an app to query
     * efficiently for conditions currently being monitored and the last
     * event delivered for each.
     * 
     * The app can choose to initialize the monitoring state for a condition.
     * By default, it is set to `CLMonitoringStateUnknown`.
     * 
     * - Note: Only one instance of `CLMonitor` with a given name may be
     * opened at a time. Attempting to open another instance with the
     * same name will return `false`.
     * 
     * 
     * API-Since: 17.0
     */
    @Generated
    @Selector("requestMonitorWithConfiguration:completion:")
    public static native void requestMonitorWithConfigurationCompletion(@NotNull CLMonitorConfiguration config,
            @ObjCBlock(name = "call_requestMonitorWithConfigurationCompletion") @NotNull Block_requestMonitorWithConfigurationCompletion completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestMonitorWithConfigurationCompletion {
        @Generated
        void call_requestMonitorWithConfigurationCompletion(@NotNull CLMonitor monitor);
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