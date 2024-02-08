package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSError;
import apple.foundation.NSMethodSignature;
import apple.foundation.NSNumber;
import apple.foundation.NSSet;
import apple.opaque.dispatch_queue_t;
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
 * Cluster Thermostat
 * 
 * An interface for configuring and controlling the functionality of a thermostat.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterThermostat extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterThermostat(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterThermostat alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterThermostat allocWithZone(VoidPtr zone);

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearWeeklyScheduleWithCompletion:")
    public native void clearWeeklyScheduleWithCompletion(
            @ObjCBlock(name = "call_clearWeeklyScheduleWithCompletion") @NotNull Block_clearWeeklyScheduleWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithCompletion {
        @Generated
        void call_clearWeeklyScheduleWithCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearWeeklyScheduleWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("clearWeeklyScheduleWithCompletionHandler:")
    public native void clearWeeklyScheduleWithCompletionHandler(
            @ObjCBlock(name = "call_clearWeeklyScheduleWithCompletionHandler") @NotNull Block_clearWeeklyScheduleWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithCompletionHandler {
        @Generated
        void call_clearWeeklyScheduleWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command ClearWeeklySchedule
     * 
     * The Clear Weekly Schedule command is used to clear the weekly schedule.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearWeeklyScheduleWithParams:completion:")
    public native void clearWeeklyScheduleWithParamsCompletion(
            @Nullable MTRThermostatClusterClearWeeklyScheduleParams params,
            @ObjCBlock(name = "call_clearWeeklyScheduleWithParamsCompletion") @NotNull Block_clearWeeklyScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithParamsCompletion {
        @Generated
        void call_clearWeeklyScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearWeeklyScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearWeeklyScheduleWithParams:completionHandler:")
    public native void clearWeeklyScheduleWithParamsCompletionHandler(
            @Nullable MTRThermostatClusterClearWeeklyScheduleParams params,
            @ObjCBlock(name = "call_clearWeeklyScheduleWithParamsCompletionHandler") @NotNull Block_clearWeeklyScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeeklyScheduleWithParamsCompletionHandler {
        @Generated
        void call_clearWeeklyScheduleWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Command GetWeeklySchedule
     * 
     * Command description for GetWeeklySchedule
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getWeeklyScheduleWithParams:completion:")
    public native void getWeeklyScheduleWithParamsCompletion(
            @NotNull MTRThermostatClusterGetWeeklyScheduleParams params,
            @ObjCBlock(name = "call_getWeeklyScheduleWithParamsCompletion") @NotNull Block_getWeeklyScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeeklyScheduleWithParamsCompletion {
        @Generated
        void call_getWeeklyScheduleWithParamsCompletion(
                @Nullable MTRThermostatClusterGetWeeklyScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getWeeklyScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getWeeklyScheduleWithParams:completionHandler:")
    public native void getWeeklyScheduleWithParamsCompletionHandler(
            @NotNull MTRThermostatClusterGetWeeklyScheduleParams params,
            @ObjCBlock(name = "call_getWeeklyScheduleWithParamsCompletionHandler") @NotNull Block_getWeeklyScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeeklyScheduleWithParamsCompletionHandler {
        @Generated
        void call_getWeeklyScheduleWithParamsCompletionHandler(
                @Nullable MTRThermostatClusterGetWeeklyScheduleResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseClusterThermostat init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterThermostat initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterThermostat initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
            @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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

    @Generated
    @Owned
    @Selector("new")
    public static native MTRBaseClusterThermostat new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCapacityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCapacityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACCapacityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCapacityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACCapacityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACCapacityWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCapacityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCapacityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCapacityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACCapacityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACCapacityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCapacityWithCompletion:")
    public native void readAttributeACCapacityWithCompletion(
            @ObjCBlock(name = "call_readAttributeACCapacityWithCompletion") @NotNull Block_readAttributeACCapacityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityWithCompletion {
        @Generated
        void call_readAttributeACCapacityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCapacityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCapacityWithCompletionHandler:")
    public native void readAttributeACCapacityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACCapacityWithCompletionHandler") @NotNull Block_readAttributeACCapacityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityWithCompletionHandler {
        @Generated
        void call_readAttributeACCapacityWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCapacityformatWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCapacityformatWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACCapacityformatWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCapacityformatWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACCapacityformatWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityformatWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACCapacityformatWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCapacityformatWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCapacityformatWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCapacityformatWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACCapacityformatWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityformatWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACCapacityformatWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCapacityformatWithCompletion:")
    public native void readAttributeACCapacityformatWithCompletion(
            @ObjCBlock(name = "call_readAttributeACCapacityformatWithCompletion") @NotNull Block_readAttributeACCapacityformatWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityformatWithCompletion {
        @Generated
        void call_readAttributeACCapacityformatWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCapacityformatWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCapacityformatWithCompletionHandler:")
    public native void readAttributeACCapacityformatWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACCapacityformatWithCompletionHandler") @NotNull Block_readAttributeACCapacityformatWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCapacityformatWithCompletionHandler {
        @Generated
        void call_readAttributeACCapacityformatWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCoilTemperatureWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCoilTemperatureWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACCoilTemperatureWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCoilTemperatureWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACCoilTemperatureWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCoilTemperatureWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACCoilTemperatureWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCoilTemperatureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCoilTemperatureWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCoilTemperatureWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACCoilTemperatureWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCoilTemperatureWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACCoilTemperatureWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCoilTemperatureWithCompletion:")
    public native void readAttributeACCoilTemperatureWithCompletion(
            @ObjCBlock(name = "call_readAttributeACCoilTemperatureWithCompletion") @NotNull Block_readAttributeACCoilTemperatureWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCoilTemperatureWithCompletion {
        @Generated
        void call_readAttributeACCoilTemperatureWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCoilTemperatureWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCoilTemperatureWithCompletionHandler:")
    public native void readAttributeACCoilTemperatureWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACCoilTemperatureWithCompletionHandler") @NotNull Block_readAttributeACCoilTemperatureWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCoilTemperatureWithCompletionHandler {
        @Generated
        void call_readAttributeACCoilTemperatureWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCompressorTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCompressorTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACCompressorTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCompressorTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACCompressorTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCompressorTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACCompressorTypeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCompressorTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACCompressorTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACCompressorTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACCompressorTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCompressorTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACCompressorTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACCompressorTypeWithCompletion:")
    public native void readAttributeACCompressorTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeACCompressorTypeWithCompletion") @NotNull Block_readAttributeACCompressorTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCompressorTypeWithCompletion {
        @Generated
        void call_readAttributeACCompressorTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACCompressorTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACCompressorTypeWithCompletionHandler:")
    public native void readAttributeACCompressorTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACCompressorTypeWithCompletionHandler") @NotNull Block_readAttributeACCompressorTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACCompressorTypeWithCompletionHandler {
        @Generated
        void call_readAttributeACCompressorTypeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACErrorCodeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACErrorCodeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACErrorCodeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACErrorCodeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACErrorCodeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACErrorCodeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACErrorCodeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACErrorCodeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACErrorCodeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACErrorCodeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACErrorCodeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACErrorCodeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACErrorCodeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACErrorCodeWithCompletion:")
    public native void readAttributeACErrorCodeWithCompletion(
            @ObjCBlock(name = "call_readAttributeACErrorCodeWithCompletion") @NotNull Block_readAttributeACErrorCodeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACErrorCodeWithCompletion {
        @Generated
        void call_readAttributeACErrorCodeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACErrorCodeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACErrorCodeWithCompletionHandler:")
    public native void readAttributeACErrorCodeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACErrorCodeWithCompletionHandler") @NotNull Block_readAttributeACErrorCodeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACErrorCodeWithCompletionHandler {
        @Generated
        void call_readAttributeACErrorCodeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACLouverPositionWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACLouverPositionWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACLouverPositionWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACLouverPositionWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACLouverPositionWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACLouverPositionWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACLouverPositionWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACLouverPositionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACLouverPositionWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACLouverPositionWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACLouverPositionWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACLouverPositionWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACLouverPositionWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACLouverPositionWithCompletion:")
    public native void readAttributeACLouverPositionWithCompletion(
            @ObjCBlock(name = "call_readAttributeACLouverPositionWithCompletion") @NotNull Block_readAttributeACLouverPositionWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACLouverPositionWithCompletion {
        @Generated
        void call_readAttributeACLouverPositionWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACLouverPositionWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACLouverPositionWithCompletionHandler:")
    public native void readAttributeACLouverPositionWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACLouverPositionWithCompletionHandler") @NotNull Block_readAttributeACLouverPositionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACLouverPositionWithCompletionHandler {
        @Generated
        void call_readAttributeACLouverPositionWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACRefrigerantTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACRefrigerantTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACRefrigerantTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACRefrigerantTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACRefrigerantTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACRefrigerantTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACRefrigerantTypeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACRefrigerantTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACRefrigerantTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACRefrigerantTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACRefrigerantTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACRefrigerantTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACRefrigerantTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACRefrigerantTypeWithCompletion:")
    public native void readAttributeACRefrigerantTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeACRefrigerantTypeWithCompletion") @NotNull Block_readAttributeACRefrigerantTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACRefrigerantTypeWithCompletion {
        @Generated
        void call_readAttributeACRefrigerantTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACRefrigerantTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACRefrigerantTypeWithCompletionHandler:")
    public native void readAttributeACRefrigerantTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACRefrigerantTypeWithCompletionHandler") @NotNull Block_readAttributeACRefrigerantTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACRefrigerantTypeWithCompletionHandler {
        @Generated
        void call_readAttributeACRefrigerantTypeWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeACTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeACTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeACTypeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeACTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeACTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeACTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeACTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeACTypeWithCompletion:")
    public native void readAttributeACTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeACTypeWithCompletion") @NotNull Block_readAttributeACTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACTypeWithCompletion {
        @Generated
        void call_readAttributeACTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeACTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeACTypeWithCompletionHandler:")
    public native void readAttributeACTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeACTypeWithCompletionHandler") @NotNull Block_readAttributeACTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeACTypeWithCompletionHandler {
        @Generated
        void call_readAttributeACTypeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMaxCoolSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMaxCoolSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAbsMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAbsMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAbsMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMaxCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAbsMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAbsMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMaxCoolSetpointLimitWithCompletion:")
    public native void readAttributeAbsMaxCoolSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeAbsMaxCoolSetpointLimitWithCompletion") @NotNull Block_readAttributeAbsMaxCoolSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxCoolSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeAbsMaxCoolSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMaxCoolSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMaxCoolSetpointLimitWithCompletionHandler:")
    public native void readAttributeAbsMaxCoolSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAbsMaxCoolSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeAbsMaxCoolSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxCoolSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeAbsMaxCoolSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMaxHeatSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMaxHeatSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAbsMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAbsMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAbsMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMaxHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAbsMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAbsMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMaxHeatSetpointLimitWithCompletion:")
    public native void readAttributeAbsMaxHeatSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeAbsMaxHeatSetpointLimitWithCompletion") @NotNull Block_readAttributeAbsMaxHeatSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxHeatSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeAbsMaxHeatSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMaxHeatSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMaxHeatSetpointLimitWithCompletionHandler:")
    public native void readAttributeAbsMaxHeatSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAbsMaxHeatSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeAbsMaxHeatSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxHeatSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeAbsMaxHeatSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMinCoolSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMinCoolSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAbsMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAbsMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAbsMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMinCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAbsMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAbsMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMinCoolSetpointLimitWithCompletion:")
    public native void readAttributeAbsMinCoolSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeAbsMinCoolSetpointLimitWithCompletion") @NotNull Block_readAttributeAbsMinCoolSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinCoolSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeAbsMinCoolSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMinCoolSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMinCoolSetpointLimitWithCompletionHandler:")
    public native void readAttributeAbsMinCoolSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAbsMinCoolSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeAbsMinCoolSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinCoolSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeAbsMinCoolSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMinHeatSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMinHeatSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAbsMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAbsMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAbsMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMinHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAbsMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAbsMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAbsMinHeatSetpointLimitWithCompletion:")
    public native void readAttributeAbsMinHeatSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeAbsMinHeatSetpointLimitWithCompletion") @NotNull Block_readAttributeAbsMinHeatSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinHeatSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeAbsMinHeatSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAbsMinHeatSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAbsMinHeatSetpointLimitWithCompletionHandler:")
    public native void readAttributeAbsMinHeatSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAbsMinHeatSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeAbsMinHeatSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinHeatSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeAbsMinHeatSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcceptedCommandListWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcceptedCommandListWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcceptedCommandListWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcceptedCommandListWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcceptedCommandListWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcceptedCommandListWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcceptedCommandListWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithCompletion:")
    public native void readAttributeAcceptedCommandListWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcceptedCommandListWithCompletion") @NotNull Block_readAttributeAcceptedCommandListWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcceptedCommandListWithCompletion {
        @Generated
        void call_readAttributeAcceptedCommandListWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcceptedCommandListWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcceptedCommandListWithCompletionHandler:")
    public native void readAttributeAcceptedCommandListWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcceptedCommandListWithCompletionHandler") @NotNull Block_readAttributeAcceptedCommandListWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcceptedCommandListWithCompletionHandler {
        @Generated
        void call_readAttributeAcceptedCommandListWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAttributeListWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAttributeListWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAttributeListWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAttributeListWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAttributeListWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttributeListWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAttributeListWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAttributeListWithCompletion:")
    public native void readAttributeAttributeListWithCompletion(
            @ObjCBlock(name = "call_readAttributeAttributeListWithCompletion") @NotNull Block_readAttributeAttributeListWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttributeListWithCompletion {
        @Generated
        void call_readAttributeAttributeListWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAttributeListWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAttributeListWithCompletionHandler:")
    public native void readAttributeAttributeListWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAttributeListWithCompletionHandler") @NotNull Block_readAttributeAttributeListWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttributeListWithCompletionHandler {
        @Generated
        void call_readAttributeAttributeListWithCompletionHandler(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeClusterRevisionWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeClusterRevisionWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeClusterRevisionWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeClusterRevisionWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeClusterRevisionWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithCompletion:")
    public native void readAttributeClusterRevisionWithCompletion(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithCompletion") @NotNull Block_readAttributeClusterRevisionWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithCompletion {
        @Generated
        void call_readAttributeClusterRevisionWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeClusterRevisionWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeClusterRevisionWithCompletionHandler:")
    public native void readAttributeClusterRevisionWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithCompletionHandler") @NotNull Block_readAttributeClusterRevisionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterRevisionWithCompletionHandler {
        @Generated
        void call_readAttributeClusterRevisionWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeControlSequenceOfOperationWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeControlSequenceOfOperationWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeControlSequenceOfOperationWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeControlSequenceOfOperationWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeControlSequenceOfOperationWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeControlSequenceOfOperationWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeControlSequenceOfOperationWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeControlSequenceOfOperationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeControlSequenceOfOperationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeControlSequenceOfOperationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeControlSequenceOfOperationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeControlSequenceOfOperationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeControlSequenceOfOperationWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeControlSequenceOfOperationWithCompletion:")
    public native void readAttributeControlSequenceOfOperationWithCompletion(
            @ObjCBlock(name = "call_readAttributeControlSequenceOfOperationWithCompletion") @NotNull Block_readAttributeControlSequenceOfOperationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeControlSequenceOfOperationWithCompletion {
        @Generated
        void call_readAttributeControlSequenceOfOperationWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeControlSequenceOfOperationWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeControlSequenceOfOperationWithCompletionHandler:")
    public native void readAttributeControlSequenceOfOperationWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeControlSequenceOfOperationWithCompletionHandler") @NotNull Block_readAttributeControlSequenceOfOperationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeControlSequenceOfOperationWithCompletionHandler {
        @Generated
        void call_readAttributeControlSequenceOfOperationWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEmergencyHeatDeltaWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEmergencyHeatDeltaWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEmergencyHeatDeltaWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEmergencyHeatDeltaWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEmergencyHeatDeltaWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEmergencyHeatDeltaWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEmergencyHeatDeltaWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEmergencyHeatDeltaWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEmergencyHeatDeltaWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEmergencyHeatDeltaWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEmergencyHeatDeltaWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEmergencyHeatDeltaWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEmergencyHeatDeltaWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEmergencyHeatDeltaWithCompletion:")
    public native void readAttributeEmergencyHeatDeltaWithCompletion(
            @ObjCBlock(name = "call_readAttributeEmergencyHeatDeltaWithCompletion") @NotNull Block_readAttributeEmergencyHeatDeltaWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEmergencyHeatDeltaWithCompletion {
        @Generated
        void call_readAttributeEmergencyHeatDeltaWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEmergencyHeatDeltaWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEmergencyHeatDeltaWithCompletionHandler:")
    public native void readAttributeEmergencyHeatDeltaWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEmergencyHeatDeltaWithCompletionHandler") @NotNull Block_readAttributeEmergencyHeatDeltaWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEmergencyHeatDeltaWithCompletionHandler {
        @Generated
        void call_readAttributeEmergencyHeatDeltaWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeFeatureMapWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFeatureMapWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeFeatureMapWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFeatureMapWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeFeatureMapWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFeatureMapWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeFeatureMapWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFeatureMapWithCompletion:")
    public native void readAttributeFeatureMapWithCompletion(
            @ObjCBlock(name = "call_readAttributeFeatureMapWithCompletion") @NotNull Block_readAttributeFeatureMapWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFeatureMapWithCompletion {
        @Generated
        void call_readAttributeFeatureMapWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeFeatureMapWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFeatureMapWithCompletionHandler:")
    public native void readAttributeFeatureMapWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeFeatureMapWithCompletionHandler") @NotNull Block_readAttributeFeatureMapWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFeatureMapWithCompletionHandler {
        @Generated
        void call_readAttributeFeatureMapWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeGeneratedCommandListWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeGeneratedCommandListWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeGeneratedCommandListWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeGeneratedCommandListWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeGeneratedCommandListWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneratedCommandListWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeGeneratedCommandListWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithCompletion:")
    public native void readAttributeGeneratedCommandListWithCompletion(
            @ObjCBlock(name = "call_readAttributeGeneratedCommandListWithCompletion") @NotNull Block_readAttributeGeneratedCommandListWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneratedCommandListWithCompletion {
        @Generated
        void call_readAttributeGeneratedCommandListWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeGeneratedCommandListWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeGeneratedCommandListWithCompletionHandler:")
    public native void readAttributeGeneratedCommandListWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeGeneratedCommandListWithCompletionHandler") @NotNull Block_readAttributeGeneratedCommandListWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneratedCommandListWithCompletionHandler {
        @Generated
        void call_readAttributeGeneratedCommandListWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeHVACSystemTypeConfigurationWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeHVACSystemTypeConfigurationWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeHVACSystemTypeConfigurationWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeHVACSystemTypeConfigurationWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeHVACSystemTypeConfigurationWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHVACSystemTypeConfigurationWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeHVACSystemTypeConfigurationWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeHVACSystemTypeConfigurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeHVACSystemTypeConfigurationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeHVACSystemTypeConfigurationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeHVACSystemTypeConfigurationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHVACSystemTypeConfigurationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeHVACSystemTypeConfigurationWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeHVACSystemTypeConfigurationWithCompletion:")
    public native void readAttributeHVACSystemTypeConfigurationWithCompletion(
            @ObjCBlock(name = "call_readAttributeHVACSystemTypeConfigurationWithCompletion") @NotNull Block_readAttributeHVACSystemTypeConfigurationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHVACSystemTypeConfigurationWithCompletion {
        @Generated
        void call_readAttributeHVACSystemTypeConfigurationWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeHVACSystemTypeConfigurationWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeHVACSystemTypeConfigurationWithCompletionHandler:")
    public native void readAttributeHVACSystemTypeConfigurationWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeHVACSystemTypeConfigurationWithCompletionHandler") @NotNull Block_readAttributeHVACSystemTypeConfigurationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHVACSystemTypeConfigurationWithCompletionHandler {
        @Generated
        void call_readAttributeHVACSystemTypeConfigurationWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeLocalTemperatureCalibrationWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLocalTemperatureCalibrationWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLocalTemperatureCalibrationWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLocalTemperatureCalibrationWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLocalTemperatureCalibrationWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureCalibrationWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLocalTemperatureCalibrationWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocalTemperatureCalibrationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLocalTemperatureCalibrationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLocalTemperatureCalibrationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLocalTemperatureCalibrationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureCalibrationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLocalTemperatureCalibrationWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocalTemperatureCalibrationWithCompletion:")
    public native void readAttributeLocalTemperatureCalibrationWithCompletion(
            @ObjCBlock(name = "call_readAttributeLocalTemperatureCalibrationWithCompletion") @NotNull Block_readAttributeLocalTemperatureCalibrationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureCalibrationWithCompletion {
        @Generated
        void call_readAttributeLocalTemperatureCalibrationWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLocalTemperatureCalibrationWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLocalTemperatureCalibrationWithCompletionHandler:")
    public native void readAttributeLocalTemperatureCalibrationWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLocalTemperatureCalibrationWithCompletionHandler") @NotNull Block_readAttributeLocalTemperatureCalibrationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureCalibrationWithCompletionHandler {
        @Generated
        void call_readAttributeLocalTemperatureCalibrationWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLocalTemperatureWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLocalTemperatureWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLocalTemperatureWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLocalTemperatureWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLocalTemperatureWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLocalTemperatureWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocalTemperatureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLocalTemperatureWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLocalTemperatureWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLocalTemperatureWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLocalTemperatureWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocalTemperatureWithCompletion:")
    public native void readAttributeLocalTemperatureWithCompletion(
            @ObjCBlock(name = "call_readAttributeLocalTemperatureWithCompletion") @NotNull Block_readAttributeLocalTemperatureWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureWithCompletion {
        @Generated
        void call_readAttributeLocalTemperatureWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLocalTemperatureWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLocalTemperatureWithCompletionHandler:")
    public native void readAttributeLocalTemperatureWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLocalTemperatureWithCompletionHandler") @NotNull Block_readAttributeLocalTemperatureWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalTemperatureWithCompletionHandler {
        @Generated
        void call_readAttributeLocalTemperatureWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxCoolSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxCoolSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMaxCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMaxCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxCoolSetpointLimitWithCompletion:")
    public native void readAttributeMaxCoolSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeMaxCoolSetpointLimitWithCompletion") @NotNull Block_readAttributeMaxCoolSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxCoolSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeMaxCoolSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxCoolSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxCoolSetpointLimitWithCompletionHandler:")
    public native void readAttributeMaxCoolSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMaxCoolSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeMaxCoolSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxCoolSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeMaxCoolSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxHeatSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxHeatSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMaxHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMaxHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxHeatSetpointLimitWithCompletion:")
    public native void readAttributeMaxHeatSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeMaxHeatSetpointLimitWithCompletion") @NotNull Block_readAttributeMaxHeatSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxHeatSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeMaxHeatSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxHeatSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxHeatSetpointLimitWithCompletionHandler:")
    public native void readAttributeMaxHeatSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMaxHeatSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeMaxHeatSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxHeatSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeMaxHeatSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinCoolSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinCoolSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMinCoolSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinCoolSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMinCoolSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinCoolSetpointLimitWithCompletion:")
    public native void readAttributeMinCoolSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeMinCoolSetpointLimitWithCompletion") @NotNull Block_readAttributeMinCoolSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinCoolSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeMinCoolSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinCoolSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinCoolSetpointLimitWithCompletionHandler:")
    public native void readAttributeMinCoolSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMinCoolSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeMinCoolSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinCoolSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeMinCoolSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinHeatSetpointLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinHeatSetpointLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMinHeatSetpointLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinHeatSetpointLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMinHeatSetpointLimitWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinHeatSetpointLimitWithCompletion:")
    public native void readAttributeMinHeatSetpointLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeMinHeatSetpointLimitWithCompletion") @NotNull Block_readAttributeMinHeatSetpointLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinHeatSetpointLimitWithCompletion {
        @Generated
        void call_readAttributeMinHeatSetpointLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinHeatSetpointLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinHeatSetpointLimitWithCompletionHandler:")
    public native void readAttributeMinHeatSetpointLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMinHeatSetpointLimitWithCompletionHandler") @NotNull Block_readAttributeMinHeatSetpointLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinHeatSetpointLimitWithCompletionHandler {
        @Generated
        void call_readAttributeMinHeatSetpointLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinSetpointDeadBandWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinSetpointDeadBandWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMinSetpointDeadBandWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinSetpointDeadBandWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMinSetpointDeadBandWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinSetpointDeadBandWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMinSetpointDeadBandWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinSetpointDeadBandWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinSetpointDeadBandWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinSetpointDeadBandWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMinSetpointDeadBandWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinSetpointDeadBandWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMinSetpointDeadBandWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinSetpointDeadBandWithCompletion:")
    public native void readAttributeMinSetpointDeadBandWithCompletion(
            @ObjCBlock(name = "call_readAttributeMinSetpointDeadBandWithCompletion") @NotNull Block_readAttributeMinSetpointDeadBandWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinSetpointDeadBandWithCompletion {
        @Generated
        void call_readAttributeMinSetpointDeadBandWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinSetpointDeadBandWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinSetpointDeadBandWithCompletionHandler:")
    public native void readAttributeMinSetpointDeadBandWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMinSetpointDeadBandWithCompletionHandler") @NotNull Block_readAttributeMinSetpointDeadBandWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinSetpointDeadBandWithCompletionHandler {
        @Generated
        void call_readAttributeMinSetpointDeadBandWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfDailyTransitionsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfDailyTransitionsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfDailyTransitionsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfDailyTransitionsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfDailyTransitionsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfDailyTransitionsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfDailyTransitionsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfDailyTransitionsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfDailyTransitionsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfDailyTransitionsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfDailyTransitionsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfDailyTransitionsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfDailyTransitionsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfDailyTransitionsWithCompletion:")
    public native void readAttributeNumberOfDailyTransitionsWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfDailyTransitionsWithCompletion") @NotNull Block_readAttributeNumberOfDailyTransitionsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfDailyTransitionsWithCompletion {
        @Generated
        void call_readAttributeNumberOfDailyTransitionsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfDailyTransitionsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfDailyTransitionsWithCompletionHandler:")
    public native void readAttributeNumberOfDailyTransitionsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfDailyTransitionsWithCompletionHandler") @NotNull Block_readAttributeNumberOfDailyTransitionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfDailyTransitionsWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfDailyTransitionsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfWeeklyTransitionsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfWeeklyTransitionsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfWeeklyTransitionsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfWeeklyTransitionsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfWeeklyTransitionsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeeklyTransitionsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfWeeklyTransitionsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfWeeklyTransitionsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfWeeklyTransitionsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfWeeklyTransitionsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfWeeklyTransitionsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeeklyTransitionsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfWeeklyTransitionsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfWeeklyTransitionsWithCompletion:")
    public native void readAttributeNumberOfWeeklyTransitionsWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfWeeklyTransitionsWithCompletion") @NotNull Block_readAttributeNumberOfWeeklyTransitionsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeeklyTransitionsWithCompletion {
        @Generated
        void call_readAttributeNumberOfWeeklyTransitionsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfWeeklyTransitionsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfWeeklyTransitionsWithCompletionHandler:")
    public native void readAttributeNumberOfWeeklyTransitionsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfWeeklyTransitionsWithCompletionHandler") @NotNull Block_readAttributeNumberOfWeeklyTransitionsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeeklyTransitionsWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfWeeklyTransitionsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupancyWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupancyWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupancyWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupancyWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupancyWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancyWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupancyWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupancyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupancyWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupancyWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupancyWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancyWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupancyWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupancyWithCompletion:")
    public native void readAttributeOccupancyWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupancyWithCompletion") @NotNull Block_readAttributeOccupancyWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancyWithCompletion {
        @Generated
        void call_readAttributeOccupancyWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupancyWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupancyWithCompletionHandler:")
    public native void readAttributeOccupancyWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupancyWithCompletionHandler") @NotNull Block_readAttributeOccupancyWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancyWithCompletionHandler {
        @Generated
        void call_readAttributeOccupancyWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedCoolingSetpointWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedCoolingSetpointWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedCoolingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedCoolingSetpointWithCompletion:")
    public native void readAttributeOccupiedCoolingSetpointWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupiedCoolingSetpointWithCompletion") @NotNull Block_readAttributeOccupiedCoolingSetpointWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedCoolingSetpointWithCompletion {
        @Generated
        void call_readAttributeOccupiedCoolingSetpointWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedCoolingSetpointWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedCoolingSetpointWithCompletionHandler:")
    public native void readAttributeOccupiedCoolingSetpointWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupiedCoolingSetpointWithCompletionHandler") @NotNull Block_readAttributeOccupiedCoolingSetpointWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedCoolingSetpointWithCompletionHandler {
        @Generated
        void call_readAttributeOccupiedCoolingSetpointWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedHeatingSetpointWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedHeatingSetpointWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedHeatingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedHeatingSetpointWithCompletion:")
    public native void readAttributeOccupiedHeatingSetpointWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupiedHeatingSetpointWithCompletion") @NotNull Block_readAttributeOccupiedHeatingSetpointWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedHeatingSetpointWithCompletion {
        @Generated
        void call_readAttributeOccupiedHeatingSetpointWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedHeatingSetpointWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedHeatingSetpointWithCompletionHandler:")
    public native void readAttributeOccupiedHeatingSetpointWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupiedHeatingSetpointWithCompletionHandler") @NotNull Block_readAttributeOccupiedHeatingSetpointWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedHeatingSetpointWithCompletionHandler {
        @Generated
        void call_readAttributeOccupiedHeatingSetpointWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedSetbackMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedSetbackMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackMaxWithCompletion:")
    public native void readAttributeOccupiedSetbackMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMaxWithCompletion") @NotNull Block_readAttributeOccupiedSetbackMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMaxWithCompletion {
        @Generated
        void call_readAttributeOccupiedSetbackMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedSetbackMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedSetbackMaxWithCompletionHandler:")
    public native void readAttributeOccupiedSetbackMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMaxWithCompletionHandler") @NotNull Block_readAttributeOccupiedSetbackMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMaxWithCompletionHandler {
        @Generated
        void call_readAttributeOccupiedSetbackMaxWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedSetbackMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedSetbackMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackMinWithCompletion:")
    public native void readAttributeOccupiedSetbackMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMinWithCompletion") @NotNull Block_readAttributeOccupiedSetbackMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMinWithCompletion {
        @Generated
        void call_readAttributeOccupiedSetbackMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedSetbackMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedSetbackMinWithCompletionHandler:")
    public native void readAttributeOccupiedSetbackMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackMinWithCompletionHandler") @NotNull Block_readAttributeOccupiedSetbackMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackMinWithCompletionHandler {
        @Generated
        void call_readAttributeOccupiedSetbackMinWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedSetbackWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedSetbackWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupiedSetbackWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupiedSetbackWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupiedSetbackWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupiedSetbackWithCompletion:")
    public native void readAttributeOccupiedSetbackWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackWithCompletion") @NotNull Block_readAttributeOccupiedSetbackWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackWithCompletion {
        @Generated
        void call_readAttributeOccupiedSetbackWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupiedSetbackWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupiedSetbackWithCompletionHandler:")
    public native void readAttributeOccupiedSetbackWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupiedSetbackWithCompletionHandler") @NotNull Block_readAttributeOccupiedSetbackWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupiedSetbackWithCompletionHandler {
        @Generated
        void call_readAttributeOccupiedSetbackWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOutdoorTemperatureWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOutdoorTemperatureWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOutdoorTemperatureWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOutdoorTemperatureWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOutdoorTemperatureWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOutdoorTemperatureWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOutdoorTemperatureWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOutdoorTemperatureWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOutdoorTemperatureWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOutdoorTemperatureWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOutdoorTemperatureWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOutdoorTemperatureWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOutdoorTemperatureWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOutdoorTemperatureWithCompletion:")
    public native void readAttributeOutdoorTemperatureWithCompletion(
            @ObjCBlock(name = "call_readAttributeOutdoorTemperatureWithCompletion") @NotNull Block_readAttributeOutdoorTemperatureWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOutdoorTemperatureWithCompletion {
        @Generated
        void call_readAttributeOutdoorTemperatureWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOutdoorTemperatureWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOutdoorTemperatureWithCompletionHandler:")
    public native void readAttributeOutdoorTemperatureWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOutdoorTemperatureWithCompletionHandler") @NotNull Block_readAttributeOutdoorTemperatureWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOutdoorTemperatureWithCompletionHandler {
        @Generated
        void call_readAttributeOutdoorTemperatureWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePICoolingDemandWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePICoolingDemandWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePICoolingDemandWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePICoolingDemandWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePICoolingDemandWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePICoolingDemandWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePICoolingDemandWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePICoolingDemandWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePICoolingDemandWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePICoolingDemandWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePICoolingDemandWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePICoolingDemandWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePICoolingDemandWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePICoolingDemandWithCompletion:")
    public native void readAttributePICoolingDemandWithCompletion(
            @ObjCBlock(name = "call_readAttributePICoolingDemandWithCompletion") @NotNull Block_readAttributePICoolingDemandWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePICoolingDemandWithCompletion {
        @Generated
        void call_readAttributePICoolingDemandWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePICoolingDemandWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePICoolingDemandWithCompletionHandler:")
    public native void readAttributePICoolingDemandWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePICoolingDemandWithCompletionHandler") @NotNull Block_readAttributePICoolingDemandWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePICoolingDemandWithCompletionHandler {
        @Generated
        void call_readAttributePICoolingDemandWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIHeatingDemandWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePIHeatingDemandWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePIHeatingDemandWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePIHeatingDemandWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePIHeatingDemandWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIHeatingDemandWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePIHeatingDemandWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIHeatingDemandWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIHeatingDemandWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePIHeatingDemandWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePIHeatingDemandWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIHeatingDemandWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePIHeatingDemandWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIHeatingDemandWithCompletion:")
    public native void readAttributePIHeatingDemandWithCompletion(
            @ObjCBlock(name = "call_readAttributePIHeatingDemandWithCompletion") @NotNull Block_readAttributePIHeatingDemandWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIHeatingDemandWithCompletion {
        @Generated
        void call_readAttributePIHeatingDemandWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIHeatingDemandWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePIHeatingDemandWithCompletionHandler:")
    public native void readAttributePIHeatingDemandWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePIHeatingDemandWithCompletionHandler") @NotNull Block_readAttributePIHeatingDemandWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIHeatingDemandWithCompletionHandler {
        @Generated
        void call_readAttributePIHeatingDemandWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRemoteSensingWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRemoteSensingWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRemoteSensingWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRemoteSensingWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRemoteSensingWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemoteSensingWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRemoteSensingWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRemoteSensingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRemoteSensingWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRemoteSensingWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRemoteSensingWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemoteSensingWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRemoteSensingWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRemoteSensingWithCompletion:")
    public native void readAttributeRemoteSensingWithCompletion(
            @ObjCBlock(name = "call_readAttributeRemoteSensingWithCompletion") @NotNull Block_readAttributeRemoteSensingWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemoteSensingWithCompletion {
        @Generated
        void call_readAttributeRemoteSensingWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRemoteSensingWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRemoteSensingWithCompletionHandler:")
    public native void readAttributeRemoteSensingWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRemoteSensingWithCompletionHandler") @NotNull Block_readAttributeRemoteSensingWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemoteSensingWithCompletionHandler {
        @Generated
        void call_readAttributeRemoteSensingWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSetpointChangeAmountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSetpointChangeAmountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSetpointChangeAmountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSetpointChangeAmountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSetpointChangeAmountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeAmountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSetpointChangeAmountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSetpointChangeAmountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSetpointChangeAmountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSetpointChangeAmountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSetpointChangeAmountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeAmountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSetpointChangeAmountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSetpointChangeAmountWithCompletion:")
    public native void readAttributeSetpointChangeAmountWithCompletion(
            @ObjCBlock(name = "call_readAttributeSetpointChangeAmountWithCompletion") @NotNull Block_readAttributeSetpointChangeAmountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeAmountWithCompletion {
        @Generated
        void call_readAttributeSetpointChangeAmountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSetpointChangeAmountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSetpointChangeAmountWithCompletionHandler:")
    public native void readAttributeSetpointChangeAmountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSetpointChangeAmountWithCompletionHandler") @NotNull Block_readAttributeSetpointChangeAmountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeAmountWithCompletionHandler {
        @Generated
        void call_readAttributeSetpointChangeAmountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeSetpointChangeSourceTimestampWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSetpointChangeSourceTimestampWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSetpointChangeSourceTimestampWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceTimestampWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSetpointChangeSourceTimestampWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceTimestampWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSetpointChangeSourceTimestampWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSetpointChangeSourceTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSetpointChangeSourceTimestampWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceTimestampWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSetpointChangeSourceTimestampWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceTimestampWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSetpointChangeSourceTimestampWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSetpointChangeSourceTimestampWithCompletion:")
    public native void readAttributeSetpointChangeSourceTimestampWithCompletion(
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceTimestampWithCompletion") @NotNull Block_readAttributeSetpointChangeSourceTimestampWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceTimestampWithCompletion {
        @Generated
        void call_readAttributeSetpointChangeSourceTimestampWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSetpointChangeSourceTimestampWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSetpointChangeSourceTimestampWithCompletionHandler:")
    public native void readAttributeSetpointChangeSourceTimestampWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceTimestampWithCompletionHandler") @NotNull Block_readAttributeSetpointChangeSourceTimestampWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceTimestampWithCompletionHandler {
        @Generated
        void call_readAttributeSetpointChangeSourceTimestampWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSetpointChangeSourceWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSetpointChangeSourceWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSetpointChangeSourceWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSetpointChangeSourceWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSetpointChangeSourceWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSetpointChangeSourceWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSetpointChangeSourceWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSetpointChangeSourceWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSetpointChangeSourceWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSetpointChangeSourceWithCompletion:")
    public native void readAttributeSetpointChangeSourceWithCompletion(
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceWithCompletion") @NotNull Block_readAttributeSetpointChangeSourceWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceWithCompletion {
        @Generated
        void call_readAttributeSetpointChangeSourceWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSetpointChangeSourceWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSetpointChangeSourceWithCompletionHandler:")
    public native void readAttributeSetpointChangeSourceWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSetpointChangeSourceWithCompletionHandler") @NotNull Block_readAttributeSetpointChangeSourceWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSetpointChangeSourceWithCompletionHandler {
        @Generated
        void call_readAttributeSetpointChangeSourceWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeStartOfWeekWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStartOfWeekWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeStartOfWeekWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStartOfWeekWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeStartOfWeekWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartOfWeekWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeStartOfWeekWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStartOfWeekWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStartOfWeekWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStartOfWeekWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeStartOfWeekWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartOfWeekWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeStartOfWeekWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStartOfWeekWithCompletion:")
    public native void readAttributeStartOfWeekWithCompletion(
            @ObjCBlock(name = "call_readAttributeStartOfWeekWithCompletion") @NotNull Block_readAttributeStartOfWeekWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartOfWeekWithCompletion {
        @Generated
        void call_readAttributeStartOfWeekWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeStartOfWeekWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStartOfWeekWithCompletionHandler:")
    public native void readAttributeStartOfWeekWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeStartOfWeekWithCompletionHandler") @NotNull Block_readAttributeStartOfWeekWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStartOfWeekWithCompletionHandler {
        @Generated
        void call_readAttributeStartOfWeekWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSystemModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSystemModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSystemModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSystemModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSystemModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSystemModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSystemModeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSystemModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSystemModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSystemModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSystemModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSystemModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSystemModeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSystemModeWithCompletion:")
    public native void readAttributeSystemModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeSystemModeWithCompletion") @NotNull Block_readAttributeSystemModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSystemModeWithCompletion {
        @Generated
        void call_readAttributeSystemModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSystemModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSystemModeWithCompletionHandler:")
    public native void readAttributeSystemModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSystemModeWithCompletionHandler") @NotNull Block_readAttributeSystemModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSystemModeWithCompletionHandler {
        @Generated
        void call_readAttributeSystemModeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeTemperatureSetpointHoldDurationWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTemperatureSetpointHoldDurationWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTemperatureSetpointHoldDurationWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldDurationWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTemperatureSetpointHoldDurationWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldDurationWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTemperatureSetpointHoldDurationWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTemperatureSetpointHoldDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTemperatureSetpointHoldDurationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldDurationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTemperatureSetpointHoldDurationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldDurationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTemperatureSetpointHoldDurationWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTemperatureSetpointHoldDurationWithCompletion:")
    public native void readAttributeTemperatureSetpointHoldDurationWithCompletion(
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldDurationWithCompletion") @NotNull Block_readAttributeTemperatureSetpointHoldDurationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldDurationWithCompletion {
        @Generated
        void call_readAttributeTemperatureSetpointHoldDurationWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTemperatureSetpointHoldDurationWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTemperatureSetpointHoldDurationWithCompletionHandler:")
    public native void readAttributeTemperatureSetpointHoldDurationWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldDurationWithCompletionHandler") @NotNull Block_readAttributeTemperatureSetpointHoldDurationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldDurationWithCompletionHandler {
        @Generated
        void call_readAttributeTemperatureSetpointHoldDurationWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTemperatureSetpointHoldWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTemperatureSetpointHoldWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTemperatureSetpointHoldWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTemperatureSetpointHoldWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTemperatureSetpointHoldWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTemperatureSetpointHoldWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTemperatureSetpointHoldWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTemperatureSetpointHoldWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTemperatureSetpointHoldWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTemperatureSetpointHoldWithCompletion:")
    public native void readAttributeTemperatureSetpointHoldWithCompletion(
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldWithCompletion") @NotNull Block_readAttributeTemperatureSetpointHoldWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldWithCompletion {
        @Generated
        void call_readAttributeTemperatureSetpointHoldWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTemperatureSetpointHoldWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTemperatureSetpointHoldWithCompletionHandler:")
    public native void readAttributeTemperatureSetpointHoldWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTemperatureSetpointHoldWithCompletionHandler") @NotNull Block_readAttributeTemperatureSetpointHoldWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureSetpointHoldWithCompletionHandler {
        @Generated
        void call_readAttributeTemperatureSetpointHoldWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeThermostatProgrammingOperationModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeThermostatProgrammingOperationModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeThermostatProgrammingOperationModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeThermostatProgrammingOperationModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeThermostatProgrammingOperationModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatProgrammingOperationModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeThermostatProgrammingOperationModeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeThermostatProgrammingOperationModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeThermostatProgrammingOperationModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeThermostatProgrammingOperationModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeThermostatProgrammingOperationModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatProgrammingOperationModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeThermostatProgrammingOperationModeWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeThermostatProgrammingOperationModeWithCompletion:")
    public native void readAttributeThermostatProgrammingOperationModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeThermostatProgrammingOperationModeWithCompletion") @NotNull Block_readAttributeThermostatProgrammingOperationModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatProgrammingOperationModeWithCompletion {
        @Generated
        void call_readAttributeThermostatProgrammingOperationModeWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeThermostatProgrammingOperationModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeThermostatProgrammingOperationModeWithCompletionHandler:")
    public native void readAttributeThermostatProgrammingOperationModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeThermostatProgrammingOperationModeWithCompletionHandler") @NotNull Block_readAttributeThermostatProgrammingOperationModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatProgrammingOperationModeWithCompletionHandler {
        @Generated
        void call_readAttributeThermostatProgrammingOperationModeWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeThermostatRunningModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeThermostatRunningModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeThermostatRunningModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeThermostatRunningModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeThermostatRunningModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeThermostatRunningModeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeThermostatRunningModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeThermostatRunningModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeThermostatRunningModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeThermostatRunningModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeThermostatRunningModeWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeThermostatRunningModeWithCompletion:")
    public native void readAttributeThermostatRunningModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeThermostatRunningModeWithCompletion") @NotNull Block_readAttributeThermostatRunningModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningModeWithCompletion {
        @Generated
        void call_readAttributeThermostatRunningModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeThermostatRunningModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeThermostatRunningModeWithCompletionHandler:")
    public native void readAttributeThermostatRunningModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeThermostatRunningModeWithCompletionHandler") @NotNull Block_readAttributeThermostatRunningModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningModeWithCompletionHandler {
        @Generated
        void call_readAttributeThermostatRunningModeWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeThermostatRunningStateWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeThermostatRunningStateWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeThermostatRunningStateWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeThermostatRunningStateWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeThermostatRunningStateWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningStateWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeThermostatRunningStateWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeThermostatRunningStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeThermostatRunningStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeThermostatRunningStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeThermostatRunningStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeThermostatRunningStateWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeThermostatRunningStateWithCompletion:")
    public native void readAttributeThermostatRunningStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeThermostatRunningStateWithCompletion") @NotNull Block_readAttributeThermostatRunningStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningStateWithCompletion {
        @Generated
        void call_readAttributeThermostatRunningStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeThermostatRunningStateWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeThermostatRunningStateWithCompletionHandler:")
    public native void readAttributeThermostatRunningStateWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeThermostatRunningStateWithCompletionHandler") @NotNull Block_readAttributeThermostatRunningStateWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThermostatRunningStateWithCompletionHandler {
        @Generated
        void call_readAttributeThermostatRunningStateWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeUnoccupiedCoolingSetpointWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedCoolingSetpointWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUnoccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUnoccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedCoolingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedCoolingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUnoccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUnoccupiedCoolingSetpointWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedCoolingSetpointWithCompletion:")
    public native void readAttributeUnoccupiedCoolingSetpointWithCompletion(
            @ObjCBlock(name = "call_readAttributeUnoccupiedCoolingSetpointWithCompletion") @NotNull Block_readAttributeUnoccupiedCoolingSetpointWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedCoolingSetpointWithCompletion {
        @Generated
        void call_readAttributeUnoccupiedCoolingSetpointWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedCoolingSetpointWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedCoolingSetpointWithCompletionHandler:")
    public native void readAttributeUnoccupiedCoolingSetpointWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUnoccupiedCoolingSetpointWithCompletionHandler") @NotNull Block_readAttributeUnoccupiedCoolingSetpointWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedCoolingSetpointWithCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedCoolingSetpointWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeUnoccupiedHeatingSetpointWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedHeatingSetpointWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUnoccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUnoccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedHeatingSetpointWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedHeatingSetpointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUnoccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUnoccupiedHeatingSetpointWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedHeatingSetpointWithCompletion:")
    public native void readAttributeUnoccupiedHeatingSetpointWithCompletion(
            @ObjCBlock(name = "call_readAttributeUnoccupiedHeatingSetpointWithCompletion") @NotNull Block_readAttributeUnoccupiedHeatingSetpointWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedHeatingSetpointWithCompletion {
        @Generated
        void call_readAttributeUnoccupiedHeatingSetpointWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedHeatingSetpointWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedHeatingSetpointWithCompletionHandler:")
    public native void readAttributeUnoccupiedHeatingSetpointWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUnoccupiedHeatingSetpointWithCompletionHandler") @NotNull Block_readAttributeUnoccupiedHeatingSetpointWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedHeatingSetpointWithCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedHeatingSetpointWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedSetbackMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedSetbackMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUnoccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUnoccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedSetbackMaxWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUnoccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUnoccupiedSetbackMaxWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackMaxWithCompletion:")
    public native void readAttributeUnoccupiedSetbackMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMaxWithCompletion") @NotNull Block_readAttributeUnoccupiedSetbackMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMaxWithCompletion {
        @Generated
        void call_readAttributeUnoccupiedSetbackMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedSetbackMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedSetbackMaxWithCompletionHandler:")
    public native void readAttributeUnoccupiedSetbackMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMaxWithCompletionHandler") @NotNull Block_readAttributeUnoccupiedSetbackMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMaxWithCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedSetbackMaxWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedSetbackMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedSetbackMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUnoccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUnoccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedSetbackMinWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUnoccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUnoccupiedSetbackMinWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackMinWithCompletion:")
    public native void readAttributeUnoccupiedSetbackMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMinWithCompletion") @NotNull Block_readAttributeUnoccupiedSetbackMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMinWithCompletion {
        @Generated
        void call_readAttributeUnoccupiedSetbackMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedSetbackMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedSetbackMinWithCompletionHandler:")
    public native void readAttributeUnoccupiedSetbackMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackMinWithCompletionHandler") @NotNull Block_readAttributeUnoccupiedSetbackMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackMinWithCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedSetbackMinWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedSetbackWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedSetbackWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUnoccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUnoccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedSetbackWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnoccupiedSetbackWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUnoccupiedSetbackWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUnoccupiedSetbackWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUnoccupiedSetbackWithCompletion:")
    public native void readAttributeUnoccupiedSetbackWithCompletion(
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackWithCompletion") @NotNull Block_readAttributeUnoccupiedSetbackWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackWithCompletion {
        @Generated
        void call_readAttributeUnoccupiedSetbackWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnoccupiedSetbackWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnoccupiedSetbackWithCompletionHandler:")
    public native void readAttributeUnoccupiedSetbackWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUnoccupiedSetbackWithCompletionHandler") @NotNull Block_readAttributeUnoccupiedSetbackWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnoccupiedSetbackWithCompletionHandler {
        @Generated
        void call_readAttributeUnoccupiedSetbackWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
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
     * Command SetWeeklySchedule
     * 
     * Command description for SetWeeklySchedule
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setWeeklyScheduleWithParams:completion:")
    public native void setWeeklyScheduleWithParamsCompletion(
            @NotNull MTRThermostatClusterSetWeeklyScheduleParams params,
            @ObjCBlock(name = "call_setWeeklyScheduleWithParamsCompletion") @NotNull Block_setWeeklyScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeeklyScheduleWithParamsCompletion {
        @Generated
        void call_setWeeklyScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setWeeklyScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("setWeeklyScheduleWithParams:completionHandler:")
    public native void setWeeklyScheduleWithParamsCompletionHandler(
            @NotNull MTRThermostatClusterSetWeeklyScheduleParams params,
            @ObjCBlock(name = "call_setWeeklyScheduleWithParamsCompletionHandler") @NotNull Block_setWeeklyScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeeklyScheduleWithParamsCompletionHandler {
        @Generated
        void call_setWeeklyScheduleWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command SetpointRaiseLower
     * 
     * Command description for SetpointRaiseLower
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setpointRaiseLowerWithParams:completion:")
    public native void setpointRaiseLowerWithParamsCompletion(
            @NotNull MTRThermostatClusterSetpointRaiseLowerParams params,
            @ObjCBlock(name = "call_setpointRaiseLowerWithParamsCompletion") @NotNull Block_setpointRaiseLowerWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setpointRaiseLowerWithParamsCompletion {
        @Generated
        void call_setpointRaiseLowerWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setpointRaiseLowerWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("setpointRaiseLowerWithParams:completionHandler:")
    public native void setpointRaiseLowerWithParamsCompletionHandler(
            @NotNull MTRThermostatClusterSetpointRaiseLowerParams params,
            @ObjCBlock(name = "call_setpointRaiseLowerWithParamsCompletionHandler") @NotNull Block_setpointRaiseLowerWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setpointRaiseLowerWithParamsCompletionHandler {
        @Generated
        void call_setpointRaiseLowerWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACCapacityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACCapacityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACCapacityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACCapacityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACCapacityWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACCapacityformatWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACCapacityformatWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACCapacityformatWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACCapacityformatWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACCapacityformatWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACCoilTemperatureWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACCoilTemperatureWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACCoilTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACCoilTemperatureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACCoilTemperatureWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACCompressorTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACCompressorTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACCompressorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACCompressorTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACCompressorTypeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACErrorCodeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACErrorCodeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACErrorCodeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACErrorCodeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACErrorCodeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACLouverPositionWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACLouverPositionWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACLouverPositionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACLouverPositionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACLouverPositionWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACRefrigerantTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACRefrigerantTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACRefrigerantTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACRefrigerantTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACRefrigerantTypeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeACTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeACTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeACTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeACTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeACTypeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAbsMaxCoolSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAbsMaxCoolSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAbsMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAbsMaxCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAbsMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAbsMaxHeatSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAbsMaxHeatSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAbsMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAbsMaxHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAbsMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAbsMinCoolSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAbsMinCoolSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAbsMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAbsMinCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAbsMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAbsMinHeatSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAbsMinHeatSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAbsMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAbsMinHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAbsMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcceptedCommandListWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcceptedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcceptedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcceptedCommandListWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAttributeListWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAttributeListWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAttributeListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAttributeListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAttributeListWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeClusterRevisionWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeClusterRevisionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeClusterRevisionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeClusterRevisionWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeControlSequenceOfOperationWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeControlSequenceOfOperationWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeControlSequenceOfOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeControlSequenceOfOperationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeControlSequenceOfOperationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEmergencyHeatDeltaWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEmergencyHeatDeltaWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEmergencyHeatDeltaWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEmergencyHeatDeltaWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEmergencyHeatDeltaWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeFeatureMapWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeFeatureMapWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeFeatureMapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeFeatureMapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeFeatureMapWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeGeneratedCommandListWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeGeneratedCommandListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeGeneratedCommandListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeGeneratedCommandListWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeHVACSystemTypeConfigurationWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeHVACSystemTypeConfigurationWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeHVACSystemTypeConfigurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeHVACSystemTypeConfigurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeHVACSystemTypeConfigurationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLocalTemperatureCalibrationWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLocalTemperatureCalibrationWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLocalTemperatureCalibrationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLocalTemperatureCalibrationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLocalTemperatureCalibrationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLocalTemperatureWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLocalTemperatureWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLocalTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLocalTemperatureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLocalTemperatureWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMaxCoolSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMaxCoolSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMaxCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMaxCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMaxCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMaxHeatSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMaxHeatSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMaxHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMaxHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMaxHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMinCoolSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMinCoolSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMinCoolSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMinCoolSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMinCoolSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMinHeatSetpointLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMinHeatSetpointLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMinHeatSetpointLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMinHeatSetpointLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMinHeatSetpointLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMinSetpointDeadBandWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMinSetpointDeadBandWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMinSetpointDeadBandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMinSetpointDeadBandWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMinSetpointDeadBandWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNumberOfDailyTransitionsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfDailyTransitionsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfDailyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfDailyTransitionsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfDailyTransitionsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNumberOfWeeklyTransitionsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfWeeklyTransitionsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfWeeklyTransitionsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfWeeklyTransitionsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfWeeklyTransitionsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOccupancyWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupancyWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupancyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupancyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupancyWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOccupiedCoolingSetpointWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupiedCoolingSetpointWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupiedCoolingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOccupiedHeatingSetpointWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupiedHeatingSetpointWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupiedHeatingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOccupiedSetbackMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupiedSetbackMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupiedSetbackMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOccupiedSetbackMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupiedSetbackMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupiedSetbackMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOccupiedSetbackWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupiedSetbackWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupiedSetbackWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOutdoorTemperatureWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOutdoorTemperatureWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOutdoorTemperatureWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOutdoorTemperatureWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOutdoorTemperatureWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePICoolingDemandWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePICoolingDemandWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePICoolingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePICoolingDemandWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePICoolingDemandWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePIHeatingDemandWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePIHeatingDemandWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePIHeatingDemandWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePIHeatingDemandWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePIHeatingDemandWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRemoteSensingWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRemoteSensingWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRemoteSensingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRemoteSensingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRemoteSensingWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSetpointChangeAmountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSetpointChangeAmountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSetpointChangeAmountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSetpointChangeAmountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSetpointChangeAmountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSetpointChangeSourceTimestampWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSetpointChangeSourceTimestampWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSetpointChangeSourceTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceTimestampWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSetpointChangeSourceWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSetpointChangeSourceWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSetpointChangeSourceWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSetpointChangeSourceWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeStartOfWeekWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeStartOfWeekWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeStartOfWeekWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeStartOfWeekWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeStartOfWeekWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSystemModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSystemModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSystemModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSystemModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSystemModeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeTemperatureSetpointHoldDurationWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTemperatureSetpointHoldDurationWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldDurationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTemperatureSetpointHoldDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldDurationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTemperatureSetpointHoldWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTemperatureSetpointHoldWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTemperatureSetpointHoldWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTemperatureSetpointHoldWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeThermostatProgrammingOperationModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeThermostatProgrammingOperationModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeThermostatProgrammingOperationModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeThermostatProgrammingOperationModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeThermostatProgrammingOperationModeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeThermostatRunningModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeThermostatRunningModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeThermostatRunningModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeThermostatRunningModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeThermostatRunningModeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeThermostatRunningStateWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeThermostatRunningStateWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeThermostatRunningStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeThermostatRunningStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeThermostatRunningStateWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeUnoccupiedCoolingSetpointWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUnoccupiedCoolingSetpointWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUnoccupiedCoolingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUnoccupiedCoolingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUnoccupiedCoolingSetpointWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeUnoccupiedHeatingSetpointWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUnoccupiedHeatingSetpointWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUnoccupiedHeatingSetpointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUnoccupiedHeatingSetpointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUnoccupiedHeatingSetpointWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeUnoccupiedSetbackMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUnoccupiedSetbackMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUnoccupiedSetbackMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeUnoccupiedSetbackMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUnoccupiedSetbackMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUnoccupiedSetbackMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeUnoccupiedSetbackWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUnoccupiedSetbackWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUnoccupiedSetbackWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUnoccupiedSetbackWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

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

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACCapacityWithValue:completion:")
    public native void writeAttributeACCapacityWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACCapacityWithValueCompletion") @NotNull Block_writeAttributeACCapacityWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityWithValueCompletion {
        @Generated
        void call_writeAttributeACCapacityWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACCapacityWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACCapacityWithValue:completionHandler:")
    public native void writeAttributeACCapacityWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACCapacityWithValueCompletionHandler") @NotNull Block_writeAttributeACCapacityWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityWithValueCompletionHandler {
        @Generated
        void call_writeAttributeACCapacityWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACCapacityWithValue:params:completion:")
    public native void writeAttributeACCapacityWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACCapacityWithValueParamsCompletion") @NotNull Block_writeAttributeACCapacityWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityWithValueParamsCompletion {
        @Generated
        void call_writeAttributeACCapacityWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACCapacityWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACCapacityWithValue:params:completionHandler:")
    public native void writeAttributeACCapacityWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACCapacityWithValueParamsCompletionHandler") @NotNull Block_writeAttributeACCapacityWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeACCapacityWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACCapacityformatWithValue:completion:")
    public native void writeAttributeACCapacityformatWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACCapacityformatWithValueCompletion") @NotNull Block_writeAttributeACCapacityformatWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityformatWithValueCompletion {
        @Generated
        void call_writeAttributeACCapacityformatWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACCapacityformatWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACCapacityformatWithValue:completionHandler:")
    public native void writeAttributeACCapacityformatWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACCapacityformatWithValueCompletionHandler") @NotNull Block_writeAttributeACCapacityformatWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityformatWithValueCompletionHandler {
        @Generated
        void call_writeAttributeACCapacityformatWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACCapacityformatWithValue:params:completion:")
    public native void writeAttributeACCapacityformatWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACCapacityformatWithValueParamsCompletion") @NotNull Block_writeAttributeACCapacityformatWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityformatWithValueParamsCompletion {
        @Generated
        void call_writeAttributeACCapacityformatWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACCapacityformatWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACCapacityformatWithValue:params:completionHandler:")
    public native void writeAttributeACCapacityformatWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACCapacityformatWithValueParamsCompletionHandler") @NotNull Block_writeAttributeACCapacityformatWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCapacityformatWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeACCapacityformatWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACCompressorTypeWithValue:completion:")
    public native void writeAttributeACCompressorTypeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACCompressorTypeWithValueCompletion") @NotNull Block_writeAttributeACCompressorTypeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCompressorTypeWithValueCompletion {
        @Generated
        void call_writeAttributeACCompressorTypeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACCompressorTypeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACCompressorTypeWithValue:completionHandler:")
    public native void writeAttributeACCompressorTypeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACCompressorTypeWithValueCompletionHandler") @NotNull Block_writeAttributeACCompressorTypeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCompressorTypeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeACCompressorTypeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACCompressorTypeWithValue:params:completion:")
    public native void writeAttributeACCompressorTypeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACCompressorTypeWithValueParamsCompletion") @NotNull Block_writeAttributeACCompressorTypeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCompressorTypeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeACCompressorTypeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACCompressorTypeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACCompressorTypeWithValue:params:completionHandler:")
    public native void writeAttributeACCompressorTypeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACCompressorTypeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeACCompressorTypeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACCompressorTypeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeACCompressorTypeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACErrorCodeWithValue:completion:")
    public native void writeAttributeACErrorCodeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACErrorCodeWithValueCompletion") @NotNull Block_writeAttributeACErrorCodeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACErrorCodeWithValueCompletion {
        @Generated
        void call_writeAttributeACErrorCodeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACErrorCodeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACErrorCodeWithValue:completionHandler:")
    public native void writeAttributeACErrorCodeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACErrorCodeWithValueCompletionHandler") @NotNull Block_writeAttributeACErrorCodeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACErrorCodeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeACErrorCodeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACErrorCodeWithValue:params:completion:")
    public native void writeAttributeACErrorCodeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACErrorCodeWithValueParamsCompletion") @NotNull Block_writeAttributeACErrorCodeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACErrorCodeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeACErrorCodeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACErrorCodeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACErrorCodeWithValue:params:completionHandler:")
    public native void writeAttributeACErrorCodeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACErrorCodeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeACErrorCodeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACErrorCodeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeACErrorCodeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACLouverPositionWithValue:completion:")
    public native void writeAttributeACLouverPositionWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACLouverPositionWithValueCompletion") @NotNull Block_writeAttributeACLouverPositionWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACLouverPositionWithValueCompletion {
        @Generated
        void call_writeAttributeACLouverPositionWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACLouverPositionWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACLouverPositionWithValue:completionHandler:")
    public native void writeAttributeACLouverPositionWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACLouverPositionWithValueCompletionHandler") @NotNull Block_writeAttributeACLouverPositionWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACLouverPositionWithValueCompletionHandler {
        @Generated
        void call_writeAttributeACLouverPositionWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACLouverPositionWithValue:params:completion:")
    public native void writeAttributeACLouverPositionWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACLouverPositionWithValueParamsCompletion") @NotNull Block_writeAttributeACLouverPositionWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACLouverPositionWithValueParamsCompletion {
        @Generated
        void call_writeAttributeACLouverPositionWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACLouverPositionWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACLouverPositionWithValue:params:completionHandler:")
    public native void writeAttributeACLouverPositionWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACLouverPositionWithValueParamsCompletionHandler") @NotNull Block_writeAttributeACLouverPositionWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACLouverPositionWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeACLouverPositionWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACRefrigerantTypeWithValue:completion:")
    public native void writeAttributeACRefrigerantTypeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACRefrigerantTypeWithValueCompletion") @NotNull Block_writeAttributeACRefrigerantTypeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACRefrigerantTypeWithValueCompletion {
        @Generated
        void call_writeAttributeACRefrigerantTypeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACRefrigerantTypeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACRefrigerantTypeWithValue:completionHandler:")
    public native void writeAttributeACRefrigerantTypeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACRefrigerantTypeWithValueCompletionHandler") @NotNull Block_writeAttributeACRefrigerantTypeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACRefrigerantTypeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeACRefrigerantTypeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACRefrigerantTypeWithValue:params:completion:")
    public native void writeAttributeACRefrigerantTypeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACRefrigerantTypeWithValueParamsCompletion") @NotNull Block_writeAttributeACRefrigerantTypeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACRefrigerantTypeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeACRefrigerantTypeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACRefrigerantTypeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACRefrigerantTypeWithValue:params:completionHandler:")
    public native void writeAttributeACRefrigerantTypeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACRefrigerantTypeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeACRefrigerantTypeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACRefrigerantTypeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeACRefrigerantTypeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACTypeWithValue:completion:")
    public native void writeAttributeACTypeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACTypeWithValueCompletion") @NotNull Block_writeAttributeACTypeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACTypeWithValueCompletion {
        @Generated
        void call_writeAttributeACTypeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACTypeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACTypeWithValue:completionHandler:")
    public native void writeAttributeACTypeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeACTypeWithValueCompletionHandler") @NotNull Block_writeAttributeACTypeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACTypeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeACTypeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeACTypeWithValue:params:completion:")
    public native void writeAttributeACTypeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACTypeWithValueParamsCompletion") @NotNull Block_writeAttributeACTypeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACTypeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeACTypeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeACTypeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeACTypeWithValue:params:completionHandler:")
    public native void writeAttributeACTypeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeACTypeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeACTypeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeACTypeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeACTypeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeControlSequenceOfOperationWithValue:completion:")
    public native void writeAttributeControlSequenceOfOperationWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeControlSequenceOfOperationWithValueCompletion") @NotNull Block_writeAttributeControlSequenceOfOperationWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeControlSequenceOfOperationWithValueCompletion {
        @Generated
        void call_writeAttributeControlSequenceOfOperationWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeControlSequenceOfOperationWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeControlSequenceOfOperationWithValue:completionHandler:")
    public native void writeAttributeControlSequenceOfOperationWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeControlSequenceOfOperationWithValueCompletionHandler") @NotNull Block_writeAttributeControlSequenceOfOperationWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeControlSequenceOfOperationWithValueCompletionHandler {
        @Generated
        void call_writeAttributeControlSequenceOfOperationWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeControlSequenceOfOperationWithValue:params:completion:")
    public native void writeAttributeControlSequenceOfOperationWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeControlSequenceOfOperationWithValueParamsCompletion") @NotNull Block_writeAttributeControlSequenceOfOperationWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeControlSequenceOfOperationWithValueParamsCompletion {
        @Generated
        void call_writeAttributeControlSequenceOfOperationWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeControlSequenceOfOperationWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeControlSequenceOfOperationWithValue:params:completionHandler:")
    public native void writeAttributeControlSequenceOfOperationWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeControlSequenceOfOperationWithValueParamsCompletionHandler") @NotNull Block_writeAttributeControlSequenceOfOperationWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeControlSequenceOfOperationWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeControlSequenceOfOperationWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEmergencyHeatDeltaWithValue:completion:")
    public native void writeAttributeEmergencyHeatDeltaWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEmergencyHeatDeltaWithValueCompletion") @NotNull Block_writeAttributeEmergencyHeatDeltaWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEmergencyHeatDeltaWithValueCompletion {
        @Generated
        void call_writeAttributeEmergencyHeatDeltaWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEmergencyHeatDeltaWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEmergencyHeatDeltaWithValue:completionHandler:")
    public native void writeAttributeEmergencyHeatDeltaWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEmergencyHeatDeltaWithValueCompletionHandler") @NotNull Block_writeAttributeEmergencyHeatDeltaWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEmergencyHeatDeltaWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEmergencyHeatDeltaWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEmergencyHeatDeltaWithValue:params:completion:")
    public native void writeAttributeEmergencyHeatDeltaWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEmergencyHeatDeltaWithValueParamsCompletion") @NotNull Block_writeAttributeEmergencyHeatDeltaWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEmergencyHeatDeltaWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEmergencyHeatDeltaWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEmergencyHeatDeltaWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEmergencyHeatDeltaWithValue:params:completionHandler:")
    public native void writeAttributeEmergencyHeatDeltaWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEmergencyHeatDeltaWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEmergencyHeatDeltaWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEmergencyHeatDeltaWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEmergencyHeatDeltaWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeHVACSystemTypeConfigurationWithValue:completion:")
    public native void writeAttributeHVACSystemTypeConfigurationWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeHVACSystemTypeConfigurationWithValueCompletion") @NotNull Block_writeAttributeHVACSystemTypeConfigurationWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeHVACSystemTypeConfigurationWithValueCompletion {
        @Generated
        void call_writeAttributeHVACSystemTypeConfigurationWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeHVACSystemTypeConfigurationWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeHVACSystemTypeConfigurationWithValue:completionHandler:")
    public native void writeAttributeHVACSystemTypeConfigurationWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeHVACSystemTypeConfigurationWithValueCompletionHandler") @NotNull Block_writeAttributeHVACSystemTypeConfigurationWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeHVACSystemTypeConfigurationWithValueCompletionHandler {
        @Generated
        void call_writeAttributeHVACSystemTypeConfigurationWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeHVACSystemTypeConfigurationWithValue:params:completion:")
    public native void writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletion") @NotNull Block_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletion {
        @Generated
        void call_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeHVACSystemTypeConfigurationWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeHVACSystemTypeConfigurationWithValue:params:completionHandler:")
    public native void writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletionHandler") @NotNull Block_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeHVACSystemTypeConfigurationWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocalTemperatureCalibrationWithValue:completion:")
    public native void writeAttributeLocalTemperatureCalibrationWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLocalTemperatureCalibrationWithValueCompletion") @NotNull Block_writeAttributeLocalTemperatureCalibrationWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalTemperatureCalibrationWithValueCompletion {
        @Generated
        void call_writeAttributeLocalTemperatureCalibrationWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLocalTemperatureCalibrationWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLocalTemperatureCalibrationWithValue:completionHandler:")
    public native void writeAttributeLocalTemperatureCalibrationWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLocalTemperatureCalibrationWithValueCompletionHandler") @NotNull Block_writeAttributeLocalTemperatureCalibrationWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalTemperatureCalibrationWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLocalTemperatureCalibrationWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocalTemperatureCalibrationWithValue:params:completion:")
    public native void writeAttributeLocalTemperatureCalibrationWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletion") @NotNull Block_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLocalTemperatureCalibrationWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLocalTemperatureCalibrationWithValue:params:completionHandler:")
    public native void writeAttributeLocalTemperatureCalibrationWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLocalTemperatureCalibrationWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMaxCoolSetpointLimitWithValue:completion:")
    public native void writeAttributeMaxCoolSetpointLimitWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMaxCoolSetpointLimitWithValueCompletion") @NotNull Block_writeAttributeMaxCoolSetpointLimitWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxCoolSetpointLimitWithValueCompletion {
        @Generated
        void call_writeAttributeMaxCoolSetpointLimitWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMaxCoolSetpointLimitWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMaxCoolSetpointLimitWithValue:completionHandler:")
    public native void writeAttributeMaxCoolSetpointLimitWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMaxCoolSetpointLimitWithValueCompletionHandler") @NotNull Block_writeAttributeMaxCoolSetpointLimitWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxCoolSetpointLimitWithValueCompletionHandler {
        @Generated
        void call_writeAttributeMaxCoolSetpointLimitWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMaxCoolSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMaxCoolSetpointLimitWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletion") @NotNull Block_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletion {
        @Generated
        void call_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMaxCoolSetpointLimitWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMaxCoolSetpointLimitWithValue:params:completionHandler:")
    public native void writeAttributeMaxCoolSetpointLimitWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletionHandler") @NotNull Block_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeMaxCoolSetpointLimitWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMaxHeatSetpointLimitWithValue:completion:")
    public native void writeAttributeMaxHeatSetpointLimitWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMaxHeatSetpointLimitWithValueCompletion") @NotNull Block_writeAttributeMaxHeatSetpointLimitWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxHeatSetpointLimitWithValueCompletion {
        @Generated
        void call_writeAttributeMaxHeatSetpointLimitWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMaxHeatSetpointLimitWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMaxHeatSetpointLimitWithValue:completionHandler:")
    public native void writeAttributeMaxHeatSetpointLimitWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMaxHeatSetpointLimitWithValueCompletionHandler") @NotNull Block_writeAttributeMaxHeatSetpointLimitWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxHeatSetpointLimitWithValueCompletionHandler {
        @Generated
        void call_writeAttributeMaxHeatSetpointLimitWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMaxHeatSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMaxHeatSetpointLimitWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletion") @NotNull Block_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletion {
        @Generated
        void call_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMaxHeatSetpointLimitWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMaxHeatSetpointLimitWithValue:params:completionHandler:")
    public native void writeAttributeMaxHeatSetpointLimitWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletionHandler") @NotNull Block_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeMaxHeatSetpointLimitWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinCoolSetpointLimitWithValue:completion:")
    public native void writeAttributeMinCoolSetpointLimitWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinCoolSetpointLimitWithValueCompletion") @NotNull Block_writeAttributeMinCoolSetpointLimitWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinCoolSetpointLimitWithValueCompletion {
        @Generated
        void call_writeAttributeMinCoolSetpointLimitWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinCoolSetpointLimitWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinCoolSetpointLimitWithValue:completionHandler:")
    public native void writeAttributeMinCoolSetpointLimitWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinCoolSetpointLimitWithValueCompletionHandler") @NotNull Block_writeAttributeMinCoolSetpointLimitWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinCoolSetpointLimitWithValueCompletionHandler {
        @Generated
        void call_writeAttributeMinCoolSetpointLimitWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinCoolSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMinCoolSetpointLimitWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinCoolSetpointLimitWithValueParamsCompletion") @NotNull Block_writeAttributeMinCoolSetpointLimitWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinCoolSetpointLimitWithValueParamsCompletion {
        @Generated
        void call_writeAttributeMinCoolSetpointLimitWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinCoolSetpointLimitWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinCoolSetpointLimitWithValue:params:completionHandler:")
    public native void writeAttributeMinCoolSetpointLimitWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinCoolSetpointLimitWithValueParamsCompletionHandler") @NotNull Block_writeAttributeMinCoolSetpointLimitWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinCoolSetpointLimitWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeMinCoolSetpointLimitWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinHeatSetpointLimitWithValue:completion:")
    public native void writeAttributeMinHeatSetpointLimitWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinHeatSetpointLimitWithValueCompletion") @NotNull Block_writeAttributeMinHeatSetpointLimitWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinHeatSetpointLimitWithValueCompletion {
        @Generated
        void call_writeAttributeMinHeatSetpointLimitWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinHeatSetpointLimitWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinHeatSetpointLimitWithValue:completionHandler:")
    public native void writeAttributeMinHeatSetpointLimitWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinHeatSetpointLimitWithValueCompletionHandler") @NotNull Block_writeAttributeMinHeatSetpointLimitWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinHeatSetpointLimitWithValueCompletionHandler {
        @Generated
        void call_writeAttributeMinHeatSetpointLimitWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinHeatSetpointLimitWithValue:params:completion:")
    public native void writeAttributeMinHeatSetpointLimitWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinHeatSetpointLimitWithValueParamsCompletion") @NotNull Block_writeAttributeMinHeatSetpointLimitWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinHeatSetpointLimitWithValueParamsCompletion {
        @Generated
        void call_writeAttributeMinHeatSetpointLimitWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinHeatSetpointLimitWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinHeatSetpointLimitWithValue:params:completionHandler:")
    public native void writeAttributeMinHeatSetpointLimitWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinHeatSetpointLimitWithValueParamsCompletionHandler") @NotNull Block_writeAttributeMinHeatSetpointLimitWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinHeatSetpointLimitWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeMinHeatSetpointLimitWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinSetpointDeadBandWithValue:completion:")
    public native void writeAttributeMinSetpointDeadBandWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinSetpointDeadBandWithValueCompletion") @NotNull Block_writeAttributeMinSetpointDeadBandWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinSetpointDeadBandWithValueCompletion {
        @Generated
        void call_writeAttributeMinSetpointDeadBandWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinSetpointDeadBandWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinSetpointDeadBandWithValue:completionHandler:")
    public native void writeAttributeMinSetpointDeadBandWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinSetpointDeadBandWithValueCompletionHandler") @NotNull Block_writeAttributeMinSetpointDeadBandWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinSetpointDeadBandWithValueCompletionHandler {
        @Generated
        void call_writeAttributeMinSetpointDeadBandWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinSetpointDeadBandWithValue:params:completion:")
    public native void writeAttributeMinSetpointDeadBandWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinSetpointDeadBandWithValueParamsCompletion") @NotNull Block_writeAttributeMinSetpointDeadBandWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinSetpointDeadBandWithValueParamsCompletion {
        @Generated
        void call_writeAttributeMinSetpointDeadBandWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinSetpointDeadBandWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinSetpointDeadBandWithValue:params:completionHandler:")
    public native void writeAttributeMinSetpointDeadBandWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinSetpointDeadBandWithValueParamsCompletionHandler") @NotNull Block_writeAttributeMinSetpointDeadBandWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinSetpointDeadBandWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeMinSetpointDeadBandWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOccupiedCoolingSetpointWithValue:completion:")
    public native void writeAttributeOccupiedCoolingSetpointWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOccupiedCoolingSetpointWithValueCompletion") @NotNull Block_writeAttributeOccupiedCoolingSetpointWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedCoolingSetpointWithValueCompletion {
        @Generated
        void call_writeAttributeOccupiedCoolingSetpointWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOccupiedCoolingSetpointWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOccupiedCoolingSetpointWithValue:completionHandler:")
    public native void writeAttributeOccupiedCoolingSetpointWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOccupiedCoolingSetpointWithValueCompletionHandler") @NotNull Block_writeAttributeOccupiedCoolingSetpointWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedCoolingSetpointWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOccupiedCoolingSetpointWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOccupiedCoolingSetpointWithValue:params:completion:")
    public native void writeAttributeOccupiedCoolingSetpointWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletion") @NotNull Block_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOccupiedCoolingSetpointWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOccupiedCoolingSetpointWithValue:params:completionHandler:")
    public native void writeAttributeOccupiedCoolingSetpointWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOccupiedCoolingSetpointWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOccupiedHeatingSetpointWithValue:completion:")
    public native void writeAttributeOccupiedHeatingSetpointWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOccupiedHeatingSetpointWithValueCompletion") @NotNull Block_writeAttributeOccupiedHeatingSetpointWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedHeatingSetpointWithValueCompletion {
        @Generated
        void call_writeAttributeOccupiedHeatingSetpointWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOccupiedHeatingSetpointWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOccupiedHeatingSetpointWithValue:completionHandler:")
    public native void writeAttributeOccupiedHeatingSetpointWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOccupiedHeatingSetpointWithValueCompletionHandler") @NotNull Block_writeAttributeOccupiedHeatingSetpointWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedHeatingSetpointWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOccupiedHeatingSetpointWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOccupiedHeatingSetpointWithValue:params:completion:")
    public native void writeAttributeOccupiedHeatingSetpointWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletion") @NotNull Block_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOccupiedHeatingSetpointWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOccupiedHeatingSetpointWithValue:params:completionHandler:")
    public native void writeAttributeOccupiedHeatingSetpointWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOccupiedHeatingSetpointWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOccupiedSetbackWithValue:completion:")
    public native void writeAttributeOccupiedSetbackWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOccupiedSetbackWithValueCompletion") @NotNull Block_writeAttributeOccupiedSetbackWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedSetbackWithValueCompletion {
        @Generated
        void call_writeAttributeOccupiedSetbackWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOccupiedSetbackWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOccupiedSetbackWithValue:completionHandler:")
    public native void writeAttributeOccupiedSetbackWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOccupiedSetbackWithValueCompletionHandler") @NotNull Block_writeAttributeOccupiedSetbackWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedSetbackWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOccupiedSetbackWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOccupiedSetbackWithValue:params:completion:")
    public native void writeAttributeOccupiedSetbackWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOccupiedSetbackWithValueParamsCompletion") @NotNull Block_writeAttributeOccupiedSetbackWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedSetbackWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOccupiedSetbackWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOccupiedSetbackWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOccupiedSetbackWithValue:params:completionHandler:")
    public native void writeAttributeOccupiedSetbackWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOccupiedSetbackWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOccupiedSetbackWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOccupiedSetbackWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOccupiedSetbackWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRemoteSensingWithValue:completion:")
    public native void writeAttributeRemoteSensingWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRemoteSensingWithValueCompletion") @NotNull Block_writeAttributeRemoteSensingWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRemoteSensingWithValueCompletion {
        @Generated
        void call_writeAttributeRemoteSensingWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRemoteSensingWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRemoteSensingWithValue:completionHandler:")
    public native void writeAttributeRemoteSensingWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRemoteSensingWithValueCompletionHandler") @NotNull Block_writeAttributeRemoteSensingWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRemoteSensingWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRemoteSensingWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRemoteSensingWithValue:params:completion:")
    public native void writeAttributeRemoteSensingWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRemoteSensingWithValueParamsCompletion") @NotNull Block_writeAttributeRemoteSensingWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRemoteSensingWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRemoteSensingWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRemoteSensingWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRemoteSensingWithValue:params:completionHandler:")
    public native void writeAttributeRemoteSensingWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRemoteSensingWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRemoteSensingWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRemoteSensingWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRemoteSensingWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeSystemModeWithValue:completion:")
    public native void writeAttributeSystemModeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeSystemModeWithValueCompletion") @NotNull Block_writeAttributeSystemModeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSystemModeWithValueCompletion {
        @Generated
        void call_writeAttributeSystemModeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeSystemModeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeSystemModeWithValue:completionHandler:")
    public native void writeAttributeSystemModeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeSystemModeWithValueCompletionHandler") @NotNull Block_writeAttributeSystemModeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSystemModeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeSystemModeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeSystemModeWithValue:params:completion:")
    public native void writeAttributeSystemModeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeSystemModeWithValueParamsCompletion") @NotNull Block_writeAttributeSystemModeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSystemModeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeSystemModeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeSystemModeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeSystemModeWithValue:params:completionHandler:")
    public native void writeAttributeSystemModeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeSystemModeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeSystemModeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSystemModeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeSystemModeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldDurationWithValue:completion:")
    public native void writeAttributeTemperatureSetpointHoldDurationWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldDurationWithValueCompletion") @NotNull Block_writeAttributeTemperatureSetpointHoldDurationWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldDurationWithValueCompletion {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldDurationWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTemperatureSetpointHoldDurationWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTemperatureSetpointHoldDurationWithValue:completionHandler:")
    public native void writeAttributeTemperatureSetpointHoldDurationWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldDurationWithValueCompletionHandler") @NotNull Block_writeAttributeTemperatureSetpointHoldDurationWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldDurationWithValueCompletionHandler {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldDurationWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldDurationWithValue:params:completion:")
    public native void writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletion") @NotNull Block_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletion {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTemperatureSetpointHoldDurationWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTemperatureSetpointHoldDurationWithValue:params:completionHandler:")
    public native void writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletionHandler(
            @Nullable NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletionHandler") @NotNull Block_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldDurationWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldWithValue:completion:")
    public native void writeAttributeTemperatureSetpointHoldWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldWithValueCompletion") @NotNull Block_writeAttributeTemperatureSetpointHoldWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldWithValueCompletion {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTemperatureSetpointHoldWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTemperatureSetpointHoldWithValue:completionHandler:")
    public native void writeAttributeTemperatureSetpointHoldWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldWithValueCompletionHandler") @NotNull Block_writeAttributeTemperatureSetpointHoldWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldWithValueCompletionHandler {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTemperatureSetpointHoldWithValue:params:completion:")
    public native void writeAttributeTemperatureSetpointHoldWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldWithValueParamsCompletion") @NotNull Block_writeAttributeTemperatureSetpointHoldWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldWithValueParamsCompletion {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTemperatureSetpointHoldWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTemperatureSetpointHoldWithValue:params:completionHandler:")
    public native void writeAttributeTemperatureSetpointHoldWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTemperatureSetpointHoldWithValueParamsCompletionHandler") @NotNull Block_writeAttributeTemperatureSetpointHoldWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureSetpointHoldWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeTemperatureSetpointHoldWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeThermostatProgrammingOperationModeWithValue:completion:")
    public native void writeAttributeThermostatProgrammingOperationModeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeThermostatProgrammingOperationModeWithValueCompletion") @NotNull Block_writeAttributeThermostatProgrammingOperationModeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeThermostatProgrammingOperationModeWithValueCompletion {
        @Generated
        void call_writeAttributeThermostatProgrammingOperationModeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeThermostatProgrammingOperationModeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeThermostatProgrammingOperationModeWithValue:completionHandler:")
    public native void writeAttributeThermostatProgrammingOperationModeWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeThermostatProgrammingOperationModeWithValueCompletionHandler") @NotNull Block_writeAttributeThermostatProgrammingOperationModeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeThermostatProgrammingOperationModeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeThermostatProgrammingOperationModeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeThermostatProgrammingOperationModeWithValue:params:completion:")
    public native void writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletion") @NotNull Block_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeThermostatProgrammingOperationModeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeThermostatProgrammingOperationModeWithValue:params:completionHandler:")
    public native void writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeThermostatProgrammingOperationModeWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnoccupiedCoolingSetpointWithValue:completion:")
    public native void writeAttributeUnoccupiedCoolingSetpointWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedCoolingSetpointWithValueCompletion") @NotNull Block_writeAttributeUnoccupiedCoolingSetpointWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedCoolingSetpointWithValueCompletion {
        @Generated
        void call_writeAttributeUnoccupiedCoolingSetpointWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnoccupiedCoolingSetpointWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnoccupiedCoolingSetpointWithValue:completionHandler:")
    public native void writeAttributeUnoccupiedCoolingSetpointWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedCoolingSetpointWithValueCompletionHandler") @NotNull Block_writeAttributeUnoccupiedCoolingSetpointWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedCoolingSetpointWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUnoccupiedCoolingSetpointWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnoccupiedCoolingSetpointWithValue:params:completion:")
    public native void writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletion") @NotNull Block_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnoccupiedCoolingSetpointWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnoccupiedCoolingSetpointWithValue:params:completionHandler:")
    public native void writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUnoccupiedCoolingSetpointWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnoccupiedHeatingSetpointWithValue:completion:")
    public native void writeAttributeUnoccupiedHeatingSetpointWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedHeatingSetpointWithValueCompletion") @NotNull Block_writeAttributeUnoccupiedHeatingSetpointWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedHeatingSetpointWithValueCompletion {
        @Generated
        void call_writeAttributeUnoccupiedHeatingSetpointWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnoccupiedHeatingSetpointWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnoccupiedHeatingSetpointWithValue:completionHandler:")
    public native void writeAttributeUnoccupiedHeatingSetpointWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedHeatingSetpointWithValueCompletionHandler") @NotNull Block_writeAttributeUnoccupiedHeatingSetpointWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedHeatingSetpointWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUnoccupiedHeatingSetpointWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnoccupiedHeatingSetpointWithValue:params:completion:")
    public native void writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletion") @NotNull Block_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnoccupiedHeatingSetpointWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnoccupiedHeatingSetpointWithValue:params:completionHandler:")
    public native void writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUnoccupiedHeatingSetpointWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnoccupiedSetbackWithValue:completion:")
    public native void writeAttributeUnoccupiedSetbackWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedSetbackWithValueCompletion") @NotNull Block_writeAttributeUnoccupiedSetbackWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedSetbackWithValueCompletion {
        @Generated
        void call_writeAttributeUnoccupiedSetbackWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnoccupiedSetbackWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnoccupiedSetbackWithValue:completionHandler:")
    public native void writeAttributeUnoccupiedSetbackWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedSetbackWithValueCompletionHandler") @NotNull Block_writeAttributeUnoccupiedSetbackWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedSetbackWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUnoccupiedSetbackWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUnoccupiedSetbackWithValue:params:completion:")
    public native void writeAttributeUnoccupiedSetbackWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedSetbackWithValueParamsCompletion") @NotNull Block_writeAttributeUnoccupiedSetbackWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedSetbackWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUnoccupiedSetbackWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnoccupiedSetbackWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnoccupiedSetbackWithValue:params:completionHandler:")
    public native void writeAttributeUnoccupiedSetbackWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnoccupiedSetbackWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUnoccupiedSetbackWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnoccupiedSetbackWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUnoccupiedSetbackWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}