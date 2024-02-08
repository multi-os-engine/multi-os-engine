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
 * Cluster Ballast Configuration
 * 
 * Attributes and commands for configuring a lighting ballast.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterBallastConfiguration extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterBallastConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterBallastConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterBallastConfiguration allocWithZone(VoidPtr zone);

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
    public native MTRBaseClusterBallastConfiguration init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterBallastConfiguration initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device,
            char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterBallastConfiguration initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterBallastConfiguration new_objc();

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
     * Deprecated-Message: Please use readAttributeBallastFactorAdjustmentWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBallastFactorAdjustmentWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBallastFactorAdjustmentWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBallastFactorAdjustmentWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBallastFactorAdjustmentWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastFactorAdjustmentWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBallastFactorAdjustmentWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBallastFactorAdjustmentWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBallastFactorAdjustmentWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBallastFactorAdjustmentWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBallastFactorAdjustmentWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastFactorAdjustmentWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBallastFactorAdjustmentWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBallastFactorAdjustmentWithCompletion:")
    public native void readAttributeBallastFactorAdjustmentWithCompletion(
            @ObjCBlock(name = "call_readAttributeBallastFactorAdjustmentWithCompletion") @NotNull Block_readAttributeBallastFactorAdjustmentWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastFactorAdjustmentWithCompletion {
        @Generated
        void call_readAttributeBallastFactorAdjustmentWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBallastFactorAdjustmentWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBallastFactorAdjustmentWithCompletionHandler:")
    public native void readAttributeBallastFactorAdjustmentWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBallastFactorAdjustmentWithCompletionHandler") @NotNull Block_readAttributeBallastFactorAdjustmentWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastFactorAdjustmentWithCompletionHandler {
        @Generated
        void call_readAttributeBallastFactorAdjustmentWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBallastStatusWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBallastStatusWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBallastStatusWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBallastStatusWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBallastStatusWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastStatusWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBallastStatusWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBallastStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBallastStatusWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBallastStatusWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeBallastStatusWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastStatusWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeBallastStatusWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeBallastStatusWithCompletion:")
    public native void readAttributeBallastStatusWithCompletion(
            @ObjCBlock(name = "call_readAttributeBallastStatusWithCompletion") @NotNull Block_readAttributeBallastStatusWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastStatusWithCompletion {
        @Generated
        void call_readAttributeBallastStatusWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBallastStatusWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBallastStatusWithCompletionHandler:")
    public native void readAttributeBallastStatusWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBallastStatusWithCompletionHandler") @NotNull Block_readAttributeBallastStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBallastStatusWithCompletionHandler {
        @Generated
        void call_readAttributeBallastStatusWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeIntrinsicBallastFactorWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeIntrinsicBalanceFactorWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeIntrinsicBalanceFactorWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeIntrinsicBalanceFactorWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeIntrinsicBalanceFactorWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeIntrinsicBalanceFactorWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeIntrinsicBalanceFactorWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeIntrinsicBallastFactorWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeIntrinsicBalanceFactorWithCompletionHandler:")
    public native void readAttributeIntrinsicBalanceFactorWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeIntrinsicBalanceFactorWithCompletionHandler") @NotNull Block_readAttributeIntrinsicBalanceFactorWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeIntrinsicBalanceFactorWithCompletionHandler {
        @Generated
        void call_readAttributeIntrinsicBalanceFactorWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeIntrinsicBallastFactorWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeIntrinsicBallastFactorWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeIntrinsicBallastFactorWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeIntrinsicBallastFactorWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeIntrinsicBallastFactorWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeIntrinsicBallastFactorWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeIntrinsicBallastFactorWithCompletion:")
    public native void readAttributeIntrinsicBallastFactorWithCompletion(
            @ObjCBlock(name = "call_readAttributeIntrinsicBallastFactorWithCompletion") @NotNull Block_readAttributeIntrinsicBallastFactorWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeIntrinsicBallastFactorWithCompletion {
        @Generated
        void call_readAttributeIntrinsicBallastFactorWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampAlarmModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampAlarmModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLampAlarmModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampAlarmModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLampAlarmModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampAlarmModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLampAlarmModeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampAlarmModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLampAlarmModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampAlarmModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLampAlarmModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampAlarmModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLampAlarmModeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampAlarmModeWithCompletion:")
    public native void readAttributeLampAlarmModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeLampAlarmModeWithCompletion") @NotNull Block_readAttributeLampAlarmModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampAlarmModeWithCompletion {
        @Generated
        void call_readAttributeLampAlarmModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampAlarmModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampAlarmModeWithCompletionHandler:")
    public native void readAttributeLampAlarmModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLampAlarmModeWithCompletionHandler") @NotNull Block_readAttributeLampAlarmModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampAlarmModeWithCompletionHandler {
        @Generated
        void call_readAttributeLampAlarmModeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampBurnHoursTripPointWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampBurnHoursTripPointWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLampBurnHoursTripPointWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampBurnHoursTripPointWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLampBurnHoursTripPointWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursTripPointWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLampBurnHoursTripPointWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampBurnHoursTripPointWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLampBurnHoursTripPointWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampBurnHoursTripPointWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLampBurnHoursTripPointWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursTripPointWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLampBurnHoursTripPointWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampBurnHoursTripPointWithCompletion:")
    public native void readAttributeLampBurnHoursTripPointWithCompletion(
            @ObjCBlock(name = "call_readAttributeLampBurnHoursTripPointWithCompletion") @NotNull Block_readAttributeLampBurnHoursTripPointWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursTripPointWithCompletion {
        @Generated
        void call_readAttributeLampBurnHoursTripPointWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampBurnHoursTripPointWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampBurnHoursTripPointWithCompletionHandler:")
    public native void readAttributeLampBurnHoursTripPointWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLampBurnHoursTripPointWithCompletionHandler") @NotNull Block_readAttributeLampBurnHoursTripPointWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursTripPointWithCompletionHandler {
        @Generated
        void call_readAttributeLampBurnHoursTripPointWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampBurnHoursWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampBurnHoursWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLampBurnHoursWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampBurnHoursWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLampBurnHoursWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLampBurnHoursWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampBurnHoursWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLampBurnHoursWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampBurnHoursWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLampBurnHoursWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLampBurnHoursWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampBurnHoursWithCompletion:")
    public native void readAttributeLampBurnHoursWithCompletion(
            @ObjCBlock(name = "call_readAttributeLampBurnHoursWithCompletion") @NotNull Block_readAttributeLampBurnHoursWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursWithCompletion {
        @Generated
        void call_readAttributeLampBurnHoursWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampBurnHoursWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampBurnHoursWithCompletionHandler:")
    public native void readAttributeLampBurnHoursWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLampBurnHoursWithCompletionHandler") @NotNull Block_readAttributeLampBurnHoursWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampBurnHoursWithCompletionHandler {
        @Generated
        void call_readAttributeLampBurnHoursWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampManufacturerWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampManufacturerWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLampManufacturerWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampManufacturerWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLampManufacturerWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampManufacturerWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLampManufacturerWithAttributeCacheEndpointQueueCompletionHandler(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampManufacturerWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLampManufacturerWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampManufacturerWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLampManufacturerWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampManufacturerWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLampManufacturerWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampManufacturerWithCompletion:")
    public native void readAttributeLampManufacturerWithCompletion(
            @ObjCBlock(name = "call_readAttributeLampManufacturerWithCompletion") @NotNull Block_readAttributeLampManufacturerWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampManufacturerWithCompletion {
        @Generated
        void call_readAttributeLampManufacturerWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampManufacturerWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampManufacturerWithCompletionHandler:")
    public native void readAttributeLampManufacturerWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLampManufacturerWithCompletionHandler") @NotNull Block_readAttributeLampManufacturerWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampManufacturerWithCompletionHandler {
        @Generated
        void call_readAttributeLampManufacturerWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampQuantityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampQuantityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLampQuantityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampQuantityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLampQuantityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampQuantityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLampQuantityWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampQuantityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLampQuantityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampQuantityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLampQuantityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampQuantityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLampQuantityWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampQuantityWithCompletion:")
    public native void readAttributeLampQuantityWithCompletion(
            @ObjCBlock(name = "call_readAttributeLampQuantityWithCompletion") @NotNull Block_readAttributeLampQuantityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampQuantityWithCompletion {
        @Generated
        void call_readAttributeLampQuantityWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampQuantityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampQuantityWithCompletionHandler:")
    public native void readAttributeLampQuantityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLampQuantityWithCompletionHandler") @NotNull Block_readAttributeLampQuantityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampQuantityWithCompletionHandler {
        @Generated
        void call_readAttributeLampQuantityWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampRatedHoursWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampRatedHoursWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLampRatedHoursWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampRatedHoursWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLampRatedHoursWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampRatedHoursWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLampRatedHoursWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampRatedHoursWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLampRatedHoursWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampRatedHoursWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLampRatedHoursWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampRatedHoursWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLampRatedHoursWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampRatedHoursWithCompletion:")
    public native void readAttributeLampRatedHoursWithCompletion(
            @ObjCBlock(name = "call_readAttributeLampRatedHoursWithCompletion") @NotNull Block_readAttributeLampRatedHoursWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampRatedHoursWithCompletion {
        @Generated
        void call_readAttributeLampRatedHoursWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampRatedHoursWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampRatedHoursWithCompletionHandler:")
    public native void readAttributeLampRatedHoursWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLampRatedHoursWithCompletionHandler") @NotNull Block_readAttributeLampRatedHoursWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampRatedHoursWithCompletionHandler {
        @Generated
        void call_readAttributeLampRatedHoursWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLampTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLampTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLampTypeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLampTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLampTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLampTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLampTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeLampTypeWithCompletion:")
    public native void readAttributeLampTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeLampTypeWithCompletion") @NotNull Block_readAttributeLampTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampTypeWithCompletion {
        @Generated
        void call_readAttributeLampTypeWithCompletion(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLampTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLampTypeWithCompletionHandler:")
    public native void readAttributeLampTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLampTypeWithCompletionHandler") @NotNull Block_readAttributeLampTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLampTypeWithCompletionHandler {
        @Generated
        void call_readAttributeLampTypeWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxLevelWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxLevelWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMaxLevelWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxLevelWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMaxLevelWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxLevelWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMaxLevelWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMaxLevelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMaxLevelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMaxLevelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxLevelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMaxLevelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMaxLevelWithCompletion:")
    public native void readAttributeMaxLevelWithCompletion(
            @ObjCBlock(name = "call_readAttributeMaxLevelWithCompletion") @NotNull Block_readAttributeMaxLevelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxLevelWithCompletion {
        @Generated
        void call_readAttributeMaxLevelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMaxLevelWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMaxLevelWithCompletionHandler:")
    public native void readAttributeMaxLevelWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMaxLevelWithCompletionHandler") @NotNull Block_readAttributeMaxLevelWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMaxLevelWithCompletionHandler {
        @Generated
        void call_readAttributeMaxLevelWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinLevelWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinLevelWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeMinLevelWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinLevelWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeMinLevelWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinLevelWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeMinLevelWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeMinLevelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeMinLevelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeMinLevelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinLevelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeMinLevelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeMinLevelWithCompletion:")
    public native void readAttributeMinLevelWithCompletion(
            @ObjCBlock(name = "call_readAttributeMinLevelWithCompletion") @NotNull Block_readAttributeMinLevelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinLevelWithCompletion {
        @Generated
        void call_readAttributeMinLevelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeMinLevelWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeMinLevelWithCompletionHandler:")
    public native void readAttributeMinLevelWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeMinLevelWithCompletionHandler") @NotNull Block_readAttributeMinLevelWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeMinLevelWithCompletionHandler {
        @Generated
        void call_readAttributeMinLevelWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalMaxLevelWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalMaxLevelWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhysicalMaxLevelWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalMaxLevelWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhysicalMaxLevelWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMaxLevelWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhysicalMaxLevelWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalMaxLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalMaxLevelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalMaxLevelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhysicalMaxLevelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMaxLevelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhysicalMaxLevelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalMaxLevelWithCompletion:")
    public native void readAttributePhysicalMaxLevelWithCompletion(
            @ObjCBlock(name = "call_readAttributePhysicalMaxLevelWithCompletion") @NotNull Block_readAttributePhysicalMaxLevelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMaxLevelWithCompletion {
        @Generated
        void call_readAttributePhysicalMaxLevelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalMaxLevelWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalMaxLevelWithCompletionHandler:")
    public native void readAttributePhysicalMaxLevelWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhysicalMaxLevelWithCompletionHandler") @NotNull Block_readAttributePhysicalMaxLevelWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMaxLevelWithCompletionHandler {
        @Generated
        void call_readAttributePhysicalMaxLevelWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalMinLevelWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalMinLevelWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhysicalMinLevelWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalMinLevelWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhysicalMinLevelWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMinLevelWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhysicalMinLevelWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalMinLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalMinLevelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalMinLevelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhysicalMinLevelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMinLevelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhysicalMinLevelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalMinLevelWithCompletion:")
    public native void readAttributePhysicalMinLevelWithCompletion(
            @ObjCBlock(name = "call_readAttributePhysicalMinLevelWithCompletion") @NotNull Block_readAttributePhysicalMinLevelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMinLevelWithCompletion {
        @Generated
        void call_readAttributePhysicalMinLevelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalMinLevelWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalMinLevelWithCompletionHandler:")
    public native void readAttributePhysicalMinLevelWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhysicalMinLevelWithCompletionHandler") @NotNull Block_readAttributePhysicalMinLevelWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalMinLevelWithCompletionHandler {
        @Generated
        void call_readAttributePhysicalMinLevelWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeBallastFactorAdjustmentWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBallastFactorAdjustmentWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBallastFactorAdjustmentWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBallastFactorAdjustmentWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBallastFactorAdjustmentWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeBallastStatusWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBallastStatusWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBallastStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeBallastStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeBallastStatusWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeIntrinsicBallastFactorWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeIntrinsicBalanceFactorWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeIntrinsicBalanceFactorWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeIntrinsicBallastFactorWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeIntrinsicBallastFactorWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLampAlarmModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLampAlarmModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLampAlarmModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLampAlarmModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLampAlarmModeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLampBurnHoursTripPointWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLampBurnHoursTripPointWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLampBurnHoursTripPointWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLampBurnHoursTripPointWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLampBurnHoursTripPointWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLampBurnHoursWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLampBurnHoursWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLampBurnHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLampBurnHoursWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLampBurnHoursWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLampManufacturerWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLampManufacturerWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLampManufacturerWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLampManufacturerWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLampManufacturerWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLampQuantityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLampQuantityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLampQuantityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLampQuantityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLampQuantityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLampRatedHoursWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLampRatedHoursWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLampRatedHoursWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLampRatedHoursWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLampRatedHoursWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLampTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLampTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLampTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeLampTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLampTypeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable String value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMaxLevelWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMaxLevelWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMaxLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMaxLevelWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeMinLevelWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeMinLevelWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeMinLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeMinLevelWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePhysicalMaxLevelWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhysicalMaxLevelWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhysicalMaxLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhysicalMaxLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhysicalMaxLevelWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePhysicalMinLevelWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhysicalMinLevelWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhysicalMinLevelWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhysicalMinLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhysicalMinLevelWithParamsSubscriptionEstablishedReportHandler_2(
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
    @Selector("writeAttributeBallastFactorAdjustmentWithValue:completion:")
    public native void writeAttributeBallastFactorAdjustmentWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBallastFactorAdjustmentWithValueCompletion") @NotNull Block_writeAttributeBallastFactorAdjustmentWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBallastFactorAdjustmentWithValueCompletion {
        @Generated
        void call_writeAttributeBallastFactorAdjustmentWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBallastFactorAdjustmentWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBallastFactorAdjustmentWithValue:completionHandler:")
    public native void writeAttributeBallastFactorAdjustmentWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBallastFactorAdjustmentWithValueCompletionHandler") @NotNull Block_writeAttributeBallastFactorAdjustmentWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBallastFactorAdjustmentWithValueCompletionHandler {
        @Generated
        void call_writeAttributeBallastFactorAdjustmentWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeBallastFactorAdjustmentWithValue:params:completion:")
    public native void writeAttributeBallastFactorAdjustmentWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBallastFactorAdjustmentWithValueParamsCompletion") @NotNull Block_writeAttributeBallastFactorAdjustmentWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBallastFactorAdjustmentWithValueParamsCompletion {
        @Generated
        void call_writeAttributeBallastFactorAdjustmentWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBallastFactorAdjustmentWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBallastFactorAdjustmentWithValue:params:completionHandler:")
    public native void writeAttributeBallastFactorAdjustmentWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBallastFactorAdjustmentWithValueParamsCompletionHandler") @NotNull Block_writeAttributeBallastFactorAdjustmentWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBallastFactorAdjustmentWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeBallastFactorAdjustmentWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeIntrinsicBallastFactorWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeIntrinsicBalanceFactorWithValue:completionHandler:")
    public native void writeAttributeIntrinsicBalanceFactorWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeIntrinsicBalanceFactorWithValueCompletionHandler") @NotNull Block_writeAttributeIntrinsicBalanceFactorWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeIntrinsicBalanceFactorWithValueCompletionHandler {
        @Generated
        void call_writeAttributeIntrinsicBalanceFactorWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeIntrinsicBallastFactorWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeIntrinsicBalanceFactorWithValue:params:completionHandler:")
    public native void writeAttributeIntrinsicBalanceFactorWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeIntrinsicBalanceFactorWithValueParamsCompletionHandler") @NotNull Block_writeAttributeIntrinsicBalanceFactorWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeIntrinsicBalanceFactorWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeIntrinsicBalanceFactorWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeIntrinsicBallastFactorWithValue:completion:")
    public native void writeAttributeIntrinsicBallastFactorWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeIntrinsicBallastFactorWithValueCompletion") @NotNull Block_writeAttributeIntrinsicBallastFactorWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeIntrinsicBallastFactorWithValueCompletion {
        @Generated
        void call_writeAttributeIntrinsicBallastFactorWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeIntrinsicBallastFactorWithValue:params:completion:")
    public native void writeAttributeIntrinsicBallastFactorWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeIntrinsicBallastFactorWithValueParamsCompletion") @NotNull Block_writeAttributeIntrinsicBallastFactorWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeIntrinsicBallastFactorWithValueParamsCompletion {
        @Generated
        void call_writeAttributeIntrinsicBallastFactorWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampAlarmModeWithValue:completion:")
    public native void writeAttributeLampAlarmModeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampAlarmModeWithValueCompletion") @NotNull Block_writeAttributeLampAlarmModeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampAlarmModeWithValueCompletion {
        @Generated
        void call_writeAttributeLampAlarmModeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampAlarmModeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampAlarmModeWithValue:completionHandler:")
    public native void writeAttributeLampAlarmModeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampAlarmModeWithValueCompletionHandler") @NotNull Block_writeAttributeLampAlarmModeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampAlarmModeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLampAlarmModeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampAlarmModeWithValue:params:completion:")
    public native void writeAttributeLampAlarmModeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampAlarmModeWithValueParamsCompletion") @NotNull Block_writeAttributeLampAlarmModeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampAlarmModeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLampAlarmModeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampAlarmModeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampAlarmModeWithValue:params:completionHandler:")
    public native void writeAttributeLampAlarmModeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampAlarmModeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLampAlarmModeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampAlarmModeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLampAlarmModeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampBurnHoursTripPointWithValue:completion:")
    public native void writeAttributeLampBurnHoursTripPointWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursTripPointWithValueCompletion") @NotNull Block_writeAttributeLampBurnHoursTripPointWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursTripPointWithValueCompletion {
        @Generated
        void call_writeAttributeLampBurnHoursTripPointWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampBurnHoursTripPointWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampBurnHoursTripPointWithValue:completionHandler:")
    public native void writeAttributeLampBurnHoursTripPointWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursTripPointWithValueCompletionHandler") @NotNull Block_writeAttributeLampBurnHoursTripPointWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursTripPointWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLampBurnHoursTripPointWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampBurnHoursTripPointWithValue:params:completion:")
    public native void writeAttributeLampBurnHoursTripPointWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursTripPointWithValueParamsCompletion") @NotNull Block_writeAttributeLampBurnHoursTripPointWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursTripPointWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLampBurnHoursTripPointWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampBurnHoursTripPointWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampBurnHoursTripPointWithValue:params:completionHandler:")
    public native void writeAttributeLampBurnHoursTripPointWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursTripPointWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLampBurnHoursTripPointWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursTripPointWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLampBurnHoursTripPointWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampBurnHoursWithValue:completion:")
    public native void writeAttributeLampBurnHoursWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursWithValueCompletion") @NotNull Block_writeAttributeLampBurnHoursWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursWithValueCompletion {
        @Generated
        void call_writeAttributeLampBurnHoursWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampBurnHoursWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampBurnHoursWithValue:completionHandler:")
    public native void writeAttributeLampBurnHoursWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursWithValueCompletionHandler") @NotNull Block_writeAttributeLampBurnHoursWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLampBurnHoursWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampBurnHoursWithValue:params:completion:")
    public native void writeAttributeLampBurnHoursWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursWithValueParamsCompletion") @NotNull Block_writeAttributeLampBurnHoursWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLampBurnHoursWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampBurnHoursWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampBurnHoursWithValue:params:completionHandler:")
    public native void writeAttributeLampBurnHoursWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampBurnHoursWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLampBurnHoursWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampBurnHoursWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLampBurnHoursWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampManufacturerWithValue:completion:")
    public native void writeAttributeLampManufacturerWithValueCompletion(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLampManufacturerWithValueCompletion") @NotNull Block_writeAttributeLampManufacturerWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampManufacturerWithValueCompletion {
        @Generated
        void call_writeAttributeLampManufacturerWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampManufacturerWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampManufacturerWithValue:completionHandler:")
    public native void writeAttributeLampManufacturerWithValueCompletionHandler(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLampManufacturerWithValueCompletionHandler") @NotNull Block_writeAttributeLampManufacturerWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampManufacturerWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLampManufacturerWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampManufacturerWithValue:params:completion:")
    public native void writeAttributeLampManufacturerWithValueParamsCompletion(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampManufacturerWithValueParamsCompletion") @NotNull Block_writeAttributeLampManufacturerWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampManufacturerWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLampManufacturerWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampManufacturerWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampManufacturerWithValue:params:completionHandler:")
    public native void writeAttributeLampManufacturerWithValueParamsCompletionHandler(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampManufacturerWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLampManufacturerWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampManufacturerWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLampManufacturerWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampRatedHoursWithValue:completion:")
    public native void writeAttributeLampRatedHoursWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampRatedHoursWithValueCompletion") @NotNull Block_writeAttributeLampRatedHoursWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampRatedHoursWithValueCompletion {
        @Generated
        void call_writeAttributeLampRatedHoursWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampRatedHoursWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampRatedHoursWithValue:completionHandler:")
    public native void writeAttributeLampRatedHoursWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeLampRatedHoursWithValueCompletionHandler") @NotNull Block_writeAttributeLampRatedHoursWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampRatedHoursWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLampRatedHoursWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampRatedHoursWithValue:params:completion:")
    public native void writeAttributeLampRatedHoursWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampRatedHoursWithValueParamsCompletion") @NotNull Block_writeAttributeLampRatedHoursWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampRatedHoursWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLampRatedHoursWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampRatedHoursWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampRatedHoursWithValue:params:completionHandler:")
    public native void writeAttributeLampRatedHoursWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampRatedHoursWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLampRatedHoursWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampRatedHoursWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLampRatedHoursWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampTypeWithValue:completion:")
    public native void writeAttributeLampTypeWithValueCompletion(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLampTypeWithValueCompletion") @NotNull Block_writeAttributeLampTypeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampTypeWithValueCompletion {
        @Generated
        void call_writeAttributeLampTypeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampTypeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampTypeWithValue:completionHandler:")
    public native void writeAttributeLampTypeWithValueCompletionHandler(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLampTypeWithValueCompletionHandler") @NotNull Block_writeAttributeLampTypeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampTypeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLampTypeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeLampTypeWithValue:params:completion:")
    public native void writeAttributeLampTypeWithValueParamsCompletion(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampTypeWithValueParamsCompletion") @NotNull Block_writeAttributeLampTypeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampTypeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeLampTypeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLampTypeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLampTypeWithValue:params:completionHandler:")
    public native void writeAttributeLampTypeWithValueParamsCompletionHandler(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLampTypeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLampTypeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLampTypeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLampTypeWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMaxLevelWithValue:completion:")
    public native void writeAttributeMaxLevelWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMaxLevelWithValueCompletion") @NotNull Block_writeAttributeMaxLevelWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxLevelWithValueCompletion {
        @Generated
        void call_writeAttributeMaxLevelWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMaxLevelWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMaxLevelWithValue:completionHandler:")
    public native void writeAttributeMaxLevelWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMaxLevelWithValueCompletionHandler") @NotNull Block_writeAttributeMaxLevelWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxLevelWithValueCompletionHandler {
        @Generated
        void call_writeAttributeMaxLevelWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMaxLevelWithValue:params:completion:")
    public native void writeAttributeMaxLevelWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMaxLevelWithValueParamsCompletion") @NotNull Block_writeAttributeMaxLevelWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxLevelWithValueParamsCompletion {
        @Generated
        void call_writeAttributeMaxLevelWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMaxLevelWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMaxLevelWithValue:params:completionHandler:")
    public native void writeAttributeMaxLevelWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMaxLevelWithValueParamsCompletionHandler") @NotNull Block_writeAttributeMaxLevelWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMaxLevelWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeMaxLevelWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinLevelWithValue:completion:")
    public native void writeAttributeMinLevelWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinLevelWithValueCompletion") @NotNull Block_writeAttributeMinLevelWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinLevelWithValueCompletion {
        @Generated
        void call_writeAttributeMinLevelWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinLevelWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinLevelWithValue:completionHandler:")
    public native void writeAttributeMinLevelWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeMinLevelWithValueCompletionHandler") @NotNull Block_writeAttributeMinLevelWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinLevelWithValueCompletionHandler {
        @Generated
        void call_writeAttributeMinLevelWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeMinLevelWithValue:params:completion:")
    public native void writeAttributeMinLevelWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinLevelWithValueParamsCompletion") @NotNull Block_writeAttributeMinLevelWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinLevelWithValueParamsCompletion {
        @Generated
        void call_writeAttributeMinLevelWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeMinLevelWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeMinLevelWithValue:params:completionHandler:")
    public native void writeAttributeMinLevelWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeMinLevelWithValueParamsCompletionHandler") @NotNull Block_writeAttributeMinLevelWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeMinLevelWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeMinLevelWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}