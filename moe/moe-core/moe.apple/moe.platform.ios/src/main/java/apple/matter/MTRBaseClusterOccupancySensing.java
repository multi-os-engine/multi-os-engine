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
 * Cluster Occupancy Sensing
 * 
 * Attributes and commands for configuring occupancy sensing, and reporting occupancy status.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterOccupancySensing extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterOccupancySensing(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterOccupancySensing alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterOccupancySensing allocWithZone(VoidPtr zone);

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
    public native MTRBaseClusterOccupancySensing init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterOccupancySensing initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device,
            char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterOccupancySensing initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterOccupancySensing new_objc();

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
     * readAttributeOccupancySensorTypeBitmapWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupancySensorTypeBitmapWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupancySensorTypeBitmapWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeBitmapWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupancySensorTypeBitmapWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeBitmapWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupancySensorTypeBitmapWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupancySensorTypeBitmapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupancySensorTypeBitmapWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeBitmapWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupancySensorTypeBitmapWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeBitmapWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupancySensorTypeBitmapWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupancySensorTypeBitmapWithCompletion:")
    public native void readAttributeOccupancySensorTypeBitmapWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeBitmapWithCompletion") @NotNull Block_readAttributeOccupancySensorTypeBitmapWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeBitmapWithCompletion {
        @Generated
        void call_readAttributeOccupancySensorTypeBitmapWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupancySensorTypeBitmapWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupancySensorTypeBitmapWithCompletionHandler:")
    public native void readAttributeOccupancySensorTypeBitmapWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeBitmapWithCompletionHandler") @NotNull Block_readAttributeOccupancySensorTypeBitmapWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeBitmapWithCompletionHandler {
        @Generated
        void call_readAttributeOccupancySensorTypeBitmapWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupancySensorTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupancySensorTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOccupancySensorTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOccupancySensorTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOccupancySensorTypeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupancySensorTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOccupancySensorTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOccupancySensorTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOccupancySensorTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOccupancySensorTypeWithCompletion:")
    public native void readAttributeOccupancySensorTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeWithCompletion") @NotNull Block_readAttributeOccupancySensorTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeWithCompletion {
        @Generated
        void call_readAttributeOccupancySensorTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOccupancySensorTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOccupancySensorTypeWithCompletionHandler:")
    public native void readAttributeOccupancySensorTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOccupancySensorTypeWithCompletionHandler") @NotNull Block_readAttributeOccupancySensorTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOccupancySensorTypeWithCompletionHandler {
        @Generated
        void call_readAttributeOccupancySensorTypeWithCompletionHandler(@Nullable NSNumber value,
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIROccupiedToUnoccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIROccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePIROccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePIROccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIROccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePIROccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIROccupiedToUnoccupiedDelayWithCompletion:")
    public native void readAttributePIROccupiedToUnoccupiedDelayWithCompletion(
            @ObjCBlock(name = "call_readAttributePIROccupiedToUnoccupiedDelayWithCompletion") @NotNull Block_readAttributePIROccupiedToUnoccupiedDelayWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIROccupiedToUnoccupiedDelayWithCompletion {
        @Generated
        void call_readAttributePIROccupiedToUnoccupiedDelayWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIRUnoccupiedToOccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIRUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePIRUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePIRUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIRUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePIRUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIRUnoccupiedToOccupiedDelayWithCompletion:")
    public native void readAttributePIRUnoccupiedToOccupiedDelayWithCompletion(
            @ObjCBlock(name = "call_readAttributePIRUnoccupiedToOccupiedDelayWithCompletion") @NotNull Block_readAttributePIRUnoccupiedToOccupiedDelayWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIRUnoccupiedToOccupiedDelayWithCompletion {
        @Generated
        void call_readAttributePIRUnoccupiedToOccupiedDelayWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIRUnoccupiedToOccupiedThresholdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePIRUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePIRUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePIRUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIRUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePIRUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion:")
    public native void readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion(
            @ObjCBlock(name = "call_readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion") @NotNull Block_readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion {
        @Generated
        void call_readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributePhysicalContactOccupiedToUnoccupiedDelayWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalContactOccupiedToUnoccupiedDelayWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhysicalContactOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalContactOccupiedToUnoccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalContactOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion:")
    public native void readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion(
            @ObjCBlock(name = "call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion") @NotNull Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion {
        @Generated
        void call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletionHandler:")
    public native void readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletionHandler") @NotNull Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletionHandler {
        @Generated
        void call_readAttributePhysicalContactOccupiedToUnoccupiedDelayWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributePhysicalContactUnoccupiedToOccupiedDelayWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedDelayWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhysicalContactUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalContactUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion:")
    public native void readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion(
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletionHandler:")
    public native void readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletionHandler") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletionHandler {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedDelayWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion:")
    public native void readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion(
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletionHandler:")
    public native void readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletionHandler") @NotNull Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletionHandler {
        @Generated
        void call_readAttributePhysicalContactUnoccupiedToOccupiedThresholdWithCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributePIROccupiedToUnoccupiedDelayWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirOccupiedToUnoccupiedDelayWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePirOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePirOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePirOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePirOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePirOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIROccupiedToUnoccupiedDelayWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirOccupiedToUnoccupiedDelayWithCompletionHandler:")
    public native void readAttributePirOccupiedToUnoccupiedDelayWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePirOccupiedToUnoccupiedDelayWithCompletionHandler") @NotNull Block_readAttributePirOccupiedToUnoccupiedDelayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePirOccupiedToUnoccupiedDelayWithCompletionHandler {
        @Generated
        void call_readAttributePirOccupiedToUnoccupiedDelayWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributePIRUnoccupiedToOccupiedDelayWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirUnoccupiedToOccupiedDelayWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePirUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePirUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePirUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePirUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePirUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIRUnoccupiedToOccupiedDelayWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirUnoccupiedToOccupiedDelayWithCompletionHandler:")
    public native void readAttributePirUnoccupiedToOccupiedDelayWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePirUnoccupiedToOccupiedDelayWithCompletionHandler") @NotNull Block_readAttributePirUnoccupiedToOccupiedDelayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePirUnoccupiedToOccupiedDelayWithCompletionHandler {
        @Generated
        void call_readAttributePirUnoccupiedToOccupiedDelayWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributePIRUnoccupiedToOccupiedThresholdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirUnoccupiedToOccupiedThresholdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePirUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePirUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePirUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePirUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePirUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePIRUnoccupiedToOccupiedThresholdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePirUnoccupiedToOccupiedThresholdWithCompletionHandler:")
    public native void readAttributePirUnoccupiedToOccupiedThresholdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePirUnoccupiedToOccupiedThresholdWithCompletionHandler") @NotNull Block_readAttributePirUnoccupiedToOccupiedThresholdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePirUnoccupiedToOccupiedThresholdWithCompletionHandler {
        @Generated
        void call_readAttributePirUnoccupiedToOccupiedThresholdWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeUltrasonicOccupiedToUnoccupiedDelayWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUltrasonicOccupiedToUnoccupiedDelayWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUltrasonicOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUltrasonicOccupiedToUnoccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUltrasonicOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion:")
    public native void readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion(
            @ObjCBlock(name = "call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion") @NotNull Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion {
        @Generated
        void call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletionHandler:")
    public native void readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletionHandler") @NotNull Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletionHandler {
        @Generated
        void call_readAttributeUltrasonicOccupiedToUnoccupiedDelayWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeUltrasonicUnoccupiedToOccupiedDelayWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedDelayWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUltrasonicUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedDelayWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUltrasonicUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion:")
    public native void readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion(
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletionHandler:")
    public native void readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletionHandler") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletionHandler {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedDelayWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion:")
    public native void readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion(
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletionHandler:")
    public native void readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletionHandler") @NotNull Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletionHandler {
        @Generated
        void call_readAttributeUltrasonicUnoccupiedToOccupiedThresholdWithCompletionHandler(@Nullable NSNumber value,
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
     * Deprecated-Message: Please use subscribeAttributeOccupancySensorTypeBitmapWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupancySensorTypeBitmapWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeBitmapWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupancySensorTypeBitmapWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeBitmapWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOccupancySensorTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOccupancySensorTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOccupancySensorTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOccupancySensorTypeWithParamsSubscriptionEstablishedReportHandler_2(
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePIROccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePIROccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePIRUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePIRUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhysicalContactOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePIROccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePirOccupiedToUnoccupiedDelayWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePirOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePIRUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePirUnoccupiedToOccupiedDelayWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePirUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributePIRUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePirUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUltrasonicOccupiedToUnoccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedDelayWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithParamsSubscriptionEstablishedReportHandler_2(
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
    @Selector("writeAttributePIROccupiedToUnoccupiedDelayWithValue:completion:")
    public native void writeAttributePIROccupiedToUnoccupiedDelayWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePIROccupiedToUnoccupiedDelayWithValueCompletion") @NotNull Block_writeAttributePIROccupiedToUnoccupiedDelayWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePIROccupiedToUnoccupiedDelayWithValueCompletion {
        @Generated
        void call_writeAttributePIROccupiedToUnoccupiedDelayWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIROccupiedToUnoccupiedDelayWithValue:params:completion:")
    public native void writeAttributePIROccupiedToUnoccupiedDelayWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePIROccupiedToUnoccupiedDelayWithValueParamsCompletion") @NotNull Block_writeAttributePIROccupiedToUnoccupiedDelayWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePIROccupiedToUnoccupiedDelayWithValueParamsCompletion {
        @Generated
        void call_writeAttributePIROccupiedToUnoccupiedDelayWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedDelayWithValue:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelayWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePIRUnoccupiedToOccupiedDelayWithValueCompletion") @NotNull Block_writeAttributePIRUnoccupiedToOccupiedDelayWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePIRUnoccupiedToOccupiedDelayWithValueCompletion {
        @Generated
        void call_writeAttributePIRUnoccupiedToOccupiedDelayWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedDelayWithValue:params:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedDelayWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePIRUnoccupiedToOccupiedDelayWithValueParamsCompletion") @NotNull Block_writeAttributePIRUnoccupiedToOccupiedDelayWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePIRUnoccupiedToOccupiedDelayWithValueParamsCompletion {
        @Generated
        void call_writeAttributePIRUnoccupiedToOccupiedDelayWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedThresholdWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueCompletion") @NotNull Block_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueCompletion {
        @Generated
        void call_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:params:completion:")
    public native void writeAttributePIRUnoccupiedToOccupiedThresholdWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueParamsCompletion") @NotNull Block_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueParamsCompletion {
        @Generated
        void call_writeAttributePIRUnoccupiedToOccupiedThresholdWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:completion:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletion(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletion") @NotNull Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletion {
        @Generated
        void call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:completionHandler:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletionHandler") @NotNull Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletionHandler {
        @Generated
        void call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:params:completion:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletion") @NotNull Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletion {
        @Generated
        void call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValue:params:completionHandler:")
    public native void writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler") @NotNull Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributePhysicalContactOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletion(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletion") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletion {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:completionHandler:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletionHandler") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletionHandler {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:params:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletion") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletion {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValue:params:completionHandler:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletion(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletion") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletion {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:completionHandler:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletionHandler") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletionHandler {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:params:completion:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletion") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletion {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValue:params:completionHandler:")
    public native void writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler") @NotNull Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributePhysicalContactUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIROccupiedToUnoccupiedDelayWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirOccupiedToUnoccupiedDelayWithValue:completionHandler:")
    public native void writeAttributePirOccupiedToUnoccupiedDelayWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePirOccupiedToUnoccupiedDelayWithValueCompletionHandler") @NotNull Block_writeAttributePirOccupiedToUnoccupiedDelayWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePirOccupiedToUnoccupiedDelayWithValueCompletionHandler {
        @Generated
        void call_writeAttributePirOccupiedToUnoccupiedDelayWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIROccupiedToUnoccupiedDelayWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirOccupiedToUnoccupiedDelayWithValue:params:completionHandler:")
    public native void writeAttributePirOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePirOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler") @NotNull Block_writeAttributePirOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePirOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributePirOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedDelayWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedDelayWithValue:completionHandler:")
    public native void writeAttributePirUnoccupiedToOccupiedDelayWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePirUnoccupiedToOccupiedDelayWithValueCompletionHandler") @NotNull Block_writeAttributePirUnoccupiedToOccupiedDelayWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePirUnoccupiedToOccupiedDelayWithValueCompletionHandler {
        @Generated
        void call_writeAttributePirUnoccupiedToOccupiedDelayWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedDelayWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedDelayWithValue:params:completionHandler:")
    public native void writeAttributePirUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePirUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler") @NotNull Block_writeAttributePirUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePirUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributePirUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedThresholdWithValue:completionHandler:")
    public native void writeAttributePirUnoccupiedToOccupiedThresholdWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributePirUnoccupiedToOccupiedThresholdWithValueCompletionHandler") @NotNull Block_writeAttributePirUnoccupiedToOccupiedThresholdWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePirUnoccupiedToOccupiedThresholdWithValueCompletionHandler {
        @Generated
        void call_writeAttributePirUnoccupiedToOccupiedThresholdWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributePIRUnoccupiedToOccupiedThresholdWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributePirUnoccupiedToOccupiedThresholdWithValue:params:completionHandler:")
    public native void writeAttributePirUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributePirUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler") @NotNull Block_writeAttributePirUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributePirUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributePirUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:completion:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletion") @NotNull Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletion {
        @Generated
        void call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:completionHandler:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletionHandler") @NotNull Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:params:completion:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletion") @NotNull Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValue:params:completionHandler:")
    public native void writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUltrasonicOccupiedToUnoccupiedDelayWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletion") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletion {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:completionHandler:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletionHandler") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:params:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletion") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValue:params:completionHandler:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedDelayWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletion") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletion {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:completionHandler:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletionHandler(
            @NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletionHandler") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:params:completion:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletion(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletion") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletion {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletion(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValue:params:completionHandler:")
    public native void writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUltrasonicUnoccupiedToOccupiedThresholdWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }
}