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
 * Cluster Window Covering
 * 
 * Provides an interface for controlling and adjusting automatic window coverings.
 * 
 * API-Since: 16.1
 */
@Generated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterWindowCovering extends MTRCluster {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterWindowCovering(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterWindowCovering alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterWindowCovering allocWithZone(VoidPtr zone);

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
     * API-Since: 16.4
     */
    @Generated
    @Selector("downOrCloseWithCompletion:")
    public native void downOrCloseWithCompletion(
            @ObjCBlock(name = "call_downOrCloseWithCompletion") @NotNull Block_downOrCloseWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithCompletion {
        @Generated
        void call_downOrCloseWithCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use downOrCloseWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("downOrCloseWithCompletionHandler:")
    public native void downOrCloseWithCompletionHandler(
            @ObjCBlock(name = "call_downOrCloseWithCompletionHandler") @NotNull Block_downOrCloseWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithCompletionHandler {
        @Generated
        void call_downOrCloseWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command DownOrClose
     * 
     * Moves window covering to InstalledClosedLimitLift and InstalledCloseLimitTilt
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("downOrCloseWithParams:completion:")
    public native void downOrCloseWithParamsCompletion(@Nullable MTRWindowCoveringClusterDownOrCloseParams params,
            @ObjCBlock(name = "call_downOrCloseWithParamsCompletion") @NotNull Block_downOrCloseWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithParamsCompletion {
        @Generated
        void call_downOrCloseWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use downOrCloseWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("downOrCloseWithParams:completionHandler:")
    public native void downOrCloseWithParamsCompletionHandler(
            @Nullable MTRWindowCoveringClusterDownOrCloseParams params,
            @ObjCBlock(name = "call_downOrCloseWithParamsCompletionHandler") @NotNull Block_downOrCloseWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_downOrCloseWithParamsCompletionHandler {
        @Generated
        void call_downOrCloseWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command GoToLiftPercentage
     * 
     * Go to lift percentage specified
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToLiftPercentageWithParams:completion:")
    public native void goToLiftPercentageWithParamsCompletion(
            @NotNull MTRWindowCoveringClusterGoToLiftPercentageParams params,
            @ObjCBlock(name = "call_goToLiftPercentageWithParamsCompletion") @NotNull Block_goToLiftPercentageWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftPercentageWithParamsCompletion {
        @Generated
        void call_goToLiftPercentageWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToLiftPercentageWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToLiftPercentageWithParams:completionHandler:")
    public native void goToLiftPercentageWithParamsCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToLiftPercentageParams params,
            @ObjCBlock(name = "call_goToLiftPercentageWithParamsCompletionHandler") @NotNull Block_goToLiftPercentageWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftPercentageWithParamsCompletionHandler {
        @Generated
        void call_goToLiftPercentageWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command GoToLiftValue
     * 
     * Go to lift value specified
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToLiftValueWithParams:completion:")
    public native void goToLiftValueWithParamsCompletion(@NotNull MTRWindowCoveringClusterGoToLiftValueParams params,
            @ObjCBlock(name = "call_goToLiftValueWithParamsCompletion") @NotNull Block_goToLiftValueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftValueWithParamsCompletion {
        @Generated
        void call_goToLiftValueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToLiftValueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToLiftValueWithParams:completionHandler:")
    public native void goToLiftValueWithParamsCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToLiftValueParams params,
            @ObjCBlock(name = "call_goToLiftValueWithParamsCompletionHandler") @NotNull Block_goToLiftValueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToLiftValueWithParamsCompletionHandler {
        @Generated
        void call_goToLiftValueWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command GoToTiltPercentage
     * 
     * Go to tilt percentage specified
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToTiltPercentageWithParams:completion:")
    public native void goToTiltPercentageWithParamsCompletion(
            @NotNull MTRWindowCoveringClusterGoToTiltPercentageParams params,
            @ObjCBlock(name = "call_goToTiltPercentageWithParamsCompletion") @NotNull Block_goToTiltPercentageWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltPercentageWithParamsCompletion {
        @Generated
        void call_goToTiltPercentageWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToTiltPercentageWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToTiltPercentageWithParams:completionHandler:")
    public native void goToTiltPercentageWithParamsCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToTiltPercentageParams params,
            @ObjCBlock(name = "call_goToTiltPercentageWithParamsCompletionHandler") @NotNull Block_goToTiltPercentageWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltPercentageWithParamsCompletionHandler {
        @Generated
        void call_goToTiltPercentageWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command GoToTiltValue
     * 
     * Go to tilt value specified
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("goToTiltValueWithParams:completion:")
    public native void goToTiltValueWithParamsCompletion(@NotNull MTRWindowCoveringClusterGoToTiltValueParams params,
            @ObjCBlock(name = "call_goToTiltValueWithParamsCompletion") @NotNull Block_goToTiltValueWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltValueWithParamsCompletion {
        @Generated
        void call_goToTiltValueWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use goToTiltValueWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("goToTiltValueWithParams:completionHandler:")
    public native void goToTiltValueWithParamsCompletionHandler(
            @NotNull MTRWindowCoveringClusterGoToTiltValueParams params,
            @ObjCBlock(name = "call_goToTiltValueWithParamsCompletionHandler") @NotNull Block_goToTiltValueWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_goToTiltValueWithParamsCompletionHandler {
        @Generated
        void call_goToTiltValueWithParamsCompletionHandler(@Nullable NSError error);
    }

    @Generated
    @Selector("hash")
    @NUInt
    public static native long hash_static();

    @Generated
    @Selector("init")
    public native MTRBaseClusterWindowCovering init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterWindowCovering initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    /**
     * For all instance methods (reads, writes, commands) that take a completion,
     * the completion will be called on the provided queue.
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterWindowCovering initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterWindowCovering new_objc();

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
     * Deprecated-Message: Please use readAttributeConfigStatusWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeConfigStatusWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeConfigStatusWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeConfigStatusWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeConfigStatusWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeConfigStatusWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeConfigStatusWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeConfigStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeConfigStatusWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeConfigStatusWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeConfigStatusWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeConfigStatusWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeConfigStatusWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeConfigStatusWithCompletion:")
    public native void readAttributeConfigStatusWithCompletion(
            @ObjCBlock(name = "call_readAttributeConfigStatusWithCompletion") @NotNull Block_readAttributeConfigStatusWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeConfigStatusWithCompletion {
        @Generated
        void call_readAttributeConfigStatusWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeConfigStatusWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeConfigStatusWithCompletionHandler:")
    public native void readAttributeConfigStatusWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeConfigStatusWithCompletionHandler") @NotNull Block_readAttributeConfigStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeConfigStatusWithCompletionHandler {
        @Generated
        void call_readAttributeConfigStatusWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeCurrentPositionLiftPercent100thsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionLiftPercent100thsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftPercent100thsWithCompletion:")
    public native void readAttributeCurrentPositionLiftPercent100thsWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercent100thsWithCompletion") @NotNull Block_readAttributeCurrentPositionLiftPercent100thsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercent100thsWithCompletion {
        @Generated
        void call_readAttributeCurrentPositionLiftPercent100thsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionLiftPercent100thsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionLiftPercent100thsWithCompletionHandler:")
    public native void readAttributeCurrentPositionLiftPercent100thsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercent100thsWithCompletionHandler") @NotNull Block_readAttributeCurrentPositionLiftPercent100thsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercent100thsWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftPercent100thsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeCurrentPositionLiftPercentageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionLiftPercentageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentPositionLiftPercentageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercentageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentPositionLiftPercentageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercentageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftPercentageWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftPercentageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionLiftPercentageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercentageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentPositionLiftPercentageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercentageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentPositionLiftPercentageWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftPercentageWithCompletion:")
    public native void readAttributeCurrentPositionLiftPercentageWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercentageWithCompletion") @NotNull Block_readAttributeCurrentPositionLiftPercentageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercentageWithCompletion {
        @Generated
        void call_readAttributeCurrentPositionLiftPercentageWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionLiftPercentageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionLiftPercentageWithCompletionHandler:")
    public native void readAttributeCurrentPositionLiftPercentageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftPercentageWithCompletionHandler") @NotNull Block_readAttributeCurrentPositionLiftPercentageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftPercentageWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftPercentageWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionLiftWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionLiftWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentPositionLiftWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentPositionLiftWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionLiftWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentPositionLiftWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentPositionLiftWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionLiftWithCompletion:")
    public native void readAttributeCurrentPositionLiftWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftWithCompletion") @NotNull Block_readAttributeCurrentPositionLiftWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftWithCompletion {
        @Generated
        void call_readAttributeCurrentPositionLiftWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionLiftWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionLiftWithCompletionHandler:")
    public native void readAttributeCurrentPositionLiftWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionLiftWithCompletionHandler") @NotNull Block_readAttributeCurrentPositionLiftWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionLiftWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionLiftWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeCurrentPositionTiltPercent100thsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionTiltPercent100thsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltPercent100thsWithCompletion:")
    public native void readAttributeCurrentPositionTiltPercent100thsWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercent100thsWithCompletion") @NotNull Block_readAttributeCurrentPositionTiltPercent100thsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercent100thsWithCompletion {
        @Generated
        void call_readAttributeCurrentPositionTiltPercent100thsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionTiltPercent100thsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionTiltPercent100thsWithCompletionHandler:")
    public native void readAttributeCurrentPositionTiltPercent100thsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercent100thsWithCompletionHandler") @NotNull Block_readAttributeCurrentPositionTiltPercent100thsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercent100thsWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltPercent100thsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeCurrentPositionTiltPercentageWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionTiltPercentageWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentPositionTiltPercentageWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercentageWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentPositionTiltPercentageWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercentageWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltPercentageWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltPercentageWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionTiltPercentageWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercentageWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentPositionTiltPercentageWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercentageWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentPositionTiltPercentageWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltPercentageWithCompletion:")
    public native void readAttributeCurrentPositionTiltPercentageWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercentageWithCompletion") @NotNull Block_readAttributeCurrentPositionTiltPercentageWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercentageWithCompletion {
        @Generated
        void call_readAttributeCurrentPositionTiltPercentageWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionTiltPercentageWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionTiltPercentageWithCompletionHandler:")
    public native void readAttributeCurrentPositionTiltPercentageWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltPercentageWithCompletionHandler") @NotNull Block_readAttributeCurrentPositionTiltPercentageWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltPercentageWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltPercentageWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionTiltWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionTiltWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCurrentPositionTiltWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCurrentPositionTiltWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCurrentPositionTiltWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeCurrentPositionTiltWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeCurrentPositionTiltWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeCurrentPositionTiltWithCompletion:")
    public native void readAttributeCurrentPositionTiltWithCompletion(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltWithCompletion") @NotNull Block_readAttributeCurrentPositionTiltWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltWithCompletion {
        @Generated
        void call_readAttributeCurrentPositionTiltWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCurrentPositionTiltWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCurrentPositionTiltWithCompletionHandler:")
    public native void readAttributeCurrentPositionTiltWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCurrentPositionTiltWithCompletionHandler") @NotNull Block_readAttributeCurrentPositionTiltWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCurrentPositionTiltWithCompletionHandler {
        @Generated
        void call_readAttributeCurrentPositionTiltWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEndProductTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEndProductTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEndProductTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEndProductTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEndProductTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEndProductTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEndProductTypeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEndProductTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEndProductTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEndProductTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeEndProductTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEndProductTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeEndProductTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeEndProductTypeWithCompletion:")
    public native void readAttributeEndProductTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeEndProductTypeWithCompletion") @NotNull Block_readAttributeEndProductTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEndProductTypeWithCompletion {
        @Generated
        void call_readAttributeEndProductTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEndProductTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEndProductTypeWithCompletionHandler:")
    public native void readAttributeEndProductTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEndProductTypeWithCompletionHandler") @NotNull Block_readAttributeEndProductTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEndProductTypeWithCompletionHandler {
        @Generated
        void call_readAttributeEndProductTypeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use readAttributeInstalledClosedLimitLiftWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledClosedLimitLiftWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstalledClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstalledClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledClosedLimitLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstalledClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstalledClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledClosedLimitLiftWithCompletion:")
    public native void readAttributeInstalledClosedLimitLiftWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitLiftWithCompletion") @NotNull Block_readAttributeInstalledClosedLimitLiftWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitLiftWithCompletion {
        @Generated
        void call_readAttributeInstalledClosedLimitLiftWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstalledClosedLimitLiftWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledClosedLimitLiftWithCompletionHandler:")
    public native void readAttributeInstalledClosedLimitLiftWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitLiftWithCompletionHandler") @NotNull Block_readAttributeInstalledClosedLimitLiftWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitLiftWithCompletionHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitLiftWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstalledClosedLimitTiltWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledClosedLimitTiltWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstalledClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstalledClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledClosedLimitTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstalledClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstalledClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledClosedLimitTiltWithCompletion:")
    public native void readAttributeInstalledClosedLimitTiltWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitTiltWithCompletion") @NotNull Block_readAttributeInstalledClosedLimitTiltWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitTiltWithCompletion {
        @Generated
        void call_readAttributeInstalledClosedLimitTiltWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstalledClosedLimitTiltWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledClosedLimitTiltWithCompletionHandler:")
    public native void readAttributeInstalledClosedLimitTiltWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstalledClosedLimitTiltWithCompletionHandler") @NotNull Block_readAttributeInstalledClosedLimitTiltWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledClosedLimitTiltWithCompletionHandler {
        @Generated
        void call_readAttributeInstalledClosedLimitTiltWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstalledOpenLimitLiftWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledOpenLimitLiftWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstalledOpenLimitLiftWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitLiftWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstalledOpenLimitLiftWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitLiftWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitLiftWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledOpenLimitLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledOpenLimitLiftWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitLiftWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstalledOpenLimitLiftWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitLiftWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstalledOpenLimitLiftWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledOpenLimitLiftWithCompletion:")
    public native void readAttributeInstalledOpenLimitLiftWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitLiftWithCompletion") @NotNull Block_readAttributeInstalledOpenLimitLiftWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitLiftWithCompletion {
        @Generated
        void call_readAttributeInstalledOpenLimitLiftWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstalledOpenLimitLiftWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledOpenLimitLiftWithCompletionHandler:")
    public native void readAttributeInstalledOpenLimitLiftWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitLiftWithCompletionHandler") @NotNull Block_readAttributeInstalledOpenLimitLiftWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitLiftWithCompletionHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitLiftWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstalledOpenLimitTiltWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledOpenLimitTiltWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInstalledOpenLimitTiltWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitTiltWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInstalledOpenLimitTiltWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitTiltWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitTiltWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledOpenLimitTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInstalledOpenLimitTiltWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitTiltWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeInstalledOpenLimitTiltWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitTiltWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeInstalledOpenLimitTiltWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeInstalledOpenLimitTiltWithCompletion:")
    public native void readAttributeInstalledOpenLimitTiltWithCompletion(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitTiltWithCompletion") @NotNull Block_readAttributeInstalledOpenLimitTiltWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitTiltWithCompletion {
        @Generated
        void call_readAttributeInstalledOpenLimitTiltWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInstalledOpenLimitTiltWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInstalledOpenLimitTiltWithCompletionHandler:")
    public native void readAttributeInstalledOpenLimitTiltWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInstalledOpenLimitTiltWithCompletionHandler") @NotNull Block_readAttributeInstalledOpenLimitTiltWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInstalledOpenLimitTiltWithCompletionHandler {
        @Generated
        void call_readAttributeInstalledOpenLimitTiltWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeModeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeModeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeModeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeModeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeModeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeModeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeModeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeModeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeModeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeModeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeModeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeModeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeModeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeModeWithCompletion:")
    public native void readAttributeModeWithCompletion(
            @ObjCBlock(name = "call_readAttributeModeWithCompletion") @NotNull Block_readAttributeModeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeModeWithCompletion {
        @Generated
        void call_readAttributeModeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeModeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeModeWithCompletionHandler:")
    public native void readAttributeModeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeModeWithCompletionHandler") @NotNull Block_readAttributeModeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeModeWithCompletionHandler {
        @Generated
        void call_readAttributeModeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfActuationsLiftWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfActuationsLiftWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfActuationsLiftWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsLiftWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfActuationsLiftWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsLiftWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfActuationsLiftWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfActuationsLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfActuationsLiftWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsLiftWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfActuationsLiftWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsLiftWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfActuationsLiftWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfActuationsLiftWithCompletion:")
    public native void readAttributeNumberOfActuationsLiftWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsLiftWithCompletion") @NotNull Block_readAttributeNumberOfActuationsLiftWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsLiftWithCompletion {
        @Generated
        void call_readAttributeNumberOfActuationsLiftWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfActuationsLiftWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfActuationsLiftWithCompletionHandler:")
    public native void readAttributeNumberOfActuationsLiftWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsLiftWithCompletionHandler") @NotNull Block_readAttributeNumberOfActuationsLiftWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsLiftWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfActuationsLiftWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfActuationsTiltWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfActuationsTiltWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNumberOfActuationsTiltWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsTiltWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNumberOfActuationsTiltWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsTiltWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNumberOfActuationsTiltWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfActuationsTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNumberOfActuationsTiltWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsTiltWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeNumberOfActuationsTiltWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsTiltWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeNumberOfActuationsTiltWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeNumberOfActuationsTiltWithCompletion:")
    public native void readAttributeNumberOfActuationsTiltWithCompletion(
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsTiltWithCompletion") @NotNull Block_readAttributeNumberOfActuationsTiltWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsTiltWithCompletion {
        @Generated
        void call_readAttributeNumberOfActuationsTiltWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNumberOfActuationsTiltWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNumberOfActuationsTiltWithCompletionHandler:")
    public native void readAttributeNumberOfActuationsTiltWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNumberOfActuationsTiltWithCompletionHandler") @NotNull Block_readAttributeNumberOfActuationsTiltWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNumberOfActuationsTiltWithCompletionHandler {
        @Generated
        void call_readAttributeNumberOfActuationsTiltWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOperationalStatusWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOperationalStatusWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOperationalStatusWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOperationalStatusWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOperationalStatusWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalStatusWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOperationalStatusWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOperationalStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOperationalStatusWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOperationalStatusWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeOperationalStatusWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalStatusWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeOperationalStatusWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeOperationalStatusWithCompletion:")
    public native void readAttributeOperationalStatusWithCompletion(
            @ObjCBlock(name = "call_readAttributeOperationalStatusWithCompletion") @NotNull Block_readAttributeOperationalStatusWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalStatusWithCompletion {
        @Generated
        void call_readAttributeOperationalStatusWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOperationalStatusWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOperationalStatusWithCompletionHandler:")
    public native void readAttributeOperationalStatusWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOperationalStatusWithCompletionHandler") @NotNull Block_readAttributeOperationalStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOperationalStatusWithCompletionHandler {
        @Generated
        void call_readAttributeOperationalStatusWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalClosedLimitLiftWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalClosedLimitLiftWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhysicalClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhysicalClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhysicalClosedLimitLiftWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalClosedLimitLiftWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhysicalClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhysicalClosedLimitLiftWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalClosedLimitLiftWithCompletion:")
    public native void readAttributePhysicalClosedLimitLiftWithCompletion(
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitLiftWithCompletion") @NotNull Block_readAttributePhysicalClosedLimitLiftWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitLiftWithCompletion {
        @Generated
        void call_readAttributePhysicalClosedLimitLiftWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalClosedLimitLiftWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalClosedLimitLiftWithCompletionHandler:")
    public native void readAttributePhysicalClosedLimitLiftWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitLiftWithCompletionHandler") @NotNull Block_readAttributePhysicalClosedLimitLiftWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitLiftWithCompletionHandler {
        @Generated
        void call_readAttributePhysicalClosedLimitLiftWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalClosedLimitTiltWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalClosedLimitTiltWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributePhysicalClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributePhysicalClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributePhysicalClosedLimitTiltWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalClosedLimitTiltWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributePhysicalClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributePhysicalClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributePhysicalClosedLimitTiltWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributePhysicalClosedLimitTiltWithCompletion:")
    public native void readAttributePhysicalClosedLimitTiltWithCompletion(
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitTiltWithCompletion") @NotNull Block_readAttributePhysicalClosedLimitTiltWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitTiltWithCompletion {
        @Generated
        void call_readAttributePhysicalClosedLimitTiltWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributePhysicalClosedLimitTiltWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributePhysicalClosedLimitTiltWithCompletionHandler:")
    public native void readAttributePhysicalClosedLimitTiltWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributePhysicalClosedLimitTiltWithCompletionHandler") @NotNull Block_readAttributePhysicalClosedLimitTiltWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributePhysicalClosedLimitTiltWithCompletionHandler {
        @Generated
        void call_readAttributePhysicalClosedLimitTiltWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSafetyStatusWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSafetyStatusWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeSafetyStatusWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSafetyStatusWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeSafetyStatusWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSafetyStatusWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeSafetyStatusWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSafetyStatusWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeSafetyStatusWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeSafetyStatusWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeSafetyStatusWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSafetyStatusWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeSafetyStatusWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeSafetyStatusWithCompletion:")
    public native void readAttributeSafetyStatusWithCompletion(
            @ObjCBlock(name = "call_readAttributeSafetyStatusWithCompletion") @NotNull Block_readAttributeSafetyStatusWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSafetyStatusWithCompletion {
        @Generated
        void call_readAttributeSafetyStatusWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeSafetyStatusWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeSafetyStatusWithCompletionHandler:")
    public native void readAttributeSafetyStatusWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeSafetyStatusWithCompletionHandler") @NotNull Block_readAttributeSafetyStatusWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeSafetyStatusWithCompletionHandler {
        @Generated
        void call_readAttributeSafetyStatusWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeTargetPositionLiftPercent100thsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTargetPositionLiftPercent100thsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTargetPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTargetPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTargetPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTargetPositionLiftPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTargetPositionLiftPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTargetPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTargetPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTargetPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTargetPositionLiftPercent100thsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTargetPositionLiftPercent100thsWithCompletion:")
    public native void readAttributeTargetPositionLiftPercent100thsWithCompletion(
            @ObjCBlock(name = "call_readAttributeTargetPositionLiftPercent100thsWithCompletion") @NotNull Block_readAttributeTargetPositionLiftPercent100thsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionLiftPercent100thsWithCompletion {
        @Generated
        void call_readAttributeTargetPositionLiftPercent100thsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTargetPositionLiftPercent100thsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTargetPositionLiftPercent100thsWithCompletionHandler:")
    public native void readAttributeTargetPositionLiftPercent100thsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTargetPositionLiftPercent100thsWithCompletionHandler") @NotNull Block_readAttributeTargetPositionLiftPercent100thsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionLiftPercent100thsWithCompletionHandler {
        @Generated
        void call_readAttributeTargetPositionLiftPercent100thsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeTargetPositionTiltPercent100thsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTargetPositionTiltPercent100thsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTargetPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTargetPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTargetPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTargetPositionTiltPercent100thsWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTargetPositionTiltPercent100thsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTargetPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTargetPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTargetPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTargetPositionTiltPercent100thsWithClusterStateCacheEndpointQueueCompletion(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTargetPositionTiltPercent100thsWithCompletion:")
    public native void readAttributeTargetPositionTiltPercent100thsWithCompletion(
            @ObjCBlock(name = "call_readAttributeTargetPositionTiltPercent100thsWithCompletion") @NotNull Block_readAttributeTargetPositionTiltPercent100thsWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionTiltPercent100thsWithCompletion {
        @Generated
        void call_readAttributeTargetPositionTiltPercent100thsWithCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTargetPositionTiltPercent100thsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTargetPositionTiltPercent100thsWithCompletionHandler:")
    public native void readAttributeTargetPositionTiltPercent100thsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTargetPositionTiltPercent100thsWithCompletionHandler") @NotNull Block_readAttributeTargetPositionTiltPercent100thsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTargetPositionTiltPercent100thsWithCompletionHandler {
        @Generated
        void call_readAttributeTargetPositionTiltPercent100thsWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTypeWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTypeWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTypeWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTypeWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTypeWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTypeWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTypeWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTypeWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTypeWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTypeWithClusterStateCacheEndpointQueueCompletion") @NotNull Block_readAttributeTypeWithClusterStateCacheEndpointQueueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTypeWithClusterStateCacheEndpointQueueCompletion {
        @Generated
        void call_readAttributeTypeWithClusterStateCacheEndpointQueueCompletion(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("readAttributeTypeWithCompletion:")
    public native void readAttributeTypeWithCompletion(
            @ObjCBlock(name = "call_readAttributeTypeWithCompletion") @NotNull Block_readAttributeTypeWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTypeWithCompletion {
        @Generated
        void call_readAttributeTypeWithCompletion(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTypeWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTypeWithCompletionHandler:")
    public native void readAttributeTypeWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTypeWithCompletionHandler") @NotNull Block_readAttributeTypeWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTypeWithCompletionHandler {
        @Generated
        void call_readAttributeTypeWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopMotionWithCompletion:")
    public native void stopMotionWithCompletion(
            @ObjCBlock(name = "call_stopMotionWithCompletion") @NotNull Block_stopMotionWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithCompletion {
        @Generated
        void call_stopMotionWithCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopMotionWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("stopMotionWithCompletionHandler:")
    public native void stopMotionWithCompletionHandler(
            @ObjCBlock(name = "call_stopMotionWithCompletionHandler") @NotNull Block_stopMotionWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithCompletionHandler {
        @Generated
        void call_stopMotionWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command StopMotion
     * 
     * Stop any adjusting of window covering
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("stopMotionWithParams:completion:")
    public native void stopMotionWithParamsCompletion(@Nullable MTRWindowCoveringClusterStopMotionParams params,
            @ObjCBlock(name = "call_stopMotionWithParamsCompletion") @NotNull Block_stopMotionWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithParamsCompletion {
        @Generated
        void call_stopMotionWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use stopMotionWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("stopMotionWithParams:completionHandler:")
    public native void stopMotionWithParamsCompletionHandler(@Nullable MTRWindowCoveringClusterStopMotionParams params,
            @ObjCBlock(name = "call_stopMotionWithParamsCompletionHandler") @NotNull Block_stopMotionWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_stopMotionWithParamsCompletionHandler {
        @Generated
        void call_stopMotionWithParamsCompletionHandler(@Nullable NSError error);
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
     * Deprecated-Message: Please use subscribeAttributeConfigStatusWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeConfigStatusWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeConfigStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeConfigStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeConfigStatusWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeCurrentPositionLiftPercent100thsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentPositionLiftPercent100thsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentPositionLiftPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentPositionLiftPercentageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentPositionLiftPercentageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentPositionLiftPercentageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftPercentageWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentPositionLiftWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentPositionLiftWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentPositionLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentPositionLiftWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeCurrentPositionTiltPercent100thsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentPositionTiltPercent100thsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentPositionTiltPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentPositionTiltPercentageWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentPositionTiltPercentageWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercentageWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentPositionTiltPercentageWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltPercentageWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCurrentPositionTiltWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCurrentPositionTiltWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeCurrentPositionTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeCurrentPositionTiltWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEndProductTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEndProductTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEndProductTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeEndProductTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeEndProductTypeWithParamsSubscriptionEstablishedReportHandler_2(
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
     * Deprecated-Message: Please use subscribeAttributeInstalledClosedLimitLiftWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstalledClosedLimitLiftWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstalledClosedLimitLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstalledClosedLimitTiltWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstalledClosedLimitTiltWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstalledClosedLimitTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstalledClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstalledOpenLimitLiftWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstalledOpenLimitLiftWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstalledOpenLimitLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitLiftWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInstalledOpenLimitTiltWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInstalledOpenLimitTiltWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeInstalledOpenLimitTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeInstalledOpenLimitTiltWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeModeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeModeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeModeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeModeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeModeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNumberOfActuationsLiftWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfActuationsLiftWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfActuationsLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsLiftWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNumberOfActuationsTiltWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNumberOfActuationsTiltWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeNumberOfActuationsTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeNumberOfActuationsTiltWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOperationalStatusWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOperationalStatusWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOperationalStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeOperationalStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeOperationalStatusWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePhysicalClosedLimitLiftWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhysicalClosedLimitLiftWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitLiftWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhysicalClosedLimitLiftWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitLiftWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributePhysicalClosedLimitTiltWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributePhysicalClosedLimitTiltWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitTiltWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributePhysicalClosedLimitTiltWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributePhysicalClosedLimitTiltWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeSafetyStatusWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeSafetyStatusWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeSafetyStatusWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeSafetyStatusWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeSafetyStatusWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeTargetPositionLiftPercent100thsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTargetPositionLiftPercent100thsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTargetPositionLiftPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTargetPositionLiftPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTargetPositionLiftPercent100thsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeTargetPositionTiltPercent100thsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTargetPositionTiltPercent100thsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTargetPositionTiltPercent100thsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTargetPositionTiltPercent100thsWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTargetPositionTiltPercent100thsWithParamsSubscriptionEstablishedReportHandler_2(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTypeWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTypeWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTypeWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("subscribeAttributeTypeWithParams:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler(
            @NotNull MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_1") @Nullable Block_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_1 subscriptionEstablished,
            @ObjCBlock(name = "call_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_2") @NotNull Block_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_2 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_1 {
        @Generated
        void call_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_1();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_2 {
        @Generated
        void call_subscribeAttributeTypeWithParamsSubscriptionEstablishedReportHandler_2(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("upOrOpenWithCompletion:")
    public native void upOrOpenWithCompletion(
            @ObjCBlock(name = "call_upOrOpenWithCompletion") @NotNull Block_upOrOpenWithCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithCompletion {
        @Generated
        void call_upOrOpenWithCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use upOrOpenWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("upOrOpenWithCompletionHandler:")
    public native void upOrOpenWithCompletionHandler(
            @ObjCBlock(name = "call_upOrOpenWithCompletionHandler") @NotNull Block_upOrOpenWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithCompletionHandler {
        @Generated
        void call_upOrOpenWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * Command UpOrOpen
     * 
     * Moves window covering to InstalledOpenLimitLift and InstalledOpenLimitTilt
     * 
     * API-Since: 16.4
     */
    @Generated
    @Selector("upOrOpenWithParams:completion:")
    public native void upOrOpenWithParamsCompletion(@Nullable MTRWindowCoveringClusterUpOrOpenParams params,
            @ObjCBlock(name = "call_upOrOpenWithParamsCompletion") @NotNull Block_upOrOpenWithParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithParamsCompletion {
        @Generated
        void call_upOrOpenWithParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use upOrOpenWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("upOrOpenWithParams:completionHandler:")
    public native void upOrOpenWithParamsCompletionHandler(@Nullable MTRWindowCoveringClusterUpOrOpenParams params,
            @ObjCBlock(name = "call_upOrOpenWithParamsCompletionHandler") @NotNull Block_upOrOpenWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_upOrOpenWithParamsCompletionHandler {
        @Generated
        void call_upOrOpenWithParamsCompletionHandler(@Nullable NSError error);
    }

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
    @Selector("writeAttributeModeWithValue:completion:")
    public native void writeAttributeModeWithValueCompletion(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeModeWithValueCompletion") @NotNull Block_writeAttributeModeWithValueCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeModeWithValueCompletion {
        @Generated
        void call_writeAttributeModeWithValueCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeModeWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeModeWithValue:completionHandler:")
    public native void writeAttributeModeWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeModeWithValueCompletionHandler") @NotNull Block_writeAttributeModeWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeModeWithValueCompletionHandler {
        @Generated
        void call_writeAttributeModeWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.4
     */
    @Generated
    @Selector("writeAttributeModeWithValue:params:completion:")
    public native void writeAttributeModeWithValueParamsCompletion(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeModeWithValueParamsCompletion") @NotNull Block_writeAttributeModeWithValueParamsCompletion completion);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeModeWithValueParamsCompletion {
        @Generated
        void call_writeAttributeModeWithValueParamsCompletion(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeModeWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeModeWithValue:params:completionHandler:")
    public native void writeAttributeModeWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeModeWithValueParamsCompletionHandler") @NotNull Block_writeAttributeModeWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeModeWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeModeWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}