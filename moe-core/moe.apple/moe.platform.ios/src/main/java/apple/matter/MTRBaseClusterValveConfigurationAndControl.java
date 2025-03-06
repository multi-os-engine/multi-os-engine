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
 * Cluster Valve Configuration and Control
 * 
 * This cluster is used to configure a valve.
 * 
 * API-Since: 17.6
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterValveConfigurationAndControl extends MTRGenericBaseCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterValveConfigurationAndControl(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterValveConfigurationAndControl alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterValveConfigurationAndControl allocWithZone(VoidPtr zone);

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
     * API-Since: 17.6
     */
    @Generated
    @Selector("closeWithCompletion:")
    public native void closeWithCompletion(
            @ObjCBlock(name = "call_closeWithCompletion") @NotNull Block_closeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeWithCompletion {
        @Generated
        void call_closeWithCompletion(@Nullable NSError error);
    }

    /**
     * Command Close
     * 
     * This command is used to set the valve to its closed position.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("closeWithParams:completion:")
    public native void closeWithParamsCompletion(@Nullable MTRValveConfigurationAndControlClusterCloseParams params,
            @ObjCBlock(name = "call_closeWithParamsCompletion") @NotNull Block_closeWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_closeWithParamsCompletion {
        @Generated
        void call_closeWithParamsCompletion(@Nullable NSError error);
    }

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
    public native MTRBaseClusterValveConfigurationAndControl init();

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterValveConfigurationAndControl initWithDeviceEndpointIDQueue(
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
    public static native MTRBaseClusterValveConfigurationAndControl new_objc();

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("openWithCompletion:")
    public native void openWithCompletion(
            @ObjCBlock(name = "call_openWithCompletion") @NotNull Block_openWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openWithCompletion {
        @Generated
        void call_openWithCompletion(@Nullable NSError error);
    }

    /**
     * Command Open
     * 
     * This command is used to set the valve to its open position.
     * 
     * API-Since: 17.6
     */
    @Generated
    @Selector("openWithParams:completion:")
    public native void openWithParamsCompletion(@Nullable MTRValveConfigurationAndControlClusterOpenParams params,
            @ObjCBlock(name = "call_openWithParamsCompletion") @NotNull Block_openWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_openWithParamsCompletion {
        @Generated
        void call_openWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAutoCloseTimeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAutoCloseTimeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAutoCloseTimeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeAutoCloseTimeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAutoCloseTimeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeAutoCloseTimeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeAutoCloseTimeWithCompletion:")
    public native void readAttributeAutoCloseTimeWithCompletion(
            @ObjCBlock(name = "call_readAttributeAutoCloseTimeWithCompletion") @NotNull Block_readAttributeAutoCloseTimeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeAutoCloseTimeWithCompletion {
        @Generated
        void call_readAttributeAutoCloseTimeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeCurrentLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentLevelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentLevelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentLevelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentLevelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentLevelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeCurrentLevelWithCompletion:")
    public native void readAttributeCurrentLevelWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentLevelWithCompletion") @NotNull Block_readAttributeCurrentLevelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentLevelWithCompletion {
        @Generated
        void call_readAttributeCurrentLevelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeCurrentStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeCurrentStateWithCompletion:")
    public native void readAttributeCurrentStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentStateWithCompletion") @NotNull Block_readAttributeCurrentStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentStateWithCompletion {
        @Generated
        void call_readAttributeCurrentStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDefaultOpenDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDefaultOpenDurationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDefaultOpenDurationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDefaultOpenDurationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultOpenDurationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDefaultOpenDurationWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDefaultOpenDurationWithCompletion:")
    public native void readAttributeDefaultOpenDurationWithCompletion(
            @ObjCBlock(name = "call_readAttributeDefaultOpenDurationWithCompletion") @NotNull Block_readAttributeDefaultOpenDurationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultOpenDurationWithCompletion {
        @Generated
        void call_readAttributeDefaultOpenDurationWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDefaultOpenLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeDefaultOpenLevelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeDefaultOpenLevelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeDefaultOpenLevelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultOpenLevelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeDefaultOpenLevelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeDefaultOpenLevelWithCompletion:")
    public native void readAttributeDefaultOpenLevelWithCompletion(
            @ObjCBlock(name = "call_readAttributeDefaultOpenLevelWithCompletion") @NotNull Block_readAttributeDefaultOpenLevelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeDefaultOpenLevelWithCompletion {
        @Generated
        void call_readAttributeDefaultOpenLevelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeLevelStepWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLevelStepWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLevelStepWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeLevelStepWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLevelStepWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeLevelStepWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeLevelStepWithCompletion:")
    public native void readAttributeLevelStepWithCompletion(
            @ObjCBlock(name = "call_readAttributeLevelStepWithCompletion") @NotNull Block_readAttributeLevelStepWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLevelStepWithCompletion {
        @Generated
        void call_readAttributeLevelStepWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeOpenDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOpenDurationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOpenDurationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOpenDurationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOpenDurationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOpenDurationWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeOpenDurationWithCompletion:")
    public native void readAttributeOpenDurationWithCompletion(
            @ObjCBlock(name = "call_readAttributeOpenDurationWithCompletion") @NotNull Block_readAttributeOpenDurationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOpenDurationWithCompletion {
        @Generated
        void call_readAttributeOpenDurationWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeRemainingDurationWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRemainingDurationWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRemainingDurationWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeRemainingDurationWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemainingDurationWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeRemainingDurationWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeRemainingDurationWithCompletion:")
    public native void readAttributeRemainingDurationWithCompletion(
            @ObjCBlock(name = "call_readAttributeRemainingDurationWithCompletion") @NotNull Block_readAttributeRemainingDurationWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRemainingDurationWithCompletion {
        @Generated
        void call_readAttributeRemainingDurationWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeTargetLevelWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTargetLevelWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTargetLevelWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTargetLevelWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetLevelWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTargetLevelWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeTargetLevelWithCompletion:")
    public native void readAttributeTargetLevelWithCompletion(
            @ObjCBlock(name = "call_readAttributeTargetLevelWithCompletion") @NotNull Block_readAttributeTargetLevelWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetLevelWithCompletion {
        @Generated
        void call_readAttributeTargetLevelWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeTargetStateWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTargetStateWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTargetStateWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTargetStateWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetStateWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTargetStateWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeTargetStateWithCompletion:")
    public native void readAttributeTargetStateWithCompletion(
            @ObjCBlock(name = "call_readAttributeTargetStateWithCompletion") @NotNull Block_readAttributeTargetStateWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetStateWithCompletion {
        @Generated
        void call_readAttributeTargetStateWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeValveFaultWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeValveFaultWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeValveFaultWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeValveFaultWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeValveFaultWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeValveFaultWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("readAttributeValveFaultWithCompletion:")
    public native void readAttributeValveFaultWithCompletion(
            @ObjCBlock(name = "call_readAttributeValveFaultWithCompletion") @NotNull Block_readAttributeValveFaultWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeValveFaultWithCompletion {
        @Generated
        void call_readAttributeValveFaultWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeAutoCloseTimeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeAutoCloseTimeWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
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
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeCurrentLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentLevelWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeCurrentStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentStateWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeDefaultOpenDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDefaultOpenDurationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeDefaultOpenLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeDefaultOpenLevelWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
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
     * API-Since: 17.6
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
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeLevelStepWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeLevelStepWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeOpenDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOpenDurationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeRemainingDurationWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeRemainingDurationWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeTargetLevelWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTargetLevelWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeTargetStateWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTargetStateWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("subscribeAttributeValveFaultWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeValveFaultWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
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

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenDurationWithValue:completion:")
    public native void writeAttributeDefaultOpenDurationWithValueCompletion(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeDefaultOpenDurationWithValueCompletion") @NotNull Block_writeAttributeDefaultOpenDurationWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDefaultOpenDurationWithValueCompletion {
        @Generated
        void call_writeAttributeDefaultOpenDurationWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenDurationWithValue:params:completion:")
    public native void writeAttributeDefaultOpenDurationWithValueParamsCompletion(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeDefaultOpenDurationWithValueParamsCompletion") @NotNull Block_writeAttributeDefaultOpenDurationWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDefaultOpenDurationWithValueParamsCompletion {
        @Generated
        void call_writeAttributeDefaultOpenDurationWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenLevelWithValue:completion:")
    public native void writeAttributeDefaultOpenLevelWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeDefaultOpenLevelWithValueCompletion") @NotNull Block_writeAttributeDefaultOpenLevelWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDefaultOpenLevelWithValueCompletion {
        @Generated
        void call_writeAttributeDefaultOpenLevelWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 17.6
     */
    @Generated
    @Selector("writeAttributeDefaultOpenLevelWithValue:params:completion:")
    public native void writeAttributeDefaultOpenLevelWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeDefaultOpenLevelWithValueParamsCompletion") @NotNull Block_writeAttributeDefaultOpenLevelWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeDefaultOpenLevelWithValueParamsCompletion {
        @Generated
        void call_writeAttributeDefaultOpenLevelWithValueParamsCompletion(@Nullable NSError error);
    }
}