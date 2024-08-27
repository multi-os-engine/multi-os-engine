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
 * Cluster Door Lock
 * 
 * An interface to a generic way to secure a door
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterDoorLock extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterDoorLock(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterDoorLock alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterDoorLock allocWithZone(VoidPtr zone);

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
     * Command ClearCredential
     * 
     * Clear one, one type, or all credentials except ProgrammingPIN credential.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearCredentialWithParams:completion:")
    public native void clearCredentialWithParamsCompletion(@NotNull MTRDoorLockClusterClearCredentialParams params,
            @ObjCBlock(name = "call_clearCredentialWithParamsCompletion") @NotNull Block_clearCredentialWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearCredentialWithParamsCompletion {
        @Generated
        void call_clearCredentialWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearCredentialWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearCredentialWithParams:completionHandler:")
    public native void clearCredentialWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterClearCredentialParams params,
            @ObjCBlock(name = "call_clearCredentialWithParamsCompletionHandler") @NotNull Block_clearCredentialWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearCredentialWithParamsCompletionHandler {
        @Generated
        void call_clearCredentialWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command ClearHolidaySchedule
     * 
     * Clears the holiday schedule or all holiday schedules.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearHolidayScheduleWithParams:completion:")
    public native void clearHolidayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterClearHolidayScheduleParams params,
            @ObjCBlock(name = "call_clearHolidayScheduleWithParamsCompletion") @NotNull Block_clearHolidayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearHolidayScheduleWithParamsCompletion {
        @Generated
        void call_clearHolidayScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearHolidayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearHolidayScheduleWithParams:completionHandler:")
    public native void clearHolidayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterClearHolidayScheduleParams params,
            @ObjCBlock(name = "call_clearHolidayScheduleWithParamsCompletionHandler") @NotNull Block_clearHolidayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearHolidayScheduleWithParamsCompletionHandler {
        @Generated
        void call_clearHolidayScheduleWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command ClearUser
     * 
     * Clears a User or all Users.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearUserWithParams:completion:")
    public native void clearUserWithParamsCompletion(@NotNull MTRDoorLockClusterClearUserParams params,
            @ObjCBlock(name = "call_clearUserWithParamsCompletion") @NotNull Block_clearUserWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearUserWithParamsCompletion {
        @Generated
        void call_clearUserWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearUserWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearUserWithParams:completionHandler:")
    public native void clearUserWithParamsCompletionHandler(@NotNull MTRDoorLockClusterClearUserParams params,
            @ObjCBlock(name = "call_clearUserWithParamsCompletionHandler") @NotNull Block_clearUserWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearUserWithParamsCompletionHandler {
        @Generated
        void call_clearUserWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command ClearWeekDaySchedule
     * 
     * Clear the specific weekly schedule or all weekly schedules for the specific user.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearWeekDayScheduleWithParams:completion:")
    public native void clearWeekDayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterClearWeekDayScheduleParams params,
            @ObjCBlock(name = "call_clearWeekDayScheduleWithParamsCompletion") @NotNull Block_clearWeekDayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeekDayScheduleWithParamsCompletion {
        @Generated
        void call_clearWeekDayScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearWeekDayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearWeekDayScheduleWithParams:completionHandler:")
    public native void clearWeekDayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterClearWeekDayScheduleParams params,
            @ObjCBlock(name = "call_clearWeekDayScheduleWithParamsCompletionHandler") @NotNull Block_clearWeekDayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeekDayScheduleWithParamsCompletionHandler {
        @Generated
        void call_clearWeekDayScheduleWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command ClearYearDaySchedule
     * 
     * Clears the specific year day schedule or all year day schedules for the specific user.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearYearDayScheduleWithParams:completion:")
    public native void clearYearDayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterClearYearDayScheduleParams params,
            @ObjCBlock(name = "call_clearYearDayScheduleWithParamsCompletion") @NotNull Block_clearYearDayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearYearDayScheduleWithParamsCompletion {
        @Generated
        void call_clearYearDayScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearYearDayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearYearDayScheduleWithParams:completionHandler:")
    public native void clearYearDayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterClearYearDayScheduleParams params,
            @ObjCBlock(name = "call_clearYearDayScheduleWithParamsCompletionHandler") @NotNull Block_clearYearDayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearYearDayScheduleWithParamsCompletionHandler {
        @Generated
        void call_clearYearDayScheduleWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * Command GetCredentialStatus
     * 
     * Retrieve the status of a particular credential (e.g. PIN, RFID, Fingerprint, etc.) by index.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getCredentialStatusWithParams:completion:")
    public native void getCredentialStatusWithParamsCompletion(
            @NotNull MTRDoorLockClusterGetCredentialStatusParams params,
            @ObjCBlock(name = "call_getCredentialStatusWithParamsCompletion") @NotNull Block_getCredentialStatusWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCredentialStatusWithParamsCompletion {
        @Generated
        void call_getCredentialStatusWithParamsCompletion(
                @Nullable MTRDoorLockClusterGetCredentialStatusResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getCredentialStatusWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getCredentialStatusWithParams:completionHandler:")
    public native void getCredentialStatusWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterGetCredentialStatusParams params,
            @ObjCBlock(name = "call_getCredentialStatusWithParamsCompletionHandler") @NotNull Block_getCredentialStatusWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCredentialStatusWithParamsCompletionHandler {
        @Generated
        void call_getCredentialStatusWithParamsCompletionHandler(
                @Nullable MTRDoorLockClusterGetCredentialStatusResponseParams data, @Nullable NSError error);
    }

    /**
     * Command GetHolidaySchedule
     * 
     * Get the holiday schedule for the specified index.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getHolidayScheduleWithParams:completion:")
    public native void getHolidayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterGetHolidayScheduleParams params,
            @ObjCBlock(name = "call_getHolidayScheduleWithParamsCompletion") @NotNull Block_getHolidayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getHolidayScheduleWithParamsCompletion {
        @Generated
        void call_getHolidayScheduleWithParamsCompletion(
                @Nullable MTRDoorLockClusterGetHolidayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getHolidayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getHolidayScheduleWithParams:completionHandler:")
    public native void getHolidayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterGetHolidayScheduleParams params,
            @ObjCBlock(name = "call_getHolidayScheduleWithParamsCompletionHandler") @NotNull Block_getHolidayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getHolidayScheduleWithParamsCompletionHandler {
        @Generated
        void call_getHolidayScheduleWithParamsCompletionHandler(
                @Nullable MTRDoorLockClusterGetHolidayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * Command GetUser
     * 
     * Retrieve User.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getUserWithParams:completion:")
    public native void getUserWithParamsCompletion(@NotNull MTRDoorLockClusterGetUserParams params,
            @ObjCBlock(name = "call_getUserWithParamsCompletion") @NotNull Block_getUserWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getUserWithParamsCompletion {
        @Generated
        void call_getUserWithParamsCompletion(@Nullable MTRDoorLockClusterGetUserResponseParams data,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getUserWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getUserWithParams:completionHandler:")
    public native void getUserWithParamsCompletionHandler(@NotNull MTRDoorLockClusterGetUserParams params,
            @ObjCBlock(name = "call_getUserWithParamsCompletionHandler") @NotNull Block_getUserWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getUserWithParamsCompletionHandler {
        @Generated
        void call_getUserWithParamsCompletionHandler(@Nullable MTRDoorLockClusterGetUserResponseParams data,
                @Nullable NSError error);
    }

    /**
     * Command GetWeekDaySchedule
     * 
     * Retrieve the specific weekly schedule for the specific user.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getWeekDayScheduleWithParams:completion:")
    public native void getWeekDayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterGetWeekDayScheduleParams params,
            @ObjCBlock(name = "call_getWeekDayScheduleWithParamsCompletion") @NotNull Block_getWeekDayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeekDayScheduleWithParamsCompletion {
        @Generated
        void call_getWeekDayScheduleWithParamsCompletion(
                @Nullable MTRDoorLockClusterGetWeekDayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getWeekDayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getWeekDayScheduleWithParams:completionHandler:")
    public native void getWeekDayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterGetWeekDayScheduleParams params,
            @ObjCBlock(name = "call_getWeekDayScheduleWithParamsCompletionHandler") @NotNull Block_getWeekDayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeekDayScheduleWithParamsCompletionHandler {
        @Generated
        void call_getWeekDayScheduleWithParamsCompletionHandler(
                @Nullable MTRDoorLockClusterGetWeekDayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * Command GetYearDaySchedule
     * 
     * Returns the year day schedule data for the specified schedule and user indexes.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getYearDayScheduleWithParams:completion:")
    public native void getYearDayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterGetYearDayScheduleParams params,
            @ObjCBlock(name = "call_getYearDayScheduleWithParamsCompletion") @NotNull Block_getYearDayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getYearDayScheduleWithParamsCompletion {
        @Generated
        void call_getYearDayScheduleWithParamsCompletion(
                @Nullable MTRDoorLockClusterGetYearDayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getYearDayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getYearDayScheduleWithParams:completionHandler:")
    public native void getYearDayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterGetYearDayScheduleParams params,
            @ObjCBlock(name = "call_getYearDayScheduleWithParamsCompletionHandler") @NotNull Block_getYearDayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getYearDayScheduleWithParamsCompletionHandler {
        @Generated
        void call_getYearDayScheduleWithParamsCompletionHandler(
                @Nullable MTRDoorLockClusterGetYearDayScheduleResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseClusterDoorLock init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterDoorLock initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterDoorLock initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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

    /**
     * Command LockDoor
     * 
     * This command causes the lock device to lock the door.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("lockDoorWithParams:completion:")
    public native void lockDoorWithParamsCompletion(@Nullable MTRDoorLockClusterLockDoorParams params,
            @ObjCBlock(name = "call_lockDoorWithParamsCompletion") @NotNull Block_lockDoorWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDoorWithParamsCompletion {
        @Generated
        void call_lockDoorWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use lockDoorWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("lockDoorWithParams:completionHandler:")
    public native void lockDoorWithParamsCompletionHandler(@Nullable MTRDoorLockClusterLockDoorParams params,
            @ObjCBlock(name = "call_lockDoorWithParamsCompletionHandler") @NotNull Block_lockDoorWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDoorWithParamsCompletionHandler {
        @Generated
        void call_lockDoorWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRBaseClusterDoorLock new_objc();

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
     * Deprecated-Message: Please use readAttributeActuatorEnabledWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActuatorEnabledWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActuatorEnabledWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActuatorEnabledWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActuatorEnabledWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActuatorEnabledWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActuatorEnabledWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActuatorEnabledWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActuatorEnabledWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActuatorEnabledWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActuatorEnabledWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActuatorEnabledWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActuatorEnabledWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActuatorEnabledWithCompletion:")
    public native void readAttributeActuatorEnabledWithCompletion(
            @ObjCBlock(name = "call_readAttributeActuatorEnabledWithCompletion") @NotNull Block_readAttributeActuatorEnabledWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActuatorEnabledWithCompletion {
        @Generated
        void call_readAttributeActuatorEnabledWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActuatorEnabledWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActuatorEnabledWithCompletionHandler:")
    public native void readAttributeActuatorEnabledWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActuatorEnabledWithCompletionHandler") @NotNull Block_readAttributeActuatorEnabledWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActuatorEnabledWithCompletionHandler {
        @Generated
        void call_readAttributeActuatorEnabledWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeAutoRelockTimeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAutoRelockTimeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAutoRelockTimeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAutoRelockTimeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAutoRelockTimeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAutoRelockTimeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAutoRelockTimeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAutoRelockTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAutoRelockTimeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAutoRelockTimeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAutoRelockTimeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAutoRelockTimeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAutoRelockTimeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAutoRelockTimeWithCompletion:")
    public native void readAttributeAutoRelockTimeWithCompletion(
            @ObjCBlock(name = "call_readAttributeAutoRelockTimeWithCompletion") @NotNull Block_readAttributeAutoRelockTimeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAutoRelockTimeWithCompletion {
        @Generated
        void call_readAttributeAutoRelockTimeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAutoRelockTimeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAutoRelockTimeWithCompletionHandler:")
    public native void readAttributeAutoRelockTimeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAutoRelockTimeWithCompletionHandler") @NotNull Block_readAttributeAutoRelockTimeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAutoRelockTimeWithCompletionHandler {
        @Generated
        void call_readAttributeAutoRelockTimeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeCredentialRulesSupportWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCredentialRulesSupportWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCredentialRulesSupportWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCredentialRulesSupportWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCredentialRulesSupportWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCredentialRulesSupportWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCredentialRulesSupportWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCredentialRulesSupportWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCredentialRulesSupportWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCredentialRulesSupportWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCredentialRulesSupportWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCredentialRulesSupportWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCredentialRulesSupportWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCredentialRulesSupportWithCompletion:")
    public native void readAttributeCredentialRulesSupportWithCompletion(
            @ObjCBlock(name = "call_readAttributeCredentialRulesSupportWithCompletion") @NotNull Block_readAttributeCredentialRulesSupportWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCredentialRulesSupportWithCompletion {
        @Generated
        void call_readAttributeCredentialRulesSupportWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCredentialRulesSupportWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCredentialRulesSupportWithCompletionHandler:")
    public native void readAttributeCredentialRulesSupportWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCredentialRulesSupportWithCompletionHandler") @NotNull Block_readAttributeCredentialRulesSupportWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCredentialRulesSupportWithCompletionHandler {
        @Generated
        void call_readAttributeCredentialRulesSupportWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeDefaultConfigurationRegisterWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDefaultConfigurationRegisterWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDefaultConfigurationRegisterWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDefaultConfigurationRegisterWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDefaultConfigurationRegisterWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultConfigurationRegisterWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDefaultConfigurationRegisterWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDefaultConfigurationRegisterWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDefaultConfigurationRegisterWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDefaultConfigurationRegisterWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDefaultConfigurationRegisterWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultConfigurationRegisterWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDefaultConfigurationRegisterWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDefaultConfigurationRegisterWithCompletion:")
    public native void readAttributeDefaultConfigurationRegisterWithCompletion(
            @ObjCBlock(name = "call_readAttributeDefaultConfigurationRegisterWithCompletion") @NotNull Block_readAttributeDefaultConfigurationRegisterWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultConfigurationRegisterWithCompletion {
        @Generated
        void call_readAttributeDefaultConfigurationRegisterWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDefaultConfigurationRegisterWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDefaultConfigurationRegisterWithCompletionHandler:")
    public native void readAttributeDefaultConfigurationRegisterWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDefaultConfigurationRegisterWithCompletionHandler") @NotNull Block_readAttributeDefaultConfigurationRegisterWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultConfigurationRegisterWithCompletionHandler {
        @Generated
        void call_readAttributeDefaultConfigurationRegisterWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDoorClosedEventsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDoorClosedEventsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDoorClosedEventsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDoorClosedEventsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDoorClosedEventsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorClosedEventsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDoorClosedEventsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDoorClosedEventsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDoorClosedEventsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDoorClosedEventsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDoorClosedEventsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorClosedEventsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDoorClosedEventsWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDoorClosedEventsWithCompletion:")
    public native void readAttributeDoorClosedEventsWithCompletion(
            @ObjCBlock(name = "call_readAttributeDoorClosedEventsWithCompletion") @NotNull Block_readAttributeDoorClosedEventsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorClosedEventsWithCompletion {
        @Generated
        void call_readAttributeDoorClosedEventsWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDoorClosedEventsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDoorClosedEventsWithCompletionHandler:")
    public native void readAttributeDoorClosedEventsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDoorClosedEventsWithCompletionHandler") @NotNull Block_readAttributeDoorClosedEventsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorClosedEventsWithCompletionHandler {
        @Generated
        void call_readAttributeDoorClosedEventsWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDoorOpenEventsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDoorOpenEventsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDoorOpenEventsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDoorOpenEventsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDoorOpenEventsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorOpenEventsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDoorOpenEventsWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDoorOpenEventsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDoorOpenEventsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDoorOpenEventsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDoorOpenEventsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorOpenEventsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDoorOpenEventsWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDoorOpenEventsWithCompletion:")
    public native void readAttributeDoorOpenEventsWithCompletion(
            @ObjCBlock(name = "call_readAttributeDoorOpenEventsWithCompletion") @NotNull Block_readAttributeDoorOpenEventsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorOpenEventsWithCompletion {
        @Generated
        void call_readAttributeDoorOpenEventsWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDoorOpenEventsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDoorOpenEventsWithCompletionHandler:")
    public native void readAttributeDoorOpenEventsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDoorOpenEventsWithCompletionHandler") @NotNull Block_readAttributeDoorOpenEventsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorOpenEventsWithCompletionHandler {
        @Generated
        void call_readAttributeDoorOpenEventsWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDoorStateWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDoorStateWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDoorStateWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDoorStateWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDoorStateWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorStateWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDoorStateWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDoorStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDoorStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDoorStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDoorStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDoorStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDoorStateWithCompletion:")
    public native void readAttributeDoorStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeDoorStateWithCompletion") @NotNull Block_readAttributeDoorStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorStateWithCompletion {
        @Generated
        void call_readAttributeDoorStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDoorStateWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDoorStateWithCompletionHandler:")
    public native void readAttributeDoorStateWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDoorStateWithCompletionHandler") @NotNull Block_readAttributeDoorStateWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDoorStateWithCompletionHandler {
        @Generated
        void call_readAttributeDoorStateWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnableInsideStatusLEDWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnableInsideStatusLEDWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnableInsideStatusLEDWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnableInsideStatusLEDWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnableInsideStatusLEDWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableInsideStatusLEDWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnableInsideStatusLEDWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnableInsideStatusLEDWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnableInsideStatusLEDWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnableInsideStatusLEDWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnableInsideStatusLEDWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableInsideStatusLEDWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnableInsideStatusLEDWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnableInsideStatusLEDWithCompletion:")
    public native void readAttributeEnableInsideStatusLEDWithCompletion(
            @ObjCBlock(name = "call_readAttributeEnableInsideStatusLEDWithCompletion") @NotNull Block_readAttributeEnableInsideStatusLEDWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableInsideStatusLEDWithCompletion {
        @Generated
        void call_readAttributeEnableInsideStatusLEDWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnableInsideStatusLEDWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnableInsideStatusLEDWithCompletionHandler:")
    public native void readAttributeEnableInsideStatusLEDWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnableInsideStatusLEDWithCompletionHandler") @NotNull Block_readAttributeEnableInsideStatusLEDWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableInsideStatusLEDWithCompletionHandler {
        @Generated
        void call_readAttributeEnableInsideStatusLEDWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnableLocalProgrammingWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnableLocalProgrammingWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnableLocalProgrammingWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnableLocalProgrammingWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnableLocalProgrammingWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableLocalProgrammingWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnableLocalProgrammingWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnableLocalProgrammingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnableLocalProgrammingWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnableLocalProgrammingWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnableLocalProgrammingWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableLocalProgrammingWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnableLocalProgrammingWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnableLocalProgrammingWithCompletion:")
    public native void readAttributeEnableLocalProgrammingWithCompletion(
            @ObjCBlock(name = "call_readAttributeEnableLocalProgrammingWithCompletion") @NotNull Block_readAttributeEnableLocalProgrammingWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableLocalProgrammingWithCompletion {
        @Generated
        void call_readAttributeEnableLocalProgrammingWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnableLocalProgrammingWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnableLocalProgrammingWithCompletionHandler:")
    public native void readAttributeEnableLocalProgrammingWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnableLocalProgrammingWithCompletionHandler") @NotNull Block_readAttributeEnableLocalProgrammingWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableLocalProgrammingWithCompletionHandler {
        @Generated
        void call_readAttributeEnableLocalProgrammingWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnableOneTouchLockingWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnableOneTouchLockingWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnableOneTouchLockingWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnableOneTouchLockingWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnableOneTouchLockingWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableOneTouchLockingWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnableOneTouchLockingWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnableOneTouchLockingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnableOneTouchLockingWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnableOneTouchLockingWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnableOneTouchLockingWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableOneTouchLockingWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnableOneTouchLockingWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnableOneTouchLockingWithCompletion:")
    public native void readAttributeEnableOneTouchLockingWithCompletion(
            @ObjCBlock(name = "call_readAttributeEnableOneTouchLockingWithCompletion") @NotNull Block_readAttributeEnableOneTouchLockingWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableOneTouchLockingWithCompletion {
        @Generated
        void call_readAttributeEnableOneTouchLockingWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnableOneTouchLockingWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnableOneTouchLockingWithCompletionHandler:")
    public native void readAttributeEnableOneTouchLockingWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnableOneTouchLockingWithCompletionHandler") @NotNull Block_readAttributeEnableOneTouchLockingWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnableOneTouchLockingWithCompletionHandler {
        @Generated
        void call_readAttributeEnableOneTouchLockingWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnablePrivacyModeButtonWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnablePrivacyModeButtonWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnablePrivacyModeButtonWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnablePrivacyModeButtonWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnablePrivacyModeButtonWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnablePrivacyModeButtonWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnablePrivacyModeButtonWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnablePrivacyModeButtonWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnablePrivacyModeButtonWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnablePrivacyModeButtonWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEnablePrivacyModeButtonWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnablePrivacyModeButtonWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEnablePrivacyModeButtonWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEnablePrivacyModeButtonWithCompletion:")
    public native void readAttributeEnablePrivacyModeButtonWithCompletion(
            @ObjCBlock(name = "call_readAttributeEnablePrivacyModeButtonWithCompletion") @NotNull Block_readAttributeEnablePrivacyModeButtonWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnablePrivacyModeButtonWithCompletion {
        @Generated
        void call_readAttributeEnablePrivacyModeButtonWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnablePrivacyModeButtonWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnablePrivacyModeButtonWithCompletionHandler:")
    public native void readAttributeEnablePrivacyModeButtonWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnablePrivacyModeButtonWithCompletionHandler") @NotNull Block_readAttributeEnablePrivacyModeButtonWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnablePrivacyModeButtonWithCompletionHandler {
        @Generated
        void call_readAttributeEnablePrivacyModeButtonWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeExpiringUserTimeoutWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeExpiringUserTimeoutWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeExpiringUserTimeoutWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeExpiringUserTimeoutWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeExpiringUserTimeoutWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExpiringUserTimeoutWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeExpiringUserTimeoutWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeExpiringUserTimeoutWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeExpiringUserTimeoutWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeExpiringUserTimeoutWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeExpiringUserTimeoutWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExpiringUserTimeoutWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeExpiringUserTimeoutWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeExpiringUserTimeoutWithCompletion:")
    public native void readAttributeExpiringUserTimeoutWithCompletion(
            @ObjCBlock(name = "call_readAttributeExpiringUserTimeoutWithCompletion") @NotNull Block_readAttributeExpiringUserTimeoutWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExpiringUserTimeoutWithCompletion {
        @Generated
        void call_readAttributeExpiringUserTimeoutWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeExpiringUserTimeoutWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeExpiringUserTimeoutWithCompletionHandler:")
    public native void readAttributeExpiringUserTimeoutWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeExpiringUserTimeoutWithCompletionHandler") @NotNull Block_readAttributeExpiringUserTimeoutWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExpiringUserTimeoutWithCompletionHandler {
        @Generated
        void call_readAttributeExpiringUserTimeoutWithCompletionHandler(@Nullable NSNumber value,
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
     * Deprecated-Message: Please use readAttributeLEDSettingsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLEDSettingsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLEDSettingsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLEDSettingsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLEDSettingsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLEDSettingsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLEDSettingsWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLEDSettingsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLEDSettingsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLEDSettingsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLEDSettingsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLEDSettingsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLEDSettingsWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLEDSettingsWithCompletion:")
    public native void readAttributeLEDSettingsWithCompletion(
            @ObjCBlock(name = "call_readAttributeLEDSettingsWithCompletion") @NotNull Block_readAttributeLEDSettingsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLEDSettingsWithCompletion {
        @Generated
        void call_readAttributeLEDSettingsWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLEDSettingsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLEDSettingsWithCompletionHandler:")
    public native void readAttributeLEDSettingsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLEDSettingsWithCompletionHandler") @NotNull Block_readAttributeLEDSettingsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLEDSettingsWithCompletionHandler {
        @Generated
        void call_readAttributeLEDSettingsWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLanguageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLanguageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLanguageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLanguageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLanguageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLanguageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLanguageWithAttributeCacheEndpointQueueCompletionHandler(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLanguageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLanguageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLanguageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLanguageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLanguageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLanguageWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLanguageWithCompletion:")
    public native void readAttributeLanguageWithCompletion(
            @ObjCBlock(name = "call_readAttributeLanguageWithCompletion") @NotNull Block_readAttributeLanguageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLanguageWithCompletion {
        @Generated
        void call_readAttributeLanguageWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLanguageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLanguageWithCompletionHandler:")
    public native void readAttributeLanguageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLanguageWithCompletionHandler") @NotNull Block_readAttributeLanguageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLanguageWithCompletionHandler {
        @Generated
        void call_readAttributeLanguageWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLocalProgrammingFeaturesWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLocalProgrammingFeaturesWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLocalProgrammingFeaturesWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLocalProgrammingFeaturesWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLocalProgrammingFeaturesWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalProgrammingFeaturesWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLocalProgrammingFeaturesWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocalProgrammingFeaturesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLocalProgrammingFeaturesWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLocalProgrammingFeaturesWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLocalProgrammingFeaturesWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalProgrammingFeaturesWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLocalProgrammingFeaturesWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLocalProgrammingFeaturesWithCompletion:")
    public native void readAttributeLocalProgrammingFeaturesWithCompletion(
            @ObjCBlock(name = "call_readAttributeLocalProgrammingFeaturesWithCompletion") @NotNull Block_readAttributeLocalProgrammingFeaturesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalProgrammingFeaturesWithCompletion {
        @Generated
        void call_readAttributeLocalProgrammingFeaturesWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLocalProgrammingFeaturesWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLocalProgrammingFeaturesWithCompletionHandler:")
    public native void readAttributeLocalProgrammingFeaturesWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLocalProgrammingFeaturesWithCompletionHandler") @NotNull Block_readAttributeLocalProgrammingFeaturesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLocalProgrammingFeaturesWithCompletionHandler {
        @Generated
        void call_readAttributeLocalProgrammingFeaturesWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLockStateWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLockStateWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLockStateWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLockStateWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLockStateWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockStateWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLockStateWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLockStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLockStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLockStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLockStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLockStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLockStateWithCompletion:")
    public native void readAttributeLockStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeLockStateWithCompletion") @NotNull Block_readAttributeLockStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockStateWithCompletion {
        @Generated
        void call_readAttributeLockStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLockStateWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLockStateWithCompletionHandler:")
    public native void readAttributeLockStateWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLockStateWithCompletionHandler") @NotNull Block_readAttributeLockStateWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockStateWithCompletionHandler {
        @Generated
        void call_readAttributeLockStateWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLockTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLockTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLockTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLockTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLockTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLockTypeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLockTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLockTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLockTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLockTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLockTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLockTypeWithCompletion:")
    public native void readAttributeLockTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeLockTypeWithCompletion") @NotNull Block_readAttributeLockTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockTypeWithCompletion {
        @Generated
        void call_readAttributeLockTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLockTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLockTypeWithCompletionHandler:")
    public native void readAttributeLockTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLockTypeWithCompletionHandler") @NotNull Block_readAttributeLockTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLockTypeWithCompletionHandler {
        @Generated
        void call_readAttributeLockTypeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxPINCodeLengthWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxPINCodeLengthWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMaxPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMaxPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMaxPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxPINCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxPINCodeLengthWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxPINCodeLengthWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMaxPINCodeLengthWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxPINCodeLengthWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMaxPINCodeLengthWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxPINCodeLengthWithCompletion:")
    public native void readAttributeMaxPINCodeLengthWithCompletion(
            @ObjCBlock(name = "call_readAttributeMaxPINCodeLengthWithCompletion") @NotNull Block_readAttributeMaxPINCodeLengthWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxPINCodeLengthWithCompletion {
        @Generated
        void call_readAttributeMaxPINCodeLengthWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxPINCodeLengthWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxPINCodeLengthWithCompletionHandler:")
    public native void readAttributeMaxPINCodeLengthWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMaxPINCodeLengthWithCompletionHandler") @NotNull Block_readAttributeMaxPINCodeLengthWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxPINCodeLengthWithCompletionHandler {
        @Generated
        void call_readAttributeMaxPINCodeLengthWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxRFIDCodeLengthWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxRFIDCodeLengthWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMaxRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMaxRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMaxRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxRFIDCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMaxRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMaxRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxRFIDCodeLengthWithCompletion:")
    public native void readAttributeMaxRFIDCodeLengthWithCompletion(
            @ObjCBlock(name = "call_readAttributeMaxRFIDCodeLengthWithCompletion") @NotNull Block_readAttributeMaxRFIDCodeLengthWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxRFIDCodeLengthWithCompletion {
        @Generated
        void call_readAttributeMaxRFIDCodeLengthWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxRFIDCodeLengthWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxRFIDCodeLengthWithCompletionHandler:")
    public native void readAttributeMaxRFIDCodeLengthWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMaxRFIDCodeLengthWithCompletionHandler") @NotNull Block_readAttributeMaxRFIDCodeLengthWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxRFIDCodeLengthWithCompletionHandler {
        @Generated
        void call_readAttributeMaxRFIDCodeLengthWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinPINCodeLengthWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinPINCodeLengthWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMinPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMinPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMinPINCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinPINCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinPINCodeLengthWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinPINCodeLengthWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMinPINCodeLengthWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinPINCodeLengthWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMinPINCodeLengthWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinPINCodeLengthWithCompletion:")
    public native void readAttributeMinPINCodeLengthWithCompletion(
            @ObjCBlock(name = "call_readAttributeMinPINCodeLengthWithCompletion") @NotNull Block_readAttributeMinPINCodeLengthWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinPINCodeLengthWithCompletion {
        @Generated
        void call_readAttributeMinPINCodeLengthWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinPINCodeLengthWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinPINCodeLengthWithCompletionHandler:")
    public native void readAttributeMinPINCodeLengthWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMinPINCodeLengthWithCompletionHandler") @NotNull Block_readAttributeMinPINCodeLengthWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinPINCodeLengthWithCompletionHandler {
        @Generated
        void call_readAttributeMinPINCodeLengthWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinRFIDCodeLengthWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinRFIDCodeLengthWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMinRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMinRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMinRFIDCodeLengthWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinRFIDCodeLengthWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMinRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMinRFIDCodeLengthWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinRFIDCodeLengthWithCompletion:")
    public native void readAttributeMinRFIDCodeLengthWithCompletion(
            @ObjCBlock(name = "call_readAttributeMinRFIDCodeLengthWithCompletion") @NotNull Block_readAttributeMinRFIDCodeLengthWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinRFIDCodeLengthWithCompletion {
        @Generated
        void call_readAttributeMinRFIDCodeLengthWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinRFIDCodeLengthWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinRFIDCodeLengthWithCompletionHandler:")
    public native void readAttributeMinRFIDCodeLengthWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMinRFIDCodeLengthWithCompletionHandler") @NotNull Block_readAttributeMinRFIDCodeLengthWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinRFIDCodeLengthWithCompletionHandler {
        @Generated
        void call_readAttributeMinRFIDCodeLengthWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfCredentialsSupportedPerUserWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfCredentialsSupportedPerUserWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfCredentialsSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfCredentialsSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfCredentialsSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfCredentialsSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfCredentialsSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfCredentialsSupportedPerUserWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfCredentialsSupportedPerUserWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfCredentialsSupportedPerUserWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfCredentialsSupportedPerUserWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfCredentialsSupportedPerUserWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfCredentialsSupportedPerUserWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfCredentialsSupportedPerUserWithCompletion:")
    public native void readAttributeNumberOfCredentialsSupportedPerUserWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfCredentialsSupportedPerUserWithCompletion") @NotNull Block_readAttributeNumberOfCredentialsSupportedPerUserWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfCredentialsSupportedPerUserWithCompletion {
        @Generated
        void call_readAttributeNumberOfCredentialsSupportedPerUserWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfCredentialsSupportedPerUserWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfCredentialsSupportedPerUserWithCompletionHandler:")
    public native void readAttributeNumberOfCredentialsSupportedPerUserWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfCredentialsSupportedPerUserWithCompletionHandler") @NotNull Block_readAttributeNumberOfCredentialsSupportedPerUserWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfCredentialsSupportedPerUserWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfCredentialsSupportedPerUserWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfHolidaySchedulesSupportedWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfHolidaySchedulesSupportedWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfHolidaySchedulesSupportedWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfHolidaySchedulesSupportedWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfHolidaySchedulesSupportedWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfHolidaySchedulesSupportedWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfHolidaySchedulesSupportedWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfHolidaySchedulesSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfHolidaySchedulesSupportedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfHolidaySchedulesSupportedWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfHolidaySchedulesSupportedWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfHolidaySchedulesSupportedWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfHolidaySchedulesSupportedWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfHolidaySchedulesSupportedWithCompletion:")
    public native void readAttributeNumberOfHolidaySchedulesSupportedWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfHolidaySchedulesSupportedWithCompletion") @NotNull Block_readAttributeNumberOfHolidaySchedulesSupportedWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfHolidaySchedulesSupportedWithCompletion {
        @Generated
        void call_readAttributeNumberOfHolidaySchedulesSupportedWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfHolidaySchedulesSupportedWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfHolidaySchedulesSupportedWithCompletionHandler:")
    public native void readAttributeNumberOfHolidaySchedulesSupportedWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfHolidaySchedulesSupportedWithCompletionHandler") @NotNull Block_readAttributeNumberOfHolidaySchedulesSupportedWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfHolidaySchedulesSupportedWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfHolidaySchedulesSupportedWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfPINUsersSupportedWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfPINUsersSupportedWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfPINUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfPINUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfPINUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPINUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfPINUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfPINUsersSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfPINUsersSupportedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfPINUsersSupportedWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfPINUsersSupportedWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPINUsersSupportedWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfPINUsersSupportedWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfPINUsersSupportedWithCompletion:")
    public native void readAttributeNumberOfPINUsersSupportedWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfPINUsersSupportedWithCompletion") @NotNull Block_readAttributeNumberOfPINUsersSupportedWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPINUsersSupportedWithCompletion {
        @Generated
        void call_readAttributeNumberOfPINUsersSupportedWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfPINUsersSupportedWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfPINUsersSupportedWithCompletionHandler:")
    public native void readAttributeNumberOfPINUsersSupportedWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfPINUsersSupportedWithCompletionHandler") @NotNull Block_readAttributeNumberOfPINUsersSupportedWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfPINUsersSupportedWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfPINUsersSupportedWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfRFIDUsersSupportedWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfRFIDUsersSupportedWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfRFIDUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfRFIDUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfRFIDUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfRFIDUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfRFIDUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfRFIDUsersSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfRFIDUsersSupportedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfRFIDUsersSupportedWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfRFIDUsersSupportedWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfRFIDUsersSupportedWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfRFIDUsersSupportedWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfRFIDUsersSupportedWithCompletion:")
    public native void readAttributeNumberOfRFIDUsersSupportedWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfRFIDUsersSupportedWithCompletion") @NotNull Block_readAttributeNumberOfRFIDUsersSupportedWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfRFIDUsersSupportedWithCompletion {
        @Generated
        void call_readAttributeNumberOfRFIDUsersSupportedWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfRFIDUsersSupportedWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfRFIDUsersSupportedWithCompletionHandler:")
    public native void readAttributeNumberOfRFIDUsersSupportedWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfRFIDUsersSupportedWithCompletionHandler") @NotNull Block_readAttributeNumberOfRFIDUsersSupportedWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfRFIDUsersSupportedWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfRFIDUsersSupportedWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfTotalUsersSupportedWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfTotalUsersSupportedWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfTotalUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfTotalUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfTotalUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfTotalUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfTotalUsersSupportedWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfTotalUsersSupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfTotalUsersSupportedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfTotalUsersSupportedWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfTotalUsersSupportedWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfTotalUsersSupportedWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfTotalUsersSupportedWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfTotalUsersSupportedWithCompletion:")
    public native void readAttributeNumberOfTotalUsersSupportedWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfTotalUsersSupportedWithCompletion") @NotNull Block_readAttributeNumberOfTotalUsersSupportedWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfTotalUsersSupportedWithCompletion {
        @Generated
        void call_readAttributeNumberOfTotalUsersSupportedWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfTotalUsersSupportedWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfTotalUsersSupportedWithCompletionHandler:")
    public native void readAttributeNumberOfTotalUsersSupportedWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfTotalUsersSupportedWithCompletionHandler") @NotNull Block_readAttributeNumberOfTotalUsersSupportedWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfTotalUsersSupportedWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfTotalUsersSupportedWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion:")
    public native void readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion") @NotNull Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion {
        @Generated
        void call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletionHandler:")
    public native void readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletionHandler") @NotNull Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNumberOfYearDaySchedulesSupportedPerUserWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfYearDaySchedulesSupportedPerUserWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfYearDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfYearDaySchedulesSupportedPerUserWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfYearDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion:")
    public native void readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion") @NotNull Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion {
        @Generated
        void call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletionHandler:")
    public native void readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletionHandler") @NotNull Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfYearDaySchedulesSupportedPerUserWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOpenPeriodWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOpenPeriodWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOpenPeriodWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOpenPeriodWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOpenPeriodWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOpenPeriodWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOpenPeriodWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOpenPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOpenPeriodWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOpenPeriodWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOpenPeriodWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOpenPeriodWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOpenPeriodWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOpenPeriodWithCompletion:")
    public native void readAttributeOpenPeriodWithCompletion(
            @ObjCBlock(name = "call_readAttributeOpenPeriodWithCompletion") @NotNull Block_readAttributeOpenPeriodWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOpenPeriodWithCompletion {
        @Generated
        void call_readAttributeOpenPeriodWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOpenPeriodWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOpenPeriodWithCompletionHandler:")
    public native void readAttributeOpenPeriodWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOpenPeriodWithCompletionHandler") @NotNull Block_readAttributeOpenPeriodWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOpenPeriodWithCompletionHandler {
        @Generated
        void call_readAttributeOpenPeriodWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOperatingModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOperatingModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOperatingModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOperatingModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOperatingModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperatingModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOperatingModeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOperatingModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperatingModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOperatingModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOperatingModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperatingModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOperatingModeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOperatingModeWithCompletion:")
    public native void readAttributeOperatingModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeOperatingModeWithCompletion") @NotNull Block_readAttributeOperatingModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperatingModeWithCompletion {
        @Generated
        void call_readAttributeOperatingModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOperatingModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOperatingModeWithCompletionHandler:")
    public native void readAttributeOperatingModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOperatingModeWithCompletionHandler") @NotNull Block_readAttributeOperatingModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperatingModeWithCompletionHandler {
        @Generated
        void call_readAttributeOperatingModeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRequirePINforRemoteOperationWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRequirePINforRemoteOperationWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRequirePINforRemoteOperationWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRequirePINforRemoteOperationWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRequirePINforRemoteOperationWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRequirePINforRemoteOperationWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRequirePINforRemoteOperationWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRequirePINforRemoteOperationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRequirePINforRemoteOperationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRequirePINforRemoteOperationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRequirePINforRemoteOperationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRequirePINforRemoteOperationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRequirePINforRemoteOperationWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRequirePINforRemoteOperationWithCompletion:")
    public native void readAttributeRequirePINforRemoteOperationWithCompletion(
            @ObjCBlock(name = "call_readAttributeRequirePINforRemoteOperationWithCompletion") @NotNull Block_readAttributeRequirePINforRemoteOperationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRequirePINforRemoteOperationWithCompletion {
        @Generated
        void call_readAttributeRequirePINforRemoteOperationWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRequirePINforRemoteOperationWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRequirePINforRemoteOperationWithCompletionHandler:")
    public native void readAttributeRequirePINforRemoteOperationWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRequirePINforRemoteOperationWithCompletionHandler") @NotNull Block_readAttributeRequirePINforRemoteOperationWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRequirePINforRemoteOperationWithCompletionHandler {
        @Generated
        void call_readAttributeRequirePINforRemoteOperationWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSendPINOverTheAirWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSendPINOverTheAirWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSendPINOverTheAirWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSendPINOverTheAirWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSendPINOverTheAirWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSendPINOverTheAirWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSendPINOverTheAirWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSendPINOverTheAirWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSendPINOverTheAirWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSendPINOverTheAirWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSendPINOverTheAirWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSendPINOverTheAirWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSendPINOverTheAirWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSendPINOverTheAirWithCompletion:")
    public native void readAttributeSendPINOverTheAirWithCompletion(
            @ObjCBlock(name = "call_readAttributeSendPINOverTheAirWithCompletion") @NotNull Block_readAttributeSendPINOverTheAirWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSendPINOverTheAirWithCompletion {
        @Generated
        void call_readAttributeSendPINOverTheAirWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSendPINOverTheAirWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSendPINOverTheAirWithCompletionHandler:")
    public native void readAttributeSendPINOverTheAirWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSendPINOverTheAirWithCompletionHandler") @NotNull Block_readAttributeSendPINOverTheAirWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSendPINOverTheAirWithCompletionHandler {
        @Generated
        void call_readAttributeSendPINOverTheAirWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSoundVolumeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSoundVolumeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSoundVolumeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSoundVolumeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSoundVolumeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSoundVolumeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSoundVolumeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSoundVolumeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSoundVolumeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSoundVolumeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSoundVolumeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSoundVolumeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSoundVolumeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSoundVolumeWithCompletion:")
    public native void readAttributeSoundVolumeWithCompletion(
            @ObjCBlock(name = "call_readAttributeSoundVolumeWithCompletion") @NotNull Block_readAttributeSoundVolumeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSoundVolumeWithCompletion {
        @Generated
        void call_readAttributeSoundVolumeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSoundVolumeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSoundVolumeWithCompletionHandler:")
    public native void readAttributeSoundVolumeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSoundVolumeWithCompletionHandler") @NotNull Block_readAttributeSoundVolumeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSoundVolumeWithCompletionHandler {
        @Generated
        void call_readAttributeSoundVolumeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSupportedOperatingModesWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSupportedOperatingModesWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSupportedOperatingModesWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSupportedOperatingModesWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSupportedOperatingModesWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSupportedOperatingModesWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSupportedOperatingModesWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSupportedOperatingModesWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSupportedOperatingModesWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSupportedOperatingModesWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSupportedOperatingModesWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSupportedOperatingModesWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSupportedOperatingModesWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSupportedOperatingModesWithCompletion:")
    public native void readAttributeSupportedOperatingModesWithCompletion(
            @ObjCBlock(name = "call_readAttributeSupportedOperatingModesWithCompletion") @NotNull Block_readAttributeSupportedOperatingModesWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSupportedOperatingModesWithCompletion {
        @Generated
        void call_readAttributeSupportedOperatingModesWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSupportedOperatingModesWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSupportedOperatingModesWithCompletionHandler:")
    public native void readAttributeSupportedOperatingModesWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSupportedOperatingModesWithCompletionHandler") @NotNull Block_readAttributeSupportedOperatingModesWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSupportedOperatingModesWithCompletionHandler {
        @Generated
        void call_readAttributeSupportedOperatingModesWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeUserCodeTemporaryDisableTimeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUserCodeTemporaryDisableTimeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUserCodeTemporaryDisableTimeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUserCodeTemporaryDisableTimeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUserCodeTemporaryDisableTimeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUserCodeTemporaryDisableTimeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUserCodeTemporaryDisableTimeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUserCodeTemporaryDisableTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUserCodeTemporaryDisableTimeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUserCodeTemporaryDisableTimeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUserCodeTemporaryDisableTimeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUserCodeTemporaryDisableTimeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUserCodeTemporaryDisableTimeWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUserCodeTemporaryDisableTimeWithCompletion:")
    public native void readAttributeUserCodeTemporaryDisableTimeWithCompletion(
            @ObjCBlock(name = "call_readAttributeUserCodeTemporaryDisableTimeWithCompletion") @NotNull Block_readAttributeUserCodeTemporaryDisableTimeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUserCodeTemporaryDisableTimeWithCompletion {
        @Generated
        void call_readAttributeUserCodeTemporaryDisableTimeWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUserCodeTemporaryDisableTimeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUserCodeTemporaryDisableTimeWithCompletionHandler:")
    public native void readAttributeUserCodeTemporaryDisableTimeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUserCodeTemporaryDisableTimeWithCompletionHandler") @NotNull Block_readAttributeUserCodeTemporaryDisableTimeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUserCodeTemporaryDisableTimeWithCompletionHandler {
        @Generated
        void call_readAttributeUserCodeTemporaryDisableTimeWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWrongCodeEntryLimitWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWrongCodeEntryLimitWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeWrongCodeEntryLimitWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWrongCodeEntryLimitWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeWrongCodeEntryLimitWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWrongCodeEntryLimitWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeWrongCodeEntryLimitWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWrongCodeEntryLimitWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWrongCodeEntryLimitWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWrongCodeEntryLimitWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeWrongCodeEntryLimitWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWrongCodeEntryLimitWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeWrongCodeEntryLimitWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWrongCodeEntryLimitWithCompletion:")
    public native void readAttributeWrongCodeEntryLimitWithCompletion(
            @ObjCBlock(name = "call_readAttributeWrongCodeEntryLimitWithCompletion") @NotNull Block_readAttributeWrongCodeEntryLimitWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWrongCodeEntryLimitWithCompletion {
        @Generated
        void call_readAttributeWrongCodeEntryLimitWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWrongCodeEntryLimitWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWrongCodeEntryLimitWithCompletionHandler:")
    public native void readAttributeWrongCodeEntryLimitWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeWrongCodeEntryLimitWithCompletionHandler") @NotNull Block_readAttributeWrongCodeEntryLimitWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWrongCodeEntryLimitWithCompletionHandler {
        @Generated
        void call_readAttributeWrongCodeEntryLimitWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Command SetCredential
     * 
     * Set a credential (e.g. PIN, RFID, Fingerprint, etc.) into the lock for a new user, existing user, or
     * ProgrammingUser.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setCredentialWithParams:completion:")
    public native void setCredentialWithParamsCompletion(@NotNull MTRDoorLockClusterSetCredentialParams params,
            @ObjCBlock(name = "call_setCredentialWithParamsCompletion") @NotNull Block_setCredentialWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCredentialWithParamsCompletion {
        @Generated
        void call_setCredentialWithParamsCompletion(@Nullable MTRDoorLockClusterSetCredentialResponseParams data,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setCredentialWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("setCredentialWithParams:completionHandler:")
    public native void setCredentialWithParamsCompletionHandler(@NotNull MTRDoorLockClusterSetCredentialParams params,
            @ObjCBlock(name = "call_setCredentialWithParamsCompletionHandler") @NotNull Block_setCredentialWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCredentialWithParamsCompletionHandler {
        @Generated
        void call_setCredentialWithParamsCompletionHandler(@Nullable MTRDoorLockClusterSetCredentialResponseParams data,
                @Nullable NSError error);
    }

    /**
     * Command SetHolidaySchedule
     * 
     * Set the holiday Schedule by specifying local start time and local end time with respect to any Lock Operating
     * Mode.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setHolidayScheduleWithParams:completion:")
    public native void setHolidayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterSetHolidayScheduleParams params,
            @ObjCBlock(name = "call_setHolidayScheduleWithParamsCompletion") @NotNull Block_setHolidayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setHolidayScheduleWithParamsCompletion {
        @Generated
        void call_setHolidayScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setHolidayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("setHolidayScheduleWithParams:completionHandler:")
    public native void setHolidayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterSetHolidayScheduleParams params,
            @ObjCBlock(name = "call_setHolidayScheduleWithParamsCompletionHandler") @NotNull Block_setHolidayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setHolidayScheduleWithParamsCompletionHandler {
        @Generated
        void call_setHolidayScheduleWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command SetUser
     * 
     * Set User into the lock.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setUserWithParams:completion:")
    public native void setUserWithParamsCompletion(@NotNull MTRDoorLockClusterSetUserParams params,
            @ObjCBlock(name = "call_setUserWithParamsCompletion") @NotNull Block_setUserWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserWithParamsCompletion {
        @Generated
        void call_setUserWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setUserWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("setUserWithParams:completionHandler:")
    public native void setUserWithParamsCompletionHandler(@NotNull MTRDoorLockClusterSetUserParams params,
            @ObjCBlock(name = "call_setUserWithParamsCompletionHandler") @NotNull Block_setUserWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserWithParamsCompletionHandler {
        @Generated
        void call_setUserWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Command SetWeekDaySchedule
     * 
     * Set a weekly repeating schedule for a specified user.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setWeekDayScheduleWithParams:completion:")
    public native void setWeekDayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterSetWeekDayScheduleParams params,
            @ObjCBlock(name = "call_setWeekDayScheduleWithParamsCompletion") @NotNull Block_setWeekDayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeekDayScheduleWithParamsCompletion {
        @Generated
        void call_setWeekDayScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setWeekDayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("setWeekDayScheduleWithParams:completionHandler:")
    public native void setWeekDayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterSetWeekDayScheduleParams params,
            @ObjCBlock(name = "call_setWeekDayScheduleWithParamsCompletionHandler") @NotNull Block_setWeekDayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeekDayScheduleWithParamsCompletionHandler {
        @Generated
        void call_setWeekDayScheduleWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command SetYearDaySchedule
     * 
     * Set a time-specific schedule ID for a specified user.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("setYearDayScheduleWithParams:completion:")
    public native void setYearDayScheduleWithParamsCompletion(
            @NotNull MTRDoorLockClusterSetYearDayScheduleParams params,
            @ObjCBlock(name = "call_setYearDayScheduleWithParamsCompletion") @NotNull Block_setYearDayScheduleWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setYearDayScheduleWithParamsCompletion {
        @Generated
        void call_setYearDayScheduleWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setYearDayScheduleWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("setYearDayScheduleWithParams:completionHandler:")
    public native void setYearDayScheduleWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterSetYearDayScheduleParams params,
            @ObjCBlock(name = "call_setYearDayScheduleWithParamsCompletionHandler") @NotNull Block_setYearDayScheduleWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setYearDayScheduleWithParamsCompletionHandler {
        @Generated
        void call_setYearDayScheduleWithParamsCompletionHandler(@Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeActuatorEnabledWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActuatorEnabledWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActuatorEnabledWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActuatorEnabledWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActuatorEnabledWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeAutoRelockTimeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAutoRelockTimeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAutoRelockTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAutoRelockTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAutoRelockTimeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeCredentialRulesSupportWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCredentialRulesSupportWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCredentialRulesSupportWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCredentialRulesSupportWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCredentialRulesSupportWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDefaultConfigurationRegisterWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDefaultConfigurationRegisterWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDefaultConfigurationRegisterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDefaultConfigurationRegisterWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDefaultConfigurationRegisterWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDoorClosedEventsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDoorClosedEventsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDoorClosedEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDoorClosedEventsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDoorClosedEventsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDoorOpenEventsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDoorOpenEventsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDoorOpenEventsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDoorOpenEventsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDoorOpenEventsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDoorStateWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDoorStateWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDoorStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDoorStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDoorStateWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnableInsideStatusLEDWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnableInsideStatusLEDWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnableInsideStatusLEDWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnableInsideStatusLEDWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnableInsideStatusLEDWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnableLocalProgrammingWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnableLocalProgrammingWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnableLocalProgrammingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnableLocalProgrammingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnableLocalProgrammingWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnableOneTouchLockingWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnableOneTouchLockingWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnableOneTouchLockingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnableOneTouchLockingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnableOneTouchLockingWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnablePrivacyModeButtonWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnablePrivacyModeButtonWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnablePrivacyModeButtonWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEnablePrivacyModeButtonWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEnablePrivacyModeButtonWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeExpiringUserTimeoutWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeExpiringUserTimeoutWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeExpiringUserTimeoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeExpiringUserTimeoutWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeExpiringUserTimeoutWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeLEDSettingsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLEDSettingsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLEDSettingsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLEDSettingsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLEDSettingsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLanguageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLanguageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLanguageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLanguageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLanguageWithParamsSubscriptionEstablishedReportHandler_2(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLocalProgrammingFeaturesWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLocalProgrammingFeaturesWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLocalProgrammingFeaturesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLocalProgrammingFeaturesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLocalProgrammingFeaturesWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLockStateWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLockStateWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLockStateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLockStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLockStateWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLockTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLockTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLockTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLockTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLockTypeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMaxPINCodeLengthWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMaxPINCodeLengthWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMaxPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMaxPINCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMaxPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMaxRFIDCodeLengthWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMaxRFIDCodeLengthWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMaxRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMaxRFIDCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMaxRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMinPINCodeLengthWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMinPINCodeLengthWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMinPINCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMinPINCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMinPINCodeLengthWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMinRFIDCodeLengthWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMinRFIDCodeLengthWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMinRFIDCodeLengthWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMinRFIDCodeLengthWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMinRFIDCodeLengthWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeNumberOfCredentialsSupportedPerUserWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfCredentialsSupportedPerUserWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfCredentialsSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeNumberOfHolidaySchedulesSupportedWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfHolidaySchedulesSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfHolidaySchedulesSupportedWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNumberOfPINUsersSupportedWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfPINUsersSupportedWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfPINUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfPINUsersSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfPINUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNumberOfRFIDUsersSupportedWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfRFIDUsersSupportedWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfRFIDUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfRFIDUsersSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfRFIDUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNumberOfTotalUsersSupportedWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfTotalUsersSupportedWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfTotalUsersSupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfTotalUsersSupportedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfTotalUsersSupportedWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfYearDaySchedulesSupportedPerUserWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOpenPeriodWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOpenPeriodWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOpenPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOpenPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOpenPeriodWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOperatingModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOperatingModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOperatingModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOperatingModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOperatingModeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRequirePINforRemoteOperationWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRequirePINforRemoteOperationWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRequirePINforRemoteOperationWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRequirePINforRemoteOperationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRequirePINforRemoteOperationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSendPINOverTheAirWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSendPINOverTheAirWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSendPINOverTheAirWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSendPINOverTheAirWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSendPINOverTheAirWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSoundVolumeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSoundVolumeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSoundVolumeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSoundVolumeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSoundVolumeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSupportedOperatingModesWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSupportedOperatingModesWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSupportedOperatingModesWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSupportedOperatingModesWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSupportedOperatingModesWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeUserCodeTemporaryDisableTimeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUserCodeTemporaryDisableTimeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUserCodeTemporaryDisableTimeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUserCodeTemporaryDisableTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUserCodeTemporaryDisableTimeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeWrongCodeEntryLimitWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeWrongCodeEntryLimitWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeWrongCodeEntryLimitWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeWrongCodeEntryLimitWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeWrongCodeEntryLimitWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * Command UnlockDoor
     * 
     * This command causes the lock device to unlock the door.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("unlockDoorWithParams:completion:")
    public native void unlockDoorWithParamsCompletion(@Nullable MTRDoorLockClusterUnlockDoorParams params,
            @ObjCBlock(name = "call_unlockDoorWithParamsCompletion") @NotNull Block_unlockDoorWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockDoorWithParamsCompletion {
        @Generated
        void call_unlockDoorWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use unlockDoorWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("unlockDoorWithParams:completionHandler:")
    public native void unlockDoorWithParamsCompletionHandler(@Nullable MTRDoorLockClusterUnlockDoorParams params,
            @ObjCBlock(name = "call_unlockDoorWithParamsCompletionHandler") @NotNull Block_unlockDoorWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockDoorWithParamsCompletionHandler {
        @Generated
        void call_unlockDoorWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command UnlockWithTimeout
     * 
     * This command causes the lock device to unlock the door with a timeout parameter.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("unlockWithTimeoutWithParams:completion:")
    public native void unlockWithTimeoutWithParamsCompletion(@NotNull MTRDoorLockClusterUnlockWithTimeoutParams params,
            @ObjCBlock(name = "call_unlockWithTimeoutWithParamsCompletion") @NotNull Block_unlockWithTimeoutWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockWithTimeoutWithParamsCompletion {
        @Generated
        void call_unlockWithTimeoutWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use unlockWithTimeoutWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("unlockWithTimeoutWithParams:completionHandler:")
    public native void unlockWithTimeoutWithParamsCompletionHandler(
            @NotNull MTRDoorLockClusterUnlockWithTimeoutParams params,
            @ObjCBlock(name = "call_unlockWithTimeoutWithParamsCompletionHandler") @NotNull Block_unlockWithTimeoutWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockWithTimeoutWithParamsCompletionHandler {
        @Generated
        void call_unlockWithTimeoutWithParamsCompletionHandler(@Nullable NSError error);
    }

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
    @Selector("writeAttributeAutoRelockTimeWithValue:completion:")
    public native void writeAttributeAutoRelockTimeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAutoRelockTimeWithValueCompletion") @NotNull Block_writeAttributeAutoRelockTimeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAutoRelockTimeWithValueCompletion {
        @Generated
        void call_writeAttributeAutoRelockTimeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAutoRelockTimeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAutoRelockTimeWithValue:completionHandler:")
    public native void writeAttributeAutoRelockTimeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAutoRelockTimeWithValueCompletionHandler") @NotNull Block_writeAttributeAutoRelockTimeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAutoRelockTimeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeAutoRelockTimeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeAutoRelockTimeWithValue:params:completion:")
    public native void writeAttributeAutoRelockTimeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAutoRelockTimeWithValueParamsCompletion") @NotNull Block_writeAttributeAutoRelockTimeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAutoRelockTimeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeAutoRelockTimeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAutoRelockTimeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAutoRelockTimeWithValue:params:completionHandler:")
    public native void writeAttributeAutoRelockTimeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAutoRelockTimeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeAutoRelockTimeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAutoRelockTimeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeAutoRelockTimeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeDoorClosedEventsWithValue:completion:")
    public native void writeAttributeDoorClosedEventsWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeDoorClosedEventsWithValueCompletion") @NotNull Block_writeAttributeDoorClosedEventsWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorClosedEventsWithValueCompletion {
        @Generated
        void call_writeAttributeDoorClosedEventsWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeDoorClosedEventsWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeDoorClosedEventsWithValue:completionHandler:")
    public native void writeAttributeDoorClosedEventsWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeDoorClosedEventsWithValueCompletionHandler") @NotNull Block_writeAttributeDoorClosedEventsWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorClosedEventsWithValueCompletionHandler {
        @Generated
        void call_writeAttributeDoorClosedEventsWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeDoorClosedEventsWithValue:params:completion:")
    public native void writeAttributeDoorClosedEventsWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeDoorClosedEventsWithValueParamsCompletion") @NotNull Block_writeAttributeDoorClosedEventsWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorClosedEventsWithValueParamsCompletion {
        @Generated
        void call_writeAttributeDoorClosedEventsWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeDoorClosedEventsWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeDoorClosedEventsWithValue:params:completionHandler:")
    public native void writeAttributeDoorClosedEventsWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeDoorClosedEventsWithValueParamsCompletionHandler") @NotNull Block_writeAttributeDoorClosedEventsWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorClosedEventsWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeDoorClosedEventsWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeDoorOpenEventsWithValue:completion:")
    public native void writeAttributeDoorOpenEventsWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeDoorOpenEventsWithValueCompletion") @NotNull Block_writeAttributeDoorOpenEventsWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorOpenEventsWithValueCompletion {
        @Generated
        void call_writeAttributeDoorOpenEventsWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeDoorOpenEventsWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeDoorOpenEventsWithValue:completionHandler:")
    public native void writeAttributeDoorOpenEventsWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeDoorOpenEventsWithValueCompletionHandler") @NotNull Block_writeAttributeDoorOpenEventsWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorOpenEventsWithValueCompletionHandler {
        @Generated
        void call_writeAttributeDoorOpenEventsWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeDoorOpenEventsWithValue:params:completion:")
    public native void writeAttributeDoorOpenEventsWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeDoorOpenEventsWithValueParamsCompletion") @NotNull Block_writeAttributeDoorOpenEventsWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorOpenEventsWithValueParamsCompletion {
        @Generated
        void call_writeAttributeDoorOpenEventsWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeDoorOpenEventsWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeDoorOpenEventsWithValue:params:completionHandler:")
    public native void writeAttributeDoorOpenEventsWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeDoorOpenEventsWithValueParamsCompletionHandler") @NotNull Block_writeAttributeDoorOpenEventsWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDoorOpenEventsWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeDoorOpenEventsWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnableInsideStatusLEDWithValue:completion:")
    public native void writeAttributeEnableInsideStatusLEDWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnableInsideStatusLEDWithValueCompletion") @NotNull Block_writeAttributeEnableInsideStatusLEDWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableInsideStatusLEDWithValueCompletion {
        @Generated
        void call_writeAttributeEnableInsideStatusLEDWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnableInsideStatusLEDWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnableInsideStatusLEDWithValue:completionHandler:")
    public native void writeAttributeEnableInsideStatusLEDWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnableInsideStatusLEDWithValueCompletionHandler") @NotNull Block_writeAttributeEnableInsideStatusLEDWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableInsideStatusLEDWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEnableInsideStatusLEDWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnableInsideStatusLEDWithValue:params:completion:")
    public native void writeAttributeEnableInsideStatusLEDWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnableInsideStatusLEDWithValueParamsCompletion") @NotNull Block_writeAttributeEnableInsideStatusLEDWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableInsideStatusLEDWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEnableInsideStatusLEDWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnableInsideStatusLEDWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnableInsideStatusLEDWithValue:params:completionHandler:")
    public native void writeAttributeEnableInsideStatusLEDWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnableInsideStatusLEDWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEnableInsideStatusLEDWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableInsideStatusLEDWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEnableInsideStatusLEDWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnableLocalProgrammingWithValue:completion:")
    public native void writeAttributeEnableLocalProgrammingWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnableLocalProgrammingWithValueCompletion") @NotNull Block_writeAttributeEnableLocalProgrammingWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableLocalProgrammingWithValueCompletion {
        @Generated
        void call_writeAttributeEnableLocalProgrammingWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnableLocalProgrammingWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnableLocalProgrammingWithValue:completionHandler:")
    public native void writeAttributeEnableLocalProgrammingWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnableLocalProgrammingWithValueCompletionHandler") @NotNull Block_writeAttributeEnableLocalProgrammingWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableLocalProgrammingWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEnableLocalProgrammingWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnableLocalProgrammingWithValue:params:completion:")
    public native void writeAttributeEnableLocalProgrammingWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnableLocalProgrammingWithValueParamsCompletion") @NotNull Block_writeAttributeEnableLocalProgrammingWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableLocalProgrammingWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEnableLocalProgrammingWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnableLocalProgrammingWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnableLocalProgrammingWithValue:params:completionHandler:")
    public native void writeAttributeEnableLocalProgrammingWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnableLocalProgrammingWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEnableLocalProgrammingWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableLocalProgrammingWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEnableLocalProgrammingWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnableOneTouchLockingWithValue:completion:")
    public native void writeAttributeEnableOneTouchLockingWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnableOneTouchLockingWithValueCompletion") @NotNull Block_writeAttributeEnableOneTouchLockingWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableOneTouchLockingWithValueCompletion {
        @Generated
        void call_writeAttributeEnableOneTouchLockingWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnableOneTouchLockingWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnableOneTouchLockingWithValue:completionHandler:")
    public native void writeAttributeEnableOneTouchLockingWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnableOneTouchLockingWithValueCompletionHandler") @NotNull Block_writeAttributeEnableOneTouchLockingWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableOneTouchLockingWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEnableOneTouchLockingWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnableOneTouchLockingWithValue:params:completion:")
    public native void writeAttributeEnableOneTouchLockingWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnableOneTouchLockingWithValueParamsCompletion") @NotNull Block_writeAttributeEnableOneTouchLockingWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableOneTouchLockingWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEnableOneTouchLockingWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnableOneTouchLockingWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnableOneTouchLockingWithValue:params:completionHandler:")
    public native void writeAttributeEnableOneTouchLockingWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnableOneTouchLockingWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEnableOneTouchLockingWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnableOneTouchLockingWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEnableOneTouchLockingWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnablePrivacyModeButtonWithValue:completion:")
    public native void writeAttributeEnablePrivacyModeButtonWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnablePrivacyModeButtonWithValueCompletion") @NotNull Block_writeAttributeEnablePrivacyModeButtonWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnablePrivacyModeButtonWithValueCompletion {
        @Generated
        void call_writeAttributeEnablePrivacyModeButtonWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnablePrivacyModeButtonWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnablePrivacyModeButtonWithValue:completionHandler:")
    public native void writeAttributeEnablePrivacyModeButtonWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnablePrivacyModeButtonWithValueCompletionHandler") @NotNull Block_writeAttributeEnablePrivacyModeButtonWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnablePrivacyModeButtonWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEnablePrivacyModeButtonWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeEnablePrivacyModeButtonWithValue:params:completion:")
    public native void writeAttributeEnablePrivacyModeButtonWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletion") @NotNull Block_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletion {
        @Generated
        void call_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnablePrivacyModeButtonWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnablePrivacyModeButtonWithValue:params:completionHandler:")
    public native void writeAttributeEnablePrivacyModeButtonWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEnablePrivacyModeButtonWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeExpiringUserTimeoutWithValue:completion:")
    public native void writeAttributeExpiringUserTimeoutWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeExpiringUserTimeoutWithValueCompletion") @NotNull Block_writeAttributeExpiringUserTimeoutWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeExpiringUserTimeoutWithValueCompletion {
        @Generated
        void call_writeAttributeExpiringUserTimeoutWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeExpiringUserTimeoutWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeExpiringUserTimeoutWithValue:completionHandler:")
    public native void writeAttributeExpiringUserTimeoutWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeExpiringUserTimeoutWithValueCompletionHandler") @NotNull Block_writeAttributeExpiringUserTimeoutWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeExpiringUserTimeoutWithValueCompletionHandler {
        @Generated
        void call_writeAttributeExpiringUserTimeoutWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeExpiringUserTimeoutWithValue:params:completion:")
    public native void writeAttributeExpiringUserTimeoutWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeExpiringUserTimeoutWithValueParamsCompletion") @NotNull Block_writeAttributeExpiringUserTimeoutWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeExpiringUserTimeoutWithValueParamsCompletion {
        @Generated
        void call_writeAttributeExpiringUserTimeoutWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeExpiringUserTimeoutWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeExpiringUserTimeoutWithValue:params:completionHandler:")
    public native void writeAttributeExpiringUserTimeoutWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeExpiringUserTimeoutWithValueParamsCompletionHandler") @NotNull Block_writeAttributeExpiringUserTimeoutWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeExpiringUserTimeoutWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeExpiringUserTimeoutWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLEDSettingsWithValue:completion:")
    public native void writeAttributeLEDSettingsWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLEDSettingsWithValueCompletion") @NotNull Block_writeAttributeLEDSettingsWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLEDSettingsWithValueCompletion {
        @Generated
        void call_writeAttributeLEDSettingsWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLEDSettingsWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLEDSettingsWithValue:completionHandler:")
    public native void writeAttributeLEDSettingsWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLEDSettingsWithValueCompletionHandler") @NotNull Block_writeAttributeLEDSettingsWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLEDSettingsWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLEDSettingsWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLEDSettingsWithValue:params:completion:")
    public native void writeAttributeLEDSettingsWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLEDSettingsWithValueParamsCompletion") @NotNull Block_writeAttributeLEDSettingsWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLEDSettingsWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLEDSettingsWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLEDSettingsWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLEDSettingsWithValue:params:completionHandler:")
    public native void writeAttributeLEDSettingsWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLEDSettingsWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLEDSettingsWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLEDSettingsWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLEDSettingsWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLanguageWithValue:completion:")
    public native void writeAttributeLanguageWithValueCompletion(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLanguageWithValueCompletion") @NotNull Block_writeAttributeLanguageWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLanguageWithValueCompletion {
        @Generated
        void call_writeAttributeLanguageWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLanguageWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLanguageWithValue:completionHandler:")
    public native void writeAttributeLanguageWithValueCompletionHandler(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLanguageWithValueCompletionHandler") @NotNull Block_writeAttributeLanguageWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLanguageWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLanguageWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLanguageWithValue:params:completion:")
    public native void writeAttributeLanguageWithValueParamsCompletion(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLanguageWithValueParamsCompletion") @NotNull Block_writeAttributeLanguageWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLanguageWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLanguageWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLanguageWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLanguageWithValue:params:completionHandler:")
    public native void writeAttributeLanguageWithValueParamsCompletionHandler(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLanguageWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLanguageWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLanguageWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLanguageWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocalProgrammingFeaturesWithValue:completion:")
    public native void writeAttributeLocalProgrammingFeaturesWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLocalProgrammingFeaturesWithValueCompletion") @NotNull Block_writeAttributeLocalProgrammingFeaturesWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalProgrammingFeaturesWithValueCompletion {
        @Generated
        void call_writeAttributeLocalProgrammingFeaturesWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLocalProgrammingFeaturesWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLocalProgrammingFeaturesWithValue:completionHandler:")
    public native void writeAttributeLocalProgrammingFeaturesWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLocalProgrammingFeaturesWithValueCompletionHandler") @NotNull Block_writeAttributeLocalProgrammingFeaturesWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalProgrammingFeaturesWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLocalProgrammingFeaturesWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLocalProgrammingFeaturesWithValue:params:completion:")
    public native void writeAttributeLocalProgrammingFeaturesWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletion") @NotNull Block_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLocalProgrammingFeaturesWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLocalProgrammingFeaturesWithValue:params:completionHandler:")
    public native void writeAttributeLocalProgrammingFeaturesWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLocalProgrammingFeaturesWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOpenPeriodWithValue:completion:")
    public native void writeAttributeOpenPeriodWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOpenPeriodWithValueCompletion") @NotNull Block_writeAttributeOpenPeriodWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOpenPeriodWithValueCompletion {
        @Generated
        void call_writeAttributeOpenPeriodWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOpenPeriodWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOpenPeriodWithValue:completionHandler:")
    public native void writeAttributeOpenPeriodWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOpenPeriodWithValueCompletionHandler") @NotNull Block_writeAttributeOpenPeriodWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOpenPeriodWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOpenPeriodWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOpenPeriodWithValue:params:completion:")
    public native void writeAttributeOpenPeriodWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOpenPeriodWithValueParamsCompletion") @NotNull Block_writeAttributeOpenPeriodWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOpenPeriodWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOpenPeriodWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOpenPeriodWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOpenPeriodWithValue:params:completionHandler:")
    public native void writeAttributeOpenPeriodWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOpenPeriodWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOpenPeriodWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOpenPeriodWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOpenPeriodWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOperatingModeWithValue:completion:")
    public native void writeAttributeOperatingModeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOperatingModeWithValueCompletion") @NotNull Block_writeAttributeOperatingModeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOperatingModeWithValueCompletion {
        @Generated
        void call_writeAttributeOperatingModeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOperatingModeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOperatingModeWithValue:completionHandler:")
    public native void writeAttributeOperatingModeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOperatingModeWithValueCompletionHandler") @NotNull Block_writeAttributeOperatingModeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOperatingModeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOperatingModeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOperatingModeWithValue:params:completion:")
    public native void writeAttributeOperatingModeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOperatingModeWithValueParamsCompletion") @NotNull Block_writeAttributeOperatingModeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOperatingModeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOperatingModeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOperatingModeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOperatingModeWithValue:params:completionHandler:")
    public native void writeAttributeOperatingModeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOperatingModeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOperatingModeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOperatingModeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOperatingModeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRequirePINforRemoteOperationWithValue:completion:")
    public native void writeAttributeRequirePINforRemoteOperationWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRequirePINforRemoteOperationWithValueCompletion") @NotNull Block_writeAttributeRequirePINforRemoteOperationWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRequirePINforRemoteOperationWithValueCompletion {
        @Generated
        void call_writeAttributeRequirePINforRemoteOperationWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRequirePINforRemoteOperationWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRequirePINforRemoteOperationWithValue:completionHandler:")
    public native void writeAttributeRequirePINforRemoteOperationWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRequirePINforRemoteOperationWithValueCompletionHandler") @NotNull Block_writeAttributeRequirePINforRemoteOperationWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRequirePINforRemoteOperationWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRequirePINforRemoteOperationWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRequirePINforRemoteOperationWithValue:params:completion:")
    public native void writeAttributeRequirePINforRemoteOperationWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletion") @NotNull Block_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRequirePINforRemoteOperationWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRequirePINforRemoteOperationWithValue:params:completionHandler:")
    public native void writeAttributeRequirePINforRemoteOperationWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRequirePINforRemoteOperationWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeSendPINOverTheAirWithValue:completion:")
    public native void writeAttributeSendPINOverTheAirWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeSendPINOverTheAirWithValueCompletion") @NotNull Block_writeAttributeSendPINOverTheAirWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSendPINOverTheAirWithValueCompletion {
        @Generated
        void call_writeAttributeSendPINOverTheAirWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeSendPINOverTheAirWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeSendPINOverTheAirWithValue:completionHandler:")
    public native void writeAttributeSendPINOverTheAirWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeSendPINOverTheAirWithValueCompletionHandler") @NotNull Block_writeAttributeSendPINOverTheAirWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSendPINOverTheAirWithValueCompletionHandler {
        @Generated
        void call_writeAttributeSendPINOverTheAirWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeSendPINOverTheAirWithValue:params:completion:")
    public native void writeAttributeSendPINOverTheAirWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeSendPINOverTheAirWithValueParamsCompletion") @NotNull Block_writeAttributeSendPINOverTheAirWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSendPINOverTheAirWithValueParamsCompletion {
        @Generated
        void call_writeAttributeSendPINOverTheAirWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeSendPINOverTheAirWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeSendPINOverTheAirWithValue:params:completionHandler:")
    public native void writeAttributeSendPINOverTheAirWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeSendPINOverTheAirWithValueParamsCompletionHandler") @NotNull Block_writeAttributeSendPINOverTheAirWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSendPINOverTheAirWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeSendPINOverTheAirWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeSoundVolumeWithValue:completion:")
    public native void writeAttributeSoundVolumeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeSoundVolumeWithValueCompletion") @NotNull Block_writeAttributeSoundVolumeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSoundVolumeWithValueCompletion {
        @Generated
        void call_writeAttributeSoundVolumeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeSoundVolumeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeSoundVolumeWithValue:completionHandler:")
    public native void writeAttributeSoundVolumeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeSoundVolumeWithValueCompletionHandler") @NotNull Block_writeAttributeSoundVolumeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSoundVolumeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeSoundVolumeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeSoundVolumeWithValue:params:completion:")
    public native void writeAttributeSoundVolumeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeSoundVolumeWithValueParamsCompletion") @NotNull Block_writeAttributeSoundVolumeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSoundVolumeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeSoundVolumeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeSoundVolumeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeSoundVolumeWithValue:params:completionHandler:")
    public native void writeAttributeSoundVolumeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeSoundVolumeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeSoundVolumeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeSoundVolumeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeSoundVolumeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUserCodeTemporaryDisableTimeWithValue:completion:")
    public native void writeAttributeUserCodeTemporaryDisableTimeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletion") @NotNull Block_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletion {
        @Generated
        void call_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUserCodeTemporaryDisableTimeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUserCodeTemporaryDisableTimeWithValue:completionHandler:")
    public native void writeAttributeUserCodeTemporaryDisableTimeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletionHandler") @NotNull Block_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUserCodeTemporaryDisableTimeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUserCodeTemporaryDisableTimeWithValue:params:completion:")
    public native void writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletion") @NotNull Block_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUserCodeTemporaryDisableTimeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUserCodeTemporaryDisableTimeWithValue:params:completionHandler:")
    public native void writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUserCodeTemporaryDisableTimeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWrongCodeEntryLimitWithValue:completion:")
    public native void writeAttributeWrongCodeEntryLimitWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWrongCodeEntryLimitWithValueCompletion") @NotNull Block_writeAttributeWrongCodeEntryLimitWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWrongCodeEntryLimitWithValueCompletion {
        @Generated
        void call_writeAttributeWrongCodeEntryLimitWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWrongCodeEntryLimitWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWrongCodeEntryLimitWithValue:completionHandler:")
    public native void writeAttributeWrongCodeEntryLimitWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWrongCodeEntryLimitWithValueCompletionHandler") @NotNull Block_writeAttributeWrongCodeEntryLimitWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWrongCodeEntryLimitWithValueCompletionHandler {
        @Generated
        void call_writeAttributeWrongCodeEntryLimitWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeWrongCodeEntryLimitWithValue:params:completion:")
    public native void writeAttributeWrongCodeEntryLimitWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWrongCodeEntryLimitWithValueParamsCompletion") @NotNull Block_writeAttributeWrongCodeEntryLimitWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWrongCodeEntryLimitWithValueParamsCompletion {
        @Generated
        void call_writeAttributeWrongCodeEntryLimitWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWrongCodeEntryLimitWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWrongCodeEntryLimitWithValue:params:completionHandler:")
    public native void writeAttributeWrongCodeEntryLimitWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWrongCodeEntryLimitWithValueParamsCompletionHandler") @NotNull Block_writeAttributeWrongCodeEntryLimitWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWrongCodeEntryLimitWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeWrongCodeEntryLimitWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}