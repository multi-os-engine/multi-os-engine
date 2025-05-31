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
 * Cluster Device Energy Management
 * 
 * This cluster allows a client to manage the power draw of a device. An example of such a client could be an Energy
 * Management System (EMS) which controls an Energy Smart Appliance (ESA).
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterDeviceEnergyManagement extends MTRGenericBaseCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterDeviceEnergyManagement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterDeviceEnergyManagement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterDeviceEnergyManagement allocWithZone(VoidPtr zone);

    @Generated
    @Selector("automaticallyNotifiesObserversForKey:")
    public static native boolean automaticallyNotifiesObserversForKey(@NotNull String key);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelPowerAdjustRequestWithCompletion:")
    public native void cancelPowerAdjustRequestWithCompletion(
            @ObjCBlock(name = "call_cancelPowerAdjustRequestWithCompletion") @NotNull Block_cancelPowerAdjustRequestWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelPowerAdjustRequestWithCompletion {
        @Generated
        void call_cancelPowerAdjustRequestWithCompletion(@Nullable NSError error);
    }

    /**
     * Command CancelPowerAdjustRequest
     * 
     * Allows a client to cancel an ongoing PowerAdjustmentRequest operation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelPowerAdjustRequestWithParams:completion:")
    public native void cancelPowerAdjustRequestWithParamsCompletion(
            @Nullable MTRDeviceEnergyManagementClusterCancelPowerAdjustRequestParams params,
            @ObjCBlock(name = "call_cancelPowerAdjustRequestWithParamsCompletion") @NotNull Block_cancelPowerAdjustRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelPowerAdjustRequestWithParamsCompletion {
        @Generated
        void call_cancelPowerAdjustRequestWithParamsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:")
    public static native void cancelPreviousPerformRequestsWithTarget(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget);

    @Generated
    @Selector("cancelPreviousPerformRequestsWithTarget:selector:object:")
    public static native void cancelPreviousPerformRequestsWithTargetSelectorObject(
            @Mapped(ObjCObjectMapper.class) @NotNull Object aTarget, @NotNull SEL aSelector,
            @Mapped(ObjCObjectMapper.class) @Nullable Object anArgument);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelRequestWithCompletion:")
    public native void cancelRequestWithCompletion(
            @ObjCBlock(name = "call_cancelRequestWithCompletion") @NotNull Block_cancelRequestWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelRequestWithCompletion {
        @Generated
        void call_cancelRequestWithCompletion(@Nullable NSError error);
    }

    /**
     * Command CancelRequest
     * 
     * Allows a client to request cancellation of a previous adjustment request in a StartTimeAdjustRequest,
     * ModifyForecastRequest or RequestConstraintBasedForecast command.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("cancelRequestWithParams:completion:")
    public native void cancelRequestWithParamsCompletion(
            @Nullable MTRDeviceEnergyManagementClusterCancelRequestParams params,
            @ObjCBlock(name = "call_cancelRequestWithParamsCompletion") @NotNull Block_cancelRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_cancelRequestWithParamsCompletion {
        @Generated
        void call_cancelRequestWithParamsCompletion(@Nullable NSError error);
    }

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
    public native MTRBaseClusterDeviceEnergyManagement init();

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterDeviceEnergyManagement initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
     * Command ModifyForecastRequest
     * 
     * Allows a client to modify a Forecast within the limits allowed by the ESA.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("modifyForecastRequestWithParams:completion:")
    public native void modifyForecastRequestWithParamsCompletion(
            @NotNull MTRDeviceEnergyManagementClusterModifyForecastRequestParams params,
            @ObjCBlock(name = "call_modifyForecastRequestWithParamsCompletion") @NotNull Block_modifyForecastRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_modifyForecastRequestWithParamsCompletion {
        @Generated
        void call_modifyForecastRequestWithParamsCompletion(@Nullable NSError error);
    }

    @Generated
    @Owned
    @Selector("new")
    public static native MTRBaseClusterDeviceEnergyManagement new_objc();

    /**
     * Command PauseRequest
     * 
     * Allows a client to temporarily pause an operation and reduce the ESAs energy demand.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("pauseRequestWithParams:completion:")
    public native void pauseRequestWithParamsCompletion(
            @NotNull MTRDeviceEnergyManagementClusterPauseRequestParams params,
            @ObjCBlock(name = "call_pauseRequestWithParamsCompletion") @NotNull Block_pauseRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_pauseRequestWithParamsCompletion {
        @Generated
        void call_pauseRequestWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * Command PowerAdjustRequest
     * 
     * Allows a client to request an adjustment in the power consumption of an ESA for a specified duration.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("powerAdjustRequestWithParams:completion:")
    public native void powerAdjustRequestWithParamsCompletion(
            @NotNull MTRDeviceEnergyManagementClusterPowerAdjustRequestParams params,
            @ObjCBlock(name = "call_powerAdjustRequestWithParamsCompletion") @NotNull Block_powerAdjustRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_powerAdjustRequestWithParamsCompletion {
        @Generated
        void call_powerAdjustRequestWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAbsMaxPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMaxPowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMaxPowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAbsMaxPowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxPowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAbsMaxPowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAbsMaxPowerWithCompletion:")
    public native void readAttributeAbsMaxPowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeAbsMaxPowerWithCompletion") @NotNull Block_readAttributeAbsMaxPowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMaxPowerWithCompletion {
        @Generated
        void call_readAttributeAbsMaxPowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAbsMinPowerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAbsMinPowerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAbsMinPowerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAbsMinPowerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinPowerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAbsMinPowerWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeAbsMinPowerWithCompletion:")
    public native void readAttributeAbsMinPowerWithCompletion(
            @ObjCBlock(name = "call_readAttributeAbsMinPowerWithCompletion") @NotNull Block_readAttributeAbsMinPowerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAbsMinPowerWithCompletion {
        @Generated
        void call_readAttributeAbsMinPowerWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

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
    @Selector("readAttributeESACanGenerateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeESACanGenerateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeESACanGenerateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeESACanGenerateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeESACanGenerateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeESACanGenerateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeESACanGenerateWithCompletion:")
    public native void readAttributeESACanGenerateWithCompletion(
            @ObjCBlock(name = "call_readAttributeESACanGenerateWithCompletion") @NotNull Block_readAttributeESACanGenerateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeESACanGenerateWithCompletion {
        @Generated
        void call_readAttributeESACanGenerateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeESAStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeESAStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeESAStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeESAStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeESAStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeESAStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeESAStateWithCompletion:")
    public native void readAttributeESAStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeESAStateWithCompletion") @NotNull Block_readAttributeESAStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeESAStateWithCompletion {
        @Generated
        void call_readAttributeESAStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeESATypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeESATypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeESATypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeESATypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeESATypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeESATypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeESATypeWithCompletion:")
    public native void readAttributeESATypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeESATypeWithCompletion") @NotNull Block_readAttributeESATypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeESATypeWithCompletion {
        @Generated
        void call_readAttributeESATypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
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
    @Selector("readAttributeForecastWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeForecastWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeForecastWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeForecastWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeForecastWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeForecastWithClusterStateCacheEndpointQueueCompletion(
                @Nullable MTRDeviceEnergyManagementClusterForecastStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeForecastWithCompletion:")
    public native void readAttributeForecastWithCompletion(
            @ObjCBlock(name = "call_readAttributeForecastWithCompletion") @NotNull Block_readAttributeForecastWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeForecastWithCompletion {
        @Generated
        void call_readAttributeForecastWithCompletion(@Nullable MTRDeviceEnergyManagementClusterForecastStruct value,
                @Nullable NSError error);
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
    @Selector("readAttributeOptOutStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOptOutStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOptOutStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOptOutStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOptOutStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOptOutStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeOptOutStateWithCompletion:")
    public native void readAttributeOptOutStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeOptOutStateWithCompletion") @NotNull Block_readAttributeOptOutStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOptOutStateWithCompletion {
        @Generated
        void call_readAttributeOptOutStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributePowerAdjustmentCapabilityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePowerAdjustmentCapabilityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePowerAdjustmentCapabilityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePowerAdjustmentCapabilityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerAdjustmentCapabilityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePowerAdjustmentCapabilityWithClusterStateCacheEndpointQueueCompletion(
                @Nullable MTRDeviceEnergyManagementClusterPowerAdjustCapabilityStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributePowerAdjustmentCapabilityWithCompletion:")
    public native void readAttributePowerAdjustmentCapabilityWithCompletion(
            @ObjCBlock(name = "call_readAttributePowerAdjustmentCapabilityWithCompletion") @NotNull Block_readAttributePowerAdjustmentCapabilityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePowerAdjustmentCapabilityWithCompletion {
        @Generated
        void call_readAttributePowerAdjustmentCapabilityWithCompletion(
                @Nullable MTRDeviceEnergyManagementClusterPowerAdjustCapabilityStruct value, @Nullable NSError error);
    }

    /**
     * Command RequestConstraintBasedForecast
     * 
     * Allows a client to ask the ESA to recompute its Forecast based on power and time constraints.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("requestConstraintBasedForecastWithParams:completion:")
    public native void requestConstraintBasedForecastWithParamsCompletion(
            @NotNull MTRDeviceEnergyManagementClusterRequestConstraintBasedForecastParams params,
            @ObjCBlock(name = "call_requestConstraintBasedForecastWithParamsCompletion") @NotNull Block_requestConstraintBasedForecastWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_requestConstraintBasedForecastWithParamsCompletion {
        @Generated
        void call_requestConstraintBasedForecastWithParamsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("resumeRequestWithCompletion:")
    public native void resumeRequestWithCompletion(
            @ObjCBlock(name = "call_resumeRequestWithCompletion") @NotNull Block_resumeRequestWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeRequestWithCompletion {
        @Generated
        void call_resumeRequestWithCompletion(@Nullable NSError error);
    }

    /**
     * Command ResumeRequest
     * 
     * Allows a client to cancel the PauseRequest command and enable earlier resumption of operation.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("resumeRequestWithParams:completion:")
    public native void resumeRequestWithParamsCompletion(
            @Nullable MTRDeviceEnergyManagementClusterResumeRequestParams params,
            @ObjCBlock(name = "call_resumeRequestWithParamsCompletion") @NotNull Block_resumeRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resumeRequestWithParamsCompletion {
        @Generated
        void call_resumeRequestWithParamsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

    /**
     * Command StartTimeAdjustRequest
     * 
     * Allows a client to adjust the start time of a Forecast sequence that has not yet started operation (i.e. where
     * the current Forecast StartTime is in the future).
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("startTimeAdjustRequestWithParams:completion:")
    public native void startTimeAdjustRequestWithParamsCompletion(
            @NotNull MTRDeviceEnergyManagementClusterStartTimeAdjustRequestParams params,
            @ObjCBlock(name = "call_startTimeAdjustRequestWithParamsCompletion") @NotNull Block_startTimeAdjustRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_startTimeAdjustRequestWithParamsCompletion {
        @Generated
        void call_startTimeAdjustRequestWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeAbsMaxPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAbsMaxPowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeAbsMinPowerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAbsMinPowerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
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
    @Selector("subscribeAttributeESACanGenerateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeESACanGenerateWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeESAStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeESAStateWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeESATypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeESATypeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
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
    @Selector("subscribeAttributeForecastWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeForecastWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable MTRDeviceEnergyManagementClusterForecastStruct value, @Nullable NSError error);
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
    @Selector("subscribeAttributeOptOutStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOptOutStateWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributePowerAdjustmentCapabilityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePowerAdjustmentCapabilityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable MTRDeviceEnergyManagementClusterPowerAdjustCapabilityStruct value, @Nullable NSError error);
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
}