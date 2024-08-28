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
 * API-Since: 16.1
 * Deprecated-Since: 16.4
 * Deprecated-Message: Please use MTRBaseClusterUnitTesting
 */
@Generated
@Deprecated
@Library("Matter")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MTRBaseClusterTestCluster extends MTRBaseClusterUnitTesting {
    static {
        NatJ.register();
    }

    @Generated
    protected MTRBaseClusterTestCluster(Pointer peer) {
        super(peer);
    }

    @Generated
    @Selector("accessInstanceVariablesDirectly")
    public static native boolean accessInstanceVariablesDirectly();

    @Generated
    @Owned
    @Selector("alloc")
    public static native MTRBaseClusterTestCluster alloc();

    @Generated
    @Owned
    @Selector("allocWithZone:")
    public static native MTRBaseClusterTestCluster allocWithZone(VoidPtr zone);

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
    public native MTRBaseClusterTestCluster init();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use initWithDevice:endpointID:queue:
     */
    @Generated
    @Deprecated
    @Selector("initWithDevice:endpoint:queue:")
    public native MTRBaseClusterTestCluster initWithDeviceEndpointQueue(@NotNull MTRBaseDevice device, char endpoint,
            @NotNull dispatch_queue_t queue);

    @Generated
    @Selector("initWithDevice:endpointID:queue:")
    public native MTRBaseClusterTestCluster initWithDeviceEndpointIDQueue(@NotNull MTRBaseDevice device,
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
    public static native MTRBaseClusterTestCluster new_objc();

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

    @Generated
    @Selector("readAttributeAcceptedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeAcceptedCommandListWithClusterStateCacheEndpointQueueCompletion completion);

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

    @Generated
    @Selector("readAttributeAttributeListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeAttributeListWithClusterStateCacheEndpointQueueCompletion completion);

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
     * Deprecated-Message: Please use readAttributeBitmap16WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap16WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBitmap16WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap16WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBitmap16WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap16WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBitmap16WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeBitmap16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeBitmap16WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBitmap16WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap16WithCompletionHandler:")
    public native void readAttributeBitmap16WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBitmap16WithCompletionHandler") @NotNull Block_readAttributeBitmap16WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap16WithCompletionHandler {
        @Generated
        void call_readAttributeBitmap16WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBitmap32WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap32WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBitmap32WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap32WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBitmap32WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap32WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBitmap32WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeBitmap32WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeBitmap32WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBitmap32WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap32WithCompletionHandler:")
    public native void readAttributeBitmap32WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBitmap32WithCompletionHandler") @NotNull Block_readAttributeBitmap32WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap32WithCompletionHandler {
        @Generated
        void call_readAttributeBitmap32WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBitmap64WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap64WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBitmap64WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap64WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBitmap64WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap64WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBitmap64WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeBitmap64WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeBitmap64WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBitmap64WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap64WithCompletionHandler:")
    public native void readAttributeBitmap64WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBitmap64WithCompletionHandler") @NotNull Block_readAttributeBitmap64WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap64WithCompletionHandler {
        @Generated
        void call_readAttributeBitmap64WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBitmap8WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap8WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBitmap8WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap8WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBitmap8WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap8WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBitmap8WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeBitmap8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeBitmap8WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBitmap8WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBitmap8WithCompletionHandler:")
    public native void readAttributeBitmap8WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBitmap8WithCompletionHandler") @NotNull Block_readAttributeBitmap8WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBitmap8WithCompletionHandler {
        @Generated
        void call_readAttributeBitmap8WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBooleanWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBooleanWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeBooleanWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBooleanWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeBooleanWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBooleanWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeBooleanWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeBooleanWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeBooleanWithCompletionHandler:")
    public native void readAttributeBooleanWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeBooleanWithCompletionHandler") @NotNull Block_readAttributeBooleanWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeBooleanWithCompletionHandler {
        @Generated
        void call_readAttributeBooleanWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCharStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCharStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeCharStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCharStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeCharStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCharStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeCharStringWithAttributeCacheEndpointQueueCompletionHandler(@Nullable String value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeCharStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeCharStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeCharStringWithCompletionHandler:")
    public native void readAttributeCharStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeCharStringWithCompletionHandler") @NotNull Block_readAttributeCharStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeCharStringWithCompletionHandler {
        @Generated
        void call_readAttributeCharStringWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeClusterErrorBooleanWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeClusterErrorBooleanWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeClusterErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeClusterErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeClusterErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeClusterErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeClusterErrorBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeClusterErrorBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeClusterErrorBooleanWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeClusterErrorBooleanWithCompletionHandler:")
    public native void readAttributeClusterErrorBooleanWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeClusterErrorBooleanWithCompletionHandler") @NotNull Block_readAttributeClusterErrorBooleanWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeClusterErrorBooleanWithCompletionHandler {
        @Generated
        void call_readAttributeClusterErrorBooleanWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
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

    @Generated
    @Selector("readAttributeClusterRevisionWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeClusterRevisionWithClusterStateCacheEndpointQueueCompletion completion);

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
     * Deprecated-Message: Please use readAttributeEnum16WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnum16WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnum16WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnum16WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnum16WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum16WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnum16WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeEnum16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeEnum16WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnum16WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnum16WithCompletionHandler:")
    public native void readAttributeEnum16WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnum16WithCompletionHandler") @NotNull Block_readAttributeEnum16WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum16WithCompletionHandler {
        @Generated
        void call_readAttributeEnum16WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnum8WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnum8WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnum8WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnum8WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnum8WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum8WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnum8WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeEnum8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeEnum8WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnum8WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnum8WithCompletionHandler:")
    public native void readAttributeEnum8WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnum8WithCompletionHandler") @NotNull Block_readAttributeEnum8WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnum8WithCompletionHandler {
        @Generated
        void call_readAttributeEnum8WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnumAttrWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnumAttrWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEnumAttrWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnumAttrWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEnumAttrWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnumAttrWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEnumAttrWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeEnumAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeEnumAttrWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEnumAttrWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEnumAttrWithCompletionHandler:")
    public native void readAttributeEnumAttrWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEnumAttrWithCompletionHandler") @NotNull Block_readAttributeEnumAttrWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEnumAttrWithCompletionHandler {
        @Generated
        void call_readAttributeEnumAttrWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEpochSWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEpochSWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEpochSWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEpochSWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEpochSWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochSWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEpochSWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeEpochSWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeEpochSWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEpochSWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEpochSWithCompletionHandler:")
    public native void readAttributeEpochSWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEpochSWithCompletionHandler") @NotNull Block_readAttributeEpochSWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochSWithCompletionHandler {
        @Generated
        void call_readAttributeEpochSWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEpochUsWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEpochUsWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeEpochUsWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEpochUsWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeEpochUsWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochUsWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeEpochUsWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeEpochUsWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeEpochUsWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeEpochUsWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeEpochUsWithCompletionHandler:")
    public native void readAttributeEpochUsWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeEpochUsWithCompletionHandler") @NotNull Block_readAttributeEpochUsWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeEpochUsWithCompletionHandler {
        @Generated
        void call_readAttributeEpochUsWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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

    @Generated
    @Selector("readAttributeFeatureMapWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeFeatureMapWithClusterStateCacheEndpointQueueCompletion completion);

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
     * Deprecated-Message: Please use readAttributeFloatDoubleWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFloatDoubleWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeFloatDoubleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeFloatDoubleWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeFloatDoubleWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFloatDoubleWithCompletionHandler:")
    public native void readAttributeFloatDoubleWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeFloatDoubleWithCompletionHandler") @NotNull Block_readAttributeFloatDoubleWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatDoubleWithCompletionHandler {
        @Generated
        void call_readAttributeFloatDoubleWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeFloatSingleWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFloatSingleWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeFloatSingleWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFloatSingleWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeFloatSingleWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatSingleWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeFloatSingleWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeFloatSingleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeFloatSingleWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeFloatSingleWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeFloatSingleWithCompletionHandler:")
    public native void readAttributeFloatSingleWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeFloatSingleWithCompletionHandler") @NotNull Block_readAttributeFloatSingleWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeFloatSingleWithCompletionHandler {
        @Generated
        void call_readAttributeFloatSingleWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeGeneralErrorBooleanWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeGeneralErrorBooleanWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeGeneralErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeGeneralErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeGeneralErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneralErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeGeneralErrorBooleanWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeGeneralErrorBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeGeneralErrorBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeGeneralErrorBooleanWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeGeneralErrorBooleanWithCompletionHandler:")
    public native void readAttributeGeneralErrorBooleanWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeGeneralErrorBooleanWithCompletionHandler") @NotNull Block_readAttributeGeneralErrorBooleanWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeGeneralErrorBooleanWithCompletionHandler {
        @Generated
        void call_readAttributeGeneralErrorBooleanWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
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

    @Generated
    @Selector("readAttributeGeneratedCommandListWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeGeneratedCommandListWithClusterStateCacheEndpointQueueCompletion completion);

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
     * Deprecated-Message: Please use readAttributeInt16sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt16sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt16sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt16sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt16sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt16sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt16sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt16sWithCompletionHandler:")
    public native void readAttributeInt16sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt16sWithCompletionHandler") @NotNull Block_readAttributeInt16sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16sWithCompletionHandler {
        @Generated
        void call_readAttributeInt16sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt16uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt16uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt16uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt16uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt16uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt16uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt16uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt16uWithCompletionHandler:")
    public native void readAttributeInt16uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt16uWithCompletionHandler") @NotNull Block_readAttributeInt16uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt16uWithCompletionHandler {
        @Generated
        void call_readAttributeInt16uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt24sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt24sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt24sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt24sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt24sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt24sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt24sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt24sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt24sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt24sWithCompletionHandler:")
    public native void readAttributeInt24sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt24sWithCompletionHandler") @NotNull Block_readAttributeInt24sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24sWithCompletionHandler {
        @Generated
        void call_readAttributeInt24sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt24uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt24uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt24uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt24uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt24uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt24uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt24uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt24uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt24uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt24uWithCompletionHandler:")
    public native void readAttributeInt24uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt24uWithCompletionHandler") @NotNull Block_readAttributeInt24uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt24uWithCompletionHandler {
        @Generated
        void call_readAttributeInt24uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt32sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt32sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt32sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt32sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt32sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt32sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt32sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt32sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt32sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt32sWithCompletionHandler:")
    public native void readAttributeInt32sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt32sWithCompletionHandler") @NotNull Block_readAttributeInt32sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32sWithCompletionHandler {
        @Generated
        void call_readAttributeInt32sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt32uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt32uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt32uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt32uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt32uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt32uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt32uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt32uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt32uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt32uWithCompletionHandler:")
    public native void readAttributeInt32uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt32uWithCompletionHandler") @NotNull Block_readAttributeInt32uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt32uWithCompletionHandler {
        @Generated
        void call_readAttributeInt32uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt40sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt40sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt40sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt40sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt40sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt40sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt40sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt40sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt40sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt40sWithCompletionHandler:")
    public native void readAttributeInt40sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt40sWithCompletionHandler") @NotNull Block_readAttributeInt40sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40sWithCompletionHandler {
        @Generated
        void call_readAttributeInt40sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt40uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt40uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt40uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt40uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt40uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt40uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt40uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt40uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt40uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt40uWithCompletionHandler:")
    public native void readAttributeInt40uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt40uWithCompletionHandler") @NotNull Block_readAttributeInt40uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt40uWithCompletionHandler {
        @Generated
        void call_readAttributeInt40uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt48sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt48sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt48sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt48sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt48sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt48sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt48sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt48sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt48sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt48sWithCompletionHandler:")
    public native void readAttributeInt48sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt48sWithCompletionHandler") @NotNull Block_readAttributeInt48sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48sWithCompletionHandler {
        @Generated
        void call_readAttributeInt48sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt48uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt48uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt48uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt48uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt48uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt48uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt48uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt48uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt48uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt48uWithCompletionHandler:")
    public native void readAttributeInt48uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt48uWithCompletionHandler") @NotNull Block_readAttributeInt48uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt48uWithCompletionHandler {
        @Generated
        void call_readAttributeInt48uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt56sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt56sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt56sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt56sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt56sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt56sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt56sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt56sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt56sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt56sWithCompletionHandler:")
    public native void readAttributeInt56sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt56sWithCompletionHandler") @NotNull Block_readAttributeInt56sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56sWithCompletionHandler {
        @Generated
        void call_readAttributeInt56sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt56uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt56uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt56uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt56uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt56uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt56uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt56uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt56uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt56uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt56uWithCompletionHandler:")
    public native void readAttributeInt56uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt56uWithCompletionHandler") @NotNull Block_readAttributeInt56uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt56uWithCompletionHandler {
        @Generated
        void call_readAttributeInt56uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt64sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt64sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt64sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt64sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt64sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt64sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt64sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt64sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt64sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt64sWithCompletionHandler:")
    public native void readAttributeInt64sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt64sWithCompletionHandler") @NotNull Block_readAttributeInt64sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64sWithCompletionHandler {
        @Generated
        void call_readAttributeInt64sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt64uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt64uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt64uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt64uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt64uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt64uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt64uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt64uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt64uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt64uWithCompletionHandler:")
    public native void readAttributeInt64uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt64uWithCompletionHandler") @NotNull Block_readAttributeInt64uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt64uWithCompletionHandler {
        @Generated
        void call_readAttributeInt64uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt8sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt8sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt8sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt8sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt8sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt8sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt8sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt8sWithCompletionHandler:")
    public native void readAttributeInt8sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt8sWithCompletionHandler") @NotNull Block_readAttributeInt8sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8sWithCompletionHandler {
        @Generated
        void call_readAttributeInt8sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt8uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt8uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeInt8uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt8uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeInt8uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeInt8uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeInt8uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeInt8uWithCompletionHandler:")
    public native void readAttributeInt8uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeInt8uWithCompletionHandler") @NotNull Block_readAttributeInt8uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeInt8uWithCompletionHandler {
        @Generated
        void call_readAttributeInt8uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListFabricScopedWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListFabricScopedWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeListFabricScopedWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListFabricScopedWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeListFabricScopedWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListFabricScopedWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeListFabricScopedWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeListFabricScopedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeListFabricScopedWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListFabricScopedWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListFabricScopedWithParams:completionHandler:")
    public native void readAttributeListFabricScopedWithParamsCompletionHandler(@Nullable MTRReadParams params,
            @ObjCBlock(name = "call_readAttributeListFabricScopedWithParamsCompletionHandler") @NotNull Block_readAttributeListFabricScopedWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListFabricScopedWithParamsCompletionHandler {
        @Generated
        void call_readAttributeListFabricScopedWithParamsCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListInt8uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListInt8uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeListInt8uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListInt8uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeListInt8uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListInt8uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeListInt8uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeListInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeListInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListInt8uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListInt8uWithCompletionHandler:")
    public native void readAttributeListInt8uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeListInt8uWithCompletionHandler") @NotNull Block_readAttributeListInt8uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListInt8uWithCompletionHandler {
        @Generated
        void call_readAttributeListInt8uWithCompletionHandler(@Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListLongOctetStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListLongOctetStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeListLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeListLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeListLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeListLongOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeListLongOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListLongOctetStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListLongOctetStringWithCompletionHandler:")
    public native void readAttributeListLongOctetStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeListLongOctetStringWithCompletionHandler") @NotNull Block_readAttributeListLongOctetStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListLongOctetStringWithCompletionHandler {
        @Generated
        void call_readAttributeListLongOctetStringWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeListNullablesAndOptionalsStructWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListNullablesAndOptionalsStructWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeListNullablesAndOptionalsStructWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListNullablesAndOptionalsStructWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeListNullablesAndOptionalsStructWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListNullablesAndOptionalsStructWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeListNullablesAndOptionalsStructWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeListNullablesAndOptionalsStructWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeListNullablesAndOptionalsStructWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListNullablesAndOptionalsStructWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListNullablesAndOptionalsStructWithCompletionHandler:")
    public native void readAttributeListNullablesAndOptionalsStructWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeListNullablesAndOptionalsStructWithCompletionHandler") @NotNull Block_readAttributeListNullablesAndOptionalsStructWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListNullablesAndOptionalsStructWithCompletionHandler {
        @Generated
        void call_readAttributeListNullablesAndOptionalsStructWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListOctetStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListOctetStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeListOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListOctetStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeListOctetStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListOctetStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeListOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeListOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeListOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListOctetStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListOctetStringWithCompletionHandler:")
    public native void readAttributeListOctetStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeListOctetStringWithCompletionHandler") @NotNull Block_readAttributeListOctetStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListOctetStringWithCompletionHandler {
        @Generated
        void call_readAttributeListOctetStringWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListStructOctetStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListStructOctetStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeListStructOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListStructOctetStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeListStructOctetStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListStructOctetStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeListStructOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeListStructOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeListStructOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeListStructOctetStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeListStructOctetStringWithCompletionHandler:")
    public native void readAttributeListStructOctetStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeListStructOctetStringWithCompletionHandler") @NotNull Block_readAttributeListStructOctetStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeListStructOctetStringWithCompletionHandler {
        @Generated
        void call_readAttributeListStructOctetStringWithCompletionHandler(@Nullable NSArray<?> value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLongCharStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLongCharStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLongCharStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLongCharStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLongCharStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongCharStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLongCharStringWithAttributeCacheEndpointQueueCompletionHandler(@Nullable String value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeLongCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeLongCharStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLongCharStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLongCharStringWithCompletionHandler:")
    public native void readAttributeLongCharStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLongCharStringWithCompletionHandler") @NotNull Block_readAttributeLongCharStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongCharStringWithCompletionHandler {
        @Generated
        void call_readAttributeLongCharStringWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLongOctetStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLongOctetStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeLongOctetStringWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSData value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeLongOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeLongOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeLongOctetStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeLongOctetStringWithCompletionHandler:")
    public native void readAttributeLongOctetStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeLongOctetStringWithCompletionHandler") @NotNull Block_readAttributeLongOctetStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeLongOctetStringWithCompletionHandler {
        @Generated
        void call_readAttributeLongOctetStringWithCompletionHandler(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap16WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap16WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableBitmap16WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap16WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableBitmap16WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap16WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap16WithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableBitmap16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableBitmap16WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap16WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap16WithCompletionHandler:")
    public native void readAttributeNullableBitmap16WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableBitmap16WithCompletionHandler") @NotNull Block_readAttributeNullableBitmap16WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap16WithCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap16WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap32WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap32WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableBitmap32WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap32WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableBitmap32WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap32WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap32WithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableBitmap32WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableBitmap32WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap32WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap32WithCompletionHandler:")
    public native void readAttributeNullableBitmap32WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableBitmap32WithCompletionHandler") @NotNull Block_readAttributeNullableBitmap32WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap32WithCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap32WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap64WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap64WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableBitmap64WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap64WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableBitmap64WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap64WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap64WithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableBitmap64WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableBitmap64WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap64WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap64WithCompletionHandler:")
    public native void readAttributeNullableBitmap64WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableBitmap64WithCompletionHandler") @NotNull Block_readAttributeNullableBitmap64WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap64WithCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap64WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap8WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap8WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableBitmap8WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap8WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableBitmap8WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap8WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap8WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableBitmap8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableBitmap8WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBitmap8WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBitmap8WithCompletionHandler:")
    public native void readAttributeNullableBitmap8WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableBitmap8WithCompletionHandler") @NotNull Block_readAttributeNullableBitmap8WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBitmap8WithCompletionHandler {
        @Generated
        void call_readAttributeNullableBitmap8WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBooleanWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBooleanWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableBooleanWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBooleanWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableBooleanWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBooleanWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableBooleanWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableBooleanWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableBooleanWithCompletionHandler:")
    public native void readAttributeNullableBooleanWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableBooleanWithCompletionHandler") @NotNull Block_readAttributeNullableBooleanWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableBooleanWithCompletionHandler {
        @Generated
        void call_readAttributeNullableBooleanWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableCharStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableCharStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableCharStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableCharStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableCharStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableCharStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableCharStringWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable String value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableCharStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableCharStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableCharStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableCharStringWithCompletionHandler:")
    public native void readAttributeNullableCharStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableCharStringWithCompletionHandler") @NotNull Block_readAttributeNullableCharStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableCharStringWithCompletionHandler {
        @Generated
        void call_readAttributeNullableCharStringWithCompletionHandler(@Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableEnum16WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableEnum16WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableEnum16WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnum16WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableEnum16WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum16WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableEnum16WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableEnum16WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableEnum16WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableEnum16WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableEnum16WithCompletionHandler:")
    public native void readAttributeNullableEnum16WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableEnum16WithCompletionHandler") @NotNull Block_readAttributeNullableEnum16WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum16WithCompletionHandler {
        @Generated
        void call_readAttributeNullableEnum16WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableEnum8WithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableEnum8WithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableEnum8WithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnum8WithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableEnum8WithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum8WithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableEnum8WithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableEnum8WithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableEnum8WithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableEnum8WithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableEnum8WithCompletionHandler:")
    public native void readAttributeNullableEnum8WithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableEnum8WithCompletionHandler") @NotNull Block_readAttributeNullableEnum8WithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnum8WithCompletionHandler {
        @Generated
        void call_readAttributeNullableEnum8WithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableEnumAttrWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableEnumAttrWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableEnumAttrWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnumAttrWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableEnumAttrWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnumAttrWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableEnumAttrWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableEnumAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableEnumAttrWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableEnumAttrWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableEnumAttrWithCompletionHandler:")
    public native void readAttributeNullableEnumAttrWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableEnumAttrWithCompletionHandler") @NotNull Block_readAttributeNullableEnumAttrWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableEnumAttrWithCompletionHandler {
        @Generated
        void call_readAttributeNullableEnumAttrWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableFloatDoubleWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableFloatDoubleWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableFloatDoubleWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableFloatDoubleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableFloatDoubleWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableFloatDoubleWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableFloatDoubleWithCompletionHandler:")
    public native void readAttributeNullableFloatDoubleWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableFloatDoubleWithCompletionHandler") @NotNull Block_readAttributeNullableFloatDoubleWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatDoubleWithCompletionHandler {
        @Generated
        void call_readAttributeNullableFloatDoubleWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableFloatSingleWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableFloatSingleWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableFloatSingleWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableFloatSingleWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableFloatSingleWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatSingleWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableFloatSingleWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableFloatSingleWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableFloatSingleWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableFloatSingleWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableFloatSingleWithCompletionHandler:")
    public native void readAttributeNullableFloatSingleWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableFloatSingleWithCompletionHandler") @NotNull Block_readAttributeNullableFloatSingleWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableFloatSingleWithCompletionHandler {
        @Generated
        void call_readAttributeNullableFloatSingleWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt16sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt16sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt16sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt16sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt16sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt16sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt16sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt16sWithCompletionHandler:")
    public native void readAttributeNullableInt16sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt16sWithCompletionHandler") @NotNull Block_readAttributeNullableInt16sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt16sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt16uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt16uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt16uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt16uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt16uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt16uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt16uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt16uWithCompletionHandler:")
    public native void readAttributeNullableInt16uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt16uWithCompletionHandler") @NotNull Block_readAttributeNullableInt16uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt16uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt16uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt24sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt24sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt24sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt24sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt24sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt24sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt24sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt24sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt24sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt24sWithCompletionHandler:")
    public native void readAttributeNullableInt24sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt24sWithCompletionHandler") @NotNull Block_readAttributeNullableInt24sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt24sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt24uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt24uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt24uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt24uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt24uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt24uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt24uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt24uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt24uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt24uWithCompletionHandler:")
    public native void readAttributeNullableInt24uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt24uWithCompletionHandler") @NotNull Block_readAttributeNullableInt24uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt24uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt24uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt32sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt32sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt32sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt32sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt32sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt32sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt32sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt32sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt32sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt32sWithCompletionHandler:")
    public native void readAttributeNullableInt32sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt32sWithCompletionHandler") @NotNull Block_readAttributeNullableInt32sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt32sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt32uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt32uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt32uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt32uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt32uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt32uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt32uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt32uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt32uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt32uWithCompletionHandler:")
    public native void readAttributeNullableInt32uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt32uWithCompletionHandler") @NotNull Block_readAttributeNullableInt32uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt32uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt32uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt40sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt40sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt40sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt40sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt40sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt40sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt40sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt40sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt40sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt40sWithCompletionHandler:")
    public native void readAttributeNullableInt40sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt40sWithCompletionHandler") @NotNull Block_readAttributeNullableInt40sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt40sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt40uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt40uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt40uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt40uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt40uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt40uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt40uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt40uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt40uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt40uWithCompletionHandler:")
    public native void readAttributeNullableInt40uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt40uWithCompletionHandler") @NotNull Block_readAttributeNullableInt40uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt40uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt40uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt48sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt48sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt48sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt48sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt48sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt48sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt48sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt48sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt48sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt48sWithCompletionHandler:")
    public native void readAttributeNullableInt48sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt48sWithCompletionHandler") @NotNull Block_readAttributeNullableInt48sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt48sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt48uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt48uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt48uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt48uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt48uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt48uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt48uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt48uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt48uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt48uWithCompletionHandler:")
    public native void readAttributeNullableInt48uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt48uWithCompletionHandler") @NotNull Block_readAttributeNullableInt48uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt48uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt48uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt56sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt56sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt56sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt56sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt56sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt56sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt56sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt56sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt56sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt56sWithCompletionHandler:")
    public native void readAttributeNullableInt56sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt56sWithCompletionHandler") @NotNull Block_readAttributeNullableInt56sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt56sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt56uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt56uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt56uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt56uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt56uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt56uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt56uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt56uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt56uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt56uWithCompletionHandler:")
    public native void readAttributeNullableInt56uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt56uWithCompletionHandler") @NotNull Block_readAttributeNullableInt56uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt56uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt56uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt64sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt64sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt64sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt64sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt64sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt64sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt64sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt64sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt64sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt64sWithCompletionHandler:")
    public native void readAttributeNullableInt64sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt64sWithCompletionHandler") @NotNull Block_readAttributeNullableInt64sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt64sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt64uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt64uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt64uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt64uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt64uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt64uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt64uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt64uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt64uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt64uWithCompletionHandler:")
    public native void readAttributeNullableInt64uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt64uWithCompletionHandler") @NotNull Block_readAttributeNullableInt64uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt64uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt64uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt8sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt8sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt8sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt8sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt8sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt8sWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt8sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt8sWithCompletionHandler:")
    public native void readAttributeNullableInt8sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt8sWithCompletionHandler") @NotNull Block_readAttributeNullableInt8sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt8sWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt8uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt8uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableInt8uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt8uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableInt8uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableInt8uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableInt8uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableInt8uWithCompletionHandler:")
    public native void readAttributeNullableInt8uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableInt8uWithCompletionHandler") @NotNull Block_readAttributeNullableInt8uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableInt8uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableInt8uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableOctetStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableOctetStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableOctetStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableOctetStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableOctetStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSData value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableOctetStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableOctetStringWithCompletionHandler:")
    public native void readAttributeNullableOctetStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableOctetStringWithCompletionHandler") @NotNull Block_readAttributeNullableOctetStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableOctetStringWithCompletionHandler {
        @Generated
        void call_readAttributeNullableOctetStringWithCompletionHandler(@Nullable NSData value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNullableRangeRestrictedInt16sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt16sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableRangeRestrictedInt16sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt16sWithCompletionHandler:")
    public native void readAttributeNullableRangeRestrictedInt16sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16sWithCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt16sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16sWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNullableRangeRestrictedInt16uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt16uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableRangeRestrictedInt16uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt16uWithCompletionHandler:")
    public native void readAttributeNullableRangeRestrictedInt16uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt16uWithCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt16uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt16uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt16uWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNullableRangeRestrictedInt8sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt8sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableRangeRestrictedInt8sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt8sWithCompletionHandler:")
    public native void readAttributeNullableRangeRestrictedInt8sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8sWithCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt8sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8sWithCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8sWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * readAttributeNullableRangeRestrictedInt8uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt8uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableRangeRestrictedInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableRangeRestrictedInt8uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableRangeRestrictedInt8uWithCompletionHandler:")
    public native void readAttributeNullableRangeRestrictedInt8uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableRangeRestrictedInt8uWithCompletionHandler") @NotNull Block_readAttributeNullableRangeRestrictedInt8uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableRangeRestrictedInt8uWithCompletionHandler {
        @Generated
        void call_readAttributeNullableRangeRestrictedInt8uWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableStructWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableStructWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeNullableStructWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableStructWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeNullableStructWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableStructWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeNullableStructWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable MTRTestClusterClusterSimpleStruct value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeNullableStructWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeNullableStructWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeNullableStructWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeNullableStructWithCompletionHandler:")
    public native void readAttributeNullableStructWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeNullableStructWithCompletionHandler") @NotNull Block_readAttributeNullableStructWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeNullableStructWithCompletionHandler {
        @Generated
        void call_readAttributeNullableStructWithCompletionHandler(@Nullable MTRTestClusterClusterSimpleStruct value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOctetStringWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOctetStringWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeOctetStringWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOctetStringWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeOctetStringWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOctetStringWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeOctetStringWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSData value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeOctetStringWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeOctetStringWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeOctetStringWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeOctetStringWithCompletionHandler:")
    public native void readAttributeOctetStringWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeOctetStringWithCompletionHandler") @NotNull Block_readAttributeOctetStringWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeOctetStringWithCompletionHandler {
        @Generated
        void call_readAttributeOctetStringWithCompletionHandler(@Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt16sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt16sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt16sWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeRangeRestrictedInt16sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeRangeRestrictedInt16sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt16sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt16sWithCompletionHandler:")
    public native void readAttributeRangeRestrictedInt16sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16sWithCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt16sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16sWithCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt16sWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt16uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt16uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt16uWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeRangeRestrictedInt16uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeRangeRestrictedInt16uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt16uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt16uWithCompletionHandler:")
    public native void readAttributeRangeRestrictedInt16uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt16uWithCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt16uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt16uWithCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt16uWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt8sWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt8sWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt8sWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeRangeRestrictedInt8sWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeRangeRestrictedInt8sWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt8sWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt8sWithCompletionHandler:")
    public native void readAttributeRangeRestrictedInt8sWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8sWithCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt8sWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8sWithCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt8sWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt8uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt8uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt8uWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeRangeRestrictedInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeRangeRestrictedInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeRangeRestrictedInt8uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeRangeRestrictedInt8uWithCompletionHandler:")
    public native void readAttributeRangeRestrictedInt8uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeRangeRestrictedInt8uWithCompletionHandler") @NotNull Block_readAttributeRangeRestrictedInt8uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeRangeRestrictedInt8uWithCompletionHandler {
        @Generated
        void call_readAttributeRangeRestrictedInt8uWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeStructAttrWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStructAttrWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeStructAttrWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStructAttrWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeStructAttrWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStructAttrWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeStructAttrWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable MTRTestClusterClusterSimpleStruct value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeStructAttrWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeStructAttrWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeStructAttrWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeStructAttrWithCompletionHandler:")
    public native void readAttributeStructAttrWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeStructAttrWithCompletionHandler") @NotNull Block_readAttributeStructAttrWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeStructAttrWithCompletionHandler {
        @Generated
        void call_readAttributeStructAttrWithCompletionHandler(@Nullable MTRTestClusterClusterSimpleStruct value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTimedWriteBooleanWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTimedWriteBooleanWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeTimedWriteBooleanWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTimedWriteBooleanWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeTimedWriteBooleanWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimedWriteBooleanWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeTimedWriteBooleanWithAttributeCacheEndpointQueueCompletionHandler(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeTimedWriteBooleanWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeTimedWriteBooleanWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeTimedWriteBooleanWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeTimedWriteBooleanWithCompletionHandler:")
    public native void readAttributeTimedWriteBooleanWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeTimedWriteBooleanWithCompletionHandler") @NotNull Block_readAttributeTimedWriteBooleanWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeTimedWriteBooleanWithCompletionHandler {
        @Generated
        void call_readAttributeTimedWriteBooleanWithCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnsupportedWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnsupportedWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeUnsupportedWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnsupportedWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeUnsupportedWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnsupportedWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeUnsupportedWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeUnsupportedWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeUnsupportedWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeUnsupportedWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeUnsupportedWithCompletionHandler:")
    public native void readAttributeUnsupportedWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeUnsupportedWithCompletionHandler") @NotNull Block_readAttributeUnsupportedWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeUnsupportedWithCompletionHandler {
        @Generated
        void call_readAttributeUnsupportedWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeVendorIdWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeVendorIdWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeVendorIdWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeVendorIdWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeVendorIdWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorIdWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeVendorIdWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeVendorIdWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeVendorIdWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeVendorIdWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeVendorIdWithCompletionHandler:")
    public native void readAttributeVendorIdWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeVendorIdWithCompletionHandler") @NotNull Block_readAttributeVendorIdWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeVendorIdWithCompletionHandler {
        @Generated
        void call_readAttributeVendorIdWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.2
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWriteOnlyInt8uWithAttributeCache:endpoint:queue:completion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWriteOnlyInt8uWithAttributeCache:endpoint:queue:completionHandler:")
    public static native void readAttributeWriteOnlyInt8uWithAttributeCacheEndpointQueueCompletionHandler(
            @NotNull MTRAttributeCacheContainer attributeCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWriteOnlyInt8uWithAttributeCacheEndpointQueueCompletionHandler") @NotNull Block_readAttributeWriteOnlyInt8uWithAttributeCacheEndpointQueueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWriteOnlyInt8uWithAttributeCacheEndpointQueueCompletionHandler {
        @Generated
        void call_readAttributeWriteOnlyInt8uWithAttributeCacheEndpointQueueCompletionHandler(@Nullable NSNumber value,
                @Nullable NSError error);
    }

    @Generated
    @Selector("readAttributeWriteOnlyInt8uWithClusterStateCache:endpoint:queue:completion:")
    public static native void readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion(
            @NotNull MTRClusterStateCacheContainer clusterStateCacheContainer, @NotNull NSNumber endpoint,
            @NotNull dispatch_queue_t queue,
            @ObjCBlock(name = "call_readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion") @NotNull MTRBaseClusterUnitTesting.Block_readAttributeWriteOnlyInt8uWithClusterStateCacheEndpointQueueCompletion completion);

    /**
     * API-Since: 16.2
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use readAttributeWriteOnlyInt8uWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("readAttributeWriteOnlyInt8uWithCompletionHandler:")
    public native void readAttributeWriteOnlyInt8uWithCompletionHandler(
            @ObjCBlock(name = "call_readAttributeWriteOnlyInt8uWithCompletionHandler") @NotNull Block_readAttributeWriteOnlyInt8uWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_readAttributeWriteOnlyInt8uWithCompletionHandler {
        @Generated
        void call_readAttributeWriteOnlyInt8uWithCompletionHandler(@Nullable NSNumber value, @Nullable NSError error);
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
     * Deprecated-Message: Please use simpleStructEchoRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("simpleStructEchoRequestWithParams:completionHandler:")
    public native void simpleStructEchoRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterSimpleStructEchoRequestParams params,
            @ObjCBlock(name = "call_simpleStructEchoRequestWithParamsCompletionHandler") @NotNull Block_simpleStructEchoRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_simpleStructEchoRequestWithParamsCompletionHandler {
        @Generated
        void call_simpleStructEchoRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterSimpleStructResponseParams data, @Nullable NSError error);
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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeBitmap16WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBitmap16WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeBitmap32WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBitmap32WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeBitmap64WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBitmap64WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeBitmap8WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBitmap8WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeBooleanWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeBooleanWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeCharStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeCharStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeClusterErrorBooleanWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeClusterErrorBooleanWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeClusterErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnum16WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnum16WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnum8WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnum8WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEnumAttrWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEnumAttrWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEpochSWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEpochSWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEpochSWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeEpochUsWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeEpochUsWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeEpochUsWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeFloatDoubleWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeFloatDoubleWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeFloatSingleWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeFloatSingleWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeGeneralErrorBooleanWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeGeneralErrorBooleanWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeGeneralErrorBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt16sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt16sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt16uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt16uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt24sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt24sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt24uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt24uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt32sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt32sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt32uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt32uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt40sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt40sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt40uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt40uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt48sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt48sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt48uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt48uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt56sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt56sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt56uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt56uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt64sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt64sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt64uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt64uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt8sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt8sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeInt8uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeInt8uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeListFabricScopedWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeListFabricScopedWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeListFabricScopedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeListInt8uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeListInt8uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeListInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeListLongOctetStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeListLongOctetStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeListLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use
     * subscribeAttributeListNullablesAndOptionalsStructWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeListNullablesAndOptionalsStructWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeListNullablesAndOptionalsStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeListOctetStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeListOctetStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeListOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeListStructOctetStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeListStructOctetStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeListStructOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSArray<?> value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLongCharStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLongCharStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLongCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeLongOctetStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeLongOctetStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeLongOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableBitmap16WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableBitmap16WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableBitmap16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableBitmap32WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableBitmap32WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableBitmap32WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableBitmap64WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableBitmap64WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableBitmap64WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableBitmap8WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableBitmap8WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableBitmap8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableBooleanWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableBooleanWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableCharStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableCharStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableCharStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable String value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableEnum16WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableEnum16WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableEnum16WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableEnum8WithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableEnum8WithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableEnum8WithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableEnumAttrWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableEnumAttrWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableEnumAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableFloatDoubleWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableFloatDoubleWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableFloatDoubleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableFloatSingleWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableFloatSingleWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableFloatSingleWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt16sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt16sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt16uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt16uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt24sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt24sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt24sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt24uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt24uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt24uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt32sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt32sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt32sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt32uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt32uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt32uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt40sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt40sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt40sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt40uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt40uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt40uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt48sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt48sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt48sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt48uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt48uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt48uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt56sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt56sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt56sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt56uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt56uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt56uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt64sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt64sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt64sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt64uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt64uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt64uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt8sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt8sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableInt8uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableInt8uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableOctetStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableOctetStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableRangeRestrictedInt16sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableRangeRestrictedInt16sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableRangeRestrictedInt16uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableRangeRestrictedInt16uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableRangeRestrictedInt8sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableRangeRestrictedInt8sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableRangeRestrictedInt8uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableRangeRestrictedInt8uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeNullableStructWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeNullableStructWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeNullableStructWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable MTRTestClusterClusterSimpleStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeOctetStringWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeOctetStringWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeOctetStringWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSData value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRangeRestrictedInt16sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRangeRestrictedInt16sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRangeRestrictedInt16uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRangeRestrictedInt16uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt16uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRangeRestrictedInt8sWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRangeRestrictedInt8sWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8sWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeRangeRestrictedInt8uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeRangeRestrictedInt8uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeRangeRestrictedInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeStructAttrWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeStructAttrWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeStructAttrWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable MTRTestClusterClusterSimpleStruct value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeTimedWriteBooleanWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeTimedWriteBooleanWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeTimedWriteBooleanWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeUnsupportedWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeUnsupportedWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeUnsupportedWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeVendorIdWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeVendorIdWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeVendorIdWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    /**
     * API-Since: 16.2
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use subscribeAttributeWriteOnlyInt8uWithParams:subscriptionEstablished:
     */
    @Generated
    @Deprecated
    @Selector("subscribeAttributeWriteOnlyInt8uWithMinInterval:maxInterval:params:subscriptionEstablished:reportHandler:")
    public native void subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler(
            @NotNull NSNumber minInterval, @NotNull NSNumber maxInterval, @Nullable MTRSubscribeParams params,
            @ObjCBlock(name = "call_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3") @Nullable Block_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 subscriptionEstablishedHandler,
            @ObjCBlock(name = "call_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4") @NotNull Block_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 reportHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3 {
        @Generated
        void call_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_3();
    }

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4 {
        @Generated
        void call_subscribeAttributeWriteOnlyInt8uWithMinIntervalMaxIntervalParamsSubscriptionEstablishedReportHandler_4(
                @Nullable NSNumber value, @Nullable NSError error);
    }

    @Generated
    @Selector("superclass")
    public static native Class superclass_static();

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testAddArgumentsWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testAddArgumentsWithParams:completionHandler:")
    public native void testAddArgumentsWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestAddArgumentsParams params,
            @ObjCBlock(name = "call_testAddArgumentsWithParamsCompletionHandler") @NotNull Block_testAddArgumentsWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testAddArgumentsWithParamsCompletionHandler {
        @Generated
        void call_testAddArgumentsWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestAddArgumentsResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testComplexNullableOptionalRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testComplexNullableOptionalRequestWithParams:completionHandler:")
    public native void testComplexNullableOptionalRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestComplexNullableOptionalRequestParams params,
            @ObjCBlock(name = "call_testComplexNullableOptionalRequestWithParamsCompletionHandler") @NotNull Block_testComplexNullableOptionalRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testComplexNullableOptionalRequestWithParamsCompletionHandler {
        @Generated
        void call_testComplexNullableOptionalRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestComplexNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testEmitTestEventRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testEmitTestEventRequestWithParams:completionHandler:")
    public native void testEmitTestEventRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestEmitTestEventRequestParams params,
            @ObjCBlock(name = "call_testEmitTestEventRequestWithParamsCompletionHandler") @NotNull Block_testEmitTestEventRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestEventRequestWithParamsCompletionHandler {
        @Generated
        void call_testEmitTestEventRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestEmitTestEventResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testEmitTestFabricScopedEventRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testEmitTestFabricScopedEventRequestWithParams:completionHandler:")
    public native void testEmitTestFabricScopedEventRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestEmitTestFabricScopedEventRequestParams params,
            @ObjCBlock(name = "call_testEmitTestFabricScopedEventRequestWithParamsCompletionHandler") @NotNull Block_testEmitTestFabricScopedEventRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEmitTestFabricScopedEventRequestWithParamsCompletionHandler {
        @Generated
        void call_testEmitTestFabricScopedEventRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestEmitTestFabricScopedEventResponseParams data,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testEnumsRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testEnumsRequestWithParams:completionHandler:")
    public native void testEnumsRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestEnumsRequestParams params,
            @ObjCBlock(name = "call_testEnumsRequestWithParamsCompletionHandler") @NotNull Block_testEnumsRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testEnumsRequestWithParamsCompletionHandler {
        @Generated
        void call_testEnumsRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestEnumsResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testListInt8UArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListInt8UArgumentRequestWithParams:completionHandler:")
    public native void testListInt8UArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestListInt8UArgumentRequestParams params,
            @ObjCBlock(name = "call_testListInt8UArgumentRequestWithParamsCompletionHandler") @NotNull Block_testListInt8UArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testListInt8UArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testListInt8UReverseRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListInt8UReverseRequestWithParams:completionHandler:")
    public native void testListInt8UReverseRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestListInt8UReverseRequestParams params,
            @ObjCBlock(name = "call_testListInt8UReverseRequestWithParamsCompletionHandler") @NotNull Block_testListInt8UReverseRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListInt8UReverseRequestWithParamsCompletionHandler {
        @Generated
        void call_testListInt8UReverseRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestListInt8UReverseResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testListNestedStructListArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListNestedStructListArgumentRequestWithParams:completionHandler:")
    public native void testListNestedStructListArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestListNestedStructListArgumentRequestParams params,
            @ObjCBlock(name = "call_testListNestedStructListArgumentRequestWithParamsCompletionHandler") @NotNull Block_testListNestedStructListArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListNestedStructListArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testListNestedStructListArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testListStructArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testListStructArgumentRequestWithParams:completionHandler:")
    public native void testListStructArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestListStructArgumentRequestParams params,
            @ObjCBlock(name = "call_testListStructArgumentRequestWithParamsCompletionHandler") @NotNull Block_testListStructArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testListStructArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testListStructArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testNestedStructArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNestedStructArgumentRequestWithParams:completionHandler:")
    public native void testNestedStructArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestNestedStructArgumentRequestParams params,
            @ObjCBlock(name = "call_testNestedStructArgumentRequestWithParamsCompletionHandler") @NotNull Block_testNestedStructArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testNestedStructArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testNestedStructListArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNestedStructListArgumentRequestWithParams:completionHandler:")
    public native void testNestedStructListArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestNestedStructListArgumentRequestParams params,
            @ObjCBlock(name = "call_testNestedStructListArgumentRequestWithParamsCompletionHandler") @NotNull Block_testNestedStructListArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNestedStructListArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testNestedStructListArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testNotHandledWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("testNotHandledWithCompletionHandler:")
    public native void testNotHandledWithCompletionHandler(
            @ObjCBlock(name = "call_testNotHandledWithCompletionHandler") @NotNull Block_testNotHandledWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithCompletionHandler {
        @Generated
        void call_testNotHandledWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testNotHandledWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNotHandledWithParams:completionHandler:")
    public native void testNotHandledWithParamsCompletionHandler(
            @Nullable MTRTestClusterClusterTestNotHandledParams params,
            @ObjCBlock(name = "call_testNotHandledWithParamsCompletionHandler") @NotNull Block_testNotHandledWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNotHandledWithParamsCompletionHandler {
        @Generated
        void call_testNotHandledWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testNullableOptionalRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testNullableOptionalRequestWithParams:completionHandler:")
    public native void testNullableOptionalRequestWithParamsCompletionHandler(
            @Nullable MTRTestClusterClusterTestNullableOptionalRequestParams params,
            @ObjCBlock(name = "call_testNullableOptionalRequestWithParamsCompletionHandler") @NotNull Block_testNullableOptionalRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testNullableOptionalRequestWithParamsCompletionHandler {
        @Generated
        void call_testNullableOptionalRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestNullableOptionalResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testSimpleArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testSimpleArgumentRequestWithParams:completionHandler:")
    public native void testSimpleArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestSimpleArgumentRequestParams params,
            @ObjCBlock(name = "call_testSimpleArgumentRequestWithParamsCompletionHandler") @NotNull Block_testSimpleArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testSimpleArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestSimpleArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testSimpleOptionalArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testSimpleOptionalArgumentRequestWithParams:completionHandler:")
    public native void testSimpleOptionalArgumentRequestWithParamsCompletionHandler(
            @Nullable MTRTestClusterClusterTestSimpleOptionalArgumentRequestParams params,
            @ObjCBlock(name = "call_testSimpleOptionalArgumentRequestWithParamsCompletionHandler") @NotNull Block_testSimpleOptionalArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSimpleOptionalArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testSimpleOptionalArgumentRequestWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testSpecificWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("testSpecificWithCompletionHandler:")
    public native void testSpecificWithCompletionHandler(
            @ObjCBlock(name = "call_testSpecificWithCompletionHandler") @NotNull Block_testSpecificWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithCompletionHandler {
        @Generated
        void call_testSpecificWithCompletionHandler(@Nullable MTRTestClusterClusterTestSpecificResponseParams data,
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testSpecificWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testSpecificWithParams:completionHandler:")
    public native void testSpecificWithParamsCompletionHandler(@Nullable MTRTestClusterClusterTestSpecificParams params,
            @ObjCBlock(name = "call_testSpecificWithParamsCompletionHandler") @NotNull Block_testSpecificWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testSpecificWithParamsCompletionHandler {
        @Generated
        void call_testSpecificWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestSpecificResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testStructArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testStructArgumentRequestWithParams:completionHandler:")
    public native void testStructArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestStructArgumentRequestParams params,
            @ObjCBlock(name = "call_testStructArgumentRequestWithParamsCompletionHandler") @NotNull Block_testStructArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testStructArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterBooleanResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testStructArrayArgumentRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testStructArrayArgumentRequestWithParams:completionHandler:")
    public native void testStructArrayArgumentRequestWithParamsCompletionHandler(
            @NotNull MTRTestClusterClusterTestStructArrayArgumentRequestParams params,
            @ObjCBlock(name = "call_testStructArrayArgumentRequestWithParamsCompletionHandler") @NotNull Block_testStructArrayArgumentRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testStructArrayArgumentRequestWithParamsCompletionHandler {
        @Generated
        void call_testStructArrayArgumentRequestWithParamsCompletionHandler(
                @Nullable MTRTestClusterClusterTestStructArrayArgumentResponseParams data, @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testUnknownCommandWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("testUnknownCommandWithCompletionHandler:")
    public native void testUnknownCommandWithCompletionHandler(
            @ObjCBlock(name = "call_testUnknownCommandWithCompletionHandler") @NotNull Block_testUnknownCommandWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithCompletionHandler {
        @Generated
        void call_testUnknownCommandWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testUnknownCommandWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testUnknownCommandWithParams:completionHandler:")
    public native void testUnknownCommandWithParamsCompletionHandler(
            @Nullable MTRTestClusterClusterTestUnknownCommandParams params,
            @ObjCBlock(name = "call_testUnknownCommandWithParamsCompletionHandler") @NotNull Block_testUnknownCommandWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testUnknownCommandWithParamsCompletionHandler {
        @Generated
        void call_testUnknownCommandWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("testWithCompletionHandler:")
    public native void testWithCompletionHandler(
            @ObjCBlock(name = "call_testWithCompletionHandler") @NotNull Block_testWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithCompletionHandler {
        @Generated
        void call_testWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use testWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("testWithParams:completionHandler:")
    public native void testWithParamsCompletionHandler(@Nullable MTRTestClusterClusterTestParams params,
            @ObjCBlock(name = "call_testWithParamsCompletionHandler") @NotNull Block_testWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_testWithParamsCompletionHandler {
        @Generated
        void call_testWithParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use timedInvokeRequestWithCompletion:
     */
    @Generated
    @Deprecated
    @Selector("timedInvokeRequestWithCompletionHandler:")
    public native void timedInvokeRequestWithCompletionHandler(
            @ObjCBlock(name = "call_timedInvokeRequestWithCompletionHandler") @NotNull Block_timedInvokeRequestWithCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithCompletionHandler {
        @Generated
        void call_timedInvokeRequestWithCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use timedInvokeRequestWithParams:completion:
     */
    @Generated
    @Deprecated
    @Selector("timedInvokeRequestWithParams:completionHandler:")
    public native void timedInvokeRequestWithParamsCompletionHandler(
            @Nullable MTRTestClusterClusterTimedInvokeRequestParams params,
            @ObjCBlock(name = "call_timedInvokeRequestWithParamsCompletionHandler") @NotNull Block_timedInvokeRequestWithParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_timedInvokeRequestWithParamsCompletionHandler {
        @Generated
        void call_timedInvokeRequestWithParamsCompletionHandler(@Nullable NSError error);
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
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap16WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap16WithValue:completionHandler:")
    public native void writeAttributeBitmap16WithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap16WithValueCompletionHandler") @NotNull Block_writeAttributeBitmap16WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap16WithValueCompletionHandler {
        @Generated
        void call_writeAttributeBitmap16WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap16WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap16WithValue:params:completionHandler:")
    public native void writeAttributeBitmap16WithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap16WithValueParamsCompletionHandler") @NotNull Block_writeAttributeBitmap16WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap16WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeBitmap16WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap32WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap32WithValue:completionHandler:")
    public native void writeAttributeBitmap32WithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap32WithValueCompletionHandler") @NotNull Block_writeAttributeBitmap32WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap32WithValueCompletionHandler {
        @Generated
        void call_writeAttributeBitmap32WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap32WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap32WithValue:params:completionHandler:")
    public native void writeAttributeBitmap32WithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap32WithValueParamsCompletionHandler") @NotNull Block_writeAttributeBitmap32WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap32WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeBitmap32WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap64WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap64WithValue:completionHandler:")
    public native void writeAttributeBitmap64WithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap64WithValueCompletionHandler") @NotNull Block_writeAttributeBitmap64WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap64WithValueCompletionHandler {
        @Generated
        void call_writeAttributeBitmap64WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap64WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap64WithValue:params:completionHandler:")
    public native void writeAttributeBitmap64WithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap64WithValueParamsCompletionHandler") @NotNull Block_writeAttributeBitmap64WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap64WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeBitmap64WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap8WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap8WithValue:completionHandler:")
    public native void writeAttributeBitmap8WithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBitmap8WithValueCompletionHandler") @NotNull Block_writeAttributeBitmap8WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap8WithValueCompletionHandler {
        @Generated
        void call_writeAttributeBitmap8WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBitmap8WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBitmap8WithValue:params:completionHandler:")
    public native void writeAttributeBitmap8WithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBitmap8WithValueParamsCompletionHandler") @NotNull Block_writeAttributeBitmap8WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBitmap8WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeBitmap8WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBooleanWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBooleanWithValue:completionHandler:")
    public native void writeAttributeBooleanWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeBooleanWithValueCompletionHandler") @NotNull Block_writeAttributeBooleanWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBooleanWithValueCompletionHandler {
        @Generated
        void call_writeAttributeBooleanWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeBooleanWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeBooleanWithValue:params:completionHandler:")
    public native void writeAttributeBooleanWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeBooleanWithValueParamsCompletionHandler") @NotNull Block_writeAttributeBooleanWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeBooleanWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeBooleanWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeCharStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeCharStringWithValue:completionHandler:")
    public native void writeAttributeCharStringWithValueCompletionHandler(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeCharStringWithValueCompletionHandler") @NotNull Block_writeAttributeCharStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeCharStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeCharStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeCharStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeCharStringWithValue:params:completionHandler:")
    public native void writeAttributeCharStringWithValueParamsCompletionHandler(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeCharStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeCharStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeCharStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeCharStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeClusterErrorBooleanWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeClusterErrorBooleanWithValue:completionHandler:")
    public native void writeAttributeClusterErrorBooleanWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeClusterErrorBooleanWithValueCompletionHandler") @NotNull Block_writeAttributeClusterErrorBooleanWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeClusterErrorBooleanWithValueCompletionHandler {
        @Generated
        void call_writeAttributeClusterErrorBooleanWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeClusterErrorBooleanWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeClusterErrorBooleanWithValue:params:completionHandler:")
    public native void writeAttributeClusterErrorBooleanWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeClusterErrorBooleanWithValueParamsCompletionHandler") @NotNull Block_writeAttributeClusterErrorBooleanWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeClusterErrorBooleanWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeClusterErrorBooleanWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnum16WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnum16WithValue:completionHandler:")
    public native void writeAttributeEnum16WithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnum16WithValueCompletionHandler") @NotNull Block_writeAttributeEnum16WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum16WithValueCompletionHandler {
        @Generated
        void call_writeAttributeEnum16WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnum16WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnum16WithValue:params:completionHandler:")
    public native void writeAttributeEnum16WithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnum16WithValueParamsCompletionHandler") @NotNull Block_writeAttributeEnum16WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum16WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEnum16WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnum8WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnum8WithValue:completionHandler:")
    public native void writeAttributeEnum8WithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnum8WithValueCompletionHandler") @NotNull Block_writeAttributeEnum8WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum8WithValueCompletionHandler {
        @Generated
        void call_writeAttributeEnum8WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnum8WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnum8WithValue:params:completionHandler:")
    public native void writeAttributeEnum8WithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnum8WithValueParamsCompletionHandler") @NotNull Block_writeAttributeEnum8WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnum8WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEnum8WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnumAttrWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnumAttrWithValue:completionHandler:")
    public native void writeAttributeEnumAttrWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEnumAttrWithValueCompletionHandler") @NotNull Block_writeAttributeEnumAttrWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnumAttrWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEnumAttrWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEnumAttrWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEnumAttrWithValue:params:completionHandler:")
    public native void writeAttributeEnumAttrWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEnumAttrWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEnumAttrWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEnumAttrWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEnumAttrWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEpochSWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEpochSWithValue:completionHandler:")
    public native void writeAttributeEpochSWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEpochSWithValueCompletionHandler") @NotNull Block_writeAttributeEpochSWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochSWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEpochSWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEpochSWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEpochSWithValue:params:completionHandler:")
    public native void writeAttributeEpochSWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEpochSWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEpochSWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochSWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEpochSWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEpochUsWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEpochUsWithValue:completionHandler:")
    public native void writeAttributeEpochUsWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeEpochUsWithValueCompletionHandler") @NotNull Block_writeAttributeEpochUsWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochUsWithValueCompletionHandler {
        @Generated
        void call_writeAttributeEpochUsWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeEpochUsWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeEpochUsWithValue:params:completionHandler:")
    public native void writeAttributeEpochUsWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeEpochUsWithValueParamsCompletionHandler") @NotNull Block_writeAttributeEpochUsWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeEpochUsWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeEpochUsWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeFloatDoubleWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeFloatDoubleWithValue:completionHandler:")
    public native void writeAttributeFloatDoubleWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeFloatDoubleWithValueCompletionHandler") @NotNull Block_writeAttributeFloatDoubleWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatDoubleWithValueCompletionHandler {
        @Generated
        void call_writeAttributeFloatDoubleWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeFloatDoubleWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeFloatDoubleWithValue:params:completionHandler:")
    public native void writeAttributeFloatDoubleWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeFloatDoubleWithValueParamsCompletionHandler") @NotNull Block_writeAttributeFloatDoubleWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatDoubleWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeFloatDoubleWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeFloatSingleWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeFloatSingleWithValue:completionHandler:")
    public native void writeAttributeFloatSingleWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeFloatSingleWithValueCompletionHandler") @NotNull Block_writeAttributeFloatSingleWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatSingleWithValueCompletionHandler {
        @Generated
        void call_writeAttributeFloatSingleWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeFloatSingleWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeFloatSingleWithValue:params:completionHandler:")
    public native void writeAttributeFloatSingleWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeFloatSingleWithValueParamsCompletionHandler") @NotNull Block_writeAttributeFloatSingleWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeFloatSingleWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeFloatSingleWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeGeneralErrorBooleanWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeGeneralErrorBooleanWithValue:completionHandler:")
    public native void writeAttributeGeneralErrorBooleanWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeGeneralErrorBooleanWithValueCompletionHandler") @NotNull Block_writeAttributeGeneralErrorBooleanWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeGeneralErrorBooleanWithValueCompletionHandler {
        @Generated
        void call_writeAttributeGeneralErrorBooleanWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeGeneralErrorBooleanWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeGeneralErrorBooleanWithValue:params:completionHandler:")
    public native void writeAttributeGeneralErrorBooleanWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeGeneralErrorBooleanWithValueParamsCompletionHandler") @NotNull Block_writeAttributeGeneralErrorBooleanWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeGeneralErrorBooleanWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeGeneralErrorBooleanWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt16sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt16sWithValue:completionHandler:")
    public native void writeAttributeInt16sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt16sWithValueCompletionHandler") @NotNull Block_writeAttributeInt16sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt16sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt16sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt16sWithValue:params:completionHandler:")
    public native void writeAttributeInt16sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt16sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt16sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt16sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt16uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt16uWithValue:completionHandler:")
    public native void writeAttributeInt16uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt16uWithValueCompletionHandler") @NotNull Block_writeAttributeInt16uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt16uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt16uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt16uWithValue:params:completionHandler:")
    public native void writeAttributeInt16uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt16uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt16uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt16uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt16uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt24sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt24sWithValue:completionHandler:")
    public native void writeAttributeInt24sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt24sWithValueCompletionHandler") @NotNull Block_writeAttributeInt24sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt24sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt24sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt24sWithValue:params:completionHandler:")
    public native void writeAttributeInt24sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt24sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt24sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt24sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt24uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt24uWithValue:completionHandler:")
    public native void writeAttributeInt24uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt24uWithValueCompletionHandler") @NotNull Block_writeAttributeInt24uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt24uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt24uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt24uWithValue:params:completionHandler:")
    public native void writeAttributeInt24uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt24uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt24uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt24uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt24uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt32sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt32sWithValue:completionHandler:")
    public native void writeAttributeInt32sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt32sWithValueCompletionHandler") @NotNull Block_writeAttributeInt32sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt32sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt32sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt32sWithValue:params:completionHandler:")
    public native void writeAttributeInt32sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt32sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt32sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt32sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt32uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt32uWithValue:completionHandler:")
    public native void writeAttributeInt32uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt32uWithValueCompletionHandler") @NotNull Block_writeAttributeInt32uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt32uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt32uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt32uWithValue:params:completionHandler:")
    public native void writeAttributeInt32uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt32uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt32uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt32uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt32uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt40sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt40sWithValue:completionHandler:")
    public native void writeAttributeInt40sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt40sWithValueCompletionHandler") @NotNull Block_writeAttributeInt40sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt40sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt40sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt40sWithValue:params:completionHandler:")
    public native void writeAttributeInt40sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt40sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt40sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt40sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt40uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt40uWithValue:completionHandler:")
    public native void writeAttributeInt40uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt40uWithValueCompletionHandler") @NotNull Block_writeAttributeInt40uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt40uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt40uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt40uWithValue:params:completionHandler:")
    public native void writeAttributeInt40uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt40uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt40uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt40uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt40uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt48sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt48sWithValue:completionHandler:")
    public native void writeAttributeInt48sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt48sWithValueCompletionHandler") @NotNull Block_writeAttributeInt48sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt48sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt48sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt48sWithValue:params:completionHandler:")
    public native void writeAttributeInt48sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt48sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt48sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt48sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt48uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt48uWithValue:completionHandler:")
    public native void writeAttributeInt48uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt48uWithValueCompletionHandler") @NotNull Block_writeAttributeInt48uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt48uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt48uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt48uWithValue:params:completionHandler:")
    public native void writeAttributeInt48uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt48uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt48uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt48uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt48uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt56sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt56sWithValue:completionHandler:")
    public native void writeAttributeInt56sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt56sWithValueCompletionHandler") @NotNull Block_writeAttributeInt56sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt56sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt56sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt56sWithValue:params:completionHandler:")
    public native void writeAttributeInt56sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt56sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt56sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt56sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt56uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt56uWithValue:completionHandler:")
    public native void writeAttributeInt56uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt56uWithValueCompletionHandler") @NotNull Block_writeAttributeInt56uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt56uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt56uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt56uWithValue:params:completionHandler:")
    public native void writeAttributeInt56uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt56uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt56uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt56uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt56uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt64sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt64sWithValue:completionHandler:")
    public native void writeAttributeInt64sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt64sWithValueCompletionHandler") @NotNull Block_writeAttributeInt64sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt64sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt64sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt64sWithValue:params:completionHandler:")
    public native void writeAttributeInt64sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt64sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt64sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt64sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt64uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt64uWithValue:completionHandler:")
    public native void writeAttributeInt64uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt64uWithValueCompletionHandler") @NotNull Block_writeAttributeInt64uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt64uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt64uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt64uWithValue:params:completionHandler:")
    public native void writeAttributeInt64uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt64uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt64uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt64uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt64uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt8sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt8sWithValue:completionHandler:")
    public native void writeAttributeInt8sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt8sWithValueCompletionHandler") @NotNull Block_writeAttributeInt8sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt8sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt8sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt8sWithValue:params:completionHandler:")
    public native void writeAttributeInt8sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt8sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt8sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt8sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt8uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt8uWithValue:completionHandler:")
    public native void writeAttributeInt8uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeInt8uWithValueCompletionHandler") @NotNull Block_writeAttributeInt8uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeInt8uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeInt8uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeInt8uWithValue:params:completionHandler:")
    public native void writeAttributeInt8uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeInt8uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeInt8uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeInt8uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeInt8uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListFabricScopedWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListFabricScopedWithValue:completionHandler:")
    public native void writeAttributeListFabricScopedWithValueCompletionHandler(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListFabricScopedWithValueCompletionHandler") @NotNull Block_writeAttributeListFabricScopedWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListFabricScopedWithValueCompletionHandler {
        @Generated
        void call_writeAttributeListFabricScopedWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListFabricScopedWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListFabricScopedWithValue:params:completionHandler:")
    public native void writeAttributeListFabricScopedWithValueParamsCompletionHandler(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListFabricScopedWithValueParamsCompletionHandler") @NotNull Block_writeAttributeListFabricScopedWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListFabricScopedWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeListFabricScopedWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListInt8uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListInt8uWithValue:completionHandler:")
    public native void writeAttributeListInt8uWithValueCompletionHandler(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListInt8uWithValueCompletionHandler") @NotNull Block_writeAttributeListInt8uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListInt8uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeListInt8uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListInt8uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListInt8uWithValue:params:completionHandler:")
    public native void writeAttributeListInt8uWithValueParamsCompletionHandler(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListInt8uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeListInt8uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListInt8uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeListInt8uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListLongOctetStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListLongOctetStringWithValue:completionHandler:")
    public native void writeAttributeListLongOctetStringWithValueCompletionHandler(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListLongOctetStringWithValueCompletionHandler") @NotNull Block_writeAttributeListLongOctetStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListLongOctetStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeListLongOctetStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListLongOctetStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListLongOctetStringWithValue:params:completionHandler:")
    public native void writeAttributeListLongOctetStringWithValueParamsCompletionHandler(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListLongOctetStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeListLongOctetStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListLongOctetStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeListLongOctetStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListNullablesAndOptionalsStructWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListNullablesAndOptionalsStructWithValue:completionHandler:")
    public native void writeAttributeListNullablesAndOptionalsStructWithValueCompletionHandler(
            @NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListNullablesAndOptionalsStructWithValueCompletionHandler") @NotNull Block_writeAttributeListNullablesAndOptionalsStructWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListNullablesAndOptionalsStructWithValueCompletionHandler {
        @Generated
        void call_writeAttributeListNullablesAndOptionalsStructWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListNullablesAndOptionalsStructWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListNullablesAndOptionalsStructWithValue:params:completionHandler:")
    public native void writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletionHandler(
            @NotNull NSArray<?> value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletionHandler") @NotNull Block_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeListNullablesAndOptionalsStructWithValueParamsCompletionHandler(
                @Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListOctetStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListOctetStringWithValue:completionHandler:")
    public native void writeAttributeListOctetStringWithValueCompletionHandler(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListOctetStringWithValueCompletionHandler") @NotNull Block_writeAttributeListOctetStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListOctetStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeListOctetStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListOctetStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListOctetStringWithValue:params:completionHandler:")
    public native void writeAttributeListOctetStringWithValueParamsCompletionHandler(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListOctetStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeListOctetStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListOctetStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeListOctetStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListStructOctetStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListStructOctetStringWithValue:completionHandler:")
    public native void writeAttributeListStructOctetStringWithValueCompletionHandler(@NotNull NSArray<?> value,
            @ObjCBlock(name = "call_writeAttributeListStructOctetStringWithValueCompletionHandler") @NotNull Block_writeAttributeListStructOctetStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListStructOctetStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeListStructOctetStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeListStructOctetStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeListStructOctetStringWithValue:params:completionHandler:")
    public native void writeAttributeListStructOctetStringWithValueParamsCompletionHandler(@NotNull NSArray<?> value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeListStructOctetStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeListStructOctetStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeListStructOctetStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeListStructOctetStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLongCharStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLongCharStringWithValue:completionHandler:")
    public native void writeAttributeLongCharStringWithValueCompletionHandler(@NotNull String value,
            @ObjCBlock(name = "call_writeAttributeLongCharStringWithValueCompletionHandler") @NotNull Block_writeAttributeLongCharStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongCharStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLongCharStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLongCharStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLongCharStringWithValue:params:completionHandler:")
    public native void writeAttributeLongCharStringWithValueParamsCompletionHandler(@NotNull String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLongCharStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLongCharStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongCharStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLongCharStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLongOctetStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLongOctetStringWithValue:completionHandler:")
    public native void writeAttributeLongOctetStringWithValueCompletionHandler(@NotNull NSData value,
            @ObjCBlock(name = "call_writeAttributeLongOctetStringWithValueCompletionHandler") @NotNull Block_writeAttributeLongOctetStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongOctetStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeLongOctetStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeLongOctetStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeLongOctetStringWithValue:params:completionHandler:")
    public native void writeAttributeLongOctetStringWithValueParamsCompletionHandler(@NotNull NSData value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeLongOctetStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeLongOctetStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeLongOctetStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeLongOctetStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap16WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap16WithValue:completionHandler:")
    public native void writeAttributeNullableBitmap16WithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap16WithValueCompletionHandler") @NotNull Block_writeAttributeNullableBitmap16WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap16WithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap16WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap16WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap16WithValue:params:completionHandler:")
    public native void writeAttributeNullableBitmap16WithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap16WithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableBitmap16WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap16WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap16WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap32WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap32WithValue:completionHandler:")
    public native void writeAttributeNullableBitmap32WithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap32WithValueCompletionHandler") @NotNull Block_writeAttributeNullableBitmap32WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap32WithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap32WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap32WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap32WithValue:params:completionHandler:")
    public native void writeAttributeNullableBitmap32WithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap32WithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableBitmap32WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap32WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap32WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap64WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap64WithValue:completionHandler:")
    public native void writeAttributeNullableBitmap64WithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap64WithValueCompletionHandler") @NotNull Block_writeAttributeNullableBitmap64WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap64WithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap64WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap64WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap64WithValue:params:completionHandler:")
    public native void writeAttributeNullableBitmap64WithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap64WithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableBitmap64WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap64WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap64WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap8WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap8WithValue:completionHandler:")
    public native void writeAttributeNullableBitmap8WithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap8WithValueCompletionHandler") @NotNull Block_writeAttributeNullableBitmap8WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap8WithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap8WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBitmap8WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBitmap8WithValue:params:completionHandler:")
    public native void writeAttributeNullableBitmap8WithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBitmap8WithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableBitmap8WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBitmap8WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableBitmap8WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBooleanWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBooleanWithValue:completionHandler:")
    public native void writeAttributeNullableBooleanWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableBooleanWithValueCompletionHandler") @NotNull Block_writeAttributeNullableBooleanWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBooleanWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableBooleanWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableBooleanWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableBooleanWithValue:params:completionHandler:")
    public native void writeAttributeNullableBooleanWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableBooleanWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableBooleanWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableBooleanWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableBooleanWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableCharStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableCharStringWithValue:completionHandler:")
    public native void writeAttributeNullableCharStringWithValueCompletionHandler(@Nullable String value,
            @ObjCBlock(name = "call_writeAttributeNullableCharStringWithValueCompletionHandler") @NotNull Block_writeAttributeNullableCharStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableCharStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableCharStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableCharStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableCharStringWithValue:params:completionHandler:")
    public native void writeAttributeNullableCharStringWithValueParamsCompletionHandler(@Nullable String value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableCharStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableCharStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableCharStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableCharStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableEnum16WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableEnum16WithValue:completionHandler:")
    public native void writeAttributeNullableEnum16WithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableEnum16WithValueCompletionHandler") @NotNull Block_writeAttributeNullableEnum16WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum16WithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableEnum16WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableEnum16WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableEnum16WithValue:params:completionHandler:")
    public native void writeAttributeNullableEnum16WithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableEnum16WithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableEnum16WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum16WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableEnum16WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableEnum8WithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableEnum8WithValue:completionHandler:")
    public native void writeAttributeNullableEnum8WithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableEnum8WithValueCompletionHandler") @NotNull Block_writeAttributeNullableEnum8WithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum8WithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableEnum8WithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableEnum8WithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableEnum8WithValue:params:completionHandler:")
    public native void writeAttributeNullableEnum8WithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableEnum8WithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableEnum8WithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnum8WithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableEnum8WithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableEnumAttrWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableEnumAttrWithValue:completionHandler:")
    public native void writeAttributeNullableEnumAttrWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableEnumAttrWithValueCompletionHandler") @NotNull Block_writeAttributeNullableEnumAttrWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnumAttrWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableEnumAttrWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableEnumAttrWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableEnumAttrWithValue:params:completionHandler:")
    public native void writeAttributeNullableEnumAttrWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableEnumAttrWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableEnumAttrWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableEnumAttrWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableEnumAttrWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableFloatDoubleWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableFloatDoubleWithValue:completionHandler:")
    public native void writeAttributeNullableFloatDoubleWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableFloatDoubleWithValueCompletionHandler") @NotNull Block_writeAttributeNullableFloatDoubleWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatDoubleWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableFloatDoubleWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableFloatDoubleWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableFloatDoubleWithValue:params:completionHandler:")
    public native void writeAttributeNullableFloatDoubleWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableFloatDoubleWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableFloatDoubleWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatDoubleWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableFloatDoubleWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableFloatSingleWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableFloatSingleWithValue:completionHandler:")
    public native void writeAttributeNullableFloatSingleWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableFloatSingleWithValueCompletionHandler") @NotNull Block_writeAttributeNullableFloatSingleWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatSingleWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableFloatSingleWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableFloatSingleWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableFloatSingleWithValue:params:completionHandler:")
    public native void writeAttributeNullableFloatSingleWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableFloatSingleWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableFloatSingleWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableFloatSingleWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableFloatSingleWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt16sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt16sWithValue:completionHandler:")
    public native void writeAttributeNullableInt16sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt16sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt16sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt16sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt16sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt16sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt16sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt16sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt16sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt16sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt16uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt16uWithValue:completionHandler:")
    public native void writeAttributeNullableInt16uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt16uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt16uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt16uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt16uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt16uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt16uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt16uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt16uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt16uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt16uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt24sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt24sWithValue:completionHandler:")
    public native void writeAttributeNullableInt24sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt24sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt24sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt24sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt24sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt24sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt24sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt24sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt24sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt24sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt24uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt24uWithValue:completionHandler:")
    public native void writeAttributeNullableInt24uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt24uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt24uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt24uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt24uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt24uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt24uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt24uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt24uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt24uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt24uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt32sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt32sWithValue:completionHandler:")
    public native void writeAttributeNullableInt32sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt32sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt32sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt32sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt32sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt32sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt32sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt32sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt32sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt32sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt32uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt32uWithValue:completionHandler:")
    public native void writeAttributeNullableInt32uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt32uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt32uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt32uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt32uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt32uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt32uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt32uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt32uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt32uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt32uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt40sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt40sWithValue:completionHandler:")
    public native void writeAttributeNullableInt40sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt40sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt40sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt40sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt40sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt40sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt40sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt40sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt40sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt40sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt40uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt40uWithValue:completionHandler:")
    public native void writeAttributeNullableInt40uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt40uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt40uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt40uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt40uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt40uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt40uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt40uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt40uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt40uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt40uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt48sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt48sWithValue:completionHandler:")
    public native void writeAttributeNullableInt48sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt48sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt48sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt48sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt48sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt48sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt48sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt48sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt48sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt48sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt48uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt48uWithValue:completionHandler:")
    public native void writeAttributeNullableInt48uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt48uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt48uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt48uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt48uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt48uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt48uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt48uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt48uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt48uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt48uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt56sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt56sWithValue:completionHandler:")
    public native void writeAttributeNullableInt56sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt56sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt56sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt56sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt56sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt56sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt56sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt56sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt56sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt56sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt56uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt56uWithValue:completionHandler:")
    public native void writeAttributeNullableInt56uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt56uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt56uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt56uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt56uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt56uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt56uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt56uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt56uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt56uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt56uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt64sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt64sWithValue:completionHandler:")
    public native void writeAttributeNullableInt64sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt64sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt64sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt64sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt64sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt64sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt64sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt64sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt64sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt64sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt64uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt64uWithValue:completionHandler:")
    public native void writeAttributeNullableInt64uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt64uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt64uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt64uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt64uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt64uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt64uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt64uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt64uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt64uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt64uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt8sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt8sWithValue:completionHandler:")
    public native void writeAttributeNullableInt8sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt8sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt8sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt8sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt8sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt8sWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt8sWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt8sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt8sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt8sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt8uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt8uWithValue:completionHandler:")
    public native void writeAttributeNullableInt8uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableInt8uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableInt8uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt8uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableInt8uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableInt8uWithValue:params:completionHandler:")
    public native void writeAttributeNullableInt8uWithValueParamsCompletionHandler(@Nullable NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableInt8uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableInt8uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableInt8uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableInt8uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableOctetStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableOctetStringWithValue:completionHandler:")
    public native void writeAttributeNullableOctetStringWithValueCompletionHandler(@Nullable NSData value,
            @ObjCBlock(name = "call_writeAttributeNullableOctetStringWithValueCompletionHandler") @NotNull Block_writeAttributeNullableOctetStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableOctetStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableOctetStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableOctetStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableOctetStringWithValue:params:completionHandler:")
    public native void writeAttributeNullableOctetStringWithValueParamsCompletionHandler(@Nullable NSData value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableOctetStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableOctetStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableOctetStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableOctetStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt16sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt16sWithValue:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt16sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt16sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt16sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt16sWithValue:params:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletionHandler(
            @Nullable NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt16uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt16uWithValue:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt16uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt16uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt16uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt16uWithValue:params:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletionHandler(
            @Nullable NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt16uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt8sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt8sWithValue:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt8sWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8sWithValueCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt8sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt8sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt8sWithValue:params:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletionHandler(
            @Nullable NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt8uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt8uWithValue:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt8uWithValueCompletionHandler(@Nullable NSNumber value,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8uWithValueCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt8uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableRangeRestrictedInt8uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableRangeRestrictedInt8uWithValue:params:completionHandler:")
    public native void writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletionHandler(
            @Nullable NSNumber value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableRangeRestrictedInt8uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableStructWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableStructWithValue:completionHandler:")
    public native void writeAttributeNullableStructWithValueCompletionHandler(
            @Nullable MTRTestClusterClusterSimpleStruct value,
            @ObjCBlock(name = "call_writeAttributeNullableStructWithValueCompletionHandler") @NotNull Block_writeAttributeNullableStructWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableStructWithValueCompletionHandler {
        @Generated
        void call_writeAttributeNullableStructWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeNullableStructWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeNullableStructWithValue:params:completionHandler:")
    public native void writeAttributeNullableStructWithValueParamsCompletionHandler(
            @Nullable MTRTestClusterClusterSimpleStruct value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeNullableStructWithValueParamsCompletionHandler") @NotNull Block_writeAttributeNullableStructWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeNullableStructWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeNullableStructWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOctetStringWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOctetStringWithValue:completionHandler:")
    public native void writeAttributeOctetStringWithValueCompletionHandler(@NotNull NSData value,
            @ObjCBlock(name = "call_writeAttributeOctetStringWithValueCompletionHandler") @NotNull Block_writeAttributeOctetStringWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOctetStringWithValueCompletionHandler {
        @Generated
        void call_writeAttributeOctetStringWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeOctetStringWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeOctetStringWithValue:params:completionHandler:")
    public native void writeAttributeOctetStringWithValueParamsCompletionHandler(@NotNull NSData value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeOctetStringWithValueParamsCompletionHandler") @NotNull Block_writeAttributeOctetStringWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeOctetStringWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeOctetStringWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt16sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt16sWithValue:completionHandler:")
    public native void writeAttributeRangeRestrictedInt16sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16sWithValueCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt16sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt16sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt16sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt16sWithValue:params:completionHandler:")
    public native void writeAttributeRangeRestrictedInt16sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt16sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt16sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt16uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt16uWithValue:completionHandler:")
    public native void writeAttributeRangeRestrictedInt16uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16uWithValueCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt16uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt16uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt16uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt16uWithValue:params:completionHandler:")
    public native void writeAttributeRangeRestrictedInt16uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt16uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt16uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt16uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt16uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt8sWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt8sWithValue:completionHandler:")
    public native void writeAttributeRangeRestrictedInt8sWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8sWithValueCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt8sWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8sWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt8sWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt8sWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt8sWithValue:params:completionHandler:")
    public native void writeAttributeRangeRestrictedInt8sWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8sWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt8sWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8sWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt8sWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt8uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt8uWithValue:completionHandler:")
    public native void writeAttributeRangeRestrictedInt8uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8uWithValueCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt8uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt8uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeRangeRestrictedInt8uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeRangeRestrictedInt8uWithValue:params:completionHandler:")
    public native void writeAttributeRangeRestrictedInt8uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeRangeRestrictedInt8uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeRangeRestrictedInt8uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeRangeRestrictedInt8uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeRangeRestrictedInt8uWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeStructAttrWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeStructAttrWithValue:completionHandler:")
    public native void writeAttributeStructAttrWithValueCompletionHandler(
            @NotNull MTRTestClusterClusterSimpleStruct value,
            @ObjCBlock(name = "call_writeAttributeStructAttrWithValueCompletionHandler") @NotNull Block_writeAttributeStructAttrWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStructAttrWithValueCompletionHandler {
        @Generated
        void call_writeAttributeStructAttrWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeStructAttrWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeStructAttrWithValue:params:completionHandler:")
    public native void writeAttributeStructAttrWithValueParamsCompletionHandler(
            @NotNull MTRTestClusterClusterSimpleStruct value, @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeStructAttrWithValueParamsCompletionHandler") @NotNull Block_writeAttributeStructAttrWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeStructAttrWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeStructAttrWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTimedWriteBooleanWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTimedWriteBooleanWithValue:completionHandler:")
    public native void writeAttributeTimedWriteBooleanWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeTimedWriteBooleanWithValueCompletionHandler") @NotNull Block_writeAttributeTimedWriteBooleanWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTimedWriteBooleanWithValueCompletionHandler {
        @Generated
        void call_writeAttributeTimedWriteBooleanWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeTimedWriteBooleanWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeTimedWriteBooleanWithValue:params:completionHandler:")
    public native void writeAttributeTimedWriteBooleanWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeTimedWriteBooleanWithValueParamsCompletionHandler") @NotNull Block_writeAttributeTimedWriteBooleanWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeTimedWriteBooleanWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeTimedWriteBooleanWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnsupportedWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnsupportedWithValue:completionHandler:")
    public native void writeAttributeUnsupportedWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeUnsupportedWithValueCompletionHandler") @NotNull Block_writeAttributeUnsupportedWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnsupportedWithValueCompletionHandler {
        @Generated
        void call_writeAttributeUnsupportedWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeUnsupportedWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeUnsupportedWithValue:params:completionHandler:")
    public native void writeAttributeUnsupportedWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeUnsupportedWithValueParamsCompletionHandler") @NotNull Block_writeAttributeUnsupportedWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeUnsupportedWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeUnsupportedWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeVendorIdWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeVendorIdWithValue:completionHandler:")
    public native void writeAttributeVendorIdWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeVendorIdWithValueCompletionHandler") @NotNull Block_writeAttributeVendorIdWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeVendorIdWithValueCompletionHandler {
        @Generated
        void call_writeAttributeVendorIdWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.1
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeVendorIdWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeVendorIdWithValue:params:completionHandler:")
    public native void writeAttributeVendorIdWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeVendorIdWithValueParamsCompletionHandler") @NotNull Block_writeAttributeVendorIdWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeVendorIdWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeVendorIdWithValueParamsCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.2
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWriteOnlyInt8uWithValue:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWriteOnlyInt8uWithValue:completionHandler:")
    public native void writeAttributeWriteOnlyInt8uWithValueCompletionHandler(@NotNull NSNumber value,
            @ObjCBlock(name = "call_writeAttributeWriteOnlyInt8uWithValueCompletionHandler") @NotNull Block_writeAttributeWriteOnlyInt8uWithValueCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWriteOnlyInt8uWithValueCompletionHandler {
        @Generated
        void call_writeAttributeWriteOnlyInt8uWithValueCompletionHandler(@Nullable NSError error);
    }

    /**
     * API-Since: 16.2
     * Deprecated-Since: 16.4
     * Deprecated-Message: Please use writeAttributeWriteOnlyInt8uWithValue:params:completion:
     */
    @Generated
    @Deprecated
    @Selector("writeAttributeWriteOnlyInt8uWithValue:params:completionHandler:")
    public native void writeAttributeWriteOnlyInt8uWithValueParamsCompletionHandler(@NotNull NSNumber value,
            @Nullable MTRWriteParams params,
            @ObjCBlock(name = "call_writeAttributeWriteOnlyInt8uWithValueParamsCompletionHandler") @NotNull Block_writeAttributeWriteOnlyInt8uWithValueParamsCompletionHandler completionHandler);

    @Runtime(ObjCRuntime.class)
    @Generated
    public interface Block_writeAttributeWriteOnlyInt8uWithValueParamsCompletionHandler {
        @Generated
        void call_writeAttributeWriteOnlyInt8uWithValueParamsCompletionHandler(@Nullable NSError error);
    }
}