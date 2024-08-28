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
 * Cluster Electrical Measurement
 * 
 * Attributes related to the electrical properties of a device. This cluster is used by power outlets and other devices
 * that need to provide instantaneous data as opposed to metrology data which should be retrieved from the metering
 * cluster..
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterElectricalMeasurement extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterElectricalMeasurement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterElectricalMeasurement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterElectricalMeasurement allocWithZone(VoidPtr zone);

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

    /**
     * Command GetMeasurementProfileCommand
     * 
     * A function which retrieves an electricity measurement profile from the electricity measurement server for a
     * specific attribute Id requested.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getMeasurementProfileCommandWithParams:completion:")
    public native void getMeasurementProfileCommandWithParamsCompletion(
            @NotNull MTRElectricalMeasurementClusterGetMeasurementProfileCommandParams params,
            @ObjCBlock(name = "call_getMeasurementProfileCommandWithParamsCompletion") @NotNull Block_getMeasurementProfileCommandWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMeasurementProfileCommandWithParamsCompletion {
        @Generated
        void call_getMeasurementProfileCommandWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getMeasurementProfileCommandWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getMeasurementProfileCommandWithParams:completionHandler:")
    public native void getMeasurementProfileCommandWithParamsCompletionHandler(
            @NotNull MTRElectricalMeasurementClusterGetMeasurementProfileCommandParams params,
            @ObjCBlock(name = "call_getMeasurementProfileCommandWithParamsCompletionHandler") @NotNull Block_getMeasurementProfileCommandWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getMeasurementProfileCommandWithParamsCompletionHandler {
        @Generated
        void call_getMeasurementProfileCommandWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("getProfileInfoCommandWithCompletion:")
    public native void getProfileInfoCommandWithCompletion(
            @ObjCBlock(name = "call_getProfileInfoCommandWithCompletion") @NotNull Block_getProfileInfoCommandWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithCompletion {
        @Generated
        void call_getProfileInfoCommandWithCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getProfileInfoCommandWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("getProfileInfoCommandWithCompletionHandler:")
    public native void getProfileInfoCommandWithCompletionHandler(
            @ObjCBlock(name = "call_getProfileInfoCommandWithCompletionHandler") @NotNull Block_getProfileInfoCommandWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithCompletionHandler {
        @Generated
        void call_getProfileInfoCommandWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command GetProfileInfoCommand
     * 
     * A function which retrieves the power profiling information from the electrical measurement server.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("getProfileInfoCommandWithParams:completion:")
    public native void getProfileInfoCommandWithParamsCompletion(
            @Nullable MTRElectricalMeasurementClusterGetProfileInfoCommandParams params,
            @ObjCBlock(name = "call_getProfileInfoCommandWithParamsCompletion") @NotNull Block_getProfileInfoCommandWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithParamsCompletion {
        @Generated
        void call_getProfileInfoCommandWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use getProfileInfoCommandWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("getProfileInfoCommandWithParams:completionHandler:")
    public native void getProfileInfoCommandWithParamsCompletionHandler(
            @Nullable MTRElectricalMeasurementClusterGetProfileInfoCommandParams params,
            @ObjCBlock(name = "call_getProfileInfoCommandWithParamsCompletionHandler") @NotNull Block_getProfileInfoCommandWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getProfileInfoCommandWithParamsCompletionHandler {
        @Generated
        void call_getProfileInfoCommandWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseClusterElectricalMeasurement init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterElectricalMeasurement initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device,
            char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterElectricalMeasurement initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterElectricalMeasurement new_objc();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcActivePowerOverloadWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcActivePowerOverloadWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcActivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcActivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcActivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcActivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcActivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcActivePowerOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcActivePowerOverloadWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcActivePowerOverloadWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcActivePowerOverloadWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcActivePowerOverloadWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcActivePowerOverloadWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcActivePowerOverloadWithCompletion:")
    public native void readAttributeAcActivePowerOverloadWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcActivePowerOverloadWithCompletion") @NotNull Block_readAttributeAcActivePowerOverloadWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcActivePowerOverloadWithCompletion {
        @Generated
        void call_readAttributeAcActivePowerOverloadWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcActivePowerOverloadWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcActivePowerOverloadWithCompletionHandler:")
    public native void readAttributeAcActivePowerOverloadWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcActivePowerOverloadWithCompletionHandler") @NotNull Block_readAttributeAcActivePowerOverloadWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcActivePowerOverloadWithCompletionHandler {
        @Generated
        void call_readAttributeAcActivePowerOverloadWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcCurrentDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcCurrentDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcCurrentDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcCurrentDivisorWithCompletion:")
    public native void readAttributeAcCurrentDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcCurrentDivisorWithCompletion") @NotNull Block_readAttributeAcCurrentDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentDivisorWithCompletion {
        @Generated
        void call_readAttributeAcCurrentDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcCurrentDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcCurrentDivisorWithCompletionHandler:")
    public native void readAttributeAcCurrentDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcCurrentDivisorWithCompletionHandler") @NotNull Block_readAttributeAcCurrentDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentDivisorWithCompletionHandler {
        @Generated
        void call_readAttributeAcCurrentDivisorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcCurrentMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcCurrentMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcCurrentMultiplierWithCompletion:")
    public native void readAttributeAcCurrentMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcCurrentMultiplierWithCompletion") @NotNull Block_readAttributeAcCurrentMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentMultiplierWithCompletion {
        @Generated
        void call_readAttributeAcCurrentMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcCurrentMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcCurrentMultiplierWithCompletionHandler:")
    public native void readAttributeAcCurrentMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcCurrentMultiplierWithCompletionHandler") @NotNull Block_readAttributeAcCurrentMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeAcCurrentMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcCurrentOverloadWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcCurrentOverloadWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcCurrentOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcCurrentOverloadWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcCurrentOverloadWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcCurrentOverloadWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentOverloadWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcCurrentOverloadWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcCurrentOverloadWithCompletion:")
    public native void readAttributeAcCurrentOverloadWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcCurrentOverloadWithCompletion") @NotNull Block_readAttributeAcCurrentOverloadWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentOverloadWithCompletion {
        @Generated
        void call_readAttributeAcCurrentOverloadWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcCurrentOverloadWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcCurrentOverloadWithCompletionHandler:")
    public native void readAttributeAcCurrentOverloadWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcCurrentOverloadWithCompletionHandler") @NotNull Block_readAttributeAcCurrentOverloadWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcCurrentOverloadWithCompletionHandler {
        @Generated
        void call_readAttributeAcCurrentOverloadWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcFrequencyDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcFrequencyDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyDivisorWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcFrequencyDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcFrequencyDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyDivisorWithCompletion:")
    public native void readAttributeAcFrequencyDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcFrequencyDivisorWithCompletion") @NotNull Block_readAttributeAcFrequencyDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyDivisorWithCompletion {
        @Generated
        void call_readAttributeAcFrequencyDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyDivisorWithCompletionHandler:")
    public native void readAttributeAcFrequencyDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcFrequencyDivisorWithCompletionHandler") @NotNull Block_readAttributeAcFrequencyDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyDivisorWithCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyDivisorWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcFrequencyMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcFrequencyMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyMaxWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcFrequencyMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcFrequencyMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyMaxWithCompletion:")
    public native void readAttributeAcFrequencyMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcFrequencyMaxWithCompletion") @NotNull Block_readAttributeAcFrequencyMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMaxWithCompletion {
        @Generated
        void call_readAttributeAcFrequencyMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyMaxWithCompletionHandler:")
    public native void readAttributeAcFrequencyMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcFrequencyMaxWithCompletionHandler") @NotNull Block_readAttributeAcFrequencyMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMaxWithCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyMaxWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcFrequencyMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcFrequencyMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyMinWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcFrequencyMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcFrequencyMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyMinWithCompletion:")
    public native void readAttributeAcFrequencyMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcFrequencyMinWithCompletion") @NotNull Block_readAttributeAcFrequencyMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMinWithCompletion {
        @Generated
        void call_readAttributeAcFrequencyMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyMinWithCompletionHandler:")
    public native void readAttributeAcFrequencyMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcFrequencyMinWithCompletionHandler") @NotNull Block_readAttributeAcFrequencyMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMinWithCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyMinWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcFrequencyMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcFrequencyMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcFrequencyMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcFrequencyMultiplierWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyMultiplierWithCompletion:")
    public native void readAttributeAcFrequencyMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcFrequencyMultiplierWithCompletion") @NotNull Block_readAttributeAcFrequencyMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMultiplierWithCompletion {
        @Generated
        void call_readAttributeAcFrequencyMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyMultiplierWithCompletionHandler:")
    public native void readAttributeAcFrequencyMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcFrequencyMultiplierWithCompletionHandler") @NotNull Block_readAttributeAcFrequencyMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcFrequencyWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcFrequencyWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcFrequencyWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcFrequencyWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcFrequencyWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcFrequencyWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcFrequencyWithCompletion:")
    public native void readAttributeAcFrequencyWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcFrequencyWithCompletion") @NotNull Block_readAttributeAcFrequencyWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyWithCompletion {
        @Generated
        void call_readAttributeAcFrequencyWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcFrequencyWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcFrequencyWithCompletionHandler:")
    public native void readAttributeAcFrequencyWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcFrequencyWithCompletionHandler") @NotNull Block_readAttributeAcFrequencyWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcFrequencyWithCompletionHandler {
        @Generated
        void call_readAttributeAcFrequencyWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcOverloadAlarmsMaskWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcOverloadAlarmsMaskWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcOverloadAlarmsMaskWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcOverloadAlarmsMaskWithCompletion:")
    public native void readAttributeAcOverloadAlarmsMaskWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcOverloadAlarmsMaskWithCompletion") @NotNull Block_readAttributeAcOverloadAlarmsMaskWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcOverloadAlarmsMaskWithCompletion {
        @Generated
        void call_readAttributeAcOverloadAlarmsMaskWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcOverloadAlarmsMaskWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcOverloadAlarmsMaskWithCompletionHandler:")
    public native void readAttributeAcOverloadAlarmsMaskWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcOverloadAlarmsMaskWithCompletionHandler") @NotNull Block_readAttributeAcOverloadAlarmsMaskWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcOverloadAlarmsMaskWithCompletionHandler {
        @Generated
        void call_readAttributeAcOverloadAlarmsMaskWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcPowerDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcPowerDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcPowerDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcPowerDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcPowerDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcPowerDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcPowerDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcPowerDivisorWithCompletion:")
    public native void readAttributeAcPowerDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcPowerDivisorWithCompletion") @NotNull Block_readAttributeAcPowerDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerDivisorWithCompletion {
        @Generated
        void call_readAttributeAcPowerDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcPowerDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcPowerDivisorWithCompletionHandler:")
    public native void readAttributeAcPowerDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcPowerDivisorWithCompletionHandler") @NotNull Block_readAttributeAcPowerDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerDivisorWithCompletionHandler {
        @Generated
        void call_readAttributeAcPowerDivisorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcPowerMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcPowerMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcPowerMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcPowerMultiplierWithCompletion:")
    public native void readAttributeAcPowerMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcPowerMultiplierWithCompletion") @NotNull Block_readAttributeAcPowerMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerMultiplierWithCompletion {
        @Generated
        void call_readAttributeAcPowerMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcPowerMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcPowerMultiplierWithCompletionHandler:")
    public native void readAttributeAcPowerMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcPowerMultiplierWithCompletionHandler") @NotNull Block_readAttributeAcPowerMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcPowerMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeAcPowerMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcReactivePowerOverloadWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcReactivePowerOverloadWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcReactivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcReactivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcReactivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcReactivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcReactivePowerOverloadWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcReactivePowerOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcReactivePowerOverloadWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcReactivePowerOverloadWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcReactivePowerOverloadWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcReactivePowerOverloadWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcReactivePowerOverloadWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcReactivePowerOverloadWithCompletion:")
    public native void readAttributeAcReactivePowerOverloadWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcReactivePowerOverloadWithCompletion") @NotNull Block_readAttributeAcReactivePowerOverloadWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcReactivePowerOverloadWithCompletion {
        @Generated
        void call_readAttributeAcReactivePowerOverloadWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcReactivePowerOverloadWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcReactivePowerOverloadWithCompletionHandler:")
    public native void readAttributeAcReactivePowerOverloadWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcReactivePowerOverloadWithCompletionHandler") @NotNull Block_readAttributeAcReactivePowerOverloadWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcReactivePowerOverloadWithCompletionHandler {
        @Generated
        void call_readAttributeAcReactivePowerOverloadWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcVoltageDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcVoltageDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcVoltageDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcVoltageDivisorWithCompletion:")
    public native void readAttributeAcVoltageDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcVoltageDivisorWithCompletion") @NotNull Block_readAttributeAcVoltageDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageDivisorWithCompletion {
        @Generated
        void call_readAttributeAcVoltageDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcVoltageDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcVoltageDivisorWithCompletionHandler:")
    public native void readAttributeAcVoltageDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcVoltageDivisorWithCompletionHandler") @NotNull Block_readAttributeAcVoltageDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageDivisorWithCompletionHandler {
        @Generated
        void call_readAttributeAcVoltageDivisorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcVoltageMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcVoltageMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcVoltageMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcVoltageMultiplierWithCompletion:")
    public native void readAttributeAcVoltageMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcVoltageMultiplierWithCompletion") @NotNull Block_readAttributeAcVoltageMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageMultiplierWithCompletion {
        @Generated
        void call_readAttributeAcVoltageMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcVoltageMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcVoltageMultiplierWithCompletionHandler:")
    public native void readAttributeAcVoltageMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcVoltageMultiplierWithCompletionHandler") @NotNull Block_readAttributeAcVoltageMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeAcVoltageMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcVoltageOverloadWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcVoltageOverloadWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAcVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAcVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAcVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcVoltageOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcVoltageOverloadWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcVoltageOverloadWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAcVoltageOverloadWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageOverloadWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAcVoltageOverloadWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAcVoltageOverloadWithCompletion:")
    public native void readAttributeAcVoltageOverloadWithCompletion(
            @ObjCBlock(name = "call_readAttributeAcVoltageOverloadWithCompletion") @NotNull Block_readAttributeAcVoltageOverloadWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageOverloadWithCompletion {
        @Generated
        void call_readAttributeAcVoltageOverloadWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAcVoltageOverloadWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAcVoltageOverloadWithCompletionHandler:")
    public native void readAttributeAcVoltageOverloadWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAcVoltageOverloadWithCompletionHandler") @NotNull Block_readAttributeAcVoltageOverloadWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAcVoltageOverloadWithCompletionHandler {
        @Generated
        void call_readAttributeAcVoltageOverloadWithCompletionHandler(@Nullable NSNumber value,
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
     * Deprecated-Message: Please use readAttributeActiveCurrentPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveCurrentPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveCurrentPhaseBWithCompletion:")
    public native void readAttributeActiveCurrentPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseBWithCompletion") @NotNull Block_readAttributeActiveCurrentPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseBWithCompletion {
        @Generated
        void call_readAttributeActiveCurrentPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActiveCurrentPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveCurrentPhaseBWithCompletionHandler:")
    public native void readAttributeActiveCurrentPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseBWithCompletionHandler") @NotNull Block_readAttributeActiveCurrentPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeActiveCurrentPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActiveCurrentPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveCurrentPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveCurrentPhaseCWithCompletion:")
    public native void readAttributeActiveCurrentPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseCWithCompletion") @NotNull Block_readAttributeActiveCurrentPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseCWithCompletion {
        @Generated
        void call_readAttributeActiveCurrentPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActiveCurrentPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveCurrentPhaseCWithCompletionHandler:")
    public native void readAttributeActiveCurrentPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActiveCurrentPhaseCWithCompletionHandler") @NotNull Block_readAttributeActiveCurrentPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveCurrentPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeActiveCurrentPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMaxPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMaxPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMaxPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMaxPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerMaxPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerMaxPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMaxPhaseBWithCompletion:")
    public native void readAttributeActivePowerMaxPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseBWithCompletion") @NotNull Block_readAttributeActivePowerMaxPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseBWithCompletion {
        @Generated
        void call_readAttributeActivePowerMaxPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMaxPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMaxPhaseBWithCompletionHandler:")
    public native void readAttributeActivePowerMaxPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseBWithCompletionHandler") @NotNull Block_readAttributeActivePowerMaxPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMaxPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMaxPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMaxPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMaxPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMaxPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerMaxPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerMaxPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMaxPhaseCWithCompletion:")
    public native void readAttributeActivePowerMaxPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseCWithCompletion") @NotNull Block_readAttributeActivePowerMaxPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseCWithCompletion {
        @Generated
        void call_readAttributeActivePowerMaxPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMaxPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMaxPhaseCWithCompletionHandler:")
    public native void readAttributeActivePowerMaxPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMaxPhaseCWithCompletionHandler") @NotNull Block_readAttributeActivePowerMaxPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMaxPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMaxWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMaxWithCompletion:")
    public native void readAttributeActivePowerMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerMaxWithCompletion") @NotNull Block_readAttributeActivePowerMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxWithCompletion {
        @Generated
        void call_readAttributeActivePowerMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMaxWithCompletionHandler:")
    public native void readAttributeActivePowerMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMaxWithCompletionHandler") @NotNull Block_readAttributeActivePowerMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMaxWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMaxWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMinPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMinPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMinPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMinPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerMinPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerMinPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMinPhaseBWithCompletion:")
    public native void readAttributeActivePowerMinPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseBWithCompletion") @NotNull Block_readAttributeActivePowerMinPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseBWithCompletion {
        @Generated
        void call_readAttributeActivePowerMinPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMinPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMinPhaseBWithCompletionHandler:")
    public native void readAttributeActivePowerMinPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseBWithCompletionHandler") @NotNull Block_readAttributeActivePowerMinPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMinPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMinPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMinPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMinPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMinPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerMinPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerMinPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMinPhaseCWithCompletion:")
    public native void readAttributeActivePowerMinPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseCWithCompletion") @NotNull Block_readAttributeActivePowerMinPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseCWithCompletion {
        @Generated
        void call_readAttributeActivePowerMinPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMinPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMinPhaseCWithCompletionHandler:")
    public native void readAttributeActivePowerMinPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMinPhaseCWithCompletionHandler") @NotNull Block_readAttributeActivePowerMinPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMinPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMinWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerMinWithCompletion:")
    public native void readAttributeActivePowerMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerMinWithCompletion") @NotNull Block_readAttributeActivePowerMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinWithCompletion {
        @Generated
        void call_readAttributeActivePowerMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerMinWithCompletionHandler:")
    public native void readAttributeActivePowerMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerMinWithCompletionHandler") @NotNull Block_readAttributeActivePowerMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerMinWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerMinWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerPhaseBWithCompletion:")
    public native void readAttributeActivePowerPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseBWithCompletion") @NotNull Block_readAttributeActivePowerPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseBWithCompletion {
        @Generated
        void call_readAttributeActivePowerPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerPhaseBWithCompletionHandler:")
    public native void readAttributeActivePowerPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseBWithCompletionHandler") @NotNull Block_readAttributeActivePowerPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerPhaseCWithCompletion:")
    public native void readAttributeActivePowerPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseCWithCompletion") @NotNull Block_readAttributeActivePowerPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseCWithCompletion {
        @Generated
        void call_readAttributeActivePowerPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerPhaseCWithCompletionHandler:")
    public native void readAttributeActivePowerPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerPhaseCWithCompletionHandler") @NotNull Block_readAttributeActivePowerPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActivePowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActivePowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActivePowerWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActivePowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActivePowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActivePowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActivePowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActivePowerWithCompletion:")
    public native void readAttributeActivePowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeActivePowerWithCompletion") @NotNull Block_readAttributeActivePowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerWithCompletion {
        @Generated
        void call_readAttributeActivePowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActivePowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActivePowerWithCompletionHandler:")
    public native void readAttributeActivePowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActivePowerWithCompletionHandler") @NotNull Block_readAttributeActivePowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActivePowerWithCompletionHandler {
        @Generated
        void call_readAttributeActivePowerWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeApparentPowerPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeApparentPowerPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeApparentPowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeApparentPowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeApparentPowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeApparentPowerPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentPowerPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeApparentPowerPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeApparentPowerPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeApparentPowerPhaseBWithCompletion:")
    public native void readAttributeApparentPowerPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseBWithCompletion") @NotNull Block_readAttributeApparentPowerPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseBWithCompletion {
        @Generated
        void call_readAttributeApparentPowerPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeApparentPowerPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeApparentPowerPhaseBWithCompletionHandler:")
    public native void readAttributeApparentPowerPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseBWithCompletionHandler") @NotNull Block_readAttributeApparentPowerPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeApparentPowerPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeApparentPowerPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeApparentPowerPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeApparentPowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeApparentPowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeApparentPowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeApparentPowerPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentPowerPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeApparentPowerPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeApparentPowerPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeApparentPowerPhaseCWithCompletion:")
    public native void readAttributeApparentPowerPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseCWithCompletion") @NotNull Block_readAttributeApparentPowerPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseCWithCompletion {
        @Generated
        void call_readAttributeApparentPowerPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeApparentPowerPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeApparentPowerPhaseCWithCompletionHandler:")
    public native void readAttributeApparentPowerPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeApparentPowerPhaseCWithCompletionHandler") @NotNull Block_readAttributeApparentPowerPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeApparentPowerPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeApparentPowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeApparentPowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeApparentPowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeApparentPowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeApparentPowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeApparentPowerWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeApparentPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApparentPowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeApparentPowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeApparentPowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeApparentPowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeApparentPowerWithCompletion:")
    public native void readAttributeApparentPowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeApparentPowerWithCompletion") @NotNull Block_readAttributeApparentPowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerWithCompletion {
        @Generated
        void call_readAttributeApparentPowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeApparentPowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeApparentPowerWithCompletionHandler:")
    public native void readAttributeApparentPowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeApparentPowerWithCompletionHandler") @NotNull Block_readAttributeApparentPowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApparentPowerWithCompletionHandler {
        @Generated
        void call_readAttributeApparentPowerWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use
     * readAttributeAverageRmsOverVoltageCounterPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsOverVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsOverVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion:")
    public native void readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletionHandler:")
    public native void readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletionHandler") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeAverageRmsOverVoltageCounterPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsOverVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsOverVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion:")
    public native void readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletionHandler:")
    public native void readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletionHandler") @NotNull Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsOverVoltageCounterPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsOverVoltageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsOverVoltageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsOverVoltageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsOverVoltageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsOverVoltageWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsOverVoltageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsOverVoltageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsOverVoltageWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsOverVoltageWithCompletion:")
    public native void readAttributeAverageRmsOverVoltageWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageWithCompletion") @NotNull Block_readAttributeAverageRmsOverVoltageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageWithCompletion {
        @Generated
        void call_readAttributeAverageRmsOverVoltageWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsOverVoltageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsOverVoltageWithCompletionHandler:")
    public native void readAttributeAverageRmsOverVoltageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsOverVoltageWithCompletionHandler") @NotNull Block_readAttributeAverageRmsOverVoltageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsOverVoltageWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsOverVoltageWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeAverageRmsUnderVoltageCounterPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsUnderVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletionHandler:")
    public native void readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeAverageRmsUnderVoltageCounterPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsUnderVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletionHandler:")
    public native void readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeAverageRmsUnderVoltageCounterWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageCounterWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsUnderVoltageCounterWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltageCounterWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageCounterWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltageCounterWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterWithCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterWithCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsUnderVoltageCounterWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageCounterWithCompletionHandler:")
    public native void readAttributeAverageRmsUnderVoltageCounterWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageCounterWithCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageCounterWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageCounterWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageCounterWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsUnderVoltageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsUnderVoltageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsUnderVoltageWithCompletion:")
    public native void readAttributeAverageRmsUnderVoltageWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageWithCompletion") @NotNull Block_readAttributeAverageRmsUnderVoltageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageWithCompletion {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsUnderVoltageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsUnderVoltageWithCompletionHandler:")
    public native void readAttributeAverageRmsUnderVoltageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsUnderVoltageWithCompletionHandler") @NotNull Block_readAttributeAverageRmsUnderVoltageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsUnderVoltageWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsUnderVoltageWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletionHandler:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletionHandler") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletionHandler:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletionHandler") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeAverageRmsVoltageMeasurementPeriodWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAverageRmsVoltageMeasurementPeriodWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion(
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAverageRmsVoltageMeasurementPeriodWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAverageRmsVoltageMeasurementPeriodWithCompletionHandler:")
    public native void readAttributeAverageRmsVoltageMeasurementPeriodWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletionHandler") @NotNull Block_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletionHandler {
        @Generated
        void call_readAttributeAverageRmsVoltageMeasurementPeriodWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeCurrentOverloadWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentOverloadWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentOverloadWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentOverloadWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentOverloadWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentOverloadWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentOverloadWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentOverloadWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentOverloadWithCompletion:")
    public native void readAttributeCurrentOverloadWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentOverloadWithCompletion") @NotNull Block_readAttributeCurrentOverloadWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentOverloadWithCompletion {
        @Generated
        void call_readAttributeCurrentOverloadWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentOverloadWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentOverloadWithCompletionHandler:")
    public native void readAttributeCurrentOverloadWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentOverloadWithCompletionHandler") @NotNull Block_readAttributeCurrentOverloadWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentOverloadWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentOverloadWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentDivisorWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcCurrentDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentDivisorWithCompletion:")
    public native void readAttributeDcCurrentDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcCurrentDivisorWithCompletion") @NotNull Block_readAttributeDcCurrentDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentDivisorWithCompletion {
        @Generated
        void call_readAttributeDcCurrentDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentDivisorWithCompletionHandler:")
    public native void readAttributeDcCurrentDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcCurrentDivisorWithCompletionHandler") @NotNull Block_readAttributeDcCurrentDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentDivisorWithCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentDivisorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcCurrentMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcCurrentMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentMaxWithCompletion:")
    public native void readAttributeDcCurrentMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcCurrentMaxWithCompletion") @NotNull Block_readAttributeDcCurrentMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMaxWithCompletion {
        @Generated
        void call_readAttributeDcCurrentMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentMaxWithCompletionHandler:")
    public native void readAttributeDcCurrentMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcCurrentMaxWithCompletionHandler") @NotNull Block_readAttributeDcCurrentMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMaxWithCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentMaxWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcCurrentMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcCurrentMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentMinWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcCurrentMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcCurrentMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentMinWithCompletion:")
    public native void readAttributeDcCurrentMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcCurrentMinWithCompletion") @NotNull Block_readAttributeDcCurrentMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMinWithCompletion {
        @Generated
        void call_readAttributeDcCurrentMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentMinWithCompletionHandler:")
    public native void readAttributeDcCurrentMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcCurrentMinWithCompletionHandler") @NotNull Block_readAttributeDcCurrentMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMinWithCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentMinWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentMultiplierWithCompletion:")
    public native void readAttributeDcCurrentMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcCurrentMultiplierWithCompletion") @NotNull Block_readAttributeDcCurrentMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMultiplierWithCompletion {
        @Generated
        void call_readAttributeDcCurrentMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentMultiplierWithCompletionHandler:")
    public native void readAttributeDcCurrentMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcCurrentMultiplierWithCompletionHandler") @NotNull Block_readAttributeDcCurrentMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcCurrentWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcCurrentWithCompletion:")
    public native void readAttributeDcCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcCurrentWithCompletion") @NotNull Block_readAttributeDcCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentWithCompletion {
        @Generated
        void call_readAttributeDcCurrentWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcCurrentWithCompletionHandler:")
    public native void readAttributeDcCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcCurrentWithCompletionHandler") @NotNull Block_readAttributeDcCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeDcCurrentWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcPowerDivisorWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcPowerDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcPowerDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerDivisorWithCompletion:")
    public native void readAttributeDcPowerDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcPowerDivisorWithCompletion") @NotNull Block_readAttributeDcPowerDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerDivisorWithCompletion {
        @Generated
        void call_readAttributeDcPowerDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerDivisorWithCompletionHandler:")
    public native void readAttributeDcPowerDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcPowerDivisorWithCompletionHandler") @NotNull Block_readAttributeDcPowerDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerDivisorWithCompletionHandler {
        @Generated
        void call_readAttributeDcPowerDivisorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcPowerMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcPowerMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcPowerMaxWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcPowerMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcPowerMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerMaxWithCompletion:")
    public native void readAttributeDcPowerMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcPowerMaxWithCompletion") @NotNull Block_readAttributeDcPowerMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMaxWithCompletion {
        @Generated
        void call_readAttributeDcPowerMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerMaxWithCompletionHandler:")
    public native void readAttributeDcPowerMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcPowerMaxWithCompletionHandler") @NotNull Block_readAttributeDcPowerMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMaxWithCompletionHandler {
        @Generated
        void call_readAttributeDcPowerMaxWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcPowerMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcPowerMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcPowerMinWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcPowerMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcPowerMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerMinWithCompletion:")
    public native void readAttributeDcPowerMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcPowerMinWithCompletion") @NotNull Block_readAttributeDcPowerMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMinWithCompletion {
        @Generated
        void call_readAttributeDcPowerMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerMinWithCompletionHandler:")
    public native void readAttributeDcPowerMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcPowerMinWithCompletionHandler") @NotNull Block_readAttributeDcPowerMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMinWithCompletionHandler {
        @Generated
        void call_readAttributeDcPowerMinWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcPowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcPowerMultiplierWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerMultiplierWithCompletion:")
    public native void readAttributeDcPowerMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcPowerMultiplierWithCompletion") @NotNull Block_readAttributeDcPowerMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMultiplierWithCompletion {
        @Generated
        void call_readAttributeDcPowerMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerMultiplierWithCompletionHandler:")
    public native void readAttributeDcPowerMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcPowerMultiplierWithCompletionHandler") @NotNull Block_readAttributeDcPowerMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeDcPowerMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcPowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcPowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcPowerWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcPowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcPowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcPowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcPowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcPowerWithCompletion:")
    public native void readAttributeDcPowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcPowerWithCompletion") @NotNull Block_readAttributeDcPowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerWithCompletion {
        @Generated
        void call_readAttributeDcPowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcPowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcPowerWithCompletionHandler:")
    public native void readAttributeDcPowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcPowerWithCompletionHandler") @NotNull Block_readAttributeDcPowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcPowerWithCompletionHandler {
        @Generated
        void call_readAttributeDcPowerWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageDivisorWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcVoltageDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageDivisorWithCompletion:")
    public native void readAttributeDcVoltageDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcVoltageDivisorWithCompletion") @NotNull Block_readAttributeDcVoltageDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageDivisorWithCompletion {
        @Generated
        void call_readAttributeDcVoltageDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageDivisorWithCompletionHandler:")
    public native void readAttributeDcVoltageDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcVoltageDivisorWithCompletionHandler") @NotNull Block_readAttributeDcVoltageDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageDivisorWithCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageDivisorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcVoltageMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcVoltageMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageMaxWithCompletion:")
    public native void readAttributeDcVoltageMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcVoltageMaxWithCompletion") @NotNull Block_readAttributeDcVoltageMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMaxWithCompletion {
        @Generated
        void call_readAttributeDcVoltageMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageMaxWithCompletionHandler:")
    public native void readAttributeDcVoltageMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcVoltageMaxWithCompletionHandler") @NotNull Block_readAttributeDcVoltageMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMaxWithCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageMaxWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcVoltageMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcVoltageMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageMinWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcVoltageMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcVoltageMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageMinWithCompletion:")
    public native void readAttributeDcVoltageMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcVoltageMinWithCompletion") @NotNull Block_readAttributeDcVoltageMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMinWithCompletion {
        @Generated
        void call_readAttributeDcVoltageMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageMinWithCompletionHandler:")
    public native void readAttributeDcVoltageMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcVoltageMinWithCompletionHandler") @NotNull Block_readAttributeDcVoltageMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMinWithCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageMinWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcVoltageMultiplierWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageMultiplierWithCompletion:")
    public native void readAttributeDcVoltageMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcVoltageMultiplierWithCompletion") @NotNull Block_readAttributeDcVoltageMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMultiplierWithCompletion {
        @Generated
        void call_readAttributeDcVoltageMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageMultiplierWithCompletionHandler:")
    public native void readAttributeDcVoltageMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcVoltageMultiplierWithCompletionHandler") @NotNull Block_readAttributeDcVoltageMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDcVoltageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDcVoltageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDcVoltageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDcVoltageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDcVoltageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDcVoltageWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDcVoltageWithCompletion:")
    public native void readAttributeDcVoltageWithCompletion(
            @ObjCBlock(name = "call_readAttributeDcVoltageWithCompletion") @NotNull Block_readAttributeDcVoltageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageWithCompletion {
        @Generated
        void call_readAttributeDcVoltageWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDcVoltageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDcVoltageWithCompletionHandler:")
    public native void readAttributeDcVoltageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDcVoltageWithCompletionHandler") @NotNull Block_readAttributeDcVoltageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDcVoltageWithCompletionHandler {
        @Generated
        void call_readAttributeDcVoltageWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * readAttributeHarmonicCurrentMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeHarmonicCurrentMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeHarmonicCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeHarmonicCurrentMultiplierWithCompletion:")
    public native void readAttributeHarmonicCurrentMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributeHarmonicCurrentMultiplierWithCompletion") @NotNull Block_readAttributeHarmonicCurrentMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHarmonicCurrentMultiplierWithCompletion {
        @Generated
        void call_readAttributeHarmonicCurrentMultiplierWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeHarmonicCurrentMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeHarmonicCurrentMultiplierWithCompletionHandler:")
    public native void readAttributeHarmonicCurrentMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeHarmonicCurrentMultiplierWithCompletionHandler") @NotNull Block_readAttributeHarmonicCurrentMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeHarmonicCurrentMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributeHarmonicCurrentMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeInstantaneousActiveCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousActiveCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstantaneousActiveCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousActiveCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstantaneousActiveCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousActiveCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousActiveCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousActiveCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousActiveCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousActiveCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstantaneousActiveCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousActiveCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstantaneousActiveCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousActiveCurrentWithCompletion:")
    public native void readAttributeInstantaneousActiveCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstantaneousActiveCurrentWithCompletion") @NotNull Block_readAttributeInstantaneousActiveCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousActiveCurrentWithCompletion {
        @Generated
        void call_readAttributeInstantaneousActiveCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousActiveCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousActiveCurrentWithCompletionHandler:")
    public native void readAttributeInstantaneousActiveCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstantaneousActiveCurrentWithCompletionHandler") @NotNull Block_readAttributeInstantaneousActiveCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousActiveCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousActiveCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousLineCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousLineCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstantaneousLineCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousLineCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstantaneousLineCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousLineCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousLineCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousLineCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousLineCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousLineCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstantaneousLineCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousLineCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstantaneousLineCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousLineCurrentWithCompletion:")
    public native void readAttributeInstantaneousLineCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstantaneousLineCurrentWithCompletion") @NotNull Block_readAttributeInstantaneousLineCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousLineCurrentWithCompletion {
        @Generated
        void call_readAttributeInstantaneousLineCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousLineCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousLineCurrentWithCompletionHandler:")
    public native void readAttributeInstantaneousLineCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstantaneousLineCurrentWithCompletionHandler") @NotNull Block_readAttributeInstantaneousLineCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousLineCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousLineCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousPowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousPowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstantaneousPowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousPowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstantaneousPowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousPowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousPowerWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousPowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousPowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstantaneousPowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousPowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstantaneousPowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousPowerWithCompletion:")
    public native void readAttributeInstantaneousPowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstantaneousPowerWithCompletion") @NotNull Block_readAttributeInstantaneousPowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousPowerWithCompletion {
        @Generated
        void call_readAttributeInstantaneousPowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousPowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousPowerWithCompletionHandler:")
    public native void readAttributeInstantaneousPowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstantaneousPowerWithCompletionHandler") @NotNull Block_readAttributeInstantaneousPowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousPowerWithCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousPowerWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeInstantaneousReactiveCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousReactiveCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstantaneousReactiveCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousReactiveCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstantaneousReactiveCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousReactiveCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousReactiveCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousReactiveCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousReactiveCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousReactiveCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstantaneousReactiveCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousReactiveCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstantaneousReactiveCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousReactiveCurrentWithCompletion:")
    public native void readAttributeInstantaneousReactiveCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstantaneousReactiveCurrentWithCompletion") @NotNull Block_readAttributeInstantaneousReactiveCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousReactiveCurrentWithCompletion {
        @Generated
        void call_readAttributeInstantaneousReactiveCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousReactiveCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousReactiveCurrentWithCompletionHandler:")
    public native void readAttributeInstantaneousReactiveCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstantaneousReactiveCurrentWithCompletionHandler") @NotNull Block_readAttributeInstantaneousReactiveCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousReactiveCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousReactiveCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousVoltageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousVoltageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstantaneousVoltageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousVoltageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstantaneousVoltageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousVoltageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousVoltageWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstantaneousVoltageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstantaneousVoltageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstantaneousVoltageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousVoltageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstantaneousVoltageWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstantaneousVoltageWithCompletion:")
    public native void readAttributeInstantaneousVoltageWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstantaneousVoltageWithCompletion") @NotNull Block_readAttributeInstantaneousVoltageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousVoltageWithCompletion {
        @Generated
        void call_readAttributeInstantaneousVoltageWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstantaneousVoltageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstantaneousVoltageWithCompletionHandler:")
    public native void readAttributeInstantaneousVoltageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstantaneousVoltageWithCompletionHandler") @NotNull Block_readAttributeInstantaneousVoltageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstantaneousVoltageWithCompletionHandler {
        @Generated
        void call_readAttributeInstantaneousVoltageWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLineCurrentPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLineCurrentPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLineCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLineCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLineCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLineCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLineCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLineCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLineCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLineCurrentPhaseBWithCompletion:")
    public native void readAttributeLineCurrentPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseBWithCompletion") @NotNull Block_readAttributeLineCurrentPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseBWithCompletion {
        @Generated
        void call_readAttributeLineCurrentPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLineCurrentPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLineCurrentPhaseBWithCompletionHandler:")
    public native void readAttributeLineCurrentPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseBWithCompletionHandler") @NotNull Block_readAttributeLineCurrentPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeLineCurrentPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLineCurrentPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLineCurrentPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLineCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLineCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLineCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLineCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLineCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLineCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLineCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLineCurrentPhaseCWithCompletion:")
    public native void readAttributeLineCurrentPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseCWithCompletion") @NotNull Block_readAttributeLineCurrentPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseCWithCompletion {
        @Generated
        void call_readAttributeLineCurrentPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLineCurrentPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLineCurrentPhaseCWithCompletionHandler:")
    public native void readAttributeLineCurrentPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLineCurrentPhaseCWithCompletionHandler") @NotNull Block_readAttributeLineCurrentPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLineCurrentPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeLineCurrentPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasured11thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured11thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasured11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasured11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasured11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured11thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasured11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasured11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured11thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured11thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasured11thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasured11thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured11thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasured11thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasured11thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured11thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasured11thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasured11thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasured11thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured11thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasured11thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasured1stHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured1stHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasured1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasured1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasured1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured1stHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasured1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasured1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured1stHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured1stHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasured1stHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasured1stHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured1stHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasured1stHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasured1stHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured1stHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasured1stHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasured1stHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasured1stHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured1stHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasured1stHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasured3rdHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured3rdHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasured3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasured3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasured3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured3rdHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasured3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasured3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured3rdHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured3rdHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasured3rdHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasured3rdHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured3rdHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasured3rdHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasured3rdHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured3rdHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasured3rdHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasured3rdHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasured3rdHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured3rdHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasured3rdHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasured5thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured5thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasured5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasured5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasured5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured5thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasured5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasured5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured5thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured5thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasured5thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasured5thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured5thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasured5thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasured5thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured5thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasured5thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasured5thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasured5thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured5thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasured5thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasured7thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured7thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasured7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasured7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasured7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured7thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasured7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasured7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured7thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured7thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasured7thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasured7thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured7thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasured7thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasured7thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured7thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasured7thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasured7thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasured7thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured7thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasured7thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasured9thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured9thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasured9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasured9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasured9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured9thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasured9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasured9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasured9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasured9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasured9thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasured9thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasured9thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasured9thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured9thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasured9thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasured9thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasured9thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasured9thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasured9thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasured9thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasured9thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasured9thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasuredPhase11thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase11thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasuredPhase11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasuredPhase11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase11thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase11thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasuredPhase11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasuredPhase11thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasuredPhase11thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase11thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasuredPhase11thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase11thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasuredPhase1stHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase1stHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasuredPhase1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasuredPhase1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase1stHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase1stHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasuredPhase1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasuredPhase1stHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasuredPhase1stHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase1stHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasuredPhase1stHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase1stHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasuredPhase3rdHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase3rdHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasuredPhase3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase3rdHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase3rdHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasuredPhase3rdHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase3rdHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasuredPhase5thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase5thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasuredPhase5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasuredPhase5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase5thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase5thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasuredPhase5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasuredPhase5thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasuredPhase5thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase5thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasuredPhase5thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase5thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasuredPhase7thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase7thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasuredPhase7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasuredPhase7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase7thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase7thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasuredPhase7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasuredPhase7thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasuredPhase7thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase7thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasuredPhase7thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase7thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeMeasuredPhase9thHarmonicCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase9thHarmonicCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasuredPhase9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasuredPhase9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase9thHarmonicCurrentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase9thHarmonicCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasuredPhase9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasuredPhase9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasuredPhase9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasuredPhase9thHarmonicCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion:")
    public native void readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion") @NotNull Block_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion {
        @Generated
        void call_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasuredPhase9thHarmonicCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasuredPhase9thHarmonicCurrentWithCompletionHandler:")
    public native void readAttributeMeasuredPhase9thHarmonicCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletionHandler") @NotNull Block_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeMeasuredPhase9thHarmonicCurrentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasurementTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasurementTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeasurementTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasurementTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeasurementTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasurementTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeasurementTypeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasurementTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeasurementTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeasurementTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeasurementTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasurementTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeasurementTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeasurementTypeWithCompletion:")
    public native void readAttributeMeasurementTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeasurementTypeWithCompletion") @NotNull Block_readAttributeMeasurementTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasurementTypeWithCompletion {
        @Generated
        void call_readAttributeMeasurementTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeasurementTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeasurementTypeWithCompletionHandler:")
    public native void readAttributeMeasurementTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeasurementTypeWithCompletionHandler") @NotNull Block_readAttributeMeasurementTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeasurementTypeWithCompletionHandler {
        @Generated
        void call_readAttributeMeasurementTypeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNeutralCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNeutralCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNeutralCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNeutralCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNeutralCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeutralCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNeutralCurrentWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNeutralCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNeutralCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNeutralCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNeutralCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeutralCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNeutralCurrentWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNeutralCurrentWithCompletion:")
    public native void readAttributeNeutralCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeNeutralCurrentWithCompletion") @NotNull Block_readAttributeNeutralCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeutralCurrentWithCompletion {
        @Generated
        void call_readAttributeNeutralCurrentWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNeutralCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNeutralCurrentWithCompletionHandler:")
    public native void readAttributeNeutralCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNeutralCurrentWithCompletionHandler") @NotNull Block_readAttributeNeutralCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeutralCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeNeutralCurrentWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOverloadAlarmsMaskWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOverloadAlarmsMaskWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOverloadAlarmsMaskWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOverloadAlarmsMaskWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOverloadAlarmsMaskWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOverloadAlarmsMaskWithCompletion:")
    public native void readAttributeOverloadAlarmsMaskWithCompletion(
            @ObjCBlock(name = "call_readAttributeOverloadAlarmsMaskWithCompletion") @NotNull Block_readAttributeOverloadAlarmsMaskWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverloadAlarmsMaskWithCompletion {
        @Generated
        void call_readAttributeOverloadAlarmsMaskWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOverloadAlarmsMaskWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOverloadAlarmsMaskWithCompletionHandler:")
    public native void readAttributeOverloadAlarmsMaskWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOverloadAlarmsMaskWithCompletionHandler") @NotNull Block_readAttributeOverloadAlarmsMaskWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverloadAlarmsMaskWithCompletionHandler {
        @Generated
        void call_readAttributeOverloadAlarmsMaskWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributePhaseHarmonicCurrentMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhaseHarmonicCurrentMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhaseHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhaseHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhaseHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhaseHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhaseHarmonicCurrentMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhaseHarmonicCurrentMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhaseHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhaseHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhaseHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhaseHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhaseHarmonicCurrentMultiplierWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhaseHarmonicCurrentMultiplierWithCompletion:")
    public native void readAttributePhaseHarmonicCurrentMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributePhaseHarmonicCurrentMultiplierWithCompletion") @NotNull Block_readAttributePhaseHarmonicCurrentMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhaseHarmonicCurrentMultiplierWithCompletion {
        @Generated
        void call_readAttributePhaseHarmonicCurrentMultiplierWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhaseHarmonicCurrentMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhaseHarmonicCurrentMultiplierWithCompletionHandler:")
    public native void readAttributePhaseHarmonicCurrentMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhaseHarmonicCurrentMultiplierWithCompletionHandler") @NotNull Block_readAttributePhaseHarmonicCurrentMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhaseHarmonicCurrentMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributePhaseHarmonicCurrentMultiplierWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerDivisorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerDivisorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePowerDivisorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerDivisorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePowerDivisorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerDivisorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePowerDivisorWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerDivisorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerDivisorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerDivisorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePowerDivisorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerDivisorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePowerDivisorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerDivisorWithCompletion:")
    public native void readAttributePowerDivisorWithCompletion(
            @ObjCBlock(name = "call_readAttributePowerDivisorWithCompletion") @NotNull Block_readAttributePowerDivisorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerDivisorWithCompletion {
        @Generated
        void call_readAttributePowerDivisorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerDivisorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerDivisorWithCompletionHandler:")
    public native void readAttributePowerDivisorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePowerDivisorWithCompletionHandler") @NotNull Block_readAttributePowerDivisorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerDivisorWithCompletionHandler {
        @Generated
        void call_readAttributePowerDivisorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerFactorPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerFactorPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePowerFactorPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePowerFactorPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePowerFactorPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerFactorPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerFactorPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePowerFactorPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePowerFactorPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerFactorPhaseBWithCompletion:")
    public native void readAttributePowerFactorPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseBWithCompletion") @NotNull Block_readAttributePowerFactorPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseBWithCompletion {
        @Generated
        void call_readAttributePowerFactorPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerFactorPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerFactorPhaseBWithCompletionHandler:")
    public native void readAttributePowerFactorPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseBWithCompletionHandler") @NotNull Block_readAttributePowerFactorPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributePowerFactorPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerFactorPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerFactorPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePowerFactorPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePowerFactorPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePowerFactorPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerFactorPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerFactorPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePowerFactorPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePowerFactorPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerFactorPhaseCWithCompletion:")
    public native void readAttributePowerFactorPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseCWithCompletion") @NotNull Block_readAttributePowerFactorPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseCWithCompletion {
        @Generated
        void call_readAttributePowerFactorPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerFactorPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerFactorPhaseCWithCompletionHandler:")
    public native void readAttributePowerFactorPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePowerFactorPhaseCWithCompletionHandler") @NotNull Block_readAttributePowerFactorPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributePowerFactorPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerFactorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerFactorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePowerFactorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerFactorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePowerFactorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePowerFactorWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerFactorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerFactorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerFactorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePowerFactorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePowerFactorWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerFactorWithCompletion:")
    public native void readAttributePowerFactorWithCompletion(
            @ObjCBlock(name = "call_readAttributePowerFactorWithCompletion") @NotNull Block_readAttributePowerFactorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorWithCompletion {
        @Generated
        void call_readAttributePowerFactorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerFactorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerFactorWithCompletionHandler:")
    public native void readAttributePowerFactorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePowerFactorWithCompletionHandler") @NotNull Block_readAttributePowerFactorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerFactorWithCompletionHandler {
        @Generated
        void call_readAttributePowerFactorWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerMultiplierWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerMultiplierWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePowerMultiplierWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerMultiplierWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerMultiplierWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerMultiplierWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePowerMultiplierWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerMultiplierWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePowerMultiplierWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePowerMultiplierWithCompletion:")
    public native void readAttributePowerMultiplierWithCompletion(
            @ObjCBlock(name = "call_readAttributePowerMultiplierWithCompletion") @NotNull Block_readAttributePowerMultiplierWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerMultiplierWithCompletion {
        @Generated
        void call_readAttributePowerMultiplierWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePowerMultiplierWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePowerMultiplierWithCompletionHandler:")
    public native void readAttributePowerMultiplierWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePowerMultiplierWithCompletionHandler") @NotNull Block_readAttributePowerMultiplierWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerMultiplierWithCompletionHandler {
        @Generated
        void call_readAttributePowerMultiplierWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactiveCurrentPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactiveCurrentPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeReactiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeReactiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeReactiveCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactiveCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeReactiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeReactiveCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactiveCurrentPhaseBWithCompletion:")
    public native void readAttributeReactiveCurrentPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseBWithCompletion") @NotNull Block_readAttributeReactiveCurrentPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseBWithCompletion {
        @Generated
        void call_readAttributeReactiveCurrentPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactiveCurrentPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactiveCurrentPhaseBWithCompletionHandler:")
    public native void readAttributeReactiveCurrentPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseBWithCompletionHandler") @NotNull Block_readAttributeReactiveCurrentPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeReactiveCurrentPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactiveCurrentPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactiveCurrentPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeReactiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeReactiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeReactiveCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactiveCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeReactiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeReactiveCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactiveCurrentPhaseCWithCompletion:")
    public native void readAttributeReactiveCurrentPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseCWithCompletion") @NotNull Block_readAttributeReactiveCurrentPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseCWithCompletion {
        @Generated
        void call_readAttributeReactiveCurrentPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactiveCurrentPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactiveCurrentPhaseCWithCompletionHandler:")
    public native void readAttributeReactiveCurrentPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeReactiveCurrentPhaseCWithCompletionHandler") @NotNull Block_readAttributeReactiveCurrentPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactiveCurrentPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeReactiveCurrentPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactivePowerPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactivePowerPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeReactivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeReactivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeReactivePowerPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactivePowerPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeReactivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeReactivePowerPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactivePowerPhaseBWithCompletion:")
    public native void readAttributeReactivePowerPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseBWithCompletion") @NotNull Block_readAttributeReactivePowerPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseBWithCompletion {
        @Generated
        void call_readAttributeReactivePowerPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactivePowerPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactivePowerPhaseBWithCompletionHandler:")
    public native void readAttributeReactivePowerPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseBWithCompletionHandler") @NotNull Block_readAttributeReactivePowerPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeReactivePowerPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactivePowerPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactivePowerPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeReactivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeReactivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeReactivePowerPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactivePowerPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeReactivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeReactivePowerPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactivePowerPhaseCWithCompletion:")
    public native void readAttributeReactivePowerPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseCWithCompletion") @NotNull Block_readAttributeReactivePowerPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseCWithCompletion {
        @Generated
        void call_readAttributeReactivePowerPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactivePowerPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactivePowerPhaseCWithCompletionHandler:")
    public native void readAttributeReactivePowerPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeReactivePowerPhaseCWithCompletionHandler") @NotNull Block_readAttributeReactivePowerPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeReactivePowerPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactivePowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactivePowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeReactivePowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactivePowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeReactivePowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeReactivePowerWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeReactivePowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeReactivePowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeReactivePowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeReactivePowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeReactivePowerWithCompletion:")
    public native void readAttributeReactivePowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeReactivePowerWithCompletion") @NotNull Block_readAttributeReactivePowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerWithCompletion {
        @Generated
        void call_readAttributeReactivePowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeReactivePowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeReactivePowerWithCompletionHandler:")
    public native void readAttributeReactivePowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeReactivePowerWithCompletionHandler") @NotNull Block_readAttributeReactivePowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeReactivePowerWithCompletionHandler {
        @Generated
        void call_readAttributeReactivePowerWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMaxPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMaxPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMaxPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentMaxPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxPhaseBWithCompletion:")
    public native void readAttributeRmsCurrentMaxPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseBWithCompletion") @NotNull Block_readAttributeRmsCurrentMaxPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMaxPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMaxPhaseBWithCompletionHandler:")
    public native void readAttributeRmsCurrentMaxPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentMaxPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMaxPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMaxPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMaxPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentMaxPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxPhaseCWithCompletion:")
    public native void readAttributeRmsCurrentMaxPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseCWithCompletion") @NotNull Block_readAttributeRmsCurrentMaxPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMaxPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMaxPhaseCWithCompletionHandler:")
    public native void readAttributeRmsCurrentMaxPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentMaxPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMaxPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMaxWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMaxWithCompletion:")
    public native void readAttributeRmsCurrentMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxWithCompletion") @NotNull Block_readAttributeRmsCurrentMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMaxWithCompletionHandler:")
    public native void readAttributeRmsCurrentMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMaxWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMaxWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMaxWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMinPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMinPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMinPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentMinPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinPhaseBWithCompletion:")
    public native void readAttributeRmsCurrentMinPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseBWithCompletion") @NotNull Block_readAttributeRmsCurrentMinPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMinPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMinPhaseBWithCompletionHandler:")
    public native void readAttributeRmsCurrentMinPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentMinPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMinPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMinPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMinPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentMinPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinPhaseCWithCompletion:")
    public native void readAttributeRmsCurrentMinPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseCWithCompletion") @NotNull Block_readAttributeRmsCurrentMinPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMinPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMinPhaseCWithCompletionHandler:")
    public native void readAttributeRmsCurrentMinPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentMinPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMinPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMinWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentMinWithCompletion:")
    public native void readAttributeRmsCurrentMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinWithCompletion") @NotNull Block_readAttributeRmsCurrentMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentMinWithCompletionHandler:")
    public native void readAttributeRmsCurrentMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentMinWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentMinWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentMinWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentPhaseBWithCompletion:")
    public native void readAttributeRmsCurrentPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseBWithCompletion") @NotNull Block_readAttributeRmsCurrentPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentPhaseBWithCompletionHandler:")
    public native void readAttributeRmsCurrentPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentPhaseBWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentPhaseCWithCompletion:")
    public native void readAttributeRmsCurrentPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseCWithCompletion") @NotNull Block_readAttributeRmsCurrentPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentPhaseCWithCompletionHandler:")
    public native void readAttributeRmsCurrentPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentPhaseCWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsCurrentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsCurrentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsCurrentWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsCurrentWithCompletion:")
    public native void readAttributeRmsCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsCurrentWithCompletion") @NotNull Block_readAttributeRmsCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentWithCompletion {
        @Generated
        void call_readAttributeRmsCurrentWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsCurrentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsCurrentWithCompletionHandler:")
    public native void readAttributeRmsCurrentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsCurrentWithCompletionHandler") @NotNull Block_readAttributeRmsCurrentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsCurrentWithCompletionHandler {
        @Generated
        void call_readAttributeRmsCurrentWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsExtremeOverVoltagePeriodPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletionHandler:")
    public native void readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsExtremeOverVoltagePeriodPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletionHandler:")
    public native void readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsExtremeOverVoltagePeriodWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltagePeriodWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltagePeriodWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodWithCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeOverVoltagePeriodWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltagePeriodWithCompletionHandler:")
    public native void readAttributeRmsExtremeOverVoltagePeriodWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltagePeriodWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltagePeriodWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltagePeriodWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltagePeriodWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeOverVoltageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeOverVoltageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltageWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeOverVoltageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltageWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeOverVoltageWithCompletion:")
    public native void readAttributeRmsExtremeOverVoltageWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltageWithCompletion") @NotNull Block_readAttributeRmsExtremeOverVoltageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltageWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeOverVoltageWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeOverVoltageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeOverVoltageWithCompletionHandler:")
    public native void readAttributeRmsExtremeOverVoltageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeOverVoltageWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeOverVoltageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeOverVoltageWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeOverVoltageWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletionHandler:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletionHandler:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsExtremeUnderVoltagePeriodWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltagePeriodWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodWithCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeUnderVoltagePeriodWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltagePeriodWithCompletionHandler:")
    public native void readAttributeRmsExtremeUnderVoltagePeriodWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltagePeriodWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltagePeriodWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltagePeriodWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltagePeriodWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeUnderVoltageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsExtremeUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltageWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsExtremeUnderVoltageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltageWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsExtremeUnderVoltageWithCompletion:")
    public native void readAttributeRmsExtremeUnderVoltageWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltageWithCompletion") @NotNull Block_readAttributeRmsExtremeUnderVoltageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltageWithCompletion {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltageWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsExtremeUnderVoltageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsExtremeUnderVoltageWithCompletionHandler:")
    public native void readAttributeRmsExtremeUnderVoltageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsExtremeUnderVoltageWithCompletionHandler") @NotNull Block_readAttributeRmsExtremeUnderVoltageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsExtremeUnderVoltageWithCompletionHandler {
        @Generated
        void call_readAttributeRmsExtremeUnderVoltageWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMaxPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMaxPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMaxPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageMaxPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageMaxPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseBWithCompletion") @NotNull Block_readAttributeRmsVoltageMaxPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMaxPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMaxPhaseBWithCompletionHandler:")
    public native void readAttributeRmsVoltageMaxPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageMaxPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMaxPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMaxPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMaxPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageMaxPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageMaxPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseCWithCompletion") @NotNull Block_readAttributeRmsVoltageMaxPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMaxPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMaxPhaseCWithCompletionHandler:")
    public native void readAttributeRmsVoltageMaxPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageMaxPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMaxPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMaxWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMaxWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMaxWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMaxWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageMaxWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageMaxWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMaxWithCompletion:")
    public native void readAttributeRmsVoltageMaxWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxWithCompletion") @NotNull Block_readAttributeRmsVoltageMaxWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageMaxWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMaxWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMaxWithCompletionHandler:")
    public native void readAttributeRmsVoltageMaxWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMaxWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageMaxWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMaxWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMaxWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMinPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMinPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMinPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageMinPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageMinPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseBWithCompletion") @NotNull Block_readAttributeRmsVoltageMinPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMinPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMinPhaseBWithCompletionHandler:")
    public native void readAttributeRmsVoltageMinPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageMinPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMinPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMinPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMinPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageMinPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageMinPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseCWithCompletion") @NotNull Block_readAttributeRmsVoltageMinPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMinPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMinPhaseCWithCompletionHandler:")
    public native void readAttributeRmsVoltageMinPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageMinPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMinPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMinWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMinWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageMinWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageMinWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMinWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageMinWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageMinWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageMinWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageMinWithCompletion:")
    public native void readAttributeRmsVoltageMinWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinWithCompletion") @NotNull Block_readAttributeRmsVoltageMinWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageMinWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageMinWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageMinWithCompletionHandler:")
    public native void readAttributeRmsVoltageMinWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageMinWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageMinWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageMinWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageMinWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltagePhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltagePhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltagePhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltagePhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltagePhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltagePhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltagePhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltagePhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltagePhaseBWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltagePhaseBWithCompletion:")
    public native void readAttributeRmsVoltagePhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseBWithCompletion") @NotNull Block_readAttributeRmsVoltagePhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsVoltagePhaseBWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltagePhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltagePhaseBWithCompletionHandler:")
    public native void readAttributeRmsVoltagePhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsVoltagePhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltagePhaseBWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltagePhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltagePhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltagePhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltagePhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltagePhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltagePhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltagePhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltagePhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltagePhaseCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltagePhaseCWithCompletion:")
    public native void readAttributeRmsVoltagePhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseCWithCompletion") @NotNull Block_readAttributeRmsVoltagePhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsVoltagePhaseCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltagePhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltagePhaseCWithCompletionHandler:")
    public native void readAttributeRmsVoltagePhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltagePhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsVoltagePhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltagePhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltagePhaseCWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsVoltageSagPeriodPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSagPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSagPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageSagPeriodPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseBWithCompletion") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseBWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSagPeriodPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseBWithCompletionHandler:")
    public native void readAttributeRmsVoltageSagPeriodPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsVoltageSagPeriodPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSagPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSagPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageSagPeriodPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseCWithCompletion") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseCWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSagPeriodPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagPeriodPhaseCWithCompletionHandler:")
    public native void readAttributeRmsVoltageSagPeriodPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagPeriodPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSagPeriodWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagPeriodWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSagPeriodWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagPeriodWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSagPeriodWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSagPeriodWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagPeriodWithCompletion:")
    public native void readAttributeRmsVoltageSagPeriodWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodWithCompletion") @NotNull Block_readAttributeRmsVoltageSagPeriodWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSagPeriodWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagPeriodWithCompletionHandler:")
    public native void readAttributeRmsVoltageSagPeriodWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagPeriodWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagPeriodWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagPeriodWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagPeriodWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSagWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSagWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSagWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSagWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSagWithCompletion:")
    public native void readAttributeRmsVoltageSagWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagWithCompletion") @NotNull Block_readAttributeRmsVoltageSagWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSagWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSagWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSagWithCompletionHandler:")
    public native void readAttributeRmsVoltageSagWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSagWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSagWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSagWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSagWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsVoltageSwellPeriodPhaseBWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseBWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSwellPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseBWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseBWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwellPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseBWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion:")
    public native void readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSwellPeriodPhaseBWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseBWithCompletionHandler:")
    public native void readAttributeRmsVoltageSwellPeriodPhaseBWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseBWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRmsVoltageSwellPeriodPhaseCWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseCWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSwellPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseCWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwellPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseCWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion:")
    public native void readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSwellPeriodPhaseCWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellPeriodPhaseCWithCompletionHandler:")
    public native void readAttributeRmsVoltageSwellPeriodPhaseCWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodPhaseCWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSwellPeriodWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellPeriodWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSwellPeriodWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellPeriodWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwellPeriodWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSwellPeriodWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellPeriodWithCompletion:")
    public native void readAttributeRmsVoltageSwellPeriodWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodWithCompletion") @NotNull Block_readAttributeRmsVoltageSwellPeriodWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSwellPeriodWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellPeriodWithCompletionHandler:")
    public native void readAttributeRmsVoltageSwellPeriodWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellPeriodWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellPeriodWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellPeriodWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellPeriodWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSwellWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageSwellWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageSwellWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageSwellWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageSwellWithCompletion:")
    public native void readAttributeRmsVoltageSwellWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellWithCompletion") @NotNull Block_readAttributeRmsVoltageSwellWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageSwellWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageSwellWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageSwellWithCompletionHandler:")
    public native void readAttributeRmsVoltageSwellWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageSwellWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageSwellWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageSwellWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageSwellWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRmsVoltageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRmsVoltageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRmsVoltageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRmsVoltageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRmsVoltageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRmsVoltageWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRmsVoltageWithCompletion:")
    public native void readAttributeRmsVoltageWithCompletion(
            @ObjCBlock(name = "call_readAttributeRmsVoltageWithCompletion") @NotNull Block_readAttributeRmsVoltageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageWithCompletion {
        @Generated
        void call_readAttributeRmsVoltageWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRmsVoltageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRmsVoltageWithCompletionHandler:")
    public native void readAttributeRmsVoltageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRmsVoltageWithCompletionHandler") @NotNull Block_readAttributeRmsVoltageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRmsVoltageWithCompletionHandler {
        @Generated
        void call_readAttributeRmsVoltageWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTotalActivePowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTotalActivePowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTotalActivePowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTotalActivePowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTotalActivePowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalActivePowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTotalActivePowerWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTotalActivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTotalActivePowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTotalActivePowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTotalActivePowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalActivePowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTotalActivePowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTotalActivePowerWithCompletion:")
    public native void readAttributeTotalActivePowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeTotalActivePowerWithCompletion") @NotNull Block_readAttributeTotalActivePowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalActivePowerWithCompletion {
        @Generated
        void call_readAttributeTotalActivePowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTotalActivePowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTotalActivePowerWithCompletionHandler:")
    public native void readAttributeTotalActivePowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTotalActivePowerWithCompletionHandler") @NotNull Block_readAttributeTotalActivePowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalActivePowerWithCompletionHandler {
        @Generated
        void call_readAttributeTotalActivePowerWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTotalApparentPowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTotalApparentPowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTotalApparentPowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTotalApparentPowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTotalApparentPowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalApparentPowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTotalApparentPowerWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTotalApparentPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTotalApparentPowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTotalApparentPowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTotalApparentPowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalApparentPowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTotalApparentPowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTotalApparentPowerWithCompletion:")
    public native void readAttributeTotalApparentPowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeTotalApparentPowerWithCompletion") @NotNull Block_readAttributeTotalApparentPowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalApparentPowerWithCompletion {
        @Generated
        void call_readAttributeTotalApparentPowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTotalApparentPowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTotalApparentPowerWithCompletionHandler:")
    public native void readAttributeTotalApparentPowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTotalApparentPowerWithCompletionHandler") @NotNull Block_readAttributeTotalApparentPowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalApparentPowerWithCompletionHandler {
        @Generated
        void call_readAttributeTotalApparentPowerWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTotalReactivePowerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTotalReactivePowerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTotalReactivePowerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTotalReactivePowerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTotalReactivePowerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalReactivePowerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTotalReactivePowerWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTotalReactivePowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTotalReactivePowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTotalReactivePowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTotalReactivePowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalReactivePowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTotalReactivePowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTotalReactivePowerWithCompletion:")
    public native void readAttributeTotalReactivePowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeTotalReactivePowerWithCompletion") @NotNull Block_readAttributeTotalReactivePowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalReactivePowerWithCompletion {
        @Generated
        void call_readAttributeTotalReactivePowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTotalReactivePowerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTotalReactivePowerWithCompletionHandler:")
    public native void readAttributeTotalReactivePowerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTotalReactivePowerWithCompletionHandler") @NotNull Block_readAttributeTotalReactivePowerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTotalReactivePowerWithCompletionHandler {
        @Generated
        void call_readAttributeTotalReactivePowerWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeVoltageOverloadWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeVoltageOverloadWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeVoltageOverloadWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeVoltageOverloadWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeVoltageOverloadWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeVoltageOverloadWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeVoltageOverloadWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVoltageOverloadWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeVoltageOverloadWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeVoltageOverloadWithCompletion:")
    public native void readAttributeVoltageOverloadWithCompletion(
            @ObjCBlock(name = "call_readAttributeVoltageOverloadWithCompletion") @NotNull Block_readAttributeVoltageOverloadWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVoltageOverloadWithCompletion {
        @Generated
        void call_readAttributeVoltageOverloadWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeVoltageOverloadWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeVoltageOverloadWithCompletionHandler:")
    public native void readAttributeVoltageOverloadWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeVoltageOverloadWithCompletionHandler") @NotNull Block_readAttributeVoltageOverloadWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVoltageOverloadWithCompletionHandler {
        @Generated
        void call_readAttributeVoltageOverloadWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcActivePowerOverloadWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcActivePowerOverloadWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcActivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcActivePowerOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcActivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcCurrentDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcCurrentDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcCurrentDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcCurrentMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcCurrentMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcCurrentOverloadWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcCurrentOverloadWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcCurrentOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcFrequencyDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcFrequencyDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcFrequencyDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcFrequencyDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcFrequencyDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcFrequencyMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcFrequencyMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcFrequencyMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcFrequencyMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcFrequencyMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcFrequencyMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcFrequencyMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcFrequencyMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcFrequencyMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcFrequencyMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcFrequencyMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcFrequencyMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcFrequencyMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcFrequencyMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcFrequencyMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcFrequencyWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcFrequencyWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcFrequencyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcFrequencyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcFrequencyWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcOverloadAlarmsMaskWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcOverloadAlarmsMaskWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcOverloadAlarmsMaskWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcPowerDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcPowerDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcPowerDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcPowerMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcPowerMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcPowerMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcReactivePowerOverloadWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcReactivePowerOverloadWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcReactivePowerOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcReactivePowerOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcReactivePowerOverloadWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcVoltageDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcVoltageDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcVoltageDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcVoltageMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcVoltageMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcVoltageMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAcVoltageOverloadWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAcVoltageOverloadWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAcVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAcVoltageOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAcVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeActiveCurrentPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActiveCurrentPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActiveCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActiveCurrentPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActiveCurrentPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActiveCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerMaxPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerMaxPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerMaxPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerMaxPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerMaxPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerMaxPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerMinPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerMinPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerMinPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerMinPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerMinPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerMinPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActivePowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActivePowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActivePowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeApparentPowerPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeApparentPowerPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeApparentPowerPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeApparentPowerPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeApparentPowerPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeApparentPowerPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeApparentPowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeApparentPowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeApparentPowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeApparentPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeApparentPowerWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use
     * subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAverageRmsOverVoltageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsOverVoltageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsOverVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsOverVoltageWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAverageRmsUnderVoltageCounterWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsUnderVoltageCounterWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsUnderVoltageCounterWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageCounterWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAverageRmsUnderVoltageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsUnderVoltageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsUnderVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAverageRmsVoltageMeasurementPeriodWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeCurrentOverloadWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentOverloadWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentOverloadWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcCurrentDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcCurrentDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcCurrentDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcCurrentDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcCurrentDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcCurrentMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcCurrentMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcCurrentMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcCurrentMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcCurrentMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcCurrentMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcCurrentMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcCurrentMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcCurrentMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcCurrentWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcPowerDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcPowerDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcPowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcPowerDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcPowerDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcPowerMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcPowerMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcPowerMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcPowerMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcPowerMaxWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcPowerMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcPowerMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcPowerMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcPowerMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcPowerMinWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcPowerMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcPowerMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcPowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcPowerMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcPowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcPowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcPowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcPowerWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcVoltageDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcVoltageDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcVoltageDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcVoltageDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcVoltageDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcVoltageMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcVoltageMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcVoltageMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcVoltageMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcVoltageMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcVoltageMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcVoltageMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcVoltageMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcVoltageMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcVoltageMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcVoltageMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcVoltageMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDcVoltageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDcVoltageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDcVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDcVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDcVoltageWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeHarmonicCurrentMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeHarmonicCurrentMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeHarmonicCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstantaneousActiveCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstantaneousActiveCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstantaneousActiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstantaneousActiveCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstantaneousActiveCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstantaneousLineCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstantaneousLineCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstantaneousLineCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstantaneousLineCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstantaneousLineCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstantaneousPowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstantaneousPowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstantaneousPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstantaneousPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstantaneousPowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstantaneousReactiveCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstantaneousReactiveCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstantaneousReactiveCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstantaneousReactiveCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstantaneousReactiveCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstantaneousVoltageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstantaneousVoltageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstantaneousVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstantaneousVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstantaneousVoltageWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLineCurrentPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLineCurrentPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLineCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLineCurrentPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLineCurrentPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLineCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLineCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeasured11thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasured11thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasured11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasured11thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasured11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeasured1stHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasured1stHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasured1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasured1stHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasured1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeasured3rdHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasured3rdHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasured3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasured3rdHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasured3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeasured5thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasured5thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasured5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasured5thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasured5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeasured7thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasured7thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasured7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasured7thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasured7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeasured9thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasured9thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasured9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasured9thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasured9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasuredPhase11thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasuredPhase1stHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasuredPhase3rdHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasuredPhase5thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasuredPhase7thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasuredPhase9thHarmonicCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeasurementTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeasurementTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeasurementTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeasurementTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeasurementTypeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNeutralCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNeutralCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNeutralCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNeutralCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNeutralCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOverloadAlarmsMaskWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOverloadAlarmsMaskWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOverloadAlarmsMaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOverloadAlarmsMaskWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOverloadAlarmsMaskWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributePhaseHarmonicCurrentMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhaseHarmonicCurrentMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhaseHarmonicCurrentMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhaseHarmonicCurrentMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhaseHarmonicCurrentMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePowerDivisorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePowerDivisorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePowerDivisorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePowerDivisorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePowerDivisorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePowerFactorPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePowerFactorPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePowerFactorPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePowerFactorPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePowerFactorPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePowerFactorPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePowerFactorPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePowerFactorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePowerFactorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePowerFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePowerFactorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePowerFactorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePowerMultiplierWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePowerMultiplierWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePowerMultiplierWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePowerMultiplierWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePowerMultiplierWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeReactiveCurrentPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeReactiveCurrentPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeReactiveCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeReactiveCurrentPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeReactiveCurrentPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeReactiveCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeReactiveCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeReactivePowerPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeReactivePowerPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeReactivePowerPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeReactivePowerPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeReactivePowerPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeReactivePowerPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeReactivePowerPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeReactivePowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeReactivePowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeReactivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeReactivePowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentMaxPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentMaxPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentMaxPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentMaxPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentMaxPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentMaxPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentMinPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentMinPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentMinPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentMinPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentMinPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentMinPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsCurrentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsCurrentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsCurrentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsCurrentWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsExtremeOverVoltagePeriodWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeOverVoltagePeriodWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeOverVoltagePeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsExtremeOverVoltageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeOverVoltageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeOverVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeOverVoltageWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsExtremeUnderVoltagePeriodWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeUnderVoltagePeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltagePeriodWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsExtremeUnderVoltageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsExtremeUnderVoltageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsExtremeUnderVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsExtremeUnderVoltageWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageMaxPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageMaxPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageMaxPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageMaxPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageMaxPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageMaxPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageMaxWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageMaxWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageMaxWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageMaxWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageMinPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageMinPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageMinPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageMinPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageMinPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageMinPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageMinWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageMinWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageMinWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageMinWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltagePhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltagePhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltagePhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltagePhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltagePhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltagePhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltagePhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSagPeriodPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSagPeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSagPeriodPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSagPeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSagPeriodWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSagPeriodWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSagPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagPeriodWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSagWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSagWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSagWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSagWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseBWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodPhaseCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSwellPeriodWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSwellPeriodWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSwellPeriodWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellPeriodWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageSwellWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageSwellWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageSwellWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageSwellWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRmsVoltageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRmsVoltageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRmsVoltageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRmsVoltageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRmsVoltageWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTotalActivePowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTotalActivePowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTotalActivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTotalActivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTotalActivePowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTotalApparentPowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTotalApparentPowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTotalApparentPowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTotalApparentPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTotalApparentPowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTotalReactivePowerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTotalReactivePowerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTotalReactivePowerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTotalReactivePowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTotalReactivePowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeVoltageOverloadWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeVoltageOverloadWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeVoltageOverloadWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeVoltageOverloadWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeVoltageOverloadWithParamsSubscriptionEstablishedReportHandler_2(
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
    @Selector("writeAttributeAcOverloadAlarmsMaskWithValue:completion:")
    public native void writeAttributeAcOverloadAlarmsMaskWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAcOverloadAlarmsMaskWithValueCompletion") @NotNull Block_writeAttributeAcOverloadAlarmsMaskWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAcOverloadAlarmsMaskWithValueCompletion {
        @Generated
        void call_writeAttributeAcOverloadAlarmsMaskWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAcOverloadAlarmsMaskWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAcOverloadAlarmsMaskWithValue:completionHandler:")
    public native void writeAttributeAcOverloadAlarmsMaskWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAcOverloadAlarmsMaskWithValueCompletionHandler") @NotNull Block_writeAttributeAcOverloadAlarmsMaskWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAcOverloadAlarmsMaskWithValueCompletionHandler {
        @Generated
        void call_writeAttributeAcOverloadAlarmsMaskWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeAcOverloadAlarmsMaskWithValue:params:completion:")
    public native void writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletion") @NotNull Block_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletion {
        @Generated
        void call_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAcOverloadAlarmsMaskWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAcOverloadAlarmsMaskWithValue:params:completionHandler:")
    public native void writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletionHandler") @NotNull Block_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeAcOverloadAlarmsMaskWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeAverageRmsUnderVoltageCounterWithValue:completion:")
    public native void writeAttributeAverageRmsUnderVoltageCounterWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletion") @NotNull Block_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletion {
        @Generated
        void call_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAverageRmsUnderVoltageCounterWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAverageRmsUnderVoltageCounterWithValue:completionHandler:")
    public native void writeAttributeAverageRmsUnderVoltageCounterWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletionHandler") @NotNull Block_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletionHandler {
        @Generated
        void call_writeAttributeAverageRmsUnderVoltageCounterWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeAverageRmsUnderVoltageCounterWithValue:params:completion:")
    public native void writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletion") @NotNull Block_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletion {
        @Generated
        void call_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAverageRmsUnderVoltageCounterWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAverageRmsUnderVoltageCounterWithValue:params:completionHandler:")
    public native void writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletionHandler") @NotNull Block_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeAverageRmsUnderVoltageCounterWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:completion:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletion") @NotNull Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletion {
        @Generated
        void call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:completionHandler:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletionHandler") @NotNull Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletionHandler {
        @Generated
        void call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:params:completion:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletion") @NotNull Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletion {
        @Generated
        void call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeAverageRmsVoltageMeasurementPeriodWithValue:params:completionHandler:")
    public native void writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletionHandler") @NotNull Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeAverageRmsVoltageMeasurementPeriodWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOverloadAlarmsMaskWithValue:completion:")
    public native void writeAttributeOverloadAlarmsMaskWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOverloadAlarmsMaskWithValueCompletion") @NotNull Block_writeAttributeOverloadAlarmsMaskWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOverloadAlarmsMaskWithValueCompletion {
        @Generated
        void call_writeAttributeOverloadAlarmsMaskWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOverloadAlarmsMaskWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOverloadAlarmsMaskWithValue:completionHandler:")
    public native void writeAttributeOverloadAlarmsMaskWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeOverloadAlarmsMaskWithValueCompletionHandler") @NotNull Block_writeAttributeOverloadAlarmsMaskWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOverloadAlarmsMaskWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOverloadAlarmsMaskWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeOverloadAlarmsMaskWithValue:params:completion:")
    public native void writeAttributeOverloadAlarmsMaskWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOverloadAlarmsMaskWithValueParamsCompletion") @NotNull Block_writeAttributeOverloadAlarmsMaskWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOverloadAlarmsMaskWithValueParamsCompletion {
        @Generated
        void call_writeAttributeOverloadAlarmsMaskWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOverloadAlarmsMaskWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOverloadAlarmsMaskWithValue:params:completionHandler:")
    public native void writeAttributeOverloadAlarmsMaskWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOverloadAlarmsMaskWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOverloadAlarmsMaskWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOverloadAlarmsMaskWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOverloadAlarmsMaskWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsExtremeOverVoltagePeriodWithValue:completion:")
    public native void writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletion") @NotNull Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletion {
        @Generated
        void call_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsExtremeOverVoltagePeriodWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsExtremeOverVoltagePeriodWithValue:completionHandler:")
    public native void writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletionHandler") @NotNull Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRmsExtremeOverVoltagePeriodWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsExtremeOverVoltagePeriodWithValue:params:completion:")
    public native void writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletion") @NotNull Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsExtremeOverVoltagePeriodWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsExtremeOverVoltagePeriodWithValue:params:completionHandler:")
    public native void writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRmsExtremeOverVoltagePeriodWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsExtremeUnderVoltagePeriodWithValue:completion:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletion") @NotNull Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletion {
        @Generated
        void call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsExtremeUnderVoltagePeriodWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsExtremeUnderVoltagePeriodWithValue:completionHandler:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletionHandler") @NotNull Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsExtremeUnderVoltagePeriodWithValue:params:completion:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletion") @NotNull Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsExtremeUnderVoltagePeriodWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsExtremeUnderVoltagePeriodWithValue:params:completionHandler:")
    public native void writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRmsExtremeUnderVoltagePeriodWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSagPeriodWithValue:completion:")
    public native void writeAttributeRmsVoltageSagPeriodWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSagPeriodWithValueCompletion") @NotNull Block_writeAttributeRmsVoltageSagPeriodWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSagPeriodWithValueCompletion {
        @Generated
        void call_writeAttributeRmsVoltageSagPeriodWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsVoltageSagPeriodWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsVoltageSagPeriodWithValue:completionHandler:")
    public native void writeAttributeRmsVoltageSagPeriodWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSagPeriodWithValueCompletionHandler") @NotNull Block_writeAttributeRmsVoltageSagPeriodWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSagPeriodWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRmsVoltageSagPeriodWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSagPeriodWithValue:params:completion:")
    public native void writeAttributeRmsVoltageSagPeriodWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletion") @NotNull Block_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsVoltageSagPeriodWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsVoltageSagPeriodWithValue:params:completionHandler:")
    public native void writeAttributeRmsVoltageSagPeriodWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRmsVoltageSagPeriodWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSwellPeriodWithValue:completion:")
    public native void writeAttributeRmsVoltageSwellPeriodWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSwellPeriodWithValueCompletion") @NotNull Block_writeAttributeRmsVoltageSwellPeriodWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSwellPeriodWithValueCompletion {
        @Generated
        void call_writeAttributeRmsVoltageSwellPeriodWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsVoltageSwellPeriodWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsVoltageSwellPeriodWithValue:completionHandler:")
    public native void writeAttributeRmsVoltageSwellPeriodWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSwellPeriodWithValueCompletionHandler") @NotNull Block_writeAttributeRmsVoltageSwellPeriodWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSwellPeriodWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRmsVoltageSwellPeriodWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeRmsVoltageSwellPeriodWithValue:params:completion:")
    public native void writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletion") @NotNull Block_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRmsVoltageSwellPeriodWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRmsVoltageSwellPeriodWithValue:params:completionHandler:")
    public native void writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRmsVoltageSwellPeriodWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}