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
 * Cluster Thermostat User Interface Configuration
 * 
 * An interface for configuring the user interface of a thermostat (which may be remote from the thermostat).
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterThermostatUserInterfaceConfiguration extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterThermostatUserInterfaceConfiguration(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterThermostatUserInterfaceConfiguration alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterThermostatUserInterfaceConfiguration allocWithZone(VoidPtr zone);

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
    public native MTRBaseClusterThermostatUserInterfaceConfiguration init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterThermostatUserInterfaceConfiguration initWithDeviceEndpointQueue(
            @NotNull MTRBaseDevice device, char endpoint, @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterThermostatUserInterfaceConfiguration initWithDeviceEndpointIDQueue(
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
    public static native MTRBaseClusterThermostatUserInterfaceConfiguration new_objc();

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
     * Deprecated-Message: Please use readAttributeKeypadLockoutWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeKeypadLockoutWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeKeypadLockoutWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeKeypadLockoutWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeKeypadLockoutWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeKeypadLockoutWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeKeypadLockoutWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeKeypadLockoutWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeKeypadLockoutWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeKeypadLockoutWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeKeypadLockoutWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeKeypadLockoutWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeKeypadLockoutWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeKeypadLockoutWithCompletion:")
    public native void readAttributeKeypadLockoutWithCompletion(
            @ObjCBlock(name = "call_readAttributeKeypadLockoutWithCompletion") @NotNull Block_readAttributeKeypadLockoutWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeKeypadLockoutWithCompletion {
        @Generated
        void call_readAttributeKeypadLockoutWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeKeypadLockoutWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeKeypadLockoutWithCompletionHandler:")
    public native void readAttributeKeypadLockoutWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeKeypadLockoutWithCompletionHandler") @NotNull Block_readAttributeKeypadLockoutWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeKeypadLockoutWithCompletionHandler {
        @Generated
        void call_readAttributeKeypadLockoutWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeScheduleProgrammingVisibilityWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeScheduleProgrammingVisibilityWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeScheduleProgrammingVisibilityWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeScheduleProgrammingVisibilityWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeScheduleProgrammingVisibilityWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeScheduleProgrammingVisibilityWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeScheduleProgrammingVisibilityWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeScheduleProgrammingVisibilityWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeScheduleProgrammingVisibilityWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeScheduleProgrammingVisibilityWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeScheduleProgrammingVisibilityWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeScheduleProgrammingVisibilityWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeScheduleProgrammingVisibilityWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeScheduleProgrammingVisibilityWithCompletion:")
    public native void readAttributeScheduleProgrammingVisibilityWithCompletion(
            @ObjCBlock(name = "call_readAttributeScheduleProgrammingVisibilityWithCompletion") @NotNull Block_readAttributeScheduleProgrammingVisibilityWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeScheduleProgrammingVisibilityWithCompletion {
        @Generated
        void call_readAttributeScheduleProgrammingVisibilityWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeScheduleProgrammingVisibilityWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeScheduleProgrammingVisibilityWithCompletionHandler:")
    public native void readAttributeScheduleProgrammingVisibilityWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeScheduleProgrammingVisibilityWithCompletionHandler") @NotNull Block_readAttributeScheduleProgrammingVisibilityWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeScheduleProgrammingVisibilityWithCompletionHandler {
        @Generated
        void call_readAttributeScheduleProgrammingVisibilityWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTemperatureDisplayModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTemperatureDisplayModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTemperatureDisplayModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTemperatureDisplayModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTemperatureDisplayModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureDisplayModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTemperatureDisplayModeWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTemperatureDisplayModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTemperatureDisplayModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTemperatureDisplayModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTemperatureDisplayModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureDisplayModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTemperatureDisplayModeWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTemperatureDisplayModeWithCompletion:")
    public native void readAttributeTemperatureDisplayModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeTemperatureDisplayModeWithCompletion") @NotNull Block_readAttributeTemperatureDisplayModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureDisplayModeWithCompletion {
        @Generated
        void call_readAttributeTemperatureDisplayModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTemperatureDisplayModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTemperatureDisplayModeWithCompletionHandler:")
    public native void readAttributeTemperatureDisplayModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTemperatureDisplayModeWithCompletionHandler") @NotNull Block_readAttributeTemperatureDisplayModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTemperatureDisplayModeWithCompletionHandler {
        @Generated
        void call_readAttributeTemperatureDisplayModeWithCompletionHandler(@Nullable NSNumber value,
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
     * Deprecated-Message: Please use subscribeAttributeKeypadLockoutWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeKeypadLockoutWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeKeypadLockoutWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeKeypadLockoutWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeKeypadLockoutWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeScheduleProgrammingVisibilityWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeScheduleProgrammingVisibilityWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeScheduleProgrammingVisibilityWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeScheduleProgrammingVisibilityWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeScheduleProgrammingVisibilityWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTemperatureDisplayModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTemperatureDisplayModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTemperatureDisplayModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTemperatureDisplayModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTemperatureDisplayModeWithParamsSubscriptionEstablishedReportHandler_2(
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
    @Selector("writeAttributeKeypadLockoutWithValue:completion:")
    public native void writeAttributeKeypadLockoutWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeKeypadLockoutWithValueCompletion") @NotNull Block_writeAttributeKeypadLockoutWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeKeypadLockoutWithValueCompletion {
        @Generated
        void call_writeAttributeKeypadLockoutWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeKeypadLockoutWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeKeypadLockoutWithValue:completionHandler:")
    public native void writeAttributeKeypadLockoutWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeKeypadLockoutWithValueCompletionHandler") @NotNull Block_writeAttributeKeypadLockoutWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeKeypadLockoutWithValueCompletionHandler {
        @Generated
        void call_writeAttributeKeypadLockoutWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeKeypadLockoutWithValue:params:completion:")
    public native void writeAttributeKeypadLockoutWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeKeypadLockoutWithValueParamsCompletion") @NotNull Block_writeAttributeKeypadLockoutWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeKeypadLockoutWithValueParamsCompletion {
        @Generated
        void call_writeAttributeKeypadLockoutWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeKeypadLockoutWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeKeypadLockoutWithValue:params:completionHandler:")
    public native void writeAttributeKeypadLockoutWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeKeypadLockoutWithValueParamsCompletionHandler") @NotNull Block_writeAttributeKeypadLockoutWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeKeypadLockoutWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeKeypadLockoutWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeScheduleProgrammingVisibilityWithValue:completion:")
    public native void writeAttributeScheduleProgrammingVisibilityWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeScheduleProgrammingVisibilityWithValueCompletion") @NotNull Block_writeAttributeScheduleProgrammingVisibilityWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeScheduleProgrammingVisibilityWithValueCompletion {
        @Generated
        void call_writeAttributeScheduleProgrammingVisibilityWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeScheduleProgrammingVisibilityWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeScheduleProgrammingVisibilityWithValue:completionHandler:")
    public native void writeAttributeScheduleProgrammingVisibilityWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeScheduleProgrammingVisibilityWithValueCompletionHandler") @NotNull Block_writeAttributeScheduleProgrammingVisibilityWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeScheduleProgrammingVisibilityWithValueCompletionHandler {
        @Generated
        void call_writeAttributeScheduleProgrammingVisibilityWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeScheduleProgrammingVisibilityWithValue:params:completion:")
    public native void writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletion") @NotNull Block_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletion {
        @Generated
        void call_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeScheduleProgrammingVisibilityWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeScheduleProgrammingVisibilityWithValue:params:completionHandler:")
    public native void writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletionHandler(
            @NotNull NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletionHandler") @NotNull Block_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeScheduleProgrammingVisibilityWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTemperatureDisplayModeWithValue:completion:")
    public native void writeAttributeTemperatureDisplayModeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTemperatureDisplayModeWithValueCompletion") @NotNull Block_writeAttributeTemperatureDisplayModeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureDisplayModeWithValueCompletion {
        @Generated
        void call_writeAttributeTemperatureDisplayModeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTemperatureDisplayModeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTemperatureDisplayModeWithValue:completionHandler:")
    public native void writeAttributeTemperatureDisplayModeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTemperatureDisplayModeWithValueCompletionHandler") @NotNull Block_writeAttributeTemperatureDisplayModeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureDisplayModeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeTemperatureDisplayModeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeTemperatureDisplayModeWithValue:params:completion:")
    public native void writeAttributeTemperatureDisplayModeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTemperatureDisplayModeWithValueParamsCompletion") @NotNull Block_writeAttributeTemperatureDisplayModeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureDisplayModeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeTemperatureDisplayModeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTemperatureDisplayModeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTemperatureDisplayModeWithValue:params:completionHandler:")
    public native void writeAttributeTemperatureDisplayModeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTemperatureDisplayModeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeTemperatureDisplayModeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTemperatureDisplayModeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeTemperatureDisplayModeWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}