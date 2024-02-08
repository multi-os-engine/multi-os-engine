package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSDictionary;
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
 * An interface to a generic way to secure a door
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRClusterDoorLock extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRClusterDoorLock(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRClusterDoorLock alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRClusterDoorLock allocWithZone(VoidPtr zone);

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
    @Selector("clearCredentialWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterClearCredentialParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearCredentialWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearCredentialWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterClearCredentialParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_clearCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterClearHolidayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearHolidayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterClearHolidayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_clearHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearUserWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearUserWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterClearUserParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearUserWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearUserWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void clearUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterClearUserParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_clearUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterClearWeekDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterClearWeekDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_clearWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("clearYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterClearYearDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use clearYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("clearYearDayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterClearYearDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_clearYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getCredentialStatusWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterGetCredentialStatusParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRDoorLockClusterGetCredentialStatusResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getCredentialStatusWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getCredentialStatusWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterGetCredentialStatusParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getCredentialStatusWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRDoorLockClusterGetCredentialStatusResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterGetHolidayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRDoorLockClusterGetHolidayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getHolidayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterGetHolidayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRDoorLockClusterGetHolidayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getUserWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getUserWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterGetUserParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getUserWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getUserWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getUserWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getUserWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRDoorLockClusterGetUserResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getUserWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getUserWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterGetUserParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRDoorLockClusterGetUserResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterGetWeekDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRDoorLockClusterGetWeekDayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterGetWeekDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRDoorLockClusterGetWeekDayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterGetYearDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRDoorLockClusterGetYearDayScheduleResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("getYearDayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterGetYearDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_getYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRDoorLockClusterGetYearDayScheduleResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRClusterDoorLock init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpoindID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRClusterDoorLock initWithDeviceEndpointQueue(@NotNull MTRDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods that take a completion (i.e. command invocations),
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRClusterDoorLock initWithDeviceEndpointIDQueue(@NotNull MTRDevice device,
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("lockDoorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRDoorLockClusterLockDoorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use lockDoorWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("lockDoorWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRDoorLockClusterLockDoorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_lockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRClusterDoorLock new_objc();

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAcceptedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAcceptedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeActuatorEnabledWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeActuatorEnabledWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAttributeListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAttributeListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeAutoRelockTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeAutoRelockTimeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeClusterRevisionWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeClusterRevisionWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeCredentialRulesSupportWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeCredentialRulesSupportWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDefaultConfigurationRegisterWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDefaultConfigurationRegisterWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDoorClosedEventsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDoorClosedEventsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDoorOpenEventsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDoorOpenEventsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeDoorStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeDoorStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEnableInsideStatusLEDWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnableInsideStatusLEDWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEnableLocalProgrammingWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnableLocalProgrammingWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEnableOneTouchLockingWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnableOneTouchLockingWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeEnablePrivacyModeButtonWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeEnablePrivacyModeButtonWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeExpiringUserTimeoutWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeExpiringUserTimeoutWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeFeatureMapWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeFeatureMapWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeGeneratedCommandListWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeGeneratedCommandListWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLEDSettingsWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLEDSettingsWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLanguageWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLanguageWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLocalProgrammingFeaturesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLocalProgrammingFeaturesWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLockStateWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLockStateWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeLockTypeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeLockTypeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxPINCodeLengthWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxPINCodeLengthWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMaxRFIDCodeLengthWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMaxRFIDCodeLengthWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinPINCodeLengthWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinPINCodeLengthWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeMinRFIDCodeLengthWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeMinRFIDCodeLengthWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfCredentialsSupportedPerUserWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfCredentialsSupportedPerUserWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfHolidaySchedulesSupportedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfHolidaySchedulesSupportedWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfPINUsersSupportedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfPINUsersSupportedWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfRFIDUsersSupportedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfRFIDUsersSupportedWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfTotalUsersSupportedWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfTotalUsersSupportedWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfWeekDaySchedulesSupportedPerUserWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeNumberOfYearDaySchedulesSupportedPerUserWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeNumberOfYearDaySchedulesSupportedPerUserWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOpenPeriodWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOpenPeriodWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeOperatingModeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeOperatingModeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeRequirePINforRemoteOperationWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeRequirePINforRemoteOperationWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSendPINOverTheAirWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSendPINOverTheAirWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSoundVolumeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSoundVolumeWithParams(@Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeSupportedOperatingModesWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeSupportedOperatingModesWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeUserCodeTemporaryDisableTimeWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeUserCodeTemporaryDisableTimeWithParams(
            @Nullable MTRReadParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("readAttributeWrongCodeEntryLimitWithParams:")
    @Nullable
    public native NSDictionary<String, ?> readAttributeWrongCodeEntryLimitWithParams(@Nullable MTRReadParams params);

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setCredentialWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterSetCredentialParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletion(
                @Nullable MTRDoorLockClusterSetCredentialResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setCredentialWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("setCredentialWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterSetCredentialParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_setCredentialWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable MTRDoorLockClusterSetCredentialResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterSetHolidayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setHolidayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("setHolidayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterSetHolidayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_setHolidayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setUserWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setUserWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterSetUserParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setUserWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setUserWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setUserWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setUserWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("setUserWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void setUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterSetUserParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_setUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_setUserWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterSetWeekDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("setWeekDayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterSetWeekDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_setWeekDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("setYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:")
    public native void setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterSetYearDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use setYearDayScheduleWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("setYearDayScheduleWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterSetYearDayScheduleParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_setYearDayScheduleWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("unlockDoorWithParams:expectedValues:expectedValueInterval:completion:")
    public native void unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @Nullable MTRDoorLockClusterUnlockDoorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use unlockDoorWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("unlockDoorWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @Nullable MTRDoorLockClusterUnlockDoorParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_unlockDoorWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("unlockWithTimeoutWithParams:expectedValues:expectedValueInterval:completion:")
    public native void unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletion(
            @NotNull MTRDoorLockClusterUnlockWithTimeoutParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletion") @NotNull Block_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletion {
        @Generated
        void call_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use unlockWithTimeoutWithParams:expectedValues:expectedValueInterval:completion:
     */
    @Generated
    @Deprecated
    @Selector("unlockWithTimeoutWithParams:expectedValues:expectedValueInterval:completionHandler:")
    public native void unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
            @NotNull MTRDoorLockClusterUnlockWithTimeoutParams params,
            @Nullable NSArray<? extends NSDictionary<String, ?>> expectedDataValueDictionaries,
            @Nullable NSNumber expectedValueIntervalMs,
            @ObjCBlock(name = "call_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler") @NotNull Block_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler {
        @Generated
        void call_unlockWithTimeoutWithParamsExpectedValuesExpectedValueIntervalCompletionHandler(
                @Nullable NSError error);
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
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeAutoRelockTimeWithValue:expectedValueInterval:")
    public native void writeAttributeAutoRelockTimeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeAutoRelockTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeAutoRelockTimeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeDoorClosedEventsWithValue:expectedValueInterval:")
    public native void writeAttributeDoorClosedEventsWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeDoorClosedEventsWithValue:expectedValueInterval:params:")
    public native void writeAttributeDoorClosedEventsWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeDoorOpenEventsWithValue:expectedValueInterval:")
    public native void writeAttributeDoorOpenEventsWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeDoorOpenEventsWithValue:expectedValueInterval:params:")
    public native void writeAttributeDoorOpenEventsWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnableInsideStatusLEDWithValue:expectedValueInterval:")
    public native void writeAttributeEnableInsideStatusLEDWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnableInsideStatusLEDWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnableInsideStatusLEDWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnableLocalProgrammingWithValue:expectedValueInterval:")
    public native void writeAttributeEnableLocalProgrammingWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnableLocalProgrammingWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnableLocalProgrammingWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnableOneTouchLockingWithValue:expectedValueInterval:")
    public native void writeAttributeEnableOneTouchLockingWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnableOneTouchLockingWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnableOneTouchLockingWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnablePrivacyModeButtonWithValue:expectedValueInterval:")
    public native void writeAttributeEnablePrivacyModeButtonWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeEnablePrivacyModeButtonWithValue:expectedValueInterval:params:")
    public native void writeAttributeEnablePrivacyModeButtonWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeExpiringUserTimeoutWithValue:expectedValueInterval:")
    public native void writeAttributeExpiringUserTimeoutWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeExpiringUserTimeoutWithValue:expectedValueInterval:params:")
    public native void writeAttributeExpiringUserTimeoutWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLEDSettingsWithValue:expectedValueInterval:")
    public native void writeAttributeLEDSettingsWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLEDSettingsWithValue:expectedValueInterval:params:")
    public native void writeAttributeLEDSettingsWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLanguageWithValue:expectedValueInterval:")
    public native void writeAttributeLanguageWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLanguageWithValue:expectedValueInterval:params:")
    public native void writeAttributeLanguageWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLocalProgrammingFeaturesWithValue:expectedValueInterval:")
    public native void writeAttributeLocalProgrammingFeaturesWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeLocalProgrammingFeaturesWithValue:expectedValueInterval:params:")
    public native void writeAttributeLocalProgrammingFeaturesWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOpenPeriodWithValue:expectedValueInterval:")
    public native void writeAttributeOpenPeriodWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOpenPeriodWithValue:expectedValueInterval:params:")
    public native void writeAttributeOpenPeriodWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOperatingModeWithValue:expectedValueInterval:")
    public native void writeAttributeOperatingModeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeOperatingModeWithValue:expectedValueInterval:params:")
    public native void writeAttributeOperatingModeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRequirePINforRemoteOperationWithValue:expectedValueInterval:")
    public native void writeAttributeRequirePINforRemoteOperationWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeRequirePINforRemoteOperationWithValue:expectedValueInterval:params:")
    public native void writeAttributeRequirePINforRemoteOperationWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeSendPINOverTheAirWithValue:expectedValueInterval:")
    public native void writeAttributeSendPINOverTheAirWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeSendPINOverTheAirWithValue:expectedValueInterval:params:")
    public native void writeAttributeSendPINOverTheAirWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeSoundVolumeWithValue:expectedValueInterval:")
    public native void writeAttributeSoundVolumeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeSoundVolumeWithValue:expectedValueInterval:params:")
    public native void writeAttributeSoundVolumeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUserCodeTemporaryDisableTimeWithValue:expectedValueInterval:")
    public native void writeAttributeUserCodeTemporaryDisableTimeWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeUserCodeTemporaryDisableTimeWithValue:expectedValueInterval:params:")
    public native void writeAttributeUserCodeTemporaryDisableTimeWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeWrongCodeEntryLimitWithValue:expectedValueInterval:")
    public native void writeAttributeWrongCodeEntryLimitWithValueExpectedValueInterval(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs);

    /**
     * API-Since: 16.1
     */
    @Generated
    @Selector("writeAttributeWrongCodeEntryLimitWithValue:expectedValueInterval:params:")
    public native void writeAttributeWrongCodeEntryLimitWithValueExpectedValueIntervalParams(
            @NotNull NSDictionary<String, ?> dataValueDictionary, @NotNull NSNumber expectedValueIntervalMs,
            @Nullable MTRWriteParams params);
}