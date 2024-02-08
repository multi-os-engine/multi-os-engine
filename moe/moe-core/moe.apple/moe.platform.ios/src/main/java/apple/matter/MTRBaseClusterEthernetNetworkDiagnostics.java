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
 * Cluster Ethernet Network Diagnostics
 * 
 * The Ethernet Network Diagnostics Cluster provides a means to acquire standardized diagnostics metrics that MAY be
 * used by a Node to assist a user or Administrative Node in diagnosing potential problems.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterEthernetNetworkDiagnostics extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterEthernetNetworkDiagnostics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterEthernetNetworkDiagnostics alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterEthernetNetworkDiagnostics allocWithZone(VoidPtr zone);

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
    public native MTRBaseClusterEthernetNetworkDiagnostics init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterEthernetNetworkDiagnostics initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device,
            char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterEthernetNetworkDiagnostics initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterEthernetNetworkDiagnostics new_objc();

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
     * Deprecated-Message: Please use readAttributeCarrierDetectWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCarrierDetectWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCarrierDetectWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCarrierDetectWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCarrierDetectWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCarrierDetectWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCarrierDetectWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCarrierDetectWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCarrierDetectWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCarrierDetectWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCarrierDetectWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCarrierDetectWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCarrierDetectWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCarrierDetectWithCompletion:")
    public native void readAttributeCarrierDetectWithCompletion(
            @ObjCBlock(name = "call_readAttributeCarrierDetectWithCompletion") @NotNull Block_readAttributeCarrierDetectWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCarrierDetectWithCompletion {
        @Generated
        void call_readAttributeCarrierDetectWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCarrierDetectWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCarrierDetectWithCompletionHandler:")
    public native void readAttributeCarrierDetectWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCarrierDetectWithCompletionHandler") @NotNull Block_readAttributeCarrierDetectWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCarrierDetectWithCompletionHandler {
        @Generated
        void call_readAttributeCarrierDetectWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeCollisionCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCollisionCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCollisionCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCollisionCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCollisionCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCollisionCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCollisionCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCollisionCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCollisionCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCollisionCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCollisionCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCollisionCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCollisionCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCollisionCountWithCompletion:")
    public native void readAttributeCollisionCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeCollisionCountWithCompletion") @NotNull Block_readAttributeCollisionCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCollisionCountWithCompletion {
        @Generated
        void call_readAttributeCollisionCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCollisionCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCollisionCountWithCompletionHandler:")
    public native void readAttributeCollisionCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCollisionCountWithCompletionHandler") @NotNull Block_readAttributeCollisionCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCollisionCountWithCompletionHandler {
        @Generated
        void call_readAttributeCollisionCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeFullDuplexWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFullDuplexWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeFullDuplexWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFullDuplexWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeFullDuplexWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFullDuplexWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeFullDuplexWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFullDuplexWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFullDuplexWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFullDuplexWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeFullDuplexWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFullDuplexWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeFullDuplexWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeFullDuplexWithCompletion:")
    public native void readAttributeFullDuplexWithCompletion(
            @ObjCBlock(name = "call_readAttributeFullDuplexWithCompletion") @NotNull Block_readAttributeFullDuplexWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFullDuplexWithCompletion {
        @Generated
        void call_readAttributeFullDuplexWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeFullDuplexWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFullDuplexWithCompletionHandler:")
    public native void readAttributeFullDuplexWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeFullDuplexWithCompletionHandler") @NotNull Block_readAttributeFullDuplexWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFullDuplexWithCompletionHandler {
        @Generated
        void call_readAttributeFullDuplexWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeOverrunCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOverrunCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOverrunCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOverrunCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOverrunCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverrunCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOverrunCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOverrunCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOverrunCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOverrunCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOverrunCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverrunCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOverrunCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOverrunCountWithCompletion:")
    public native void readAttributeOverrunCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeOverrunCountWithCompletion") @NotNull Block_readAttributeOverrunCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverrunCountWithCompletion {
        @Generated
        void call_readAttributeOverrunCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOverrunCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOverrunCountWithCompletionHandler:")
    public native void readAttributeOverrunCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOverrunCountWithCompletionHandler") @NotNull Block_readAttributeOverrunCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOverrunCountWithCompletionHandler {
        @Generated
        void call_readAttributeOverrunCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePHYRateWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePHYRateWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePHYRateWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePHYRateWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePHYRateWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePHYRateWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePHYRateWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePHYRateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePHYRateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePHYRateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePHYRateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePHYRateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePHYRateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePHYRateWithCompletion:")
    public native void readAttributePHYRateWithCompletion(
            @ObjCBlock(name = "call_readAttributePHYRateWithCompletion") @NotNull Block_readAttributePHYRateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePHYRateWithCompletion {
        @Generated
        void call_readAttributePHYRateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePHYRateWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePHYRateWithCompletionHandler:")
    public native void readAttributePHYRateWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePHYRateWithCompletionHandler") @NotNull Block_readAttributePHYRateWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePHYRateWithCompletionHandler {
        @Generated
        void call_readAttributePHYRateWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePacketRxCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePacketRxCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePacketRxCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePacketRxCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePacketRxCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketRxCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePacketRxCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePacketRxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketRxCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePacketRxCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePacketRxCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketRxCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePacketRxCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePacketRxCountWithCompletion:")
    public native void readAttributePacketRxCountWithCompletion(
            @ObjCBlock(name = "call_readAttributePacketRxCountWithCompletion") @NotNull Block_readAttributePacketRxCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketRxCountWithCompletion {
        @Generated
        void call_readAttributePacketRxCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePacketRxCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePacketRxCountWithCompletionHandler:")
    public native void readAttributePacketRxCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePacketRxCountWithCompletionHandler") @NotNull Block_readAttributePacketRxCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketRxCountWithCompletionHandler {
        @Generated
        void call_readAttributePacketRxCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePacketTxCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePacketTxCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePacketTxCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePacketTxCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePacketTxCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketTxCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePacketTxCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePacketTxCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePacketTxCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePacketTxCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePacketTxCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketTxCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePacketTxCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePacketTxCountWithCompletion:")
    public native void readAttributePacketTxCountWithCompletion(
            @ObjCBlock(name = "call_readAttributePacketTxCountWithCompletion") @NotNull Block_readAttributePacketTxCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketTxCountWithCompletion {
        @Generated
        void call_readAttributePacketTxCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePacketTxCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePacketTxCountWithCompletionHandler:")
    public native void readAttributePacketTxCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePacketTxCountWithCompletionHandler") @NotNull Block_readAttributePacketTxCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePacketTxCountWithCompletionHandler {
        @Generated
        void call_readAttributePacketTxCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTimeSinceResetWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTimeSinceResetWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTimeSinceResetWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTimeSinceResetWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTimeSinceResetWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimeSinceResetWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTimeSinceResetWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTimeSinceResetWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTimeSinceResetWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTimeSinceResetWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTimeSinceResetWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimeSinceResetWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTimeSinceResetWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTimeSinceResetWithCompletion:")
    public native void readAttributeTimeSinceResetWithCompletion(
            @ObjCBlock(name = "call_readAttributeTimeSinceResetWithCompletion") @NotNull Block_readAttributeTimeSinceResetWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimeSinceResetWithCompletion {
        @Generated
        void call_readAttributeTimeSinceResetWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTimeSinceResetWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTimeSinceResetWithCompletionHandler:")
    public native void readAttributeTimeSinceResetWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTimeSinceResetWithCompletionHandler") @NotNull Block_readAttributeTimeSinceResetWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimeSinceResetWithCompletionHandler {
        @Generated
        void call_readAttributeTimeSinceResetWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxErrCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxErrCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxErrCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxErrCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxErrCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrCountWithCompletion:")
    public native void readAttributeTxErrCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxErrCountWithCompletion") @NotNull Block_readAttributeTxErrCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCountWithCompletion {
        @Generated
        void call_readAttributeTxErrCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrCountWithCompletionHandler:")
    public native void readAttributeTxErrCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxErrCountWithCompletionHandler") @NotNull Block_readAttributeTxErrCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxErrCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("resetCountsWithCompletion:")
    public native void resetCountsWithCompletion(
            @ObjCBlock(name = "call_resetCountsWithCompletion") @NotNull Block_resetCountsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithCompletion {
        @Generated
        void call_resetCountsWithCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use resetCountsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("resetCountsWithCompletionHandler:")
    public native void resetCountsWithCompletionHandler(
            @ObjCBlock(name = "call_resetCountsWithCompletionHandler") @NotNull Block_resetCountsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithCompletionHandler {
        @Generated
        void call_resetCountsWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command ResetCounts
     * 
     * Reception of this command SHALL reset the attributes: PacketRxCount, PacketTxCount, TxErrCount, CollisionCount,
     * OverrunCount to 0
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("resetCountsWithParams:completion:")
    public native void resetCountsWithParamsCompletion(
            @Nullable MTREthernetNetworkDiagnosticsClusterResetCountsParams params,
            @ObjCBlock(name = "call_resetCountsWithParamsCompletion") @NotNull Block_resetCountsWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithParamsCompletion {
        @Generated
        void call_resetCountsWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use resetCountsWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("resetCountsWithParams:completionHandler:")
    public native void resetCountsWithParamsCompletionHandler(
            @Nullable MTREthernetNetworkDiagnosticsClusterResetCountsParams params,
            @ObjCBlock(name = "call_resetCountsWithParamsCompletionHandler") @NotNull Block_resetCountsWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_resetCountsWithParamsCompletionHandler {
        @Generated
        void call_resetCountsWithParamsCompletionHandler(@Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeCarrierDetectWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCarrierDetectWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCarrierDetectWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCarrierDetectWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCarrierDetectWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeCollisionCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCollisionCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCollisionCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCollisionCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCollisionCountWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeFullDuplexWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeFullDuplexWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeFullDuplexWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeFullDuplexWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeFullDuplexWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
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
     * Deprecated-Message: Please use subscribeAttributeOverrunCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOverrunCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOverrunCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOverrunCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOverrunCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePHYRateWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePHYRateWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePHYRateWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePHYRateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePHYRateWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePacketRxCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePacketRxCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePacketRxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePacketRxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePacketRxCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePacketTxCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePacketTxCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePacketTxCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePacketTxCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePacketTxCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTimeSinceResetWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTimeSinceResetWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTimeSinceResetWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTimeSinceResetWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTimeSinceResetWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxErrCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxErrCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxErrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxErrCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxErrCountWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
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