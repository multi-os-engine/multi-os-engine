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
 * Cluster Energy EVSE
 * 
 * Electric Vehicle Supply Equipment (EVSE) is equipment used to charge an Electric Vehicle (EV) or Plug-In Hybrid
 * Electric Vehicle. This cluster provides an interface to the functionality of Electric Vehicle Supply Equipment (EVSE)
 * management.
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterEnergyEVSE extends MTRGenericBaseCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterEnergyEVSE(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterEnergyEVSE alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterEnergyEVSE allocWithZone(VoidPtr zone);

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
     * API-Since: 18.4
     */
    @Generated
    @Selector("clearTargetsWithCompletion:")
    public native void clearTargetsWithCompletion(
            @ObjCBlock(name = "call_clearTargetsWithCompletion") @NotNull Block_clearTargetsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearTargetsWithCompletion {
        @Generated
        void call_clearTargetsWithCompletion(@Nullable NSError error);
    }

    /**
     * Command ClearTargets
     * 
     * Allows a client to clear all stored charging targets.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("clearTargetsWithParams:completion:")
    public native void clearTargetsWithParamsCompletion(@Nullable MTREnergyEVSEClusterClearTargetsParams params,
            @ObjCBlock(name = "call_clearTargetsWithParamsCompletion") @NotNull Block_clearTargetsWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_clearTargetsWithParamsCompletion {
        @Generated
        void call_clearTargetsWithParamsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("debugDescription")
    public static native String debugDescription_static();

    @Generated
    @Selector("description")
    public static native String description_static();

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("disableWithCompletion:")
    public native void disableWithCompletion(
            @ObjCBlock(name = "call_disableWithCompletion") @NotNull Block_disableWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableWithCompletion {
        @Generated
        void call_disableWithCompletion(@Nullable NSError error);
    }

    /**
     * Command Disable
     * 
     * Allows a client to disable the EVSE from charging and discharging.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("disableWithParams:completion:")
    public native void disableWithParamsCompletion(@Nullable MTREnergyEVSEClusterDisableParams params,
            @ObjCBlock(name = "call_disableWithParamsCompletion") @NotNull Block_disableWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_disableWithParamsCompletion {
        @Generated
        void call_disableWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * Command EnableCharging
     * 
     * This command allows a client to enable the EVSE to charge an EV, and to provide or update the maximum and minimum
     * charge current.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("enableChargingWithParams:completion:")
    public native void enableChargingWithParamsCompletion(@NotNull MTREnergyEVSEClusterEnableChargingParams params,
            @ObjCBlock(name = "call_enableChargingWithParamsCompletion") @NotNull Block_enableChargingWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_enableChargingWithParamsCompletion {
        @Generated
        void call_enableChargingWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("getTargetsWithCompletion:")
    public native void getTargetsWithCompletion(
            @ObjCBlock(name = "call_getTargetsWithCompletion") @NotNull Block_getTargetsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getTargetsWithCompletion {
        @Generated
        void call_getTargetsWithCompletion(@Nullable MTREnergyEVSEClusterGetTargetsResponseParams data,
                @Nullable NSError error);
    }

    /**
     * Command GetTargets
     * 
     * Allows a client to retrieve the current set of charging targets.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("getTargetsWithParams:completion:")
    public native void getTargetsWithParamsCompletion(@Nullable MTREnergyEVSEClusterGetTargetsParams params,
            @ObjCBlock(name = "call_getTargetsWithParamsCompletion") @NotNull Block_getTargetsWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getTargetsWithParamsCompletion {
        @Generated
        void call_getTargetsWithParamsCompletion(@Nullable MTREnergyEVSEClusterGetTargetsResponseParams data,
                @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseClusterEnergyEVSE init();

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterEnergyEVSE initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterEnergyEVSE new_objc();

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeApproximateEVEfficiencyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeApproximateEVEfficiencyWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeApproximateEVEfficiencyWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeApproximateEVEfficiencyWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApproximateEVEfficiencyWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeApproximateEVEfficiencyWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeApproximateEVEfficiencyWithCompletion:")
    public native void readAttributeApproximateEVEfficiencyWithCompletion(
            @ObjCBlock(name = "call_readAttributeApproximateEVEfficiencyWithCompletion") @NotNull Block_readAttributeApproximateEVEfficiencyWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeApproximateEVEfficiencyWithCompletion {
        @Generated
        void call_readAttributeApproximateEVEfficiencyWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeChargingEnabledUntilWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChargingEnabledUntilWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeChargingEnabledUntilWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeChargingEnabledUntilWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChargingEnabledUntilWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeChargingEnabledUntilWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeChargingEnabledUntilWithCompletion:")
    public native void readAttributeChargingEnabledUntilWithCompletion(
            @ObjCBlock(name = "call_readAttributeChargingEnabledUntilWithCompletion") @NotNull Block_readAttributeChargingEnabledUntilWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChargingEnabledUntilWithCompletion {
        @Generated
        void call_readAttributeChargingEnabledUntilWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeCircuitCapacityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCircuitCapacityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCircuitCapacityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCircuitCapacityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCircuitCapacityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCircuitCapacityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeCircuitCapacityWithCompletion:")
    public native void readAttributeCircuitCapacityWithCompletion(
            @ObjCBlock(name = "call_readAttributeCircuitCapacityWithCompletion") @NotNull Block_readAttributeCircuitCapacityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCircuitCapacityWithCompletion {
        @Generated
        void call_readAttributeCircuitCapacityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeFaultStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFaultStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFaultStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeFaultStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFaultStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeFaultStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeFaultStateWithCompletion:")
    public native void readAttributeFaultStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeFaultStateWithCompletion") @NotNull Block_readAttributeFaultStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFaultStateWithCompletion {
        @Generated
        void call_readAttributeFaultStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
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
     * API-Since: 18.4
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
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeMaximumChargeCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeMaximumChargeCurrentWithCompletion:")
    public native void readAttributeMaximumChargeCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMaximumChargeCurrentWithCompletion") @NotNull Block_readAttributeMaximumChargeCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaximumChargeCurrentWithCompletion {
        @Generated
        void call_readAttributeMaximumChargeCurrentWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeMinimumChargeCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinimumChargeCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinimumChargeCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMinimumChargeCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinimumChargeCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMinimumChargeCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeMinimumChargeCurrentWithCompletion:")
    public native void readAttributeMinimumChargeCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeMinimumChargeCurrentWithCompletion") @NotNull Block_readAttributeMinimumChargeCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinimumChargeCurrentWithCompletion {
        @Generated
        void call_readAttributeMinimumChargeCurrentWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeRequiredEnergyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeRequiredEnergyWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNextChargeRequiredEnergyWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNextChargeRequiredEnergyWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeRequiredEnergyWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNextChargeRequiredEnergyWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeRequiredEnergyWithCompletion:")
    public native void readAttributeNextChargeRequiredEnergyWithCompletion(
            @ObjCBlock(name = "call_readAttributeNextChargeRequiredEnergyWithCompletion") @NotNull Block_readAttributeNextChargeRequiredEnergyWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeRequiredEnergyWithCompletion {
        @Generated
        void call_readAttributeNextChargeRequiredEnergyWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeStartTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeStartTimeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNextChargeStartTimeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNextChargeStartTimeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeStartTimeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNextChargeStartTimeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeStartTimeWithCompletion:")
    public native void readAttributeNextChargeStartTimeWithCompletion(
            @ObjCBlock(name = "call_readAttributeNextChargeStartTimeWithCompletion") @NotNull Block_readAttributeNextChargeStartTimeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeStartTimeWithCompletion {
        @Generated
        void call_readAttributeNextChargeStartTimeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeTargetSoCWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeTargetSoCWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNextChargeTargetSoCWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNextChargeTargetSoCWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeTargetSoCWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNextChargeTargetSoCWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeTargetSoCWithCompletion:")
    public native void readAttributeNextChargeTargetSoCWithCompletion(
            @ObjCBlock(name = "call_readAttributeNextChargeTargetSoCWithCompletion") @NotNull Block_readAttributeNextChargeTargetSoCWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeTargetSoCWithCompletion {
        @Generated
        void call_readAttributeNextChargeTargetSoCWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeTargetTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNextChargeTargetTimeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNextChargeTargetTimeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNextChargeTargetTimeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeTargetTimeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNextChargeTargetTimeWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeNextChargeTargetTimeWithCompletion:")
    public native void readAttributeNextChargeTargetTimeWithCompletion(
            @ObjCBlock(name = "call_readAttributeNextChargeTargetTimeWithCompletion") @NotNull Block_readAttributeNextChargeTargetTimeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNextChargeTargetTimeWithCompletion {
        @Generated
        void call_readAttributeNextChargeTargetTimeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeRandomizationDelayWindowWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRandomizationDelayWindowWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRandomizationDelayWindowWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRandomizationDelayWindowWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRandomizationDelayWindowWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRandomizationDelayWindowWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeRandomizationDelayWindowWithCompletion:")
    public native void readAttributeRandomizationDelayWindowWithCompletion(
            @ObjCBlock(name = "call_readAttributeRandomizationDelayWindowWithCompletion") @NotNull Block_readAttributeRandomizationDelayWindowWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRandomizationDelayWindowWithCompletion {
        @Generated
        void call_readAttributeRandomizationDelayWindowWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSessionDurationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSessionDurationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSessionDurationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSessionDurationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSessionDurationWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionDurationWithCompletion:")
    public native void readAttributeSessionDurationWithCompletion(
            @ObjCBlock(name = "call_readAttributeSessionDurationWithCompletion") @NotNull Block_readAttributeSessionDurationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSessionDurationWithCompletion {
        @Generated
        void call_readAttributeSessionDurationWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionEnergyChargedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSessionEnergyChargedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSessionEnergyChargedWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSessionEnergyChargedWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSessionEnergyChargedWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSessionEnergyChargedWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionEnergyChargedWithCompletion:")
    public native void readAttributeSessionEnergyChargedWithCompletion(
            @ObjCBlock(name = "call_readAttributeSessionEnergyChargedWithCompletion") @NotNull Block_readAttributeSessionEnergyChargedWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSessionEnergyChargedWithCompletion {
        @Generated
        void call_readAttributeSessionEnergyChargedWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionIDWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSessionIDWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSessionIDWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSessionIDWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSessionIDWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSessionIDWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSessionIDWithCompletion:")
    public native void readAttributeSessionIDWithCompletion(
            @ObjCBlock(name = "call_readAttributeSessionIDWithCompletion") @NotNull Block_readAttributeSessionIDWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSessionIDWithCompletion {
        @Generated
        void call_readAttributeSessionIDWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeStateWithCompletion:")
    public native void readAttributeStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeStateWithCompletion") @NotNull Block_readAttributeStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStateWithCompletion {
        @Generated
        void call_readAttributeStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSupplyStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSupplyStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSupplyStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSupplyStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSupplyStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSupplyStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeSupplyStateWithCompletion:")
    public native void readAttributeSupplyStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeSupplyStateWithCompletion") @NotNull Block_readAttributeSupplyStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSupplyStateWithCompletion {
        @Generated
        void call_readAttributeSupplyStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeUserMaximumChargeCurrentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUserMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUserMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUserMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUserMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUserMaximumChargeCurrentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeUserMaximumChargeCurrentWithCompletion:")
    public native void readAttributeUserMaximumChargeCurrentWithCompletion(
            @ObjCBlock(name = "call_readAttributeUserMaximumChargeCurrentWithCompletion") @NotNull Block_readAttributeUserMaximumChargeCurrentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUserMaximumChargeCurrentWithCompletion {
        @Generated
        void call_readAttributeUserMaximumChargeCurrentWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Command SetTargets
     * 
     * Allows a client to set the user specified charging targets.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setTargetsWithParams:completion:")
    public native void setTargetsWithParamsCompletion(@NotNull MTREnergyEVSEClusterSetTargetsParams params,
            @ObjCBlock(name = "call_setTargetsWithParamsCompletion") @NotNull Block_setTargetsWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setTargetsWithParamsCompletion {
        @Generated
        void call_setTargetsWithParamsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("startDiagnosticsWithCompletion:")
    public native void startDiagnosticsWithCompletion(
            @ObjCBlock(name = "call_startDiagnosticsWithCompletion") @NotNull Block_startDiagnosticsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDiagnosticsWithCompletion {
        @Generated
        void call_startDiagnosticsWithCompletion(@Nullable NSError error);
    }

    /**
     * Command StartDiagnostics
     * 
     * Allows a client to put the EVSE into a self-diagnostics mode.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("startDiagnosticsWithParams:completion:")
    public native void startDiagnosticsWithParamsCompletion(@Nullable MTREnergyEVSEClusterStartDiagnosticsParams params,
            @ObjCBlock(name = "call_startDiagnosticsWithParamsCompletion") @NotNull Block_startDiagnosticsWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startDiagnosticsWithParamsCompletion {
        @Generated
        void call_startDiagnosticsWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeApproximateEVEfficiencyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeApproximateEVEfficiencyWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeChargingEnabledUntilWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeChargingEnabledUntilWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeCircuitCapacityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCircuitCapacityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeFaultStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeFaultStateWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
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
     * API-Since: 18.4
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeMaximumChargeCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeMinimumChargeCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMinimumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeNextChargeRequiredEnergyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNextChargeRequiredEnergyWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeNextChargeStartTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNextChargeStartTimeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeNextChargeTargetSoCWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNextChargeTargetSoCWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeNextChargeTargetTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNextChargeTargetTimeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeRandomizationDelayWindowWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRandomizationDelayWindowWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeSessionDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSessionDurationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeSessionEnergyChargedWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSessionEnergyChargedWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeSessionIDWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSessionIDWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeStateWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeSupplyStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSupplyStateWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeUserMaximumChargeCurrentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUserMaximumChargeCurrentWithParamsSubscriptionEstablishedReportHandler_2(
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
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeApproximateEVEfficiencyWithValue:completion:")
    public native void writeAttributeApproximateEVEfficiencyWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeApproximateEVEfficiencyWithValueCompletion") @NotNull Block_writeAttributeApproximateEVEfficiencyWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeApproximateEVEfficiencyWithValueCompletion {
        @Generated
        void call_writeAttributeApproximateEVEfficiencyWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeApproximateEVEfficiencyWithValue:params:completion:")
    public native void writeAttributeApproximateEVEfficiencyWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeApproximateEVEfficiencyWithValueParamsCompletion") @NotNull Block_writeAttributeApproximateEVEfficiencyWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeApproximateEVEfficiencyWithValueParamsCompletion {
        @Generated
        void call_writeAttributeApproximateEVEfficiencyWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeRandomizationDelayWindowWithValue:completion:")
    public native void writeAttributeRandomizationDelayWindowWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRandomizationDelayWindowWithValueCompletion") @NotNull Block_writeAttributeRandomizationDelayWindowWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRandomizationDelayWindowWithValueCompletion {
        @Generated
        void call_writeAttributeRandomizationDelayWindowWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeRandomizationDelayWindowWithValue:params:completion:")
    public native void writeAttributeRandomizationDelayWindowWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRandomizationDelayWindowWithValueParamsCompletion") @NotNull Block_writeAttributeRandomizationDelayWindowWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRandomizationDelayWindowWithValueParamsCompletion {
        @Generated
        void call_writeAttributeRandomizationDelayWindowWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeUserMaximumChargeCurrentWithValue:completion:")
    public native void writeAttributeUserMaximumChargeCurrentWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUserMaximumChargeCurrentWithValueCompletion") @NotNull Block_writeAttributeUserMaximumChargeCurrentWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUserMaximumChargeCurrentWithValueCompletion {
        @Generated
        void call_writeAttributeUserMaximumChargeCurrentWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("writeAttributeUserMaximumChargeCurrentWithValue:params:completion:")
    public native void writeAttributeUserMaximumChargeCurrentWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUserMaximumChargeCurrentWithValueParamsCompletion") @NotNull Block_writeAttributeUserMaximumChargeCurrentWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUserMaximumChargeCurrentWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUserMaximumChargeCurrentWithValueParamsCompletion(@Nullable NSError error);
    }
}