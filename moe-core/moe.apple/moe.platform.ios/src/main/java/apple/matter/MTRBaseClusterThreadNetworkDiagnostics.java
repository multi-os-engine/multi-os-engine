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
 * Cluster Thread Network Diagnostics
 * 
 * The Thread Network Diagnostics Cluster provides a means to acquire standardized diagnostics metrics that MAY be used
 * by a Node to assist a user or Administrative Node in diagnosing potential problems
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterThreadNetworkDiagnostics extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterThreadNetworkDiagnostics(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterThreadNetworkDiagnostics alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterThreadNetworkDiagnostics allocWithZone(VoidPtr zone);

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
    public native MTRBaseClusterThreadNetworkDiagnostics init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterThreadNetworkDiagnostics initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device,
            char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterThreadNetworkDiagnostics initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterThreadNetworkDiagnostics new_objc();

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
     * Deprecated-Message: Please use readAttributeActiveNetworkFaultsListWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveNetworkFaultsListWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActiveNetworkFaultsListWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveNetworkFaultsListWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActiveNetworkFaultsListWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveNetworkFaultsListWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActiveNetworkFaultsListWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveNetworkFaultsListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveNetworkFaultsListWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveNetworkFaultsListWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActiveNetworkFaultsListWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveNetworkFaultsListWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActiveNetworkFaultsListWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveNetworkFaultsListWithCompletion:")
    public native void readAttributeActiveNetworkFaultsListWithCompletion(
            @ObjCBlock(name = "call_readAttributeActiveNetworkFaultsListWithCompletion") @NotNull Block_readAttributeActiveNetworkFaultsListWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveNetworkFaultsListWithCompletion {
        @Generated
        void call_readAttributeActiveNetworkFaultsListWithCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActiveNetworkFaultsListWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveNetworkFaultsListWithCompletionHandler:")
    public native void readAttributeActiveNetworkFaultsListWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActiveNetworkFaultsListWithCompletionHandler") @NotNull Block_readAttributeActiveNetworkFaultsListWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveNetworkFaultsListWithCompletionHandler {
        @Generated
        void call_readAttributeActiveNetworkFaultsListWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActiveTimestampWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveTimestampWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeActiveTimestampWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveTimestampWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeActiveTimestampWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveTimestampWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeActiveTimestampWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeActiveTimestampWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeActiveTimestampWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeActiveTimestampWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveTimestampWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeActiveTimestampWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeActiveTimestampWithCompletion:")
    public native void readAttributeActiveTimestampWithCompletion(
            @ObjCBlock(name = "call_readAttributeActiveTimestampWithCompletion") @NotNull Block_readAttributeActiveTimestampWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveTimestampWithCompletion {
        @Generated
        void call_readAttributeActiveTimestampWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeActiveTimestampWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeActiveTimestampWithCompletionHandler:")
    public native void readAttributeActiveTimestampWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeActiveTimestampWithCompletionHandler") @NotNull Block_readAttributeActiveTimestampWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeActiveTimestampWithCompletionHandler {
        @Generated
        void call_readAttributeActiveTimestampWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAttachAttemptCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAttachAttemptCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAttachAttemptCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeAttachAttemptCountWithCompletion:")
    public native void readAttributeAttachAttemptCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeAttachAttemptCountWithCompletion") @NotNull Block_readAttributeAttachAttemptCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttachAttemptCountWithCompletion {
        @Generated
        void call_readAttributeAttachAttemptCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeAttachAttemptCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeAttachAttemptCountWithCompletionHandler:")
    public native void readAttributeAttachAttemptCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeAttachAttemptCountWithCompletionHandler") @NotNull Block_readAttributeAttachAttemptCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAttachAttemptCountWithCompletionHandler {
        @Generated
        void call_readAttributeAttachAttemptCountWithCompletionHandler(@Nullable NSNumber value,
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
     * Deprecated-Message: Please use
     * readAttributeBetterPartitionAttachAttemptCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBetterPartitionAttachAttemptCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBetterPartitionAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBetterPartitionAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBetterPartitionAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBetterPartitionAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBetterPartitionAttachAttemptCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBetterPartitionAttachAttemptCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBetterPartitionAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBetterPartitionAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBetterPartitionAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBetterPartitionAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBetterPartitionAttachAttemptCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBetterPartitionAttachAttemptCountWithCompletion:")
    public native void readAttributeBetterPartitionAttachAttemptCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeBetterPartitionAttachAttemptCountWithCompletion") @NotNull Block_readAttributeBetterPartitionAttachAttemptCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBetterPartitionAttachAttemptCountWithCompletion {
        @Generated
        void call_readAttributeBetterPartitionAttachAttemptCountWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBetterPartitionAttachAttemptCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBetterPartitionAttachAttemptCountWithCompletionHandler:")
    public native void readAttributeBetterPartitionAttachAttemptCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBetterPartitionAttachAttemptCountWithCompletionHandler") @NotNull Block_readAttributeBetterPartitionAttachAttemptCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBetterPartitionAttachAttemptCountWithCompletionHandler {
        @Generated
        void call_readAttributeBetterPartitionAttachAttemptCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeChannelPage0MaskWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeChannelPage0MaskWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeChannelPage0MaskWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeChannelPage0MaskWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeChannelPage0MaskWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelPage0MaskWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeChannelPage0MaskWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeChannelPage0MaskWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChannelPage0MaskWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeChannelPage0MaskWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeChannelPage0MaskWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelPage0MaskWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeChannelPage0MaskWithClusterStateCacheEndpointQueueCompletion(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeChannelPage0MaskWithCompletion:")
    public native void readAttributeChannelPage0MaskWithCompletion(
            @ObjCBlock(name = "call_readAttributeChannelPage0MaskWithCompletion") @NotNull Block_readAttributeChannelPage0MaskWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelPage0MaskWithCompletion {
        @Generated
        void call_readAttributeChannelPage0MaskWithCompletion(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeChannelPage0MaskWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeChannelPage0MaskWithCompletionHandler:")
    public native void readAttributeChannelPage0MaskWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeChannelPage0MaskWithCompletionHandler") @NotNull Block_readAttributeChannelPage0MaskWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelPage0MaskWithCompletionHandler {
        @Generated
        void call_readAttributeChannelPage0MaskWithCompletionHandler(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeChannelWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeChannelWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeChannelWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeChannelWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeChannelWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeChannelWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeChannelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChannelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeChannelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeChannelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeChannelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeChannelWithCompletion:")
    public native void readAttributeChannelWithCompletion(
            @ObjCBlock(name = "call_readAttributeChannelWithCompletion") @NotNull Block_readAttributeChannelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelWithCompletion {
        @Generated
        void call_readAttributeChannelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeChannelWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeChannelWithCompletionHandler:")
    public native void readAttributeChannelWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeChannelWithCompletionHandler") @NotNull Block_readAttributeChannelWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChannelWithCompletionHandler {
        @Generated
        void call_readAttributeChannelWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeChildRoleCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeChildRoleCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeChildRoleCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeChildRoleCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeChildRoleCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChildRoleCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeChildRoleCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeChildRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeChildRoleCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeChildRoleCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeChildRoleCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChildRoleCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeChildRoleCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeChildRoleCountWithCompletion:")
    public native void readAttributeChildRoleCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeChildRoleCountWithCompletion") @NotNull Block_readAttributeChildRoleCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChildRoleCountWithCompletion {
        @Generated
        void call_readAttributeChildRoleCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeChildRoleCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeChildRoleCountWithCompletionHandler:")
    public native void readAttributeChildRoleCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeChildRoleCountWithCompletionHandler") @NotNull Block_readAttributeChildRoleCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeChildRoleCountWithCompletionHandler {
        @Generated
        void call_readAttributeChildRoleCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeDataVersionWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDataVersionWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDataVersionWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDataVersionWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDataVersionWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDataVersionWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDataVersionWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDataVersionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDataVersionWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDataVersionWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDataVersionWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDataVersionWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDataVersionWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDataVersionWithCompletion:")
    public native void readAttributeDataVersionWithCompletion(
            @ObjCBlock(name = "call_readAttributeDataVersionWithCompletion") @NotNull Block_readAttributeDataVersionWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDataVersionWithCompletion {
        @Generated
        void call_readAttributeDataVersionWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDataVersionWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDataVersionWithCompletionHandler:")
    public native void readAttributeDataVersionWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDataVersionWithCompletionHandler") @NotNull Block_readAttributeDataVersionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDataVersionWithCompletionHandler {
        @Generated
        void call_readAttributeDataVersionWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDelayWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDelayWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDelayWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDelayWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDelayWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDelayWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDelayWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDelayWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDelayWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDelayWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDelayWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDelayWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDelayWithCompletion:")
    public native void readAttributeDelayWithCompletion(
            @ObjCBlock(name = "call_readAttributeDelayWithCompletion") @NotNull Block_readAttributeDelayWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDelayWithCompletion {
        @Generated
        void call_readAttributeDelayWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDelayWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDelayWithCompletionHandler:")
    public native void readAttributeDelayWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDelayWithCompletionHandler") @NotNull Block_readAttributeDelayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDelayWithCompletionHandler {
        @Generated
        void call_readAttributeDelayWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDetachedRoleCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDetachedRoleCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeDetachedRoleCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDetachedRoleCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeDetachedRoleCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDetachedRoleCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeDetachedRoleCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDetachedRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDetachedRoleCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDetachedRoleCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDetachedRoleCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDetachedRoleCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDetachedRoleCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeDetachedRoleCountWithCompletion:")
    public native void readAttributeDetachedRoleCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeDetachedRoleCountWithCompletion") @NotNull Block_readAttributeDetachedRoleCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDetachedRoleCountWithCompletion {
        @Generated
        void call_readAttributeDetachedRoleCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeDetachedRoleCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeDetachedRoleCountWithCompletionHandler:")
    public native void readAttributeDetachedRoleCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeDetachedRoleCountWithCompletionHandler") @NotNull Block_readAttributeDetachedRoleCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDetachedRoleCountWithCompletionHandler {
        @Generated
        void call_readAttributeDetachedRoleCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeExtendedPanIdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeExtendedPanIdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeExtendedPanIdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeExtendedPanIdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeExtendedPanIdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExtendedPanIdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeExtendedPanIdWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeExtendedPanIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeExtendedPanIdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeExtendedPanIdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeExtendedPanIdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExtendedPanIdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeExtendedPanIdWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeExtendedPanIdWithCompletion:")
    public native void readAttributeExtendedPanIdWithCompletion(
            @ObjCBlock(name = "call_readAttributeExtendedPanIdWithCompletion") @NotNull Block_readAttributeExtendedPanIdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExtendedPanIdWithCompletion {
        @Generated
        void call_readAttributeExtendedPanIdWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeExtendedPanIdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeExtendedPanIdWithCompletionHandler:")
    public native void readAttributeExtendedPanIdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeExtendedPanIdWithCompletionHandler") @NotNull Block_readAttributeExtendedPanIdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeExtendedPanIdWithCompletionHandler {
        @Generated
        void call_readAttributeExtendedPanIdWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeLeaderRoleCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLeaderRoleCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLeaderRoleCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLeaderRoleCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLeaderRoleCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRoleCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLeaderRoleCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLeaderRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLeaderRoleCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLeaderRoleCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLeaderRoleCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRoleCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLeaderRoleCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLeaderRoleCountWithCompletion:")
    public native void readAttributeLeaderRoleCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeLeaderRoleCountWithCompletion") @NotNull Block_readAttributeLeaderRoleCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRoleCountWithCompletion {
        @Generated
        void call_readAttributeLeaderRoleCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLeaderRoleCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLeaderRoleCountWithCompletionHandler:")
    public native void readAttributeLeaderRoleCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLeaderRoleCountWithCompletionHandler") @NotNull Block_readAttributeLeaderRoleCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRoleCountWithCompletionHandler {
        @Generated
        void call_readAttributeLeaderRoleCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLeaderRouterIdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLeaderRouterIdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLeaderRouterIdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLeaderRouterIdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLeaderRouterIdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRouterIdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLeaderRouterIdWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLeaderRouterIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLeaderRouterIdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLeaderRouterIdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLeaderRouterIdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRouterIdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLeaderRouterIdWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLeaderRouterIdWithCompletion:")
    public native void readAttributeLeaderRouterIdWithCompletion(
            @ObjCBlock(name = "call_readAttributeLeaderRouterIdWithCompletion") @NotNull Block_readAttributeLeaderRouterIdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRouterIdWithCompletion {
        @Generated
        void call_readAttributeLeaderRouterIdWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLeaderRouterIdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLeaderRouterIdWithCompletionHandler:")
    public native void readAttributeLeaderRouterIdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLeaderRouterIdWithCompletionHandler") @NotNull Block_readAttributeLeaderRouterIdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLeaderRouterIdWithCompletionHandler {
        @Generated
        void call_readAttributeLeaderRouterIdWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeshLocalPrefixWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeshLocalPrefixWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMeshLocalPrefixWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeshLocalPrefixWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMeshLocalPrefixWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeshLocalPrefixWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMeshLocalPrefixWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeshLocalPrefixWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMeshLocalPrefixWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMeshLocalPrefixWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMeshLocalPrefixWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeshLocalPrefixWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMeshLocalPrefixWithClusterStateCacheEndpointQueueCompletion(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMeshLocalPrefixWithCompletion:")
    public native void readAttributeMeshLocalPrefixWithCompletion(
            @ObjCBlock(name = "call_readAttributeMeshLocalPrefixWithCompletion") @NotNull Block_readAttributeMeshLocalPrefixWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeshLocalPrefixWithCompletion {
        @Generated
        void call_readAttributeMeshLocalPrefixWithCompletion(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMeshLocalPrefixWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMeshLocalPrefixWithCompletionHandler:")
    public native void readAttributeMeshLocalPrefixWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMeshLocalPrefixWithCompletionHandler") @NotNull Block_readAttributeMeshLocalPrefixWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMeshLocalPrefixWithCompletionHandler {
        @Generated
        void call_readAttributeMeshLocalPrefixWithCompletionHandler(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNeighborTableWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNeighborTableListWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNeighborTableListWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNeighborTableListWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNeighborTableListWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeighborTableListWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNeighborTableListWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNeighborTableWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNeighborTableListWithCompletionHandler:")
    public native void readAttributeNeighborTableListWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNeighborTableListWithCompletionHandler") @NotNull Block_readAttributeNeighborTableListWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeighborTableListWithCompletionHandler {
        @Generated
        void call_readAttributeNeighborTableListWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNeighborTableWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNeighborTableWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNeighborTableWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNeighborTableWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeighborTableWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNeighborTableWithClusterStateCacheEndpointQueueCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNeighborTableWithCompletion:")
    public native void readAttributeNeighborTableWithCompletion(
            @ObjCBlock(name = "call_readAttributeNeighborTableWithCompletion") @NotNull Block_readAttributeNeighborTableWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNeighborTableWithCompletion {
        @Generated
        void call_readAttributeNeighborTableWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNetworkNameWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNetworkNameWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNetworkNameWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNetworkNameWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNetworkNameWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNetworkNameWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNetworkNameWithAttributeCacheEndpointQueueCompletionHandler(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNetworkNameWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNetworkNameWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNetworkNameWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNetworkNameWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNetworkNameWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNetworkNameWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNetworkNameWithCompletion:")
    public native void readAttributeNetworkNameWithCompletion(
            @ObjCBlock(name = "call_readAttributeNetworkNameWithCompletion") @NotNull Block_readAttributeNetworkNameWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNetworkNameWithCompletion {
        @Generated
        void call_readAttributeNetworkNameWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNetworkNameWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNetworkNameWithCompletionHandler:")
    public native void readAttributeNetworkNameWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNetworkNameWithCompletionHandler") @NotNull Block_readAttributeNetworkNameWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNetworkNameWithCompletionHandler {
        @Generated
        void call_readAttributeNetworkNameWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeOperationalDatasetComponentsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOperationalDatasetComponentsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOperationalDatasetComponentsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOperationalDatasetComponentsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOperationalDatasetComponentsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalDatasetComponentsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOperationalDatasetComponentsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOperationalDatasetComponentsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperationalDatasetComponentsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOperationalDatasetComponentsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOperationalDatasetComponentsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalDatasetComponentsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOperationalDatasetComponentsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOperationalDatasetComponentsWithCompletion:")
    public native void readAttributeOperationalDatasetComponentsWithCompletion(
            @ObjCBlock(name = "call_readAttributeOperationalDatasetComponentsWithCompletion") @NotNull Block_readAttributeOperationalDatasetComponentsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalDatasetComponentsWithCompletion {
        @Generated
        void call_readAttributeOperationalDatasetComponentsWithCompletion(
                @Nullable MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOperationalDatasetComponentsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOperationalDatasetComponentsWithCompletionHandler:")
    public native void readAttributeOperationalDatasetComponentsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOperationalDatasetComponentsWithCompletionHandler") @NotNull Block_readAttributeOperationalDatasetComponentsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalDatasetComponentsWithCompletionHandler {
        @Generated
        void call_readAttributeOperationalDatasetComponentsWithCompletionHandler(
                @Nullable MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents value,
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
     * Deprecated-Message: Please use readAttributePanIdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePanIdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePanIdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePanIdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePanIdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePanIdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePanIdWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePanIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePanIdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePanIdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePanIdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePanIdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePanIdWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePanIdWithCompletion:")
    public native void readAttributePanIdWithCompletion(
            @ObjCBlock(name = "call_readAttributePanIdWithCompletion") @NotNull Block_readAttributePanIdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePanIdWithCompletion {
        @Generated
        void call_readAttributePanIdWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePanIdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePanIdWithCompletionHandler:")
    public native void readAttributePanIdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePanIdWithCompletionHandler") @NotNull Block_readAttributePanIdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePanIdWithCompletionHandler {
        @Generated
        void call_readAttributePanIdWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeParentChangeCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeParentChangeCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeParentChangeCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeParentChangeCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeParentChangeCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeParentChangeCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeParentChangeCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeParentChangeCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeParentChangeCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeParentChangeCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeParentChangeCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeParentChangeCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeParentChangeCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeParentChangeCountWithCompletion:")
    public native void readAttributeParentChangeCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeParentChangeCountWithCompletion") @NotNull Block_readAttributeParentChangeCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeParentChangeCountWithCompletion {
        @Generated
        void call_readAttributeParentChangeCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeParentChangeCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeParentChangeCountWithCompletionHandler:")
    public native void readAttributeParentChangeCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeParentChangeCountWithCompletionHandler") @NotNull Block_readAttributeParentChangeCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeParentChangeCountWithCompletionHandler {
        @Generated
        void call_readAttributeParentChangeCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePartitionIdChangeCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePartitionIdChangeCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePartitionIdChangeCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePartitionIdChangeCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePartitionIdChangeCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdChangeCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePartitionIdChangeCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePartitionIdChangeCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePartitionIdChangeCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePartitionIdChangeCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePartitionIdChangeCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdChangeCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePartitionIdChangeCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePartitionIdChangeCountWithCompletion:")
    public native void readAttributePartitionIdChangeCountWithCompletion(
            @ObjCBlock(name = "call_readAttributePartitionIdChangeCountWithCompletion") @NotNull Block_readAttributePartitionIdChangeCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdChangeCountWithCompletion {
        @Generated
        void call_readAttributePartitionIdChangeCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePartitionIdChangeCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePartitionIdChangeCountWithCompletionHandler:")
    public native void readAttributePartitionIdChangeCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePartitionIdChangeCountWithCompletionHandler") @NotNull Block_readAttributePartitionIdChangeCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdChangeCountWithCompletionHandler {
        @Generated
        void call_readAttributePartitionIdChangeCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePartitionIdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePartitionIdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePartitionIdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePartitionIdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePartitionIdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePartitionIdWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePartitionIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePartitionIdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePartitionIdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePartitionIdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePartitionIdWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePartitionIdWithCompletion:")
    public native void readAttributePartitionIdWithCompletion(
            @ObjCBlock(name = "call_readAttributePartitionIdWithCompletion") @NotNull Block_readAttributePartitionIdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdWithCompletion {
        @Generated
        void call_readAttributePartitionIdWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePartitionIdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePartitionIdWithCompletionHandler:")
    public native void readAttributePartitionIdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePartitionIdWithCompletionHandler") @NotNull Block_readAttributePartitionIdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePartitionIdWithCompletionHandler {
        @Generated
        void call_readAttributePartitionIdWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePendingTimestampWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePendingTimestampWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePendingTimestampWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePendingTimestampWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePendingTimestampWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePendingTimestampWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePendingTimestampWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePendingTimestampWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePendingTimestampWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePendingTimestampWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePendingTimestampWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePendingTimestampWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePendingTimestampWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePendingTimestampWithCompletion:")
    public native void readAttributePendingTimestampWithCompletion(
            @ObjCBlock(name = "call_readAttributePendingTimestampWithCompletion") @NotNull Block_readAttributePendingTimestampWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePendingTimestampWithCompletion {
        @Generated
        void call_readAttributePendingTimestampWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePendingTimestampWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePendingTimestampWithCompletionHandler:")
    public native void readAttributePendingTimestampWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePendingTimestampWithCompletionHandler") @NotNull Block_readAttributePendingTimestampWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePendingTimestampWithCompletionHandler {
        @Generated
        void call_readAttributePendingTimestampWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRouteTableWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRouteTableListWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRouteTableListWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRouteTableListWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRouteTableListWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouteTableListWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRouteTableListWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRouteTableWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRouteTableListWithCompletionHandler:")
    public native void readAttributeRouteTableListWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRouteTableListWithCompletionHandler") @NotNull Block_readAttributeRouteTableListWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouteTableListWithCompletionHandler {
        @Generated
        void call_readAttributeRouteTableListWithCompletionHandler(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRouteTableWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRouteTableWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRouteTableWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRouteTableWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouteTableWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRouteTableWithClusterStateCacheEndpointQueueCompletion(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRouteTableWithCompletion:")
    public native void readAttributeRouteTableWithCompletion(
            @ObjCBlock(name = "call_readAttributeRouteTableWithCompletion") @NotNull Block_readAttributeRouteTableWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouteTableWithCompletion {
        @Generated
        void call_readAttributeRouteTableWithCompletion(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRouterRoleCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRouterRoleCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRouterRoleCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRouterRoleCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRouterRoleCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouterRoleCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRouterRoleCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRouterRoleCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRouterRoleCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRouterRoleCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRouterRoleCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouterRoleCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRouterRoleCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRouterRoleCountWithCompletion:")
    public native void readAttributeRouterRoleCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRouterRoleCountWithCompletion") @NotNull Block_readAttributeRouterRoleCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouterRoleCountWithCompletion {
        @Generated
        void call_readAttributeRouterRoleCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRouterRoleCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRouterRoleCountWithCompletionHandler:")
    public native void readAttributeRouterRoleCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRouterRoleCountWithCompletionHandler") @NotNull Block_readAttributeRouterRoleCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRouterRoleCountWithCompletionHandler {
        @Generated
        void call_readAttributeRouterRoleCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRoutingRoleWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRoutingRoleWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRoutingRoleWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRoutingRoleWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRoutingRoleWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRoutingRoleWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRoutingRoleWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRoutingRoleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRoutingRoleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRoutingRoleWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRoutingRoleWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRoutingRoleWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRoutingRoleWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRoutingRoleWithCompletion:")
    public native void readAttributeRoutingRoleWithCompletion(
            @ObjCBlock(name = "call_readAttributeRoutingRoleWithCompletion") @NotNull Block_readAttributeRoutingRoleWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRoutingRoleWithCompletion {
        @Generated
        void call_readAttributeRoutingRoleWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRoutingRoleWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRoutingRoleWithCompletionHandler:")
    public native void readAttributeRoutingRoleWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRoutingRoleWithCompletionHandler") @NotNull Block_readAttributeRoutingRoleWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRoutingRoleWithCompletionHandler {
        @Generated
        void call_readAttributeRoutingRoleWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxAddressFilteredCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxAddressFilteredCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxAddressFilteredCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxAddressFilteredCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxAddressFilteredCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxAddressFilteredCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxAddressFilteredCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxAddressFilteredCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxAddressFilteredCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxAddressFilteredCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxAddressFilteredCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxAddressFilteredCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxAddressFilteredCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxAddressFilteredCountWithCompletion:")
    public native void readAttributeRxAddressFilteredCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxAddressFilteredCountWithCompletion") @NotNull Block_readAttributeRxAddressFilteredCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxAddressFilteredCountWithCompletion {
        @Generated
        void call_readAttributeRxAddressFilteredCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxAddressFilteredCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxAddressFilteredCountWithCompletionHandler:")
    public native void readAttributeRxAddressFilteredCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxAddressFilteredCountWithCompletionHandler") @NotNull Block_readAttributeRxAddressFilteredCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxAddressFilteredCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxAddressFilteredCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxBeaconCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxBeaconCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxBeaconCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxBeaconCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxBeaconCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxBeaconCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxBeaconCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxBeaconCountWithCompletion:")
    public native void readAttributeRxBeaconCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxBeaconCountWithCompletion") @NotNull Block_readAttributeRxBeaconCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconCountWithCompletion {
        @Generated
        void call_readAttributeRxBeaconCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxBeaconCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxBeaconCountWithCompletionHandler:")
    public native void readAttributeRxBeaconCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxBeaconCountWithCompletionHandler") @NotNull Block_readAttributeRxBeaconCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxBeaconCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxBeaconRequestCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxBeaconRequestCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxBeaconRequestCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxBeaconRequestCountWithCompletion:")
    public native void readAttributeRxBeaconRequestCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxBeaconRequestCountWithCompletion") @NotNull Block_readAttributeRxBeaconRequestCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconRequestCountWithCompletion {
        @Generated
        void call_readAttributeRxBeaconRequestCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxBeaconRequestCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxBeaconRequestCountWithCompletionHandler:")
    public native void readAttributeRxBeaconRequestCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxBeaconRequestCountWithCompletionHandler") @NotNull Block_readAttributeRxBeaconRequestCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBeaconRequestCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxBeaconRequestCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxBroadcastCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxBroadcastCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxBroadcastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxBroadcastCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxBroadcastCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxBroadcastCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBroadcastCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxBroadcastCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxBroadcastCountWithCompletion:")
    public native void readAttributeRxBroadcastCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxBroadcastCountWithCompletion") @NotNull Block_readAttributeRxBroadcastCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBroadcastCountWithCompletion {
        @Generated
        void call_readAttributeRxBroadcastCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxBroadcastCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxBroadcastCountWithCompletionHandler:")
    public native void readAttributeRxBroadcastCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxBroadcastCountWithCompletionHandler") @NotNull Block_readAttributeRxBroadcastCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxBroadcastCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxBroadcastCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDataCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDataCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxDataCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDataCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxDataCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxDataCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDataCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDataCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDataCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxDataCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxDataCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDataCountWithCompletion:")
    public native void readAttributeRxDataCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxDataCountWithCompletion") @NotNull Block_readAttributeRxDataCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataCountWithCompletion {
        @Generated
        void call_readAttributeRxDataCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDataCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDataCountWithCompletionHandler:")
    public native void readAttributeRxDataCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxDataCountWithCompletionHandler") @NotNull Block_readAttributeRxDataCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxDataCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDataPollCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDataPollCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDataPollCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDataPollCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDataPollCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxDataPollCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataPollCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxDataPollCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDataPollCountWithCompletion:")
    public native void readAttributeRxDataPollCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxDataPollCountWithCompletion") @NotNull Block_readAttributeRxDataPollCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataPollCountWithCompletion {
        @Generated
        void call_readAttributeRxDataPollCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDataPollCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDataPollCountWithCompletionHandler:")
    public native void readAttributeRxDataPollCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxDataPollCountWithCompletionHandler") @NotNull Block_readAttributeRxDataPollCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDataPollCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxDataPollCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDestAddrFilteredCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDestAddrFilteredCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxDestAddrFilteredCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDestAddrFilteredCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxDestAddrFilteredCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDestAddrFilteredCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxDestAddrFilteredCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDestAddrFilteredCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDestAddrFilteredCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDestAddrFilteredCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxDestAddrFilteredCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDestAddrFilteredCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxDestAddrFilteredCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDestAddrFilteredCountWithCompletion:")
    public native void readAttributeRxDestAddrFilteredCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxDestAddrFilteredCountWithCompletion") @NotNull Block_readAttributeRxDestAddrFilteredCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDestAddrFilteredCountWithCompletion {
        @Generated
        void call_readAttributeRxDestAddrFilteredCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDestAddrFilteredCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDestAddrFilteredCountWithCompletionHandler:")
    public native void readAttributeRxDestAddrFilteredCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxDestAddrFilteredCountWithCompletionHandler") @NotNull Block_readAttributeRxDestAddrFilteredCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDestAddrFilteredCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxDestAddrFilteredCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDuplicatedCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDuplicatedCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxDuplicatedCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDuplicatedCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxDuplicatedCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDuplicatedCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxDuplicatedCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDuplicatedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxDuplicatedCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxDuplicatedCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxDuplicatedCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDuplicatedCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxDuplicatedCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxDuplicatedCountWithCompletion:")
    public native void readAttributeRxDuplicatedCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxDuplicatedCountWithCompletion") @NotNull Block_readAttributeRxDuplicatedCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDuplicatedCountWithCompletion {
        @Generated
        void call_readAttributeRxDuplicatedCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxDuplicatedCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxDuplicatedCountWithCompletionHandler:")
    public native void readAttributeRxDuplicatedCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxDuplicatedCountWithCompletionHandler") @NotNull Block_readAttributeRxDuplicatedCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxDuplicatedCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxDuplicatedCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrFcsCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrFcsCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxErrFcsCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrFcsCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxErrFcsCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrFcsCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxErrFcsCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrFcsCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrFcsCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrFcsCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxErrFcsCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrFcsCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxErrFcsCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrFcsCountWithCompletion:")
    public native void readAttributeRxErrFcsCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxErrFcsCountWithCompletion") @NotNull Block_readAttributeRxErrFcsCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrFcsCountWithCompletion {
        @Generated
        void call_readAttributeRxErrFcsCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrFcsCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrFcsCountWithCompletionHandler:")
    public native void readAttributeRxErrFcsCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxErrFcsCountWithCompletionHandler") @NotNull Block_readAttributeRxErrFcsCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrFcsCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxErrFcsCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrInvalidSrcAddrCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrInvalidSrcAddrCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxErrInvalidSrcAddrCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrInvalidSrcAddrCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxErrInvalidSrcAddrCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrInvalidSrcAddrCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxErrInvalidSrcAddrCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrInvalidSrcAddrCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrInvalidSrcAddrCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrInvalidSrcAddrCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxErrInvalidSrcAddrCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrInvalidSrcAddrCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxErrInvalidSrcAddrCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrInvalidSrcAddrCountWithCompletion:")
    public native void readAttributeRxErrInvalidSrcAddrCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxErrInvalidSrcAddrCountWithCompletion") @NotNull Block_readAttributeRxErrInvalidSrcAddrCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrInvalidSrcAddrCountWithCompletion {
        @Generated
        void call_readAttributeRxErrInvalidSrcAddrCountWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrInvalidSrcAddrCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrInvalidSrcAddrCountWithCompletionHandler:")
    public native void readAttributeRxErrInvalidSrcAddrCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxErrInvalidSrcAddrCountWithCompletionHandler") @NotNull Block_readAttributeRxErrInvalidSrcAddrCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrInvalidSrcAddrCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxErrInvalidSrcAddrCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrNoFrameCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrNoFrameCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxErrNoFrameCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrNoFrameCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxErrNoFrameCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrNoFrameCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxErrNoFrameCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrNoFrameCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrNoFrameCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrNoFrameCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxErrNoFrameCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrNoFrameCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxErrNoFrameCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrNoFrameCountWithCompletion:")
    public native void readAttributeRxErrNoFrameCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxErrNoFrameCountWithCompletion") @NotNull Block_readAttributeRxErrNoFrameCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrNoFrameCountWithCompletion {
        @Generated
        void call_readAttributeRxErrNoFrameCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrNoFrameCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrNoFrameCountWithCompletionHandler:")
    public native void readAttributeRxErrNoFrameCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxErrNoFrameCountWithCompletionHandler") @NotNull Block_readAttributeRxErrNoFrameCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrNoFrameCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxErrNoFrameCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrOtherCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrOtherCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxErrOtherCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrOtherCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxErrOtherCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrOtherCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxErrOtherCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrOtherCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrOtherCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrOtherCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxErrOtherCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrOtherCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxErrOtherCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrOtherCountWithCompletion:")
    public native void readAttributeRxErrOtherCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxErrOtherCountWithCompletion") @NotNull Block_readAttributeRxErrOtherCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrOtherCountWithCompletion {
        @Generated
        void call_readAttributeRxErrOtherCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrOtherCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrOtherCountWithCompletionHandler:")
    public native void readAttributeRxErrOtherCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxErrOtherCountWithCompletionHandler") @NotNull Block_readAttributeRxErrOtherCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrOtherCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxErrOtherCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrSecCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrSecCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxErrSecCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrSecCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxErrSecCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrSecCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxErrSecCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrSecCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrSecCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrSecCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxErrSecCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrSecCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxErrSecCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrSecCountWithCompletion:")
    public native void readAttributeRxErrSecCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxErrSecCountWithCompletion") @NotNull Block_readAttributeRxErrSecCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrSecCountWithCompletion {
        @Generated
        void call_readAttributeRxErrSecCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrSecCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrSecCountWithCompletionHandler:")
    public native void readAttributeRxErrSecCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxErrSecCountWithCompletionHandler") @NotNull Block_readAttributeRxErrSecCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrSecCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxErrSecCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeRxErrUnknownNeighborCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrUnknownNeighborCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxErrUnknownNeighborCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrUnknownNeighborCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxErrUnknownNeighborCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrUnknownNeighborCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxErrUnknownNeighborCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrUnknownNeighborCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxErrUnknownNeighborCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxErrUnknownNeighborCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxErrUnknownNeighborCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrUnknownNeighborCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxErrUnknownNeighborCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxErrUnknownNeighborCountWithCompletion:")
    public native void readAttributeRxErrUnknownNeighborCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxErrUnknownNeighborCountWithCompletion") @NotNull Block_readAttributeRxErrUnknownNeighborCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrUnknownNeighborCountWithCompletion {
        @Generated
        void call_readAttributeRxErrUnknownNeighborCountWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxErrUnknownNeighborCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxErrUnknownNeighborCountWithCompletionHandler:")
    public native void readAttributeRxErrUnknownNeighborCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxErrUnknownNeighborCountWithCompletionHandler") @NotNull Block_readAttributeRxErrUnknownNeighborCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxErrUnknownNeighborCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxErrUnknownNeighborCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxOtherCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxOtherCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxOtherCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxOtherCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxOtherCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxOtherCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxOtherCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxOtherCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxOtherCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxOtherCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxOtherCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxOtherCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxOtherCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxOtherCountWithCompletion:")
    public native void readAttributeRxOtherCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxOtherCountWithCompletion") @NotNull Block_readAttributeRxOtherCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxOtherCountWithCompletion {
        @Generated
        void call_readAttributeRxOtherCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxOtherCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxOtherCountWithCompletionHandler:")
    public native void readAttributeRxOtherCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxOtherCountWithCompletionHandler") @NotNull Block_readAttributeRxOtherCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxOtherCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxOtherCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxTotalCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxTotalCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxTotalCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxTotalCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxTotalCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxTotalCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxTotalCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxTotalCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxTotalCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxTotalCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxTotalCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxTotalCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxTotalCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxTotalCountWithCompletion:")
    public native void readAttributeRxTotalCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxTotalCountWithCompletion") @NotNull Block_readAttributeRxTotalCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxTotalCountWithCompletion {
        @Generated
        void call_readAttributeRxTotalCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxTotalCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxTotalCountWithCompletionHandler:")
    public native void readAttributeRxTotalCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxTotalCountWithCompletionHandler") @NotNull Block_readAttributeRxTotalCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxTotalCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxTotalCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxUnicastCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxUnicastCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxUnicastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRxUnicastCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRxUnicastCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRxUnicastCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxUnicastCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRxUnicastCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeRxUnicastCountWithCompletion:")
    public native void readAttributeRxUnicastCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeRxUnicastCountWithCompletion") @NotNull Block_readAttributeRxUnicastCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxUnicastCountWithCompletion {
        @Generated
        void call_readAttributeRxUnicastCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRxUnicastCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRxUnicastCountWithCompletionHandler:")
    public native void readAttributeRxUnicastCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRxUnicastCountWithCompletionHandler") @NotNull Block_readAttributeRxUnicastCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRxUnicastCountWithCompletionHandler {
        @Generated
        void call_readAttributeRxUnicastCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSecurityPolicyWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSecurityPolicyWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSecurityPolicyWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSecurityPolicyWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSecurityPolicyWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSecurityPolicyWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSecurityPolicyWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable MTRThreadNetworkDiagnosticsClusterSecurityPolicy value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSecurityPolicyWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSecurityPolicyWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSecurityPolicyWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSecurityPolicyWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSecurityPolicyWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSecurityPolicyWithClusterStateCacheEndpointQueueCompletion(
                @Nullable MTRThreadNetworkDiagnosticsClusterSecurityPolicy value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSecurityPolicyWithCompletion:")
    public native void readAttributeSecurityPolicyWithCompletion(
            @ObjCBlock(name = "call_readAttributeSecurityPolicyWithCompletion") @NotNull Block_readAttributeSecurityPolicyWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSecurityPolicyWithCompletion {
        @Generated
        void call_readAttributeSecurityPolicyWithCompletion(
                @Nullable MTRThreadNetworkDiagnosticsClusterSecurityPolicy value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSecurityPolicyWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSecurityPolicyWithCompletionHandler:")
    public native void readAttributeSecurityPolicyWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSecurityPolicyWithCompletionHandler") @NotNull Block_readAttributeSecurityPolicyWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSecurityPolicyWithCompletionHandler {
        @Generated
        void call_readAttributeSecurityPolicyWithCompletionHandler(
                @Nullable MTRThreadNetworkDiagnosticsClusterSecurityPolicy value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeStableDataVersionWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStableDataVersionWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeStableDataVersionWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStableDataVersionWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeStableDataVersionWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStableDataVersionWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeStableDataVersionWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStableDataVersionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStableDataVersionWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStableDataVersionWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeStableDataVersionWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStableDataVersionWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeStableDataVersionWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeStableDataVersionWithCompletion:")
    public native void readAttributeStableDataVersionWithCompletion(
            @ObjCBlock(name = "call_readAttributeStableDataVersionWithCompletion") @NotNull Block_readAttributeStableDataVersionWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStableDataVersionWithCompletion {
        @Generated
        void call_readAttributeStableDataVersionWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeStableDataVersionWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStableDataVersionWithCompletionHandler:")
    public native void readAttributeStableDataVersionWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeStableDataVersionWithCompletionHandler") @NotNull Block_readAttributeStableDataVersionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStableDataVersionWithCompletionHandler {
        @Generated
        void call_readAttributeStableDataVersionWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxAckRequestedCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxAckRequestedCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxAckRequestedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxAckRequestedCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxAckRequestedCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxAckRequestedCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckRequestedCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxAckRequestedCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxAckRequestedCountWithCompletion:")
    public native void readAttributeTxAckRequestedCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxAckRequestedCountWithCompletion") @NotNull Block_readAttributeTxAckRequestedCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckRequestedCountWithCompletion {
        @Generated
        void call_readAttributeTxAckRequestedCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxAckRequestedCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxAckRequestedCountWithCompletionHandler:")
    public native void readAttributeTxAckRequestedCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxAckRequestedCountWithCompletionHandler") @NotNull Block_readAttributeTxAckRequestedCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckRequestedCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxAckRequestedCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxAckedCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxAckedCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxAckedCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxAckedCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxAckedCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckedCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxAckedCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxAckedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxAckedCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxAckedCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxAckedCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckedCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxAckedCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxAckedCountWithCompletion:")
    public native void readAttributeTxAckedCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxAckedCountWithCompletion") @NotNull Block_readAttributeTxAckedCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckedCountWithCompletion {
        @Generated
        void call_readAttributeTxAckedCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxAckedCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxAckedCountWithCompletionHandler:")
    public native void readAttributeTxAckedCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxAckedCountWithCompletionHandler") @NotNull Block_readAttributeTxAckedCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxAckedCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxAckedCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxBeaconCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxBeaconCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxBeaconCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxBeaconCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxBeaconCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxBeaconCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxBeaconCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxBeaconCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxBeaconCountWithCompletion:")
    public native void readAttributeTxBeaconCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxBeaconCountWithCompletion") @NotNull Block_readAttributeTxBeaconCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconCountWithCompletion {
        @Generated
        void call_readAttributeTxBeaconCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxBeaconCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxBeaconCountWithCompletionHandler:")
    public native void readAttributeTxBeaconCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxBeaconCountWithCompletionHandler") @NotNull Block_readAttributeTxBeaconCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxBeaconCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxBeaconRequestCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxBeaconRequestCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxBeaconRequestCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxBeaconRequestCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxBeaconRequestCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxBeaconRequestCountWithCompletion:")
    public native void readAttributeTxBeaconRequestCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxBeaconRequestCountWithCompletion") @NotNull Block_readAttributeTxBeaconRequestCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconRequestCountWithCompletion {
        @Generated
        void call_readAttributeTxBeaconRequestCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxBeaconRequestCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxBeaconRequestCountWithCompletionHandler:")
    public native void readAttributeTxBeaconRequestCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxBeaconRequestCountWithCompletionHandler") @NotNull Block_readAttributeTxBeaconRequestCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBeaconRequestCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxBeaconRequestCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxBroadcastCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxBroadcastCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxBroadcastCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxBroadcastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxBroadcastCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxBroadcastCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxBroadcastCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBroadcastCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxBroadcastCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxBroadcastCountWithCompletion:")
    public native void readAttributeTxBroadcastCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxBroadcastCountWithCompletion") @NotNull Block_readAttributeTxBroadcastCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBroadcastCountWithCompletion {
        @Generated
        void call_readAttributeTxBroadcastCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxBroadcastCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxBroadcastCountWithCompletionHandler:")
    public native void readAttributeTxBroadcastCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxBroadcastCountWithCompletionHandler") @NotNull Block_readAttributeTxBroadcastCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxBroadcastCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxBroadcastCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxDataCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxDataCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxDataCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxDataCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxDataCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxDataCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxDataCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxDataCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxDataCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxDataCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxDataCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxDataCountWithCompletion:")
    public native void readAttributeTxDataCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxDataCountWithCompletion") @NotNull Block_readAttributeTxDataCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataCountWithCompletion {
        @Generated
        void call_readAttributeTxDataCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxDataCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxDataCountWithCompletionHandler:")
    public native void readAttributeTxDataCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxDataCountWithCompletionHandler") @NotNull Block_readAttributeTxDataCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxDataCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxDataPollCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxDataPollCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxDataPollCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxDataPollCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxDataPollCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxDataPollCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxDataPollCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataPollCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxDataPollCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxDataPollCountWithCompletion:")
    public native void readAttributeTxDataPollCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxDataPollCountWithCompletion") @NotNull Block_readAttributeTxDataPollCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataPollCountWithCompletion {
        @Generated
        void call_readAttributeTxDataPollCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxDataPollCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxDataPollCountWithCompletionHandler:")
    public native void readAttributeTxDataPollCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxDataPollCountWithCompletionHandler") @NotNull Block_readAttributeTxDataPollCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDataPollCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxDataPollCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeTxDirectMaxRetryExpiryCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxDirectMaxRetryExpiryCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxDirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxDirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxDirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxDirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxDirectMaxRetryExpiryCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxDirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxDirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxDirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxDirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxDirectMaxRetryExpiryCountWithCompletion:")
    public native void readAttributeTxDirectMaxRetryExpiryCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxDirectMaxRetryExpiryCountWithCompletion") @NotNull Block_readAttributeTxDirectMaxRetryExpiryCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDirectMaxRetryExpiryCountWithCompletion {
        @Generated
        void call_readAttributeTxDirectMaxRetryExpiryCountWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxDirectMaxRetryExpiryCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxDirectMaxRetryExpiryCountWithCompletionHandler:")
    public native void readAttributeTxDirectMaxRetryExpiryCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxDirectMaxRetryExpiryCountWithCompletionHandler") @NotNull Block_readAttributeTxDirectMaxRetryExpiryCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxDirectMaxRetryExpiryCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxDirectMaxRetryExpiryCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrAbortCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrAbortCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxErrAbortCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrAbortCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxErrAbortCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrAbortCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxErrAbortCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrAbortCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrAbortCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrAbortCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxErrAbortCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrAbortCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxErrAbortCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrAbortCountWithCompletion:")
    public native void readAttributeTxErrAbortCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxErrAbortCountWithCompletion") @NotNull Block_readAttributeTxErrAbortCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrAbortCountWithCompletion {
        @Generated
        void call_readAttributeTxErrAbortCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrAbortCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrAbortCountWithCompletionHandler:")
    public native void readAttributeTxErrAbortCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxErrAbortCountWithCompletionHandler") @NotNull Block_readAttributeTxErrAbortCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrAbortCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxErrAbortCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrBusyChannelCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrBusyChannelCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxErrBusyChannelCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrBusyChannelCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxErrBusyChannelCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrBusyChannelCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxErrBusyChannelCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrBusyChannelCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrBusyChannelCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrBusyChannelCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxErrBusyChannelCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrBusyChannelCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxErrBusyChannelCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrBusyChannelCountWithCompletion:")
    public native void readAttributeTxErrBusyChannelCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxErrBusyChannelCountWithCompletion") @NotNull Block_readAttributeTxErrBusyChannelCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrBusyChannelCountWithCompletion {
        @Generated
        void call_readAttributeTxErrBusyChannelCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrBusyChannelCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrBusyChannelCountWithCompletionHandler:")
    public native void readAttributeTxErrBusyChannelCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxErrBusyChannelCountWithCompletionHandler") @NotNull Block_readAttributeTxErrBusyChannelCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrBusyChannelCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxErrBusyChannelCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrCcaCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrCcaCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxErrCcaCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrCcaCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxErrCcaCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCcaCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxErrCcaCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrCcaCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxErrCcaCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxErrCcaCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxErrCcaCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCcaCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxErrCcaCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxErrCcaCountWithCompletion:")
    public native void readAttributeTxErrCcaCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxErrCcaCountWithCompletion") @NotNull Block_readAttributeTxErrCcaCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCcaCountWithCompletion {
        @Generated
        void call_readAttributeTxErrCcaCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxErrCcaCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxErrCcaCountWithCompletionHandler:")
    public native void readAttributeTxErrCcaCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxErrCcaCountWithCompletionHandler") @NotNull Block_readAttributeTxErrCcaCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxErrCcaCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxErrCcaCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeTxIndirectMaxRetryExpiryCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxIndirectMaxRetryExpiryCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxIndirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxIndirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxIndirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxIndirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxIndirectMaxRetryExpiryCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxIndirectMaxRetryExpiryCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxIndirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxIndirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxIndirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxIndirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxIndirectMaxRetryExpiryCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxIndirectMaxRetryExpiryCountWithCompletion:")
    public native void readAttributeTxIndirectMaxRetryExpiryCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxIndirectMaxRetryExpiryCountWithCompletion") @NotNull Block_readAttributeTxIndirectMaxRetryExpiryCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxIndirectMaxRetryExpiryCountWithCompletion {
        @Generated
        void call_readAttributeTxIndirectMaxRetryExpiryCountWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxIndirectMaxRetryExpiryCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxIndirectMaxRetryExpiryCountWithCompletionHandler:")
    public native void readAttributeTxIndirectMaxRetryExpiryCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxIndirectMaxRetryExpiryCountWithCompletionHandler") @NotNull Block_readAttributeTxIndirectMaxRetryExpiryCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxIndirectMaxRetryExpiryCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxIndirectMaxRetryExpiryCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxNoAckRequestedCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxNoAckRequestedCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxNoAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxNoAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxNoAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxNoAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxNoAckRequestedCountWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxNoAckRequestedCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxNoAckRequestedCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxNoAckRequestedCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxNoAckRequestedCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxNoAckRequestedCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxNoAckRequestedCountWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxNoAckRequestedCountWithCompletion:")
    public native void readAttributeTxNoAckRequestedCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxNoAckRequestedCountWithCompletion") @NotNull Block_readAttributeTxNoAckRequestedCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxNoAckRequestedCountWithCompletion {
        @Generated
        void call_readAttributeTxNoAckRequestedCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxNoAckRequestedCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxNoAckRequestedCountWithCompletionHandler:")
    public native void readAttributeTxNoAckRequestedCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxNoAckRequestedCountWithCompletionHandler") @NotNull Block_readAttributeTxNoAckRequestedCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxNoAckRequestedCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxNoAckRequestedCountWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxOtherCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxOtherCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxOtherCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxOtherCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxOtherCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxOtherCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxOtherCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxOtherCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxOtherCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxOtherCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxOtherCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxOtherCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxOtherCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxOtherCountWithCompletion:")
    public native void readAttributeTxOtherCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxOtherCountWithCompletion") @NotNull Block_readAttributeTxOtherCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxOtherCountWithCompletion {
        @Generated
        void call_readAttributeTxOtherCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxOtherCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxOtherCountWithCompletionHandler:")
    public native void readAttributeTxOtherCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxOtherCountWithCompletionHandler") @NotNull Block_readAttributeTxOtherCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxOtherCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxOtherCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxRetryCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxRetryCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxRetryCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxRetryCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxRetryCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxRetryCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxRetryCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxRetryCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxRetryCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxRetryCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxRetryCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxRetryCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxRetryCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxRetryCountWithCompletion:")
    public native void readAttributeTxRetryCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxRetryCountWithCompletion") @NotNull Block_readAttributeTxRetryCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxRetryCountWithCompletion {
        @Generated
        void call_readAttributeTxRetryCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxRetryCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxRetryCountWithCompletionHandler:")
    public native void readAttributeTxRetryCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxRetryCountWithCompletionHandler") @NotNull Block_readAttributeTxRetryCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxRetryCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxRetryCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxTotalCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxTotalCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxTotalCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxTotalCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxTotalCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxTotalCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxTotalCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxTotalCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxTotalCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxTotalCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxTotalCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxTotalCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxTotalCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxTotalCountWithCompletion:")
    public native void readAttributeTxTotalCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxTotalCountWithCompletion") @NotNull Block_readAttributeTxTotalCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxTotalCountWithCompletion {
        @Generated
        void call_readAttributeTxTotalCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxTotalCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxTotalCountWithCompletionHandler:")
    public native void readAttributeTxTotalCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxTotalCountWithCompletionHandler") @NotNull Block_readAttributeTxTotalCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxTotalCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxTotalCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxUnicastCountWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxUnicastCountWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTxUnicastCountWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxUnicastCountWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTxUnicastCountWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTxUnicastCountWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTxUnicastCountWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxUnicastCountWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTxUnicastCountWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTxUnicastCountWithCompletion:")
    public native void readAttributeTxUnicastCountWithCompletion(
            @ObjCBlock(name = "call_readAttributeTxUnicastCountWithCompletion") @NotNull Block_readAttributeTxUnicastCountWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxUnicastCountWithCompletion {
        @Generated
        void call_readAttributeTxUnicastCountWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTxUnicastCountWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTxUnicastCountWithCompletionHandler:")
    public native void readAttributeTxUnicastCountWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTxUnicastCountWithCompletionHandler") @NotNull Block_readAttributeTxUnicastCountWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTxUnicastCountWithCompletionHandler {
        @Generated
        void call_readAttributeTxUnicastCountWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWeightingWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWeightingWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeWeightingWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWeightingWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeWeightingWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWeightingWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeWeightingWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWeightingWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWeightingWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWeightingWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeWeightingWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWeightingWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeWeightingWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeWeightingWithCompletion:")
    public native void readAttributeWeightingWithCompletion(
            @ObjCBlock(name = "call_readAttributeWeightingWithCompletion") @NotNull Block_readAttributeWeightingWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWeightingWithCompletion {
        @Generated
        void call_readAttributeWeightingWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWeightingWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWeightingWithCompletionHandler:")
    public native void readAttributeWeightingWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeWeightingWithCompletionHandler") @NotNull Block_readAttributeWeightingWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWeightingWithCompletionHandler {
        @Generated
        void call_readAttributeWeightingWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Reception of this command SHALL reset the OverrunCount attributes to 0
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("resetCountsWithParams:completion:")
    public native void resetCountsWithParamsCompletion(
            @Nullable MTRThreadNetworkDiagnosticsClusterResetCountsParams params,
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
            @Nullable MTRThreadNetworkDiagnosticsClusterResetCountsParams params,
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
     * Deprecated-Message: Please use subscribeAttributeActiveNetworkFaultsListWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActiveNetworkFaultsListWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActiveNetworkFaultsListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActiveNetworkFaultsListWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActiveNetworkFaultsListWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeActiveTimestampWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeActiveTimestampWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeActiveTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeActiveTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeActiveTimestampWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeAttachAttemptCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeAttachAttemptCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeAttachAttemptCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2(
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
     * subscribeAttributeBetterPartitionAttachAttemptCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBetterPartitionAttachAttemptCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBetterPartitionAttachAttemptCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBetterPartitionAttachAttemptCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBetterPartitionAttachAttemptCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeChannelPage0MaskWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeChannelPage0MaskWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeChannelPage0MaskWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeChannelPage0MaskWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeChannelPage0MaskWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeChannelWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeChannelWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeChannelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeChannelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeChannelWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeChildRoleCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeChildRoleCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeChildRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeChildRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeChildRoleCountWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeDataVersionWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDataVersionWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDataVersionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDataVersionWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDelayWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDelayWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDelayWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeDetachedRoleCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeDetachedRoleCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeDetachedRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeDetachedRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDetachedRoleCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeExtendedPanIdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeExtendedPanIdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeExtendedPanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeExtendedPanIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeExtendedPanIdWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeLeaderRoleCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLeaderRoleCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLeaderRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLeaderRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLeaderRoleCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLeaderRouterIdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLeaderRouterIdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLeaderRouterIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLeaderRouterIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLeaderRouterIdWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMeshLocalPrefixWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMeshLocalPrefixWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMeshLocalPrefixWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMeshLocalPrefixWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMeshLocalPrefixWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNeighborTableWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNeighborTableListWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNeighborTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNeighborTableWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNeighborTableWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNetworkNameWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNetworkNameWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNetworkNameWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNetworkNameWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNetworkNameWithParamsSubscriptionEstablishedReportHandler_2(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOperationalDatasetComponentsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOperationalDatasetComponentsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOperationalDatasetComponentsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOperationalDatasetComponentsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOperationalDatasetComponentsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable MTRThreadNetworkDiagnosticsClusterOperationalDatasetComponents value,
                @Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributePanIdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePanIdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePanIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePanIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePanIdWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeParentChangeCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeParentChangeCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeParentChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeParentChangeCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeParentChangeCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePartitionIdChangeCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePartitionIdChangeCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePartitionIdChangeCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePartitionIdChangeCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePartitionIdChangeCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePartitionIdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePartitionIdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePartitionIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePartitionIdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePartitionIdWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePendingTimestampWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePendingTimestampWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePendingTimestampWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePendingTimestampWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePendingTimestampWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRouteTableWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRouteTableListWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRouteTableListWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRouteTableWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRouteTableWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRouterRoleCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRouterRoleCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRouterRoleCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRouterRoleCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRouterRoleCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRoutingRoleWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRoutingRoleWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRoutingRoleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRoutingRoleWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRoutingRoleWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxAddressFilteredCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxAddressFilteredCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxAddressFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxAddressFilteredCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxAddressFilteredCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxBeaconCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxBeaconCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxBeaconCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxBeaconRequestCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxBeaconRequestCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxBeaconRequestCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxBroadcastCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxBroadcastCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxBroadcastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxDataCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxDataCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxDataCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxDataCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxDataPollCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxDataPollCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxDataPollCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxDestAddrFilteredCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxDestAddrFilteredCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxDestAddrFilteredCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxDestAddrFilteredCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxDestAddrFilteredCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxDuplicatedCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxDuplicatedCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxDuplicatedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxDuplicatedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxDuplicatedCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxErrFcsCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxErrFcsCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxErrFcsCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxErrFcsCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxErrFcsCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxErrInvalidSrcAddrCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxErrInvalidSrcAddrCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxErrInvalidSrcAddrCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxErrInvalidSrcAddrCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxErrInvalidSrcAddrCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxErrNoFrameCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxErrNoFrameCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxErrNoFrameCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxErrNoFrameCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxErrNoFrameCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxErrOtherCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxErrOtherCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxErrOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxErrOtherCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxErrOtherCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxErrSecCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxErrSecCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxErrSecCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxErrSecCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxErrSecCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxErrUnknownNeighborCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxErrUnknownNeighborCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxErrUnknownNeighborCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxErrUnknownNeighborCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxErrUnknownNeighborCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxOtherCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxOtherCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxOtherCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxOtherCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxTotalCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxTotalCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxTotalCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxTotalCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRxUnicastCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRxUnicastCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeRxUnicastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSecurityPolicyWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSecurityPolicyWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSecurityPolicyWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable MTRThreadNetworkDiagnosticsClusterSecurityPolicy value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSecurityPolicyWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSecurityPolicyWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable MTRThreadNetworkDiagnosticsClusterSecurityPolicy value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeStableDataVersionWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeStableDataVersionWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeStableDataVersionWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeStableDataVersionWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeStableDataVersionWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxAckRequestedCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxAckRequestedCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxAckRequestedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxAckedCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxAckedCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxAckedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxAckedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxAckedCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxBeaconCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxBeaconCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxBeaconCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxBeaconCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxBeaconCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxBeaconRequestCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxBeaconRequestCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxBeaconRequestCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxBeaconRequestCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxBeaconRequestCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxBroadcastCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxBroadcastCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxBroadcastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxBroadcastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxBroadcastCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxDataCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxDataCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxDataCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxDataCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxDataCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxDataPollCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxDataPollCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxDataPollCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxDataPollCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxDataPollCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxDirectMaxRetryExpiryCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxDirectMaxRetryExpiryCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxDirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxDirectMaxRetryExpiryCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxDirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxErrAbortCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxErrAbortCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxErrAbortCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxErrAbortCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxErrAbortCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxErrBusyChannelCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxErrBusyChannelCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxErrBusyChannelCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxErrBusyChannelCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxErrBusyChannelCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxErrCcaCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxErrCcaCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxErrCcaCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxErrCcaCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxErrCcaCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxIndirectMaxRetryExpiryCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxIndirectMaxRetryExpiryCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxIndirectMaxRetryExpiryCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxNoAckRequestedCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxNoAckRequestedCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxNoAckRequestedCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxNoAckRequestedCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxNoAckRequestedCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxOtherCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxOtherCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxOtherCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxOtherCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxOtherCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxRetryCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxRetryCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxRetryCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxRetryCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxRetryCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxTotalCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxTotalCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxTotalCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxTotalCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxTotalCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTxUnicastCountWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTxUnicastCountWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTxUnicastCountWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTxUnicastCountWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTxUnicastCountWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeWeightingWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeWeightingWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeWeightingWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeWeightingWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeWeightingWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
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