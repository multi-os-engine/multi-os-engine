package apple.matter;

import apple.NSObject;
import apple.foundation.NSArray;
import apple.foundation.NSData;
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
 * Cluster Thread Border Router Management
 * 
 * Manage the Thread network of Thread Border Router
 * 
 * API-Since: 18.4
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterThreadBorderRouterManagement extends MTRGenericBaseCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterThreadBorderRouterManagement(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterThreadBorderRouterManagement alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterThreadBorderRouterManagement allocWithZone(VoidPtr zone);

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
     * API-Since: 18.4
     */
    @Generated
    @Selector("getActiveDatasetRequestWithCompletion:")
    public native void getActiveDatasetRequestWithCompletion(
            @ObjCBlock(name = "call_getActiveDatasetRequestWithCompletion") @NotNull Block_getActiveDatasetRequestWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getActiveDatasetRequestWithCompletion {
        @Generated
        void call_getActiveDatasetRequestWithCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    /**
     * Command GetActiveDatasetRequest
     * 
     * Command to request the active operational dataset of the Thread network to which the border router is connected.
     * This command must be sent over a valid CASE session
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("getActiveDatasetRequestWithParams:completion:")
    public native void getActiveDatasetRequestWithParamsCompletion(
            @Nullable MTRThreadBorderRouterManagementClusterGetActiveDatasetRequestParams params,
            @ObjCBlock(name = "call_getActiveDatasetRequestWithParamsCompletion") @NotNull Block_getActiveDatasetRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getActiveDatasetRequestWithParamsCompletion {
        @Generated
        void call_getActiveDatasetRequestWithParamsCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("getPendingDatasetRequestWithCompletion:")
    public native void getPendingDatasetRequestWithCompletion(
            @ObjCBlock(name = "call_getPendingDatasetRequestWithCompletion") @NotNull Block_getPendingDatasetRequestWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingDatasetRequestWithCompletion {
        @Generated
        void call_getPendingDatasetRequestWithCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    /**
     * Command GetPendingDatasetRequest
     * 
     * Command to request the pending dataset of the Thread network to which the border router is connected. This
     * command must be sent over a valid CASE session
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("getPendingDatasetRequestWithParams:completion:")
    public native void getPendingDatasetRequestWithParamsCompletion(
            @Nullable MTRThreadBorderRouterManagementClusterGetPendingDatasetRequestParams params,
            @ObjCBlock(name = "call_getPendingDatasetRequestWithParamsCompletion") @NotNull Block_getPendingDatasetRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_getPendingDatasetRequestWithParamsCompletion {
        @Generated
        void call_getPendingDatasetRequestWithParamsCompletion(
                @Nullable MTRThreadBorderRouterManagementClusterDatasetResponseParams data, @Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseClusterThreadBorderRouterManagement init();

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterThreadBorderRouterManagement initWithDeviceEndpointIDQueue(
            @NotNull MTRBaseDevice device, @NotNull NSNumber endpointID, @NotNull dispatch_queue_t queue);

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
    public static native MTRBaseClusterThreadBorderRouterManagement new_objc();

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
    @Selector("readAttributeActiveDatasetTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveDatasetTimestampWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveDatasetTimestampWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActiveDatasetTimestampWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveDatasetTimestampWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActiveDatasetTimestampWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeActiveDatasetTimestampWithCompletion:")
    public native void readAttributeActiveDatasetTimestampWithCompletion(
            @ObjCBlock(name = "call_readAttributeActiveDatasetTimestampWithCompletion") @NotNull Block_readAttributeActiveDatasetTimestampWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveDatasetTimestampWithCompletion {
        @Generated
        void call_readAttributeActiveDatasetTimestampWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
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
    @Selector("readAttributeBorderAgentIDWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBorderAgentIDWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBorderAgentIDWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBorderAgentIDWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBorderAgentIDWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBorderAgentIDWithClusterStateCacheEndpointQueueCompletion(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeBorderAgentIDWithCompletion:")
    public native void readAttributeBorderAgentIDWithCompletion(
            @ObjCBlock(name = "call_readAttributeBorderAgentIDWithCompletion") @NotNull Block_readAttributeBorderAgentIDWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBorderAgentIDWithCompletion {
        @Generated
        void call_readAttributeBorderAgentIDWithCompletion(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeBorderRouterNameWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBorderRouterNameWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBorderRouterNameWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBorderRouterNameWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBorderRouterNameWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBorderRouterNameWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeBorderRouterNameWithCompletion:")
    public native void readAttributeBorderRouterNameWithCompletion(
            @ObjCBlock(name = "call_readAttributeBorderRouterNameWithCompletion") @NotNull Block_readAttributeBorderRouterNameWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBorderRouterNameWithCompletion {
        @Generated
        void call_readAttributeBorderRouterNameWithCompletion(@Nullable String value, @Nullable NSError error);
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
    @Selector("readAttributeInterfaceEnabledWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInterfaceEnabledWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInterfaceEnabledWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInterfaceEnabledWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInterfaceEnabledWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInterfaceEnabledWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeInterfaceEnabledWithCompletion:")
    public native void readAttributeInterfaceEnabledWithCompletion(
            @ObjCBlock(name = "call_readAttributeInterfaceEnabledWithCompletion") @NotNull Block_readAttributeInterfaceEnabledWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInterfaceEnabledWithCompletion {
        @Generated
        void call_readAttributeInterfaceEnabledWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributePendingDatasetTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePendingDatasetTimestampWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePendingDatasetTimestampWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePendingDatasetTimestampWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePendingDatasetTimestampWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePendingDatasetTimestampWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributePendingDatasetTimestampWithCompletion:")
    public native void readAttributePendingDatasetTimestampWithCompletion(
            @ObjCBlock(name = "call_readAttributePendingDatasetTimestampWithCompletion") @NotNull Block_readAttributePendingDatasetTimestampWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePendingDatasetTimestampWithCompletion {
        @Generated
        void call_readAttributePendingDatasetTimestampWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeThreadVersionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeThreadVersionWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeThreadVersionWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeThreadVersionWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThreadVersionWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeThreadVersionWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("readAttributeThreadVersionWithCompletion:")
    public native void readAttributeThreadVersionWithCompletion(
            @ObjCBlock(name = "call_readAttributeThreadVersionWithCompletion") @NotNull Block_readAttributeThreadVersionWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeThreadVersionWithCompletion {
        @Generated
        void call_readAttributeThreadVersionWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("resolveClassMethod:")
    public static native boolean resolveClassMethod(SEL sel);

    @Generated
    @Selector("resolveInstanceMethod:")
    public static native boolean resolveInstanceMethod(SEL sel);

    /**
     * Command SetActiveDatasetRequest
     * 
     * Command to set or update the active Dataset of the Thread network to which the Border Router is connected.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setActiveDatasetRequestWithParams:completion:")
    public native void setActiveDatasetRequestWithParamsCompletion(
            @NotNull MTRThreadBorderRouterManagementClusterSetActiveDatasetRequestParams params,
            @ObjCBlock(name = "call_setActiveDatasetRequestWithParamsCompletion") @NotNull Block_setActiveDatasetRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setActiveDatasetRequestWithParamsCompletion {
        @Generated
        void call_setActiveDatasetRequestWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * Command SetPendingDatasetRequest
     * 
     * Command set or update the pending Dataset of the Thread network to which the Border Router is connected.
     * 
     * API-Since: 18.4
     */
    @Generated
    @Selector("setPendingDatasetRequestWithParams:completion:")
    public native void setPendingDatasetRequestWithParamsCompletion(
            @NotNull MTRThreadBorderRouterManagementClusterSetPendingDatasetRequestParams params,
            @ObjCBlock(name = "call_setPendingDatasetRequestWithParamsCompletion") @NotNull Block_setPendingDatasetRequestWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_setPendingDatasetRequestWithParamsCompletion {
        @Generated
        void call_setPendingDatasetRequestWithParamsCompletion(@Nullable NSError error);
    }

    @Generated
    @Selector("setVersion:")
    public static native void setVersion_static(@NInt long aVersion);

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
    @Selector("subscribeAttributeActiveDatasetTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActiveDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2(
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
    @Selector("subscribeAttributeBorderAgentIDWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBorderAgentIDWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeBorderRouterNameWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBorderRouterNameWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable String value, @Nullable NSError error);
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
    @Selector("subscribeAttributeInterfaceEnabledWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInterfaceEnabledWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributePendingDatasetTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePendingDatasetTimestampWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 18.4
     */
    @Generated
    @Selector("subscribeAttributeThreadVersionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeThreadVersionWithParamsSubscriptionEstablishedReportHandler_2(
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
}